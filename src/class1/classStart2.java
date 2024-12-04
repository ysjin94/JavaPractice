package class1;

public class classStart2 {

    public static void main(String[] args) {
        String[] studNms = {"stud1", "stud2"};
        int[]   studAge   = {15 ,16};
        int[]   studGrd   = {90, 80};

        for(int i = 0; i < studNms.length; i++){
            System.out.println("Name : " + studNms[i] + " Age : " + studAge[i] + " Grad : " + studGrd[i]);
        }

    }
}
