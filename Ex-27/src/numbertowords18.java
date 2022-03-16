class numbertowords18
{
    private static final String none = "";
 
    private static final String[] X =
    {
        none, "One ", "Two ", "Three ", "Four ", "Five ", "Six ",
        "Seven ", "Eight ", "Nine ", "Ten ", "Eleven ","Twelve ",
        "Thirteen ", "Fourteen ", "Fifteen ", "Sixteen ",
        "Seventeen ", "Eighteen ", "Nineteen "
    };
 
    private static final String[] Y =
    {
        none, none, "Twenty ", "Thirty ", "Forty ", "Fifty ",
        "Sixty ", "Seventy ", "Eighty ", "Ninety "
    };
 
    private static String convertToDigit(long n, String suffix)
    {
        if (n == 0) {
            return none;
        }
 
        if (n > 19) {
            return Y[(int) (n / 10)] + X[(int) (n % 10)] + suffix;
        }
        else {
            return X[(int) n] + suffix;
        }
    }
 
    public static String convert(long n)
    {
        StringBuilder res = new StringBuilder();
 
        res.append(convertToDigit((n / 1000000000) % 100, "Billion, "));
 
        res.append(convertToDigit((n / 10000000) % 100, "Crore, "));
 
        res.append(convertToDigit(((n / 100000) % 100), "Lakh, "));
 
        res.append(convertToDigit(((n / 1000) % 100), "Thousand, "));
 
        res.append(convertToDigit(((n / 100) % 10), "Hundred "));
 
        if ((n > 100) && (n % 100 != 0)) {
            res.append("and ");
        }
 

        res.append(convertToDigit((n % 100), ""));
 
        return res.toString().trim()
                .replace(", and", " and")
                .replaceAll("^(.*),$", "$1");       
    }
 
    public static void main(String[] args)
    {
        System.out.println(convert(99));
        System.out.println(convert(1000));
        System.out.println(convert(146));
        System.out.println(convert(99775));
        System.out.println(convert(214748));
    }
}