package Class;
public class MethodOverload{
	public int add(int a,int b) {
		return a+b;
	}
	public float add(float a,float b) {
		return a+b;
	}
	public int add(int a,int b,int c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		int result;
		float result_f;
		MethodOverload test = new MethodOverload();
		result = test.add(1, 2);
		System.out.println(result);
		result_f = test.add(1.2f, 1.3f);
		System.out.println(result_f);
		result = test.add(1, 2, 3);
		System.out.println(result);
	}
}