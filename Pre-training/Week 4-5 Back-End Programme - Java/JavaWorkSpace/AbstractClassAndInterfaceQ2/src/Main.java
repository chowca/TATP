abstract class transportation{
    abstract int getDrivingCost();
    abstract int getBusCost();
    abstract int getTrainCost();
    abstract int getPlaneCost();
}
interface transportationCost {
    int drivingCost = 500;
    int busCost = 300;
    int trainCost = 400;
    int planeCost = 1000;
}

class xiaomingTrans extends transportation implements transportationCost{
    int budget = 500;
    int getBudget(){
        return budget;
    }
    @Override
    int getDrivingCost() {
        return drivingCost;
    }
    @Override
    int getBusCost() {
        return busCost;
    }
    @Override
    int getTrainCost() {
        return trainCost;
    }
    @Override
    int getPlaneCost() {
        return planeCost;
    }
}
public class Main {
    public static void main(String[] args){
        xiaomingTrans xiaoming = new xiaomingTrans();

        if(xiaoming.getDrivingCost() <= xiaoming.getBudget())
            System.out.println("Xiaoming can choose to drive");
        else
            System.out.println("Xiaoming is out of budget for driving car");
        if(xiaoming.getBusCost() <= xiaoming.getBudget())
            System.out.println("Xiaoming can choose to take bus");
        else
            System.out.println("Xiaoming is out of budget for taking bus");
        if(xiaoming.getTrainCost() <= xiaoming.getBudget())
            System.out.println("Xiaoming can choose to take train");
        else
            System.out.println("Xiaoming is out of budget for taking train");
        if(xiaoming.getPlaneCost() <= xiaoming.getBudget())
            System.out.println("Xiaoming can choose to take plane");
        else
            System.out.println("Xiaoming is out of budget for taking plane");
    }
}
