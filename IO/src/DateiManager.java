import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DateiManager {

	public static void main(String[] args) {
		/*
		 * File datei = new
		 * File("C:\\Users\\Teilnehmer\\eclipse-workspace\\PanzerHQ\\IO\\datei.txt");
		 * try { Scanner scanner = new Scanner(datei);
		 * 
		 * while (scanner.hasNextLine()) { String line = scanner.nextLine();
		 * System.out.println(line + line.length());
		 * 
		 * } scanner.close(); } catch (FileNotFoundException e) { e.printStackTrace(); }
		 * }
		 */

		
		
		try {
			File datei2 = new File("C:\\Users\\Teilnehmer\\eclipse-workspace\\PanzerHQ\\IO\\datei2.txt");
			datei2.delete();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
