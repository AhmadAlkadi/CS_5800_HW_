/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proxy;

public class Song {
    private Metadata metadata;
    
    public Song(Metadata metadata){
        this.metadata = metadata;
    }
    
    public Metadata getMetadata(){
        return metadata;
    }
}
