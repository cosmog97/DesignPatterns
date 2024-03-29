package it.unical.mat.ingsw.DesignPatterns.structurals.bridge.ui;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Client extends Application {

	// remoteController = astrazione, Device = implementazione
	private Device tv;
	private Device radio;
	private RemoteController remoteControllerBasic;
	private RemoteController remoteControllerAdvanced;

	@Override
	public void start(Stage primaryStage) throws Exception {

		Group root = new Group();
		final Scene scene = new Scene(root, 600, 600);
		Canvas canvas = new Canvas(scene.getWidth(), scene.getHeight());
		GraphicsContext context = canvas.getGraphicsContext2D();
		root.getChildren().add(canvas);
		primaryStage.setTitle("RemoteControllers");
		context.drawImage(new Image(
				"file:///C:/Users/cosmo/git/DesignPatterns/DesignPatterns/src/main/java/it/unical/mat/ingsw/DesignPatterns/structurals/bridge/ui/resources/sfondo.png"),
				0, 0);
		context.drawImage(new Image(
				"file:///C:/Users/cosmo/git/DesignPatterns/DesignPatterns/src/main/java/it/unical/mat/ingsw/DesignPatterns/structurals/bridge/ui/resources/tv.png"),
				330, 45);
		context.drawImage(new Image(
				"file:///C:/Users/cosmo/git/DesignPatterns/DesignPatterns/src/main/java/it/unical/mat/ingsw/DesignPatterns/structurals/bridge/ui/resources/radio.png"),
				80, 20);
		context.drawImage(new Image(
				"file:///C:/Users/cosmo/git/DesignPatterns/DesignPatterns/src/main/java/it/unical/mat/ingsw/DesignPatterns/structurals/bridge/ui/resources/1.png"),
				100, 250);
		context.drawImage(new Image(
				"file:///C:/Users/cosmo/git/DesignPatterns/DesignPatterns/src/main/java/it/unical/mat/ingsw/DesignPatterns/structurals/bridge/ui/resources/2.png"),
				350, 250);

		tv = new TV(root);
		radio = new Radio(root);
		remoteControllerBasic = new BasicRemoteController(tv, root);
		remoteControllerAdvanced = new AdvancedRemoteController(tv, root);

		primaryStage.setResizable(false);
		primaryStage.centerOnScreen();
		primaryStage.show();
		primaryStage.setScene(scene);
	}

	public static void main(String args[]) {
		launch(args);
	}
}
