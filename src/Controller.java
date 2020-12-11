
import command.RemoteLoader;
import decorator.AddDecoration;
import decorator.Background;
import decorator.DecorationInterface;
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
import template.RedLights;
import template.BlueLights;
import template.LightsTemplate;

public class Controller implements Initializable {

    DecorationInterface background = new Background();
    Street malaysianPeople;

    @FXML
    private Button flag, people, fireworks, lights;

    @FXML
    private ImageView flagGif;
    @FXML
    private ImageView peopleGif;
    @FXML
    private ImageView fireworks1, fireworks2, fireworks3;
    @FXML
    private ImageView lightStar;
    @FXML
    private ImageView klTowerImage, trishawImage, klccImage, hibiscusImage;

    @FXML
    private ImageView redlights, bluelights;

    @FXML
    private RadioButton klTower, beca, klcc, hibiscus;

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

            // Decorator Pattern
            case "decorations":
                AddDecoration.init(background, klTowerImage, trishawImage, klccImage, hibiscusImage);
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
        background = null;
        background = new Background();
        flagGif.setVisible(false);
        peopleGif.setVisible(false);
        fireworks1.setVisible(false);
        fireworks2.setVisible(false);
        fireworks3.setVisible(false);
        redlights.setVisible(false);
        bluelights.setVisible(false);
        System.out.println("Clear Merdeka Decoration Items!");
    }

    @FXML
    public void addAll(ActionEvent e) {
        flagGif.setVisible(true);
        peopleGif.setVisible(true);
        fireworks1.setVisible(true);
        fireworks2.setVisible(true);
        fireworks3.setVisible(true);
        redlights.setVisible(true);
        bluelights.setVisible(true);
        trishawImage.setVisible(true);
        klTowerImage.setVisible(true);
        klccImage.setVisible(true);
        hibiscusImage.setVisible(true);
        System.out.println("Add All Merdeka Decoration!");
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
                background = new KLTower(background);
                background.setImage(klTowerImage);
                System.out.println(background.getDescription());
                break;
            case "beca":
                background = new Trishaw(background);
                background.setImage(trishawImage);
                System.out.println(background.getDescription());
                break;
            case "klcc":
                background = new Klcc(background);
                background.setImage(klccImage);
                System.out.println(background.getDescription());
                break;
            case "hibiscus":
                background = new Hibiscus(background);
                background.setImage(hibiscusImage);
                System.out.println(background.getDescription());
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