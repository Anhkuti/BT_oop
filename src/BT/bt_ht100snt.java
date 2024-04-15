package BT;

public class bt_ht100snt {
    public static void main(String[] args) {
        int a = 1;
        int num = 2;
        while(a < 100) {
            boolean ktra = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    ktra = false;
                    break;
                }
            }

            if(ktra) {
                System.out.println("Số nguyeen tố là: " + num);
            }
            a++;
            num++;

        }

    }
}
