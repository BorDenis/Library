package LibraryHomeWork;

public class Book {
    private String name;
    private String author;

    public Book(String name, String author){
        setName(name);
        setAuthor(author);
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAuthor(String author) {
        this.author = author;
    }
}
