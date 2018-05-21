public class Solution {
    public ArrayList<ArrayList<Integer>> prettyPrint(int A) {

        int size = (2*A)-1;
        int start = 0;
        int i = 0;
        int j = 0;
        
        //Initalize resultant ArrayList 
        ArrayList<ArrayList<Integer>> resultList = new ArrayList<ArrayList<Integer>>();

        for(i = 0; i < size; i++) {
            resultList.add(new ArrayList<Integer>());
            for(j = 0; j < size; j++) {
                resultList.get(i).add(new Integer(0));
            }
        }
        
        while(A > 0) {
            for(i = start; i < size; i++) {
                for(j = start; j < size; j++) {
                    resultList.get(i).set(j, A);
                }
            }
            
            A--;
            size--;
            start++;
        }
        
        return resultList;
    }
}
