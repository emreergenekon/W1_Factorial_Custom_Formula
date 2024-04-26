import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int n;
        int r;
        int combination = 1;

        //inputs for n & r
        Scanner input = new Scanner(System.in);
        System.out.print("Eleman Sayısını Giriniz : ");
        n = input.nextInt();
        System.out.print("Grup Sayısını Giriniz : ");
        r = input.nextInt();
        
        int sub = n - r;
        int subtotal = 1;
        for (int i = 1; i <= sub; i++) {
            subtotal *= i;
        }
        int ntotal = 1;
        for (int i = 1; i <= n; i++) {
            ntotal *= i;
        }
        //error promt if (n < r) scenerio
        if (n < r) {
            System.out.println("Grup sayısı eleman sayısından büyük olamaz.");
        } else {
            int rtotal = 1;
            for (int i = 1; i <= r; i++) {
                rtotal *= i;
            }
            //final formula to promt solution.
            combination = ntotal / (rtotal * subtotal);
            System.out.print(combination);
        }
    }
}