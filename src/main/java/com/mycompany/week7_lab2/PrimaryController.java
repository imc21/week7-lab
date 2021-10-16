package com.mycompany.week7_lab2;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class PrimaryController {

    @FXML
    
    ImageView myimageView;
    Label count1, count2;
    
    Button button1, button2;
    
    Image image1 = new Image(getClass().getResourceAsStream("pika.jpg"));
    Image image2 = new Image(getClass().getResourceAsStream("chinchou.jpg"));
    
    int counter1 = 0;
    int counter2 = 0;
    
    
   public void displayImage() {
       myimageView.setImage(image1); 
       counter1++;
       
       
   }
   
   public void displayImage2() {
       myimageView.setImage(image2);
       counter2++;
       
   }
   
   public void countClk1(ActionEvent event) {
       String cntnt = " ";
       counter1 =Integer.parseInt(cntnt);
       count1.setText(cntnt);
   }

    public void countClk2(ActionEvent event) {
       String cntnt = " ";
       counter2 =Integer.parseInt(cntnt);
       count2.setText(cntnt);
    }
   
   
}
