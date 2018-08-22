package Excerise;
	public class Book{
    public static void main(String args[]){
    	int a[] = {74,48,30,17,62};
    	int max = a[0];
    	int min = a[0];
    	System.out.println("数组a的元素包括：");
    	for(int i = 0;i<a.length;i++){
    	        System.out.print(a[i]+" ");
    		if(a[i]>max){
    		max = a[i];}
    		else if(a[i]<min){
    		min = a[i];}
    	}
    	System.out.println("\n数组的最大值："+max);
    	System.out.println("数组的最小值："+min);
    }
}	
