package com.knoldus;

import java.util.Scanner;

public class Main {


        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the FirstInterger number=");
            String FirstInteger = sc.nextLine();
            System.out.print("Enter the SecondInterger number=");
            String SecondInteger = sc.nextLine();

            IntegerMax object = new IntegerMax();
            int result= object.CalculatingMax(FirstInteger,SecondInteger);

            System.out.println("FirstInteger=" +FirstInteger  + " "+"SecondInteger="  +SecondInteger  + " " + "Max of them is ="+ result);

        }
    }


