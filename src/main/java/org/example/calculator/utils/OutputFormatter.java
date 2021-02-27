package org.example.calculator.utils;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class OutputFormatter {
    private static DecimalFormat df;

    public static String outputFormatterUs(Double number) {
        df = new DecimalFormat("#,##0.00");
        df.setDecimalFormatSymbols(new DecimalFormatSymbols(Locale.US));
        return df.format(number);
    }

    public static String outputFormatterRu(Double number) {
        df = new DecimalFormat("###,00");
        return df.format(number);
    }
}
