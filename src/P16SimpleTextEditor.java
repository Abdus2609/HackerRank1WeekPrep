import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P16SimpleTextEditor {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String S = "";
        String line;
        Stack<String> states = new Stack<>();

        int Q = Integer.parseInt(br.readLine());

        for (int i = 0; i < Q; i++) {
            System.out.println(S);
            line = br.readLine();
            String[] inputs = line.split(" ");
            
            switch (inputs[0].charAt(0)) {
                case '1' -> {
                    states.push(S);
                    S = S + inputs[1];
                }
                case '2' -> {
                    int k = Integer.parseInt(inputs[1]);
                    states.push(S);
                    S = S.substring(0, S.length() - k);
                }
                case '3' -> {
                    int k = Integer.parseInt(inputs[1]);
                    System.out.println(S.charAt(k - 1));
                }
                case '4' -> {
                    S = states.pop();
                }
            }
        }

        br.close();
    }
}
