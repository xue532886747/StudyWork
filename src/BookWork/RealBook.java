package BookWork;

public class RealBook implements IBook {
    private String name;
    private double price;
    private String press;

    public RealBook(String name, double price, String press) {
        this.name = name;
        this.price = price;
        this.press = press;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {

    }

    public void setPress(String press) {
        this.press = press;

    }


    public String toString() {
        return "书的名字:" + this.name + " " + "书的价格:" + this.price + " " + "书的出版社:" + this.press + " ";
    }
}
