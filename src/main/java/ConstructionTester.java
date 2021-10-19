package main.java;
import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        // Start here!
        System.out.println("Enter the sales tax rate:");
        Scanner tax = new Scanner(System.in);
        double taxNum = tax.nextDouble();
        System.out.println(tax);
        System.out.println("How many boards do you need?");
        Scanner boards = new Scanner(System.in);
        int boardsNum = boards.nextInt();
        System.out.println(boards);
        System.out.println("How many windows do you need?");
        Scanner windows = new Scanner(System.in);
        int windowsNum = windows.nextInt();
        System.out.println(windows);



        Construction con = new Construction(8, 11, taxNum);

        double lumberCost = con.lumberCost(boardsNum);
        double windowCost = con.windowCost(windowsNum);

        double total = lumberCost + windowCost;
        double grandTotal = con.grandTotal(total);


        System.out.println("Total: " + total);
        System.out.println("Grand Total: " + grandTotal);
    }
}
