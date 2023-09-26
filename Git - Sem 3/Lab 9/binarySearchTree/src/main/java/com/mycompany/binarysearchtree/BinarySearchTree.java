class Node
{
	public int data;
	public Node leftLeaf;
	public Node rightLeaf;
}

public class BTree
{
	private Node root;
	public BTree()
	{
			root = null;
	}
	public Node find(int key)
	{
		Node current = root;
		while(current.data !=key)
		{
		 	if(key<current.data)
		 		current=current.leftLeaf;
		 	else
		 		current=current.rightLeaf;
		 	if(current == null)
			 		return null;
		} 	
			return current;
	}
	
	public void insert (int value)
	{
		Node newNode = new Node();
		newNode.data = value;
		if(root==null)
			root=newNode;
		else 
		{
			Node current =root;
			Node parent;
			while(true)
			{
				parent=current;
				if(value<current.data)
				{
					current=current.leftLeaf;
					if(current==null)
					{
						parent.leftLeaf=newNode;
						return;
					}
				}
				else
				{
					current = current.rightLeaf;
					if(current==null)
					{
						parent.rightLeaf=newNode;
						return;
					}
				}
			}
		}
	}
	public void inOrder(Node localRoot)
	{
		if(localRoot != null)
		{
			inOrder(localRoot.leftLeaf);
			System.out.print(localRoot.data + " ");
			inOrder(localRoot.rightLeaf);
		}	
	}
	public void preOrder(Node localRoot)
	{
		if(localRoot != null)
		{
                    System.out.print(localRoot.data + " ");
                    preOrder(localRoot.leftLeaf);
                    preOrder(localRoot.rightLeaf);
		}
	
	}
	
        public void postOrder(Node localRoot)
        {
            if(localRoot != null)
                    {
                        postOrder(localRoot.leftLeaf);
                        postOrder(localRoot.rightLeaf);
                        System.out.print(localRoot.data + " ");
                    }
        }
        
        public void deleteLeaf(Node localRoot) {
            if (localRoot == null) {
                return;
            }
            if (localRoot.leftLeaf == null && localRoot.rightLeaf == null) {
                root = null;
            } else {
                deleteLeaf(localRoot.leftLeaf);
                deleteLeaf(localRoot.rightLeaf);
            }
        }
        
        public void deleteNodeWithOneChild(Node localRoot){
            if (localRoot == null) {
                return;
            }
            if (localRoot.leftLeaf == null && localRoot.rightLeaf != null) {
                root = null;
            }
            if (localRoot.leftLeaf != null && localRoot.rightLeaf == null) {
                root = null;
            } else {
                deleteNodeWithOneChild(localRoot.leftLeaf);
                deleteNodeWithOneChild(localRoot.leftLeaf);
            }
        }
        
        public void deleteNodeWithTwoChild(Node localRoot){
            if (localRoot == null) {
                return;
            }
            if (localRoot.leftLeaf != null && localRoot.rightLeaf != null) {
                root = null;
            } else {
                deleteNodeWithTwoChild(localRoot.leftLeaf);
                deleteNodeWithTwoChild(localRoot.leftLeaf);
            }
        }
	
	public static void main(String[] arg)
	{
		BTree BST = new BTree();
		System.out.print("BST Implementation");
		BST.insert(100);
		BST.insert(20);
		BST.insert(200);
		BST.insert(10);
		BST.insert(30);
		BST.insert(150);
		BST.insert(300);
		Node temp=BST.find(20);
		if(temp==null)
			System.out.println("Not Found");
		else
			System.out.println(temp.data);
		System.out.println("Tree in inOrder fashion: ");
		BST.inOrder(BST.root);
                System.out.println(" ");
                
                System.out.println("Tree in preOrder fashion: ");
		BST.preOrder(BST.root);
                System.out.println(" ");
		
                System.out.println("Tree in postOrder fashion: ");
		BST.postOrder(BST.root);
                System.out.println(" ");
                
	}
}