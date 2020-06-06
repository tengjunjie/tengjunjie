import com.sun.deploy.uitoolkit.ui.ConsoleTraceListener;

import java.io.File;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class digui {
    public static void main(String[] args) {
        int[] a = {3, 2, 1, 5};
        int temp;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j + 1] > a[j]) {
                    temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int item:a
             ) {
            System.out.println(item);
        }

    }
}

