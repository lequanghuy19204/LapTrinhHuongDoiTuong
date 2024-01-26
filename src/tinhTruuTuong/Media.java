package tinhTruuTuong;

abstract class Item{
    public String name;
    private String description;
    protected String id;
    float price;

    public Item(String name, String description, String id, float price) {
        this.name = name;
        this.description = description; //miêu tả
        this.id = id;
        this.price = price; // giá
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public abstract void showInfo();
}
class MP3 extends Item{
    private String duration; // khoảng thời gian

    public MP3(String name, String description, String id, float price, String duration) {
        super(name, description, id, price);
        this.duration = duration;
    }

    @Override
    public void showInfo() {
        System.out.println("Hiển thị MP3:");
        System.out.println("Name: " + name);
        System.out.println("Miêu tả: " + getDescription());
        System.out.println("Ma ID: " + getId());
        System.out.println("Giá: " + price);
        System.out.println("Khoảng thời gian: " + duration);
    }
}
class Book extends Item{
    private String author; // tác giả
    private int numberOfPages; // số trang
    private String genre; // thể loại

    public Book(String name, String description, String id, float price, String author, int numberOfPages, String genre) {
        super(name, description, id, price);
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
    }

    @Override
    public void showInfo() {
        System.out.println("Hiển thị Book:");
        System.out.println("Name: " + name);
        System.out.println("Miêu tả: " + getDescription());
        System.out.println("Ma ID: " + getId());
        System.out.println("Giá: " + price);
        System.out.println("Tác giả: " + author);
        System.out.println("Số trang: " + numberOfPages);
        System.out.println("Thể loại: " + genre);
    }
}
public class Media {
    public static void main(String[] args) {
        MP3 mp3 = new MP3("Song Name", "Cool song", "123", 10.99f, "3:30");
        Book book = new Book("Book Title", "Interesting book", "456", 29.99f, "Author Name", 300, "Fiction");

        mp3.showInfo();
        System.out.println();
        book.showInfo();
    }
}