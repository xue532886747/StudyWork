package Excerise;
import java.util.Random;
	public class ArrayDemo {
		public static void main(String args[]) {
			Random rand = new Random();
			int arr[] = new int[(rand.nextInt(10))];
			System.out.println("数组的长度为："+arr.length);
			for(int i =0;i<arr.length;i++) {
				arr[i] =rand.nextInt(100);
				System.out.println("arr["+i+"]="+arr[i]);
			}
	}
}		