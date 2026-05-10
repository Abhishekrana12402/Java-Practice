public class Static {
    public static void main(String[] args) {
students S1=new students();
S1.SchoolName="STHS";
students S2=new students();
        System.out.println(S2.SchoolName);
    }
}
class students{
    String name;
    int roll;
    static String SchoolName;
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return name;
    }
}
