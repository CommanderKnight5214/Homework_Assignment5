import java.util.Scanner;

public class driver 
{
	public static void main(String[] args)
	{
		//Start of Scanner
		Scanner myObj = new Scanner(System.in);
		
		//Introduces the program and asks the user for a bible book
		System.out.println("BibleBook Display Program.");
		System.out.println("Type in a bible book.");
		String BName = myObj.nextLine();
		
		//Asks the user for chapters and coverts the string to an integer
		System.out.println("How many chapters are in this book?");
		String BChapter = myObj.nextLine();
		int BCNum= Integer.parseInt(BChapter);
		
		//Asks the user for the description of the book 
		System.out.println("Give us a brief description about your book");
		String BDescription = myObj.nextLine();
		
		//Combines the variables and displays the book throught the Bible book class
		BibleBook Book =new BibleBook(BName, BCNum, BDescription);
		Book.display();
		
		//Testing Books
		/*
		BibleBook One = new BibleBook("Luke", 23, "Luke is a book");
		BibleBook Two = new BibleBook("James", 5, "James is a book");
		BibleBook Three = new BibleBook("2nd John", 1, "2nd John is a book");
		One.display();
		Two.display();
		Three.display();
		*/
	}
}
