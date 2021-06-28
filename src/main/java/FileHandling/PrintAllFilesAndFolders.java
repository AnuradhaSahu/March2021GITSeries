package FileHandling;

import java.io.File;
import java.util.Arrays;

public class PrintAllFilesAndFolders {

	public static void main(String[] args) {

		String Path="C:\\Users\\rakes\\Desktop\\Anu_Docs";
		File file=new File(Path);
		File Directory[]=file.listFiles();
		Arrays.sort(Directory);

		for(File e:Directory) {
			
			if (e.isFile()) {
				System.out.println("File : " + e.getName() + " " + e.getAbsolutePath());
			} else if (e.isDirectory()) {
				System.out.println("Directory: " + e.getName() + " " + e.getAbsolutePath());
			} else {
				System.out.println("Not Known :" + e.getName() + " " + e.getAbsolutePath());
			}
		}
		
	}

}
