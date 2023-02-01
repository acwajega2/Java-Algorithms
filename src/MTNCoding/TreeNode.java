package MTNCoding;

public class TreeNode {
    int data;
    TreeNode leftNode, rightNode;

    public TreeNode(int val) {
        data = val;
    }

    public void insert(int input) {
        //---------> we initiate a new Node
        TreeNode newNode = new TreeNode(input);
        if (input <= data) {
            //-------> we put on the left Node
            if (leftNode == null) {
                //---------> we create a new Node
                leftNode = newNode;
            } else {
                //-----> we insert on the left node
                leftNode.insert(input);

            }
        } else {
            //---------> we put on the right node
            if (rightNode == null) {
                //------> We create a right node
                rightNode = newNode;
            } else {
                //------> we insert on the right node
                rightNode.insert(input);

            }

        }
    }

}
