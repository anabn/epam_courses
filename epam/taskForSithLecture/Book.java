package epam.taskForSithLecture;

public class Book {
    private String id;
    private String title;
    private String author;
    private String published;
    private int yearPublished;
    private String numberOfPage;
    private double price;

    public Book(String id, String title, String author, String published, Integer yearPublished, String numberOfPage, Double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.published = published;
        this.yearPublished = yearPublished;
        this.numberOfPage = numberOfPage;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublished() {
        return published;
    }

    public Integer getYearPublished() {
        return yearPublished;
    }

    public String getNumberOfPage() {
        return numberOfPage;
    }

    public Double getPrice() {
        return price;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublished(String published) {
        this.published = published;
    }

    public void setYearPublished(Integer yearPublished) {
        this.yearPublished = yearPublished;
    }

    public void setNumberOfPage(String numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "id = " + id +
                ", title = " + title +
                ", author = " + author +
                ", published = " + published +
                ", yearPublished = " + yearPublished +
                ", numberOfPage = " + numberOfPage +
                ", price = " + price;
    }
}
