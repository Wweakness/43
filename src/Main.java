import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            StringBuilder a = new StringBuilder();
            char[] s=str.toCharArray();
            for(int i=1;i<s.length;i++){
                a.append(s[i]);
            }
          //  a.append(str);
           // char[] b = str.toCharArray();
            //a.append(b[0]);

            String r = a.toString();
           // System.out.println(r);
            if (r.equals(a.reverse().toString())) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        }

    }
