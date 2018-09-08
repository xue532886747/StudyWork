package BookWork;

public class BookStore {			//定义一个书店
	private Link books = new Link();
	public void add(Book book) {		//增加书本
		this.books.add(book);
	}
	public void delete(Book book) {		//删除书本
		this.books.remove(book);
	}
	public Link search(String keyWord) {	//模糊查询
		Link result = new Link();
		Object obj[] =this.books.toArray();	//将集合变为对象数组
		for(int i =0;i<obj.length;i++) {
			Book book =(Book) obj[i];
			if(book.getName().contains(keyWord)) {
				result.add(book);
			}
		}
		return result;
	}
	public void findchange(String word,String newword) {//修改
		Link result = new Link();
		Object obj[] = this.books.toArray();
		for(int i =0;i<obj.length;i++) {
			Book books = (Book) obj[i];
			if(books.getName().contains(word)) {
				result.change(word, newword);
			}
		}
	}
	public void print(Link book) {
		book.toArray();
		for(int i =0;i<book.toArray().length;i++) {
			System.out.println(book.toArray()[i]);
		}
	}
	
}
