import java.util.*;

public class TreeNode {

    private String data;
    private TreeNode parent;
    private ArrayList<TreeNode> children;

    public boolean isRoot = false;

    public TreeNode(String data_in){
        this.data = data_in;
        this.parent = null;
        this.isRoot = true;
        this.children = new ArrayList<TreeNode>();

    }

    public TreeNode(String data_in, TreeNode parent_in) {
        this.data = data_in;
        this.parent = parent_in;
        this.children = new ArrayList<TreeNode>();
    }

    public String getData(){
        return this.data;
    }

    public TreeNode getParent(){
        return this.parent;
    }

    public ArrayList<TreeNode> getChildren() {
        return children;
    }

    public void addChild(TreeNode child_in){
        this.children.add(child_in);
    }

    public boolean checkRoot(){
        return isRoot;
    }
}