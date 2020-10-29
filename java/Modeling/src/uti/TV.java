package uti;

public class TV {
	int channel = 0;
	int volumeLevel = 0;
	boolean on = false;
	
	public TV() {	
	}
	
	public void turnOn() {
		on = true;
	}
	
	public void turnOff() {
		on = false;
	}
	
	public void setChannel(int newChannel) {
		if (on) {
			if (newChannel > 0 && newChannel < 121) {
				channel = newChannel;
			}
			else {
				System.out.println("Invalid channel.");
			}
		}
		else {
			System.out.println("The TV if off. Turn on the TV.");
		}
	}
	
	public void setVolume(int newVolumeLevel) {
		if (on) {
			if (newVolumeLevel > 0 && newVolumeLevel < 8) {
				volumeLevel = newVolumeLevel;
			}
			else {
				System.out.println("Invalid volume.");
			}
		}
		else {
			System.out.println("The TV if off. Turn on the TV.");
		}
	}
	
	public void channelUp() {
		if (on) {
			if (channel == 120) {
				channel = 1;
			}
			else {
				channel++;
			}
		}
		else {
			System.out.println("The TV if off. Turn on the TV.");
		}
	}
	
	public void channelDown() {
		if (on) {
			if (channel == 1) {
				channel = 120;
			}
			else {
				channel--;
			}
		}
		else {
			System.out.println("The TV if off. Turn on the TV.");
		}
	}
	
	public void volumelUp() {
		if (on) {
			if (volumeLevel == 7) {
				System.out.println("The TV is already on its maximum.");
			}
			else {
				volumeLevel++;
			}
		}
		else {
			System.out.println("The TV if off. Turn on the TV.");
		}
	}
	
	public void volumelDown() {
		if (on) {
			if (volumeLevel == 1) {
				System.out.println("The TV is already on its minimum.");
			}
			else {
				volumeLevel--;
			}
		}
		else {
			System.out.println("The TV if off. Turn on the TV.");
		}
	}
	
}
