package pl.roznicki;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Eliza eliza;
        eliza = new Eliza();
        String text = "";
        Scanner command = new Scanner(System.in);
        while(!text.equalsIgnoreCase("exit"))
        {
            text = command.nextLine();
            System.out.println(eliza.processInput(text));
        }
}}
