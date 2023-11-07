import java.util.Arrays;
// The Sortable interface
interface Sortable {
    void sort(int[] array);
}

// The QuickSort class
class QuickSort implements Sortable {
    public void sort(int[] array) {
        int left = 0;
        int right = array.length - 1;

        quickSort(array, left, right);
    }

    private void quickSort(int[] array, int left, int right) {
        int pivotIndex = partition(array, left, right);

        if (left < pivotIndex - 1) {
            quickSort(array, left, pivotIndex - 1);
        }

        if (pivotIndex < right) {
            quickSort(array, pivotIndex, right);
        }
    }

    private int partition(int[] array, int left, int right) {
        int pivot = array[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (array[j] > pivot) {
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i + 1, right);
        return i + 1;
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

// The MergeSort class
class MergeSort implements Sortable {
    public void sort(int[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    private void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);

            merge(array, left, mid, right);
        }
    }

    private void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        System.arraycopy(array, left, leftArray, 0, n1);
        System.arraycopy(array, mid + 1, rightArray, 0, n2);

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] > rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }

        while (i < n1) {
            array[k++] = leftArray[i++];
        }

        while (j < n2) {
            array[k++] = rightArray[j++];
        }
    }
}

// The Main class to test the code
class Ma {
    public static void main(String[] args) {
        int[] array = {5, 1, 9, 3, 7, 6};

        Sortable quickSort = new QuickSort();
        quickSort.sort(array);
        System.out.println("QuickSort: " + Arrays.toString(array));

        int[] array2 = {5, 1, 9, 3, 7, 6};

        Sortable mergeSort = new MergeSort();
        mergeSort.sort(array2);
        System.out.println("MergeSort: " + Arrays.toString(array2));
    }
}