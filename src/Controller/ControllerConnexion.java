package Controller;

import View.ViewHandler;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class ControllerConnexion implements EventHandler<MouseEvent>{

    private ViewHandler launcher;

    public ControllerConnexion(ViewHandler launcher) {
        this.launcher = launcher;
        this.launcher.setEventHandlerConnexion(this);

    }

    @Override
    public void handle(MouseEvent event) {
        if (event.getSource().equals(launcher.getVc().getConnexion())
                && event.getEventType().equals(MouseEvent.MOUSE_CLICKED)) {
            launcher.setVueInformation();
        }
    }
}
