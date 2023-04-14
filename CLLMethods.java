package circularlinkedlist;

import java.util.Scanner;

public class CLLMethods {

	public CLLNode first , last;
	public CLLMethods()
	{
		first = null; 
		last = null;
	}
	
	public void insertBeg(int item)
	{
		CLLNode newnode = new CLLNode();
		newnode.info = item;
		
		if(first == null) // list is empty or not
		{
			newnode.next = newnode;
			first = newnode;
			last  = newnode;
		}
		else
		{
			newnode.next = first;
			first = newnode;
			last.next = newnode;
		}
		
	}// end of the insertBeg method
	
	
	public void insertEnd(int item)
	{
		CLLNode newnode  = new CLLNode();
		newnode.info = item;
		
		if(first == null)
		{
			newnode.next = newnode;
			first = newnode;
			last = newnode;
		}
		else
		{
			last.next = newnode;
			last = newnode;
			newnode.next = first;
		}
	} // end of insertEnd() methods
	
	public void deleteFirst()
	{
		if(first == null)  // when list is empty
		{
			System.out.println(" List is empty. ");
		}
		else if(first == last) // when list has only one node
		{
			first = null;
			last = null;
		}
		else // when list has more than one nodes
		{
			first = first.next;
			last.next = first;
		}
	} // end of the deleteFirst() method
	
	public void deleteLast()
	{
		if(first == null)  // when list is empty
		{
			System.out.println(" List is empty. ");
		}
		else if(first == last) // when list has only one node
		{
			first = null;
			last = null;
		}
		else // when list has more than one nodes
		{
			CLLNode temp;
			temp = first;
			
			while(temp.next != last)
				 temp = temp.next;
			temp.next = first;
			last = temp;
		}
	} // end of deleteLast()
	
	public void display()
	{
		CLLNode temp;
		
		if(first == null)
			System.out.println("List is empty.");
		else
		{
			System.out.println("The list elements are:\n");
			temp = first;
			while( temp != last)
			{
				System.out.print(temp.info + "\t");
				temp = temp.next;
			}
			System.out.print(temp.info);
		}
	} // end of display()
	
	public void search()
	{
		 int key;
		 int flag =0;
		Scanner sc = new Scanner(System.in);
		
		if(first == null)
			System.out.println("List is empty.");
		else
		{
	    	System.out.println("Enter search item: ");
	    	key = sc.nextInt();
	    	
	    	CLLNode temp = first;
	    	do
	    	{
	    		if(temp.info == key)
	    		{
	    			System.out.println("Key Found !");
	    			flag = 1;
	    			break;
	    		}
	    		temp = temp.next;
	    	}
	    	while(temp != first);
	    	
	    	if(flag ==0)
	    		System.out.println("Key is not found !");
		} 	
	} // end of search()
} // end of the CLLMethods class
