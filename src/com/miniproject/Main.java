package com.miniproject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(":::::::Welcome to guess number game ::::::");
        System.out.println("In this game you have to guess the number from 1 to 100 which is generated by computer.");
        System.out.println("After guessing, the computer will alert you if your chosen number is wrong. The game continues until you find the correct number.");
        System.out.println("If you want to exit the game press any negative number, you will automatically exit the game and you will know the correct number.");
        System.out.println(".....................................................................................................................................");
        Scanner sc=new Scanner(System.in);
        int mynumber=(int)(Math.random()*100);
        int usernumber=0;
        do{
            System.out.println("Guess the number");
            usernumber= sc.nextInt();

            if(usernumber==mynumber){
                System.out.println("Yesss.....! , correct number! ");
                break;
            }
            else if (usernumber>mynumber) {
                System.out.println("oh no!, it is too large number");

            }
            else {
                System.out.println("NO NO ! it is too small number");
            }
        }while (usernumber >=0);

        System.out.println(" My number was:");
        System.out.println(mynumber);


    }
}