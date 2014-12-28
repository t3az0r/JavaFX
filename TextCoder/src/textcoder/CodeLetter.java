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
class CodeLetter {

    public CodeLetter(Character character) {
        this.character = character;
    }
    private Character character;

    @Override
    public String toString() {
        return character.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String toHex() {
        if(Character.isAlphabetic((int)character))
            return String.format("%02x", toNumericValue());
        else
            return String.valueOf(character);
    }
    
    public int toNumericValue() {
        // shift to 1-based
        return Character.getNumericValue(character) - 9;
    }
    
    
}
