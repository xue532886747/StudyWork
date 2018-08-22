package Excerise;

public class ArrayDemoEx1 {
	public static void main(String[] args) {
		int arr[] = {25,24,12,76,98,101,90,28};
		for(int i = 0;i<arr.length;i++) {
			System.out.print("arr["+i+"]="+arr[i]+" ");}
			System.out.println();
			for(int i =0;i<arr.length-1;i++) {
				for(int j =0;j<arr.length-i-1;j++) {
					if(arr[j]>arr[j+1]) {
						int temp =arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
						
				}
			}
		}for(int i = 0;i<arr.length;i++) {
			System.out.print("arr["+i+"]="+arr[i]+" ");
			
		}
 	}
}
