package at.ac.fhcampuswien;

import java.util.Random;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class App {
    // Implement all methods as public static

    public static void oneMonthCalendar(int days, int firstDay)
    {
        int spaces;
        spaces = (firstDay-1)%7;
        for(int i=0; i<spaces; i++)
        {
            System.out.print("   ");
        }
        for (int j=1; j<=days;j++)
        {
            if(j<10)
            {
                System.out.print(" ");
            }
            System.out.printf("%1d ", j);
            if (((j + spaces) % 7 == 0) || (j == days))
            {
                System.out.println();
            }
        }
    }
    public static long[] lcg (long x0)
    {
        long[] array1 = new long[10];
        long m,c,a;

        m=(long) Math.pow(2,31); //(long) weil pow Methode double ausgibt
        c= 12345L;
        a= 1103515245L;

        for(int i=0;i<=9;i++)
        {
            if(i==0)
            {
                array1[0]=(((a*x0)+c)%m);
            }
            else
            {
                array1[i]= (((a*array1[i-1])+c)%m);
            }
                System.out.println("Array an der Stelle "+i+": "+array1[i]);
        }
        return array1;
    }
    public static void guessingGame(int numberToGuess)
    {
        Scanner scanner = new Scanner(System.in);
        final int MAX = 10;
        int counter=0;
        int userNum;

        for(int i=0;i<MAX;i++)
        {
            System.out.print("Guess number "+(counter+1)+": ");
            userNum = scanner.nextInt();
            if(i==MAX-1 && userNum!= numberToGuess)
            {
                System.out.println("You lost! Have you ever heard of divide & conquer?");
                break;
            }
            if (userNum< numberToGuess)
            {
                System.out.println("The number AI picked is higher than your guess.");
                counter++;
            }
            if (userNum> numberToGuess)
            {
                System.out.println("The number AI picked is lower than your guess.");
                counter++;
            }
            if (userNum== numberToGuess)
            {
                System.out.println("You won wisenheimer!");
                break;
            }
        }
    }
    public static int randomNumberBetweenOneAndHundred()
    {
        Random r = new Random();
        int min = 1;
        int max = 100;
        int ranNum;
        ranNum = r.nextInt(max) +min;
        return ranNum;
    }
    public static boolean swapArrays (int[] array1, int[] array2)
    {

        if(array1.length!=array2.length)
        {
            return false;
        }
        for (int i =0;i<array1.length;i++)
        {
            array1[i]= array1[i]+array2[i]; //Zuerst alle zusammen in arr1
            array2[i]= array1[i]-array2[i];//In arr 2 neues arr1 - altes arr2
            array1[i]= array1[i]-array2[i];//Zum Schluss Neues arr1 - neues arr2
        }
        System.out.print("Array1 => ");
        for (int output: array1)
        {
            System.out.println(output);
        }
        System.out.print("Array2 => ");
        for (int output: array2)
        {
            System.out.println(output);
        }
        return true;
    }
    public static String camelCase(String input)
    {
        String String;
        return String="";
    }
    public static int checkDigit(int[] code)
    {
        int sum=0;
        int numbers;
        int weight;
        int pruefNum;
        for (int i=0;i<code.length;i++)
        {
            numbers=code[i];
            weight = i+2;
            sum +=numbers*weight;
        }
        pruefNum = sum % 11;
        pruefNum = 11- pruefNum;
        if(pruefNum==10)
        {
            pruefNum = 0;
        } else if (pruefNum==11)
        {
            pruefNum=5;
        }
        return pruefNum;
    }
    public static void main(String[] args) {
        // test your method implementations here
        // make method calls
        // print their results
        // etc.
        int random;
        oneMonthCalendar(30,5);
        lcg(1);
        random=randomNumberBetweenOneAndHundred();
        guessingGame(random);
    }
}