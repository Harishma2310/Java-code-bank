## String Problems

### 1. Remove Duplicate Characters
**Example:**  
`malayalam => maly`

**Approach:**  
- Use a `Set` to store unique characters  
- Maintain insertion order (LinkedHashSet)  
- Build result string from set  

---

### 2. String Compression
**Example:**  
`aaabb => a3b2`

**Approach:**  
- Iterate through string  
- Count consecutive characters  
- Append character + count  
- (Can also use HashMap, but better with simple loop)

---

### 3. Check Subsequence
**Example:**  
`"abc"` in `"ahbgdc"` → `true`

**Approach:**  
- Use two pointers  
- One for main string, one for subsequence  
- Move subsequence pointer only when characters match  
