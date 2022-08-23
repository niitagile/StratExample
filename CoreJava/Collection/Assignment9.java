package collections;

import java.util.ArrayList;
/*Create a collection that has book titles and number of copies(hardcode these values). 
 * Make sure that there are no duplicate books. 
 * When someone borrows a book to read, the person’s name and the book title should be saved 
 * in a collection and the number of copies must be reduced. 
 * When the person returns the book, the entry must be removed from the collection 
 * and number of copies must be added. 
 * Throw an exception if person borrows a book that he/she has already borrowed and not returned.
 *  Also make sure that the number of copies for each book is same when the application closes.
 * 
 */
import java.util.Scanner;

class Book{
	private String book_title;
	private int noofbooks;
	public String getBook_title() {
		return book_title;
	}
	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}
	public int getNoofbooks() {
		return noofbooks;
	}
	public void setNoofbooks(int noofbooks) {
		this.noofbooks = noofbooks;
	}
	public Book(String book_title, int noofbooks) {
		super();
		this.book_title = book_title;
		this.noofbooks = noofbooks;
	}
	
}

class PersonDetails{
	private Book book;
	private String name;
	public PersonDetails(Book book, String name) {
		super();
		this.book = book;
		this.name = name;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class Assignment9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Book> list=new ArrayList<>();
		ArrayList<PersonDetails> plist=new ArrayList<>();
		
		list.add(new Book("C++",10));
		list.add(new Book("Java",5));
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String pname=sc.nextLine();
		System.out.println("Which book do you want");
		String bookname=sc.nextLine();
		for(Book b: list){
			if(b.getBook_title().equals(bookname)){
				b.setNoofbooks(b.getNoofbooks()-1);
				plist.add(new PersonDetails(b,pname));
				break;
				
			}
		}
		
		//print all books
		for(Book b : list){
			System.out.println(b.getBook_title()+" "+b.getNoofbooks());
		}
		
		
		//return book
		PersonDetails ptr=null;
		for(PersonDetails p : plist){
			if(p.getName().equals(pname)){
				 ptr=p;
				Book b=p.getBook();
				b.setNoofbooks(b.getNoofbooks()+1);
				break;
			}
			
		}
		
		
		
		plist.remove(ptr);
		//print all books
		for(Book b : list){
			System.out.println(b.getBook_title()+" "+b.getNoofbooks());
		}
		
	}

}
