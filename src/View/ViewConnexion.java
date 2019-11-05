package View;

import Controller.ControllerConnexion;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class ViewConnexion {
    private Group root;
    private Text Connexion;
    private Label PseudoLabel;
    private TextField PseudoField;
    private Label MDPLabel;
    private PasswordField MDPField;
    private Button BoutonConnexion;

    ViewConnexion(Group root) {
        this.root = root;
        Connexion();
    }
    private void Connexion(){

        Connexion = new Text("Connexion");
        Connexion.setLayoutX(650);
        Connexion.setLayoutY(200);

        PseudoLabel = new Label("Identifiant :");
        PseudoField = new TextField();
        PseudoLabel.setLayoutX(520);
        PseudoLabel.setLayoutY(300);
        PseudoField.setLayoutX(600);
        PseudoField.setLayoutY(300);

        MDPLabel = new Label("Mot de passe :");
        MDPField = new PasswordField();
        MDPLabel.setLayoutX(500);
        MDPLabel.setLayoutY(350);
        MDPField.setLayoutX(600);
        MDPField.setLayoutY(350);

        BoutonConnexion = new Button("Connexion");
        BoutonConnexion.setLayoutX(650);
        BoutonConnexion.setLayoutY(450);
    }

    void setVueConnexion(){
        root.getChildren().clear();
        root.getChildren().add(Connexion);
        root.getChildren().add(PseudoLabel);
        root.getChildren().add(PseudoField);
        root.getChildren().add(MDPLabel);
        root.getChildren().add(MDPField);
        root.getChildren().add(BoutonConnexion);
    }
    void setEvents(ControllerConnexion cc){
        BoutonConnexion.setOnMouseClicked(cc);
    }

    public Button getConnexion() {
        return BoutonConnexion;
    }

}
