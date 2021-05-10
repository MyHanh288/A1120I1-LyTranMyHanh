package _b12_searching_algorithms.thuc_hanh.binary_search;

public class BinarySearch {
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

    static int binarySearch (int[] list, int value){
        int header = 0;
        int footer = list.length - 1;
        int mid = 0;
        while (header<=footer){
            mid = (header+footer)/2;
            if (list[mid]==value){
                return mid;
            }else if(list[mid]>value){
                footer = mid - 1;
            }else {
                header = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        System.out.println(binarySearch(list, 2));
        System.out.println(binarySearch(list, 11));
        System.out.println(binarySearch(list, 79));
        System.out.println(binarySearch(list, 1));
        System.out.println(binarySearch(list, 5));
        System.out.println(binarySearch(list, 80));
    }
}
