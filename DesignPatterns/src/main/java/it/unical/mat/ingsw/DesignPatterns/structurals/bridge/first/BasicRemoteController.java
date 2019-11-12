package it.unical.mat.ingsw.DesignPatterns.structurals.bridge.first;

public class BasicRemoteController implements RemoteController {
	protected Device device;

	public BasicRemoteController() {
	}

	public BasicRemoteController(Device device) {
		this.device = device;
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