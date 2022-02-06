// What is Floor of a number? 
// ans: ( It's the reatest number that is <= target number)


public class floor {

        public static void main(String[] args) {
            int[] arr = {-12, -4, , 2, 3, 4, 66, 77, 88, 99};
            int target = 1;
            int ans = floor(arr, target);
            System.out.println(ans);

        }

        static int floor(int[] arr, int target) {
            int start = 0;
            int end = arr.length - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (arr[mid] == target) {
                    return mid;
                }

                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;

                } else {
                    return mid;
                }


            }
            return end;


        }
    }


ans: 2 [returns the index of the target element that is being asked in the question]
