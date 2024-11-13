/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proxy;

import java.util.List;
import java.util.ArrayList;

public class SongServiceProxy implements SongService{
    private List<Metadata> metadataCache = new ArrayList<Metadata>();
    private RealSongService songService;
    
    public SongServiceProxy(){
    }
    
    public SongServiceProxy(RealSongService songService){
        this.songService = songService;
    }
    
    @Override
    public Song searchById(Integer songID){
        
        Song song = songService.searchById(songID);
        metadataCache.add(song.getMetadata());
        
        return song;
    }
    
    @Override
    public List<Song> searchByTitle(String title){
        List<Song> song = songService.searchByTitle(title);
        for(Song e: song){
            if(e.getMetadata().getTitle().equals(title)){
                metadataCache.add(e.getMetadata());
            }
        }
        
        return song;
    }
    
    @Override
    public List<Song> searchByAlbum(String album){
        
        List<Song> song = songService.searchByAlbum(album);
        for(Song e: song){
            if(e.getMetadata().getAlbum().equals(album)){
                metadataCache.add(e.getMetadata());
            }
        }
        
        return song;
    }
    
    public void printMetadat(){
        for(Metadata e: metadataCache){
            System.out.println("Song ID: " + e.getID() + ", Song Title: " + e.getTitle() + ", Song Album:" + e.getAlbum()
            + ", Song Artist: " + e.getArtist() + ", Song Duration: " + e.getDuration());
        }
    }
}
