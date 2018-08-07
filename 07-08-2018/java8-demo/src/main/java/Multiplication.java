import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Multiplication {
    public static void main(String args[])
    {

        List<Integer>list= new ArrayList<>();
        List<Integer>list2= new ArrayList<>();
                for(int i=1;i<10;i++)
                    list.add((i));
        for(int i=10;i<20;i++)
            list2.add((i));


        Iterator<Integer> iterator = list.iterator();
        Iterator<Integer> iterator1 = list2.iterator();

        while (iterator.hasNext()&&iterator1.hasNext()) {
            System.out.print( iterator.next()*iterator1.next()+" ");
        }

    }
}
