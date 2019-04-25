package com.portfolio.theory;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MonteClaroAnalysis {
	
	public static void main(String args[]) {
		
		final String aggressive = "AGGRESSIVE";
		final String conservative = "CONSERVATIVE";
		
		
		SimulationGenerator simulationResult = new SimulationGenerator();
		
		/*
		 * Portfolio Type Return (Mean) Risk ( Standard Deviation) Aggressive %9.4324
		 * 15.675 Very Conservative %6.189 6.3438
		 */
		
		Locale locale = new Locale("en", "US");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        
		List<PortfolioInputValues> inputCases = new ArrayList<PortfolioInputValues>();
		PortfolioInputValues aggressvieCase = new  PortfolioInputValues(6.189, 6.3438, 100000, 0.035, 10000, 20,aggressive);
		PortfolioInputValues conservativeCase = new  PortfolioInputValues(9.4324,15.675, 100000, 0.035, 10000, 20, conservative);
		inputCases.add(aggressvieCase);
		inputCases.add(conservativeCase);
		System.out.println(" ======= Portfolio Type ========== Return (Mean) ========= Risk ( Standard Deviation) =======");
		for (PortfolioInputValues portfolioInputValues : inputCases) {
			PortfolioOutput portfolio = simulationResult.executeMoneClaroSimulation(portfolioInputValues);
			if(portfolioInputValues.getInputCase().equals(aggressive)) {
				System.out.println(" ======= Aggressive ========== "+ portfolioInputValues.getMeanDeviation() + " ========= " + portfolioInputValues.getStandarddDeviation());
			} else if(portfolioInputValues.getInputCase().equals(conservative)) {
				System.out.println(" ======= Very Conservative ========== "+ portfolioInputValues.getMeanDeviation() + " ========= " + portfolioInputValues.getStandarddDeviation());
			} else {
				System.out.println(" ======= Please Check the input !!!!!========== ");
			}
			
	     	System.out.println(" Best Case ========= " + currencyFormatter.format(portfolio.getBestCase()));
	        System.out.println(" Worst Case ======== " + currencyFormatter.format(portfolio.getWorstCase()));
	        System.out.println(" Median Case ======= " + currencyFormatter.format(portfolio.getMedian()));
			
		
		}
		
		
		
	        
		

	        
	        
	        
	    }
	
}
