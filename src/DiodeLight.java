public class DiodeLight implements Observer{
    private String name;
    public DiodeLight(String name,Observable obj){
        this.name = name;
        obj.registerObserver(this);
    }
    @Override
    public void update(Observable obj){
        if (((ElectronicDevice) obj).getState().equalsIgnoreCase("Off")){
            System.out.println("Jeg er slukket, Hilsen " + name);
        } else if (((ElectronicDevice) obj).getState().equalsIgnoreCase("On")){
            System.out.println("Jeg er tændt, Hilsen " + name);
        } else if (((ElectronicDevice) obj).getState().equalsIgnoreCase("Hibernate")){
            System.out.println("Jeg er i dvale, Hilsen " + name);
        }
    }
}