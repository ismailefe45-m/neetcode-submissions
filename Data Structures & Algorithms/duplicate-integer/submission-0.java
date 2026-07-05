
class Solution {
    public boolean hasDuplicate(int[] nums) {
    HashSet mamo=new HashSet();
    boolean result=false;
    for(int mams:nums){
        if(mamo.contains(mams)){
            result=true;
        }
        else mamo.add(mams);
    }         
    return result;
    }
}