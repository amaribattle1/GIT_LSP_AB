package org.howard.edu.lsp.oopfinal.question1;
import java.util.*;

public class SongsDatabase {
    private Map<String, Set<String>> map = new HashMap<String, Set<String>>();

    /* Add a song title to a genre */
    public void addSong(String genre, String songTitle) {
        // If the genre already exists, add the song to its set
        // Otherwise, create a new set for the genre and add the song
        map.computeIfAbsent(genre, k -> new HashSet<>()).add(songTitle);
    }

    /* Return genre, i.e., jazz, given a song title */
    public String getGenreOfSong(String songTitle) {
        // Iterate through the map entries to find the genre containing the song
        for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
            if (entry.getValue().contains(songTitle)) {
                return entry.getKey();
            }
        }
        // Return null if song title not found
        return null;
    }

    /* Return the Set that contains all songs for a genre */
    public Set<String> getSongs(String genre) {
        // If the genre exists, return its set of songs
        // Otherwise, return an empty set
        return map.getOrDefault(genre, new HashSet<>());
    }
}
