public class BinarySearch {
    static int[] list = {2, 3, 8, 9, 10, 12, 15, 17, 32, 34, 68, 70, 72, 75, 83, 86, 89, 90};

    public static void main(String[] args) {
        System.out.println(binarySearch(list, 32));
        System.out.println(binarySearch(list, 17));
        System.out.println(binarySearch(list, 8));
        System.out.println(binarySearch(list, 9));
        System.out.println(binarySearch(list, 2));
        System.out.println(binarySearch(list, 70));
        System.out.println(binarySearch(list, 83));
        System.out.println(binarySearch(list, 10));

    }

    static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid]) {
                high = mid - 1;
            } else if (key == list[mid]) {
                return mid;
            }else
                low = mid + 1;
        }
        return -1;
    }
}