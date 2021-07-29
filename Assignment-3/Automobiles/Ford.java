package Automobiles;

public abstract class Ford extends Vehicle{
	private String ModelName;
	private String RegistrationNumber;
	private String OwnerName;
	public int Speed;
	public int Tempcontrol;
	public Ford(String ModelName, String RegistrationNumber, String OwnerName, int Speed, int Tempcontrol)
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
	public int Tempcontrol()
	{
		return Tempcontrol;
	}

}
