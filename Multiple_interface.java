class Interfaceclass {
    interface car {
        public void start();
        public void stop();
    }

    interface bike {
        public void start();
        public void stop();
    }
}
class Implementation implements Interfaceclass.car , Interfaceclass.bike {
    @Override
    public void start() {
        System.out.println("Car is starting.");
    }
    @Override
    public void stop() {
        System.out.println("Car is stopping.");
    }
}
class bikeImplementation implements Interfaceclass.bike {
    @Override
    public void start() {
        System.out.println("Bike is starting.");
    }
    @Override
    public void stop() {
        System.out.println("Bike is stopping.");
    }
}

public class Multiple_interface{
    public static void main(String[] args) {
        Implementation cr = new Implementation ();
        cr.start();
        cr.stop();

    }
}