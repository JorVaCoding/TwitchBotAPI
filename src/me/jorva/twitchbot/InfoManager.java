package me.jorva.twitchbot;

import me.jorva.twitchbot.api.ChatManager;
import me.jorva.twitchbot.api.Command;

public class InfoManager {
	
	public static void registerCommand(Command c){
		for(Command cmds : ChatInfo.COMMANDS){
			if(cmds.getName() == c.getName())
				return;
			ChatInfo.COMMANDS.add(c);
		}
	}
	
	public static void registerManager(ChatManager manager){
		for(ChatManager mgr : ChatInfo.CHATMANAGERS){
			if(mgr.getName() == manager.getName())
				return;
			ChatInfo.CHATMANAGERS.add(manager);
		}
	}
	
	public static Command getCommandFromString(String name){
		for(Command cmd : ChatInfo.COMMANDS)
			if(cmd.getName().equalsIgnoreCase(name))
				return cmd;
		return null;
	}
	
	public static ChatManager getManagerFromString(String name){
		for(ChatManager mgr : ChatInfo.CHATMANAGERS)
			if(mgr.getName().equalsIgnoreCase(name))
				return mgr;
		return null;
	}
	
	public static void Message(String name){
		//ChatInfo.bot.msg(name);
	}
	
	public static final void setInfo(String name, String oauth, String channel, TwitchBot bot){
		ChatInfo.bot = bot;

	}
}
