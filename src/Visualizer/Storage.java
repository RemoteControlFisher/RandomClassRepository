package Visualizer;

import java.util.List;
import java.util.Map;

/**Manages the storage and retrieval of the most recent weather data, 
 * as well as the specific month, day, and hourly data for various weather parameters, such as:
 * - Indoor and Outdoor temperature and humidity.
 * - Wind direction and speed.
 * - Rain
 * - Pressure**/
public interface Storage {
		
	public List<Double> getDataSet(String key, String timeScale);
	
	public Map<String, Double> getMostRecentData();
	
}
