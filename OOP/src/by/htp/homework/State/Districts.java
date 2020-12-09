package by.htp.homework.State;

enum Districts {
	BRESTSKAY("Brest", 32786), 
	VITEBSKAY("Vitebsk", 40051), 
	GOMELSKAY("Gomel", 40372), 
	GRODNENSKAY("Grodno", 25127),
	MINSKAY("Minsk", 39854), 
	MOGILEVSKAY("Mogilev", 29068);

	private String mainCity;
	private int area;

	Districts(String mainCity, int area) {
		this.mainCity = mainCity;
		this.area = area;
	}

	public String getMainCity() {
		return mainCity;
	}

	public void setMainCity(String mainCity) {
		this.mainCity = mainCity;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

}
