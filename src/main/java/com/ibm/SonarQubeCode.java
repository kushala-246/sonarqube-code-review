public class SonarQubeCode {
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        SonarQubeCode app = new SonarQubeCode();
        System.out.println("2 + 3 = " + app.add(2, 3));
    }
}
