/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author HP
 */
public class FXMLDocumentController  {
    float data=0f;
    int operation = -1;
    float ans7=1;
    double ans4=1;
    
    @FXML
    private Label label;
    
     @FXML
    private TextField t1;


    @FXML
    private Button b1;

    @FXML
    private Button b2;

    @FXML
    private Button b3;

    @FXML
    private Button bp;

    @FXML
    private Button bsin;

    @FXML
    private Button b4;

    @FXML
    private Button b5;

    @FXML
    private Button b6;

    @FXML
    private Button bm;

    @FXML
    private Button bcos;

    @FXML
    private Button b7;

    @FXML
    private Button b8;

    @FXML
    private Button b9;

    @FXML
    private Button bmm;

    @FXML
    private Button btan;

    @FXML
    private Button b0;

    @FXML
    private Button bcl;

    @FXML
    private Button be;

    @FXML
    private Button bd;

    @FXML
    private Button bexpo;

    @FXML
    void handleButtonAction(ActionEvent event) {
        if(event.getSource()== b1){
            t1.setText(t1.getText()+"1");
        }
        if(event.getSource()== b2){
            t1.setText(t1.getText()+"2");
        }
        if(event.getSource()== b3){
            t1.setText(t1.getText()+"3");
        }
        if(event.getSource()== b4){
            t1.setText(t1.getText()+"4");
        }
        if(event.getSource()== b5){
            t1.setText(t1.getText()+"5");
        }
        if(event.getSource()== b6){
            t1.setText(t1.getText()+"6");
        }
        if(event.getSource()== b7){
            t1.setText(t1.getText()+"7");
        }
        if(event.getSource()== b8){
            t1.setText(t1.getText()+"8");
        }
        if(event.getSource()== b9){
            t1.setText(t1.getText()+"9");
        }
        if(event.getSource()== b0){
            t1.setText(t1.getText()+"0");
        }
        if(event.getSource()== bcl){
            t1.setText(" ");
        }
        if(event.getSource()== bp){
           data= Float.parseFloat(t1.getText());
           operation = 1;
           t1.setText("");
        }
        if(event.getSource()== bm){
           data= Float.parseFloat(t1.getText());
           operation = 2;
           t1.setText("");
        }
        if(event.getSource()== bmm){
           data= Float.parseFloat(t1.getText());
           operation = 3;
           t1.setText("");
        }
        if(event.getSource()== bd){
           data= Float.parseFloat(t1.getText());
           operation = 4;
           t1.setText("");
        }
        if(event.getSource()== bsin){
           
           data= Float.parseFloat(t1.getText());
           float b = (float) Math.sin(data);
            t1.setText(String.valueOf(b));
           
        
        }
        if(event.getSource()== bcos){
            data= Float.parseFloat(t1.getText());
           float b = (float) Math.cos(data);
              t1.setText(String.valueOf(b));
        }
        if(event.getSource()== btan){
            data= Float.parseFloat(t1.getText());
           float b = (float) Math.tan(data);
              t1.setText(String.valueOf(b));
        }
        if(event.getSource()== bexpo){
           data= Float.parseFloat(t1.getText());
           float b = (float)Math.exp(data);
              t1.setText(String.valueOf(b));;
           
        }
        if(event.getSource()== be){
            Float secondOperand =Float.parseFloat(t1.getText());
            
               if(operation==1){
                    Float ans = data+secondOperand;
                    t1.setText(String.valueOf(ans));}
                if(operation==2){
                    Float ans1 = data-secondOperand;
                    t1.setText(String.valueOf(ans1));}
                if(operation==3){
                    Float ans2 = data*secondOperand;
                    t1.setText(String.valueOf(ans2));}
               if(operation==4){
                    Float ans3 = data/secondOperand;
                    t1.setText(String.valueOf(ans3));}
               if(operation==5){
                   
                    t1.setText(String.valueOf(ans4));}
               if(operation==6){
                    Float ans5 = data/secondOperand;
                    t1.setText(String.valueOf(ans5));}
               if(operation==7){
                    Float ans6 = data/secondOperand;
                    t1.setText(String.valueOf(ans6));}
               if(operation==8){
                  
                   
                    
                    
            }

        }}}


