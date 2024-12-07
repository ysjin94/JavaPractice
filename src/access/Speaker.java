package access;

public class Speaker {
    private int volume;

    Speaker(int volume){
        this.volume = volume;
    }

    void volumUp(){
        if( this.volume >= 100){
            System.out.println("Hit Max Volume.");
        }else{
            this.volume += 10;
            System.out.println("Volume up to "+this.volume);
        }
    }
    void volumDown(){
        this.volume -= 10;
        System.out.println("Volume dowm to "+this.volume);
    }

    void showVolumn(){
        System.out.println("Current Volume = " + this.volume);
    }

}
