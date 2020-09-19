package Tasks1909;

import java.util.Arrays;

public class ArgsInverted {
    public static void main(String[] args) {
        for (int i = args.length; i > 0; i--)
            System.out.println(Arrays.toString(new int[]{i}));

    }
}
