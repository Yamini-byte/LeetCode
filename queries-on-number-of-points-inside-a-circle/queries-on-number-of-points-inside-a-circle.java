class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int n = queries.length;
        int[] result = new int[n];
        for(int i=0;i<n;i++){
            int[] query = queries[i];
            int count = 0;
            for(int[] point : points){
                int x = point[0] - query[0];
                int y = point[1] - query[1];
                
                if(x*x + y*y <= query[2]*query[2]){
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }
}