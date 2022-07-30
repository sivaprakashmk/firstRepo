public class Bike
{
	String name;
	String colour;
	String maxSpeed;
	double price;

	Bike(String name,String colour,String maxSpeed,double price)
	(
		this.name = name;
		this.colour = colour;
		this.maxSpeed = maxSpeed;
		this.price = price;
	}
	
	public String toString()
	{
		return "name :"+this.name+", colour :"+this.colour+" ,maxspeed :"+this.maxSpeed+", price :"+this.price;
	}
} 
	
