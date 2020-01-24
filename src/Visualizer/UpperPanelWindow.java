package Visualizer;

import java.awt.GridLayout;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class UpperPanelWindow extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 210812046764856983L;

	/**
	 * The specific types of weather information our interface is ready to display.
	 */
	private String[] myDataTypes = {"Wind Speed", "Wind Direction", "Rain", "Pressure",
									"Indoor Tempature", "Indoor Humiditiy", "Outdoor Tempature", 
									"Outdoor Humidity"};
	
	/**
	 * The units for displaying the various types of weather information.
	 */
	private String[] myMeasurementUnits = {" mph", " *", " .in", " BAR", "*f", "%", "*f", "%"};
	
	/**
	 * A string driven map of the types of weather data.
	 */
	private Map<String, Double> myData;
	/**
	 * A map which associates the JLabels for displaying each element of weather information.*/
	private Map<String, JLabel> myDisplayElements;
	
	/**
	 * Generates a window that is ued to display current weather information.
	 * @param theData the Weather Data, in accordance with our data types.
	 */
	public UpperPanelWindow(Map<String, Double> theData) {
		super();
		myData = theData;
		setupDisplayBits();
		setLayout(new GridLayout(2,4));
		
	}
	
	/**
	 * Testing Version of the constructor, initializes the upper display with more data on
	 */
	public UpperPanelWindow() {
		super();
		setLayout(new GridLayout(2,4));
		myData = new HashMap<>();
		myData.put(myDataTypes[0], 15.2);
		myData.put(myDataTypes[1], 23.2);
		myData.put(myDataTypes[2], 0.3);
		myData.put(myDataTypes[3], 1.05);
		myData.put(myDataTypes[4], 72.3);
		myData.put(myDataTypes[5], 30.7);
		myData.put(myDataTypes[6], 52.2);
		myData.put(myDataTypes[7], 86.3);
		setupDisplayBits();
	}

	/**
	 * Generates and stores the JLabels in a organized and easily accessed way.
	 */
	private void setupDisplayBits() {
		//Setup Wind Display
		myDisplayElements = new HashMap<>();
		for (int i = 0; i< myDataTypes.length; i++) {
			JLabel aLabel = new JLabel(getTypeString(i));
			myDisplayElements.put(myDataTypes[1], aLabel);
			add(aLabel);
		}
	}
	
	/**
	 * Automatically generates an appropriate string for the specific measurement and its units.
	 * @param index The data measurements index.
	 * @return A string representing the current data in a human readable form.
	 */
	private String getTypeString(int index) {
		return myDataTypes[index] + " " + myData.get(myDataTypes[index]) + " " + myMeasurementUnits[index];
	}

	/**Updates the data and display labels.*/
	public void updateData(Map<String, Double> theNewData) {
		
	}
	
}
