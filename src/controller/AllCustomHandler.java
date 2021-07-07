package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class AllCustomHandler {
    public static class GenHeroHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent actionEvent) {
            Launcher.setMainCharacter(GenCharacter.setUpCharacter());
            Launcher.refreshPane();
        }
    }
}
