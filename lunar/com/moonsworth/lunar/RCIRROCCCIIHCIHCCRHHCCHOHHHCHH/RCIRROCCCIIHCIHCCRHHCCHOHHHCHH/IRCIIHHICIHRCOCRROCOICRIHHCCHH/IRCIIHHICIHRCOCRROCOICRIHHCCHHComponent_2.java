package com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public class CRRRICCRROCOHHOHIICIHORCOORRRH implements IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   private final String scheme;
   private Supplier<String> OCIHRICRHRRHIOHIIHIROCRIRHCCIR;

   public CRRRICCRROCOHHOHIICIHORCOORRRH(String var1) {
      this.scheme = var1;
   }

   public String OOCHRIIIRIHRRCRIORHCROIIHCRRIC() {
      return this.OCIHRICRHRRHIOHIIHIROCRIRHCCIR.get();
   }

   public void IRRCCOICORICIHCHRHIHIHROIRHOCR(String var1) {
      this.OCIHRICRHRRHIOHIIHIROCRIRHCCIR = () -> var1;
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Supplier<String> var1) {
      this.OCIHRICRHRRHIOHIIHIROCRIRHCCIR = var1;
   }

   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      List<OOROOCCIRCCRHOIOIORIHCHHOOCCOR> var1, Map<String, String> var2, Map<String, String> var3, String var4, String var5, URI var6
   ) {
      String var7 = Optional.ofNullable(this.OCIHRICRHRRHIOHIIHIROCRIRHCCIR).map(Supplier::get).orElse(null);
      if (var7 != null) {
         var2.put("Authorization", (this.scheme != null ? RICRIRRCOHRCOCRRHHCRHRROOIOHHR(this.scheme) + " " : "") + var7);
      }
   }

   private static String RICRIRRCOHRCOCRRHHCRHRROOIOHHR(String var0) {
      return "bearer".equalsIgnoreCase(var0) ? "Bearer" : var0;
   }
}
