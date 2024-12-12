package org.example;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> playlist =  new ArrayList<>();
    private String name;
    private int volume;


    public void setPlaylist(List<Music> playlist) {
        this.playlist = playlist;
    }



    public void setMusic(Music music) {
        this.playlist = playlist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public MusicPlayer(Music music) {
        this.playlist = setPlaylist();
    }

    public MusicPlayer() {
    }

    public void playMusic() {
        System.out.println("playing music " + music.getSong());
    }
}
