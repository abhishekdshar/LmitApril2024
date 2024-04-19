package basicJava;

public class NonStaticExample {

    int a = 100;

    public static void main(String[] args) {
//        NonStaticExample n = new NonStaticExample();
//        n.m1();
        NonStaticExample.m2();
    }
    public void m1(){

        System.out.println(a);
    }

    public static void m2(){

        System.out.println("xyz");
    }


}
