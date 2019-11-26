import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<String> inputs = Arrays.asList("ITEM0001 x 1", "ITEM0013 x 2", "ITEM0022 x 1");
        App app = new App(new ItemRepositoryTestImpl(), new SalesPromotionRepositoryTestImpl());
        String receiptString = app.bestCharge(inputs);
        System.out.println(receiptString);

        System.out.println("\n------------NEXT-----------\n");

        List<String> inputs1 = Arrays.asList("ITEM0013 x 4", "ITEM0022 x 1");
        App app1 = new App(new ItemRepositoryTestImpl(), new SalesPromotionRepositoryTestImpl());
        String receiptString1 = app1.bestCharge(inputs1);
        System.out.println(receiptString1);

        System.out.println("\n------------NEXT-----------\n");

        List<String> inputs2 = Arrays.asList("ITEM0013 x 4");
        App app2 = new App(new ItemRepositoryTestImpl(), new SalesPromotionRepositoryTestImpl());
        String receiptString2 = app2.bestCharge(inputs2);
        System.out.println(receiptString2);

    }
}
