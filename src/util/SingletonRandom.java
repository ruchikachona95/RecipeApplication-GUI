package util;


import java.security.SecureRandom;
import java.util.Random;

/** 
 * Steven Gorn
 *
 *Last Modified Date 01/23/2015
 *CST8284 020 Object-Oriented Programming
 *Prof. Rex Woollard
 *Assignment 2
 *
 * <i>Singleton</i> class that provides a simplified interface to random number generation using a Gaussian (normal) distribution. 
 * */
public class SingletonRandom {
  
	/** public final static gives immutable access to reference-to variable of the single object of type <i>SingletonRandom</i> */
  public final static SingletonRandom instance = new SingletonRandom();
  
  /** reference-to value for the java.util.Random object that will be created */
  private Random random;
 
  /** Random number generator for hit-point, follows a flat distribution.*/
  private SecureRandom randomHitPpoint;

  /** private constructor is a key element in <i>Singleton</i> design pattern; no object of type SingletonRandom can ever be created outside the class. */
  public SingletonRandom() {
	  random = new Random(); 
	  randomHitPpoint = new SecureRandom();
	  }
  
  /** Random number generator for a strong hit-point on <i>Actor</i> object. 
   *  Range from minimum 5 to maximum 10.
   *  @return random hit point value (strong).
   * */
  public int getStrongHitPointRandom(){
	  return 11 + randomHitPpoint.nextInt(20);
  }
  
  /** Random number generator for a weak hit-point on <i>Actor</i> object. 
   *  Range from minimum 1 to maximum 4.
   *  @return random hit point value (weak).
   * */
  public int getWeakHitPointRandom(){
	  return 5 + randomHitPpoint.nextInt(10);
  }

  /**
   * @param lowerLimit returned values will always be greater-than-or-equal-to this value
   * @param upperLimit returned values will always be less-than-or-equal-to this value
   * @param standardDeviationSpread influences the shape of the "normal" curve, example cases of values for standardDeviationSpread: <ul><li>1.0: distribution will be flatter, 68% of values naturally fall between
   * lowerLimit and upperLimit, 32% (100%-68%) are outside limits and have to be snapped back into range</li><li>2.0: distribution will be moderately peaked, 95% of values naturally fall between lowerLimit
   * and upperLimit, 5% (100%-95%) are outside limits and have to be snapped back into range</li><li>3.0: distribution will have sharp clustering around the mean, 99.7% of values naturally fall between
   * lowerLimit and upperLimit, 0.3% (100%-99.7%) are outside limits and have to be snapped back into range since standardDeviationSpread is double, it can contain fractional values, not just the integral values shown here.</li></ul>
   *
   * @return a random number that follows a normal (Gaussian) distribution within the specified range.
   */
  public double getNormalDistribution(double lowerLimit, double upperLimit, double standardDeviationSpread) {
	// if standardDeviationSpread is < 1.0 there is a risk of excessive iterations of the range-checking do-while() loop
	  if (standardDeviationSpread < 1.0 || standardDeviationSpread > 5.0) 
      throw new IllegalArgumentException();
    double range = upperLimit - lowerLimit + 1.0;
    double mean = (lowerLimit + upperLimit) / 2.0;
    double calculatedRandom;
    do {
      // next.Gaussian() returns a value with 1-standard deviation worth range between -1.0 and +1.0 (i.e. about 68% of values)
      calculatedRandom = (random.nextGaussian() * (range / 2.0) / standardDeviationSpread) + mean;
    } while (calculatedRandom < lowerLimit || calculatedRandom > upperLimit);
    return calculatedRandom;
  } // end getNormalDistribution()
} // end class SingletonRandom