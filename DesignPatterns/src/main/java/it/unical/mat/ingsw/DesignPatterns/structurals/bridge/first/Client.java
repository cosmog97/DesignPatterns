package it.unical.mat.ingsw.DesignPatterns.structurals.bridge.first;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Client extends Application {

	private Device tv;

	private Device radio;

	private RemoteController remoteControllerBasic;

	private RemoteController remoteControllerAdvanced;

	@Override
	public void start(Stage primaryStage) throws Exception {

		tv = new TV();
		radio = new Radio();
		remoteControllerBasic = new BasicRemoteController(radio);
		remoteControllerAdvanced = new AdvancedRemoteController(tv);

		Group root = new Group();

		final Scene scene = new Scene(root, 600, 600);
		Canvas canvas = new Canvas(scene.getWidth(), scene.getHeight());
		GraphicsContext context = canvas.getGraphicsContext2D();
		root.getChildren().add(canvas);
		primaryStage.setTitle("RemoteControllers");
		context.drawImage(new Image(
				"file:///C:/Users/cosmo/git/DesignPatterns/DesignPatterns/src/main/java/it/unical/mat/ingsw/DesignPatterns/structurals/bridge/first/res/tv.png"),
				330, 45);
		context.drawImage(new Image(
				"file:///C:/Users/cosmo/git/DesignPatterns/DesignPatterns/src/main/java/it/unical/mat/ingsw/DesignPatterns/structurals/bridge/first/res/radio.png"),
				80, 20);
		context.drawImage(new Image(
				"file:///C:/Users/cosmo/git/DesignPatterns/DesignPatterns/src/main/java/it/unical/mat/ingsw/DesignPatterns/structurals/bridge/first/res/1.png"),
				100, 250);
		context.drawImage(new Image(
				"file:///C:/Users/cosmo/git/DesignPatterns/DesignPatterns/src/main/java/it/unical/mat/ingsw/DesignPatterns/structurals/bridge/first/res/2.png"),
				350, 250);
		RemoteManagement rm = new RemoteManagement(root, tv, radio, remoteControllerBasic, remoteControllerAdvanced);
		context.setTextAlign(TextAlignment.LEFT);
		context.setFill(Color.GREENYELLOW);
		new AnimationTimer() {
			@Override
			public void handle(long now) {
				context.fillText("CHANNEL : " + Integer.toString(tv.getChannel()), 350, 130);
				context.fillText("CHANNEL : " + String.valueOf(radio.getChannel()), 150, 150);
				context.fillText("VOLUME: " + String.valueOf(tv.getVolume()), 350, 150);
				context.fillText("VOLUME : " + String.valueOf(radio.getVolume()), 150, 180);
			}

		}.start();

		primaryStage.setResizable(false);
		primaryStage.centerOnScreen();
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String args[]) {
		launch(args);
	}
}
