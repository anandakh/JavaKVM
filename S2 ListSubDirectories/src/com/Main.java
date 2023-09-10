package com;

import java.io.File;

public class Main {
    public static void recursiveprint(File[] arr, int index, int level) {
        if (index == arr.length)
            return;
        for (int i = 0; i < level; i++)
            System.out.print("\t");
        if (arr[index].isFile())
            System.out.println(arr[index].getName());
        else if (arr[index].isDirectory()) {
            System.out.println("[" + arr[index].getName() + "]");
            recursiveprint(arr[index].listFiles(), 0, (level + 1));
        }
        recursiveprint(arr, index + 1, level);
    }
    public static void main(String[] args) {
        String maindirpath = "D:\\College";
        File maindir = new File(maindirpath);
        if (maindir.exists() && maindir.isDirectory()) {
            File arr[] = maindir.listFiles();
            System.out.println("* * * * * * * * * * * * * * * * * * ");
            System.out.println("Files from main directory : " + maindir);
            System.out.println("* * * * * * * * * * * * * * * * * * ");
            recursiveprint(arr, 0, 0);
        }
    }
}

