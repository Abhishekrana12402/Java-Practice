package Cloning;

public class Human implements Cloneable {
    //Cloneable is an interface which is already defined
   int age;
   String name;
int[] arr;
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr= new int[]{3,4,5,6,7};
    }
//    public Human(Human other){
//        this.age=other.age;
//        this.name=other.name;
//    }
//    public Object clone() throws CloneNotSupportedException {
//        return super.clone();
//        //shallow copy
//    }
    public Object clone() throws CloneNotSupportedException {
       Human twin= (Human) super.clone();//this line is example of shallow copy
        //Deep copy
        twin.arr=new int[twin.arr.length];
        for(int i=0;i<twin.arr.length;i++){
            twin.arr[i]=this.arr[i];
        }
        return twin;
    }
}
