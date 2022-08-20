
// https://leetcode.com/problems/palindrome-number/

bool isPalindrome(int x){
    int origin = x;
    long int rev = 0;
    int rem;
    while (x>0)
    {
        rem = x % 10;
        rev = rev * 10 + rem;
        x = x/10;
    }
     if (rev == origin)
         return 1;
    else
        return 0;
}