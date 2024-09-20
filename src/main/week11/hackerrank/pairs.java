public static int pairs(int k, List<Integer> arr) {
    // Write your code here
        int n = arr.size();
        HashMap<Integer, Integer> mapp = new HashMap<>();
        int count = 0;
        for (int i = 0; i<n;i++) {
            if (mapp.containsKey(arr.get(i))) {
                mapp.put(arr.get(i), arr.get(i+1));
            } else {
                mapp.put(arr.get(i), 1);
            }

            if (mapp.containsKey(arr.get(i) - k)) {
                count += 1;
            }
            if (mapp.containsKey(arr.get(i) + k)) {
                count += 1;
            }
        }
        return count;
    }