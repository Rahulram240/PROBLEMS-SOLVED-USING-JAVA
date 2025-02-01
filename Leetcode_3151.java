public class Leetcode_3151 {
    public static void main(String[] args) {
        System.out.println();
        int n = 1+(int)(Math.random()*10);
        int a[] = new int[n];
        System.out.println("The length of array "+n);
        for(int i=0;i<n;i++){
            a[i]=1+(int)(Math.random()*10);
        }
        System.out.print("The elements of array : ");
        for(int i:a){
            System.err.print(i+" ");
        }
        boolean res = special_array(a);
        System.err.println();
        System.out.println(res ? "This is spl array" : "Not a spl");
        
    }
    public static boolean special_array(int a[]){
        for(int i=1;i<a.length;i++){
            if(a[i-1]%2 == a[i]%2){
                return false;
            }
        }
        return true;
    }
}
