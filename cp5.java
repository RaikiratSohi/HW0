public class Solution {
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        final ArrayList<ArrayList<Integer>> results = new ArrayList<>();
        final HashMap<Integer, Integer> symbols = new HashMap<>();
        
        //Initialize the table with symbols count
        for (Integer i: A) {
            symbols.put(i, symbols.getOrDefault(i, 0) + 1);
        }
        
        permuter(symbols, new ArrayList<>(), results);
        
        return results;
    }
    
    private void permuter(Map<Integer, Integer> symbols, ArrayList<Integer> result,  ArrayList<ArrayList<Integer>> results) {
        boolean hasConsumedAll = true;
        for (Map.Entry<Integer, Integer> entry: symbols.entrySet()) {
            if (entry.getValue() != 0) {
                hasConsumedAll = false;
                entry.setValue(entry.getValue() - 1);
                result.add(entry.getKey());
                permuter(symbols, result, results);
                //Restore for next permutation
                entry.setValue(entry.getValue() + 1);
                result.remove(result.size() - 1);
            }
        }

        if (hasConsumedAll) {
            results.add(new ArrayList<>(result));
        }
    }
}
