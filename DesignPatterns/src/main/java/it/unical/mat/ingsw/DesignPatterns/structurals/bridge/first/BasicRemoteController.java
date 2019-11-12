package it.unical.mat.ingsw.DesignPatterns.structurals.bridge.first;

import javafx.animation.AnimationTimer;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class BasicRemoteController implements RemoteController {
	protected Device device;

	public BasicRemoteController() {
	}

	public BasicRemoteController(Device device, Group group) {
		this.device = device;

		Text devicechannel = new Text();
		Text devicevolume = new Text();
		Button volumepiubasic = new Button();
		Button volumemenobasic = new Button();
		Button canalepiubasic = new Button();
		Button canalemenobasic = new Button();
		Button onoffbasic = new Button();

		devicechannel.setFill(Color.GREENYELLOW);
		devicechannel.setX(120);
		devicechannel.setY(162);

		devicevolume.setFill(Color.GREENYELLOW);
		devicevolume.setX(120);
		devicevolume.setY(177);

		volumepiubasic.setText("Volume +");
		volumepiubasic.setLayoutX(112);
		volumepiubasic.setLayoutY(350);
		volumepiubasic.setOnMouseClicked(e -> {
			volumeUp();
		});

		volumemenobasic.setText("Volume -");
		volumemenobasic.setLayoutX(182);
		volumemenobasic.setLayoutY(350);
		volumemenobasic.setOnMouseClicked(e -> {
			volumeDown();
		});

		canalepiubasic.setText("Canale +");
		canalepiubasic.setLayoutX(115);
		canalepiubasic.setLayoutY(400);
		canalepiubasic.setOnMouseClicked(e -> {
			channelUp();
		});

		canalemenobasic.setText("Canale -");
		canalemenobasic.setLayoutX(185);
		canalemenobasic.setLayoutY(400);
		canalemenobasic.setOnMouseClicked(e -> {
			channelDown();
		});

		onoffbasic.setText("ON/OFF");
		onoffbasic.setLayoutX(152);
		onoffbasic.setLayoutY(450);
		onoffbasic.setOnMouseClicked(e -> {
			power();
		});

		group.getChildren().addAll(volumepiubasic, volumemenobasic, canalepiubasic, canalemenobasic, onoffbasic);

		group.getChildren().addAll(devicechannel, devicevolume);

		new AnimationTimer() {
			@Override
			public void handle(long now) {
				if (getPower()) {
					devicechannel.setText("CHANNEL : " + Integer.toString(device.getChannel()));
					devicevolume.setText("VOLUME: " + Integer.toString(device.getVolume()));
				} else {
					devicechannel.setText("");
					devicevolume.setText("");
				}

			}

		}.start();

	}

	@Override
	public void power() {
		System.out.println("Remote: power toggle");
		if (device.isEnabled()) {
			System.out.println("Poweroff");
			device.disable();
		} else {
			System.out.println("Poweron");
			device.enable();
		}
	}

	@Override
	public void volumeDown() {
		System.out.println("Remote: volume down");
		device.setVolume(device.getVolume() - 10);
	}

	@Override
	public void volumeUp() {
		System.out.println("Remote: volume up");
		device.setVolume(device.getVolume() + 10);
	}

	@Override
	public void channelDown() {
		System.out.println("Remote: channel down");
		if (device.getChannel() > 0) {
			device.setChannel(device.getChannel() - 1);
		}
	}

	@Override
	public void channelUp() {
		System.out.println("Remote: channel up");
		if (device.getChannel() < 20) {
			device.setChannel(device.getChannel() + 1);
		}
	}

	@Override
	public int getVolume() {
		// TODO Auto-generated method stub
		return device.getVolume();
	}

	@Override
	public int getChannel() {
		// TODO Auto-generated method stub
		return device.getChannel();
	}

	@Override
	public boolean getPower() {
		// TODO Auto-generated method stub
		return device.isEnabled();
	}
}