package ru.netology.Mockito;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MoviesManagerTest {
    @Test
    public void shouldShowAllMovies() {
        MoviesManager manager = new MoviesManager();
        manager.add("first");
        manager.add("second");
        manager.add("third");

        String[] expected = {"first", "second", "third"};
        String[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastMovies() {
        MoviesManager manager = new MoviesManager(10);
        manager.add("first");
        manager.add("second");
        manager.add("third");
        String[] expected = {"third", "second", "first"};
        String[] actual = manager.findLast();
        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldShowLastMoviesIfMoviesMoreLimits() {
        MoviesManager manager = new MoviesManager(10);
        manager.add("1");
        manager.add("2");
        manager.add("3");
        manager.add("4");
        manager.add("5");
        manager.add("6");
        manager.add("7");
        manager.add("8");
        manager.add("9");
        manager.add("10");
        manager.add("11");
        String[] expected = {"11", "10", "9", "8", "7", "6", "5", "4", "3", "2"};
        String[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }
}


