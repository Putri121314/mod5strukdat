package com.company;

public class Main {
    public static void main(String[] args) {

        Binarytree pohon = new Binarytree();

        pohon.NewNode(20);
        pohon.NewNode(2);
        pohon.NewNode(25);
        pohon.NewNode(37);
        pohon.NewNode(16);

        System.out.print("\npre order : ");
        pohon.preOrder(pohon.root);
        System.out.print("\nIn Order : ");
        pohon.inOrder(pohon.root);
        System.out.print("\nPost Order : ");
        pohon.PostOrder(pohon.root);
    }

}

