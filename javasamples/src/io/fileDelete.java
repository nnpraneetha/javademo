package io;

import java.io.File;

public class fileDelete {
	public static void main(String[] args) {
		String path= "C:\\Users\\nnaradasu\\eclipse-workspace\\out\\testout.txt";
		File f=new File(path);
		if(f.delete()) {
			System.out.println("File deleted succesfully");
		}
		else {
			System.out.println("file not found");
		}
	}
}
