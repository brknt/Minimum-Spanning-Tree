/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication48;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author Berkant
 */
public class FXMLDocumentController implements Initializable {
    public static final int MAX_VALUE = 999;
     public static int numberOfVertices=5;
   
    
    @FXML
    private TextField text1;
    
    @FXML
    private TextField text2;

    @FXML
    private TextField text3;

    @FXML
    private TextField text4;

    @FXML
    private TextField text5;

    @FXML
    private TextField text6;

    @FXML
    private TextField text7;

    @FXML
    private TextField text8;

    @FXML
    private TextField text9;

    @FXML
    private TextField text10;

    @FXML
    private TextField text12;

    @FXML
    private TextField text11;

    @FXML
    private TextField text13;

    @FXML
    private TextField text14;

    @FXML
    private TextField text15;

    @FXML
    private TextField text16;

    @FXML
    private TextField text17;

    @FXML
    private TextField text18;

    @FXML
    private TextField text19;

    @FXML
    private TextField text20;

    @FXML
    private TextField text21;

    @FXML
    private TextField text22;

    @FXML
    private TextField text23;

    @FXML
    private TextField text24;

    @FXML
    private TextField text25;
    
    @FXML
    private Label label_prim;

    @FXML
    private Label label_kruksal;

    @FXML
    private Label label_dij;
    
    @FXML
    private Button btn_clear;
    @FXML
    private Button btn_start;
    
   
    

    

    
    @FXML
    private void handleOnAction(MouseEvent event){
        String s="";
        text1.setText(s);text6.setText(s);text11.setText(s);text16.setText(s);text21.setText(s);
        text2.setText(s);text7.setText(s);text12.setText(s);text17.setText(s);text22.setText(s);
        text3.setText(s);text8.setText(s);text13.setText(s);text18.setText(s);text23.setText(s);
        text4.setText(s);text9.setText(s);text14.setText(s);text19.setText(s);text24.setText(s);
        text5.setText(s);text10.setText(s);text15.setText(s);text20.setText(s);text25.setText(s);
       
    }
    @FXML
    private void handleOnAction2(MouseEvent event){
        System.out.println("start");
        int [][]graphMatrix = null;
        
        int graph [][];
        
       
         graphMatrix = new int[numberOfVertices+1 ][numberOfVertices+1];
         graph =new int[numberOfVertices][numberOfVertices];
             
graph[0][0]=Integer.valueOf(text1.getText());graph[0][1]=Integer.valueOf(text2.getText());
graph[0][2]=Integer.valueOf(text3.getText());graph[0][3]=Integer.valueOf(text4.getText());
graph[0][4]=Integer.valueOf(text5.getText());graph[1][0]=Integer.valueOf(text6.getText());
graph[1][1]=Integer.valueOf(text7.getText());graph[1][2]=Integer.valueOf(text8.getText());
graph[1][3]=Integer.valueOf(text9.getText());graph[1][4]=Integer.valueOf(text10.getText());
graph[2][0]=Integer.valueOf(text11.getText());graph[2][1]=Integer.valueOf(text12.getText());
graph[2][2]=Integer.valueOf(text13.getText());graph[2][3]=Integer.valueOf(text14.getText());
graph[2][4]=Integer.valueOf(text15.getText());graph[3][0]=Integer.valueOf(text16.getText());
graph[3][1]=Integer.valueOf(text17.getText());graph[3][2]=Integer.valueOf(text18.getText());
graph[3][3]=Integer.valueOf(text19.getText());graph[3][4]=Integer.valueOf(text20.getText());
graph[4][0]=Integer.valueOf(text21.getText());graph[4][1]=Integer.valueOf(text22.getText());
graph[4][2]=Integer.valueOf(text23.getText());graph[4][3]=Integer.valueOf(text24.getText());
graph[4][4]=Integer.valueOf(text25.getText());
        for (int i = 1; i <= numberOfVertices; i++)
        {
            for (int j = 1; j <= numberOfVertices; j++)
            {   
                
                graphMatrix[i][j] = graph[i-1][j-1];
                if (i == j)
                {
                    graphMatrix[i][j] = 0;
                    continue;
                }
                if (graphMatrix[i][j] == 0)
                {
                    graphMatrix[i][j] = MAX_VALUE;
                }
            }
        }
//KRUKSAL 
               long startTime = System.nanoTime(); 
                       
           KruskalsAlgoritma kruskalAlgorithm = new KruskalsAlgoritma(numberOfVertices);
                 kruskalAlgorithm.kruskalAlgorithm(graphMatrix);
                 
              long endTime = System.nanoTime(); 
                 long estimatedTime = endTime - startTime; // Geçen süreyi nanosaniye cinsinden elde ediyoruz
                    double seconds = (double)estimatedTime/1000000000; // saniyeye çevirmek için milyar'a bölüyoruz.
                        System.out.println(seconds);
                        label_kruksal.setText(String.valueOf(seconds));




//PRİM
          long startTime2 = System.nanoTime(); 
     Prim t = new Prim();
        // Print the solution
        t.primMST(graph);
          long endTime2 = System.nanoTime(); 
              long estimatedTime2 = endTime2 - startTime2; 
                 double seconds2 = (double)estimatedTime2/1000000000; 
             System.out.println(seconds2);
                 label_prim.setText(String.valueOf(seconds2));
                 
            //DİJKSTRA
        
        long startTime3 = System.nanoTime(); 
     ShortestPath e = new ShortestPath();
        e.dijkstra(graph, 0);
          long endTime3 = System.nanoTime(); 
              long estimatedTime3 = endTime3 - startTime3; 
                 double seconds3 = (double)estimatedTime3/1000000000; 
                 System.out.println(seconds3);
       label_dij.setText(String.valueOf(seconds3));
        
               
    }
    
 
    
   

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
    }    
    
}
