package com.simplilearn.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Select the operation from below which you want to do.");
		System.out.println("1. Read the file.");
		System.out.println("2. Write into the file.");
		System.out.println("3. Append into the file.");
		
		int ch = sc.nextInt();
		switch(ch)
		{
		case 1: readData(); break;
		case 2: writeData(); break;
		case 3: appendData(); break;
		default : System.out.println("Please select valid number.");
		}
	}

	public static void readData() throws IOException {

		FileReader fr = new FileReader("ReadFromHere.txt");
		int i;
			while((i = fr.read())!= -1)
			{
				System.out.print((char)i);
			}	
	}
	
	public static void writeData() throws IOException {
		
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Please enter the text which you want to save into the file.");
			String message = sc.nextLine();
			FileWriter writer = new FileWriter("WriteIntoFile.txt");
			writer.write(message);
			writer.close();
			System.out.println("Your text saved successfully into the file.");
		}
	}
	
	public static void appendData() throws IOException {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Please enter the text which you want to add into the existing text.");
			String message = sc.nextLine();
			FileWriter writer = new FileWriter("AppendHere.txt", true);
			writer.write(message);
			System.out.println("Your text added successfully into the file.");
			writer.close();
		}
	}
	
}
