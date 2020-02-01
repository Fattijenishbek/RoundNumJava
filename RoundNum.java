package week2;

import java.text.DecimalFormat;

public class RoundNum {
    public static void main(String[] args) {
        float number = 12.301223f;
        DecimalFormat df1 = new DecimalFormat("#.#");
        System.out.println(df1.format(number));

        DecimalFormat df2 = new DecimalFormat("#.##");
        System.out.println(df2.format(number));

        DecimalFormat df3 = new DecimalFormat("#.###");
        System.out.println(df3.format(number));

    }
}
