/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package display;

/**
 *
 * @author mehed
 */
public class Display {

    /**
     * @param args the command line arguments
     */
    
    private String prePadding = " ";
    private int postPadding = 25;
    private int midPos = 0;
    private int length = 0;
    private String gaps;
    private String newString = "";
   

    private String calculateGap(int a, int b) {
        String gap = "";
        for (int i = b; i <= a - 1; i++) {
            gap = gap + " ";
        }
        return gap;
    }

    public void showInTable(String s) {

        String[] words = null;
        words = s.split(",", 0);
        for (int j = 0; j < words.length; j++) {
            String word = words[j];
            length = word.length();
            gaps = calculateGap(postPadding, length);
            newString += prePadding +word + gaps;

        }

        System.out.println("|" + newString + "|");
        newString = "";

    }

    public void showMenuBar(String s) {
        String[] words = null;
        words = s.split(",", 0);
        for (int j = 0; j < words.length; j++) {
            String word = words[j];
            length = word.length();
            gaps = calculateGap(postPadding, length);
            newString += prePadding + word + gaps;

        }

        System.out.print("+");
        for (int i = 0; i < newString.length(); i++) {
            System.out.print("=");
        }
        System.out.println("+");
        System.out.println("|" + newString + "|");
        System.out.print("+");
        for (int i = 0; i < newString.length(); i++) {
            System.out.print("=");
        }
        System.out.println("+");
        newString = "";
    }

    public void endBar(String s) {
        String[] words = null;
        words = s.split(",", 0);
        for (int j = 0; j < words.length; j++) {
            String word = words[j];
            length = word.length();
            gaps = calculateGap(postPadding, length);
            newString += prePadding + word + gaps;

        }

        
        System.out.print("+");
        for (int i = 0; i < newString.length(); i++) {
            System.out.print("=");
        }
        System.out.println("+");
        newString = "";
    }
    

//    public static void main(String[] args) {
//        // TODO code application logic here
//        //Display D = new Display();
//        
//    }
    
}
