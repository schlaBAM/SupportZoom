import java.util.ArrayList;

public class BinaryTree 
{
    private String     data;
    private BinaryTree leftChild;
    private BinaryTree rightChild;
    
    // A constructor that takes root data only and
    // makes a tree with no children (i.e., a leaf)
    public BinaryTree(String d) 
    {
        data = d;
        leftChild = null;
        rightChild = null;
    }
    
    // A constructor that takes root data as well as two subtrees
    // which then become children to this new larger tree.
    public BinaryTree(String d, BinaryTree left, BinaryTree right)
    {
        data = d;
        leftChild = left;
        rightChild = right;
    }
    
    // Get methods
    public String getData() { return data; }
    public BinaryTree getLeftChild() { return leftChild; }
    public BinaryTree getRightChild() { return rightChild; }
    
    // Set methods
    public void setData(String d) { data = d; }
    public void setLeftChild(BinaryTree left) { leftChild = left; }
    public void setRightChild(BinaryTree right) { rightChild = right; }
    
    
    // Return the height of the tree
    public int height()  
    {
        // Base case: if there are no more children, return 1
        if (leftChild == null && rightChild == null)
        {
            return 1;
        }
        
        // Recursive case: one or neither child is null
        if (leftChild == null)
        {
            return 1 + rightChild.height();
        }
        else if (rightChild == null)
        {
            return 1 + leftChild.height();
        }
        else
        {
            return 1 + Math.max(leftChild.height(),
                                rightChild.height());
        }
    }
    
    
    // Return all the leaves of the tree
    public ArrayList<String> leafData()  
    {
        ArrayList<String> result = new ArrayList<String>();
        
        if (data != null) 
        {
            // Base case: check if the current tree is a leaf, and if so,
            // add the data
            if ((leftChild == null) && (rightChild == null))
            {
                result.add(data);
            }
        }
        
        // Recursive case: collect the leaves of the children and add them
        if (leftChild != null)
        {
            result.addAll(leftChild.leafData());
        }
        if (rightChild != null)
        {
            result.addAll(rightChild.leafData());
        }
        
        // Return all the leaves part of this tree
        return result;
    }

    //Recursively returns the total number of nodes in the given tree, using a wrapper class.
    public int numberOfNodes(){
        return numberOfNodes(this);
    }

    private int numberOfNodes(BinaryTree leaf){
        if(leaf == null){
            return 0;
        }
        return 1 + numberOfNodes(leaf.leftChild) + numberOfNodes(leaf.rightChild);
    }

    //Recursively compares two trees to see if they're identical.
    public boolean hasSameContentsAs(BinaryTree tree){

        return hasSameContentsAs(this, tree);

    }

    //couldn't figure out how to not get a NullPointer with the public class method above.
    private boolean hasSameContentsAs(BinaryTree tree1, BinaryTree tree2){

        if(tree1 == null && tree2 == null) return true; //okay if both are null

        if(tree1 == null || tree2 == null) return false; //only one is null, otherwise would have been caught above

        if(tree1.data != tree2.data) return false;

        return hasSameContentsAs(tree1.leftChild, tree2.leftChild)
                && hasSameContentsAs(tree1.rightChild, tree2.rightChild);
    }
}