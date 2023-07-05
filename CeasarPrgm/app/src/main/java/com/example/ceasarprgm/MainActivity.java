package com.example.ceasarprgm;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText inputText;
    private EditText shiftValue;
    private TextView outputText;
    private Button encryptButton;
    private Button decryptButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputText = findViewById(R.id.input_text);
        shiftValue = findViewById(R.id.shift_value);
        outputText = findViewById(R.id.output_text);
        encryptButton = findViewById(R.id.encrypt_button);
        decryptButton = findViewById(R.id.decrypt_button);

        encryptButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = inputText.getText().toString();
                int shift = Integer.parseInt(shiftValue.getText().toString());
                String ciphertext = caesarCipher(text, shift);
                outputText.setText(ciphertext);
            }
        });

        decryptButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = outputText.getText().toString();
                int shift = Integer.parseInt(shiftValue.getText().toString());
                String plaintext = caesarDecipher(text, shift);
                outputText.setText(plaintext);
            }
        });
    }

    private String caesarCipher(String text, int shift) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            if (Character.isLetter(character)) {
                if (Character.isUpperCase(character)) {
                    char encryptedChar = (char) ((character - 'A' + shift) % 26 + 'A');
                    result.append(encryptedChar);
                } else {
                    char encryptedChar = (char) ((character - 'a' + shift) % 26 + 'a');
                    result.append(encryptedChar);
                }
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }

    private String caesarDecipher(String text, int shift) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            if (Character.isLetter(character)) {
                if (Character.isUpperCase(character)) {
                    char decryptedChar = (char) ((character - 'A' - shift +26) % 26 + 'A');
                    result.append(decryptedChar);
                } else {
                    char decryptedChar = (char) ((character - 'a' - shift + 26) % 26 + 'a');
                    result.append(decryptedChar);
                }
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }



}
