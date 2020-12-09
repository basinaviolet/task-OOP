package by.htp.homework.Bank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//import by.htp.homework.taskOOP.BankCustomerAgregator;

//import by.htp.classwork.book.Book;

public class BankCustomerMain {

	public static void main(String[] args) {
		
		List<BankCustomer> customerList = new ArrayList<BankCustomer>();
		int blockSum = 0;
		List<String> accNumList = new ArrayList<String>();
		List<String> passportList = new ArrayList<String>();
		
		String acc1 = "211558521";
		String acc2 = "238654371";
		String acc3 = "23865437";
		
		String account[] = {acc1, acc2};
		String passport = "PU395530";
		
		for (int i = 0; i < account.length ; i++) {
			accNumList.add(account[i]);
		}
		passportList.add(passport);
		
		BankCustomerAgregator customerListAgr = new BankCustomerAgregator();
		BankCustomerLogic logicList = new BankCustomerLogic();
		BankCustomerView printList = new BankCustomerView();
		
		
		//(String accountNum, String name, String middleName, String surName, String custPassport, float accBalance, boolean accBlock)
		//newCustomer (String name, String middleName, String surName, List<String> accList, List<String> passpList, int blockLim)
		customerList.add(customerListAgr.newCustomer("Oscar", "No1", "Wilde", acc1, passportList, blockSum)); //acc1
		customerList.add(customerListAgr.newCustomer("Bram", "No", "Stoker", acc2, passport, blockSum)); //acc2 + passport
		customerList.add(customerListAgr.newCustomer("Newmark", "No", "Twain", accNumList, passportList, blockSum));
		customerList.add(customerListAgr.newCustomer("Mark", "No", "Twain", accNumList, passport, blockSum)); //passport
		customerList.add(customerListAgr.newCustomer("Agatha", "No", "Christie", accNumList, passportList, blockSum));
		customerList.add(customerListAgr.newCustomer("Jerome", "K", "Jerome", accNumList, passportList, blockSum));
		customerList.add(customerListAgr.newCustomer("Scott", "No", "Fitzgerald", accNumList, passportList, blockSum));
		customerList.add(customerListAgr.newCustomer("George", "No", "Orwell", accNumList, passportList, blockSum));

		
		/*
		 * for (String k : accNumList) { System.out.println("/ " + k + " - " + k); } 
		 * for (String k : passportList) { System.out.println("/ " + k + " - " + k); }
		 */
		
		printList.print(customerList, "\nFirst preview: ");
		
		Collections.sort(customerList);
		printList.print(customerList, "\nSorted by default preview: ");
		
		Collections.sort(customerList, new BankCustomerCompAccount());
		printList.print(customerList, "\nSorted by account preview: ");
		
		
		System.out.println ("\nSerch a customer with account number: " + acc1);
		BankCustomer customerAcc = logicList.serchByAcc (acc1, customerList);
		if (customerAcc == null) {
			System.out.print("Can`t find account: " + acc1);
		} else {
		printList.print (customerAcc, "the custimer is");
		}
		
		System.out.println ("\nSerch a customer with account number: " + acc3);
		customerAcc = logicList.serchByAcc (acc3, customerList);
		if (customerAcc == null) {
			System.out.print("Can`t find account: " + acc3);
		} else {
		printList.print (customerAcc, "changing unblock. befor: ");
		}
		/*
		System.out.println ("\nSerch all accounts of customer: ");
		BankCustomer customerBalanceSum = logicList.summaBal (passport, customerList); //-1 - баллан�? отрицательных �?четов. 1 - баллан�? положительных �?четов
		if (customerAcc == null) {
			System.out.print("Can`t find account: " + acc1);
		} else {
		printList.print (customerAcc, "the custimer is");
		}
		*/
		float sum;
		sum = logicList.summaBal (-1, customerList); //-1 - баллан�? отрицательных �?четов. 
		System.out.println ("\nSum of negative account balances: " + sum);
		
		sum = logicList.summaBal (1, customerList); //-1 - баллан�? отрицательных �?четов. 
		System.out.println ("Sum of positive account balances: " + sum);
		
		sum = logicList.summaBal (0, customerList); //0 - баллан�? в�?ех �?четов. 
		System.out.println ("Sum of all balances: " + sum);
		
		
		System.out.println ("\n\nBlock - unblick: ");
		logicList.block (acc1, customerList);	
		logicList.unblock (acc2, customerList);	
		
		printList.print(customerList, "\nSorted after un-/ blocked: ");
}
	
}
