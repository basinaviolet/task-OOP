package by.htp.homework.State;

import java.util.ArrayList;
import java.util.List;

public class StateAggregator {

	void cityFiller(List<City> cityList) {
		cityAdd(cityList, "Minsk", "MINSKIY", 348.84);
		cityAdd(cityList, "Borisov", "MINSKIY", 46);
		cityAdd(cityList, "Molodechno", "MINSKIY", 33.49);
		cityAdd(cityList, "Sluck", "MINSKIY", 30.5);
		cityAdd(cityList, "Brest", "BRESTSKIY", 146.12);
		cityAdd(cityList, "Baranovichi", "BARANOVICHSKIY", 84.96);
		cityAdd(cityList, "Pinsk", "PINSKIY", 46.36);
		cityAdd(cityList, "Korbin", "BRESTSKIY", 36.6);
		cityAdd(cityList, "Grodno", "GRODNENSKIY", 141.98);
		cityAdd(cityList, "Lida", "LIDSKIY", 45.79);
		cityAdd(cityList, "Slonim", "GRODNENSKIY", 40.82);
		cityAdd(cityList, "Gomel", "GOMELSKIY", 138.77);
		cityAdd(cityList, "Mozyr", "MOZYRSKIY", 44.18);
		cityAdd(cityList, "Zlobin", "GOMELSKIY", 32.92);
		cityAdd(cityList, "Vitebsk", "VITEBSKIY", 134.6);
		cityAdd(cityList, "Novopolock", "POLOCKIY", 57.27);
		cityAdd(cityList, "Polock", "POLOCKIY", 45.03);
		cityAdd(cityList, "Mogilev", "MOGILEVSKIY", 118.5);
		cityAdd(cityList, "Bobrujsk", "BOBRUYSKIY", 118.5);
		cityAdd(cityList, "Orsha", "ORSHANSKIY", 38.9);
		cityAdd(cityList, "Narovlja", "NAROVLANSKIY", 20);
		cityAdd(cityList, "Volkovysk", "VOLKOVYSSKIY", 29);
		cityAdd(cityList, "Zodino", "ZODINSKIY", 23.2);
		cityAdd(cityList, "Logojsk", "LOGOYSKIY", 15);
		cityAdd(cityList, "Nesviz", "NESVIZSKIY", 15);
		cityAdd(cityList, "Borisov", "BORISOVSKIY", 25);
	}

	void regionFiller(List<City> cityList, List<StateBase> regionList) {

		// List<StateBase> districtList, String name, String includedIn, double area,
		// String mainCity, List<String> regionLis
		regionAdd(regionList, "BRESTSKIY", Regions.BRESTSKIY.getRegionName(), Regions.BRESTSKIY.getArea(),
				Regions.BRESTSKIY.getMainCity(), regionCityFiller(cityList, "BRESTSKIY"));
		regionAdd(regionList, "BARANOVICHSKIY", Regions.BARANOVICHSKIY.getRegionName(),
				Regions.BARANOVICHSKIY.getArea(), Regions.BARANOVICHSKIY.getMainCity(),
				regionCityFiller(cityList, "BARANOVICHSKIY"));
		regionAdd(regionList, "PINSKIY", Regions.BRESTSKIY.getRegionName(), Regions.PINSKIY.getArea(),
				Regions.PINSKIY.getMainCity(), regionCityFiller(cityList, "PINSKIY"));
		regionAdd(regionList, "VITEBSKIY", Regions.BRESTSKIY.getRegionName(), Regions.VITEBSKIY.getArea(),
				Regions.VITEBSKIY.getMainCity(), regionCityFiller(cityList, "VITEBSKIY"));
		regionAdd(regionList, "POLOCKIY", Regions.BRESTSKIY.getRegionName(), Regions.POLOCKIY.getArea(),
				Regions.POLOCKIY.getMainCity(), regionCityFiller(cityList, "POLOCKIY"));
		regionAdd(regionList, "ORSHANSKIY", Regions.BRESTSKIY.getRegionName(), Regions.ORSHANSKIY.getArea(),
				Regions.ORSHANSKIY.getMainCity(), regionCityFiller(cityList, "ORSHANSKIY"));
		regionAdd(regionList, "GOMELSKIY", Regions.BRESTSKIY.getRegionName(), Regions.GOMELSKIY.getArea(),
				Regions.GOMELSKIY.getMainCity(), regionCityFiller(cityList, "GOMELSKIY"));
		regionAdd(regionList, "MOZYRSKIY", Regions.BRESTSKIY.getRegionName(), Regions.MOZYRSKIY.getArea(),
				Regions.MOZYRSKIY.getMainCity(), regionCityFiller(cityList, "MOZYRSKIY"));
		regionAdd(regionList, "NAROVLANSKIY", Regions.BRESTSKIY.getRegionName(), Regions.NAROVLANSKIY.getArea(),
				Regions.NAROVLANSKIY.getMainCity(), regionCityFiller(cityList, "NAROVLANSKIY"));
		regionAdd(regionList, "GRODNENSKIY", Regions.BRESTSKIY.getRegionName(), Regions.GRODNENSKIY.getArea(),
				Regions.GRODNENSKIY.getMainCity(), regionCityFiller(cityList, "GRODNENSKIY"));
		regionAdd(regionList, "VOLKOVYSSKIY", Regions.BRESTSKIY.getRegionName(), Regions.VOLKOVYSSKIY.getArea(),
				Regions.VOLKOVYSSKIY.getMainCity(), regionCityFiller(cityList, "VOLKOVYSSKIY"));
		regionAdd(regionList, "LIDSKIY", Regions.BRESTSKIY.getRegionName(), Regions.LIDSKIY.getArea(),
				Regions.LIDSKIY.getMainCity(), regionCityFiller(cityList, "LIDSKIY"));
		regionAdd(regionList, "MINSKIY", Regions.BRESTSKIY.getRegionName(), Regions.MINSKIY.getArea(),
				Regions.MINSKIY.getMainCity(), regionCityFiller(cityList, "MINSKIY"));
		regionAdd(regionList, "ZODINSKIY", Regions.BRESTSKIY.getRegionName(), Regions.ZODINSKIY.getArea(),
				Regions.ZODINSKIY.getMainCity(), regionCityFiller(cityList, "ZODINSKIY"));
		regionAdd(regionList, "ZODINSKIY", Regions.BRESTSKIY.getRegionName(), Regions.ZODINSKIY.getArea(),
				Regions.ZODINSKIY.getMainCity(), regionCityFiller(cityList, "ZODINSKIY"));
		regionAdd(regionList, "LOGOYSKIY", Regions.BRESTSKIY.getRegionName(), Regions.LOGOYSKIY.getArea(),
				Regions.LOGOYSKIY.getMainCity(), regionCityFiller(cityList, "LOGOYSKIY"));
		regionAdd(regionList, "BORISOVSKIY", Regions.BRESTSKIY.getRegionName(), Regions.BORISOVSKIY.getArea(),
				Regions.BORISOVSKIY.getMainCity(), regionCityFiller(cityList, "BORISOVSKIY"));
		regionAdd(regionList, "NESVIZSKIY", Regions.BRESTSKIY.getRegionName(), Regions.NESVIZSKIY.getArea(),
				Regions.NESVIZSKIY.getMainCity(), regionCityFiller(cityList, "NESVIZSKIY"));
		regionAdd(regionList, "MOGILEVSKIY", Regions.BRESTSKIY.getRegionName(), Regions.MOGILEVSKIY.getArea(),
				Regions.MOGILEVSKIY.getMainCity(), regionCityFiller(cityList, "MOGILEVSKIY"));
		regionAdd(regionList, "BOBRUYSKIY", Regions.BRESTSKIY.getRegionName(), Regions.BOBRUYSKIY.getArea(),
				Regions.BOBRUYSKIY.getMainCity(), regionCityFiller(cityList, "BOBRUYSKIY"));

	}

