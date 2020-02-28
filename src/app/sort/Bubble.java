package app.sort;

import java.util.Random;

/**
 * Bubble
 */
public class Bubble {

    public static void main(String[] args) {

        Random random = new Random();
        int data[] = new int[random.nextInt(11)+10];
        for (int i = 0; i < data.length; i++) {
            data[i] = (int) (Math.random() * 100);
        }

        System.out.println("氣泡排序法");
        System.out.println("原始資料: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("\n");

        
        int size = data.length;
        // 至少做 n-1 次比較
        while (size-- > 0) {
            for (int i = 0; i < size; i++) {
                if (data[i] > data[i + 1]) {
                    int temp = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = temp;
                }
            }

            System.out.print("第" + (data.length - size) + "次排序: ");
            for (int i = 0; i < data.length; i++) {
                System.out.print(data[i] + " ");
            }
            System.out.println("\n");
        }

        System.out.print("排序後結果: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("\n");
    }
}