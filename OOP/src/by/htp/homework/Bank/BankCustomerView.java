package by.htp.homework.Bank;

import java.util.List;

public class BankCustomerView {
	public void print(List<BankCustomer> customerList, String str) {
		System.out.println(str);
		for (BankCustomer s : customerList) {
			System.out.println(s);
		}
	}
	
	public void print(BankCustomer customer, String str) {
		System.out.println(str);
			System.out.println(customer);		
	}

}
