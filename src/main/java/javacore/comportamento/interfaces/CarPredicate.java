package javacore.comportamento.interfaces;

import javacore.comportamento.dominio.Car;

@FunctionalInterface
public interface CarPredicate {
   // anonimas, funções, conciso
   boolean test(Car car);  // funções lambdas tem q ter um interface e metodo abstrato.. boolean o tipo q ela vai retornar nesse exemplo
   //(parametro) -> <expressão>
   //(Car car) -> car.getColor().equals("green");
}
