package xmlstack;

import xmltree.XMLTag;

public class Stack 
{

	private Node top;
	private int stackSize = 0;
	
	public Stack()
	{
		
		top = null;
		
	}
	
	public void push(XMLTag tag)
	{
		
		if(top == null)
		{
			
			Node nt = new Node(tag);
			nt.setNext(null);
			top = nt;
			
		}
		else
		{
			
			Node nt = new Node(tag);
			nt.setNext(top);
			top = nt;
			
		}
		
		stackSize++;
		
	}
	
	public XMLTag pop()
	{
		
		if(top == null)
			return null;
		else
		{
			
			XMLTag tag = top.getTag();
			top = top.getNext();
			stackSize--;
			return tag;
			
		}
		
	}
	
	public XMLTag peek()
	{
		
		return top.getTag();
		
	}
	
	public int size()
	{
		
		return stackSize;
		
	}
	
	public boolean isEmpty()
	{
		
		return stackSize == 0;
		
	}
	
}
