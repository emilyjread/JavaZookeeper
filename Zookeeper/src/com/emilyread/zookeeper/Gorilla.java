package com.emilyread.zookeeper;

public class Gorilla extends Mammal{
	
	 public Gorilla() {
		 
	 }
	 
	 public void throwSomething() {
		 this.energy-=5;
		 System.out.print("Threw Something! Energy is now: " + this.energy + " // ");
	 }
	 
	 public void eatBanana() {
		 this.energy+=10;
		 System.out.print("Ate Banana! Energy is now: " + this.energy + " // ");
	 }
	 
	 public void climb() {
		 this.energy-=10;
		 System.out.print("Had a climb! Energy is now: " + this.energy + " // ");
	 }

}
