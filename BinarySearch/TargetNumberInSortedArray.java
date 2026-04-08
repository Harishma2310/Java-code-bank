// Java code for the above approach:

class GFG {

    static int binarySearch(int arr[], int left, int right,
                            int target)
    {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return -1;
    }

    // Drivers code
    public static void main(String[] args)
    {
        int arr[] = { 10, 20, 30, 40, 50 };
        int n = arr.length;
        int target = 30;

        int index = binarySearch(arr, 0, n - 1, target);

        if (index != -1) {
            System.out.println("Target found at index "
                               + index);
        }
        else {
            System.out.println(
                "Target not found in the array.");
        }
    }
}

// This code is contributed by ragul21
