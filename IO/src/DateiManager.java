import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

public class DateiManager {

	public static void main(String[] args) {
		
		FileStorage ss = new FileStorage(new File());
		
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
		 * 
		 * 
		 * 
		 * 
		 * try { File datei2 = new
		 * File("C:\\Users\\Teilnehmer\\eclipse-workspace\\PanzerHQ\\IO\\datei2.txt");
		 * datei2.delete(); } catch (Exception e) { e.printStackTrace(); }
		 */

		// MiniDatenbank db = new MiniDatenbank("Julian", 42);

		try {
			File datei2 = new File("C:\\Users\\Teilnehmer\\eclipse-workspace\\PanzerHQ\\IO\\Datenbank.dat");
			/*
			 * datei2.createNewFile(); ObjectOutputStream oos = new ObjectOutputStream(new
			 * FileOutputStream(datei2)); oos.writeObject(db); oos.flush(); oos.close();
			 */

			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(datei2));
			Object rawObject = ois.readObject();
			ois.close();
			if (rawObject instanceof MiniDatenbank) {
				MiniDatenbank geleseneDB = (MiniDatenbank) rawObject;
				System.out.println(geleseneDB.getName());
				System.out.println(geleseneDB.getKinder());
			}else {
				System.err.println("In der Datei war keine Minidatenbank!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
