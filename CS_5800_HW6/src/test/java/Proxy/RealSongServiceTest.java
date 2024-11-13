/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Proxy;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RealSongServiceTest {
    
    public RealSongServiceTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of searchById method, of class RealSongService.
     */
    @Test
    public void testSearchById() {
        System.out.println("searchById");
        Integer songID = 2;
        Metadata instance = new Metadata(2,"Song A", "Artist 1", "Album A", 201);
        List<Song> library = new ArrayList<Song>();
        library.add(new Song(instance));
        RealSongService instanceS = new RealSongService(library);
        int expResult = 2;
        Song result = instanceS.searchById(songID);
        assertEquals(expResult, result.getMetadata().getID());
    }

    /**
     * Test of searchByTitle method, of class RealSongService.
     */
    @Test
    public void testSearchByTitle() {
        System.out.println("searchByTitle");
        String title = "Song A";
        Metadata instance = new Metadata(2,"Song A", "Artist 1", "Album A", 201);
        List<Song> library = new ArrayList<Song>();
        library.add(new Song(instance));
        RealSongService instanceS = new RealSongService(library);
        String expResult = "Song A";
        List<Song> result = instanceS.searchByTitle(title);
        assertEquals(expResult, result.get(0).getMetadata().getTitle());
    }

    /**
     * Test of searchByAlbum method, of class RealSongService.
     */
    @Test
    public void testSearchByAlbum() {
        System.out.println("searchByAlbum");
        String album = "Album A";
        Metadata instance = new Metadata(2,"Song A", "Artist 1", "Album A", 201);
        List<Song> library = new ArrayList<Song>();
        library.add(new Song(instance));
        RealSongService instanceS = new RealSongService(library);
        String expResult = "Album A";
        List<Song> result = instanceS.searchByAlbum(album);
        assertEquals(expResult, result.get(0).getMetadata().getAlbum());
    }
    
}
