package Instant;

public class Person {
	private int mid;
	private String name;
	private Car car; 		//��ʾ�����˵ĳ�
	public Person(int mid,String name,Car car) {
		this.mid = mid;
		this.name = name;
		this.car = car;
	}	
	public String getInfo() {
		return  "��Ա��ţ�"+this.mid+",��Ա������"+this.name	+this.car;
	}
}
