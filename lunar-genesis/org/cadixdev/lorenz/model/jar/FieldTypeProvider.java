package org.cadixdev.lorenz.model.jar;

import java.util.Optional;
import org.cadixdev.bombe.type.FieldType;
import org.cadixdev.lorenz.model.FieldMapping;

@FunctionalInterface
public interface FieldTypeProvider {
   Optional<FieldType> provide(FieldMapping var1);
}
