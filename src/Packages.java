
class serveHotdogs extends Robots {
    @Override
    public void run() {
        HotdogsRobot();
    }
}

class serveHamburgers extends Robots {
    @Override
    public void run() {
        HamburgersRobot();
    }
}

class serveFrenchfries extends Robots {
    @Override
    public void run() {
        FrenchfriesRobot();
    }
}

class serveFriedchicken extends Robots {
    @Override
    public void run() {
        FriedchickenRobot();
    }
}

class serveDrinks extends Robots {
    @Override
    public void run() {
        DrinksRobot();
    }
}

public class Packages {
    Thread hotdogs = new Thread(new serveHotdogs());
    Thread hamburgers = new Thread(new serveHamburgers());
    Thread frenchfries = new Thread(new serveFrenchfries());
    Thread friedchicken = new Thread(new serveFriedchicken());
    Thread drinks = new Thread(new serveDrinks());

    public void packageA() {
        hotdogs.start();
        frenchfries.start();
        drinks.start();

        try {
            hotdogs.join();
            frenchfries.join();
            drinks.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void packageB() {
        hamburgers.start();
        frenchfries.start();
        drinks.start();

        try {
            hamburgers.join();
            frenchfries.join();
            drinks.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void packageC() {
        friedchicken.start();
        frenchfries.start();
        drinks.start();

        try {
            friedchicken.join();
            frenchfries.join();
            drinks.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
