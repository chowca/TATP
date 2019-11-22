public class Tiger extends Felidae{
    public static void main (String[] args){
        Tiger tiger_1 = new Tiger();
        tiger_1.setMeowing(true);
        System.out.println("Age: " + tiger_1.getAge());
        System.out.println("Weight: " + tiger_1.getWeight());
        System.out.println("Running: " + tiger_1.isRunning());
        System.out.println("Eating: " + tiger_1.isEating());
        System.out.println("is tiger meowing? " + tiger_1.isMeowing());
    }
}
