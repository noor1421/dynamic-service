package com.Wecoodee.NewDummyProject.dto;

public enum EnumData {

	Disabled("D"), Enabled("E"),

	// checking access
	DISABLED("D"), ENABLED("E"), INACTIVE("I"),

	DISABLED_APPLICATION("DISABLED"), ENABLED_APPLICATION("ENABLED");

	private String name;

	private EnumData(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
