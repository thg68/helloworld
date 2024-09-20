public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        // Write your code here
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : brr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (int num : arr) {
            if (countMap.containsKey(num)) {
                countMap.put(num, countMap.get(num) - 1);
                if (countMap.get(num) == 0) {
                    countMap.remove(num);
                }
            }
        }

        List<Integer> crr = new ArrayList<>(countMap.keySet());
        Collections.sort(crr);
        return crr;
}