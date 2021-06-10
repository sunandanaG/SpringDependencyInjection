package com.vm.entity;

public class Restuarant 
{
	String name;
	IHotDrink ihotdrink;
	
	
	
	public void setName(String name) {
		this.name = name;
	}



	public void setIhotdrink(IHotDrink ihotdrink) {
		this.ihotdrink = ihotdrink;
	}



	public void displayRestraunt()
	{
		System.out.println("name is:"+name);
		ihotdrink.prepare();
		
	}

}
