package xmlstack;

import xmltree.XMLTag;

public class Node 
{

	private Node next;
	private XMLTag tag;
	
	public Node(XMLTag tag)
	{
		
		this.tag = tag;
		next = null;
		
	}
	
	public void setNext(Node next)
	{
		
		this.next = next;
		
	}
	
	public Node getNext()
	{
		
		return next;
		
	}
	
	public XMLTag getTag()
	{
		
		return tag;
		
	}
	
}
