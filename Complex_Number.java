package popo;

class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
    }

    public ComplexNumber subtract(ComplexNumber other) {
        return new ComplexNumber(this.real - other.real, this.imaginary - other.imaginary);
    }

    public void display() {
        System.out.printf("%f + %fi\n", real, imaginary);
    }

    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(4, 5);
        ComplexNumber c2 = new ComplexNumber(2, 3);

        ComplexNumber result = c1.add(c2);
        System.out.print("Addition: ");
        result.display();

        result = c1.subtract(c2);
        System.out.print("Subtraction: ");
        result.display();
    }
}