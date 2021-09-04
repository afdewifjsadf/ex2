public class TestObserver {
    public static void main(String[] args) {
        showScore obj1 = new showScore();
        showScore obj2 = new showScore();
        HeadQuater obj = new HeadQuater();
        obj.register(obj1);
        obj.register(obj2);
        System.out.println("Enter Score Thai 1-0 UAE");
        obj.setSomeData(1, 0);
        System.out.println("Enter Score Thai 2-0 UAE");
        obj.setSomeData(2, 0);
        System.out.println("Enter Score Thai 2-1 UAE");
        obj.setSomeData(2, 1);
    }
}
