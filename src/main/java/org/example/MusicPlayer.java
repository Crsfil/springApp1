package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Component
public class MusicPlayer {
    private List<Music> playlist =  new ArrayList<>();
    private String name;
    private int volume;

    @Autowired
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

    public MusicPlayer() {
    }

    public void playMusic() {
        for (Music music : playlist) {
            System.out.println("Playing: "+ music.getSong());
        }
    }
}
