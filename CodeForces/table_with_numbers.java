import java.util.*;
public class table_with_numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if (!in.hasNextInt()) return;
        int tc = in.nextInt();
        while (tc-- > 0) {
            int n = in.nextInt();
            int h = in.nextInt();
            int l = in.nextInt();
            
            int onlyH = 0; // fits row but not column
            int onlyL = 0; // fits column but not row
            int both = 0;  // fits both
            
            for (int i = 0; i < n; i++) {
                int a = in.nextInt();
                boolean fitsH = (a <= h);
                boolean fitsL = (a <= l);
                
                if (fitsH && fitsL) both++;
                else if (fitsH) onlyH++;
                else if (fitsL) onlyL++;
            }
            
            int pairs = 0;
            
            // 1. Pair "Only Row" with "Only Column"
            int specialized = Math.min(onlyH, onlyL);
            pairs += specialized;
            onlyH -= specialized;
            onlyL -= specialized;
            
            // 2. Pair remaining "Only Row" with "Both"
            int pairWithH = Math.min(onlyH, both);
            pairs += pairWithH;
            both -= pairWithH;
            
            // 3. Pair remaining "Only Column" with "Both"
            int pairWithL = Math.min(onlyL, both);
            pairs += pairWithL;
            both -= pairWithL;
            
            // 4. Finally, pair the remaining "Both" numbers with each other
            pairs += both / 2;
            
            System.out.println(pairs);
        }
    }
}
