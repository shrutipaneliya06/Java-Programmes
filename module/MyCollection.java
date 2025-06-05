import java.util.ArrayList;
import java.util.Collection;

public class MyCollection {
    public static void main(String args[]){
        Collection<Integer> num= new ArrayList<>();
        num.add(1);
        num.add(2);
        for (Integer integer : num) {
            System.out.println(integer);
        }

        Object o[]=new Object[4];
        o[0]=1;
        o[1]="shruti";

        int n[]=new int[5];
        n[0]=1;
        // n[1]="sru";

        
    }
}
