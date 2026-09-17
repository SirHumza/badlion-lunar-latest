package com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HCHRIROHHHCORIOCROOCHRCIOROOCI;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.ORHIOICIOCRRHOOCOHRORIHICHRCRR;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RORCHCIIICOHIRROOORHOCCCCIOCCI;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.jspecify.annotations.Nullable;

public class CRRRICCRROCOHHOHIICIHORCOORRRH implements HHCCIRHCCCIIRHCROHIORHIRHHIORH, Cloneable {
   protected HCHRIROHHHCORIOCROOCHRCIOROOCI<?> option;
   private @Nullable Set<CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> ICOHCROHOOHOCRRORHRROOOIOROCRC;

   public CRRRICCRROCOHHOHIICIHORCOORRRH(HCHRIROHHHCORIOCROOCHRCIOROOCI<?> var1) {
      this.option = var1;
   }

   @Override
   public HHCCIRHCCCIIRHCROHIORHIRHHIORH IOHIHIIHCCCCCIHRORIOIOORCIOHII(HCHRIROHHHCORIOCROOCHRCIOROOCI<?> var1) {
      try {
         CRRRICCRROCOHHOHIICIHORCOORRRH var2 = (CRRRICCRROCOHHOHIICIHORCOORRRH)super.clone();
         var2.option = var1;
         var2.ICOHCROHOOHOCRRORHRROOOIOROCRC = null;
         return var2;
      } catch (CloneNotSupportedException var3) {
         throw new AssertionError();
      }
   }

   @Override
   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(RORCHCIIICOHIRROOORHOCCCCIOCCI var1, @Nullable String var2) {
      if (this.ICOHCROHOOHOCRRORHRROOOIOROCRC == null) {
         this.ICOHCROHOOHOCRRORHRROOOIOROCRC = new LinkedHashSet<>(2);
      }

      this.ICOHCROHOOHOCRRORHRROOOIOROCRC.add(new CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2));
   }

   @Override
   public void OCCHOHICOOHCHIOCRRCCOCRCROHHHO() {
      if (this.ICOHCROHOOHOCRRORHRROOOIOROCRC != null) {
         for (CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 : this.ICOHCROHOOHOCRRORHRROOOIOROCRC) {
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2.OHROCIHRROCHHOORRIIIOHCIOCCHCO(), var2.id());
         }
      }
   }

   @Override
   public JsonElement provide() {
      JsonObject var1 = new JsonObject();
      var1.addProperty("id", this.option.getId());
      var1.add("value", this.CHHIICHRIIROIOHIHIIROICOCCROCI(this.option.HRHHHHIICCCIROOOHIIIHIHIHHHOHC()));
      var1.add("default", this.CHHIICHRIIROIOHIHIIROICOCCROCI(this.option.getDefaultValue()));
      var1.addProperty("isDefault", this.option.isDefault());
      String var2 = this.option.CHIIRICICCCIIRRRICIICCCIIHHRRO() + "Description";
      String var3 = this.option.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var2);
      if (!var3.equals(var2)) {
         var1.addProperty("description", var3);
      }

      List var4 = this.option.getChildren();
      JsonArray var5 = new JsonArray(var4.size());

      for (HCHRIROHHHCORIOCROOCHRCIOROOCI var7 : var4) {
         HHCCIRHCCCIIRHCROHIORHIRHHIORH var8 = var7.IHCRORHRORIICHRHRCHRRIRRHHOCOO(CRICCOOHHHCHOORCICOCOHIHOIRHOO.CRHRCRCCHCICIRIRCIRHRCIHCIRHIO);
         if (var8 != null) {
            var5.add(var8.provide());
         }
      }

      var1.add("children", var5);
      RRCRRCORICCHOHHIRCHIROOHIIOHCO var11 = this.option.IHCRORHRORIICHRHRCHRRIRRHHOCOO(CRICCOOHHHCHOORCICOCOHIHOIRHOO.ROIIHIIRRCCHIRIIOCIORICOHCRIRC);
      if (var11 != null) {
         var11.IRCIIHHICIHRCOCRROCOICRIHHCCHH(this.option, var1);
      }

      Set var12 = this.option.IHCRORHRORIICHRHRCHRRIRRHHOCOO(CRICCOOHHHCHOORCICOCOHIHOIRHOO.RHOOIRCROCOHHRHORHOHHCRHRIIHCC);
      if (var12 != null && !var12.isEmpty()) {
         JsonArray var13 = new JsonArray(var12.size());

         for (com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRICCOOHHHCHOORCICOCOHIHOIRHOO var10 : var12) {
            var13.add(var10.getId());
         }

         var1.add("badges", var13);
      }

      if (!var1.has("name")) {
         var1.addProperty("name", this.option.getName());
      }

      com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var14 = this.option
         .IHCRORHRORIICHRHRCHRRIRRHHOCOO(CRICCOOHHHCHOORCICOCOHIHOIRHOO.CHOCCRCCIRIHOROCHHICOHHHOICHHH);
      if (var14 != null) {
         var14.RRHOOOORORHHOOIHRCCHIIHHIIIIOH(var1);
      }

      return var1;
   }

   private JsonPrimitive CHHIICHRIIROIOHIHIIROICOCCROCI(Object var1) {
      if (var1 == null) {
         return new JsonPrimitive("null");
      } else {
         Class var2 = var1.getClass();
         if (var2 == String.class) {
            return new JsonPrimitive((String)var1);
         } else if (var2 == Boolean.class) {
            return new JsonPrimitive((Boolean)var1);
         } else if (var2 == Integer.class) {
            return new JsonPrimitive((Integer)var1);
         } else if (var2 == Float.class) {
            return new JsonPrimitive((Float)var1);
         } else if (var2 == Double.class) {
            return new JsonPrimitive((Double)var1);
         } else {
            return var1 instanceof ORHIOICIOCRRHOOCOHRORIHICHRCRR var3 ? new JsonPrimitive(var3.id()) : new JsonPrimitive(var1.toString());
         }
      }
   }

   private record RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      private final RORCHCIIICOHIRROOORHOCCCCIOCCI OIOIHIICORROIOOIIIHHHRCOHROCIH;
      private final @Nullable String CRCIHRCCIHIHIHCHCOHCRRROCORCIO;

      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RORCHCIIICOHIRROOORHOCCCCIOCCI var1, @Nullable String var2) {
         this.OIOIHIICORROIOOIIIHHHRCOHROCIH = var1;
         this.CRCIHRCCIHIHIHCHCOHCRRROCORCIO = var2;
      }

      public RORCHCIIICOHIRROOORHOCCCCIOCCI OHROCIHRROCHHOORRIIIOHCIOCCHCO() {
         return this.OIOIHIICORROIOOIIIHHHRCOHROCIH;
      }

      public @Nullable String id() {
         return this.CRCIHRCCIHIHIHCHCOHCRRROCORCIO;
      }
   }
}
