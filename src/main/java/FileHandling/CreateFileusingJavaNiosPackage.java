package FileHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFileusingJavaNiosPackage {

	public static void main(String[] args) {

		try {
		Path pathlocation=Paths.get("C:\\Users\\rakes\\Desktop\\Anu_Docs\\Sample\\newfile.txt");
		
			Path newPath=Files.createFile(pathlocation);
			System.out.println("New file created at location "+newPath );
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
