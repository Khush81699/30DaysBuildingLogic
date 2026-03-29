public class Day23_ArrayLogic {

    public static void main(String[] args) {

        int[] arr = {40, 10, 30, 20, 50};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Array:");

        for (int num : arr) {
            System.out.println(num);
        }

        System.out.println("----------------");

        int target = 30;
        boolean found = false;

        for (int num : arr) {
            if (num == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element found: " + target);
        } else {
            System.out.println("Element not found");
        }
    }
}