package Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human Rahul=new Human(23,"Rahul rana");
       // Human twin=new Human(Rahul);
        //instead of creating an new object we can just create clone ot it as done here
        Human twin= (Human) Rahul.clone();
        System.out.println(twin.name+" "+twin.age);
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0]=1;
       // this is shallow copy it changes the original one if we change something in the clone
        System.out.println(Arrays.toString(Rahul.arr));
        twin.age=21;twin.name="Aman Rana";
        System.out.println(Rahul.age+" "+Rahul.name);
    }
}
/*Note:
In a shallow copy, the behavior differs for primitive types and non-primitive types (objects). Here are the general rules:

Primitive Types:
When performing a shallow copy on primitive types such as int, float, boolean, etc., the values themselves are directly copied. Modifying the copied value will not affect the original value.
Non-Primitive Types (Objects):
When performing a shallow copy on non-primitive types (objects), the references to the objects are copied. Both the original and copied objects will refer to the same underlying object in memory. Modifying the object itself (via any of its references) will affect both the original and copied objects.
In Java, String is a special case where it is classified as an immutable class. While it is a non-primitive type, the immutability of String means that the behavior for shallow copying differs compared to other non-primitive mutable objects.

When you perform a shallow copy on a String object, whether by assignment or using the clone() method, a new reference to the same underlying String object is created. However, since String objects are immutable, modifying the copied String will not change the original String object. The reference to the original String remains unchanged, and a new String object is created when modifications are made.
 */
