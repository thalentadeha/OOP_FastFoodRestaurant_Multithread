public class Robots implements Runnable {

    public void HotdogsRobot() {
        System.out.println("Robot is preparing your Hotdogs");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.getStackTrace();
        }
        System.out.println("Your Hotdogs is ready!");
    }

    public void HamburgersRobot() {
        System.out.println("Robot is preparing your Hamburgers");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.getStackTrace();
        }
        System.out.println("Your Hamburgers is ready!");
    }

    public void FrenchfriesRobot() {
        System.out.println("Robot is preparing your Frenchfries");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.getStackTrace();
        }
        System.out.println("Your Frenchfries is ready!");
    }

    public void FriedchickenRobot() {
        System.out.println("Robot is preparing your Friedchicken");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.getStackTrace();
        }
        System.out.println("Your Friedchicken is ready!");
    }

    public void DrinksRobot() {
        System.out.println("Robot is preparing your Drinks");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.getStackTrace();
        }
        System.out.println("Your Drinks is ready!");
    }

    @Override
    public void run() {

    }
}
