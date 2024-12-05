package oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayer mp = new MusicPlayer();
        mp.volume = 0;

        on(mp);

        volumeUp(mp);
        volumeDown(mp);
        volumeUp(mp);
        showStatus(mp);

        off(mp);
    }

    static void on(MusicPlayer mp){
        mp.playing = true;
        System.out.println("Music has been played!");
    }

    static void off(MusicPlayer mp){
        mp.playing = false;
        System.out.println("Music has been unplayed!");
    }

    static void volumeUp(MusicPlayer mp){
        mp.volume++;
        System.out.println("Volume is " + mp.volume);
    }

    static void volumeDown(MusicPlayer mp){
        mp.volume--;
        System.out.println("Volume is " + mp.volume);
    }

    static  void showStatus(MusicPlayer mp){
        System.out.println("Music Status : \n");
        if(mp.playing){
            System.out.println("Music is On, volume is " + mp.volume);
        }else{
            System.out.println("Music is Off.");
        }
    }
}
