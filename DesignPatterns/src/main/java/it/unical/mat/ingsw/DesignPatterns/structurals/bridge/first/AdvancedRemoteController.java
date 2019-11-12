package it.unical.mat.ingsw.DesignPatterns.structurals.bridge.first;

public class AdvancedRemoteController extends BasicRemoteController implements RemoteController {

	public AdvancedRemoteController(Device device) {
		super.device = device;
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