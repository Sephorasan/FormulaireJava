package View;


import Controller.ControllerInscription;
import Main.Formulaire;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class ViewInscription {
    private Group root;
    private Button inscription;
    private Text Inscription;
    private Button BoutonEnvoye;
    private Label NomLabel;
    private TextField NomField;
    private Label PrenomLabel;
    private TextField PrenomField;
    private Label AdresseLabel;
    private TextField AdresseField;
    private Label CPLabel;
    private TextField CPField;
    private Label EmailLabel;
    private TextField EmailField;
    private Label PseudoLabel;
    private TextField PseudoField;
    private Label MDPLabel;
    private PasswordField MDPField;



    ViewInscription(Group root) {
        this.root = root;
        Form();
    }

    private void Form() {

         Inscription = new Text("Inscription");
         Inscription.setLayoutX(650);
         Inscription.setLayoutY(200);

         NomLabel = new Label("Nom :");
         NomField = new TextField();
         NomLabel.setLayoutX(550); //horizontale
         NomLabel.setLayoutY(300); //verticale
         NomField.setLayoutX(600);
         NomField.setLayoutY(300);

         PrenomLabel = new Label("Prenom :");
         PrenomField = new TextField();
         PrenomLabel.setLayoutX(530);
         PrenomLabel.setLayoutY(350);
         PrenomField.setLayoutX(600);
         PrenomField.setLayoutY(350);

         AdresseLabel = new Label("Adresse :");
         AdresseField = new TextField();
         AdresseLabel.setLayoutX(530);
         AdresseLabel.setLayoutY(400);
         AdresseField.setLayoutX(600);
         AdresseField.setLayoutY(400);


         CPLabel = new Label("Code postal :");
         CPField = new TextField();
         CPLabel.setLayoutX(510);
         CPLabel.setLayoutY(450);
         CPField.setLayoutX(600);
         CPField.setLayoutY(450);

         EmailLabel = new Label("Adresse e-mail :");
         EmailField = new TextField();
         EmailLabel.setLayoutX(490);
         EmailLabel.setLayoutY(500);
         EmailField.setLayoutX(600);
         EmailField.setLayoutY(500);

         PseudoLabel = new Label("Pseudo :");
         PseudoField = new TextField();
         PseudoLabel.setLayoutX(520);
         PseudoLabel.setLayoutY(550);
         PseudoField.setLayoutX(600);
         PseudoField.setLayoutY(550);

         MDPLabel = new Label("Mot de passe :");
         MDPField = new PasswordField();
         MDPLabel.setLayoutX(500);
         MDPLabel.setLayoutY(600);
         MDPField.setLayoutX(600);
         MDPField.setLayoutY(600);

        BoutonEnvoye = new Button("Valider");
        BoutonEnvoye.setLayoutX(650);
        BoutonEnvoye.setLayoutY(650);

    }

    void setVueInscription() {
        root.getChildren().clear();
        root.getChildren().add(Inscription);
        root.getChildren().add(NomLabel);
        root.getChildren().add(NomField);
        root.getChildren().add(PrenomLabel);
        root.getChildren().add(PrenomField);
        root.getChildren().add(AdresseLabel);
        root.getChildren().add(AdresseField);
        root.getChildren().add(CPLabel);
        root.getChildren().add(CPField);
        root.getChildren().add(EmailLabel);
        root.getChildren().add(EmailField);
        root.getChildren().add(PseudoLabel);
        root.getChildren().add(PseudoField);
        root.getChildren().add(MDPLabel);
        root.getChildren().add(MDPField);
        root.getChildren().add(BoutonEnvoye);
    }

    void setEvents(ControllerInscription ci) {
        BoutonEnvoye.setOnMouseClicked(ci);
    }

    public Button getInscription() {
        return BoutonEnvoye;
    }

}
