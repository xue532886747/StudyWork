package Excerise;

public class ArrayDemo2 {
	public static void main(String args[]) {
		int sum = 0;
		int num[][] = {{30,35,26,32},{33,32,30,29}};
		for(int i = 0;i<num.length;i++) {
			System.out.println("第"+(i+1)+"的成绩为：");
			for(int j = 0;j<num[i].length;j++) {
				System.out.println(num[i][j]);
				
			}
			
		}
	}
}
