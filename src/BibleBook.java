public class BibleBook 
{
	//Intial values
	private String name;
	private int chapters;
	private String description;
	
	public BibleBook(String name, int chapters, String description)
	{
		//Intial variables
		this.name = name;
		this.chapters = chapters;
		this.description = description;
	}
	
	//Display function
	public void display()
	{
		System.out.println("BibleBook: " + this.name + 
				", has " + this.chapters + " chapters." + 
				" Description of Book: " + this.description);
	}
}
