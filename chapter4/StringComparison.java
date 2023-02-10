package org.example.chapter4;

public class StringComparison {
    public static void main(String[] args) {

        String s1 = " Welcome ";
        String s2 = " welcome ";
        boolean isEqual = s1.equals(s2);
        System.out.println(isEqual);

        isEqual = s1.equalsIgnoreCase(s2);
        System.out.println(isEqual);

        int x = s1.compareTo(s2);
        System.out.println(x);

        x = s1.compareToIgnoreCase(s2);
        System.out.println(x);

        boolean b = s1.startsWith("AAA");
        System.out.println(b);

        b = s1.endsWith("AAA");
        System.out.println(b);

        x = s1.length();
        System.out.println(x);

        x = s1.indexOf(" ");
        System.out.println(x);

        String s3 = s1 + s2;
        System.out.println(s3);

        s1 = s1.substring(1);
        System.out.println(s1);

        s1 = s1.substring(1, 4);
        System.out.println(s1);

        s1 = " Welcome ";

        s3 = s1.toLowerCase();
        System.out.println(s3);

        s3 = s1.toUpperCase();
        System.out.println(s3);

        s3 = s1.trim();
        System.out.println(s3);

        x = s1.indexOf('e');
        System.out.println(x);

        String str = "abc";
        x = str.lastIndexOf('c');
        System.out.println(x);
    }
}
