public class Cale {
    public static void add() {
        int sum;
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("add 请输入a值");
        int a = input.nextInt();
        System.out.println("请输入b值");
        int b = input.nextInt();
        sum =a+b;
        assert sum==a+b;
        System.out.println(sum);
    }

    public static void subtract() {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("subtract 请输入a值");
        int a = input.nextInt();
        System.out.println("请输入b值");
        int b = input.nextInt();
        System.out.println(a + b);
    }
}
