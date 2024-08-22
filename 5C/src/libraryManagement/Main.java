package libraryManagement;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library library = new Library();
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("1984", "George Orwell");
        library.addBook(book1);
        library.addBook(book2);
        Member member1 = new Member("aliya", "M001");
        Member member2 = new Member("Brindha", "M002");
        library.addMember(member1);
        library.addMember(member2);
        library.borrowBook("1984", "M001");
        library.borrowBook("The Great Gatsby", "M002");
        library.borrowBook("1984", "M002");
        library.returnBook("1984");
        library.borrowBook("1984", "M002");
	}

}
