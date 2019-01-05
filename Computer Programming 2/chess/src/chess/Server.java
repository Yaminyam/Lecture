package chess;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	private ServerSocket serverSocket;
	private Socket clientSocket;
	private DataInputStream dataInputStream;
	private DataOutputStream dataOutputStream;

	// 1. �����͸� ��� ���� ������
	// 2. �����͸� ��� ���� ������

	public void serverSetting() {
		try {
			// localhost, 10002
			System.out.println("���� ������...");
			serverSocket = new ServerSocket(10002); // ���ε�
			System.out.println("���� �����...");
			clientSocket = serverSocket.accept(); // ���Ʈ.
			System.out.println("Ŭ���̾�Ʈ ���� �Ϸ�!");
			// ������ ���� �Ϸ� �� �κ�
		} catch (Exception e) {
		}
	}

	public void closeAll() {
		try {
			serverSocket.close();
			clientSocket.close();
			dataInputStream.close();
			dataOutputStream.close();
			System.out.println("Ŭ���̾�Ʈ���� ������ ���������ϴ�.");
		} catch (Exception e) {
		}
	}

	public void streamSetting() {
		try {
			dataInputStream = new DataInputStream(clientSocket.getInputStream());
			dataOutputStream = new DataOutputStream(clientSocket.getOutputStream());
		} catch (Exception e) {
		}
	}

	public void dataRecv() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					while (true) {
						String recvData = dataInputStream.readUTF();
						try (BufferedWriter bw = new BufferedWriter(new FileWriter("windata.txt"))) {
							bw.write(recvData);
						} catch (IOException e) {
						}
					}
				} catch (Exception e) {
				}
				closeAll();
				Thread.interrupted();
			}
		}).start();
	}

	public void dataSend() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					while (true) {
						String sendData = "";
						try (BufferedReader br = new BufferedReader(new FileReader("windata.txt"))) {
							String l;
							while ((l = br.readLine()) != null)
								sendData += (l + "\r\n");
						} catch (IOException e) {
						}
						dataOutputStream.writeUTF(sendData);
					}
				} catch (Exception e) {
				}
				closeAll();
				Thread.interrupted();
			}
		}).start();
	}

	public Server() {
		serverSetting();
		streamSetting();
		dataSend();
		dataRecv();
	}

	public static void main(String[] args) {
		new Server();
	}
}