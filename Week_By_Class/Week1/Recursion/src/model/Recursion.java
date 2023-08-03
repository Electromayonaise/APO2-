package model;

public class Recursion {

    public int factorial(int n) {
        if (n == 0) {
            return 1 ;
        } else {
            return n * factorial(n - 1) ;
        }
    }

    public int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n ;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2) ;
        }
    }

    public int sumDigits(int n) {
        if (n < 10) {
            return n ;
        } else {
            return n % 10 + sumDigits(n / 10) ;
        }
    }

    public int count7(int n) {
        if (n < 10) {
            if (n == 7) {
                return 1 ;
            } else {
                return 0 ;
            }
        } else {
            if (n % 10 == 7) {
                return 1 + count7(n / 10) ;
            } else {
                return count7(n / 10) ;
            }
        }
    }

    public int count8(int n) {
        if (n < 10) {
            if (n == 8) {
                return 1 ;
            } else {
                return 0 ;
            }
        } else {
            if (n % 10 == 8) {
                if ((n / 10) % 10 == 8) {
                    return 2 + count8(n / 10) ;
                } else {
                    return 1 + count8(n / 10) ;
                }
            } else {
                return count8(n / 10) ;
            }
        }
    }

    public int powerN(int base, int n) {
        if (n == 0) {
            return 1 ;
        } else {
            return base * powerN(base, n - 1) ;
        }
    }

    public int countX(String str) {
        if (str.length() == 0) {
            return 0 ;
        } else {
            if (str.charAt(0) == 'x') {
                return 1 + countX(str.substring(1)) ;
            } else {
                return countX(str.substring(1)) ;
            }
        }
    }

}