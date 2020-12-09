package by.htp.homework.State;


enum Regions {

		BRESTSKIY ("BRESTSKAY", "Brest", 1500),
		BARANOVICHSKIY ("BRESTSKAY", "Baranovichi", 2171.88),
		PINSKIY ("BRESTSKAY", "Pinsk", 3255.89),
		VITEBSKIY ("VITEBSKAY", "Vitebsk", 2705.12),
		POLOCKIY ("VITEBSKAY", "Polock", 3178.55),
		ORSHANSKIY ("VITEBSKAY", "Orsha", 1000),
		GOMELSKIY ("GOMELSKAY", "Gomel", 1951.4),
		MOZYRSKIY ("GOMELSKAY", "Mozyr", 1000),
		NAROVLANSKIY ("GOMELSKAY", "Narovlja", 1000),
		GRODNENSKIY ("GRODNENSKAY", "Grodno", 2594.05),
		VOLKOVYSSKIY ("GRODNENSKAY", "Volkovysk", 1000),
		LIDSKIY ("GRODNENSKAY", "Loda", 900),
		MINSKIY ("MINSKAY", "Minsk", 1902.66),
		ZODINSKIY ("MINSKAY", "Zodino", 1000),
		LOGOYSKIY ("MINSKAY", "Logoysk", 2365.02),
		BORISOVSKIY ("MINSKAY", "Borisov", 2987.95), 
		NESVIZSKIY ("MINSKAY", "Nesviz", 900),
		MOGILEVSKIY ("MOGILEVSKAY", "Mogilev", 1895.40),
		BOBRUYSKIY ("MOGILEVSKAY", "Bobrujsk", 700);
		
	private String regionName;
	private String mainCity;
	private double area;

	Regions(String regionName, String mainCity, double area) {
		this.regionName = regionName;
		this.mainCity = mainCity;
		this.area = area;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
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

}
