package sample;

import javafx.scene.control.Control;

public class MyControl extends Control {
    private Control control;
    private boolean isForExtraFromMinimum;
    private boolean isForInterpolation;
    private boolean isForExtraFromMaximum;

    public MyControl(Control control, boolean isForExtraFromMinimum, boolean isForInterpolation, boolean isForExtraFromMaximum) {
        this.control = control;
        this.isForExtraFromMinimum = isForExtraFromMinimum;
        this.isForInterpolation = isForInterpolation;
        this.isForExtraFromMaximum = isForExtraFromMaximum;
    }

    public void prepareForExtraFromMinimum() {
        control.setDisable(!isForExtraFromMinimum);
    }

    public void prepareForInterpolation() {
        control.setDisable(!isForInterpolation);
    }

    public void prepareForExtraFromMaximum() {
        control.setDisable(!isForExtraFromMaximum);
    }
}
