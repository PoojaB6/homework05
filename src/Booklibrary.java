public class Booklibrary {
    public static void main(String[]args){
        Book book1st = new Book();
        Book book2nd = new Book("Harry Potter","JK","9780747532743");
        Book book3rd = new Book("Ramayana","Tulsidas");
        System.out.println();
        System.out.println(book1st.title +","+ book1st.author+","+book1st.ISBN);
        System.out.println(book2nd.title+","+book2nd.author+","+book2nd.ISBN);
        System.out.println(book3rd.title+","+book3rd.author+","+book3rd.ISBN);
    }
}
