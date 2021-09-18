package javacore.crud.dominio;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Producer { // aqui final class
    Integer id;  // Já é private final
    String name;

}
