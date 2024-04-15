package day7;

public class Assignment5_1 {
    public static void main(String[] args) {
        Person aaron = new Person("Aaron", 24);
        Person sarah = new Person("Sarah", 66);
        System.out.println(String.format("%s (%d세)", aaron.name, aaron.age));
        System.out.println(String.format("%s (%d세)", sarah.name, sarah.age));
    }
}
