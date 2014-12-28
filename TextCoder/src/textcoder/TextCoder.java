/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package textcoder;

/**
 *
 * @author cthies
 */
public class TextCoder {

    private String plainText;

    public TextCoder(String plainText) {
        this.plainText = plainText;
    }
    
    public String coded() {
        StringBuilder result = new StringBuilder();
        
        for (Character ch : plainText.toCharArray()) {
            CodeLetter letter = new CodeLetter(ch);
            result.append(letter.toHex());
        }
        
        return result.toString();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String output = new TextCoder("Queen - The Love Songs").coded();
        System.out.println("0x " + output);
    }
    
}
