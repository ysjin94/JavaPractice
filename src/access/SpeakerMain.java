package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolumn();

        speaker.volumUp();
        speaker.showVolumn();

        speaker.volumUp();
        speaker.showVolumn();

        //Access Direct Access
//        System.out.println("Direct Access");
//        speaker.volume = 200;
//        speaker.showVolumn();
    }
}
