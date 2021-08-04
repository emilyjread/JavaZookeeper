package com.emilyread.zookeeper;

public class GiantBat extends Mammal{
	
	public GiantBat() {
		this.energy=300;
	};
	
	public void fly() {
		this.energy-=50;
		System.out.println("Whhosh, the bat takes off. It's energy is now: "+ this.energy);
	}
	
	public void eatHumans(){
		this.energy+=25;
		System.out.println("Aaaagggghhhhhhh! crunch crunch... The bat's energy is now: " + this.energy);
	}
	
	public void attackTown() {
		this.energy-=100;
		System.out.println("Oh the humanity! The town is on fire! The bat's energy is now: " + this.energy);
	}

}
