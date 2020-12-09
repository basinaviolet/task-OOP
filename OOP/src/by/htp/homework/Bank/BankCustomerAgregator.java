package by.htp.homework.Bank;

import java.util.List;
import java.util.ArrayList;

class BankCustomerAgregator {

	private List<BankCustomer> agrList;

	public BankCustomerAgregator() {
		agrList = new ArrayList<BankCustomer>();
	}

	public void add(BankCustomer nc) {
		agrList.add(nc);
	}

	// базовый
	public BankCustomer newCustomer(String name, String middleName, String surName, List<String> accList,
			List<String> passpList, int blockLim) {

		boolean accBlock = false;

		BankCustomerLogic temp = new BankCustomerLogic();

		String accNum = temp.setAccNumber(accList); // задать номер �?чета
		String custPassport = temp.setAccPassport(passpList); // задать номер па�?порта
		float accBalance = temp.setAccSum(); // задать �?умму баллан�?а

		if (accBalance <= blockLim) {
			accBlock = true; // block
		} else {
			accBlock = false;
		}

		// (String accountNum, String name, String middleName, String surName, String
		// custPassport, float accBalance, boolean accBlock)
		return new BankCustomer(accNum, name, middleName, surName, custPassport, accBalance, accBlock);
	}
	
	// �? заданным номером �?чета
	public BankCustomer newCustomer(String name, String middleName, String surName, String accNum,
			List<String> passpList, int blockLim) {

		boolean accBlock = false;

		BankCustomerLogic temp = new BankCustomerLogic();

		String custPassport = temp.setAccPassport(passpList); // задать номер па�?порта
		float accBalance = temp.setAccSum(); // задать �?умму баллан�?а

		if (accBalance <= blockLim) {
			accBlock = true; // block
		} else {
			accBlock = false;
		}

		// (String accountNum, String name, String middleName, String surName, String
		// custPassport, float accBalance, boolean accBlock)
		return new BankCustomer(accNum, name, middleName, surName, custPassport, accBalance, accBlock);
	}
	
	// �? заданным номером па�?порта
	public BankCustomer newCustomer(String name, String middleName, String surName, List<String> accList,
			String custPassport, int blockLim) {

		boolean accBlock = false;

		BankCustomerLogic temp = new BankCustomerLogic();

		String accNum = temp.setAccNumber(accList); // задать номер �?чета
		float accBalance = temp.setAccSum(); // задать �?умму баллан�?а

		if (accBalance <= blockLim) {
			accBlock = true; // block
		} else {
			accBlock = false; // unblock
		}

		// (String accountNum, String name, String middleName, String surName, String
		// custPassport, float accBalance, boolean accBlock)
		return new BankCustomer(accNum, name, middleName, surName, custPassport, accBalance, accBlock);
	}

	// �? заданным номером �?чета и па�?порта
		public BankCustomer newCustomer(String name, String middleName, String surName, String accNum,
				String custPassport, int blockLim) {

			boolean accBlock = false;

			BankCustomerLogic temp = new BankCustomerLogic();

			float accBalance = temp.setAccSum(); // задать �?умму баллан�?а

			if (accBalance <= blockLim) {
				accBlock = true; // block
			} else {
				accBlock = false;
			}

			// (String accountNum, String name, String middleName, String surName, String
			// custPassport, float accBalance, boolean accBlock)
			return new BankCustomer(accNum, name, middleName, surName, custPassport, accBalance, accBlock);
		}

}