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
    
    public XMLTag getTag()
    {
    	
    	return tag;
    	
    }

}