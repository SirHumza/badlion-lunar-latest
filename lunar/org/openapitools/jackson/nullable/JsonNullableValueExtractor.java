package org.openapitools.jackson.nullable;

import javax.validation.valueextraction.UnwrapByDefault;
import javax.validation.valueextraction.ValueExtractor;
import javax.validation.valueextraction.ValueExtractor.ValueReceiver;

@UnwrapByDefault
public class JsonNullableValueExtractor implements ValueExtractor<JsonNullable<?>> {
   public void extractValues(JsonNullable<?> var1, ValueReceiver var2) {
      JsonNullableValueExtractorHelper.extractValues(var1, var2::value);
   }
}
