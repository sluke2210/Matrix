# Matrix
Class's for Matrix, Fraction and Complex number objects</br>
done to learn java n matrix stuff ; not useful in any way</br>
</br>
</br>
List of methods
</br>
</br>
</br>

Complex Number methods:
</br>

Complex(double re, double Im) -> constructor</br>

getReal() -> returns real component of complex number</br>

setReal(double re) -> set real component of complex number</br>

getImaginary ->  returns Imaginary component of complex number</br>

setImaginary(double Im) set imaginary component of complex number</br>
scalarMul(double scalar) -> returns complex number * scalar</br>

complexAdd(Complex c) -> returns the sum of two complex numbers</br>

complexMul(Complex c) -> returns the product of two complex numbers</br>

conjugate() -> returns the conjugate of a complex number</br>

argZ() -> returns the argument (angle made anticlockise from x axsis) of a complex number</br>

getMagnitude() -> returns |a+bi| , the magnitude of a comlpex num.</br>
</br>
</br>




Fraction methods:</br>


Fraction(int numerator, int denomonator) -> constructor</br>

getNumerator() -> returns the numerator</br>

setNumerator(int num) -> sets the numerator</br>

getDenomonator() -> returns denomonator</br>

setDenomonator(int deno) -> sets the denomonator</br>

multiplyFraction(fraction f) -> multiplys a fraction by another fraction</br>

getGCD(int n1, int n1) -> returns the greatest common divisor of n1,n2.</br>

simplfyFraction() -> returns a fraction in simplest form, if the number is whole is shown as over 1.</br>

addFraction(Fraction f) returns the simplfied sum of two fractions</br>

intScalerMul(int sclar) -> multiplies the numerator by a int scalar</br>

getDoubleValue</br>
</br>
</br>



Matrix methods:</br>


Matrix(double[][]) -> Constructor for matrix of doubles</br>

Matrix(Complex[][])-> Constructor for matrix of Complex nums</br>

Matrix(Fraction[][])-> Constructor for matrix of Fractions</br>


getElement(int row, int col) -> returns the matrix element at index [row][col] : double matracies only</br>

printMatrix() -> prints a matrix of doubles : double matracies only</br>

printComplexMatrix() -> prints a matrix of Complex number : Complex number matracies only</br>

printFractionMatrix()-> prints a matrix of fractions :  fraction matracies only</br>

compareMatrix() -> prints two matracies side by side : only works if you call the matrix of doules and pass the matrix of objects (Complex | Fraction) as the argument, or in the case of Compareing a Fractional and Complex Matrix pass the Fractional Matrix as the argument . otherwise NullPointerException.</br>

scalarMul(double a) -> multiplies the elements of a matrix by a sclar : Works for all matracies</br>

add(Matrix m) -> Matrix addition : works for all matracies</br>

sub(Matrix m) -> Matrix addition : double matracies only </br>

trace()-> returns the trace of a square matrix : double matracies only</br>

transpose() -> Swaps rows and cols of a square matrix: Works for all matracies</br>

swapRow() -> swaps row1 with row2 and row2 with row1: Works for all matracies</br>
isRowZeros(int row1, int row2) -> returns true if every elemnt in row, row is zero : double matracies only</br>
isColZeros(int col) -> returns true if every elemnt in collum, col is zero : double matracies only</br>
getSubMatrix(int row, int col) -> returns a Matrix with the row row, and the col col removed : double matracies only</br>
det(Matrix m) -> returns the determinant of a matrix m passed to Matrix.det(); : double matracies only, also takes 2 minets to find the determinant of a 12 x 12 matrix full of random ints</br>
matrixMul(Matrix M): returns a Matrix that is the matrix product of two matracies with the corrct dimensions : works for all matracies</br>
dotProduct(Matrix m double|fractional): returns the dot product of 2 vectos (a matrix with 1 dimension) : works for doubles, not for fractions NullPointerException</br>
complexDotProduct(Matrix) : complex dot product of a vector of complex numbers : complex Matracies of 1 dimension only, im not sure if i works
checkNull() -> prints wether or not the state of the 2darray instance vars of Matrix (matrix[][], fractionlMatrix[][], complexMatrix[][]) are null. : works for all matracies</br>
genRandomMatrix(int row, int col, min, max) -> returns a new matrix of size rowXcol filled with random ints from min to max : makes double matracies only </br>
getCofactor2x2()-> computes the cofactor for a 2x2 matrix : double maracies only</br>



</br>
Other things to do:</br>
</br>

1.the methods above.</br>
2.Exception for IllegalMatrixDimensions.</br>
3.cross prod</br>
4.createRotationMarix() potentially</br>
5.matric of minors / matrix of cofactors</br>
6.tests with known correct solutions</br>

