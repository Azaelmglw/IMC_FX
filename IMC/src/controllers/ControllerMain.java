package controllers;

import models.ModelMain;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Azaelmglw
 */

public class ControllerMain implements Initializable {
    
    private final ModelMain model_main;
    
    public ControllerMain(ModelMain model_main){
        this.model_main = model_main;
    }
         
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }
    
    @FXML
    private TextField weight_tfield;
    
    @FXML
    private TextField height_tfield;
    
    @FXML
    private Label imc_lbl;
    
    @FXML
    private Label status_lbl;
    
    
    @FXML
    private void CalculateIMC(ActionEvent event) {
        model_main.setWeight(weight_tfield.getText());
        model_main.setHeight(height_tfield.getText());
        model_main.CalculateIMC();
        imc_lbl.setText(model_main.getIMC());
        status_lbl.setText(model_main.getStatusMessage());
    }
    
    @FXML
    private void ClearInputFields(ActionEvent event) {
        weight_tfield.setText("");
        height_tfield.setText("");
    }
}