public class func_interface_without_lambda {


    @FunctionalInterface
    interface Functional_interface
    {
        void vehicle(String veh_name);
    }

    public static void main(String[] args) {
        Functional_interface fi =new Functional_interface() {
            @Override
            public void vehicle(String veh_name) {
                System.out.print("Vehicle is : "+ veh_name);
            }
        }
        fi.vehicle("car");
    }

}
