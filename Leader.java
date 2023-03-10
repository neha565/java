import java.util.ArrayList;
import java.util.Scanner;

public class LeaderArray {
    static ArrayList<Integer> leaderArray(int[] arr){
        ArrayList<Integer> leader=new ArrayList<>();
        leader.add(arr[arr.length-1]);
        int max=arr[arr.length-1];
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>max){
                leader.add(arr[i]);
                max=arr[i];
            }
        }
        return leader;
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        ArrayList<Integer>leader=leaderArray(arr);
        System.out.println(leader);
        sc.close();
    }
}
