/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proxy;

public class Metadata {
    private int id;
    private String title;
    private String artist;
    private String album;
    private int duration;
    
    public Metadata(int id, String title, String artist, String album, int duration){
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
    }
    
    public void setID(int id){
        this.id = id;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public void setArtist(String artist){
        this.artist = artist;
    }
    
    public void setAlbum(String album){
        this.album = album;
    }
    
    public void setDuration(int duration){
        this.duration = duration;
    }
    
    public int getID(){
        return id;
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getArtist(){
        return artist;
    }
    
    public String getAlbum(){
        return album;
    }
    
    public int getDuration(){
        return duration;
    }
}
