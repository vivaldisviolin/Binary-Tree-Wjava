package binarytree;


public class binarytree {
    public node root;

    public binarytree(){
        this.root = null;
    }

    public void insert(int data){
        node node = new node(data);
        if (root == null){
            root = node;
        }else{
            while (true){
                if (root.left == null){
                    root.left = node;
                    break;
                }else if (root.right == null){
                    root.right = node;
                    break;
                }else if(root.left != null){
                    root = root.left;
                }else{
                    root = root.right;
                }
            }
        }
    }

    public void remove(int data){
        node node = new node(data);
        if (root == null){
            System.out.println("Tree is already empty !!!");
        }else{
            while (true) { 
                if (root.left == null && root.right == null){
                    root = null;
                    break;
                }else if(root.left != null && root.right == null){
                    root = root.left;
                }else if (root.left == null && root.right != null){
                    root = root.right;
                }else{
                    root = root.left;
                }
            }
        }
    }
}
