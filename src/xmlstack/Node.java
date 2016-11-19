package xmlstack;

import xmltree.XMLTag;

/**
 * Creates and Manages a Node in a Stack
 * @author Tabor Kvasnicka
 *
 */
public class Node 
{

	private Node next;
	private XMLTag tag;
	
	public Node(XMLTag tag)
	{
		
		this.tag = tag;
		next = null;
		
	}
	
	/**
	 * Sets the next node
	 * @param next	the next node
	 */
	public void setNext(Node next)
	{
		
		this.next = next;
		
	}
	
	/**
	 * Gets the next node
	 * @return	the next node
	 */
	public Node getNext()
	{
		
		return next;
		
	}
	
	/**
	 * Gets the XMLTag of the current node
	 * @return	the XMLTag
	 */
	public XMLTag getTag()
	{
		
		return tag;
		
	}
	
}
