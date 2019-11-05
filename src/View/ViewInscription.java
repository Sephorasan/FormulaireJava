package View;


import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class ViewInscription {
    private Group root;

    ViewInscription(Group root) {
        this.root = root;
        Form();
    }

    private void Form() {

        Label NomLabel = new Label("Nom :");
        TextField NomField = new TextField();

        Label PrenomLabel = new Label("Prénom :");
        TextField PrenomField = new TextField();

        Label AdresseLabel = new Label("Adresse :");
        TextField AdresseField = new TextField();

        Label CPLabel = new Label("Code postal :");
        TextField CPField = new TextField();

        Label EmailLabel = new Label("Adresse e-mail :");
        TextField EmailField = new TextField();

        Label PseudoLabel = new Label("Pseudo :");
        TextField PseudoField = new TextField();

        Label MDPLabel = new Label("Mot de passe :");
        PasswordField MDPField = new PasswordField();

        Button submitButton = new Button("Validé");

    }

    void setVueInscription() {
        root.getChildren().clear();
        root.getChildren().addAll();
    }
}
