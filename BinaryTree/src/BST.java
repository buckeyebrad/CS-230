public class BST<T extends Comparable<T>> {

    private class BSTNode<T> {
        private T data;
        private BSTNode<T> leftChild;
        private BSTNode<T> rightChild;

        public BSTNode( T dataValue) {
            this.data = dataValue;
            this.leftChild = null;
            this.rightChild = null;
        }
    }

    BSTNode<T> root;

    public BST() {

        root = null;
    }

    public boolean isEmpty() {

        return( root == null);
    }

    public void resetTree() {

        root = null;
        return;
    }

    public void insert( T item) {

        BSTNode<T> newNode = new BSTNode<T>( item);



        return;
    }

    private void traversePreOrderStartingAt( BSTNode<T> subTreeRoot) {

        if( subTreeRoot == null)
            return;



        return;
    }

    public void preOrderTraversal() {

        traversePreOrderStartingAt( root);
        System.out.println();

        return;
    }

    private void traverseInOrderStartingAt( BSTNode<T> subTreeRoot) {

        if( subTreeRoot == null)
            return;

        traverseInOrderStartingAt( subTreeRoot.leftChild);
        System.out.print( subTreeRoot.data + "  ");
        traverseInOrderStartingAt( subTreeRoot.rightChild);

        return;
    }

    public void inOrderTraversal() {

        traverseInOrderStartingAt( root);
        System.out.println();

        return;
    }

    private void traversePostOrderStartingAt( BSTNode<T> subTreeRoot) {

        if( subTreeRoot == null)
            return;

        traversePostOrderStartingAt( subTreeRoot.leftChild);
        traversePostOrderStartingAt( subTreeRoot.rightChild);
        System.out.print( subTreeRoot.data + "  ");

        return;
    }

    public void postOrderTraversal() {

        traversePostOrderStartingAt( root);
        System.out.println();

        return;
    }

    private int countNodesStartingAt( BSTNode<T> subTreeRoot) {

        if( subTreeRoot == null)
            return 0;

        return ( 1 + countNodesStartingAt( subTreeRoot.leftChild) +
                countNodesStartingAt( subTreeRoot.rightChild));

    }

    public int getNodeCount() {

        int treeNodeCount = 0;

        if( !isEmpty())
            treeNodeCount = countNodesStartingAt( root);

        return treeNodeCount;
    }

    private int countLeafNodesStartingAt( BSTNode<T> subTreeRoot) {

        if( subTreeRoot == null)
            return 0;

        if( subTreeRoot.leftChild == null && subTreeRoot.rightChild == null)
            return 1;

        return ( countLeafNodesStartingAt( subTreeRoot.leftChild) +
                countLeafNodesStartingAt( subTreeRoot.rightChild));


    }

    public int getLeafNodeCount() {

        int leafNodeCount = 0;

        if( !isEmpty())
            leafNodeCount = countLeafNodesStartingAt( root);

        return leafNodeCount;
    }

    private int maximumOfTwoHeights( int heightOfLeftSubtree, int heightOfRightSubTree) {

        if( heightOfLeftSubtree >= heightOfRightSubTree)
            return heightOfLeftSubtree;
        else
            return heightOfRightSubTree;
    }

    private int computeHeightOfSubTreeRootedAt( BSTNode<T> subTreeRoot) {

        if( subTreeRoot == null)
            return 0;
        if( subTreeRoot.leftChild == null && subTreeRoot.rightChild == null)
            return 0;
        return( 1 + maximumOfTwoHeights( computeHeightOfSubTreeRootedAt( subTreeRoot.leftChild),
                computeHeightOfSubTreeRootedAt( subTreeRoot.rightChild)));
    }

    public int getTreeHeight() {

        int treeHeight = 0;

        if( !isEmpty())
            treeHeight = computeHeightOfSubTreeRootedAt( root);
        return treeHeight;
    }

    public boolean searchFor( T item) {

        boolean found = false;

        if( isEmpty()) {
            System.out.println( "Tree is empty.");
            return found;
        }

        BSTNode<T> currentNode = root;

        while( !found && currentNode != null) {
            if( currentNode.data.compareTo( item) == 0)
                found = true;
            else if( currentNode.data.compareTo( item) < 0)
                currentNode = currentNode.rightChild;
            else
                currentNode = currentNode.leftChild;
        }

        return found;
    }

    public void delete( T item) {

        if( isEmpty()) {
            System.out.println( "Tree is empty.");
            return;
        }

        boolean found = false;
        BSTNode<T> currentNode = root;
        BSTNode<T> trailCurrentNode = root;

        while( !found && currentNode != null) {
            if( currentNode.data.compareTo( item) == 0)
                found = true;
            else {
                trailCurrentNode = currentNode;
                if( currentNode.data.compareTo( item) < 0)
                    currentNode = currentNode.rightChild;
                else
                    currentNode = currentNode.leftChild;
            }
        }

        if( currentNode == null) {
            System.out.println( "Item not found.");
            return;
        }
		/*
		if( found && currentNode.leftChild == null && currentNode.rightChild == null) {
			if( trailCurrentNode.data.compareTo( item) < 0)
				trailCurrentNode.rightChild = null;
			else
				trailCurrentNode.leftChild = null;
			return;
		}*/

        if( found)
            if( currentNode == root)
                deleteNodePointedAtBy( root);
            else if( trailCurrentNode.data.compareTo( item) > 0)
                deleteNodePointedAtBy( trailCurrentNode.leftChild);
            else
                deleteNodePointedAtBy( trailCurrentNode.rightChild);

        return;
    }

    public void deleteNodePointedAtBy( BSTNode<T> ptr) {



        return;
    }


}
