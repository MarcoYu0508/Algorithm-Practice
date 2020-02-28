package app.sort;

import java.util.Random;

/**
 * Selection
 */
public class Selection {

    Random random = new Random();
    int data[] = new int[random.nextInt(11) + 10];

    public static void main(String[] args) {
        Selection selection = new Selection();
        selection.dataInit();
        System.out.print("選擇排序法\n原始資料: ");
        selection.showData();
        selection.select();
        System.out.print("排序後結果: ");
        selection.showData();
    }

    public void dataInit() {
        for (int i = 0; i < data.length; i++) {
            data[i] = (int) (Math.random() * 100);
        }
    }

    public void select() {
        int smallest, temp, index;
        for (int i = 0; i < data.length - 1; i++) {
            boolean flag = true;
            smallest = data[i];
            index = i;
            for (int j = i + 1; j < data.length; j++) {
                if (smallest > data[j]) {
                    smallest = data[j];
                    index = j;
                    flag = false;
                }
            }

            if (flag) break;

            temp = data[i];
            data[i] = smallest;
            data[index] = temp;
            System.out.print("第" + (i+1) + "次排序: ");
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