package StringHandling;

import java.util.Arrays;

public class StringHandlingDemo {
    public static void main(String[] args){
        String str1 = "Miles is studying";
        String str2 = " in collegge";
        System.out.println(str1.length());

        String result =  str1.concat(str2);
        System.out.println(result);

        String s = String.format("The name of student  is  " + "%s, and the age is " + "variable is %d", "Miles", 26);
        System.out.println(s);

        System.out.println(str1.charAt(4));

        if(str1.equals(str2)){
            System.out.println("both strings are the same");
        }  else {
            System.out.println("both strings are not equal");
        }

        System.out.println(str1.indexOf("u"));
        System.out.println(str1.replace("u", "a"));

        String[] arr = str1.split(" ");
        Arrays.asList(arr).forEach(i -> System.out.println(i));

        String newStr1 = str1.substring(0, 5);
        System.out.println(newStr1);
    }
}
