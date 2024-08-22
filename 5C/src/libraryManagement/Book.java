package libraryManagement;

public class Book implements Borrowable {
	private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
	@Override
	public void borrow(Member member) {
		// TODO Auto-generated method stub
		if (isAvailable) {
            isAvailable = false;
            System.out.println(member.getName() + " borrowed the book: " + title);
        } else {
            System.out.println("Book is not available for borrowing.");
        }
	}

	@Override
	public void returnBook() {
		// TODO Auto-generated method stub
		 isAvailable = true;
	        System.out.println("The book: " + title + " has been returned.");
	    }

	    public boolean isAvailable() {
	        return isAvailable;
	}

}
