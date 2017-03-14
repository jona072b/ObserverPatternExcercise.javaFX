import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

/**
 * Created by jona on 10-03-17.
 */
public class Main extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        ElectronicDevice ed1 = new ElectronicDevice();
        DiodeLight dl1 = new DiodeLight("Diode 1", ed1);
        PowerUsage pu1 = new PowerUsage("Strøm 1", ed1);


        primaryStage.setTitle("Observer Patterns");
        Stage window = primaryStage;

        Image imageOn = new Image(getClass().getResourceAsStream("Dvale.png"));
        Image imageOff = new Image(getClass().getResourceAsStream("Off.png"));
        Image imageHib = new Image(getClass().getResourceAsStream("hib.png"));
        ImageView iv = new ImageView(imageOff);
        Label power = new Label("No power usage");

        Button btnLOn = new Button("ON");
        Button btnLOff = new Button("OFF");
        Button btnLHib = new Button("Hibernate");

        VBox left = new VBox();
        left.setSpacing(100);
        left.setPadding(new Insets(15,15,15,15));
        left.getChildren().addAll(btnLOn, btnLOff,btnLHib);
        btnLOn.setOnAction(event -> {
            iv.setImage(imageOn);
            power.setText("High Power usage");
            });
        btnLOff.setOnAction(event -> {
            iv.setImage(imageOff);
            power.setText("No Power Usage");
        });
        btnLHib.setOnAction(event -> {
            iv.setImage(imageHib);
            power.setText("Low Power Usage");
        });


        VBox right = new VBox();
        right.getChildren().addAll(iv, power);
        right.setAlignment(Pos.TOP_RIGHT);
        left.setAlignment(Pos.TOP_LEFT);

        HBox box = new HBox(400);

        box.getChildren().addAll(left,right);

        Scene scene = new Scene(box, 800, 600);

        window.setScene(scene);
        window.show();
    }
}
