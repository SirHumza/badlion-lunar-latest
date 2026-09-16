package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import com.google.gson.JsonElement;
import java.util.function.Consumer;
import lombok.Generated;

public abstract class IRCIIHHICIHRCOCRROCOICRIHHCCHH
   implements com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH,
   Consumer<JsonElement> {
   private boolean loaded = false;
   private String name;

   @Override
   public boolean HICCORIOHCOHCRRHHCIOIIIRCCROOC() {
      return this.loaded;
   }

   @Override
   public String CCCHICIIIROIRRRHCROHIOIRIROCIH() {
      return this.name;
   }

   public void RICRIRRCOHRCOCRRHHCRHRROOIOHHR(JsonElement var1) {
      this.HICRRICCHCCROOHHCHOCOCCHOIHHOC(var1);
      this.loaded = true;
   }

   public abstract void HICRRICCHCCROOHHCHOCOCCHOIHHOC(JsonElement var1);

   @Generated
   public void setName(String var1) {
      this.name = var1;
   }
}
