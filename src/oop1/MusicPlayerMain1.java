package oop1;
//절차지향 프로그래밍
public class MusicPlayerMain1 {

    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = true;

        isOn = true;
        System.out.println("Music has been played!");

        volume++;
        System.out.println("Volume is " + volume);

        volume++;
        System.out.println("Volume is " + volume);

        volume--;
        System.out.println("Volume is " + volume);

        System.out.println("Music Status : \n");
        if(isOn){
            System.out.println("Music is On, volume is " + volume);
        }else{
            System.out.println("Music is Off.");
        }

        isOn = false;
        System.out.println("Music has been unplayed!");
    }
}
