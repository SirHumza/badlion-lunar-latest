package com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.CIOHHCORHRCCRICCCORIHCRHCCCRRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import java.util.List;
import org.jetbrains.annotations.Nullable;

public record RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
   private final List<String> keys;
   @Nullable
   private final String RHIROCHOCHCICOOOHHRICCHOHCHHIR;
   private final String HRCRORCOORHHORRCIOOIIHRROCOORC;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(List<String> var1, @Nullable String var2, String var3) {
      this.keys = var1;
      this.RHIROCHOCHCICOOOHHRICCHOHCHHIR = var2;
      this.HRCRORCOORHHORRCIOOIIHRROCOORC = var3;
   }

   public static RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OOROOCCIRCCRHOIOIORIHCHHOOCCOR(String var0, @Nullable String var1, String var2) {
      return new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(List.of(var0), var1, var2);
   }

   public static RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CRRRICCRROCOHHOHIICIHORCOORRRH(String var0, String var1, @Nullable String var2, String var3) {
      return new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(List.of(var0, var1), var2, var3);
   }

   public List<String> IIOHOHOHCRRRORCROOIOCHCRCOHHHR() {
      return this.keys;
   }

   @Nullable
   public String RCHIOCCORCICHOCRRRIRRHCHCIHOOH() {
      return this.RHIROCHOCHCICOOOHHRICCHOHCHHIR;
   }

   public String IIRIHROCHIICCHOCIRIIROORIIHHIC() {
      return this.HRCRORCOORHHORRCIOOIIHRROCOORC;
   }
}
