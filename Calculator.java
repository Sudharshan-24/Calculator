import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first no: ");
        int no1 = sc.nextInt();    // nextInt() reads the next int from the keyboard

        System.out.println("Enter second no: ");
        int no2 = sc.nextInt();

        System.out.println("Enter required operation[+,-,*,/]: ");
        char operator = sc.next().charAt(0);
        
        if(operator == '+' || operator == '-' || operator == '*' || operator == '/') {
            int res = calculate(no1, no2, operator);
            System.out.println(no1 + " " + operator + " " + no2 + " = " + res);
        } else {
            System.out.println("Invalid Operation");
        }
        sc.close();
    }
    // method to perform operations
    static int calculate(int x, int y, char operator) {
        int res = 0;

        switch(operator)     // switch case for each of the operations
        {
            case '+':
            res = x + y;
            break;
            case '-':
            res = x - y;
            break;
            case '*':
            res = x * y;
            break;
            case '/':
            res = x / y;
            break;
        } // switch

        return res;
    } // method calculate
} //class