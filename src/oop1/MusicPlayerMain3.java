package oop1;

public class MusicPlayerMain3 {
    public static void main(String[] args) {
        MusicPlayer mp = new MusicPlayer();

        mp.volume = 0;
        mp.playing = true;
        System.out.println("Music has been played!");

        mp.volume++;
        System.out.println("Volume is " + mp.volume);

        mp.volume++;
        System.out.println("Volume is " + mp.volume);

        mp.volume--;
        System.out.println("Volume is " + mp.volume);

        System.out.println("Music Status : \n");
        if(mp.playing){
            System.out.println("Music is On, volume is " + mp.volume);
        }else{
            System.out.println("Music is Off.");
        }

        mp.playing = false;
        System.out.println("Music has been unplayed!");

    }
}
