import java.io.*;
import java.util.*;

public class Main
{
	void leftRotate(int arr[], int d, int n)
    {
        int temp[] = new int[d];
        for (int i = 0; i < d; i++)
            temp[i] = arr[i];
 
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }
 
        for (int i = 0; i < d; i++) {
            arr[i + n - d] = temp[i];
        }
    }
 
    public static void main(String[] args)
    {
        Main main = new Main();
        int[] arr = { 1, 2, 3, 4, 5 };
        main.leftRotate(arr, 2, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}

