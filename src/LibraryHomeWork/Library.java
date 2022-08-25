package LibraryHomeWork;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> booksList = new ArrayList<>();
    private ArrayList<Visitor> visitorsList = new ArrayList<>();

    public void showBooksCollection() {
        for (Book book : booksList) {
            System.out.printf("Название - '%s' / Автор - %s\n", book.getName(), book.getAuthor());
        }
    }

    public void addBookToCollection(String name, String author) {
        if (name.isBlank() || author.isBlank()) {
            System.out.println("Пустое название или имя автора!");
            return;
        }
        if (checkBookInCollection(name)) {
            System.out.println("Такая книга уже есть в библиотеке!");
            return;
        }
        this.booksList.add(new Book(name, author));
        System.out.printf("Книга '%s' добавлена!\n", name);
    }

    private boolean checkBookInCollection(String name){
        for (Book book : booksList) {
            if (name.equalsIgnoreCase(book.getName())) {
                return true;
            }
        }
        return false;
    }

    public void deleteBookFromCollection(String name){
        if (!checkBookInCollection(name)) {
            System.out.println("Такой книги нет в библиотеке!");
            return;
        }
        for(Book book : booksList){
            if (book.getName().equalsIgnoreCase(name)) {
                booksList.remove(book);
                System.out.printf("Книга '%s' удалена\n", name);
                break;
            }
        }
    }

    public void showVisitorsList() {
        for (Visitor visitor : visitorsList)
            System.out.printf("Имя - %s / Индификатор - %s\n", visitor.getName(), visitor.getId());
    }

    public void addVisitorToList(String name) {
        if (name.isBlank()) {
            System.out.println("Пустое имя посетителя!");
            return;
        }
        Visitor visitor = new Visitor(name);
        this.visitorsList.add(visitor);
        System.out.printf("Посетитель %s добавлен!\n", name);
    }
    public Book getBookFromCollection(String name){
        for (Book book : booksList){
            if (book.getName().equalsIgnoreCase(name))
                return book;
        }
        System.out.println("Такой книги нет в библиотеке!");
        return null;
    }
    public ArrayList<Book> getBooksCollectionByAuthor(String author){
        ArrayList<Book> resultArray = new ArrayList<>();
        for (Book book : booksList){
            if (book.getAuthor().equalsIgnoreCase(author))
                resultArray.add(book);
        }
        return resultArray;
    }

}
