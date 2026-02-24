package com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		
//		File file = new File("C:\\Program Files");
////		System.out.println(file.exists());  //Here directory is not created  false
////		
////		file.mkdir();                       //It will create the directory   true
////		System.out.println(file.exists());
//		
//		System.out.println(file.isDirectory()); // It is used to check the value which is provided as argument is Directory or not.
//		
//		System.out.println(file.isFile());      // It is used to check the value which is provided as argument is File or not.
//		
//		String[] listofFileorFolder = file.list(); //It is used to list out all the directories and files which are in specified path. 
//		int count=0;
//		for(String fileor: listofFileorFolder) {
//			System.out.println(fileor);
//			count++;
//		}
//		System.out.println("Total files: " + count);
		
		

		/* Create a folder in a specified path and create a file in it*/
		
//		File file1 = new File("C:\\Users\\sahil\\Desktop\\Training(CapG)\\FileHandling\\src\\IEM");
//		if (!file1.exists()) {
//            file1.mkdirs();
//        }
//		File file2 = new File(file1,"demo.txt");
//		file2.createNewFile();
		
		
		/* Write on the existing created file*/
		
		FileWriter filewr = new FileWriter("C:\\Users\\sahil\\Desktop\\Training(CapG)\\FileHandling\\src\\IEM\\demo.txt");
//		
//		filewr.write(97);
//		filewr.write("My name is Dinga");
//		char[] c = {'a','b','c'};
//		filewr.write(c);
//		
//		filewr.flush();
//		filewr.close();
//		
		
		/* It is the class which is used to read the data from the files*/
		
		
//		FileReader filereader = new FileReader("C:\\Users\\sahil\\Desktop\\Training(CapG)\\FileHandling\\src\\IEM\\demo.txt");
//		int i = filereader.read();     // read method is used to read the data in the form of char by char and return the data in int format,
//		System.out.println(i);         // if char is not existed it will return the default value -1
//		
//		while(i != -1) {
//			System.out.print((char)i);
//			i=filereader.read();
//		}
//		
//		filereader.close();
		
		
		
		/* It is another writer method got next line to write*/
		
		//buffered writer is used to store the content in buffer memory temporarily and also write the content in next line.
//		FileWriter wr = new FileWriter("C:\\Users\\sahil\\Desktop\\Training(CapG)\\FileHandling\\src\\IEM\\demo.txt",true); // true such that it previous data remains and it adds after that
//		BufferedWriter buffwr = new BufferedWriter(wr);
//		buffwr.write(100);
//		buffwr.newLine();
//		buffwr.write("My name is MOUGA");
//		buffwr.newLine();
//		char[] a = {'a','b','c'};
//		buffwr.write(a);
//		buffwr.flush();
//		buffwr.close();
		
		
		/* It is another reader method got next line to read*/
		
		
		BufferedReader buffre = new BufferedReader(new FileReader("C:\\Users\\sahil\\Desktop\\Training(CapG)\\FileHandling\\src\\IEM\\demo.txt"));
		String line = buffre.readLine();
        while (line != null) {
            System.out.println(line);
            line = buffre.readLine();
        }

        buffre.close();
        
        // PrintWriter will create and write string char doub int float etc type of data on the file in a same line or in a next line.
        PrintWriter printwr = new PrintWriter(filewr);
        printwr.println("My name is Rani");
        printwr.println('F');
        printwr.print(55);
        printwr.print(true);
        printwr.print(99.9d);
        printwr.flush();
        printwr.close();
        
	}

}
