import edu.princeton.cs.algs4.*;


public class SelectionSort {
    public static void sort(int[] a) {
        int n = a.length;
        int index = 0;
        for (int i = 0;i<n;i++) {
            int minn = a[i];
            for(int j = i;j<n;j++) {
                if(a[j] < minn) {
                    minn = a[j];
                    index = j;
                }
            }
            if(a[i] > minn) {
                int tmp = a[i];
                a[i] = a[index];
                a[index] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        In in = new In("C:\\Users\\ADMIN\\Documents\\CTDLGT\\algs4-data\\4Kints.txt"); // tạo luồng đọc từ file
        int[] a = in.readAllInts();  // đọc toàn bộ file vào mảng a
        int n = a.length;
        long start = System.currentTimeMillis();
        // xử lý dữ liệu trong mảng a
        sort(a);
        long end = System.currentTimeMillis();  // thời gian chạy bằng end - start
        StdArrayIO.print(a); // in mảng ra màn hình
    }

}