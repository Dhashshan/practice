public class Pattern2{
    public static void main(String[] args) {
        int n = 13;
        for (int i = 0; i < n - 6 + n - 7; i++) { // Combined loop
            for (int j = 0; j < n; j++) {
                if (i < n - 6) { // First part condition
                    if (i == 0 || i == n - 1 || j == 0) {
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }
                } else { // Second part condition
                    if (i == 12 || j == 12) {
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }
                }
            }
            System.out.println();
        }
    }
}
