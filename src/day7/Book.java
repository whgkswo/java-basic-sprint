package day7;

public class Book {

    // TODO:
    //  Book 클래스를 만들고, 제목(title), 저자(author), 가격(price)을 필드로 정의하세요. 모든 필드를 초기화하는 생성자와, 필드 값을 출력하는 메서드를 포함하세요.
    String title;
    String author;
    int price;
    public Book(){}
    public Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
}
