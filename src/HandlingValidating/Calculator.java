package HandlingValidating;
public class Calculator {

    public int factorial(int num) {

        //PARAMETERS MUST BE 0 OR GREATER-C/N BE A NEGATIVE NUMBER
        if(num < 0) {
            throw new IllegalArgumentException("Number must be 0 or greater");
        }

        int answer = 1;
        for (int i = 1; i <= num; i++) {
            answer *= i;
        }

        return answer;
    }

    public int binomialCoefficent(int setSize, int subsetSize) {
        //NON-NEGATIVE AND SUBSET SIZE SHOULD NOT EXCEED SET SIZE, IF INVALID THROW ILLEGAL ARGUMENT
        if(setSize < 0 || subsetSize < 0 || setSize < subsetSize) {
            throw new IllegalArgumentException("Number must be 0 or greater. Subset size should not exceed set size.");
        }
        int numerator = factorial(setSize);
        int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);

        return numerator / denominator;
    }
}

//PART2-The methods of the Calculator class should be as follows: The method factorial
// should only work if the parameter is a non-negative number (0 or greater).
// The method binomialCoefficient should only work when the parameters are
// non-negative and the subset size does not exceed the set size. If these
// methods receive invalid parameters when they are called, they should
// throw an IllegalArgumentException