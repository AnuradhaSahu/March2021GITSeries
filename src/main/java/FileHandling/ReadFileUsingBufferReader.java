package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileUsingBufferReader {

	public static void main(String[] args) {

		String Path="C:\\Users\\rakes\\Desktop\\Anu_Docs\\Sample\\anu.txt";
		BufferedReader br=null;
		try {
			File file=new File(Path);
			br=new BufferedReader(new FileReader(file));
			System.out.println("The file content is ");
			int c=0;
			while((c=br.read())!=-1) {
				System.out.print((char)c);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
