public class LongestValidParenthesis {
    public static void main(String[] args) {
        int left=0,right=0,max=0;
        String s="())(())";
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='('){
                left++;
            }
            else{
                right++;
            }
            if(left==right){
                max=Math.max(max,left*2);
            }
           else if(right>left){
                left=0;
                right=0;
            }
        }
      //  System.out.println(max);
        left=0;
    right=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='('){
                left++;
            }
            else{
                right++;
            }
            if(left==right){
                max=Math.max(max,left*2);
            }
            else if(right<left){
                left=0;
                right=0;
            }
        }
        System.out.println(max);
    }
}
