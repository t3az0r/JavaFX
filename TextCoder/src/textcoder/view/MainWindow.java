/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package textcoder.view;

import javafx.application.Application;
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

/**
 *
 * @author cthies
 */
public class MainWindow extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setId("grid");
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        String decoration = HEAVY_BLACK_HEART;
        String decoration2 = BLACK_HEART;
        
        Text scenetitle = new Text(" "+decoration2+" 0x 111505050e "+decoration2);
//        scenetitle.setFont(Font.font("OCR A Extended", FontWeight.NORMAL, 48));
//        scenetitle.setFont(Font.font("DejaVu Sans", FontWeight.NORMAL, 48));
        grid.add(scenetitle, 0, 0);

//        for(String fn: Font.getFontNames()) {
//            System.out.println(fn);
//        }
//        
//        Text scenetitle2 = new Text(decoration+" 0x 111505050e "+decoration);
//        scenetitle2.setFont(Font.font("Arial Unicode MS", FontWeight.BOLD, 48));
//        scenetitle2.setFont(Font.font("Quivira", FontWeight.NORMAL, 48));
//        scenetitle2.setFont(Font.font("Apple Color Emoji", 48));
//        grid.add(scenetitle2, 0, 1);

        Text scenesubtitle = new Text("140805 0c0f1605 130f0e0713");
        //scenesubtitle.setFont(Font.font("OCR A Extended", FontWeight.NORMAL, 36));
        grid.add(scenesubtitle, 0, 1);

        Text spacer1 = new Text(" ");
        spacer1.setFont(Font.font("OCR A Extended", FontWeight.NORMAL, 48));
        grid.add(spacer1, 0, 2);

        Text spacer2 = new Text("  ");
        spacer2.setFont(Font.font("OCR A Extended", FontWeight.NORMAL, 48));
        grid.add(spacer2, 0, 3);

        scenetitle.setId("welcome-text");
        scenesubtitle.setId("welcome-subtext");
        
        Scene scene = new Scene(grid, 1250, 1200);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        scene.getStylesheets().add(MainWindow.class.getResource("MainWindow.css").toExternalForm());
        
        primaryStage.show();
        System.out.println("###"+TWO_HEARTS);
    }
    
    public static final String HEAVY_BLACK_HEART = "\u2764";
    public static final String WHITE_HEART = "\u2661";
    public static final String BLACK_HEART = "\u2665";
    public static final String TWO_HEARTS = "\uD83D\uDC95";
    public static final String SIMPLE_DASH = "-";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
