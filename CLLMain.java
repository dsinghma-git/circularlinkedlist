package circularlinkedlist;
import java.util.Scanner;

public class CLLMain {

	public static void main(String[] args) {
		int choice;
		int item;
		
		Scanner sc = new Scanner(System.in);
		CLLMethods cm = new CLLMethods();
		
		System.out.println("1. Insert at Beginning ");
		System.out.println("2. Insert at End ");
		System.out.println("3. Delete at Beginning ");
		System.out.println("4. Delete at End ");
		System.out.println("5. Display ");
		System.out.println("6. Search  ");
		System.out.println("7. Exit ");
		
		while(true)   // infinite loop
		{
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
		    
			switch(choice)
			{
				case 1: 
					     System.out.println("Enter an item to insert ");
					     item = sc.nextInt();
					     cm.insertBeg(item);
					     break;
			
				case 2:
						System.out.println("Enter an item to insert ");
						item = sc.nextInt();
						cm.insertEnd(item);
						break;
				case 3: 
					    cm.deleteFirst();
					    break;
				case 4:
					    cm.deleteLast();
					    break;
				case 5: 
					    cm.display();
					    break;
			
				case 6: 
					   cm.search();
					   break;
				case 7: 
					   System.exit(1);  // exit the application
				default:
					   System.out.println("Invalid choice !!!");
			} // end of switch
			
         }// end of while

  } // end of main method
} // end of the main class