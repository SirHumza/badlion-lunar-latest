package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.gson.JsonObject;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRHROHHHCIHHCOHCOORCRIHHIICROR;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HCHRIROHHHCORIOCROOCHRCIOROOCI;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public class CRICCOOHHHCHOORCICOCOHIHOIRHOO
   implements com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CORCOCICIRIOHROHROIIOOHICCHCRR,
   com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RHOCHHIRRCHHHOHOIRROIROHHHIHIO {
   private final com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CORCOCICIRIOHROHROIIOOHICCHCRR OOICCOOOIRIICHROICIRIORCCOOHRI;
   private boolean HCIOORICORCCCRIHCOOOOOOROOICOI;
   private boolean IOCRIHOIHRRRHOROHIHHHCIRCHCHIO = true;

   public CRICCOOHHHCHOORCICOCOHIHOIRHOO(com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CORCOCICIRIOHROHROIIOOHICCHCRR var1) {
      this.OOICCOOOIRIICHROICIRIORCCOOHRI = var1;
   }

   public void unlock() {
      if (this.IOCRIHOIHRRRHOROHIHHHCIRCHCHIO) {
         this.IOCRIHOIHRRRHOROHIHHHCIRCHCHIO = false;
         this.OOICCOOOIRIICHROICIRIORCCOOHRI.setEnabled(this.HCIOORICORCCCRIHCOOOOOOROOICOI);
      }
   }

   @NotNull
   @Override
   public Optional<HCHRIROHHHCORIOCROOCHRCIOROOCI<Boolean>> OCIOICIOHHHIRIOCIHCHHCCHRRRIHI() {
      return this.OOICCOOOIRIICHROICIRIORCCOOHRI
         .OCIOICIOHHHIRIOCIHCHHCCHRRRIHI()
         .map(var1 -> new CRHROHHHCIHHCOHCOORCRIHHIICROR<>((HCHRIROHHHCORIOCROOCHRCIOROOCI<Boolean>)var1, () -> this.IOCRIHOIHRRRHOROHIHHHCIRCHCHIO));
   }

   @Override
   public void HIORHORHOICHRHORRRCOORHIIICIIR() {
      if (!this.IOCRIHOIHRRRHOROHIHHHCIRCHCHIO) {
         this.OOICCOOOIRIICHROICIRIORCCOOHRI.HIORHORHOICHRHORRRCOORHIIICIIR();
      }
   }

   @Override
   public boolean isEnabled() {
      return this.IOCRIHOIHRRRHOROHIHHHCIRCHCHIO ? false : this.OOICCOOOIRIICHROICIRIORCCOOHRI.isEnabled();
   }

   @Override
   public void setEnabled(boolean var1) {
      if (!this.IOCRIHOIHRRRHOROHIHHHCIRCHCHIO) {
         this.OOICCOOOIRIICHROICIRIORCCOOHRI.setEnabled(var1);
      }
   }

   @Override
   public boolean RHIHIHIRHIHIHHCCICRCHROIIHHRII() {
      return this.IOCRIHOIHRRRHOROHIHHHCIRCHCHIO ? false : this.OOICCOOOIRIICHROICIRIORCCOOHRI.RHIHIHIRHIHIHHCCICRCHROIIHHRII();
   }

   @Override
   public void RIIHIHHCRHCHRCICHOROHCHIIHCICH(boolean var1) {
      if (!this.IOCRIHOIHRRRHOROHIHHHCIRCHCHIO) {
         this.OOICCOOOIRIICHROICIRIORCCOOHRI.RIIHIHHCRHCHRCICHOROHCHIIHCICH(var1);
      }
   }

   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1, boolean var2) {
      if (this.IOCRIHOIHRRRHOROHIHHHCIRCHCHIO) {
         if (!var2) {
            this.OOICCOOOIRIICHROICIRIORCCOOHRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, false);
         }
      } else {
         this.OOICCOOOIRIICHROICIRIORCCOOHRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2);
      }
   }

   @Override
   public void load(JsonObject var1) {
      if (!this.OOICCOOOIRIICHROICIRIORCCOOHRI.OCIOICIOHHHIRIOCIHCHHCCHRRRIHI().isEmpty()) {
         HCHRIROHHHCORIOCROOCHRCIOROOCI var2 = this.OOICCOOOIRIICHROICIRIORCCOOHRI.OCIOICIOHHHIRIOCIHCHHCCHRRRIHI().get();
         if (this.IOCRIHOIHRRRHOROHIHHHCIRCHCHIO) {
            String var3 = var2.getId();
            if (var1.has(var3) && !var1.get(var3).isJsonNull()) {
               this.HCIOORICORCCCRIHCOOOOOOROOICOI = var1.get(var3).getAsBoolean();
            } else {
               this.HCIOORICORCCCRIHCOOOOOOROOICOI = (Boolean)var2.getDefaultValue();
            }
         } else {
            var2.load(var1);
         }
      }
   }

   @Override
   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(JsonObject var1) {
      if (!this.OOICCOOOIRIICHROICIRIORCCOOHRI.OCIOICIOHHHIRIOCIHCHHCCHRRRIHI().isEmpty()) {
         HCHRIROHHHCORIOCROOCHRCIOROOCI var2 = this.OOICCOOOIRIICHROICIRIORCCOOHRI.OCIOICIOHHHIRIOCIHCHHCCHRRRIHI().get();
         if (this.IOCRIHOIHRRRHOROHIHHHCIRCHCHIO) {
            if (((Boolean)var2.getDefaultValue()).equals(this.HCIOORICORCCCRIHCOOOOOOROOICOI)) {
               var1.remove(var2.getId());
            } else {
               var1.addProperty(var2.getId(), this.HCIOORICORCCCRIHCOOOOOOROOICOI);
            }
         } else {
            var2.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1);
         }
      }
   }

   @Override
   public int priority() {
      return this.OOICCOOOIRIICHROICIRIORCCOOHRI instanceof com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RHOCHHIRRCHHHOHOIRROIROHHHIHIO var1
         ? var1.priority()
         : 1000;
   }
}
