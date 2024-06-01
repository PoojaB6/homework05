public class Book {
    String title;
    String author;
    String ISBN;

    //Constructor with default value
    public Book(){
        this.title = "unknown";
        this.author= "unknown";
        this.ISBN = "000000";
    }

    //Extend book class by adding constructor with title,author and isbn
    public Book(String title,String author,String ISBN){
        this.title=title;
        this.author=author;
        this.ISBN=ISBN;
    }
    public Book(String title, String author){
        this.title= title;
        this.author=author;
        this.ISBN="123456";
    }
}
