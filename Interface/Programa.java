public class Programa
{
	public static void main(String args[])
	{
		Leon sasha= new Leon();
		Elefante mitu= new Elefante();
		sasha.hasBeenFed(sasha.setItHasFeed());
		sasha.feed();
		mitu.feed();
		mitu.hasBeenFed(mitu.setItHasFeed());
	}
}