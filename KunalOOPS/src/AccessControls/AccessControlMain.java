package AccessControls;

import AccessControls.A;

public class AccessControlMain {
    public static void main(String[] args) {
        A obj=new A(10,"abhishek");
        //since num is private we cannot directly access it like we have done before obj.num
        //and hence to access such private variables we use getter and setters num is private but getnum() method is public hence we are able to access through getnum
        //private : available within that given file only public:available or can be access everywhere in default case when we don't mention anything then that
        //that particular data-types can be access within that package only and not outside the package
       // 1.public:Can be access everywhere within same class ,same package,subclass(same package),subclass(different package)as well as in world(diff package and not subclass)
        //2.private:Can be access within same class
        //3.protected:except world(different package and not subclass) it can be accessed everywhere
        //4.no modifier(default): not in subclass with different package and world(different package and not subclass) rest everywhere it is accessible

        System.out.println(obj.getNum());
    }
}
