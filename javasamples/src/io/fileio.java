package io;

import java.io.IOException;

public class fileio {
	public static void main(String[] args) {
		
		System.out.println("Output stream");
		System.err.println("Error message");
		int x='4';
		System.out.println(x);
		try {
			int i= System.in.read();
			System.out.println((char)i);
		} catch (IOException e) {
			System.err.println("IOException occured while reading user inpur");
			e.printStackTrace();
		}
		
	}
}
