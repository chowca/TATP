public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        BWprinter bwprinter = new BWprinter();
        printer.printing();
        printer.printing("red, green & blue");
        bwprinter.printing();
    }
}
