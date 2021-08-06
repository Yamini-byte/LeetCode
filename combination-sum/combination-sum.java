class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> al = new ArrayList<>();
		List<List<Integer>> Bigans = new ArrayList<>();
		targetSum(candidates, al, target, 0,Bigans);
		return Bigans;
    }
    public static void targetSum(int[] ques, List<Integer> ans, int target,int idx, List<List<Integer>> bigans) {
		if(target == 0) {
			bigans.add(new ArrayList<>(ans));
		}
		else {
			for(int i=idx;i<ques.length;i++) {
				if(ques[i] <= target) {
					ans.add(ques[i]);
					targetSum(ques,ans, target-ques[i],i,bigans);
					ans.remove(ans.size()-1);
				}
			}
		}
	}
}