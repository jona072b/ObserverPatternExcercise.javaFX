import java.util.ArrayList;

public class ElectronicDevice implements Observable {
    private String state;
    private ArrayList<Observer> observers;

    public ElectronicDevice(){
        observers = new ArrayList<>();
        state = null;
    }
    @Override
    public void registerObserver(Observer obj){
        if (obj == null) throw new NullPointerException("Objekt med værdi null");
        if (!observers.contains(obj))
            observers.add(obj);
    }
    @Override
    public void removeObserver(Observer obj){
        observers.remove(obj);
    }
    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(this);
        }
    }
    public String getState(){
        return state;
    }
    public void setState(String state){
        this.state = state;
        notifyObservers();
    }
}