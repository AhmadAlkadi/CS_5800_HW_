/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Proxy;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SongTest {
    
    public SongTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of getMetadata method, of class Song.
     */
    @Test
    public void testGetMetadata() {
        System.out.println("getMetadata");
        Metadata instance = new Metadata(2,"Song A", "Artist 1", "Album A", 201);
        Song instanceSong = new Song(instance);
        Metadata expResult = new Metadata(2,"Song A", "Artist 1", "Album A", 201);
        Metadata result = instanceSong.getMetadata();
        assertEquals(expResult.getAlbum(), result.getAlbum());
    }
    
}
