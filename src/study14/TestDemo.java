package study14;
class test{
	private int arr[];
	public test(int arr[]) {
		this.arr = arr;
	}
	public void print(int _arr[]) {
		for(int i =0;i<_arr.length;i++) {
			System.out.print(_arr[i]+" ");
		}
	}
	
	public void printSelfArray() {
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public int[] getArr() {
		for(int i =0;i<=arr.length;i++) {
			int temp = 0;
			if(i<=2) {
			arr[i] = temp;
			}
		}return arr;
	}
}
public class TestDemo {
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5};
		test t = new test(arr);
		t.print(arr);
		System.out.println();
		t.getArr();
		t.print(arr);
		
	}

	private void sayHello(){
		System.out.println("hello git");
	}
}

