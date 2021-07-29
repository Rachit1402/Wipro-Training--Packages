package Automobiles;

public abstract class Honda extends Vehicle{
	private String ModelName;
	private String RegistrationNumber;
	private String OwnerName;
	private int Speed;
	
	public Honda(String ModelName, String RegistrationNumber, String OwnerName, int Speed)
	{
		super();
		this.ModelName = ModelName;
		this.RegistrationNumber = RegistrationNumber;
		this.OwnerName = OwnerName;
		this.Speed = Speed;
	}
	@Override
	public void getModelName()
	{
		System.out.println("Model Name is: "+ModelName);
	}
	@Override
	public void getRegistrationNumber()
	{
		System.out.println("Registration Number: "+ RegistrationNumber);
	}
	@Override
	public void getOwnerName()
	{
		System.out.println("Owner name: "+OwnerName);
	}
	public int getSpeed()
	{
		return Speed;
	}
	public void getcdplayer()
	{
		System.out.println("CD player Accessed");
	}

}
