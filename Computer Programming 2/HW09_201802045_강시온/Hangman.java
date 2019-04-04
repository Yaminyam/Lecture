import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Hangman {

	public static void main(String[] args) throws IOException {

		BufferedReader inputStream = null;
		PrintWriter outputStream = null;
		Random random = new Random();
		Scanner input = new Scanner(System.in);

		try {
			inputStream = new BufferedReader(new FileReader("input.txt"));
			outputStream = new PrintWriter(new FileWriter("output.txt"));
			String out = "";
			String l = null;
			int randnum = random.nextInt(8);
			for (int i = 0; i < randnum + 1; i++) {
				l = inputStream.readLine();
			}
			outputStream.println(l);
			System.out.println("��� ����!");
			int trynum = l.length()*2;
			System.out.println("���� Ƚ���� " + trynum +  "���Դϴ�.");
			for(int i=0;i<l.length();i++) {
				out += "_ ";
			}
			while(trynum-- != 0) {
				System.out.println("���� ����: " + out);
				if(!out.contains("_"))break;
				System.out.print("���ڸ� �Է����ּ���(�ѱ���): ");
				char a = input.next().charAt(0);
				for(int i=0;i<l.length();i++) {
					if(l.charAt(i) == a) {
						char[] temp = out.toCharArray();
						temp[i*2] = a;
						out = String.valueOf(temp);
					}
				}
			}
			if(!out.contains("_")) {
				System.out.println("������ ������ϴ�.");
			}
			else {
				System.out.println("������ ������ ���߽��ϴ�.");
				System.out.println("����: " + l);
			}
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
			if (outputStream != null) {
				outputStream.close();
			}
		}

	}
}
