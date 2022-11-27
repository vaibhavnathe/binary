public class BinarySearch{
    public static void main(String[] args){
        int [] arr = {10,20,30,40,50,60,70,80,90};
        int target = 60;
        int ans = BinarySearch(arr, target);
        System.out.println(ans);
        
    }
    static int BinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length;
        
       
        
        while(start<= end){
            int mid = start +(end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid+1;
                
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
// **************************BINARY SEARCH***************************
// public class Main{
//     public static void main(String[] args){
//         int [] arr = {10,20,30,40,50,60,70};
//         int target = 50;
//         int ans  = BinarySearch(arr, target);
//         System.out.println(ans);
//     }
//      static int BinarySearch(int [] arr,int target){
//         int start = 0;
//         int end = arr.length-1;
        
//         while(start<=end){
//             int mid = start + (end - start)/2;
            
//             if(target<arr[mid]){
//                 end = mid-1;
                
//             }
//             else if(target>arr[mid]){
//                 start = mid+1;
//             }
//             else{
//                 return mid;
//             }
            
            
//         }
//         return -1;
        
//     }
// }
// class Parent{
//     int a=10;
//     void display(){
//     System.out.println("PARENT");
//     }
// }
// class Child extends Parent{
//     int b=20;
//     void show(){
//     System.out.println("Child");
//     }
// }

// public class Main
// {
// 	public static void main(String[] args) {
// 	 Parent p = new Parent();
//         p.display();
//     Child c = new Child();
//         c.show();
     
// 	}
// }


// ************************LINEAR SEARCH*************************************


// public class Main{
//     public static void main(String[] args){
//         int []arr = {10,50,60,30,70,20};
//         int key=30;
//         int ans = linear(arr , key);
//         System.out.println(key +"found at index"+ans);
        
//     }
//     static int linear(int []arr, int key){
//         for(int i=0; i<arr.length ; i++){
//             if(arr[i]== key){
//                 return i;
//             }
//         }
//         return -1;
//     }
// }







