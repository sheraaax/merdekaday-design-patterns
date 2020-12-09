package xmastreeswing;

import command.RemoteLoader;
import decorator.AddGift;
import decorator.GiftBox;
import decorator.ItemsInterface;
import decorator.KLTower;
import decorator.Trishaw;
import decorator.Hibiscus;
import decorator.Klcc;
import facade.Fireworks;
import state.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import strategy.LightChristmas;
import template.RedLights;
import template.BlueLights;
import template.LightsTemplate;

public class Controller implements Initializable {

    ItemsInterface box = new GiftBox();
    Street malaysianPeople;

    @FXML
    private Button flag, people, fireworks, lights;

    @FXML
    private ImageView flagGif;
    @FXML
    private ImageView peopleGif;
    @FXML
    private ImageView fireworks1, fireworks2, fireworks3, fireworks4, fireworks5;
    @FXML
    private ImageView lightStar;
    @FXML
    private ImageView klTowerImage, trishawImage, klccImage, hibiscusImage;

    @FXML
    private ImageView redlights, bluelights;

    @FXML
    private RadioButton klTower, beca, klcc, hibiscus;

    @FXML
    private Text price;

    @FXML
    private Button adder;

    @FXML
    private Button clear;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        hideFireworks();
        hidePeople();
        hideLights();
    }

    @FXML
    public void onClick(MouseEvent mouseEvent) {
        Button temp = (Button) mouseEvent.getSource();
        String id = temp.getId();

        switch (id) {
            // Command Pattern
            case "flag":
                RemoteLoader.init(flagGif);
                break;

            // State Pattern
            case "people":
                malaysianPeople.performAction();
                break;

            // Façade Pattern
            case "fireworks":
                Fireworks fireworks = new Fireworks(fireworks1, fireworks2, fireworks3);
                fireworks.setFireworks();
                break;

            // Strategy Pattern
            case "lights":
                LightChristmas.init(lightStar);
                break;

            // Decorator Pattern
            case "gifts":
                AddGift.init(box, klTowerImage, trishawImage, klccImage, hibiscusImage);
                break;

            // Template Method Pattern
            case "newlights":
                LightsTemplate rlights = new RedLights();
                LightsTemplate blights = new BlueLights();
                rlights.prepareLights(redlights);
                blights.prepareLights(bluelights);
                break;
        }
    }

    @FXML
    public void clearItems(ActionEvent e) {
        beca.setSelected(false);
        klcc.setSelected(false);
        klTower.setSelected(false);
        hibiscus.setSelected(false);
        trishawImage.setVisible(false);
        klTowerImage.setVisible(false);
        klccImage.setVisible(false);
        hibiscusImage.setVisible(false);
        trishawImage.yProperty().set(0);
        klTowerImage.yProperty().set(0);
        klTowerImage.xProperty().set(0);
        klccImage.yProperty().set(0);
        hibiscusImage.yProperty().set(0);
        box = null;
        box = new GiftBox();
        System.out.println("Clear Merdeka Decoration Items!");
    }

    @FXML
    public void listItems(ActionEvent e) {
        RadioButton btn = (RadioButton) e.getSource();
        String id = btn.getId();
        if (btn.isSelected() == false) {
            clearItems(e);
            return;
        }
        switch (id) {
            case "klTower":
                box = new KLTower(box);
                box.setImage(klTowerImage);
                System.out.println(box.getDescription());
                break;
            case "beca":
                box = new Trishaw(box);
                box.setImage(trishawImage);
                System.out.println(box.getDescription());
                break;
            case "klcc":
                box = new Klcc(box);
                box.setImage(klccImage);
                System.out.println(box.getDescription());
                break;
            case "hibiscus":
                box = new Hibiscus(box);
                box.setImage(hibiscusImage);
                System.out.println(box.getDescription());
                break;
        }
    }

    private void hideFireworks() {
        fireworks1.setVisible(false);
        fireworks2.setVisible(false);
        fireworks3.setVisible(false);
    }

    private void hidePeople() {
        peopleGif.setVisible(false);
        malaysianPeople = new Street(peopleGif);
    }

    private void hideLights() {
        redlights.setVisible(false);
        bluelights.setVisible(false);
    }

}