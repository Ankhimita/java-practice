package practice2;



public class LCABST {

    static class TNode{
        TNode left=null, right=null;
        int data;

        TNode(int data){
            this.data=data;
        }
    }

    static TNode insert(TNode root, int key) {
        if(root==null) {
            return new TNode(key);
        }

        if(key<root.data) {
            root.left=insert(root.left,key);
        }

        if(key>root.data) {
            root.right=insert(root.right,key);
        }

        return root;
    }

    static TNode findLCA(TNode root, int x, int y) {

        if(root==null){
            return null;
        }

        if( Integer.max(x,y)<root.data) {
            return findLCA(root.left,x,y);
        }
        if(Integer.min(x,y)>root.data) {
            return findLCA(root.right,x,y);
        }

        return root;

    }

    public static void main(String[] args)
    {
        TNode root = null;
		/* Construct below tree
			 15
			/  \
		   /	\
		  10	 20
		 / \	 / \
		/   \   /   \
		8   12 16   25
		*/
        int[] keys = { 15, 10, 20, 8, 12, 16, 25 };

        for (int key : keys) {
            root = insert(root, key);
        }

        System.out.println("Root=" + root.data);
        TNode lca = findLCA(root, 8, 12);
        System.out.println("LCA is= " + lca.data);
    }
}
