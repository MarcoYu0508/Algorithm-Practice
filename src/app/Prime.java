package app;

/**
 * Prime
 */
public class Prime {

    public static void main(String[] args) {
        final int MAX = 300;
        boolean prime[] = new boolean[MAX]; //boolean預設為false
        prime[0] = true;
        prime[1] = true;
        int num = 2;
        while (num < MAX) {
            if (!prime[num]) {
                for (int i = num+num; i < MAX; i+=num) {
                    if (prime[i]) continue;
                    prime[i] = true;
                }
            }
            num++;
        }

        System.out.println("1到" + MAX + "間的所有質數：");
        int count = 0;
        for (int i = 2 ; i < prime.length; i++) {
            if (!prime[i]) {
                System.out.println(i+"\t");
                count++;
            }
        }
        System.out.println("\n質數總數 = " + count + "個");
    }
}