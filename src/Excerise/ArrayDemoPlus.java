package Excerise;
import java.util.Random;
public class ArrayDemoPlus {
	public static void main(String[] args) {
		Random rand = new Random();
		int arr[] = new int[5];
		int max =0;
		int min =0;
		System.out.print("随机生成的数组为：");
		for(int i=0;i<arr.length;i++) {
			arr[i]=rand.nextInt(100);
			if(i==0) {
				max = arr[i];
				min = arr[i];	
			}
			System.out.print("arr["+i+"]="+arr[i]+" ");
				if(max<arr[i]) { 
					max = arr[i];
					}
				else if(min>arr[i]) { 
					min = arr[i];
					}	
				
		}System.out.println();	
		System.out.println("其中最大的数组为："+max);
		 System.out.println("其中最小的数组为："+min);
	}
}
