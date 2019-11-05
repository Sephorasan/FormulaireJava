package View;

import javafx.scene.Group;
import javafx.scene.control.Button;

public class ViewInformation {
        private Group root;

        ViewInformation(Group root) {
        this.root = root;
        }

        void setVueInformation(){
        root.getChildren().clear();
    }

}

