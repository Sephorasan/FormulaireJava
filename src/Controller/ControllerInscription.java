package Controller;

import View.ViewHandler;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;


public class ControllerInscription implements EventHandler<MouseEvent> {


        private ViewHandler launcher;
        private BooleanProperty isNewRegisterClicked, isLoginClicked;

        public ControllerInscription(ViewHandler launcher) {
        this.launcher = launcher;
        this.launcher.setEventHandlerInscription(this);

        this.isNewRegisterClicked = new SimpleBooleanProperty(false);
        this.isLoginClicked = new SimpleBooleanProperty(false);

    }

        @Override
        public void handle(MouseEvent event) {
        if (event.getSource().equals(launcher.getVi().getInscription())
                && event.getEventType().equals(MouseEvent.MOUSE_CLICKED)) {
            isNewRegisterClicked.set(true);
        } else if (event.getSource().equals(launcher.getVc().getConnexion())
                && event.getEventType().equals(MouseEvent.MOUSE_CLICKED)) {
            isLoginClicked.set(true);
        }
    }
}