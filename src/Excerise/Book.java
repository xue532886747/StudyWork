package Excerise;
	public class Book{
    public static void main(String args[]){
    	int a[] = {74,48,30,17,62};
    	int max = a[0];
    	int min = a[0];
    	System.out.println("����a��Ԫ�ذ�����");
    	for(int i = 0;i<a.length;i++){
    	        System.out.print(a[i]+" ");
    		if(a[i]>max){
    		max = a[i];}
    		else if(a[i]<min){
    		min = a[i];}
    	}
    	System.out.println("\n��������ֵ��"+max);
    	System.out.println("�������Сֵ��"+min);
    }
}	
