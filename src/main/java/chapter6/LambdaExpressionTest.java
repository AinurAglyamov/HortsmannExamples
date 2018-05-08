package chapter6;

import java.util.Arrays;

public class LambdaExpressionTest {
    public static void main(String[] args) {
        String[] names = new String[5];
        names[0] = "Andrey";
        names[1] = "Yakov";
        names[2] = "Ainur";
        names[3] = "Innokentiy";
        names[4] = "Ivan";

        System.out.println(Arrays.toString(names));
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        Arrays.sort(names,(first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(names));
        System.out.println("-----------------------------");

        String[] names2 = new String[6];
        names2[0] = "andrey";
        names2[1] = "Yakov";
        names2[2] = "Ainur";
        names2[3] = "Innokentiy";
        names2[4] = "Ivan";
        names2[5] = "Andrey";

        Arrays.sort(names2, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names2));


    }
}
