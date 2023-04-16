package com.Bikkadit.dependancyWithAutowiring;

public class Address {

	private String AreaName;
	
	private String Cityname;


	public String getAreaName() {
		return AreaName;
	}


	public void setAreaName(String areaName) {
		AreaName = areaName;
	}


	public String getCityname() {
		return Cityname;
	}


	public void setCityname(String cityname) {
		Cityname = cityname;
	}


	@Override
	public String toString() {
		return "Address [AreaName=" + AreaName + ", Cityname=" + Cityname + "]";
	}

}
