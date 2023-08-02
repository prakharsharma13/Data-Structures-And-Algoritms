package functions;

//When we defind two functions with same name but with different paramters then it is called function overloading!
// Function overloading depends on parameters not on arguments.

public class FunctionOverloading {
    public static int sum(int a, int b){
        return a + b;
    }

    public static int sum(int a, int b, int c){
        return a + b + c;
    }
    public static void main(String[] args) {
        System.out.println(sum(3, 5));
        System.out.println(sum(5, 4, 8));
    }
}
