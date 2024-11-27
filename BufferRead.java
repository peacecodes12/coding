import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.io.IOException;
import java.util.Arrays;


public class BufferRead {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        // Input array size

        int N = Integer.parseInt(br.readLine());

        long[] arr = new long[N];



        // Reading array elements

        String[] inputArray = br.readLine().split(" ");

        for (int i = 0; i < N; i++) {

            arr[i] = Long.parseLong(inputArray[i]);
        }
        System.out.println(Arrays.toString(arr));
    }
}