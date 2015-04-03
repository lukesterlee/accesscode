package nyc.c4q.lukesterlee;

/**
 * Created by Luke Lee on 4/1/2015.
 */
public class TV {

    int channel;
    int volumeLevel;
    boolean on;

    public TV() {
        channel = 0;
        volumeLevel = 0;
        on = true;
    }

    public TV(int channel) {
        this.channel = channel;
        volumeLevel = 0;
        on = true;
    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void setChannel(int newChannel) {
        this.channel = newChannel;
    }

    public void setVolume(int newVolume) {

    }

    public void channelUp() {

    }

    public void channelDown() {

    }

    public void channelLineUp() {
        System.out.println("1. NBC");
        System.out.println("2. ABC");
        System.out.println("3. Fox");
    }

    public void volumeUp() {
        volumeLevel++;
    }

    public void volumeDown() {
        if (volumeLevel != 0)
            volumeLevel--;
    }



}
