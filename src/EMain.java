import javax.swing.JFrame;

import simulation.util.Arguments;
import evolutionaryrobotics.JBotEvolver;
import gui.evolution.EvolutionGui;

public class EMain {
	public static String FOLDER = "to_run";
	public static String CONFIG_FILE = "faultDetection_wp_version_25prob_15324435211.conf";

	public static void main(String[] args) throws Exception {

		String configName = FOLDER + "/" + CONFIG_FILE;

		try {
			args = new String[] { configName };
			JBotEvolver jBotEvolver = new JBotEvolver(args);
			EvolutionGui evo = new EvolutionGui(jBotEvolver, new Arguments(""));
			JFrame frame = new JFrame();
			frame.add(evo);
			frame.setSize(1000, 600);
			frame.setVisible(true);
			frame.setLocationRelativeTo(null);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			evo.init();
			evo.executeEvolution();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
