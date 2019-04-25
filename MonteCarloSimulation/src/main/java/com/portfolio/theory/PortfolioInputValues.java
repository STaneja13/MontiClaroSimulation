package com.portfolio.theory;

public class PortfolioInputValues {
	
	private double meanDeviation;
	private double standarddDeviation;
	private double intialInvestmentAmount; 
	private double inflation;
	private int simulationfrequency;
	private int numberOfYears;
	private String inputCase;
	
	
	
	/**
	 * @param meanDeviation
	 * @param standarddDeviation
	 * @param intialInvestmentAmount
	 * @param inflation
	 * @param simulationfrequency
	 * @param numberOfYears
	 * @param inputCase
	 */
	public PortfolioInputValues(double meanDeviation, double standarddDeviation, double intialInvestmentAmount,
			double inflation, int simulationfrequency, int numberOfYears, String inputCase) {
		super();
		this.meanDeviation = meanDeviation;
		this.standarddDeviation = standarddDeviation;
		this.intialInvestmentAmount = intialInvestmentAmount;
		this.inflation = inflation;
		this.simulationfrequency = simulationfrequency;
		this.numberOfYears = numberOfYears;
		this.inputCase = inputCase;
	}
	/**
	 * @return the meanDeviation
	 */
	public double getMeanDeviation() {
		return meanDeviation;
	}
	/**
	 * @param meanDeviation the meanDeviation to set
	 */
	public void setMeanDeviation(double meanDeviation) {
		this.meanDeviation = meanDeviation;
	}
	/**
	 * @return the standarddDeviation
	 */
	public double getStandarddDeviation() {
		return standarddDeviation;
	}
	/**
	 * @param standarddDeviation the standarddDeviation to set
	 */
	public void setStandarddDeviation(double standarddDeviation) {
		this.standarddDeviation = standarddDeviation;
	}
	/**
	 * @return the intialInvestmentAmount
	 */
	public double getIntialInvestmentAmount() {
		return intialInvestmentAmount;
	}
	/**
	 * @param intialInvestmentAmount the intialInvestmentAmount to set
	 */
	public void setIntialInvestmentAmount(double intialInvestmentAmount) {
		this.intialInvestmentAmount = intialInvestmentAmount;
	}
	/**
	 * @return the inflation
	 */
	public double getInflation() {
		return inflation;
	}
	/**
	 * @param inflation the inflation to set
	 */
	public void setInflation(double inflation) {
		this.inflation = inflation;
	}
	/**
	 * @return the simulationfrequency
	 */
	public int getSimulationfrequency() {
		return simulationfrequency;
	}
	/**
	 * @param simulationfrequency the simulationfrequency to set
	 */
	public void setSimulationfrequency(int simulationfrequency) {
		this.simulationfrequency = simulationfrequency;
	}
	/**
	 * @return the numberOfYears
	 */
	public int getNumberOfYears() {
		return numberOfYears;
	}
	/**
	 * @param numberOfYears the numberOfYears to set
	 */
	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}

	/**
	 * @return the inputCase
	 */
	public String getInputCase() {
		return inputCase;
	}

	/**
	 * @param inputCase the inputCase to set
	 */
	public void setInputCase(String inputCase) {
		this.inputCase = inputCase;
	}
	
	

}
