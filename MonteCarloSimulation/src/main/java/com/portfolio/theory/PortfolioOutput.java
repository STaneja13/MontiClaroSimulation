package com.portfolio.theory;

public class PortfolioOutput {
	
	private double bestCase, worstCase, median;

	PortfolioOutput(double bestCase, double worstCase, double median) {
        this.bestCase = bestCase;
        this.worstCase = worstCase;
        this.median = median;
    }

	public double getBestCase() {
		return bestCase;
	}

	public void setBestCase(double bestCase) {
		this.bestCase = bestCase;
	}

	public double getWorstCase() {
		return worstCase;
	}

	public void setWorstCase(double worstCase) {
		this.worstCase = worstCase;
	}

	public double getMedian() {
		return median;
	}

	public void setMedian(double median) {
		this.median = median;
	}

}
