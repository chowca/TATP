public class Printer {
    private String paperUsed;
    Printer(){
        paperUsed = "A4";
    }
    public void setPaperUsed(String paperUsed){
        this.paperUsed = paperUsed;
    }
    public String getPaperUsed(){
        return paperUsed;
    }
    public void printing(){
        System.out.println("The most fundamental function is printing");
    }
    public void printing(String color){
        System.out.println("Overloading: Printing in " + color + " with " + paperUsed);
    }
}