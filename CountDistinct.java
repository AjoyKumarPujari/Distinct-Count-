import java.util.HashSet;
import java.util.Set;
public class CountDistinct {

        int count(int[] a)
        {
            Set<Integer> set = new HashSet<>();
            for (int element : a){
                set.add(element);
            }
            return set.size();
        }

        public static void main(String[] args)
        {
            CountDistinct ob = new CountDistinct();
            int[] a = {5,10,15,5,4};
            int b = ob.count(a);
            System.out.println(""+b);

        }
    }



