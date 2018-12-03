package MailShooter;

import java.net.*;
import java.io.*;
import java.util.*;

public class sendMail {
	private String ip;
	private int port;
	private String str;
	BufferedReader file;

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		new sendMail("192.168.30.164",25);
		
	}
	
	public sendMail(String ip, int port) throws IOException{
		this.ip = ip;
		this.port = port;
		Socket tcpSocket = getSocket();
		
		OutputStream os_socket = tcpSocket.getOutputStream();
		InputStream is_socket = tcpSocket.getInputStream();
		
		BufferedWriter bufferW = new BufferedWriter(new OutputStreamWriter(os_socket));
		BufferedReader bufferR = new BufferedReader(new InputStreamReader(is_socket));
		
		System.out.print("입력 : ");
		file = new BufferedReader(new InputStreamReader(System.in));
		str = file.readLine();
		str += System.getProperty("Line.separator");
		bufferW.write(str);
		bufferW.flush();
		
		str = bufferR.readLine();
		System.out.println("Echo Result : " + str);
		
		file.close();
		bufferW.close();
		bufferR.close();
		tcpSocket.close();
	}
	
	public Socket getSocket() {
		Socket tcpSocket = null;
		try {
			tcpSocket = new Socket(ip, port);
		} catch (IOException ioe) {
			ioe.printStackTrace();
			System.exit(0);		}
		return tcpSocket;
	}


	
}
