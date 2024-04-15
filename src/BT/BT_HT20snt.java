package BT;

public class BT_HT20snt {
    public static void main(String[] args) {
        int a = 1;
        int num = 2;
         while (a <= 20) {
              boolean Ktra = true;
          for (int i = 2; i <= Math.sqrt(num); i++) {
              if (num % i == 0) {
                  Ktra = false;
                  break;
              }
          }
          if (Ktra){
              System.out.println("Số nguyên tố là: " + num);
          }
          a++;
          num++;
         }
    }
}
