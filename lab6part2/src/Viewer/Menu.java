/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viewer;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 * @param <T>
 */
public abstract class Menu<T>{
    protected String title;
    protected ArrayList<T> mchon;
    public Menu() {}
    public Menu(String td, String [] mc) {
        title =td;
        mchon=new ArrayList<>();
        for(String s:mc) mchon.add((T)s);
    }
    public void display() {
        System.out.println(title);
        System.out.println("-----------------------");
        for(int i=0;i<mchon.size();i++)
            System.out.println(i+"."+mchon.get(i));
        System.out.println("--------------------------");
    }
    public int getSelected() {
        display();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter selection..");
        return sc.nextInt();
    }
    public abstract void excute(int n);
    public void run() {
        while(true) {
            int n=getSelected();
            excute(n);
            if(n>mchon.size()) break;
        }
    }
}
