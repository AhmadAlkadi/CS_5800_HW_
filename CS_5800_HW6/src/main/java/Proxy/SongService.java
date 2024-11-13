/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proxy;
import java.util.List;

public interface SongService {
Song searchById(Integer songID);
List<Song> searchByTitle(String title);
List<Song> searchByAlbum(String album);
}
