public class moterCycle extends Vehicle{
     private int model;

	// constroctor
	public moterCycle(String brand, int year, int model) {

		super (brand,year);
		this.model = cd model;

	}

	public void start()
	{
		System.out.println(brand+"bike is startng");

	}
	public void stop()
	{
		System.out.println(brand+"bike is stoping");
		
	}
	public void drift()
	{
		System.out.println(brand+"bike is drifting");
		
	}
}