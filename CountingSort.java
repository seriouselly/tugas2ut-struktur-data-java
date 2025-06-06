
import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int nilai1 = 85, nilai2 = 91, nilai3 = 62, nilai4 = 78, nilai5 = 99, nilai6 = 55;

        int[] data = { nilai1, nilai2, nilai3, nilai4, nilai5, nilai6 };

        System.out.println("Data sebelum diurutkan: " + Arrays.toString(data));

        countingSort(data);

        System.out.println("Data setelah diurutkan (dari terbesar hingga terkecil): " + Arrays.toString(data));
    }

    public static void countingSort(int[] data) {
        int max = data[0];

        for (int i : data) {
            if (i > max)
                max = i;
        }
        
        int[] count = new int[max + 1];

        for (int i : data) {
            count[i]++;
        }

        int index = 0;

        for (int i = count.length - 1; i > 0; i--) {
            while (count[i] > 0) {
                data[index++] = i;
                count[i]--;
            }
        }
        
    }
}