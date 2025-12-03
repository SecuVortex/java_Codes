import jav.util.*;
public class Pin{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();
        int n1 = n%10;
        int n2 = (n/10)%10;
        int n3 = n/100;
        int m1 = n%10;
        int m2 = (n/10)%10;
        int m3 = n/100;
        int p1 = n%10;
        int p2 = (n/10)%10;
        int p3 = n/100;
        int d= Math.min(n1,Math.min(m1,p1));
        int c= Math.min(n2,Math.min(m2,p2));
        int r= Math.min(n3,Math.min(m3,p3));
        System.out.println(r*100+c*10+d);

    }
}