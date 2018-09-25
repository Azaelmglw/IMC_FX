package models;

import java.util.ArrayList;
import java.util.List;
import javafx.scene.Parent;
import javafx.stage.Stage;

/**
 *
 * @author Azaelmglw
 */

public class ModelMain {
    /*  Parents array list position:
    [0] -> main    |
    */
    
    /*  User input array list position:
    [0] -> weight   |   [1] -> height
    */
    
    /*  Application output array list position:
    [0] -> imc  |   [1] -> status_message
    */
    
    private final Stage primaryStage;
    private List<Parent> parents = new ArrayList<>(5);
    private List<String> user_input = new ArrayList<>(5);
    private List<String> app_output = new ArrayList<>(5);
    
    public ModelMain(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }
    
    public void CalculateIMC(){
        setIMC("" + Double.parseDouble(getWeight()) / (Double.parseDouble(getHeight()) * Double.parseDouble(getHeight())));
        if(Double.parseDouble(getIMC()) > 0 && Double.parseDouble(getIMC()) < 18.5){
            setStatusMessage("Bajo Peso");
        }
        else if(Double.parseDouble(getIMC()) > 18.4 &&  Double.parseDouble(getIMC()) < 25){
            setStatusMessage("Normal");
        }
        else if (Double.parseDouble(getIMC()) > 24.99 && Double.parseDouble(getIMC()) < 30){
            setStatusMessage("Sobrepeso");
        }
        else if(Double.parseDouble(getIMC()) > 29.99){
            setStatusMessage("Obesidad");
        }
    }
    
    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public Parent getParent(int parent_position) {
        return parents.get(parent_position);
    }

    public void setParent(int parent_position, Parent parent) {
        this.parents.add(parent_position, parent);
    }    

    public void setWeight(String weight){
        user_input.add(0,weight);
    }
    
    public String getWeight(){
        return user_input.get(0);
    }
    
    public void setHeight(String height){
        user_input.add(1, height);
    }
    
    public String getHeight(){
        return user_input.get(1);
    }
    
    public void setIMC(String imc){
        app_output.add(0, imc);
    }
    
    public String getIMC(){
        return app_output.get(0);
    }
    
    public void setStatusMessage(String status_message){
        app_output.add(1, status_message);
    }
    
    public String getStatusMessage(){
        return app_output.get(1);
    }
}