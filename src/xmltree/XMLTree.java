package xmltree;

public class XMLTree 
{

	private XMLTreeNode root;
	
	public XMLTree()
	{
		
		root = null;
		
	}
	
	public void createTree(XMLTreeNode root, XMLTreeNode[] children)
	{
		
		this.root = root;
		root.addChildren(children);
		
	}
	
	public XMLTree getSubtree(XMLTreeNode r)
	{
		
		if(root.findChild(r) != null)
		{
			
			XMLTree tree = new XMLTree();
			tree.createTree(r, r.getChildren());
			return tree;
			
		}
		
		return null;
		
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
