package com.example.morsecode;

import java.util.HashMap;
import java.util.Map;

public class MorseCodeTranslator {
    Map<Character, String> morseToTextMapping = new HashMap<>();
    Map<String, Character> textToMorseMapping = new HashMap<>();

    char[] letter = {
        'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
        'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
        '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', ' '
    };

    String[] morse = {
        ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
        ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
        "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
        "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
        "-----", "/"
    };

    public MorseCodeTranslator() {
        setupMap();
    }

    /**
     * This method populates the map of 'morseToTextMapping' map with the mappings from
     * characters to Morse code strings and the 'textToMorseMapping' map with the mappings
     * from Morse code strings to characters
     */
    private void setupMap(){
        for (int i = 0; i < letter.length; i++) {
            morseToTextMapping.put(letter[i], morse[i]);
            textToMorseMapping.put(morse[i], letter[i]);
        }
    }

    /**
     * 'translateToMorse` takes a user text input and convert it to Morse coding using the `morseToTextMapping`
     * map
     *
     */
    public String translateToMorse(String text){
        char[] characters = text.toCharArray();
        StringBuilder morseString = new StringBuilder();

        for (char character : characters) {
            morseString.append(morseToTextMapping.get(character)).append(" ");
        }
        return String.valueOf(morseString);
    }

    /**
     * This method is similar to the above but different functionality
     */
    public String translateToText(String morse){
        String[] morseArray = morse.split(" ");

        StringBuilder morseString = new StringBuilder();

        for (String morsePart : morseArray) {
            morseString.append(textToMorseMapping.get(morsePart));
        }
        return String.valueOf(morseString);
    }
}
