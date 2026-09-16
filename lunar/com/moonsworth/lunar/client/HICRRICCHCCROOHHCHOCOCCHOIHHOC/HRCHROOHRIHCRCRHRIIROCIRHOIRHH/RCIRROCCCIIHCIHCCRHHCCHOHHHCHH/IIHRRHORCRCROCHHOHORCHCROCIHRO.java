package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonElement;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public class IIHRRHORCRCROCHHOHORCHCROCIHRO
   extends com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @Nullable
   private String IOHOHHIROCRIHOCCRIROOIRCIOOCCI;

   @Override
   public void HICRRICCHCCROOHHCHOCOCCHOIHHOC(JsonElement var1) {
      if (var1 != null && !var1.isJsonNull() && var1.isJsonPrimitive()) {
         this.IOHOHHIROCRIHOCCRIROOIRCIOOCCI = var1.getAsString();
      } else {
         this.IOHOHHIROCRIHOCCRIROOIRCIOOCCI = null;
      }
   }

   @Nullable
   @Generated
   public String RROHICOOIOIIRIHCRRCRRCCRIIOHCI() {
      return this.IOHOHHIROCRIHOCCRIROOIRCIOOCCI;
   }
}
