package com.aurionpro.test;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling {
	public static void main(String[] args) {
		BufferedReader reader = null;
		int charCount = 0;
		int wordCount = 0;
		int lineCount = 0;

		try {
			reader = new BufferedReader(new FileReader("D:\\Aurionpro Java\\Core Java\\Assignment-File-Handling\\src\\com\\aurionpro\\serialize\\test.txt"));
			String currentLine = reader.readLine();

			while (currentLine != null) {
				lineCount++;
				String[] words = currentLine.split(" ");
				wordCount += words.length;
				for (String word : words) {
					charCount += word.length();
				}
				currentLine = reader.readLine();
			}

			System.out.println("Number Of Characters In A File : " + charCount);
			System.out.println("Number Of Words In A File : " + wordCount);
			System.out.println("Number Of Lines In A File : " + lineCount);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

