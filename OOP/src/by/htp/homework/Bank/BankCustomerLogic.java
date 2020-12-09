package by.htp.homework.Bank;

import java.util.ArrayList;
import java.util.List;

public class BankCustomerLogic {

	// List<String> accNumList = new ArrayList<String>();

	String setAccNumber(List<String> accNumList) {

		double i;
		int k = 0;
		String num = "";
		do {

			k = 1;
			i = Math.random();
			num = "" + (int) (1000000000 * i);

			if (accNumList.size() == 0) {
				k = 1;
			} else {
				for (String s : accNumList) {
					if (s.compareTo(num) == 0) {
						k = 1;
					}
				}
			}
		} while (k < 1);

		accNumList.add(num);

		return num;
	}

	String setAccPassport(List<String> accPasList) {

		double i;
		int k = 0;
		String num = "";
		String[] seria = { "BA", "PC", "BU", " PU", "KA", "NI", "PY", "NU", "DI", "KS" };

		do {

			k = 1;
			i = Math.random();
			num = seria[(int) (10 * i)] + (int) (100000 * i);

			if (accPasList.size() == 0) {
				k = 1;
			} else {
				for (String s : accPasList) {
					if (s.compareTo(num) == 0) {
						k = 1;
					}
				}
			}
		} while (k < 1);

		accPasList.add(num);

		return num;
	}

	float setAccSum() {

		int k = 10;
		double i = Math.random();

		switch ((int) (k * i) % 5) {
		case 0:
			k = -k;
			break;
		case 1:
			k = k * 10;
			break;
		case 2:
			k = k * 100;
			break;
		case 3:
			k = k * 10 * (-1);
			break;
		case 4:
			k = k * 100 * (-1);
			break;
		default:
			k = k * 1000;
			break;
		}
		return (float) (k * i);
	}

	BankCustomer serchByAcc(String acc, List<BankCustomer> list) {
		BankCustomer customer = null;
		String temp;
		for (BankCustomer obj : list) {
			temp = obj.getAccountNum();
			if (temp.compareTo(acc) == 0) {
				customer = obj;
			}
		}
		return customer;
	}

	/*
	 * BankCustomer serchByPassp (String passp, List<BankCustomer> list) {
	 * BankCustomer customer = null; String temp; for (BankCustomer obj : list) {
	 * temp = obj.getAccountNum(); if (temp.compareTo(passp) == 0) { customer = obj;
	 * } } return customer; }
	 * 
	 * List<BankCustomer> summaBal (String passport, List<BankCustomer> list) {
	 * List<BankCustomer> listByPassport = new ArrayList<BankCustomer>();
	 * 
	 * return listByPassport; }
	 */

	float summaBal(int indicatir, List<BankCustomer> list) {
		List<BankCustomer> indicatorList = new ArrayList<BankCustomer>();
		float sum = 0;
		float tempBal;
		for (BankCustomer s : list) {
			tempBal = (s.getAccBalance());
			if (s.isAccBlock()) { //not count block account
				if ((indicatir < 0) && (tempBal < 0)) {
					sum += tempBal;
				}
				if ((indicatir > 0) && (tempBal > 0)) {
					sum += tempBal;
				}
				if (indicatir == 0) {
					sum += tempBal;
				}
			}
		}

		return sum;
	}

	void block(String str, List<BankCustomer> list) {
		BankCustomer customer = serchByAcc(str, list);
		if (customer == null) {
			System.out.print("Can`t find account: " + str);
		} else {
			BankCustomerView printStr = new BankCustomerView();
			printStr.print(customer, "\n changing block. befor: ");
			if (customer.isAccBlock()) {
				System.out.println("is blocked");
			} else {
				customer.setAccBlock(true);
				printStr.print(customer, "\n changing block. after: ");
			}
		}

	}

	void unblock(String str, List<BankCustomer> list) {
		BankCustomer customer = serchByAcc(str, list);
		if (customer == null) {
			System.out.print("Can`t find account: " + str);
		} else {
			BankCustomerView printStr = new BankCustomerView();
			printStr.print(customer, "\n changing unblock. befor: ");
			if (!customer.isAccBlock()) {
				System.out.println("is unblocked");
			} else {
				customer.setAccBlock(false);
				printStr.print(customer, "\n changing block. after: ");
			}
		}
	}

}
