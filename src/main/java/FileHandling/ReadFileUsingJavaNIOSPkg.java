package FileHandling;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

public class ReadFileUsingJavaNIOSPkg {

	public static void main(String[] args) {

		String Path="C:\\Users\\rakes\\Desktop\\Anu_Docs\\Sample\\anu.txt";

		try {
			List<String> li=Files.readAllLines(Paths.get(Path), StandardCharsets.UTF_8);
			Iterator<String> it =li.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}catch(Exception e){
			e.printStackTrace();			
		}
		
	}

}
