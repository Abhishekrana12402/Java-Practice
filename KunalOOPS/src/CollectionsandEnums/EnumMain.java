package CollectionsandEnums;
//In Java, enums (enumerations) are a special type of data structure that represents a fixed set of constants. Each constant value in an enum is an instance of the enum
//type. Enums in Java are implicitly final and cannot be extended or subclassed.The decision to disallow enum extension is primarily to maintain the integrity and
//        consistency of the enum concept. Enums are designed to represent a finite set of values, and allowing extension would introduce the possibility of creating
//        additional values that are not part of the original enum definition. This would undermine the fundamental purpose of enums, which is to define a restricted
//        set of constants.By making enums final and not allowing extension, Java ensures that the defined set of enum values remains fixed and cannot be altered or extended.
public class EnumMain {

    enum Week implements A{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
        // these are enums constant
        //public,static and final since its final you can create child enums
        //enum cannot extend classes but it can implement various interfaces
        Week(){
            System.out.println("Constructor called for"+this);

        }

        @Override
        public void fun() {
            System.out.println("Having Fun");
        }
    }


    public static void main(String[] args) {

       Week week=Week.Monday;
week.fun();
        for(Week day:Week.values()){
            System.out.println(day);
        }
        System.out.println(week);
        System.out.println(week.ordinal());

    }
}
