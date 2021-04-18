package dst.BST;

public class ArrayToBST {


    public static Node sortedArrayToBST(int[] nums) {

        if(nums == null || nums.length==0){
            return null;
        }
         return constructBSTRecursive(nums, 0, nums.length-1);
    }

    public static Node constructBSTRecursive(int[]nums, int left, int right){

        if(left>right){
            return null;
        }

        int mid = left+(right-left)/2;
        Node current = new Node(nums[mid]);
        current.left = constructBSTRecursive(nums,left,mid-1);

        current.right = constructBSTRecursive(nums, mid+1, right);

        return current;

    }



    public static void main(String[]args){
        int[] nums= {-10,-3,0,5,9};

        sortedArrayToBST(nums);

    }
}

