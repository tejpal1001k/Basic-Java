//import java.util.Scanner;
//
//public class ForLoop {
//    public static void main(String[] args) {
//        int x;
//        Scanner sc=new Scanner(System.in);
//        n=sc.nextInt();
//        int m=sc.nextInt();
//        for(int i=0;i<x;i++){
//            if(i%2==0){
//
//            }
//            else{
//                System.out.println(i);
//            }
//        }
//    }
//}



import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
