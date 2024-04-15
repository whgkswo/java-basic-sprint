package day7;

public class Assignment5_2 {
    public static void main(String[] args) {
        Book bookA = new Book();
        System.out.println(String.format("%s - %s (%d원)", bookA.title, bookA.author, bookA.price));

        Book bookB = new Book("책A", "저자A", 10000);
        System.out.println(String.format("%s - %s (%d원)", bookB.title, bookB.author, bookB.price));
    }
}
