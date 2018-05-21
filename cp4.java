public class Solution {
    public ArrayList<Integer> nextGreater(ArrayList<Integer> A) {
        ArrayList<Integer> result = new ArrayList();
	    for(int i=0; i<A.size(); ++i){
	        int ans = -1;
	        for(int j=i+1; j<A.size(); ++j){
	            if (A.get(j) > A.get(i)){ 
	                ans = A.get(j);
	                break;
	            }
	        }
	        result.add(ans);
	    }
	    return result;
    }
}
