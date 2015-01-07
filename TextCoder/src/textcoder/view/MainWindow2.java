/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package textcoder.view;

import javafx.application.Application;
import static javafx.application.Application.launch;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import textcoder.TextCoder;

/**
 *
 * @author cthies
 */
public class MainWindow2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setId("grid");
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        String decoration = TWO_HEARTS;
        
        Text scenetitle = new Text(""+decoration+" 0x 111505050e "+decoration+"");
        scenetitle.setFont(Font.font("OCR A Extended", FontWeight.NORMAL, 36));
        grid.add(scenetitle, 0, 0);
        scenetitle.setId("welcome-text");
        
        Text spacer = new Text(" ");
        spacer.setFont(Font.font("OCR A Extended", FontWeight.NORMAL, 36));
        grid.add(spacer, 0, 1);

        String listStyle = ""
                + "text-align: left;"
                + "-fx-text-alignment: left;"
                + "-fx-font-size: 24px;"
                + "-fx-font-family: \"OCR A Extended\";"
                + "-fx-fill: #818181;"
                + "-fx-effect: innershadow( three-pass-box , rgba(0,0,0,0.7) , 6, 0.0 , 0 , 2 );";
        
            String[] titles = new String[] {
                "Love of my life"
                ,"Delilah"
                ,"You And I"
                ,"Crazy Little Thing Called Love"
                ,"Bijou"
                ,"Good Old-Fashioned Lover Boy"
                ,"Need Your Loving Tonight"
                ,"In Only Seven Days"
                ,"Save Me"
                ,"Teo Torriatte"
                ,"Las Palabras De Amor"
                ,"You Take My Breath Away"
                ,"Cool Cat"
                ,"Long Away"
                ,"Jealousy"
            };   
        int count = 2;
        {
            String preamble = String.format("%02x. ", count-1);
            Text scenesubtitle = new Text(preamble+new TextCoder(titles[count-2]).plain());
            scenesubtitle.setFont(Font.font("OCR A Extended", FontWeight.NORMAL, 24));
            scenesubtitle.setStyle(listStyle);
            grid.add(scenesubtitle, 0, count++);
        }
        {
            String preamble = String.format("%02x. ", count-1);
            Text scenesubtitle = new Text(preamble+new TextCoder(titles[count-2]).plain());
            scenesubtitle.setFont(Font.font("OCR A Extended", FontWeight.NORMAL, 24));
            scenesubtitle.setStyle(listStyle);
            grid.add(scenesubtitle, 0, count++);
        }
        {
            String preamble = String.format("%02x. ", count-1);
            Text scenesubtitle = new Text(preamble+new TextCoder(titles[count-2]).plain());
            scenesubtitle.setFont(Font.font("OCR A Extended", FontWeight.NORMAL, 24));
            scenesubtitle.setStyle(listStyle);
            grid.add(scenesubtitle, 0, count++);
        }
        {
            String preamble = String.format("%02x. ", count-1);
            Text scenesubtitle = new Text(preamble+new TextCoder(titles[count-2]).plain());
            scenesubtitle.setFont(Font.font("OCR A Extended", FontWeight.NORMAL, 24));
            scenesubtitle.setStyle(listStyle);
            grid.add(scenesubtitle, 0, count++);
        }
        {
            String preamble = String.format("%02x. ", count-1);
            Text scenesubtitle = new Text(preamble+new TextCoder(titles[count-2]).plain());
            scenesubtitle.setFont(Font.font("OCR A Extended", FontWeight.NORMAL, 24));
            scenesubtitle.setStyle(listStyle);
            grid.add(scenesubtitle, 0, count++);
        }
        {
            String preamble = String.format("%02x. ", count-1);
            Text scenesubtitle = new Text(preamble+new TextCoder(titles[count-2]).plain());
            scenesubtitle.setFont(Font.font("OCR A Extended", FontWeight.NORMAL, 24));
            scenesubtitle.setStyle(listStyle);
            grid.add(scenesubtitle, 0, count++);
        }
        {
            String preamble = String.format("%02x. ", count-1);
            Text scenesubtitle = new Text(preamble+new TextCoder(titles[count-2]).plain());
            scenesubtitle.setFont(Font.font("OCR A Extended", FontWeight.NORMAL, 24));
            scenesubtitle.setStyle(listStyle);
            grid.add(scenesubtitle, 0, count++);
        }
        {
            String preamble = String.format("%02x. ", count-1);
            Text scenesubtitle = new Text(preamble+new TextCoder(titles[count-2]).plain());
            scenesubtitle.setFont(Font.font("OCR A Extended", FontWeight.NORMAL, 24));
            scenesubtitle.setStyle(listStyle);
            grid.add(scenesubtitle, 0, count++);
        }
        {
            String preamble = String.format("%02x. ", count-1);
            Text scenesubtitle = new Text(preamble+new TextCoder(titles[count-2]).plain());
            scenesubtitle.setFont(Font.font("OCR A Extended", FontWeight.NORMAL, 24));
            scenesubtitle.setStyle(listStyle);
            grid.add(scenesubtitle, 0, count++);
        }
        {
            String preamble = String.format("%02x. ", count-1);
            Text scenesubtitle = new Text(preamble+new TextCoder(titles[count-2]).plain());
            scenesubtitle.setFont(Font.font("OCR A Extended", FontWeight.NORMAL, 24));
            scenesubtitle.setStyle(listStyle);
            grid.add(scenesubtitle, 0, count++);
        }
        {
            String preamble = String.format("%02x. ", count-1);
            Text scenesubtitle = new Text(preamble+new TextCoder(titles[count-2]).plain());
            scenesubtitle.setFont(Font.font("OCR A Extended", FontWeight.NORMAL, 24));
            scenesubtitle.setStyle(listStyle);
            grid.add(scenesubtitle, 0, count++);
        }
        {
            String preamble = String.format("%02x. ", count-1);
            Text scenesubtitle = new Text(preamble+new TextCoder(titles[count-2]).plain());
            scenesubtitle.setFont(Font.font("OCR A Extended", FontWeight.NORMAL, 24));
            scenesubtitle.setStyle(listStyle);
            grid.add(scenesubtitle, 0, count++);
        }
        {
            String preamble = String.format("%02x. ", count-1);
            Text scenesubtitle = new Text(preamble+new TextCoder(titles[count-2]).plain());
            scenesubtitle.setFont(Font.font("OCR A Extended", FontWeight.NORMAL, 24));
            scenesubtitle.setStyle(listStyle);
            grid.add(scenesubtitle, 0, count++);
        }
        {
            String preamble = String.format("%02x. ", count-1);
            Text scenesubtitle = new Text(preamble+new TextCoder(titles[count-2]).plain());
            scenesubtitle.setFont(Font.font("OCR A Extended", FontWeight.NORMAL, 24));
            scenesubtitle.setStyle(listStyle);
            grid.add(scenesubtitle, 0, count++);
        }
        {
            String preamble = String.format("%02x. ", count-1);
            Text scenesubtitle = new Text(preamble+new TextCoder(titles[count-2]).plain());
            scenesubtitle.setFont(Font.font("OCR A Extended", FontWeight.NORMAL, 24));
            scenesubtitle.setStyle(listStyle);
            grid.add(scenesubtitle, 0, count++);
        }
        
        Scene scene = new Scene(grid, 1800, 1800);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        scene.getStylesheets().add(MainWindow_bak.class.getResource("MainWindow.css").toExternalForm());
       
        primaryStage.show();
    }
    public static final String TWO_HEARTS = "\uD83D\uDC95";
    public static final String SIMPLE_DASH = "-";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
