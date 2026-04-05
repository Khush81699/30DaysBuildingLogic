public class Day28_Sorting {

    public static void main(String[] args) {

        int[] arr1 = {64, 25, 12, 22, 11};

        for (int i = 0; i < arr1.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[j] < arr1[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr1[minIndex];
            arr1[minIndex] = arr1[i];
            arr1[i] = temp;
        }

        System.out.println("Selection Sort Result:");

        for (int num : arr1) {
            System.out.print(num + " ");
        }

        System.out.println("\n----------------");

        int[] arr2 = {12, 11, 13, 5, 6};

        for (int i = 1; i < arr2.length; i++) {
            int key = arr2[i];
            int j = i - 1;

            while (j >= 0 && arr2[j] > key) {
                arr2[j + 1] = arr2[j];
                j--;
            }

            arr2[j + 1] = key;
        }

        System.out.println("Insertion Sort Result:");

        for (int num : arr2) {
            System.out.print(num + " ");
        }
    }
}