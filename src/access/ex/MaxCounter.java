package access.ex;

public class MaxCounter {
    private int count = 0;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment(){
        if(!isMaxValid()) {
            count += 1;
        }else{
            System.out.println("Hit Max count.");
        }
    }

    private boolean isMaxValid(){
        return count >= max ;
    }
    public int getCount(){
        return this.count;
    }
}
