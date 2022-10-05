import java.util.Scanner;
class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        int sqt = (int)Math.sqrt(n);
        int e = 0, o = 0;
        for(int i=1;i<=sqt;i++){
            if(n%i == 0){
                
                if(i%2 == 0)e++;
                else o++;
                if((n/i)%2 == 0)e++;
                else o++;
                if(i == n/i && i%2==0)e--;
                if(i == n/i && i%2!=0)o--;

            }
        }
        if(e == o) System.out.println("PASS");
        else if(e>o)System.out.println("BUY");
        else System.out.println("SELL");
        sc.close();
    }
}
