/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Greg Williamson
 * @version 0.1
 */
public class BankAccountTest
{
    /**
     * Test of deposit method, of class BankAccount.
     */
    @Test
    public void testDeposit()
    {
        System.out.println("deposit");
        double amount = 100.0;
        BankAccount instance = new BankAccount();
        instance.deposit(amount);
        double result = instance.getBalance();
        assertEquals(amount, result, 0.001);
    }

    /**
     * Test of withdraw method, of class BankAccount.
     */
    @Test
    public void testWithdraw()
    {
        System.out.println("withdraw");
        double amount = 1000;
        BankAccount instance = new BankAccount();
        instance.deposit(amount);
        instance.withdraw(100);
        double result = instance.getBalance();
        assertEquals(result, 899, 0.001);
    }

    /**
     * Test of getBalance method, of class BankAccount.
     */
    @Test
    public void testGetBalance()
    {
        System.out.println("getBalance");
        BankAccount instance = new BankAccount();
        double amount = 1000;
        instance.deposit(amount);
        double result = instance.getBalance();
        assertEquals(amount, result, 0.0);
    }
    
    /**
     * Test of setBalance method, of class BankAccount.
     */
    @Test
    public void testSetBalance()
    {
        System.out.println("getBalance");
        BankAccount instance = new BankAccount(100);
        //double balance = 100;
        instance.setBalance(200);
        double result = instance.getBalance();
        assertEquals(200, result, 0.0);
    }

}
