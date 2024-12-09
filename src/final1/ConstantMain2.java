package final1;

public class ConstantMain2 {
    public static void main(String[] args) {
        System.out.println("Program participation : " +  Constant.MAX_USERS);
        int currUserCount = 999;
        process(currUserCount++);
        process(currUserCount++);
        process(currUserCount++);
    }

    private static void process(int currUserCount) {
        System.out.println("Participation : " + currUserCount);
        if (currUserCount > Constant.MAX_USERS) {
            System.out.println("Register waiting list.");
        }else{
            System.out.println("Join Program.");
        }
    }
}
