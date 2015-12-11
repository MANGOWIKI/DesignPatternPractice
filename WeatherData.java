

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
	private List<Observer> observers;
	private float temp;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList();
	}
	
	
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	public void notifyObserver() {
		for (Observer obs : observers) {
			((Observer) obs).update(temp, pressure);
		}
	}
	
	public void measurementsChanged() {
		notifyObserver();
	}


	public void setMeasurements(int temp, int pressure) {
		this.temp = temp;
		this.pressure = pressure;
		measurementsChanged();
	}

	

}
