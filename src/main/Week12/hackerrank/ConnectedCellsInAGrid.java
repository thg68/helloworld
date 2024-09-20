public static int connectedCell(List<List<Integer>> matrix) {
        // Write your code here
        int max = 0;
        for (int i = 0;i < matrix.size(); i++) {
            for (int j = 0;j < matrix.get(i).size(); j++){
            max=Math.max(max,exploreRegion(matrix,i,j));
            }
        }
        return max;
}

public static int exploreRegion(List<List<Integer>> matrix, int i, int j) {
        if (i < 0 || j < 0 || i >= matrix.size() || j >= matrix.get(i).size()) {
            return 0;
        }
        if (matrix.get(i).get(j) == 1) {
            int area = 1;
            matrix.get(i).set(j,0);
            area += exploreRegion(matrix, i - 1, j - 1);
            area += exploreRegion(matrix, i - 1, j);
            area += exploreRegion(matrix, i - 1, j + 1);
            area += exploreRegion(matrix, i, j - 1);
            area += exploreRegion(matrix, i, j + 1);
            area += exploreRegion(matrix, i + 1, j - 1);
            area += exploreRegion(matrix, i + 1, j);
            area += exploreRegion(matrix, i + 1, j + 1);
            return area;
        }
        return 0;
}