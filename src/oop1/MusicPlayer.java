package oop1;

public class MusicPlayer {
    int volume = 0;
    boolean playing = false;

    void on(){
        this.playing = true;
        System.out.println("Music has been played!");
    }

    void off(){
        this.playing = false;
        System.out.println("Music has been unplayed!");
    }

    void volumeUp(){
        this.volume++;
        System.out.println("Volume is " + this.volume);
    }

    void volumeDown(){
        this.volume--;
        System.out.println("Volume is " + this.volume);
    }

    void showStatus(){
        System.out.println("Music Status : \n");
        if(this.playing){
            System.out.println("Music is On, volume is " + this.volume);
        }else{
            System.out.println("Music is Off.");
        }
    }
}
