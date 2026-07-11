# Isomorphic Strings (LeetCode 205)

## Problem Statement

Given two strings `s` and `t`, determine if they are **isomorphic**.

Two strings are isomorphic if the characters in `s` can be replaced to get `t`.

Rules:
- Every character in `s` must map to exactly one character in `t`.
- No two characters in `s` can map to the same character in `t`.
- A character can map to itself.

---

## Example 1

**Input:**
```text
s = "egg"
t = "add"
```

**Output:**
```text
true
```

**Explanation:**
```text
e → a
g → d
```

---

## Example 2

**Input:**
```text
s = "foo"
t = "bar"
```

**Output:**
```text
false
```

**Explanation:**
```text
f → b
o → a
o → r
```

The character `o` cannot map to both `a` and `r`.

---
# Approach (Using HashMap)

We use a `HashMap<Character, Character>` to store the mapping from characters of `s` to characters of `t`.

### Steps

1. Traverse both strings simultaneously.
2. Let:
   - `c1 = s.charAt(i)`
   - `c2 = t.charAt(i)`
3. If `c1` already exists in the HashMap:
   - Check whether it maps to `c2`.
   - If not, return `false`.
4. If `c1` is not present:
   - Check whether `c2` is already mapped by another character using `containsValue()`.
   - If yes, return `false`.
   - Otherwise, add the mapping `(c1, c2)` to the HashMap.
5. If the entire traversal completes successfully, return `true`.

---

# Algorithm

1. Create an empty HashMap.
2. Traverse both strings.
3. If the mapping already exists and is invalid, return `false`.
4. If the mapping does not exist and the target character is already used, return `false`.
5. Otherwise, store the mapping.
6. Return `true`.

---

# Dry Run

**Input:**
```text
s = "egg"
t = "add"
```

| Index | s[i] | t[i] | HashMap |
|------:|------|------|----------|
| 0 | e | a | {e=a} |
| 1 | g | d | {e=a, g=d} |
| 2 | g | d | Valid mapping |

**Output:**
```text
true
```

---

# Time Complexity

**O(n²)**

- `containsValue()` takes `O(n)` time.
- It is called inside the loop.

---

# Space Complexity

**O(n)**

- In the worst case, the HashMap stores all characters.

---

