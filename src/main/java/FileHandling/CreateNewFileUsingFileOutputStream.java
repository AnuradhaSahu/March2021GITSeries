package FileHandling;

import java.io.FileOutputStream;
import java.util.Scanner;

public class CreateNewFileUsingFileOutputStream {

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter the file name with location path: ");
			String fileName = sc.nextLine();

			FileOutputStream fos = new FileOutputStream(fileName, true);

			System.out.println("Enter the file content: ");
			String content = sc.nextLine();
			byte b[] = content.getBytes();
			fos.write(b);
			fos.close();
			System.out.println("File is saved on the given location path");

		} catch (Exception e) {
			System.out.println("Some exception is coming....");
			e.printStackTrace();
		}
}
}
