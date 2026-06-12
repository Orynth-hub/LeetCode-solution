class Solution {
    public boolean isPalindrome(int x) {

        int oldx = x;

        if(x < 0){
            return false;
        }

        int reverse = 0;
        while(x != 0){
            reverse = reverse * 10 + (x % 10);
            x = x /10;
        }

        if(reverse == oldx){
            return true;
        }
        else{
            return false;
        }
    }
}