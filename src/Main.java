import exchange.ExchangeOperator;

public class Main {

    public static void main(String[] args) {
        String str = "toDollars($5-$4.9)";
        str = new ExchangeOperator().exchangeOperation(str);
        System.out.println(str);
    }
}