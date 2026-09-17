package com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO;

import org.cadixdev.bombe.type.BaseType;

public record IRCIIHHICIHRCOCRROCOICRIHHCCHH() implements CRICCOOHHHCHOORCICOCOHIHOIRHOO {
   private final BaseType CICIOCHCOHCCOIHOOORCOHROICCCIR;

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(char var1) {
      this(BaseType.getFromKey(var1));
   }

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(BaseType var1) {
      this.CICIOCHCOHCCOIHOOORCOHROICCCIR = var1;
   }

   @Override
   public String getDescriptor() {
      return String.valueOf(this.CICIOCHCOHCCOIHOOORCOHROICCCIR == null ? 'V' : this.CICIOCHCOHCCOIHOOORCOHROICCCIR.getKey());
   }

   public BaseType IIIOCCCCCROHCHCOOHIHRRRCHCOCCC() {
      return this.CICIOCHCOHCCOIHOOORCOHROICCCIR;
   }
}
