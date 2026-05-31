public class multiUseprogram {
    
    // 1 Parameter
    public static void multiUse(int a) {
        System.out.println("Numbers from 1 to " + a + ":");
        for (int i = 1; i <= a; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


    // 2 Parameters
    public static void multiUse(int a, int b) {
        double average = (a + b) / 2;
        System.out.println("Average of " + a + " and " + b + " = " + average);
    }

    // 3 Parameters
    public static void multiUse(int a, int b, int c) {
        int max = a;
        if (b > max) {
        }
            max = b;
        if (c > max) {
            max = c;
        }
        System.out.println("The Maximum of " + a + " , " + b + " , and " + c + " = " + max);
    }

    public static void main(String[]args) {

        // Only 1 Parameter
        multiUse(15);

        // Only 2 Parameters
        multiUse(15,30);

        // All 3 Parameters
        multiUse(15,30,45);
    }
}

