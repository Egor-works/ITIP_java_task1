public class Main {
    public static void main(String[] args) {
        System.out.println("№1 " + remainder(-9, 45));
        System.out.println("№2 " + triArea(3, 2));
        System.out.println("№3 " + animals(2,3,5));
        System.out.println("№4 " + profitableGamble(0.2, 50, 9));
        System.out.println("№5 " + operation(24, 15, 9));
        System.out.println("№6 " + ctoa('A'));
        System.out.println("№7 " + addUpTo(3));
        System.out.println("№8 " + nextEdge(8, 10));
        System.out.println("№9 " + sumOfCubes(new int[]{3, 4, 5}));
        System.out.println("№10 " + abcmath(42, 5, 10));
    }

    public static int remainder(int dec1, int dec2) {
        return dec1 % dec2;
    }
    public static int triArea(int val1, int val2) {
        return (int) (0.5 * (val1 * val2));
    }
    public static int animals(int chickens, int cows, int pigs) {
        return 2 * chickens + 4 * (cows + pigs);
    }
    public static boolean profitableGamble(double prob, int prise, int pay) {
        return (prob * prise) > pay;
    }
    public static String operation(int N, int a, int b) {
        if (a + b == N) return "added";
        else if (a - b == N) return "subtracted";
        else if (a * b == N) return "multiply";
        else if (a / b == N) return "divide";
        else return "none";
    }
    public static int ctoa(char val) {
        return val;
    }
    public static int addUpTo(int dec) {
        int sum = 0;
        for (int i = 0; i <= dec; i++) {
            sum += i;
        }
        return sum;
    }
    public static int nextEdge(int dec1, int dec2) {
        return dec1 + dec2 - 1;
    }
    public static int sumOfCubes(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += Math.pow(num, 3);
        }
        return sum;
    }
    public static boolean abcmath(int dec1, int dec2, int dec3) {
        for(int i = 0; i < dec2; i++) {
            dec1 += dec1;
        }
        return dec1 % dec3 == 0;
    }
}