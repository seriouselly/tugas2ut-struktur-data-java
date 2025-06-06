import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int nilai1 = 85, nilai2 = 90, nilai3 = 62, nilai4 = 78, nilai5 = 99, nilai6 = 55;

        int[] data = { nilai1, nilai2, nilai3, nilai4, nilai5, nilai6 };

        System.out.println("Data sebelum diurutkan: " + Arrays.toString(data));

        mergeSort(data, 0, data.length - 1);

        System.out.println("Data setelah diurutkan (dari terbesar hingga terkecil): " + Arrays.toString(data));
    }

    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);

            merge(array, left, middle, right);
        }
    }

    public static void merge(int[] array, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) L[i] = array[left + i];
        for (int j = 0; j < n2; j++) R[j] = array[middle + 1 + j];

        int i = 0, j = 0, k = left;

        while(i < n1 && j < n2) {
            if (L[i] > R[j]) {
                array[k++] = L[i++];
            } else {
            
                array[k++] = R[j++];
            }
        }
        while(i<n1)array[k++]=L[i++];
        while(j<n2)array[k++]=R[j++];
    }
}