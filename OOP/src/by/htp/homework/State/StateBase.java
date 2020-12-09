package by.htp.homework.State;

import java.util.List;
import java.util.ArrayList;

//архитектура го�?�?удар�?тва
public class StateBase {
	String name;
	String includedIn; // родитель в иерархии
	double area;
	String mainCity;
	List<String> includeList = new ArrayList<String>(); // �?пи�?ок "детей" в иерархии

	public StateBase(String name, String includedIn, double area, String mainCity, List<String> includeList) {
		super();
		this.name = name;
		this.includedIn = includedIn;
		this.area = area;
		this.mainCity = mainCity;
		this.includeList = includeList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIncludedIn() {
		return includedIn;
	}

	public void setIncludedIn(String includedIn) {
		this.includedIn = includedIn;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public String getMainCity() {
		return mainCity;
	}

	public void setMainCity(String mainCity) {
		this.mainCity = mainCity;
	}

	public List<String> getIncludeList() {
		return includeList;
	}

	public void setIncludeList(List<String> includeList) {
		this.includeList = includeList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(area);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((includeList == null) ? 0 : includeList.hashCode());
		result = prime * result + ((includedIn == null) ? 0 : includedIn.hashCode());
		result = prime * result + ((mainCity == null) ? 0 : mainCity.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StateBase other = (StateBase) obj;
		if (Double.doubleToLongBits(area) != Double.doubleToLongBits(other.area))
			return false;
		if (includeList == null) {
			if (other.includeList != null)
				return false;
		} else if (!includeList.equals(other.includeList))
			return false;
		if (includedIn == null) {
			if (other.includedIn != null)
				return false;
		} else if (!includedIn.equals(other.includedIn))
			return false;
		if (mainCity == null) {
			if (other.mainCity != null)
				return false;
		} else if (!mainCity.equals(other.mainCity))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "State: " + name + " [capital: " + mainCity + ", count of childrens: " + includeList.size() + ", area: "
				+ area + " km^2] \nList of children`s centers: ";

	}
}
