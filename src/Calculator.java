public class Calculator {

    //global static/class variables
    static int a = 10;
    static int b = 5;
    static int answer;

    //main method
    public static void main(String[] args) {
        addition();
        subtraction();
        multiplication();
        division();

    }

    //no return type no parameter user defined method
        static void addition() {
        answer = a + b;
        System.out.println(answer);

    }
    //no return type no parameter type of user defined method
       static void subtraction(){
        answer= a - b;
        System.out.println(answer);

       }

    //no return type no parameter type of user defined method
    static void multiplication(){
        answer= a * b;
        System.out.println(answer);
    }
    //no return type no parameter type of user defined method
    static void division(){
        answer= a/b;
        System.out.println(answer);
    }
}

