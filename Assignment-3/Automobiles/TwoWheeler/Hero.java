package Automobiles.TwoWheeler;

import Automobiles.Vehicle;

public abstract class Hero extends Vehicle{
	private String ModelName;
	private String RegistrationNumber;
	private String OwnerName;
	private int Speed;
	
	public Hero(String ModelName, String RegistrationNumber,String OwnerName,int Speed) {
		super();
		this.ModelName = ModelName;
		this.RegistrationNumber = RegistrationNumber;
		this.OwnerName = OwnerName;
		this.Speed = Speed;
	}
	@Override
	public void getModelName()
	{
		System.out.println("The model name is "+ModelName+". ");
	}
	@Override
	public void getRegistrationNumber()
	{
		System.out.println("The registration number is: "+RegistrationNumber+" .");
	}
	@Override
	public void getOwnerName()
	{
		System.out.println("The name of the owner is: "+OwnerName+" .");
	}
	public void getSpeed()
	{
		System.out.println("The current speed is: "+Speed+". ");
	}
	public void getradio()
	{
		System.out.println("Accessing the radio");
	}
}