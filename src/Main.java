public class Main{
    public static void main(String[] args) {
        Book[] book = new Book[3];
        Book book1 = new Book();
        book1.BookName = "Java程序设计";
        book1.BookID = 1;
        book1.BookPrice = 34.5;
        Book book2 = new Book();
        book2.BookName = "数据结构";
        book2.BookID = 2;
        book2.BookPrice = 44.8;
        Book book3 = new Book();
        book3.BookName = "C++程序设计";
        book3.BookID = 3;
        book3.BookPrice = 35.0;
        book[0] = book1;
        book[1] = book2;
        book[2] = book3;
        Book.printBook(book);
    }
}
class Book{
    String BookName;
    int BookID;
    double BookPrice;
    public static void printBook(Book[] book){
        for (int i=0;i<book.length;i++){
            System.out.println("书名：" + book[i].BookName + ", 书号：" + book[i].BookID + ", 书价：" + book[i].BookPrice);
        }
        System.out.println("图书总册数为：" + book.length);
    }
}