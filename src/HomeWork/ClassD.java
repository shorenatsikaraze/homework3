package HomeWork;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;
public class ClassD {

    public static void main(String[] args) {
        int sumEeven = 0;
        int sumOdd = 0;
        System.out.println("Enter numbers");
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int finish = sc.nextInt();
        if(finish<start){
            int t = start;
            start = finish;
            finish = t;
        }


        Random objGenerator = new Random();

        List<Integer> Evennumbers = new ArrayList<Integer>();
        List<Integer> Oddnumbers = new ArrayList<Integer>();

        for (int i = 0; i < 40; i++) {
            int randomNumbers = start + objGenerator.nextInt(finish - start);
//            System.out.println(randomNumbers);

            if (randomNumbers % 2 == 0) {
                System.out.println(randomNumbers + " -> Number is Even\n");
                Evennumbers.add(randomNumbers);
            } else {
                System.out.println(randomNumbers + " -> Number is Odd\n");
                Oddnumbers.add(randomNumbers);
            }
        }

        int EvenSize = Evennumbers.size();
        int OddSize = Oddnumbers.size();
        System.out.println("Even numbers ->" + EvenSize+'\n');
        System.out.println("Odd numbers ->" + OddSize+'\n');


        for (int x : Evennumbers) {
            sumEeven += x;
        }
        System.out.println("Sum of even numbers -> " + sumEeven+'\n');
        for (int y : Oddnumbers) {
            sumOdd += y;
        }
        System.out.println("Sum of odd numbers -> " + sumOdd+'\n');



        System.out.println("Five random numbers: ");
        if (sumOdd > sumEeven) {
            for (int i1 = 0; i1 < 5; i1++) {
                int SumrandomNumbers = sumEeven + objGenerator.nextInt(sumOdd - sumEeven);
                System.out.println(SumrandomNumbers);
            }
        } else {
            for (int i1 = 0; i1 < 5; i1++) {
                int SumrandomNumbers = sumOdd + objGenerator.nextInt(sumEeven - sumOdd);
                System.out.println(SumrandomNumbers);
            }


        }
    }

}