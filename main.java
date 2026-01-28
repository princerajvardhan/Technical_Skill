//given an n array element find count no of element having at least 1 elemt greater than itself
//eg : arr = { -3,2,5,4,7,6,7} output : 5 (all except 7)
//logic : find max element and count all element not equal to max

package skill;  
class tech{
    public static void main(String[] args) {
        int arr [] = { -3,2,5,4,7,6,7};
        int count = 0;
        int max = 0;
        for(int i = 1;i<arr.length;i++){
            if(arr[i]>max)
                max = arr[i];
        }
        for(int i = 0;i< arr.length;i++){
           if(arr[i]!=max)
           count++;
           
        }
        System.out.println(count);
    }
}
