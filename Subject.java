

public interface Subject {
	public void removeObserver(Observer o);
	public void notifyObserver();
	public void registerObserver(Observer o);
}
