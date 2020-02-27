package app;

import java.util.Random;

/**
 * Sentry
 */
public class Sentry {

    Random random = new Random();
    int data[] = new int[random.nextInt(11)+10];
   
    public static void main(String[] args) {

        Sentry sentry = new Sentry();
        sentry.dataInit();
        System.out.print("改良氣泡排序法\n原始資料: ");
        sentry.showData();
        sentry.bubble();
        System.out.print("排序後結果: ");
        sentry.showData();
        
    }

    public void dataInit() {
        for (int i = 0; i < data.length; i++) {
            data[i] = (int) (Math.random() * 100);
        }
    }

    public void bubble() {
        int size = data.length;
        // 至少做 n-1 次比較
        while (size-- > 0) {
            boolean flag = true;
            for (int i = 0; i < size; i++) {
                if (data[i] > data[i + 1]) {
                    int temp = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = temp;
                    flag = false;
                }
            }
            if (flag) break;

            System.out.print("第" + (data.length - size) + "次排序: ");
            showData();
        }
    }

    public void showData() {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("\n");
    }
}