package joptsimple;

import java.util.Arrays;
import java.util.Collection;

class OptionMissingRequiredArgumentException extends OptionException {
   private static final long serialVersionUID = -1L;

   OptionMissingRequiredArgumentException(OptionSpec<?> var1) {
      super((Collection<? extends OptionSpec<?>>)Arrays.asList(var1));
   }

   @Override
   Object[] messageArguments() {
      return new Object[]{this.singleOptionString()};
   }
}
