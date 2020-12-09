package by.htp.homework.Bank;

import java.util.Comparator;

class BankCustomerCompAccount implements Comparator<BankCustomer>{

	@Override
	public int compare(BankCustomer arg0, BankCustomer arg1) {
		String str1 = arg0.getAccountNum();
		String str2 = arg1.getAccountNum();
		return str1.compareTo(str2);
	}

}
class BankCustomerCompBallance implements Comparator<BankCustomer>{

	@Override
	public int compare(BankCustomer arg0, BankCustomer arg1) {
		float bal1 = arg0.getAccBalance();
		float bal2 = arg1.getAccBalance();
		
		if (bal1 > bal2) {return 1;}
		else if (bal1 < bal2) {return -1;}
		else {return 0;}
	}

}

