public interface Observable {
    //Jeg laver et interface
    public void registerObserver(Observer obj);
    public void removeObserver(Observer obj);

    public void notifyObservers();
}
