import java.util.Scanner;
public class Parking_lot {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.err.print("String with X and S = ");
        /*All we've to do is find the max no of cars that can be parked in the parking lot */
        String PS=s.next();
        char cs[]=PS.toCharArray();
        int n=PS.length();
        System.err.print("The max no of cars that can be parked "+parkslo(cs,n));
    }
    public static int parkslo(char c[],int n){
        int m=0,cc=0;
        for(int i=0;i<n;i++){
            if(c[i]=='S'){
                cc++;
            }
            else{
                m=Math.max(cc, m);
                cc=0;
            }
        }
        m=Math.max(m, cc);
        return m;
    }
}
