public class array_union_intersection {
    public static void intersection(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        int j = 0;
        int i = 0;
        while(i < n && j < m){
            if(arr1[i] < arr2[j] && i >= 0 && i < n){
                i++;
            }
            else if (arr1[i] > arr2[j] && j >= 0 && j < m){
                j++;
            }
            else{
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }

    }
    public static void union(int[] arr1 , int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        int i = 0;
        int j = 0;
        while(i < n && j < m){
            if(i > 0 && i < n && arr1[i] == arr1[i-1]){
                i++;
            }
            if(j > 0 && j < m && arr2[j] == arr2[j-1]){
                j++;
            }
            if(i >= n || j >= m){
                break;
            }
            if(arr1[i] < arr2[j]){
                System.out.print(arr1[i++] + " ");
            }
            else if(arr2[j] < arr1[i]){
                System.out.print(arr2[j++] + " ");
            }
            else{
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }
        while (i < n) {
            if (i == 0 || arr1[i] != arr1[i-1]) {
                System.out.print(arr1[i] + " ");
            }
            i++;
        }

        // Print remaining elements of arr2
        while (j < m) {
            if (j == 0 || arr2[j] != arr2[j-1]) {
                System.out.print(arr2[j] + " ");
            }
            j++;
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {3,4,5,6};
        union(arr1,arr2);
        System.out.println();
        intersection(arr1, arr2);
    }
}