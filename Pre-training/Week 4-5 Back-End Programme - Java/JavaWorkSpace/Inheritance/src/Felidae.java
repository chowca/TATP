public class Felidae extends Animal{
    boolean meowing;

    Felidae(){
        meowing = false;
    }

    public void setMeowing(boolean meowing) {
        this.meowing = meowing;
    }

    public boolean isMeowing() {
        if (meowing == true)
            System.out.println("meow meow");
        return meowing;
    }
}