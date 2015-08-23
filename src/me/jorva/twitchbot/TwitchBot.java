package me.jorva.twitchbot;

public final class TwitchBot {
	public void setName(String name) {
		ChatInfo.USERNAME = name;
	}

	public void setChannel(String channel) {
		ChatInfo.CHANNEL = channel;
	}

	public void setOAUTH(String oauth) {
		ChatInfo.OAUTH = oauth;
	}
	
	public static void start(){
		ChatInfo.bot = new Chat();
	}

}
