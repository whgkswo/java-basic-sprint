package day7;

public class Assignment6_1 {
    public static void main(String[] args) {
        String input = "abced";
        System.out.println(String.format("reverse(\"%s\") -> %s",input, StringUtil.reverse(input)));

        String strA = "hello";  String strB = " world";
        System.out.println(String.format("concat(\"%s\",\"%s\") -> %s",strA,strB,StringUtil.concat("hello", " world")));

        strA = "apple"; char c = 'a';
        System.out.println(String.format("contains(\"%s\",\"%s\") -> %s",strA,c,StringUtil.contains(strA, c)));

        strA = "apple"; c = 'b';
        System.out.println(String.format("contains(\"%s\",\"%s\") -> %s",strA,c,StringUtil.contains(strA, c)));
    }
}
