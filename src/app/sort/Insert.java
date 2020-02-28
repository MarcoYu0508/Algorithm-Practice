package app.sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Insert
 */
public class Insert {

    Random random = new Random();
    int data[] = new int[random.nextInt(11) + 10];

    public static void main(String[] args) {
        Insert insert = new Insert();
        insert.inputData();
        System.out.print("插入排序法\n原始資料: ");
        insert.showData();
        insert.insert();
        System.out.print("排序後結果: ");
        insert.showData();
    }

    public void inputData() {
        for (int i = 0; i < data.length; i++) {
            try {
                System.out.print("請輸入第" + (i + 1) + "的元素: ");
                InputStreamReader inputStreamReader = new InputStreamReader(System.in);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                data[i] = Integer.parseInt(bufferedReader.readLine());
            } catch (Exception e) {

            }
        }
    }

    public void insert() {
        int temp;
        for (int i = 1; i < data.length; i++) {
            temp = data[i];
            int j = i - 1;
            while (j >= 0 && temp < data[j]) {
                data[j+1] = data[j]; 
                j--;
            }
            data[j+1] = temp;
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