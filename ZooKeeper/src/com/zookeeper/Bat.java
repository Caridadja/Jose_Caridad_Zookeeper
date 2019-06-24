package com.zookeeper;

public class Bat extends Mammal {
	public Bat() {
		this.energyLevel = 300;
	}
	public Bat fly() {
		System.out.println("Brrrr. The bat is flying and lost 50 energy");
		this.energyLevel -= 50;
		return this;
	}
	public Bat eatHumans() {
		this.energyLevel += 50;
		return this;
	}
	public Bat attackTown() {
		System.out.println("Boom! The bat is attacking a town and lost 100 energy");
		this.energyLevel -= 50;
		return this;
	}
}
