package com.campusdual.classroom;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TVRemoteTest {

    TVRemote remote;

    @BeforeEach
    void setUp() {
        this.remote = new TVRemote("Black");
    }

    @Test
    @DisplayName("Test turn on TV Remote")
    void testTurnOn() {
        boolean status = this.remote.on;
        this.remote.turnOn();
        assertEquals(!status, this.remote.on);
    }

    @Test
    @DisplayName("Test turn off TV Remote")
    void testTurnOff() {
        boolean status = this.remote.on;
        this.remote.turnOn();
        this.remote.turnOff();
        assertEquals(status, this.remote.on);
    }

    @Test
    @DisplayName("Test change channel on TV Remote")
    void testChangeChannel() {
        int initialChannel = this.remote.channel;
        this.remote.channelUp();
        assertEquals(initialChannel+1, this.remote.channel, "Channel number is not the next channel number");
        initialChannel = this.remote.channel;
        this.remote.channelDown();
        assertEquals(initialChannel-1, this.remote.channel, "Channel number is not the previous channel number");
        this.remote.channel = 0;
        this.remote.channelDown();
        assertEquals(0, this.remote.channel, "Channel cannot be a negative number");
    }

    @Test
    @DisplayName("Test change volume on TV Remote")
    void testVolumeUp() {
        int initialVolume = this.remote.volume;
        this.remote.volumeUp();
        assertEquals(initialVolume+1, this.remote.volume, "Volume number is not the next Volume number");
        initialVolume = this.remote.volume;
        this.remote.volumeDown();
        assertEquals(initialVolume-1, this.remote.volume, "Volume number is not the previous Volume number");
        this.remote.volume = 0;
        this.remote.volumeDown();
        assertEquals(0, this.remote.volume, "Volume number cannot be a negative number");
    }


    @Test
    @DisplayName("Test obtain color from TV Remote")
    void testGetColor() {
        assertEquals("Black", this.remote.getColor(), "TV Remote is not black!");
    }
}