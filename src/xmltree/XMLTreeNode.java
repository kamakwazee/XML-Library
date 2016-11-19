package xmltree;

/**
 * Creates and Manages a node in
 * the XML Tree
 * @author Tabor Kvasnicka
 *
 */
public class XMLTreeNode
{

    private XMLTag tag;
    private int nodeCount = 0;
    private XMLTreeNode children[];

    public XMLTreeNode(XMLTag t)
    {

        tag = t;
        children = new XMLTreeNode[1];
        children[0] = null;

    }

    public XMLTreeNode(XMLTag t, XMLTreeNode c[])
    {

        tag = t;
        children = c;

    }

    /**
     * Add children to the node from an array
     * @param children	array of children
     */
    public void addChildren(XMLTreeNode[] children)
    {
    	
    	for(XMLTreeNode child : children)
    		addChild(child);
    	
    }
    
    /**
     * Add a child to the node
     * @param child		child to add
     */
    public void addChild(XMLTreeNode child)
    {

        if(nodeCount == 0)
            children[nodeCount++] = child;
        else
        {

            XMLTreeNode temp[] = children;
            children = new XMLTreeNode[++nodeCount];
            for(int i = 0; i < temp.length; i++)
                children[i] = temp[i];

            children[nodeCount - 1] = child;

        }

    }
    
    /**
     * Finds a child of the node
     * @param node	child to find
     * @return		child if found, null otherwise
     */
    public XMLTreeNode findChild(XMLTreeNode node)
    {
    	
    	for(XMLTreeNode child : children)
    	{
    		
    		if(child.equals(node))
    			return child;
    		
    	}
    	
    	return null;
    	
    }
    
    /**
     * Returns the array of children
     * @return	array of children
     */
    public XMLTreeNode[] getChildren()
    {
    	
    	return children;
    	
    }
    
    /**
     * Gets the XMLTag held in the node
     * @return	the XMLTag
     */
    public XMLTag getTag()
    {
    	
    	return tag;
    	
    }
    
    /**
     * Checks if all children of a given node
     * are equal to the node's children
     * @param n		the node for checking
     * @return		true if all children are equal, false otherwise
     */
    public boolean childrenEqual(XMLTreeNode n)
    {
    	
    	XMLTreeNode[] c = n.getChildren();
    	if(c.length == children.length)
    	{
    		
    		for(int i = 0; i < c.length; i++)
    		{
    			
    			if(!c[i].equals(children[i]))
    				return false;
    			
    		}
    		
    		return true;
    		
    	}
    	
    	return false;
    	
    }
    
    /**
     * Checks if a given node is equal to the node
     * @return	true if equal, false otherwise
     */
    @Override
    public boolean equals(Object o)
    {
    	
    	if(o instanceof XMLTreeNode)
    	{
    		
    		XMLTreeNode n = (XMLTreeNode) o;
    		return n.getTag().equals(tag) && childrenEqual(n);
    		
    	}
    	
    	return false;
    	
    }
    		

}