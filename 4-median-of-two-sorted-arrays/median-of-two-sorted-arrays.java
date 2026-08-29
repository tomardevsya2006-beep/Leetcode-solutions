class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      int[] ans=merge(nums1,nums2);
      int n=ans.length;
      int mid=n/2;
      if (n % 2 == 0) {
            return (ans[mid - 1] + ans[mid]) / 2.0;
        } else {
            return ans[mid];
        }
       
    }
    //merge the array
    private int[] merge(int[] num1, int[] num2) {
        int[] ans = new int[num1.length + num2.length];
        int i = 0, j = 0, k = 0;

        while (i < num1.length && j < num2.length) {
            if (num1[i] <= num2[j]) {
                ans[k++] = num1[i++];
            } else {
                ans[k++] = num2[j++];
            }
        }
        while (i < num1.length) {
            ans[k++] = num1[i++];
        }
        while (j < num2.length) {
            ans[k++] = num2[j++];
        }

        return ans;
    }
      }