package basicJava;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        Set<Integer> s = new HashSet<Integer>();
        s.add(23);
        s.add(67);
        s.add(23);
        System.out.println(s);
    }
}
