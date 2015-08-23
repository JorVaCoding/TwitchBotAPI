package me.jorva.twitchbot.api;

public abstract class ChatManager {
	
	public String name;
	
	public ChatManager(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public abstract void onUserTalk(String user, String msg, Permission permission);		
}
