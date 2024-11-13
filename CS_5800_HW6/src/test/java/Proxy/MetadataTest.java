/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Proxy;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MetadataTest {
    
    public MetadataTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of setID method, of class Metadata.
     */
    @Test
    public void testSetID() {
        System.out.println("setID");
        Metadata instance = new Metadata(2,"Song A", "Artist 1", "Album A", 201);
        instance.setID(3);
        assertEquals(3, instance.getID());
    }

    /**
     * Test of setTitle method, of class Metadata.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        Metadata instance = new Metadata(2,"Song A", "Artist 1", "Album A", 201);
        instance.setTitle("Test");
        assertEquals("Test", instance.getTitle());
    }

    /**
     * Test of setArtist method, of class Metadata.
     */
    @Test
    public void testSetArtist() {
        System.out.println("setArtist");
        Metadata instance = new Metadata(2,"Song A", "Artist 1", "Album A", 201);
        instance.setArtist("TestA");
        assertEquals("TestA", instance.getArtist());
    }

    /**
     * Test of setAlbum method, of class Metadata.
     */
    @Test
    public void testSetAlbum() {
        System.out.println("setAlbum");
        Metadata instance = new Metadata(2,"Song A", "Artist 1", "Album A", 201);
        instance.setAlbum("TestB");
        assertEquals("TestB", instance.getAlbum());
    }

    /**
     * Test of setDuration method, of class Metadata.
     */
    @Test
    public void testSetDuration() {
        System.out.println("setDuration");
        Metadata instance = new Metadata(2,"Song A", "Artist 1", "Album A", 201);
        instance.setDuration(200);
        assertEquals(200, instance.getDuration());
    }

    /**
     * Test of getID method, of class Metadata.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Metadata instance = new Metadata(2,"Song A", "Artist 1", "Album A", 201);
        int expResult = 2;
        int result = instance.getID();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTitle method, of class Metadata.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        Metadata instance = new Metadata(2,"Song A", "Artist 1", "Album A", 201);
        String expResult = "Song A";
        String result = instance.getTitle();
        assertEquals(expResult, result);
    }

    /**
     * Test of getArtist method, of class Metadata.
     */
    @Test
    public void testGetArtist() {
        System.out.println("getArtist");
        Metadata instance = new Metadata(2,"Song A", "Artist 1", "Album A", 201);
        String expResult = "Artist 1";
        String result = instance.getArtist();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAlbum method, of class Metadata.
     */
    @Test
    public void testGetAlbum() {
        System.out.println("getAlbum");
        Metadata instance = new Metadata(2,"Song A", "Artist 1", "Album A", 201);
        String expResult = "Album A";
        String result = instance.getAlbum();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDuration method, of class Metadata.
     */
    @Test
    public void testGetDuration() {
        System.out.println("getDuration");
        Metadata instance = new Metadata(2,"Song A", "Artist 1", "Album A", 201);
        int expResult = 201;
        int result = instance.getDuration();
        assertEquals(expResult, result);
    }
    
}
