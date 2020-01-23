package Visualizer;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class WeatherVisualizerWindow {
	
	private JFrame myWindow;

	public WeatherVisualizerWindow() {
		//Will later accept inputs for whatever event generators and data systems we use in the project, but currently it has no inputs.
		myWindow = new JFrame();
		myWindow.setSize(new Dimension(1300, 600));
		myWindow.setTitle("Thermostat for Outside.");
	}
	
	public void display() {
		// TODO Auto-generated method stub
		JMenuBar myBar = new JMenuBar();
		JPanel myUpperFrame = new JPanel();
		JTabbedPane myLowerFrame = new JTabbedPane();
		initializeMenuBar(myBar);
		initializeUpperFrame(myUpperFrame);
		addGraphicsTabs(myLowerFrame);
		myWindow.setJMenuBar(myBar);
		myWindow.add(myUpperFrame, BorderLayout.NORTH);
		myWindow.add(myLowerFrame, BorderLayout.SOUTH);
		myWindow.setVisible(true);
	}

	private void addGraphicsTabs(JTabbedPane myLowerFrame) {
		for(int i = 0; i < 8; i++) {
			myLowerFrame.add("Graphic Frame #" + i, new JPanel());
			//Will use a generic "Weather Graphics Display panel," in later versions, which can be used for all graphical representations of the ddata.
			//This will allow us to efficiently mimmick the function buttons of the original dveice.
		}
		
	}

	private void initializeUpperFrame(JPanel myUpperFrame) {
		// TODO Auto-generated method stub
		myUpperFrame.add(new JLabel("General Information Goes Here"));
		// This panel will be configured to give the live feed of the current weather attributes.
	}

	private void initializeMenuBar(JMenuBar myBar) {
		// TODO Auto-generated method stub
		// Contains various configuration buttons (Start/stop, select display units, ETC ETC.)
		myBar.add(new JButton("HELP"));
	}

}
