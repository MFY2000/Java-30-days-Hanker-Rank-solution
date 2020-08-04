
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String, Integer> map = new HashMap();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone   = in.nextInt();
            map.put(name, phone);
        }
        while(in.hasNext()){
            String str = in.next();
            if (map.containsKey(str)) {
                System.out.println(str + "=" + map.get(str));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}