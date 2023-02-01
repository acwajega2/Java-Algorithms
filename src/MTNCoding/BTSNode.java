package MTNCoding;

public class BTSNode {
    int data;
    BTSNode leftNode,rightNode;
    public BTSNode(int val){
        data = val;
    }

    //--------> Inserting into the tree
    public void insert(int input){
        //-------> Create a new node
        BTSNode newNode = new BTSNode(input);

        //-----> inserting the data into the tree

        if (input <=data){
            //-------> we consider the left node
            if (leftNode == null){
                leftNode = newNode;
            }
            else {
                //---> we insert on the left node
                leftNode.insert(input);
            }
        }
        else {
            //--------> we consider the right node
            if (rightNode == null){
                rightNode = newNode;
            }
            else {
                // --> we insert on the right node
                rightNode.insert(input);
            }
        }
    }


}
