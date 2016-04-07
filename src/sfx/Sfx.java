/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sfx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.io.File;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.awt.Toolkit;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author coder
 */
public class Sfx extends Application {
    
    @Override
    public void start(Stage primaryStage) {
           playSomeSound();
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
              
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
private void playMedia(Media m){
    if (m != null){
        MediaPlayer mp = new MediaPlayer(m);
        mp.play();
    }
}

public void playSomeSound(){
    try{
        Media someSound = new Media(getClass().getResource("welcomemsg.mp3").toString());
        playMedia(someSound);
    }catch(Exception ex){
       JOptionPane.showMessageDialog(null, ex);
    }

}
    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
       
    }
}
