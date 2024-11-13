/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Proxy;
import java.util.List;
import java.util.ArrayList;

public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Metadata> libraryMeta = new ArrayList<Metadata>();
        libraryMeta.add(new Metadata(1,"Song A", "Artist 1", "Album A", 201));
        libraryMeta.add(new Metadata(2,"Song B", "Artist 2", "Album B", 202));
        libraryMeta.add(new Metadata(3,"Song C", "Artist 3", "Album C", 203));
        libraryMeta.add(new Metadata(4,"Song D", "Artist 4", "Album D", 204));
        libraryMeta.add(new Metadata(5,"Song E", "Artist 5", "Album E", 205));
        
        List<Song> library = new ArrayList<Song>();
        library.add(new Song(libraryMeta.get(0)));
        library.add(new Song(libraryMeta.get(1)));
        library.add(new Song(libraryMeta.get(2)));
        library.add(new Song(libraryMeta.get(3)));
        library.add(new Song(libraryMeta.get(4)));
        
        RealSongService realService = new RealSongService(library);
        SongService proxyService = new SongServiceProxy(realService);
        
        System.out.println("Fetching Song by ID (ID = 1):");
        System.out.println(proxyService.searchById(1).getMetadata().getID());
        
        System.out.println("Fetching Song by Song (Song = Song A):");
        System.out.println(proxyService.searchByTitle("Song A").get(0).getMetadata().getTitle());
        
        System.out.println("Fetching Song by Album (Album = Album D):");
        System.out.println(proxyService.searchByAlbum("Album D").get(0).getMetadata().getAlbum());
        
        System.out.println("Fetching Song by ID (ID = 2):");
        System.out.println(proxyService.searchById(2).getMetadata().getID());
        
        System.out.println("Fetching Song by Song (Song = Song E):");
        System.out.println(proxyService.searchByTitle("Song E").get(0).getMetadata().getTitle());

    }
    
}
