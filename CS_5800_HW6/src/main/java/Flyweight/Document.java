/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Flyweight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Document {
        private final List<Character> characters = new ArrayList<>();

    public void addCharacter(String stringText, String font, String color, int size) {
        Properties properties = PropertiesFactory.getFlyweight(font, color, size);
        characters.add(new Character(stringText, properties));
    }

    public void saveToFile(String filename) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            for (Character character : characters) {
                writer.println(character.getStringText() + "," +
                               character.getProperties().getFont() + "," +
                               character.getProperties().getColor() + "," +
                               character.getProperties().getSize());
            }
        } catch (IOException e) {
            System.err.println("Error saving to file: " + e.getMessage());
        }
    }

    public void loadFromFile(String filename) {
        characters.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    String stringText = parts[0];
                    String font = parts[1];
                    String color = parts[2];
                    int size = Integer.parseInt(parts[3]);
                    
                    
                    
                    Properties properties = PropertiesFactory.getFlyweight(font, color, size);
                    characters.add(new Character(stringText, properties));
                }
            }
        } catch (IOException e) {
            System.err.println("Error loading from file: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Character character : characters) {
            sb.append(character.getStringText());
        }
        return sb.toString();
    }
}
