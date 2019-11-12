package it.unical.mat.ingsw.DesignPatterns.structurals.bridge.first;

import javafx.animation.AnimationTimer;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class Radio implements Device {
	private boolean on = false;
	private int volume = 30;
	private int channel = 1;

	public Radio(Group group) {
		Text devicechannel = new Text();
		Text devicevolume = new Text();
		devicechannel.setFill(Color.GREENYELLOW);
		devicechannel.setX(120);
		devicechannel.setY(162);

		devicevolume.setFill(Color.GREENYELLOW);
		devicevolume.setX(120);
		devicevolume.setY(177);

		group.getChildren().addAll(devicechannel, devicevolume);

		new AnimationTimer() {
			@Override
			public void handle(long now) {
				if (on) {
					devicechannel.setText("CHANNEL : " + Integer.toString(getChannel()));
					devicevolume.setText("VOLUME: " + Integer.toString(getVolume()));
				} else {
					devicechannel.setText("");
					devicevolume.setText("");
				}

			}

		}.start();
	}

	@Override
	public boolean isEnabled() {
		return on;
	}

	@Override
	public void enable() {
		on = true;
	}

	@Override
	public void disable() {
		on = false;
	}

	@Override
	public int getVolume() {
		return volume;
	}

	@Override
	public void setVolume(int volume) {
		if (isEnabled()) {
			if (volume > 100) {
				this.volume = 100;
			} else if (volume < 0) {
				this.volume = 0;
			} else {
				this.volume = volume;
			}
		}
	}

	@Override
	public int getChannel() {
		return channel;
	}

	@Override
	public void setChannel(int channel) {
		if (isEnabled()) {
			this.channel = channel;
		}
	}

}
