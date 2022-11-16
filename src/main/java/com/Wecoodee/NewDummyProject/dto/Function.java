package com.Wecoodee.NewDummyProject.dto;

public enum Function {

	 //function names
    APPLICATIONFORM("APPLICATIONFORM");
    
    private String name;

    private Function(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
