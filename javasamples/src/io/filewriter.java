package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class filewriter {
	private static final String filepath = "C:\\Users\\nnaradasu\\eclipse-workspace\\out\\testout.txt";
	public static void main(String[] args) {
		//filewriter1();
		//filereader1();
		//bufferedwriter();
		bufferedreader(); //not implemented
		//printwriter();
		//appendDataToFile();
	}
	private static void appendDataToFile() {
		try {
			FileWriter fw=new FileWriter(filepath,true);
			BufferedWriter bw=new BufferedWriter(fw);
			PrintWriter p=new PrintWriter(bw);
			p.println("Appending these lines");
			p.close();
			bw.close();
			fw.close();
			System.out.println("done");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	private static void printwriter() {
		try {
			FileWriter fw=new FileWriter(filepath);
			BufferedWriter bw=new BufferedWriter(fw);
			PrintWriter p=new PrintWriter(bw);
			p.println("new line printed from printwriter");
			bw.close();
			p.close();
			System.out.println("done");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
	private static void bufferedreader() {
		try {
			FileReader fos=new FileReader(filepath);
			BufferedReader bos=new BufferedReader(fos);
			int i;
			while( (i= bos.read()) != -1) {
				System.out.println((char)i);
			}
			bos.close();
			fos.close();
			System.out.println("End");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	private static void bufferedwriter() {
		try {
			FileWriter fw=new FileWriter(filepath);
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write("sample using buffered writer");
			bw.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	private static void filereader1() {
		try {
			FileReader fr=new FileReader(filepath);
			int i=0;
			while( (i=fr.read()) != -1) {
				System.out.println((char)i);
			
			}
			fr.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	private static void filewriter1() {
		try {
			FileWriter f=new FileWriter(filepath);
			f.write("Hello using filewriter");
			f.close();
			System.out.println("End");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
