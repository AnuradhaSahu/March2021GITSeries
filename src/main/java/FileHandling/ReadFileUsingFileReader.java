package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileUsingFileReader {

	public static void main(String[] args) {

		String Path="C:\\Users\\rakes\\Desktop\\Anu_Docs\\Sample\\anu.txt";
		FileReader fr=null;
		try {
			File file=new File(Path);
			fr=new FileReader(file);
			int n=0;
			while((n=fr.read())!=-1) {
				System.out.print((char)n);
			}			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
