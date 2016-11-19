package xmltree;

/**
 * Creates and Manages a Tree for
 * holding XML information
 * @author Tabor Kvasnicka
 *
 */
public class XMLTree 
{

	private XMLTreeNode root;
	
	public XMLTree()
	{
		
		root = null;
		
	}
	
	/**
	 * Creates a tree from a given root node
	 * and an array of children
	 * @param root			the node at the top of the tree
	 * @param children		an array of children under the root node
	 */
	public void createTree(XMLTreeNode root, XMLTreeNode[] children)
	{
		
		this.root = root;
		root.addChildren(children);
		
	}
	
	/**
	 * Gets a subtree from the given child
	 * @param r		the child
	 * @return		a subtree
	 */
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
	
	/**
	 * Add a subtree to the root
	 * @param tree	subtree to add
	 */
	public void addSubtree(XMLTree tree)
	{
		
		root.addChild(tree.getRoot());
		
	}
	
	/**
	 * Gets the root node
	 * @return	the root node
	 */
	public XMLTreeNode getRoot()
	{
		
		return root;
		
	}
	
}
