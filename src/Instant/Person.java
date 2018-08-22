package Instant;

public class Person {
	private int mid;
	private String name;
	private Car car; 		//表示属于人的车
	public Person(int mid,String name,Car car) {
		this.mid = mid;
		this.name = name;
		this.car = car;
	}	
	public String getInfo() {
		return  "人员编号："+this.mid+",人员姓名："+this.name	+this.car;
	}
}
