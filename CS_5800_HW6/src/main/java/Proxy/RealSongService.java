/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proxy;
import java.util.List;
import java.util.ArrayList;

public class RealSongService implements SongService{
    private List<Song> songLibrary = new ArrayList<Song>();
    
    public RealSongService(){
    }
    
    public RealSongService(List<Song> songLibrary){
        this.songLibrary = songLibrary;
    }
    
    @Override
    public Song searchById(Integer songID){
        simulateNetworkLatency();
        
        Song returnSong = null;
        for(Song s: songLibrary){
            if(s.getMetadata().getID() == songID){
                returnSong = s;
                break;
            }
        }
        
        return returnSong;
    }
    
    @Override
    public List<Song> searchByTitle(String title){
        simulateNetworkLatency();
        
        List<Song> returnSong = new ArrayList<Song>();
        for(Song s: songLibrary){
            if(s.getMetadata().getTitle().equals(title)){
                returnSong.add(s);
                break;
            }
        }
       
        
        return returnSong;
    }
    
    @Override
    public List<Song> searchByAlbum(String album){
        simulateNetworkLatency();
        
        List<Song> returnSong = new ArrayList<Song>();
        for(Song s: songLibrary){
            if(s.getMetadata().getAlbum().equals(album)){
                returnSong.add(s);
                break;
            }
        }
        
        return returnSong;
    }
    
    private void simulateNetworkLatency(){
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
