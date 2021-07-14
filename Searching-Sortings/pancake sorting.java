//https://leetcode.com/problems/pancake-sorting/submissions/
class Solution {
    public List<Integer> pancakeSort(int[] arr) {
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=arr.length;i>0;i--){
            int index=findindex(arr,i);
            flip(arr,index);
            flip(arr,i-1);
            al.add(index+1);
            al.add(i);
            System.out.println(index);
        }
        return al;
    }
    
    public int findindex(int arr[],int target){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public void flip(int arr[],int j){
        int i=0;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        
    }
  public static void main(String args[]){
    int arr[]={3,2,1,4};
    ArrayList<Integer>al=pancakeSort(arr);
    System.out.println(al);
  }
}
