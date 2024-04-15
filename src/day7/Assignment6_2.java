package day7;

public class Assignment6_2 {
    public static void main(String[] args) {
        String  strA = "hello"; String strB = " java"; String strC = " world";
        System.out.println(String.format("concat(\"%s\",\"%s\",\"%s\") -> %s",strA,strB,strC,StringUtil.concat(strA,strB,strC)));

        strA = "apple"; strB = "pp";
        System.out.println(String.format("contains(\"%s\",\"%s\") -> %s",strA,strB,StringUtil.contains(strA,strB)));

        strA = "apple"; strB = "ppx";
        System.out.println(String.format("contains(\"%s\",\"%s\") -> %s",strA,strB,StringUtil.contains(strA,strB)));

        strA = "ap"; strB = "apple";
        System.out.println(String.format("contains(\"%s\",\"%s\") -> %s",strA,strB,StringUtil.contains(strA,strB)));

    }
}
