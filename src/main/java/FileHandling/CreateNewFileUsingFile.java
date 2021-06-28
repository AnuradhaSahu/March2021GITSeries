package FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateNewFileUsingFile {

	public static void main(String[] args) {
/*3Ways to create a new file
 * 1.using File
 * 2.using FileOutput Stream
 * 3.Java Nios Package
 * 
 */
		String Path="C:\\Users\\rakes\\Desktop\\Anu_Docs\\Sample.txt";
		
		File file=new File(Path);
		try {
			boolean flag=file.createNewFile();
			if(flag) {
				System.out.println("New file created");
			}else {
				System.out.println("File already present");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
