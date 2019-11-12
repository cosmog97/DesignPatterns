package it.unical.mat.ingsw.DesignPatterns.structurals.bridge.first;

import javafx.scene.Group;
import javafx.scene.control.Button;

public class AdvancedRemoteController extends BasicRemoteController {

	public AdvancedRemoteController(Device device, Group group) {
		super.device = device;

		Button volumepiuadvanced = new Button();
		Button volumemenoadvanced = new Button();
		Button canalepiuadvanced = new Button();
		Button canalemenoadvanced = new Button();
		Button onoffadvanced = new Button();
		Button muteadvanced = new Button();

		volumepiuadvanced.setText("Volume +");
		volumepiuadvanced.setLayoutX(112 + 250);
		volumepiuadvanced.setLayoutY(325);
		volumepiuadvanced.setOnMouseClicked(e -> {
			volumeUp();
		});

		volumemenoadvanced.setText("Volume -");
		volumemenoadvanced.setLayoutX(182 + 250);
		volumemenoadvanced.setLayoutY(325);
		volumemenoadvanced.setOnMouseClicked(e -> {
			volumeDown();
		});

		canalepiuadvanced.setText("Canale +");
		canalepiuadvanced.setLayoutX(115 + 250);
		canalepiuadvanced.setLayoutY(375);
		canalepiuadvanced.setOnMouseClicked(e -> {
			channelUp();
		});

		canalemenoadvanced.setText("Canale -");
		canalemenoadvanced.setLayoutX(185 + 250);
		canalemenoadvanced.setLayoutY(375);
		canalemenoadvanced.setOnMouseClicked(e -> {
			channelDown();
		});

		onoffadvanced.setText("ON/OFF");
		onoffadvanced.setLayoutX(152 + 250);
		onoffadvanced.setLayoutY(425);
		onoffadvanced.setOnMouseClicked(e -> {
			power();
		});

		muteadvanced.setText("Muto");
		muteadvanced.setLayoutX(160 + 250);
		muteadvanced.setLayoutY(475);
		muteadvanced.setOnMouseClicked(e -> {
			mute();
		});

		group.getChildren().addAll(volumepiuadvanced, volumemenoadvanced, canalepiuadvanced, canalemenoadvanced,
				onoffadvanced, muteadvanced);

	}

	public void mute() {
		System.out.println("Remote: mute");
		device.setVolume(0);
	}

	@Override
	public void volumeDown() {
		System.out.println("Remote: volume down");
		device.setVolume(device.getVolume() - 1);
	}

	@Override
	public void volumeUp() {
		System.out.println("Remote: volume up");
		device.setVolume(device.getVolume() + 1);
	}

	@Override
	public void channelUp() {
		System.out.println("Remote: channel up");
		if (device.getChannel() < 100) {
			device.setChannel(device.getChannel() + 1);
		}
	}

}