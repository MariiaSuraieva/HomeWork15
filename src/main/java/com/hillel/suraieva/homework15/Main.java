package com.hillel.suraieva.homework15;

public class Main {
    public static void main(String[] args) {
        ClassicMusic justClassic = new ClassicMusic();
        PopMusic funGirls = new PopMusic();
        RockMusic hardRock = new RockMusic();

        MusicStyles[] musicStyles = {
                justClassic, funGirls, hardRock
        };

        for (MusicStyles musicStyle : musicStyles) {
            musicStyle.playMusic();
        }


    }
}
