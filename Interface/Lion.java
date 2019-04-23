public class Lion implements Feeding{
	private String food;
	private boolean itHasFed;

	public boolean setItHasFeed()
	{
		return itHasFed;
	}

	public Leon()
	{
		food="carne";
		itHasFed=false;
	}

	public Leon(String food,boolean itHasFed)
	{
		this.food=food;
		this.itHasFed=itHasFed;
	}


	public void hasBeenFed(boolean feed)
	{
		if(feed)
		{
			System.out.println("el leon ya a comido");
		}
		else
		{
			System.out.println("el Leon necesita alimentarse con"+food);
		}

	}

	public void feed()
	{
		System.out.println("el leon ha sido alimentado con "+this.food);
		this.itHasFed=true;
	}
	
}