package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileUsingFileInputStream {

	public static void main(String[] args) {

		String Path="C:\\Users\\rakes\\Desktop\\Anu_Docs\\Sample\\anu.txt";
		FileInputStream fis=null;
		try {
		File file=new File(Path);
		 fis=new FileInputStream(file);
		int c=0;
		while((c=fis.read()) !=-1) {
			System.out.print((char)c);
		}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
