package it.unical.mat.ingsw.DesignPatterns.structurals.bridge.first;

import javafx.animation.AnimationTimer;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class RemoteManagement {

	public RemoteManagement(Group group, Device tv, Device radio, BasicRemoteController remoteControllerBasic,
			AdvancedRemoteController remoteControllerAdvanced) {

		Text tvchannel = new Text();
		Text radiochannel = new Text();
		Text tvvolume = new Text();
		Text radiovolume = new Text();

		Button volumepiubasic = new Button();
		Button volumemenobasic = new Button();
		Button canalepiubasic = new Button();
		Button canalemenobasic = new Button();
		Button volumepiuadvanced = new Button();
		Button volumemenoadvanced = new Button();
		Button canalepiuadvanced = new Button();
		Button canalemenoadvanced = new Button();
		Button onoffbasic = new Button();
		Button onoffadvanced = new Button();
		Button muteadvanced = new Button();

		tvchannel.setFill(Color.GREENYELLOW);
		tvchannel.setX(350);
		tvchannel.setY(135);

		radiochannel.setFill(Color.GREENYELLOW);
		radiochannel.setX(120);
		radiochannel.setY(162);

		tvvolume.setFill(Color.GREENYELLOW);
		tvvolume.setX(350);
		tvvolume.setY(150);

		radiovolume.setFill(Color.GREENYELLOW);
		radiovolume.setX(120);
		radiovolume.setY(177);

		volumepiubasic.setText("Volume +");
		volumepiubasic.setLayoutX(112);
		volumepiubasic.setLayoutY(350);
		volumepiubasic.setOnMouseClicked(e -> {
			remoteControllerBasic.volumeUp();
		});

		volumepiuadvanced.setText("Volume +");
		volumepiuadvanced.setLayoutX(112 + 250);
		volumepiuadvanced.setLayoutY(325);
		volumepiuadvanced.setOnMouseClicked(e -> {
			remoteControllerAdvanced.volumeUp();
		});

		volumemenobasic.setText("Volume -");
		volumemenobasic.setLayoutX(182);
		volumemenobasic.setLayoutY(350);
		volumemenobasic.setOnMouseClicked(e -> {
			remoteControllerBasic.volumeDown();
		});

		volumemenoadvanced.setText("Volume -");
		volumemenoadvanced.setLayoutX(182 + 250);
		volumemenoadvanced.setLayoutY(325);
		volumemenoadvanced.setOnMouseClicked(e -> {
			remoteControllerAdvanced.volumeDown();
		});

		canalepiubasic.setText("Canale +");
		canalepiubasic.setLayoutX(115);
		canalepiubasic.setLayoutY(400);
		canalepiubasic.setOnMouseClicked(e -> {
			remoteControllerBasic.channelUp();
		});

		canalepiuadvanced.setText("Canale +");
		canalepiuadvanced.setLayoutX(115 + 250);
		canalepiuadvanced.setLayoutY(375);
		canalepiuadvanced.setOnMouseClicked(e -> {
			remoteControllerAdvanced.channelUp();
		});

		canalemenobasic.setText("Canale -");
		canalemenobasic.setLayoutX(185);
		canalemenobasic.setLayoutY(400);
		canalemenobasic.setOnMouseClicked(e -> {
			remoteControllerBasic.channelDown();
		});

		canalemenoadvanced.setText("Canale -");
		canalemenoadvanced.setLayoutX(185 + 250);
		canalemenoadvanced.setLayoutY(375);
		canalemenoadvanced.setOnMouseClicked(e -> {
			remoteControllerAdvanced.channelDown();
		});

		onoffbasic.setText("ON/OFF");
		onoffbasic.setLayoutX(152);
		onoffbasic.setLayoutY(450);
		onoffbasic.setOnMouseClicked(e -> {
			remoteControllerBasic.power();
		});

		onoffadvanced.setText("ON/OFF");
		onoffadvanced.setLayoutX(152 + 250);
		onoffadvanced.setLayoutY(425);
		onoffadvanced.setOnMouseClicked(e -> {
			remoteControllerAdvanced.power();
		});

		muteadvanced.setText("Muto");
		muteadvanced.setLayoutX(160 + 250);
		muteadvanced.setLayoutY(475);
		muteadvanced.setOnMouseClicked(e -> {
			remoteControllerAdvanced.mute();
		});

		group.getChildren().addAll(tvchannel, radiochannel, tvvolume, radiovolume);
		group.getChildren().addAll(volumepiubasic, volumemenobasic, canalepiubasic, canalemenobasic, onoffbasic);
		group.getChildren().addAll(volumepiuadvanced, volumemenoadvanced, canalepiuadvanced, canalemenoadvanced,
				onoffadvanced, muteadvanced);

		new AnimationTimer() {
			@Override
			public void handle(long now) {
				if (remoteControllerBasic.getPower()) {
					radiochannel.setText("CHANNEL : " + Integer.toString(radio.getChannel()));
					radiovolume.setText("VOLUME: " + Integer.toString(radio.getVolume()));
				} else {
					radiochannel.setText("");
					radiovolume.setText("");
				}

			}

		}.start();

		new AnimationTimer() {

			@Override
			public void handle(long now) {
				if (remoteControllerAdvanced.getPower()) {
					tvchannel.setText("CHANNEL : " + Integer.toString(tv.getChannel()));
					tvvolume.setText("VOLUME : " + Integer.toString(tv.getVolume()));
				} else {
					tvchannel.setText("");
					tvvolume.setText("");
				}

			}
		}.start();
	}
}