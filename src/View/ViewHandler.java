package View;

import Controller.ControllerConnexion;
import Controller.ControllerInformation;
import Controller.ControllerInscription;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ViewHandler extends Application {
    private Stage primaryStage;
    private ViewInscription vi;
    private ViewConnexion vc;
    private ViewInformation vf;
    private ControllerConnexion cc;
    private ControllerInscription ci;
    private ControllerInformation cf;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        Group root = new Group();
        Scene scene = new Scene(root);


        vi = new ViewInscription(root);
        vc = new ViewConnexion(root);
        ci = new ControllerInscription(this);
        vf = new ViewInformation(root);
        cc = new ControllerConnexion(this);
        //cf = new ControllerInformation(this);

        AffichInscription();
        primaryStage.setTitle("Formulaire");
        primaryStage.setFullScreen(true);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public void AffichInscription() {
        vi.setVueInscription();
    }

    public void AffichConnexion(){
        vc.setVueConnexion();
    }

    public void AffichInformation(){
        vf.setVueInformation();
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }
    public ViewInscription getVi() {
        return vi;
    }

    public ViewConnexion getVc() {
        return vc;
    }
    public void setVueConnexion(){
        vc.setVueConnexion();
    }
    public void setVueInformation(){
        vf.setVueInformation();
    }

    public ViewInformation getVf() {
        return vf;
    }

    public void setEventHandlerInscription(ControllerInscription ci) {
        vi.setEvents(ci);
    }

    public void setEventHandlerConnexion(ControllerConnexion cc){
        vc.setEvents(cc);
    }
}

