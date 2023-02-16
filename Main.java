package com.atmproject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AtmOpretionInterface atm = new AtmOpretion();

        int atmNumber =12345;
        int atmPin = 1234;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to AtmMachine");
        System.out.print("Enter you correct Atm Number: ");
        int atmnumber = sc.nextInt();
        System.out.print("Enter you correct pin: ");
        int atmpin = sc.nextInt();

        if(atmNumber==atmnumber && atmPin==atmpin){
            while (true){
                System.out.println(" 1.Check your balance \n 2.Withdraw from Account \n 3.Deposite Amount \n 4.Mini Statement \n 5.exit");
                System.out.println("Enter your Options");
                int ch = sc.nextInt();
                if(ch==1){
                    atm.viewBalance();

                }else if(ch==2){
                    System.out.println("Enter Amount For withdraw");
                    double withdraw = sc.nextDouble();
                    atm.withDrawAmount(withdraw);

                }else if(ch==3){
                    System.out.println("Enter Amount you want to Deposite");
                    double deposite  = sc.nextDouble();
                    atm.depositeAmount(deposite);

                }else if(ch==4){
                    atm.viewMiniStatement();

                }else if(ch==5){
                    System.out.println("Collect your atm card!!!! ");
                    System.out.print("Rate our Services");
                    System.exit(0);
                }else {
                    System.out.print("Enter valid options");
                }
            }
        }
        else  {
            System.out.print("atm number and pin doesnt exist");
            System.exit(0);
        }
        }

    }
