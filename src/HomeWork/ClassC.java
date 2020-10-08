package HomeWork;
import java.util.Scanner;
public class ClassC {
    int a;
    int b;
    int c;

    public int InputA() {
        System.out.println("Enter number A: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        return a;
    }

    public int InputB() {
        System.out.println("Enter number B: ");

        Scanner sc = new Scanner(System.in);
        b = sc.nextInt();
        return b;
    }

    public int InputC() {
        System.out.println("Enter number C");

        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        return c;
    }

    public int LastDigitA() {
        int last = a % 10;
        return last;

    }

    public int FirstDigit(){
        while (b >= 10) {
            b /= 10;
        }
        return b;
    }

    public int Sum(){

        int sum = 0;
        while (c != 0)
        {
            sum = sum + c % 10;
            c = c/10;
        }
        return sum;
    }

    public int MethodFive(){
        int mul;
        mul = LastDigitA()*FirstDigit();
        return mul;
    }

    public int MethodSix(){
        int sum2 = FirstDigit()+MethodFive();
        return sum2;
    }

}


class Calculate {
        public static void main(String[] args){
                ClassC myObj = new ClassC();
                myObj.InputA();
                myObj.InputB();
                myObj.InputC();
                int lastdigit = myObj.LastDigitA();
                System.out.println("2. Last  digit of A number is: " + lastdigit);
                int firstdigit = myObj.FirstDigit();
                System.out.println("3. First  digit of B number is: " + firstdigit);
                int sum = myObj.Sum();
                System.out.println("4. Sum of the digites of C number is: " + sum);
                int mul1 = myObj.MethodFive();
                System.out.println("5. Mul of methond 2 and method 3 is -> : " + mul1);
                int sum3 = myObj.MethodSix();
                System.out.println("6. Sum of methond 3 and method 5 is -> : " + sum3);
        }

}

