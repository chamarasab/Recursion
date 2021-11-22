public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Loops in another way!");
        System.out.println("Loop Sum : " + sumLoop(5, 10));
        System.out.println("Recursion Sum : " + sumRecursion(5, 10));
    }

    public static int sumLoop(int start, int end) {
        System.out.println("_______________");

        int sum = start;
        do {
            System.out.println(start);
            sum += ++start;
        } while (start < end);
        System.out.println("_______________");
        return sum;

    }

    public static int sumRecursion(int start, int end) {
        if (start < end) {
            return start + sumRecursion(start + 1, end);
        } else {
            return start;
        }
    }
}
