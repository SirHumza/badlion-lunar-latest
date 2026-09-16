package com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import java.util.UUID;
import javax.annotation.Nullable;

public class CRRRICCRROCOHHOHIICIHORCOORRRH implements HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   private final boolean OHHOHHCCCOIICRRHHHOCCIRHORIRCI;
   private final UUID ICRORIORIHIHHIICHCICRHOHIRIOIH;
   private final String RROIHRCCCIIHOROCCHICHOOROROHOI;
   private final String RIOIORRRRHHIHCRHHRRCROOIOHOHHO;

   public CRRRICCRROCOHHOHIICIHORCOORRRH(@Nullable UUID var1, String var2, String var3, boolean var4) {
      this.ICRORIORIHIHHIICHCICRHOHIRIOIH = var1;
      this.RROIHRCCCIIHOROCCHICHOOROROHOI = var2;
      this.RIOIORRRRHHIHCRHHRRCROOIOHOHHO = var3;
      this.OHHOHHCCCOIICRRHHHOCCIRHORIRCI = var4;
   }

   @Override
   public JsonElement provide() {
      JsonObject var1 = new JsonObject();
      if (this.OHHOHHCCCOIICRRHHHOCCIRHORIRCI) {
         var1.addProperty("anonymous", true);
      } else if (this.ICRORIORIHIHHIICHCICRHOHIRIOIH != null
         && this.ICRORIORIHIHHIICHCICRHOHIRIOIH.getLeastSignificantBits() != 0L
         && this.ICRORIORIHIHHIICHCICRHOHIRIOIH.getMostSignificantBits() != 0L) {
         var1.addProperty("uuid", this.ICRORIORIHIHHIICHCICRHOHIRIOIH.toString());
         var1.addProperty("username", this.RROIHRCCCIIHOROCCHICHOOROROHOI);
      }

      var1.addProperty("message", this.RIOIORRRRHHIHCRHHRRCROOIOHOHHO);
      return var1;
   }
}
