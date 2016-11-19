package xmltree;

public class XMLTree 
{

	private XMLTreeNode root;
	
	public XMLTree()
	{
		
		root = null;
		
	}
	
	public void addSubtree(XMLTree tree)
	{
		
		root.addChild(tree.getRoot());
		
	}
	
	public XMLTreeNode getRoot()
	{
		
		return root;
		
	}
	
}
