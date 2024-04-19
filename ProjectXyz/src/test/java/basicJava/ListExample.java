package basicJava;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        List<Integer> l = new ArrayList<Integer>();
        l.add(45);
        l.add(78);
        l.add(90);
        System.out.println(l);
        l.add(23);
        System.out.println(l);
        l.add(90);
        l.add(90);
        System.out.println(l);

        for(int h:l){
            System.out.println(h);
        }

        List<String> l2 = new ArrayList<String>();
        l2.add("lmti");
        l2.add("learnmore");

        for(String k:l2){
            System.out.println(k);
        }

        for(int i=0 ; i<l2.size();i++){
            System.out.println(l2.get(i));
        }
    }

}
