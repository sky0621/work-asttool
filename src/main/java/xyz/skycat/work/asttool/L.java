package xyz.skycat.work.asttool;

import org.eclipse.jdt.core.dom.ASTNode;

/**
 * Created by SS on 2016/06/30.
 */
public class L {

    private static boolean isOut = true;

    public static void o(String s) {
        if (isOut) {
            System.out.println(s);
        }
    }

    public static void l() {
        if (isOut) {
            System.out.println();
            System.out.println("================================================================");
        }
    }

    public static void p(String s) {
        if (isOut) {
            System.out.print(s);
            System.out.print("\t");
        }
    }

    public static void pl(String s) {
        if (isOut) {
            System.out.println(s);
            System.out.println("================================================================");
        }
    }

    public static void pl(ASTNode node) {
        if (isOut) {
            System.out.println(node.toString());
            System.out.println("================================================================");
        }
    }

    public static void pl(String title, ASTNode node) {
        if (isOut) {
            System.out.println("[[[ " + title + " ]]] ");
            if (node != null) {
                System.out.println(node.toString());
            }
            System.out.println("================================================================");
        }
    }

}
