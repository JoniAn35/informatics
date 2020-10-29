package uti;

import java.util.Scanner;

public class testTV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tv = new TV();
		Scanner sc = new Scanner(System.in);
		
		int channel = sc.nextInt();
		int volume = sc.nextInt();
		
		tv.turnOn();
		tv.setChannel(channel);
		tv.setVolume(volume);
		
		tv.channelDown();
		System.out.println("The new channel is " + tv.channel);
		
		tv.volumelUp();
		System.out.println("The new volume is " + tv.volumeLevel);
		
		tv.turnOff();
		tv.channelUp();
	}

}
