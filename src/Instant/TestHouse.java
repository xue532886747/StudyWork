package Instant;
class Member{
	private int mid;
	private String name;
	private Car car; 		//��ʾ�����˵ĳ�
	public Member(int mid,String name) {
		this.mid = mid;
		this.name = name;
	}
	public String getInfo() {
		return  "��Ա��ţ�"+this.mid+",��Ա������"+this.name;
	}
	public void setCar(Car _car) { //��c����
		 System.out.println("_car = "+_car);

		this.car = _car;
		 System.out.println("this.car = "+this.car);
	     this.car = new Car("��ţ");
		 System.out.println("this.car** = "+this.car);
		 System.out.println("_car** = "+_car);

	}
	public Car getCar() {
		return this.car;
	}
}
class Car{
	private String pname;
	private Member member;	//��ʾ���ڳ�����
	public Car() {
		System.out.println("calling car constructor1");
	}
	public Car(String pname) {
		this.pname = pname; 
		System.out.println("calling car constructor2");

		
	}
	public String getInfo() {
		return "�������֣�"+this.pname;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public Member getMember() {
		return this.member;
	}
}
public class TestHouse{
	public static void main(String[] args) {
		Member m = new Member(25,"rooney");//ʵ����Member�Ķ��� m
		 Car c  = new Car("�µ�A8");//ʵ����һ��Car�Ķ���c
		 System.out.println("c = "+c);
		 m.setCar(c);
		 System.out.println("c** = "+c);
		 c.setMember(m);
		 System.out.println();
		 System.out.println(m.getCar().getInfo());
		 System.out.println(c.getMember().getInfo());
	}

}