public class RecrusionBinarySearchMethod {
    static int rscrusionBinarySearch(int[] arrays, int first, int last, int key) {
        if (first > last) {
            return -1;
        }
        int mid = (first +last)/2;
        if (key > arrays[mid] ) {
            return rscrusionBinarySearch(arrays,mid + 1, last, key);
        } else if(key == arrays[mid]) {
            return mid;
        } else {
            return rscrusionBinarySearch(arrays,first,mid -1, key);
        }
    }
}
