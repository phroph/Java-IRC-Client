package com.minimalcomputer.irc;

import java.net.URI;
import java.util.LinkedList;
import java.util.List;

public class IrcClientSettings {

	String server;
	int port;
	String nick;
	String quitMessage;
	List<String> channelList = new LinkedList<String>();
	boolean autoJoin;
	
	public IrcClientSettings(String server, int port, String nick) {
		this.server = server;
		this.port = port;
		this.nick = nick;
	}
	
	/**
	 * Note: sets autoJoin to try by default.
	 * @param channelList
	 */
	public void setAutoJoinChannels(List<String> channelList) {
		this.channelList.addAll(channelList);
		this.autoJoin = true;
	}
	
	/**
	 * Undoes the secondary side-effect of setAutoJoinChannels
	 */
	public void disableAutoJoin() {
		this.autoJoin = false;
	}
}
