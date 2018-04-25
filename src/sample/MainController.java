package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private RadioButton extraFromMinimumCaption;

    @FXML
    private TextField extraFromMinimumArgument;

    @FXML
    private TextField extraFromMinimumResult;

    @FXML
    private Button extraFromMinimumCopyButton;

    @FXML
    private Label minimumCaption;

    @FXML
    private TextField minimumArgument;

    @FXML
    private TextField minimumResult;

    @FXML
    private Button minimumButtonToChangeWithMaximum;

    @FXML
    private RadioButton interpolationCaption;

    @FXML
    private TextField interpolationArgument;

    @FXML
    private TextField interpolationResult;

    @FXML
    private Button interpolationCopyButton;

    @FXML
    private Label maximumCaption;

    @FXML
    private TextField maximumArgument;

    @FXML
    private TextField maximumResult;

    @FXML
    private Button maximumButtonToChangeWithMinimum;

    @FXML
    private RadioButton extraFromMaximumCaption;

    @FXML
    private TextField extraFromMaximumArgument;

    @FXML
    private TextField extraFromMaximumResult;

    @FXML
    private Button extraFromMaximumCopyButton;

    private List<MyControl> controls;

    public boolean isChosen(ActionEvent event) {
        String id = ((RadioButton)event.getSource()).getId();
        System.out.println(id);
        switch (id) {
            case "extraFromMaximumCaption":
                for (MyControl control : controls) {
                    control.prepareForExtraFromMaximum();
                }
                break;
            case "extraFromMinimumCaption":
                for (MyControl control : controls) {
                    control.prepareForExtraFromMinimum();
                }
                break;
            default:
                for (MyControl control : controls) {
                    control.prepareForInterpolation();
                }
                break;
        }
        return true;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        controls = new LinkedList<>();
        controls.add(new MyControl(extraFromMinimumArgument, true, false, false));
        controls.add(new MyControl(extraFromMinimumResult, true, false, false));
        controls.add(new MyControl(extraFromMinimumCopyButton, true, false, false));
        controls.add(new MyControl(minimumCaption, true, true, false));
        controls.add(new MyControl(minimumArgument, true, true, false));
        controls.add(new MyControl(minimumResult, true, true, false));
        controls.add(new MyControl(minimumButtonToChangeWithMaximum, true, true, false));
        controls.add(new MyControl(interpolationArgument, false, true, false));
        controls.add(new MyControl(interpolationResult, false, true, false));
        controls.add(new MyControl(interpolationCopyButton, false, true, false));
        controls.add(new MyControl(maximumCaption, false, true, true));
        controls.add(new MyControl(maximumArgument, false, true, true));
        controls.add(new MyControl(maximumResult, false, true, true));
        controls.add(new MyControl(maximumButtonToChangeWithMinimum, false, true, true));
        controls.add(new MyControl(extraFromMaximumArgument, false, false, true));
        controls.add(new MyControl(extraFromMaximumResult, false, false, true));
        controls.add(new MyControl(extraFromMaximumCopyButton, false, false, true));
    }
}