	void districtFiller(List<StateBase> regionList, List<StateBase> districtList) {
		List<String> brestList = childrenInParentFiller(regionList, "BRESTSKAY");
		List<String> vitebskList = childrenInParentFiller(regionList, "VITEBSKAY");
		List<String> gomelList = childrenInParentFiller(regionList, "GOMELSKAY");
		List<String> grodnoList = childrenInParentFiller(regionList, "GRODNENSKAY");
		List<String> minskList = childrenInParentFiller(regionList, "MINSKAY");
		List<String> mogilevList = childrenInParentFiller(regionList, "MOGILEVSKAY");

		districtAdd(districtList, "BRESTSKAY", "Belarus", Districts.BRESTSKAY.getArea(),
				Districts.BRESTSKAY.getMainCity(), brestList);
		districtAdd(districtList, "VITEBSKAY", "Belarus", Districts.VITEBSKAY.getArea(),
				Districts.VITEBSKAY.getMainCity(), vitebskList);
		districtAdd(districtList, "GOMELSKAY", "Belarus", Districts.GOMELSKAY.getArea(),
				Districts.GOMELSKAY.getMainCity(), gomelList);
		districtAdd(districtList, "GRODNENSKAY", "Belarus", Districts.GRODNENSKAY.getArea(),
				Districts.GRODNENSKAY.getMainCity(), grodnoList);
		districtAdd(districtList, "MINSKAY", "Belarus", Districts.MINSKAY.getArea(), Districts.MINSKAY.getMainCity(),
				minskList);
		districtAdd(districtList, "MOGILEVSKAY", "Belarus", Districts.MOGILEVSKAY.getArea(),
				Districts.MOGILEVSKAY.getMainCity(), mogilevList);

	}

	StateBase stateFiller(List<StateBase> districtList, String state) {

		return stateAdd(state, "null", 207600, "Minsk", childrenInParentFiller(districtList, "Belarus"));
	}

	// �?пи�?ок городов в регионе
	List<String> regionCityFiller(List<City> cityList, String regionName) {
		List<String> cityInRegion = new ArrayList<String>();

		for (City cityInList : cityList) {
			if (cityInList.getIncludedIn() == regionName) {
				cityInRegion.add(cityInList.getName());
			}
		}

		return cityInRegion;
	}

	// �?пи�?ок "детей" в родитель�?кой иерархии
	List<String> childrenInParentFiller(List<StateBase> childrenList, String parentsName) {

		List<String> childrenInParentList = new ArrayList<String>();
		for (StateBase itemInList : childrenList) {
			if (itemInList.getIncludedIn() == parentsName) {
				childrenInParentList.add(itemInList.getName());
			}
		}

		return childrenInParentList;
	}

	// новый город
	void cityAdd(List<City> cityList, String city, String region, double area) {
		cityList.add(new City(city, region, area));
	}

	// StateBase(String name, String includedIn, float area, String mainCity,
	// List<String> includeList)
	void regionAdd(List<StateBase> regionList, String name, String includedIn, double area, String mainCity,
			List<String> childrenList) {
		regionList.add(new StateBase(name, includedIn, area, mainCity, childrenList));
	}

	void districtAdd(List<StateBase> districtList, String name, String includedIn, double area, String mainCity,
			List<String> childrenList) {
		districtList.add(new StateBase(name, includedIn, area, mainCity, childrenList));
	}

	StateBase stateAdd(String name, String includedIn, double area, String mainCity, List<String> childrenList) {
		return new StateBase(name, includedIn, area, mainCity, childrenList);
	}

}
