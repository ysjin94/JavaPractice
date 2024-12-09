package final1;

public class ConstantMain1 {
    public static void main(String[] args) {
        System.out.println("Program participation : " +  1000);
        int currUserCount = 999;
        process(currUserCount++);
        process(currUserCount++);
        process(currUserCount++);
    }

    private static void process(int currUserCount) {
        System.out.println("Participation : " + currUserCount);
        if (currUserCount > 1000) {
            System.out.println("Register waiting list.");
        }else{
            System.out.println("Join Program.");
        }
    }
}
