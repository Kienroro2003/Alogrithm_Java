import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BinaryStringEnumeration {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n =  Integer.parseInt(bufferedReader.readLine().trim());
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]+ " ");
            i = n;
            while (i > 0 && array[i] == 1){

            }
        }
    }
}
