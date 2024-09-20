import java.util.Stack;

public class St_nextGE {
    
    public static void main(String[] args) {
        // TC = O(N^2), SC =  O(1)
 
       int[] arr = {1, 5, 3, 2, 1, 6, 3, 4};
       int[] ans = new int[arr.length];

    //    for(int i = 0; i < arr.length; i++){
    //     ans[i] = -1;
    //     for(int j = i+1; j < arr.length; j++){
    //         if(arr[j] > arr[i]){
    //             ans[i] = arr[j];
    //             break;
    //     }
    //    }
    // }
    //  for(int i = 0; i < arr.length; i++){
    //     System.out.print(arr[i] + " ");
    //  }
    //  System.out.println();
    //  for(int i = 0; i < ans.length; i++){
    //     System.out.print(ans[i] + " ");
    //  }

    Stack<Integer>  st = new Stack<>();

    for(int i = arr.length-1; i >= 0; i--){
         while(!st.isEmpty() && arr[i] > st.peek()) {
            st.pop();
    }
    if(st.isEmpty()) ans[i] = -1;
    else  ans[i] = st.peek();
    st.push(arr[i]);

}
    for(int i : ans){

    System.out.print(i + " ");
    }
}
}

