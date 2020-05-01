package sample;

import javafx.fxml.FXML;

import java.awt.event.ActionEvent;

public class Controller {
    Clock clock;
    @FXML Label lblClock;

    public Controller() {
        clock = new Clock();
    }

    @FXML
    protected void handleBtnSecond(ActionEvent event) {
        clock.addSecond();
        updateLabel();
    }

    @FXML
    protected void handleBtnMinute(ActionEvent event) {
        clock.addMinute();
        updateLabel();
    }

    @FXML
    protected void handleBtnHour(ActionEvent event) {
        clock.addHour();
        updateLabel();
    }

    private void updateLabel() {
        lblClock.setText(clock.getTime());
    }
}
