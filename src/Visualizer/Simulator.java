package Visualizer;

/**Generates the general weather data to simulate the device that gives us data.*/
public interface Simulator {
	
	/**
	 * Allows another process to subscribe to the simulator, so that it can be alerted when the simulator has outputted new data.
	 */
	void getSimulatorEventMessager();
	
	/** 
	 * Generate the data a casual user of this simulator probably won't have enough time to see.*/
	void generateLongTermData();
	
	/**
	 * Generate a map of each weather data element for a 2.5 second slice of time.
	 */
	void generateShortTermData(String dataType);
}
