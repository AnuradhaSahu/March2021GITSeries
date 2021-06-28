package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) {
		copyaFile();
		
	}
	
	public static void copyaFile() {
		File file=new File("C:\\Users\\rakes\\Desktop\\Anu_Docs\\ANU.txt");
		
		File copyfile=new File("C:\\Users\\rakes\\Desktop\\Anu_Docs\\CopyANU.txt");
		
		FileInputStream fileinputstream=null;
		FileOutputStream fileoutputstream=null;
		
		try {
			fileinputstream=new FileInputStream(file);
			fileoutputstream=new FileOutputStream(copyfile);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			System.out.println(fileinputstream.available());
		}catch(IOException e) {
			e.printStackTrace();
		}
		int i=0;
		try {
			while((i=fileinputstream.read())!=1){
				fileoutputstream.write(i);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			if(fileinputstream!=null) {
				try {
					fileoutputstream.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
			if(fileoutputstream!=null){
				try {
				fileoutputstream.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}

	}

}
