package libraryManagement;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<Book> books;
    private List<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void borrowBook(String bookTitle, String memberId) {
        for (Book book : books) {
            if (book.getTitle().equals(bookTitle)) {
                for (Member member : members) {
                    if (member.getMemberId().equals(memberId)) {
                        book.borrow(member);
                        return;
                    }
                }
                System.out.println("Member not found.");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void returnBook(String bookTitle) {
        for (Book book : books) {
            if (book.getTitle().equals(bookTitle)) {
                book.returnBook();
                return;
            }
        }
        System.out.println("Book not found.");
    }
}
