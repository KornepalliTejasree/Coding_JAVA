class twosumII {
    public int[] twoSum(int[] numbers, int target) {
        int dp[]=new int[numbers.length];
        for(int i=0;i<numbers.length-1;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]+numbers[j]==target){
                    return new int[]{i+1,j+1};
                }
            }
        }
        return new int[]{-1,-1};
    }
}