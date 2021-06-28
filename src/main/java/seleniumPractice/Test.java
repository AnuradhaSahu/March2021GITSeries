package seleniumPractice;

public class Test {

	public static void main(String[] args) {

		//String  “ABDEFGABEF”, longest substring = “BDEFGA” and “DEFGAB”
		
		String s="ABDEFGABEF";
		
		System.out.println((s.substring(0, 6)));
		
		//fibonacci- 1,2,3,5,8,13
		int first=1;
		int second=1;
		for(int i=1;i<=10;i++) {
			second=second+first;
			System.out.println(second);
		}
	}

}
