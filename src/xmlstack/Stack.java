package xmlstack;

import xmltree.XMLTag;

/**
 * A Stack implementation using a variation of a linked list
 * @author Tabor Kvasnicka
 *
 */
public class Stack 
{

	private Node top;
	private int stackSize = 0;
	
	public Stack()
	{
		
		top = null;
		
	}
	
	/**
	 * Adds tag to the top of the stack
	 * @param tag	tag to add
	 */
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
	
	/**
	 * Returns and removes the top tag
	 * @return	the top tag
	 */
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
	
	/**
	 * Shows the top tag
	 * @return	top tag
	 */
	public XMLTag peek()
	{
		
		return top.getTag();
		
	}
	
	/**
	 * Gets the size of the Stack
	 * @return	size of Stack
	 */
	public int size()
	{
		
		return stackSize;
		
	}
	
	/**
	 * Determines if the Stack is empty
	 * @return	true if empty, false otherwise
	 */
	public boolean isEmpty()
	{
		
		return stackSize == 0;
		
	}
	
}
