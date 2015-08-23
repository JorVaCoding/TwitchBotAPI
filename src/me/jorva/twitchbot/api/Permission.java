package me.jorva.twitchbot.api;

public enum Permission {
	ALL(0,"ALL"), REG(1,"REGULAR"), MOD(2,"MODERATOR"), BROADCASTER(3,"BROADCASTER"), OWNER(4,"OWNER");

	public int value;
	public String name;

	private Permission(int value, String name) {
		this.value = value;
		this.name = name;
	}

	public int getValue() {
		return value;
	}
	
	public String getName() {
		return name;
	}
}
