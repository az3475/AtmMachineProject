package com.atmproject;

import java.util.HashMap;
import java.util.Map;

public class AtmOpretion implements AtmOpretionInterface{
    ATM objAtm = new ATM();
    Map<Double , String> miniStatement = new HashMap<>();
    @Override
    public void viewBalance() {
        System.out.println("Your Balance is "  + objAtm.getBalance());

    }

    @Override
    public void withDrawAmount(double amount) {

        if(amount%500==0){
            if(amount<=0){
                System.out.println("please Enter valid Amount");
            }else if(amount>objAtm.getBalance()){
                System.out.println("Insufficient Balance!!!");
            }else {
                System.out.println("Collect your cash Thanks!!!");
                miniStatement.put(amount, " Withdrwan");
                objAtm.setBalance(objAtm.getBalance()-amount);
                viewBalance();

            }
        }else {
            System.out.println("Enter multiple of 500");
        }


    }

    @Override
    public void depositeAmount(double deposite) {
        miniStatement.put(deposite, " Deposited");
        System.out.println(deposite+ "\nDeposited Sucessfull");
        objAtm.setBalance(objAtm.getBalance()+deposite);
        viewBalance();

    }

    @Override
    public void viewMiniStatement() {
        for (Map.Entry<Double, String> hm : miniStatement.entrySet()){
            System.out.println(hm.getKey()+hm.getValue());
        }

    }
}
