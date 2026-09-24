package java_part_2.Access;

public class Main {
    public static void main() {
       Testing test = new Testing(12,"Abhi");
        System.out.println(test.getNum());
        test.setNum(15);
        System.out.println(test.getNum());
        //private: in that file only
        //public: everywhere
        //default: when not specified in same package it is allowed but not allowed in diff package
    }
}
