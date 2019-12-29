package practice2;

class BNode {

    BNode left = null , right = null;
    int data;

    BNode(int data) {
        this.data = data;
    }

}


public class LCABinaryTree {

    static BNode lca =null;


    public static boolean findLCA(BNode root,BNode x, BNode y) {

        if(root==null){
            return false;
        }

        if(root==x || root==y) {
            lca = root;
            return true;
        }

        boolean left = findLCA(root.left, x, y);
        boolean right = findLCA(root.right, x, y);

        if(left && right) {
            lca = root;
        }

        if(left || right) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        BNode root = new BNode(1);
        root.left = new BNode(2);
        root.right = new BNode(3);
        root.left.right = new BNode(4);
        root.right.left = new BNode(5);
        root.right.right = new BNode(6);
        root.right.left.left = new BNode(7);
        root.right.right.right = new BNode(8);

        findLCA(root, root.right.left.left, root.right.right);

        System.out.println("LCA is= " + lca.data);
//        findLCA(root, root.right.left.left, new BNode(10));
//        findLCA(root, root.right.left.left, root.right.left.left);
//        findLCA(root, root.right.left.left, root.right.left);
//        findLCA(root, root.left, root.right.left);

    }


}
