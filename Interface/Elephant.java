public class Elephant implements Feeding
{
	private String food;
	private boolean itHasFed;

	public Elefante()
	{
		food="mani";
		itHasFed=false;
	}

	public Elefante(String food,boolean itHasFed)
	{
		this.food=food;
		this.itHasFed=itHasFed;
	}


	public void hasBeenFed(boolean feed)
	{
		if(feed)
		{
			System.out.println("el Elefante ya a comido");
		}
		else
		{
			System.out.println("el Elefante necesita alimentarse con"+food);	
			
		}

	}

	public void feed()
	{
		System.out.println("el Elefante ha sido alimentado con "+this.food);
		this.itHasFed=true;
	}

	public boolean setItHasFeed()
	{
		return itHasFed;
	}
}