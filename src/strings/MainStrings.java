package strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainStrings {
    
    public static void main(String[] args) {
        String test = "Animal";
        System.out.println("test.startsWith(\"a\") = " + test.startsWith("a"));

        String alpha = " ";

        for(char current = 'a'; current <= 'z'; current ++){
            alpha = alpha + current;
            System.out.println("alpha = " + alpha);
            System.out.println("current = " + current);
        }
        System.out.println("alpha = " +  alpha.getClass().getName());

        System.out.println(palindromeChecker("Anna"));
        System.out.println(palindromeChecker("jose"));

        String testEquals = "Hello";
        String t2 = new String(testEquals);

        StringBuilder sb = new StringBuilder();
        sb.append("aaa").insert(1, "bb").insert(4, "ccc");
        System.out.println(sb);

        String s1 = "java";
        StringBuilder s2 = new StringBuilder("java");
        if (s1.toString() == s2.toString()) {
            System.out.print("1");
        }

        if (s1.equals(s2)) {
            System.out.print("2");
        }

        System.out.println("substring" + s1.substring(1));

        List<Integer> list = Arrays.asList(10, 4, -1, 5);
        Collections.sort(list);
        Integer array[] = list.toArray(new Integer[4]);
        System.out.println(array[0]);

        List<String> hex = Arrays.asList("30", "8", "3A", "FF"); Collections.sort(hex);
        int x = Collections.binarySearch(hex, "8");
        int y = Collections.binarySearch(hex, "3A");
        int z = Collections.binarySearch(hex, "4F");

        hex.stream().forEach(e -> System.out.println(e));

        hex.size();



        System.out.println(x + " " + y + " " + z);


        System.out.println("Animal String = " + "AniMal  ".trim().toLowerCase().replace('a','A'));
        
        StringBuilder sb1 = new StringBuilder("Animals");
        String sub = sb1.substring(sb1.indexOf("A"), sb1.indexOf("al"));
        char ch = sb1.charAt(6);

        System.out.println("sb1.length() = " + sb1.length());
        System.out.println("sub = " + sub);
        System.out.println("ch = " + ch);

    }

    private static Boolean palindromeChecker(String s){

        StringBuilder palindrome = new StringBuilder(s);
        System.out.println("palindrome = " + palindrome);
        System.out.println(palindrome.reverse().toString());

        return palindrome.toString().equalsIgnoreCase(palindrome.reverse().toString());
    }
    
}
