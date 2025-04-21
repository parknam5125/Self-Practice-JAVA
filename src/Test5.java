import java.util.Scanner;
public class Test5 {
    public static String reading(int n) {
        String digit[] = {"영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
        String unit[] = {"만", "천", "백", "십", "일"};
        String s = "";//String s = null;
        if (!((0 < n )&&( n < 100000))){// (0<n)&&(n<100000)
            return s;
        }
    
        int div = 10000, d = 0, u = 0;
        
        while (n > 0) {
            d = (int)(n / div);
            n %= div;
            if (d != 0){    //d>=0
                s += digit[d] + unit[u++];//unit[u]
            }
            div /= 10;//div*=10;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (1-99999): ");
        int n = sc.nextInt();
        String result = reading(n);
        System.out.println(result);
        sc.close();
    }
    
}

