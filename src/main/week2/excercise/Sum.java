import edu.princeton.cs.algs4.*;

public class Sum {
    public static void main(String[] args){
         In in = new In("C:\\Users\\ADMIN\\Documents\\CTDLGT\\algs4-data\\1Kints.txt");
         int[] a = in.readAllInts();
         StdArrayIO.print(a);
         int N = a.length;

         for (int i = 0;i<N;i++){
             for(int j = i+1;j<N;j++){
                 if(a[i]==(-1*a[j])){
                     StdOut.println(a[i] + " " + a[j]);
                 }
             }
         }
    }
}
