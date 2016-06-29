package xyz.skycat.work.asttool;

import org.eclipse.jdt.core.dom.ASTNode;

/**
 * Created by SS on 2016/06/30.
 */
public class L {

    public static void pl(String s) {
        if(true) {
            System.out.println(s);
            System.out.println("================================================================");
        }
    }

    public static void pl(ASTNode node) {
        if(true) {
            System.out.println(node.toString());
            System.out.println("================================================================");
        }
    }

    public static void pl(String title, ASTNode node) {
        if(true) {
            System.out.println("[[[ " + title + " ]]] ");
            System.out.println(node.toString());
            System.out.println("================================================================");
        }
    }

}
