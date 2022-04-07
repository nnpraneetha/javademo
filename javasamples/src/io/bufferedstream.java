package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class bufferedstream {
	private static final String filepath = "C:\\Users\\nnaradasu\\eclipse-workspace\\out\\testout.txt";
	
	public static void main(String[] args) {
		bufferedoutput();
	}

	private static void bufferedoutput() {
		try {
			FileOutputStream fos=new FileOutputStream(filepath);
			BufferedOutputStream bos=new BufferedOutputStream(fos);
			String s="Hello world java";
			byte[] b=s.getBytes();
			bos.write(b);
			bos.flush();
			bos.close();
			fos.close();
			System.out.println("End");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
