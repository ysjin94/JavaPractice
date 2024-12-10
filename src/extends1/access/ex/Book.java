package extends1.access.ex;

public class Book extends Item{
    private String author;
    private String isbn;

    public Book(String name, int price, String author, String isbn) {
        super(name, price);
        this.author = author;
        this.isbn = isbn;
    }

    public void print(){
        super.print();
        System.out.println("\t- Author : " + this.author + " isbn : " + this.isbn); ;
    }

}
