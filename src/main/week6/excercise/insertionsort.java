import edu.princeton.cs.algs4.*;

public class insertionsort {
    public static void Sort(int n,int[] arr) {
        // Write your code here
        for(int i = 1; i < n; i++){
            int num = arr[i];
            int j;
            for(j = i - 1; j >= 0 && arr[j] > num; j--){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }

            int temp = arr[j+1];
            num = arr[j+1];
            arr[j+1] = temp;
        }
    }

    public static void main(String[] args) {
        In in = new In("C:\\Users\\ADMIN\\Documents\\CTDLGT\\algs4-data\\4Kints.txt"); // tạo luồng đọc từ file
        int[] a = in.readAllInts();  // đọc toàn bộ file vào mảng a
        int n = a.length;
        long start = System.currentTimeMillis();
        // xử lý dữ liệu trong mảng a
        Sort(n,a);
        long end = System.currentTimeMillis();  // thời gian chạy bằng end - start
        StdArrayIO.print(a); // in mảng ra màn hình
    }

}