package static2;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1.Static Call");
        DecoData.staticCall();

        System.out.println("2.Instance Call1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3.instance Call2");
        DecoData data2 = new DecoData();
        data2.instanceCall();
    }
}
