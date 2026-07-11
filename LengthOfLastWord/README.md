## Approach

We traverse the string from the end because the last word is located at the end.

1. Skip all trailing spaces.
2. Count characters until a space or the beginning of the string is reached.
3. Return the count.

### Time Complexity
O(n)

### Space Complexity
O(1)