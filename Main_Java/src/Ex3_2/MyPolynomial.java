package Ex3_2;

public class MyPolynomial {
    private double[] coeffs;

    // Constructor with variable arguments (varargs)
    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    // Get the degree of the polynomial
    public int getDegree() {
        return coeffs.length - 1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = coeffs.length - 1; i >= 0; i--) {
            if (coeffs[i] != 0) {
                if (sb.length() > 0) {
                    sb.append(coeffs[i] > 0 ? " + " : " - ");
                } else if (coeffs[i] < 0) {
                    sb.append("-");
                }
                sb.append(Math.abs(coeffs[i]));
                if (i > 0) sb.append("x");
                if (i > 1) sb.append("^").append(i);
            }
        }
        return sb.toString();
    }

    public double evaluate(double x) {
        double result = 0;
        for (int i = 0; i < coeffs.length; i++) {
            result += coeffs[i] * Math.pow(x, i);
        }
        return result;
    }

    public MyPolynomial add(MyPolynomial another) {
        int maxDegree = Math.max(this.getDegree(), another.getDegree());
        double[] newCoeffs = new double[maxDegree + 1];

        for (int i = 0; i <= maxDegree; i++) {
            double coeff1 = i < this.coeffs.length ? this.coeffs[i] : 0;
            double coeff2 = i < another.coeffs.length ? another.coeffs[i] : 0;
            newCoeffs[i] = coeff1 + coeff2;
        }

        this.coeffs = newCoeffs;
        return this;
    }

    public MyPolynomial multiply(MyPolynomial another) {
        int newDegree = this.getDegree() + another.getDegree();
        double[] newCoeffs = new double[newDegree + 1];

        for (int i = 0; i < this.coeffs.length; i++) {
            for (int j = 0; j < another.coeffs.length; j++) {
                newCoeffs[i + j] += this.coeffs[i] * another.coeffs[j];
            }
        }

        this.coeffs = newCoeffs;
        return this;
    }
}

