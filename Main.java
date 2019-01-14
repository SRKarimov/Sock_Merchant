package com.rkskalliance;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Main {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        HashMap<Integer, Integer> colorMap = new HashMap<Integer, Integer>();

        for (Integer i = 0; i < ar.length; i++) {
            if (colorMap.containsKey(ar[i])) {
                colorMap.replace(ar[i], colorMap.get(ar[i]) + 1);
            }else {
                colorMap.put(ar[i], 1);
            }
        }

        Integer acc = 0;
        for (Map.Entry me : colorMap.entrySet()) {
            acc += (int)me.getValue() / 2;
            System.out.println("Key: "+me.getKey() + " & Value: " + me.getValue());
        }

        System.out.println("ACC: " + acc);
        return acc;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

//        bufferedWriter.close();

        scanner.close();
    }
}
