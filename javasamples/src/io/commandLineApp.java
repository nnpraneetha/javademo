package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class commandLineApp {
	
	public static void main(String[] args) {
		String filepath = "C:\\Users\\nnaradasu\\eclipse-workspace\\out\\testout.txt";
		String m=getUserInput();
		writeToFile(filepath,m);
	}

	private static void writeToFile(String filepath,String m) {
		try {
			FileWriter fw=new FileWriter(filepath,true);
			BufferedWriter bw=new BufferedWriter(fw);
			PrintWriter p=new PrintWriter(bw);
			p.println(m);
			p.close();
			bw.close();
			fw.close();
			System.out.println("done");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

	private static String getUserInput() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name:");
		String name=sc.nextLine();
		String msg= "Greetings!!.. Hello "+name+" !! Welcome..";
		sc.close();
		return msg;
	}
}
