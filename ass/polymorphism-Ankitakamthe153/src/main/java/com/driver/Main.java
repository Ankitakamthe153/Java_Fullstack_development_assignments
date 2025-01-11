package com.driver;

public class Main {
        public static class Product{
           public int product(int x, int y) {
               return x*y;
           }
           public int product(int x, int y, int z) {
               return x*y*z;
          }
           public double product(double x, double y) {
              return x*y;
          }
     }
    public static void main(String args[]){
        Product p = new Product();//creating object of product class
        p.product(0,0);
        p.product(0,0,0);
        p.product(0.0,0.0);
    }
}
