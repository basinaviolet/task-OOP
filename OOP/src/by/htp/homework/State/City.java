package by.htp.homework.State;

public class City {
	String name;
	String includedIn;
	double area;

	public City(String name, String includedIn, double area) {
		super();
		this.name = name;
		this.includedIn = includedIn;
		this.area = area;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(area);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((includedIn == null) ? 0 : includedIn.hashCode());
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
		City other = (City) obj;
		if (Double.doubleToLongBits(area) != Double.doubleToLongBits(other.area))
			return false;
		if (includedIn == null) {
			if (other.includedIn != null)
				return false;
		} else if (!includedIn.equals(other.includedIn))
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
		return " " + name + " [ includedIn " + includedIn + ",  area " + area + "]";
	}

}
