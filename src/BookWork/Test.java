package BookWork;

public class Test {
	public static void main(String[] args) {
		BookStore store = new BookStore();
		store.add(new Book1("三国演义",18,"人民邮电出版社"));
		store.add(new Book1("西游记",19.9,"清华大学出版社"));
		store.add(new Book1("水浒传",29.9,"机械出版社"));
		store.add(new Book1("红楼梦",28.9,"机械出版社"));
		store.add(new Book1("毛泽东传",59.9,"人民日报出版社"));
		store.add(new Book1("Java从入门到精通",69.9,"人民邮电出版社"));
		store.add(new Book1("华尔街",50,"商业出版社"));
		store.add(new Book1("习近平传",59.9,"人民出版社"));
		store.delete(new Book1("华尔街",50,"商业出版社"));
		Link all = store.search("华");
		//Object[]objs = all.toArray();
		//for(int i =0;i<objs.length;i++) {
		   //System.out.println(objs[i]);
		//}
		store.print(all);
	}
}
