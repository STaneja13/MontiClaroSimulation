package com.portfolio.theory;

import java.util.Random;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

public class SimulationGenerator {

	private Random random = new Random();

	/***
	 * Generate the random Number for Monte Claro simulation using
	 * 
	 * @param mean
	 * @param standardDeviation
	 * @return
	 */
	public double generateRandomNumber(double mean, double standardDeviation) {
		double nextGauss = random.nextGaussian();
		double randomNumber = nextGauss * standardDeviation + mean;
		return randomNumber;
	}

	/***
	 *  Execute Monte Claro Simulation  
	 * @param meanDeviation
	 * @param standarddDeviation
	 * @param intialInvestmentAmount
	 * @param inflation
	 * @param simulationfrequency
	 * @param numberOfYears
	 * @return
	 */
	public PortfolioOutput executeMoneClaroSimulation(PortfolioInputValues portFolioValues) {
		double[] investmentSimulationArray = new double[portFolioValues.getSimulationfrequency()];
		for (int i = 0; i < portFolioValues.getSimulationfrequency(); i++) {
			double amount = portFolioValues.getIntialInvestmentAmount();
			for (int j = 0; j < portFolioValues.getNumberOfYears(); j++) {
				amount = amount * (1 + generateRandomNumber(portFolioValues.getMeanDeviation(), portFolioValues.getStandarddDeviation())) * (1 - portFolioValues.getInflation());
			}
			investmentSimulationArray[i] = amount;
		}
		DescriptiveStatistics descriptiveStatistics = new DescriptiveStatistics(investmentSimulationArray);
		double bestCase = descriptiveStatistics.getPercentile(90);
		double worstCase = descriptiveStatistics.getPercentile(10);
		double median = descriptiveStatistics.getPercentile(50);

		return new PortfolioOutput(bestCase, worstCase, median);
	}

}
