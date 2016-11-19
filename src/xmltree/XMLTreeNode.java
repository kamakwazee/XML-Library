package xmltree;

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

    public void addChildren(XMLTreeNode[] children)
    {
    	
    	for(XMLTreeNode child : children)
    		addChild(child);
    	
    }
    
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
    
    public XMLTreeNode findChild(XMLTreeNode node)
    {
    	
    	for(XMLTreeNode child : children)
    	{
    		
    		if(child.equals(node))
    			return child;
    		
    	}
    	
    	return null;
    	
    }
    
    public XMLTreeNode[] getChildren()
    {
    	
    	return children;
    	
    }
    
    public XMLTag getTag()
    {
    	
    	return tag;
    	
    }
    
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