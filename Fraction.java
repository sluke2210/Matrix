package com.company;

public class Fraction {
    private long numerator ;
    private long denomonator;

    public Fraction( long numerator, long denomonator){
        this.numerator = numerator;
        this.denomonator = denomonator;
    }

    public long getDenomonator() {
        return this.denomonator;
    }

    public long getNumerator() {
        return this. numerator;
    }

    public void setDenomonator(long denomonator) {
        this.denomonator = denomonator;
    }

    public void setNumerator(long numerator) {
        this.numerator = numerator;
    }
    public Fraction multiplyFraction(Fraction f){
        long tempNum = this.getNumerator() * f.getNumerator();
        long tempDen = this.getDenomonator()*f.getDenomonator();
        return new Fraction(tempNum, tempDen);
    }

    public long getGCD(long a, long b){
        if(a > b){
            long remainder;
            do {
                 remainder = a % b;
                a = b;
                b = remainder;
            }while(remainder !=0);
        }
        return a;
    }

    public Fraction simplfyFraction(){
        long divisor = getGCD(this.getNumerator(), this.getDenomonator());
        long num = this.numerator / divisor;
        long deno = this.getDenomonator() / divisor;

        return new Fraction(num, deno);
    }

    public Fraction addFraction(Fraction f){
        long commonDeno = this.getDenomonator() * f.getDenomonator();
        long num = (this.getNumerator() * f.getDenomonator()) + (f.getNumerator() * this.getDenomonator());
        return new Fraction(num,commonDeno).simplfyFraction();
    }
    public Fraction intScalerMul(long a){
        long num = this.getNumerator() * a;
        long deno = this.getDenomonator() *a;

        return new Fraction(num,deno);

    }

public String toString(){
        return this.numerator + " / " + this.denomonator;
}

}
