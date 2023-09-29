package com.example.morsecode;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;

public class Controller {
    @FXML
    private TextArea textInput;

    @FXML
    private TextArea morseOutput;

    // The MorseCodeTranslator instance is used to perform the actual translation between text and Morse Code
    MorseCodeTranslator morseCodeTranslator = new MorseCodeTranslator();

    // Default translation is text to morseCode
    boolean morseToText = false;

    /**
     * First conditional handle Morse code to text, else it does the opposite
     *
     * @param event
     */
    @FXML
    void updateMorseCode(KeyEvent event) {
        if(morseToText){
            morseOutput.setText(morseCodeTranslator.translateToText(textInput.getText()));
        }else {
            morseOutput.setText(morseCodeTranslator.translateToMorse(textInput.getText()));
        }
    }

    // If the user clicks the 'switch' button, the program changes the translation mode
    @FXML
    void switchStyle(ActionEvent event) {
        morseToText = !morseToText;
    }

}