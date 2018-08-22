package lianxi1;
class Province{
	private int pid;
	private String name;
	private City cities[];
	public Province(int pid,String name) {
		this.pid = pid;
		this.name = name;
	}
	public String getInfo() {
		return "ʡ�ݱ�ţ�"+this.pid+"ʡ������"+this.name;
	}
	public void setCities(City cities[]) {
		this.cities = cities;
	}
	public City[] getCities() {
		return this.cities;
	}
}
class City{
	private int cid;
	private String name;
	private Province province;
	public City(int cid,String name) {
		this.cid = cid;
		this.name = name;
	}
	public String getInfo() {
		return "���б�ţ�"+this.cid+"ʡ������"+this.name;
	}
	public void setProvince(Province province) {
		this.province = province;
	}
	public Province getProvince() {
		return this.province;
	}
}
public class TestPC {
	public static void main(String[] args) {
		Province pro = new Province(1,"����");
		City c1 = new City (1001,"����");
		City c2 = new City (1002,"����");
		City c3 = new City (1003,"����");
		pro.setCities(new City[] {c1,c2,c3});
		for(int i =0;i<pro.getCities().length;i++) {
			System.out.println(pro.getCities()[i].getInfo());
		}
		c1.setProvince(pro);
		c2.setProvince(pro);
		c3.setProvince(pro);
		System.out.println(c1.getProvince().getInfo());
		}
	}

