/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Flyweight;

public class Character {
    private String stringText;
    private Properties properties;

    public Character(String stringText, Properties properties) {
        this.stringText = stringText;
        this.properties = properties;
    }

    public String getStringText() {
        return stringText;
    }

    public Properties getProperties() {
        return properties;
    }

    @Override
    public String toString() {
        return "Text: '" + stringText + "' (" + properties + ")";
    }
}
