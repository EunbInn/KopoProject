package Selpractice;

import org.apache.commons.math3.stat.regression.OLSMultipleLinearRegression;
import org.apache.commons.math3.stat.regression.RegressionResults;

public class RegressionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OLSMultipleLinearRegression regression = new OLSMultipleLinearRegression(); 
		double[][] X = new double[][]{{5000,0.5},{4000,2},{3500,1},{3500,2.5},{5100,1.5},{4000,1},{3200,2},{3700,1.25},{3000,2},{2900,3},{2900,1},{3200,2},{4300,1.25},{2900,3}};
		double[] Y = new double[]{9,4,6,3,7,8,5,7,4,3,6,7,8,4};
		regression.newSampleData(Y, X);
		
		double R = regression.calculateRSquared();
		regression.calculateTotalSumOfSquares();
		double Err = regression.estimateRegressionStandardError();
		System.out.println(R);
		System.out.println(Err);
	}

}
