package com.rcv.readdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadDataDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		b1: create an object of fileReader class
//		FileReader fr = new FileReader("D:\\workspace\\LEARN\\Java\\23-3_JavaForTester\\src\\com\\tcv\\properties\\TextData.properties");
		FileInputStream fis = new FileInputStream((System.getProperty("user.dir")+"\\src\\\\com\\\\tcv\\\\properties\\\\TextData.properties"));
		
//		b2: create an object of properties class
		Properties p = new Properties();
		
//		b3: load the file
//		p.load(fr);
		p.load(fis);
		
//		b4: use get property method to get property
		System.out.println(p.getProperty("Team"));
		System.out.println(p.getProperty("Members"));
//		System.out.println(System.getProperty("user.dir"));
	}

}
