package HomeWork;

import java.util.Scanner;

public class ClassA {
    int x;
    public ClassA(){
        System.out.println("Hello");
    }

    public int UserInput(){
        System.out.println("Enter number x: "+"\n");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        return x;
    }

    void Add(){
        int sum;
        sum = x+12;
        System.out.println("Your number plus 12 is -> "+sum+"\n");
    }

    void EvenOdd(){
        if(x%2==0){
            System.out.println("Number is Even\n");
        }
        else{
            System.out.println("Number is Odd\n");
        }
    }

}

class ClassB extends ClassA{
    int y;

    ClassB(){
        this.y = y;
    }

    public int UserInput1(){
        System.out.println("Enter number y: \n");
        Scanner sc = new Scanner(System.in);
        y= sc.nextInt();
        return y;
    }

    void Add1(){
        int sum1;
        sum1 = x+y;
        System.out.println("x + y = -> "+sum1);
    }

}

class Myclass {
    public static void main(String[] args){
        ClassA obj1 = new ClassA();
        ClassB obj2 = new ClassB();

        obj2.UserInput();
        obj2.Add();
        obj2.EvenOdd();
        obj2.UserInput1();
        obj2.Add1();
    }
}
