package by.htp.homework.State;

import java.util.ArrayList;
import java.util.List;

public class StateMain {

	public static void main(String[] args) {

		StateAggregator newItem = new StateAggregator();
		StateView view = new StateView();

		StateBase state;
		List<StateBase> district = new ArrayList<StateBase>();
		List<StateBase> region = new ArrayList<StateBase>();
		List<City> city = new ArrayList<City>();

		newItem.cityFiller(city);
		newItem.regionFiller(city, region);
		newItem.districtFiller(region, district);
		state = newItem.stateFiller(district, "Belarus");

		System.out.println(view.printState(state.toString(), district));

	}

}
