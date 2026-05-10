import AccessModifier1.Main;

import javax.swing.*;

public class StaticExamples {
    static int a=5;
    static int b;
    static {
        b=a*5;

    }

    public static void main(String[] args) {
        System.out.println(StaticExamples.a+" "+StaticExamples.b);
        StaticExamples.b+=5;
        System.out.println(StaticExamples.b);

    }
}
