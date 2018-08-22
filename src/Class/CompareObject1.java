package Class;

public class CompareObject1 {
	public static void main(String[] args) {
		String str1 = new String("java");
		String str2 = new String("Java");
		String str3 = str2;
		
		if(str2==str3) {
			System.out.println("str2==str3");
		}else {
			System.out.println("str3!=str3");
		}
	}
}
