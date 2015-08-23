package me.jorva.twitchbot.api;

public abstract class Command {
	public String name;
	public Permission perm;
	
	public Command(String name, Permission p){
		this.name = name;
		perm = p;
	}
	
	public String getName(){
		return name;
	}
	
	public Permission getPerm(){
		return perm;
	}
	
	public abstract void execute(String sender, String[] args);		
}
