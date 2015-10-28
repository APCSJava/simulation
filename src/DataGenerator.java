/**
 * Interface for classes that can be simulated.  Implementing classes should conduct
 * a simulation for the indicated time using the indicated time step and write output 
 * data for each step to sequential lines in a data file of the requested name.
 * 
 * @author kentc14
 *
 */
public interface DataGenerator {
	
	/**
	 * 
	 * @param outputFile file that will receive the output data
	 * @param time how long to generate data
	 * @param step the time interval at which to generate new data
	 */
	void generateData(String outputFile, double time, double step);

}
