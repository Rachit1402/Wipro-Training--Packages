package Automobiles.FourWheeler;

import Automobiles.Vehicle;

public abstract class Logan extends Vehicle{
	private String ModelName;
	private String RegistrationNumber;
	private String OwnerName;
	public int Speed;
	public int gps;
	public Logan(String ModelName, String RegistrationNumber, String OwnerName, int Speed, int gps)
	{
		super();
		this.ModelName = ModelName;
		this.RegistrationNumber = RegistrationNumber;
		this.OwnerName = OwnerName;
		this.Speed = Speed;
		this.gps = gps;
	}
	@Override
	public void getModelName()
	{
		System.out.println("Model Name: "+ModelName);
	}
	@Override
	public void getRegistrationNumber()
	{
		System.out.println("Registration Number: "+RegistrationNumber);
	}
	@Override
	public void getOwnerName()
	{
		System.out.println("Owner Name: "+OwnerName);
	}
	public int getSpeed()
	{
		return Speed;
	}
	public int getgps()
	{
		return gps;
	}

}