package assignment;

public class library {
           
	public String addBook(String bookTitle) {
		System.out.println("book add successfully");
		return bookTitle;
		
	}

	public void issueBook()
	{
		System.out.println("book issued successfully");
		
	}
	
	public static void main(String[] args) {
		library l=new library();  
		l.addBook("silapathigaram");
		l.issueBook();
	}
}
