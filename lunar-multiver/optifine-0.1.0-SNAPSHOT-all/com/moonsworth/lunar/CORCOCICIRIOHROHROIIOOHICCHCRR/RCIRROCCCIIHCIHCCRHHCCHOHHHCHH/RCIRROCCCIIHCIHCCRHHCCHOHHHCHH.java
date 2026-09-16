package com.moonsworth.lunar.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.ichor.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IIHRRHORCRCROCHHOHORCHCROCIHRO;
import java.io.IOException;
import java.io.InputStream;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public CORCOCICIRIOHROHROIIOOHICCHCRR[] RIRHOCHIORCCIIOIIRHOCCCRHHCHHH() {
      return new CORCOCICIRIOHROHROIIOOHICCHCRR[]{com.moonsworth.lunar.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.PRE_OPTIFINE_PATCH};
   }

   @IIHRRHORCRCROCHHOHORCHCROCIHRO
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(com.moonsworth.lunar.ichor.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      try {
         if (var1.CIIRICRCHCORHRIOHCHHCOHCOROIOR() == null
            && var1.CHRROHIRHRCRHHCRCHHIIRHOCHHCOO().endsWith(".class")
            && com.moonsworth.lunar.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ICIHOIHROICHIHRIIOOCHOCCOHRIRR(
               var1.CHRROHIRHRCRHHCRCHHIIRHOCHHCOO()
            )
            && !var1.CHRROHIRHRCRHHCRCHHIIRHOCHHCOO().startsWith("notch/")) {
            String var2 = "notch/" + var1.CHRROHIRHRCRHHCRCHHIIRHOCHHCOO();
            InputStream var3 = Thread.currentThread().getContextClassLoader().getResourceAsStream(var2);
            if (var3 != null) {
               try (var3) {
                  var1.OHCIIOCHHOHOHCOHHCRRHHCRHOIICC(var3.readAllBytes());
               } catch (IOException var9) {
                  System.err.println("Failed to read stream for " + var1.CHRROHIRHRCRHHCRCHHIIRHOCHHCOO());
                  var9.printStackTrace();
               }
            }
         }
      } catch (Throwable var10) {
         throw var10;
      }
   }
}
