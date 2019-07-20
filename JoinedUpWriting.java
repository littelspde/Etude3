import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class JoinedUpWriting{

    public static void main (String[] args){

        TreeNode testRoot = new TreeNode("Hello");

        TreeNode testNode = new TreeNode("Goodbye", testRoot);
        testRoot.addChild(testNode);

        System.out.println(testRoot.getData());
        System.out.println(testRoot.getParent());
        System.out.println(testRoot.getChildren());

        System.out.println(testNode.getData());
        System.out.println(testNode.getParent());
        System.out.println(testNode.getChildren());

        ArrayList dictionary = new ArrayList<String>();
        Scanner stdinReader = new Scanner(System.in);

        while (stdinReader.hasNextLine()){
            dictionary.add(stdinReader.nextLine());
        }

        System.out.println(dictionary);
        Collections.sort(dictionary);
        System.out.println(dictionary);

    }

}