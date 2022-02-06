// letters arr = ["c","f","g"]           -->   given array of letters
// target = "c"                          -->   target element

// CODE:

class Solution {
    public char ceiling(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] == target)
                return mid;
            else if (letters[mid] < target)
                start = mid + 1;
            else
                end = end - 1;
        }
        return letters[start % letters.length];
    }
}
