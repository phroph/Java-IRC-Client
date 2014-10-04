package com.minimalcomputer.irc;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Queue;

public class IrcClient {

	IrcClientSettings settings;
	ActionListener listener;
	Queue unreadMessages;
	List messageHistory;
	
	private Socket socket;
	private BufferedReader streamReader;
	private DataOutputStream outputStream;
	
	
	public IrcClient(IrcClientSettings settings) {
		this.settings = settings;
	}
	
	public void connect() {
		try {
			socket = new Socket(settings.server,settings.port);
		    streamReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public  void connect(ActionListener listen) {
		
	}
	
	public void writeCommand(IrcCommand command) {
		
	}
	
	public IrcCommand readCommand() {
		//push command onto history
		//return command
		return null;
	}
	
	public void disconnect() {
		try {
			if(!socket.isClosed()){
				socket.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
