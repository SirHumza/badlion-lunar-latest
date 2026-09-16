package org.openapitools.jackson.nullable;

import jakarta.validation.valueextraction.UnwrapByDefault;
import jakarta.validation.valueextraction.ValueExtractor;
import jakarta.validation.valueextraction.ValueExtractor.ValueReceiver;

@UnwrapByDefault
public class JsonNullableJakartaValueExtractor implements ValueExtractor<JsonNullable<?>> {
   public void extractValues(JsonNullable<?> var1, ValueReceiver var2) {
      JsonNullableValueExtractorHelper.extractValues(var1, var2::value);
   }
}
