public class Exe {
    public static void main(String[] args) {
        OneToOneS s = new OneToOneS();
        OneToOneC c = new OneToOneC();
        s.runServer();
        c.runClient();
    }
}
