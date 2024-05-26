package Pract;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReeadWriterFiles {
	
	
	public static void main(String arg[]) throws IOException {
		
		
		FileWriter fw  = new FileWriter(new File("D:\\Sample\\text.txt"));
		fw.write("This is my file program\n");
		fw.write("This is my second\n");
		fw.write("This is my third");
		System.out.println("Write content to file");
		fw.close();
		
		FileReader fr = new FileReader(new File("D:\\Sample\\text.txt") );
		char ch[] = new char[100];
		
		fr.read(ch);
		String s = new String(ch);
		int l = s.length();
		ch = new char[l];
		System.out.println("Content of file  " + s);
		fr.close();
		
	}

}
