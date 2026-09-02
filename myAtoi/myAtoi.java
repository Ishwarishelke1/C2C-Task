public class myAtoi {
    public int myatoi(String s) {
        int index = 0, sign = 1, total = 0;
        // Check if empty string
        if(s.length() == 0) return 0;

        // Remove Spaces
        while(index < s.length() && s.charAt(index) == ' ')
        index++;

        // Handle signs
        if(index < s.length() && (s.charAt(index) == '+' || s.charAt(index) == '-')){
            sign = s.charAt(index) == '+' ? 1 : -1;
            index++;
        }

        // Convert number and avoid overflow
        while(index < s.length()){
        int digit = s.charAt(index) - '0';
        if(digit < 0 || digit > 9) break;

        // Check for overflow
        if(Integer.MAX_VALUE/10 < total || Integer.MAX_VALUE/10 == total && Integer.MAX_VALUE %10 < digit)
            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

            total = 10 * total + digit;
            index++;
        }
        return total * sign;
    }
}
