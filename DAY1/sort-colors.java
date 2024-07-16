class Solution {
    public void sortColors(int[] nums) {
        int [] m=new int[3];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                m[0]++;
            else if(nums[i]==1)
                m[1]++;
            else
                m[2]++;        
        }
        for(int i=0;i<m[0];i++){
            nums[i]=0;
        }
        for(int i=m[0];i<m[0]+m[1];i++){
            nums[i]=1;
        }
        for(int i=m[1]+m[0];i<nums.length;i++){
            nums[i]=2;
        }
    }
}
