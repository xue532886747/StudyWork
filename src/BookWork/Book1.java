package BookWork;

public class Book1 implements Book{
	private String name;
	private double price;
	private String press;
    public Book1(String name,double price,String press) {
    	this.name = name;
    	this.price = price;
    	this.press = press;
    } /*
      public boolean equals(Object obj) {
    	if(this == obj) {
    		return true;
    	}
    	if(obj == null) {
    		return false;
    	}
    	if(!(obj instanceof Book1)) {
    		return false;
    	}
    	Book1 b = (Book1) obj;
    	if(this.name.equals(b.name)&&this.price == b.price&&this.press.equals(b.press)) {
    		return true;
    	}return false;
    }*/
    public String toString() {
    	return "书的名字:"+this.name+" "+"书的价格:"+this.price+" "+"书的出版社:"+this.press+" ";
    }
	public String getName() {
		return this.name;
	}
	public double getPrice() {

		return this.price;
	}
	public String getPress() {
		return this.press;
	}
	public void setName() {
		this.name = name;
	}
	public void setPrice() {
		this.price = price;	
	}
	public void setPress() {
		this.press = press;
		
	}
	
}
