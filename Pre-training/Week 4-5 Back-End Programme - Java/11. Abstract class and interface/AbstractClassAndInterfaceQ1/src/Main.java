interface Buy {
    int cockPrice = 5;
    int henPrice = 3;
    int chickenPrice = 1;
    int buyTotal = 100;
    int money = 100;
}
public class Main {
    public static void main(String[] args) {
        int cock;
        int hen;
        int chicken;
        int cockMax = Buy.money / Buy.cockPrice;
        int hexMax = Buy.money / Buy.henPrice;
        int chickenMax = Buy.money / Buy.chickenPrice;
        for(cock = 0; cock <= cockMax; cock++){
            for(hen = 0; hen <= hexMax; hen++){
                for(chicken = 0; chicken <= chickenMax; chicken++){
                    if((cock * Buy.cockPrice + hen * Buy.henPrice + chicken * Buy.chickenPrice == Buy.money) && (cock + hen + chicken == Buy.buyTotal))
                        System.out.println("# of cock: " + cock + ", # of hen: " + hen + ", # of chicken: " + chicken);
                }

            }
        }
    }
}
