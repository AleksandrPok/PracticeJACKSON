package main;

import java.util.ArrayList;

public class Distributors {

    private ArrayList<Book> books = new ArrayList<>();

    private ArrayList<String> distributors = new ArrayList<>();

    public Distributors(ArrayList<Book> books, ArrayList<String> distributors) {
        this.books = books;
        this.distributors = distributors;
    }

    public Distributors(){
        super();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<String> getDistributors() {
        return distributors;
    }

    public void setDistributors(ArrayList<String> distributors) {
        this.distributors = distributors;
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void addDistributor(String str){
        distributors.add(str);
    }

    @Override
    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        for (Book b : books) {
//            sb.append(b.toString()).append(',');
//        }
//        sb.append(distributors);
//        return sb.toString();
        return "Distributors{" +
                "books=" + books +
                ", distributors=" + distributors +
                '}';
    }
}
