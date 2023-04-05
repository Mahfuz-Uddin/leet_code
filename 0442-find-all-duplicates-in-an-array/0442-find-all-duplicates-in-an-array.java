class Solution {
    public List<Integer> findDuplicates(int[] nums) {
    List<Integer> result = new ArrayList<Integer>();
    int i = 0;

    while(i < nums.length){
      int correctIndex = nums[i]-1;
      if(nums[i] != nums[correctIndex]){
        swap(nums, i, correctIndex);
      }else{
       i++;
       }
    }

    for(int index = 0; index < nums.length; index++){
      if(nums[index] != index+1) {
          result.add(nums[index]); 
      }
    }
    return result;
  }

  public static void swap(int arr[], int i, int j){
    int temp = arr[i];
    arr[i]= arr[j];
    arr[j]= temp;
  }
    }
