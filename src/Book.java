/*
Create a project in IntelliJ called BookApplication.

Create a Book class that allows for Book title, author, description, price and isInStock variables

The Book class shall contain private member variables, a default constructor, an overloaded constructor and
a method called getDisplayText() which prints the author, title and description.

The application shall also contain getters and setters for each private member variable.

Create another class called BookApp which contains the main method. In the main method you shall create an instance of
 a Book and print the Author, Title and Description.

Next, you'll add an overloaded constructor and a method.

An overloaded constructor is a constructor that takes one or more parameters. You can create multiple constructors as long as the parameter types and counts are unique. Create a constructor  in the BookDB  class that takes an SKU and populates the private member variables. The constructor by default will return the appropriate BookDB object when it is called. You do not need to include a return statement.

Next, create a method in your Book class called getDisplayText(). It takes no parameters. When called it returns a string containing the author, title and description. Do not use System.out.print() in your class. Simply return the string and let the calling class handle the print statements. You can use this method to print your book information to the console or a file or a web page.

Publish your solution to GitHub and submit your GitHub url as the assignment.
 */

public class Book {

    private String SKU;
    private String title;
    private String author;
    private String description;
    private double price;
    private boolean isInStock;

    public Book() {
    }

    public Book(String title, String author, String description) {
        this.title = title;
        this.author = author;
        this.description = description;
    }

    public Book(String SKU, String title, String author, String description) {
        this.SKU = SKU;
        this.title = title;
        this.author = author;
        this.description = description;
    }

    public Book(String SKU, String title, String author, String description, double price) {
        this.SKU = SKU;
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
    }

    public Book(String SKU, String title, String author, String description, double price, boolean isInStock) {
        this.SKU = SKU;
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.isInStock = isInStock;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }


    //method to return the author, title and description.
    public String getDisplayText() {
        String title = this.getTitle();
        String author = this.getAuthor();
        String description = this.getDescription();
        return ("title:"+ this.title + "\tauthor: " + this.author + "\tdescription: " + this.description);
    }

    @Override
    public String toString() {
        return "Book{" +
                "SKU='" + SKU + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", isInStock=" + isInStock +
                '}';
    }
}
