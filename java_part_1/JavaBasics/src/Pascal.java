
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
public class Pascal {

        public static List<List<Integer>> generate(int numRows) {
            List<List<Integer>>outer=new ArrayList<>();
            List<Integer>list=new ArrayList<>();
            list.add(1);
            outer.add(list);
            for(int i=1;i<=numRows;i++){
                List<Integer>innerlist=new ArrayList<>();
                int upper=1,lower=1;
                innerlist.add(1);
                for(int j=1;j<i;j++){
                    upper*=i;
                    lower*=j;
                    innerlist.add(upper/lower);

                }
                innerlist.add(1);
                outer.add(list);

            }
            return outer;


        }

    public static void main(String[] args) {
        System.out.println(generate(5));
    }
    }

