import java.util.*;

public class Polynomial {

    private List<Integer> coefficients;
    private List<Integer> exponents;

    public Polynomial() {
        coefficients = new ArrayList<>();
        exponents = new ArrayList<>();
    }

    public Polynomial(int[] terms) {
        coefficients = new ArrayList<>();
        exponents = new ArrayList<>();
        for (int i = 0; i < terms.length; i += 2) {
            coefficients.add(terms[i]);
            exponents.add(terms[i + 1]);
        }
    }

    public void clear() {
        coefficients.clear();
        exponents.clear();
    }

    public void setTerms(int[] terms) {
        clear();
        for (int i = 0; i < terms.length; i += 2) {
            coefficients.add(terms[i]);
            exponents.add(terms[i + 1]);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < coefficients.size(); i++) {
            int coefficient = coefficients.get(i);
            int exponent = exponents.get(i);
            if (coefficient == 0) {
                continue;
            }
            if (coefficient == 1) {
                if (exponent == 0) {
                    sb.append("1");
                } else {
                    sb.append("x");
                    if (exponent > 1) {
                        sb.append("^").append(exponent);
                    }
                }
            } else {
                sb.append(coefficient);
                if (exponent == 0) {
                    sb.append("");
                } else {
                    sb.append("x");
                    if (exponent > 1) {
                        sb.append("^").append(exponent);
                    }
                }
            }
            if (i < coefficients.size() - 1) {
                sb.append("+");
            }
        }
        return sb.toString();
    }

    public void addTerm(int coefficient, int exponent) {
        if (coefficient == 0) {
            return;
        }
        if (exponent < 0) {
            throw new IllegalArgumentException("Exponent must be non-negative");
        }
        coefficients.add(coefficient);
        exponents.add(exponent);
    }

    public double eval(double val) {
        double result = 0.0;
        for (int i = 0; i < coefficients.size(); i++) {
            int coefficient = coefficients.get(i);
            int exponent = exponents.get(i);
            result += coefficient * Math.pow(val, exponent);
        }
        return result;
    }

    public Polynomial multiply(int scalar) {
        Polynomial result = new Polynomial();
        for (int i = 0; i < coefficients.size(); i++) {
            result.addTerm(coefficients.get(i) * scalar, exponents.get(i));
        }
        return result;
    }

    public Polynomial add(Polynomial rhs) {
        Polynomial result = new Polynomial();
        for (int i = 0; i < coefficients.size(); i++) {
            result.addTerm(coefficients.get(i), exponents.get(i));
        }
        for (int i = 0; i < rhs.coefficients.size(); i++) {
            result.addTerm(rhs.coefficients.get(i), rhs.exponents.get(i));
        }
        return result;
    }

    public Polynomial multiply(Polynomial rhs) {
        Polynomial result = new Polynomial();
        for (int i = 0; i < coefficients.size(); i++) {
            for (int j = 0; j < rhs.coefficients.size(); j++) {
                result.addTerm(coefficients.get(i) * rhs.coefficients.get(j), exponents.get(i) + rhs.exponents.get(j));
            }
        }
        return result;
    }
}