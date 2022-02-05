// letters arr = ["c","f","g"]           -->   givenn array of letters
// target = "c"

// CODE:

class Solution {
    public int ceiling(char[] letters, int letters) {
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