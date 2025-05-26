import java.util.Arrays;

public class F2 {

    
    static String[] words = {
        "Aaron", "Caleb", "Alice", "Daniel", "Emma", "Alexander", "Benjamin", "Brianna", "Diana", "Elijah",
        "Joshua", "Katherine", "Gabriel", "Leah", "Grace", "Kevin", "Charlotte", "Hannah", "Isaac", "Liam",
        "Penelope", "Patrick", "Jacob", "Isabella", "Matthew", "Jasmine", "Lucas", "Maddison", "Owen", "Noah",
        "Olivia", "Samuel", "Steven", "Thomas", "Tristan", "Quentin", "Rachel", "Sarah", "Yasmine", "Sophia",
        "Zachary", "Mia", "Uriel", "Xander", "Vanessa", "Zoe", "Nathan", "Victor", "William"
    };

 
    public static void mergeSort(String[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    public static void merge(String[] array, int left, int mid, int right) {
        String[] leftArray = Arrays.copyOfRange(array, left, mid + 1);
        String[] rightArray = Arrays.copyOfRange(array, mid + 1, right + 1);

        int i = 0, j = 0, k = left;

        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i].compareTo(rightArray[j]) <= 0) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }

        while (i < leftArray.length) {
            array[k++] = leftArray[i++];
        }

        while (j < rightArray.length) {
            array[k++] = rightArray[j++];
        }
    }

    
    public static void quickSort(String[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    public static int partition(String[] array, int low, int high) {
        String pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j].compareTo(pivot) <= 0) {
                i++;
                String temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        String temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    
    public static void main(String[] args) {
        // Merge Sort
        String[] mergeSorted = Arrays.copyOf(words, words.length);
        mergeSort(mergeSorted, 0, mergeSorted.length - 1);
        System.out.println("Merge Sort Result:");
        System.out.println(Arrays.toString(mergeSorted));

        String[] quickSorted = Arrays.copyOf(words, words.length);
        quickSort(quickSorted, 0, quickSorted.length - 1);
        System.out.println("\nQuick Sort Result:");
        System.out.println(Arrays.toString(quickSorted));
    }
}

