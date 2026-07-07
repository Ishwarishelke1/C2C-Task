# Best Time to Buy and Sell Stock (LeetCode 121)

## Problem Statement

You are given an array `prices` where `prices[i]` is the price of a stock on the `iᵗʰ` day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different future day to sell that stock.

Return the maximum profit you can achieve. If no profit is possible, return `0`.

---

## Example 1

**Input:**
```text
prices = [7,1,5,3,6,4]
```

**Output:**
```text
5
```

**Explanation:**

- Buy on day 2 (price = 1)
- Sell on day 5 (price = 6)
- Profit = 6 - 1 = 5

---



# Approach

The idea is to keep track of the **minimum buying price** seen so far and calculate the profit for each day's selling price.

1. Initialize `buyPrice` with a very large value (`Integer.MAX_VALUE`).
2. Initialize `maxProfit` as `0`.
3. Traverse the array.
4. If the current price is lower than the buying price, update the buying price.
5. Otherwise, calculate the profit by selling on the current day.
6. Update the maximum profit if the current profit is greater.
7. Return the maximum profit.

---

# Algorithm

1. Set:
   - `buyPrice = Integer.MAX_VALUE`
   - `maxProfit = 0`
2. Traverse the price array.
3. If `prices[i] < buyPrice`
   - Update `buyPrice`.
4. Otherwise
   - Calculate `profit = prices[i] - buyPrice`.
   - Update `maxProfit = max(maxProfit, profit)`.
5. Return `maxProfit`.

---

# Dry Run

**Input:**

```text
prices = [7,1,5,3,6,4]
```

| Day | Price | Buy Price | Profit | Max Profit |
|-----|------:|----------:|-------:|-----------:|
| 1 | 7 | 7 | 0 | 0 |
| 2 | 1 | 1 | 0 | 0 |
| 3 | 5 | 1 | 4 | 4 |
| 4 | 3 | 1 | 2 | 4 |
| 5 | 6 | 1 | 5 | 5 |
| 6 | 4 | 1 | 3 | 5 |

**Final Answer:** `5`

---

# Time Complexity

**O(n)**

- The array is traversed only once.

---

# Space Complexity

**O(1)**

- Only two variables (`buyPrice` and `maxProfit`) are used.

---

