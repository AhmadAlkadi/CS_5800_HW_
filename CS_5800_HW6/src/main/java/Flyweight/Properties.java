/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Flyweight;

public class Properties {
    private String font;
    private String color;
    private int size;
    
    public Properties(String font, String color, int size){
        this.font = font;
        this.color = color;
        this.size = size;
    }
    
    public String getFont(){
        return font;
    }
    
    public String getColor(){
        return color;
    }
    
    public int getSize(){
        return size;
    }
    
    @Override
    public String toString(){
        return "Font: " + font + ", Color: " + color + ", Size: "+ size;
    }
}
