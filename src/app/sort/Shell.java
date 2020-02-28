package app.sort;

import java.io.*;

/**
 * Shell
 */
public class Shell {

    int data[] = new int[8];
    int size = 8;

    public static void main(String[] args) {
        Shell shell = new Shell();
        shell.inputData();
        System.out.print("謝耳排序法\n原始資料: ");
        shell.showData();
        shell.shell();
        System.out.print("排序後結果: ");
        shell.showData();
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

    public void shell() {
        int temp;
        int count = 1;
        int jump = size / 2;

        while (jump > 0) {
            for (int i = jump; i < size; i++) {
                temp = data[i];
                int j = i - jump;
                while (j >= 0 && temp < data[j]) {
                    data[j + jump] = data[j];
                    j -= jump;
                }
                data[j + jump] = temp;
            }
            System.out.print("第" + (count) + "次排序: ");
            showData();
            jump /= 2;
            count++;
        }
    }

    public void showData() {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("\n");
    }
}