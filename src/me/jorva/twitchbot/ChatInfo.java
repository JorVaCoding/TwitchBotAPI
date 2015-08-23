package me.jorva.twitchbot;

import java.util.HashSet;
import java.util.Set;

import me.jorva.twitchbot.api.ChatManager;
import me.jorva.twitchbot.api.Command;

public final class ChatInfo {
	public static Set<Command> COMMANDS = new HashSet<Command>();
	public static Set<ChatManager> CHATMANAGERS = new HashSet<ChatManager>();
	
	public static String CHANNEL , USERNAME , OAUTH;
	public static Chat bot;
	
	public static boolean showMSG = false;
}
