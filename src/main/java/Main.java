import java.util.function.UnaryOperator;

public class Main {
    public static String PREFIX = "__prefix__";
    public static String SUFFIX = "__suffix__";
	
	// fix the operator code
    public static UnaryOperator<String> operator = str -> str.replaceAll("\\s","");

    public static void main(String[] args) {
        String res = operator.apply("  hello"); 
        System.out.println(res); // __prefix__hello__suffix__
    }
}
