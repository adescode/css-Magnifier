/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Magnifier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Magnifier minminner = new Magnifier();
        minminner.run();
    }

    public void run() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter expressions :");
        String codes = input.nextLine();
        String result = trimCol(codes);
        System.out.println(result);
    }

    public String trimCol(String input) {
        if (input.contains(Character.toString(';'))) {
            for (int i = 0; i < input.length(); i++) {
                while (input.charAt(i) == ';' && input.charAt(i + 1) != '\n') {
                    input = input.substring(0, i + 1) + "\n" + input.substring(i + 1);
                }
            }
        }
        input = trimClBra(input);
        return input;
    }

    public String trimClBra(String input) {
        if (input.contains(Character.toString('}'))) {
            for (int i = 0; i < input.length(); i++) {
                while (input.charAt(i) == '}' && input.charAt(i + 1) != '\n') {
                    input = input.substring(0, i + 1) + "\n" + input.substring(i + 1);
                }
            }
        }
        input = trimOpBra(input);
        return input;
    }

    public String trimOpBra(String input) {
        if (input.contains(Character.toString('}'))) {
            for (int i = 0; i < input.length(); i++) {
                while (input.charAt(i) == '{' && input.charAt(i + 1) != '\n') {
                    input = input.substring(0, i + 1) + "\n" + input.substring(i + 1);
                }
            }
        }
        return input;
    }
}
