## Approach (HashSet)

1. Use a HashSet to store previously seen numbers.
2. Compute the sum of squares of digits repeatedly.
3. If the number becomes 1, return true.
4. If the number repeats, a cycle exists, so return false.

### Time Complexity
O(log n)

### Space Complexity
O(log n)