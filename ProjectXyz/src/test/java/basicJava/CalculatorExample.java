package basicJava;

public class CalculatorExample {

    public static void main(String[] args) {

        int a = 34;
        int b = 45 ;
        String operator = "*";

        if(operator.equals("+")){
            System.out.println(a + b);
        }
        else if (operator.equals("-")){
            System.out.println(a - b);
        }
        else if( operator.equals("*")){
            System.out.println( a * b);
        }
        else if(operator.equals("/")){

            System.out.println(a / b);
        }
        else{
            System.out.println("provide valid operator");
        }

    }
}
