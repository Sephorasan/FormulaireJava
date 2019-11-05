package View;

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
        Connexion.setLayoutX(350);
        Connexion.setLayoutY(100);

        PseudoLabel = new Label("Identifiant :");
        PseudoField = new TextField();
        PseudoLabel.setLayoutX(120);
        PseudoLabel.setLayoutY(550);
        PseudoField.setLayoutX(200);
        PseudoField.setLayoutY(550);

        MDPLabel = new Label("Mot de passe :");
        MDPField = new PasswordField();
        MDPLabel.setLayoutX(100);
        MDPLabel.setLayoutY(600);
        MDPField.setLayoutX(200);
        MDPField.setLayoutY(600);

        BoutonConnexion = new Button("Connexion");
        BoutonConnexion.setLayoutX(150);
        BoutonConnexion.setLayoutY(650);
        //BoutonConnexion.setOnAction(event -> );
    }

    void setVueConnexion() {
        root.getChildren().clear();
        root.getChildren().add(PseudoLabel);
        root.getChildren().add(PseudoField);
        root.getChildren().add(MDPLabel);
        root.getChildren().add(MDPField);
        root.getChildren().add(BoutonConnexion);
    }
}
