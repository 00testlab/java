package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LabFx extends Application {
	
public static void main(String[] args) {
launch(args);
    }

public void start(Stage primaryStage) {
		 //Label for name 
	      Text nameLabel = new Text("Name"); 
	
	      //Text field for name 
	      TextField nameText = new TextField(); 

	      //Label for date of birth 
	      Text dobLabel = new Text("Date of birth"); 
	
	      //date picker to choose date 
	      DatePicker datePicker = new DatePicker(); 
	
	      //Label for gender
	      Text genderLabel = new Text("Gender"); 
	
	      //Toggle group of radio buttons       
	      ToggleGroup groupGender = new ToggleGroup(); 
	      RadioButton maleRadio = new RadioButton("Male"); 
	      maleRadio.setToggleGroup(groupGender); 
	      RadioButton femaleRadio = new RadioButton("Female"); 
	      femaleRadio.setToggleGroup(groupGender); 
	
	      //Label for reservation 
	      Text nptel = new Text("Have you Registered for NPTEL ?"); 
	
	      ToggleGroup group = new ToggleGroup(); 
	      ToggleButton yes = new ToggleButton("Yes"); 
	      yes.setToggleGroup(group);   
	      yes.setUserData(yes);
	
	      ToggleButton no = new ToggleButton("No"); 
	      no.setUserData(no);
	      no.setToggleGroup(group);
	      //Label for location 
	      Text locationLabel = new Text("Location"); 
	
	      //Choice box for location 
	      ChoiceBox locationchoiceBox = new ChoiceBox(); 
	      locationchoiceBox.getItems().addAll("Bangalore", "Hyderabad", "Chennai", "Delhi", "Mumbai", "Vishakhapatnam"); 
	      locationchoiceBox.getSelectionModel().selectFirst();
	      //Label for register 
	      Button buttonRegister = new Button("Register");  
	
	
	      //Creating a Grid Pane 
	      GridPane gridPane = new GridPane();    
	
	      //Setting size for the pane 
	      gridPane.setMinSize(500, 600); 
	
	      //Setting the padding    
	      gridPane.setPadding(new Insets(10, 10, 10, 10));  
	
	      //Setting the vertical and horizontal gaps between the columns 
	      gridPane.setVgap(10); 
	      gridPane.setHgap(5);       
	
	      //Setting the Grid alignment 
	      gridPane.setAlignment(Pos.CENTER); 
	
	      //Arranging all the nodes in the grid 
	      gridPane.add(nameLabel, 0, 0); 
	      gridPane.add(nameText, 1, 0); 
	
	      gridPane.add(dobLabel, 0, 1);       
	      gridPane.add(datePicker, 1, 1); 
	
	      gridPane.add(genderLabel, 0, 2); 
	      gridPane.add(maleRadio, 1, 2);       
	      gridPane.add(femaleRadio, 2, 2); 
	      gridPane.add(nptel, 0, 3); 
	      gridPane.add(yes, 1, 3);       
	      gridPane.add(no, 2, 3);  
	
	
	
	      gridPane.add(locationLabel, 0, 6); 
	      gridPane.add(locationchoiceBox, 1, 6);   
	
	
	
	      gridPane.add(buttonRegister, 2, 8);      
	      buttonRegister.setText("Submit");
	      buttonRegister.setOnAction(new EventHandler<ActionEvent>() {
	
	    	  public void handle(ActionEvent event) {
	    		  System.out.println("Registration complete");
	    		  System.out.println("Name: "+nameText.getText());
	    		  System.out.println("DoB: "+datePicker.getValue());
	    		  System.out.println("Location:"+locationchoiceBox.getValue());
	            }
	        });
	
	
	      //Styling nodes   
	      buttonRegister.setStyle("-fx-background-color: Red; -fx-textfill: white;"); 
	
	      nameLabel.setStyle("-fx-font: normal bold 15px 'serif' "); 
	      dobLabel.setStyle("-fx-font: normal bold 15px 'serif' "); 
	      genderLabel.setStyle("-fx-font: normal bold 15px 'serif' "); 
	      nptel.setStyle("-fx-font: normal bold 15px 'serif' "); 
	
	      locationLabel.setStyle("-fx-font: normal bold 15px 'serif' "); 
	
	      //Setting the back ground color 
	      gridPane.setStyle("-fx-background-color: BEIGE;");       
	
	      //Creating a scene object 
	      Scene scene2 = new Scene(gridPane); 
	
	      //Setting title to the Stage 
	      primaryStage.setTitle("Registration Form"); 
	
	      //Adding scene to the stage 
	      primaryStage.setScene(scene2);  
	
	      //Displaying the contents of the stage 
	      primaryStage.show(); 
    }
}