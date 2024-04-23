package question_11.com.tudu.hacks.model;

public class Textbook {
    private String title;
    private String authorName;
    private String publisher;

    public Textbook(String title, String authorName, String publisher) {
        this.title = title;
        this.authorName = authorName;
        this.publisher = publisher;
    }

    public void setTextbookInfo(String title, String authorName, String publisher) {
        this.title = title;
        this.authorName = authorName;
        this.publisher = publisher;
    }

    public void viewTextbookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + authorName);
        System.out.println("Publisher: " + publisher);
    }
}