package org.howard.edu.lsp.oopfinal.question1;

import static org.junit.Assert.*;
import org.junit.*;

import java.util.Set;

public class SongsDatabaseTest {
    private SongsDatabase db;

    @Before
    public void setUp() {
        db = new SongsDatabase();
    }

    @Test
    public void testAddSong() {
        db.addSong("Rap", "Savage");
        assertTrue(db.getSongs("Rap").contains("Savage"));
    }

    @Test
    public void testGetGenreOfSong() {
        db.addSong("Rap", "Savage");
        assertEquals("Rap", db.getGenreOfSong("Savage"));
    }

    @Test
    public void testGetGenreOfSong_NotFound() {
        assertNull(db.getGenreOfSong("Savage"));
    }

    @Test
    public void testGetSongs() {
        db.addSong("Rap", "Savage");
        db.addSong("Rap", "Gin and Juice");
        Set<String> rapSongs = db.getSongs("Rap");
        assertTrue(rapSongs.contains("Savage"));
        assertTrue(rapSongs.contains("Gin and Juice"));
    }

    @Test
    public void testGetSongs_Empty() {
        Set<String> emptySongs = db.getSongs("Pop");
        assertTrue(emptySongs.isEmpty());
    }
}

