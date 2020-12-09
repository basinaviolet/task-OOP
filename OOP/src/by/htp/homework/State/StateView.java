package by.htp.homework.State;

import java.util.List;

import java.util.ArrayList;

public class StateView {

	public String printState(String printStr, List<StateBase> baseToPrintList) {

		List<String> printList = new ArrayList<String>();
		printStr = printStr.replaceAll("children", "district");
		for (StateBase object : baseToPrintList) {
			printList.add(object.getMainCity()); // get main city of district and its name;

		}
		return printStr + "[" + String.join(", ", printList) + "]";
	}
}
