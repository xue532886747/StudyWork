package BookWork;

import java.util.ArrayList;

public class BookStore {            //定义一个书店
    private Link books = new Link();

    private RyanLink ryanLink = new RyanLink();

    public void add(RealBook realBook) {        //增加书本
//		this.books.add(realBook);
        ryanLink.add(new RyanData().setData(realBook).setName(realBook.getName()));
    }

    public boolean delete(RealBook realBook) {        //删除书本
//        this.books.remove(realBook);

        return  ryanLink.remove(new RyanData().setData(realBook).setName(realBook.getName()));

    }

    public ArrayList search(String keyWord) {    //模糊查询
//        Link result = new Link();
//        Object obj[] = this.books.toArray();    //将集合变为对象数组
//        for (int i = 0; i < obj.length; i++) {
//            RealBook book = (RealBook) obj[i];
//            if (book.getName().contains(keyWord)) {
//                result.add(book);
//            }
//        }

        return  ryanLink.getNodesFromKeyLike(keyWord);

    }

    public void findchange(String word, String newword) {//修改
        Link result = new Link();
        Object obj[] = this.books.toArray();
        for (int i = 0; i < obj.length; i++) {
            RealBook books = (RealBook) obj[i];
            if (books.getName().contains(word)) {
                result.change(word, newword);
            }
        }
    }

    public void printAll() {
//        book.toArray();
//        for (int i = 0; i < book.toArray().length; i++) {
//            System.out.println(book.toArray()[i]);
//        }
        System.out.println(ryanLink);
    }


}
