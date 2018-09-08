package BookWork;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        BookStore store = new BookStore();
        store.add(new RealBook("三国演义", 18, "人民邮电出版社"));
        store.add(new RealBook("西游记", 19.9, "清华大学出版社"));
        store.add(new RealBook("水浒传", 29.9, "机械出版社"));
        store.add(new RealBook("红楼梦", 28.9, "机械出版社"));
        store.add(new RealBook("毛泽东传", 59.9, "人民日报出版社"));
        store.add(new RealBook("Java从入门到精通", 69.9, "人民邮电出版社"));
        store.add(new RealBook("华尔街", 50, "商业出版社"));
        store.add(new RealBook("习近平传", 59.9, "人民出版社"));
//        store.delete(new RealBook("华尔街", 50, "商业出版社"));
//
//
        store.printAll();

        ArrayList<RyanData> datas = store.search("华");
        for (RyanData data : datas) {
            System.out.println("book name = " + data.getName());
        }

        store.delete(new RealBook("华尔街", 50, "商业出版社"));
        store.printAll();

//
//
//
//        new RealBook("三国演义", 18, "人民邮电出版社");
//        new RealBook("西游记", 19.9, "清华大学出版社");
//        new RealBook("水浒传", 29.9, "机械出版社");
//        new RealBook("红楼梦", 28.9, "机械出版社");
//        new RealBook("毛泽东传", 59.9, "人民日报出版社");
//        new RealBook("Java从入门到精通", 69.9, "人民邮电出版社");
//        new RealBook("华尔街", 50, "商业出版社");
//        new RealBook("习近平传", 59.9, "人民出版社");
//        new RealBook("华尔街", 50, "商业出版社");


    }


}
