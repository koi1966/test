package Generics_Parameterization.lesson1;

 class Set<A> {
     A a;

     public A getA() {
         return a;
     }

     public void setA(A a) {
         this.a = a;
     }

     @Override
     public String toString() {
         return "Set{" +
                 "a=" + a +
                 '}';
     }
 }
