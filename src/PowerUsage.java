public class PowerUsage implements Observer {
        private String name;
    public PowerUsage(String name, Observable obj){
        this.name = name;
        obj.registerObserver(this);
    }
    public void update(Observable obj){
        if (((ElectronicDevice) obj).getState().equalsIgnoreCase("Off")){
            System.out.println("Jeg bruger ingen Strøm, Hilsen " + name);
        } else if (((ElectronicDevice) obj).getState().equalsIgnoreCase("On")){
            System.out.println("Jeg bruger meget strøm, Hilsen " + name);
        } else if (((ElectronicDevice) obj).getState().equalsIgnoreCase("Hibernate")){
            System.out.println("Jeg er i strømsparetilstand, Hilsen " + name);
        }
    }
}