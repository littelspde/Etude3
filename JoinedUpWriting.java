import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class JoinedUpWriting{

    public static ArrayList<String> dictionary = new ArrayList<String>();

    public static String findSingleChain(String searchString){

        for(int i = 0; i < searchString.length() ; i++){
            String target = searchString.substring(i);
            for (String word : dictionary){
                if (word.startsWith(target)){
                    return word;
                }
            }
        }
        return "No match found";

    }

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

        Scanner stdinReader = new Scanner(System.in);

        while (stdinReader.hasNextLine()){

            dictionary.add(stdinReader.nextLine());
        }

        System.out.println(dictionary);
        //Collections.sort(dictionary);
        //System.out.println(dictionary);
        System.out.println(findSingleChain("ogre"));
        System.out.println(findSingleChain("this"));
        System.out.println(findSingleChain("indic"));
        System.out.println(findSingleChain("salmon"));
        System.out.println(findSingleChain("ingrate"));

    }

}