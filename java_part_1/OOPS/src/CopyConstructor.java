public class CopyConstructor {
    public static void main(String[] args) {
        Students S1 = new Students();
        S1.name = "Abhishek";
        S1.pass = "abcde";
        S1.roll = 50;
        S1.marks[0]=100;
        S1.marks[1]=90;
        S1.marks[2]=80;
        Students S2 = new Students(S1);
        S2.pass="edcba";
        S2.marks[2]=80;
        for(int i=0;i<3;i++){
            System.out.println(S2.marks[i]);
        }
    }
}
    class Students{
        String name;
        String pass;
        int roll;
        int[] marks =new int[3];
//        Students(Students S1){//Copy Constructor(shallow copy)
//            this.name=S1.name;
//            this.pass=S1.pass;
//            this.roll=S1.roll;
//            this.marks=S1.marks;
//        }
        Students(Students S1){//copy constructor(deep)
            int[] marks=new int[3];
            this.name=S1.name;
            this.roll=S1.roll;
            for(int i=0;i<marks.length;i++){
                this.marks[i]=S1.marks[i];
            }
        }
        Students(){
            int[] marks=new int[3];
        }
        Students(String name){
            this.name=name;
        }
        Students(int roll){
            this.roll=roll;
        }

    }

