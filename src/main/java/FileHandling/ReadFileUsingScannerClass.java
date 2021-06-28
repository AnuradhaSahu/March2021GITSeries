package FileHandling;

import java.io.File;
import java.util.Scanner;

public class ReadFileUsingScannerClass {

	public static void main(String[] args) {
		String Path="C:\\Users\\rakes\\Desktop\\Anu_Docs\\Sample\\anu.txt";
		Scanner sc=null;
		try {
			File file = new File(Path);
			sc = new Scanner(file);
			System.out.println("File content is:");

			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}

		}

		catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			sc.close();
		}
	}

}
