package FileHandling;

import java.awt.Desktop;
import java.io.File;

public class OpenFileUsingDesktop {

	public static void main(String[] args) {

		String Path="C:\\Users\\rakes\\Desktop\\Anu_Docs\\Sample\\anu.txt";
		 try {
			 File file=new File(Path);
			 if(!Desktop.isDesktopSupported()) {
				 System.out.println("Desktop not supported");
				 return;
			 }
			 Desktop desktop=Desktop.getDesktop();
			 if(file.exists()) {
				 desktop.open(file);
			 }
			 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
			
	}

}
