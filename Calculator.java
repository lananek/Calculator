import java.util.Scanner;
public class Calculator {
 
    public static double add(double a, double b){ return a + b;}
    public static double min(double a , double b){return a-b;}
    public static double multip(double a , double b){return a*b;}
    public static double del(double a , double b){return a/b;}
    public class returnStruct{
        boolean exists;
        double data;
        returnStruct(boolean e, double d){
            exists = e;
            data = d;
        }
    }
    final int INFINITY =  Integer.MAX_VALUE;
    public returnStruct div(int a, int b){
        if(b == 0) return new returnStruct(false, INFINITY);
        else {
            double res = a;
            res /= b;
            return new returnStruct(true, res);
        }
    }
    public static void main(String[] args) {
        char op;
        double a;
        double b;
        double ans;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        a = reader.nextDouble();
        b = reader.nextDouble();
        System.out.print("\nEnter an operator (+, -, *, /): ");
        op = reader.next().charAt(0);
        switch(op) {
            case '+':
                ans = add(a, b);
                break;
            case '-':
                ans = min(a, b);
                break;
            case '*':
                ans = multip(a, b);
                break;
            case '/':
                ans = del(a, b);
                break;
            default:
                System.out.printf("Error! Enter correct operator");
                return;

        }


        System.out.print("\nThe result is given as follows:\n");
        System.out.printf(a + " " + op + " " + b + " = " + ans);
    }
}
