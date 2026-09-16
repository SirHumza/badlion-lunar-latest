package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HCHRIROHHHCORIOCROOCHRCIOROOCI;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.OIHCOHRCICCCRHRCROOCIOIRRHHHIH;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Predicate;
import lombok.Generated;
import org.jetbrains.annotations.Contract;
import org.jspecify.annotations.Nullable;

public class IHHCHHHCRIHOOCOIOOCRIIICIOROIR
   implements com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IHHCHHHCRIHOOCOIOOCRIIICIOROIR,
   com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RHOCHHIRRCHHHOHOIRROIROHHHIHIO {
   protected final Predicate<String> ICHHHIRCOCCIHOICORRCIHOOIHOHRI;
   protected final LinkedHashSet<HCHRIROHHHCORIOCROOCHRCIOROOCI<?>> RHOOOIHOICHHCIHHOHICOHHCOOCIOR = new LinkedHashSet<>();
   protected final Set<String> CORIHROCIHOIIRCOCHHOHIORICOICC = com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHIHCCICIHOOIOHOIHHROOCCCRHRIH
         == null
      ? new HashSet<>()
      : null;
   protected @Nullable Set<HCHRIROHHHCORIOCROOCHRCIOROOCI<?>> OCHIICHHIHRIIIHOOICIHICORICCOO = com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHIHCCICIHOOIOHOIHHROOCCCRHRIH
         == null
      ? new HashSet<>()
      : null;
   protected JsonObject IHIIOCICOCIROHOICIHIIIOIICIIOR = null;
   private final boolean RHOCCICCCRCHORRIIICCIICORRHRRR;

   @Override
   public Set<HCHRIROHHHCORIOCROOCHRCIOROOCI<?>> HHCIIIIRHRRCHOOCOIRRIROIOOOOOH() {
      return this.RHOOOIHOICHHCIHHOHICOHHCOOCIOR;
   }

   @Contract("-> new")
   @Override
   public Set<HCHRIROHHHCORIOCROOCHRCIOROOCI<?>> CRCOOHOOOCRICHRCCIOCCIRCCOHCRO() {
      LinkedHashSet var1 = new LinkedHashSet();

      for (HCHRIROHHHCORIOCROOCHRCIOROOCI var3 : this.RHOOOIHOICHHCIHHOHICOHHCOOCIOR) {
         var1.add(var3);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, var1x -> {
            var1.add(var1x);
            return false;
         });
      }

      return var1;
   }

   @Contract("-> new")
   @Override
   public Set<HCHRIROHHHCORIOCROOCHRCIOROOCI<?>> CHRHIHHORHROOCCIRRHORICOCRHOHI() {
      Set var1 = this.CRCOOHOOOCRICHRCCIOCCIRCCOHCRO();
      if (this.OCHIICHHIHRIIIHOOICIHICORICCOO != null) {
         var1.addAll(this.OCHIICHHIHRIIIHOOICIHICORICCOO);
      }

      return var1;
   }

   @Override
   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(Predicate<HCHRIROHHHCORIOCROOCHRCIOROOCI<?>> var1) {
      for (HCHRIROHHHCORIOCROOCHRCIOROOCI var3 : this.RHOOOIHOICHHCIHHOHICOHHCOOCIOR) {
         if (var1.test(var3)) {
            return;
         }

         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, var1);
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HCHRIROHHHCORIOCROOCHRCIOROOCI<?> var1, Predicate<HCHRIROHHHCORIOCROOCHRCIOROOCI<?>> var2) {
      for (HCHRIROHHHCORIOCROOCHRCIOROOCI var4 : var1.getChildren()) {
         if (var2.test(var4)) {
            return;
         }

         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var2);
      }
   }

   @Override
   public void CRICCOOHHHCHOORCICOCOHIHOIRHOO(com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      this.RHOOOIHOICHHCIHHOHICOHHCOOCIOR.clear();
      this.RHOOOIHOICHHCIHHOHICOHHCOOCIOR.addAll(this.IIRHCHHOICHRICOOCRORCCIOOIHOIR(var1));
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         var1x -> {
            if (var1x instanceof OIHCOHRCICCCRHRCROOCIOIRRHHHIH
               && !var1x.ICICIOCHHHIHOCHCOHORIHRCOHHOCR(
                  com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRRIRICROIIHIICICIRCOHCCHROIRI
               )) {
               var1x.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRRIRICROIIHIICICIRCOHCCHROIRI,
                  com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IIOIROIHIHHCCRICRCOOCHIICHRCOI(
                     var1
                  )
               );
            }

            return false;
         }
      );
   }

   protected com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH OCIHIIHHIHRHHROOOOORCIHHIOHCOC() {
      return new com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH::new
      );
   }

   protected Set<HCHRIROHHHCORIOCROOCHRCIOROOCI<?>> IIRHCHHOICHRICOOCRORCCIOOIHOIR(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 = this.OCIHIIHHIHRHHROOOOORCIHHIOHCOC();
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2);
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2);
      return com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var2.OCRHIOHCOIRRORRCRIRICOIHCCOHRC(),
         var2.OIHCOHRCICCCRHRCROOCIOIRRHHHIH(
            var1.getId(), com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHRRICCIOIHROCCOIIORROIROCIIOR
         ),
         com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHIHCCICIHOOIOHOIHHROOCCCRHRIH
            == null,
         var1x -> {
            this.CORIHROCIHOIIRCOCHHOHIORICOICC.add(var1x.getId());
            if (this.OCHIICHHIHRIIIHOOICIHICORICCOO != null) {
               this.OCHIICHHIHRIIIHOOICIHICORICCOO.add(var1x);
            }
         }
      );
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2
   ) {
      for (Object var4 : var1.IOHRRIHCHOCOROCCHIRHORCRICRHRR().values()) {
         if (var4 instanceof com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5) {
            var5.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2);
         }
      }
   }

   @Override
   public void load(JsonObject var1) {
      JsonElement var2 = var1.get("options");
      JsonObject var3 = var2 != null && !var2.isJsonNull() ? var2.getAsJsonObject() : new JsonObject();
      Set var4 = this.CRCOOHOOOCRICHRCCIOCCIRCCOHCRO();
      HashSet var5 = new HashSet();

      for (HCHRIROHHHCORIOCROOCHRCIOROOCI var7 : this.CRCOOHOOOCRICHRCCIOCCIRCCOHCRO()) {
         try {
            var7.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var3, this.RHOCCICCCRCHORRIIICCIICORRHRRR);
            var5.add(var7.getId());
         } catch (Exception var11) {
            var11.printStackTrace();
         }
      }

      for (HCHRIROHHHCORIOCROOCHRCIOROOCI var8 : this.CRCOOHOOOCRICHRCCIOCCIRCCOHCRO()) {
         if (!var4.contains(var8)) {
            try {
               var8.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var3, this.RHOCCICCCRCHORRIIICCIICORRHRRR);
               var5.add(var8.getId());
            } catch (Exception var10) {
               var10.printStackTrace();
            }
         }
      }

      JsonObject var14 = new JsonObject();

      for (String var9 : var3.keySet()) {
         if (!var5.contains(var9) && (this.CORIHROCIHOIIRCOCHHOHIORICOICC.contains(var9) || this.ICHHHIRCOCCIHOICORRCIHOOIHOHRI.test(var9))) {
            var14.add(var9, var3.get(var9));
         }
      }

      this.IHIIOCICOCIROHOICIHIIIOIICIIOR = var14.isEmpty() ? null : var14;
      if (this.OCHIICHHIHRIIIHOOICIHICORICCOO != null) {
         this.OCHIICHHIHRIIIHOOICIHICORICCOO.clear();
         this.OCHIICHHIHRIIIHOOICIHICORICCOO = null;
      }
   }

   @Override
   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(JsonObject var1) {
      JsonObject var2 = new JsonObject();
      HashSet var3 = this.IHIIOCICOCIROHOICIHIIIOIICIIOR == null ? null : new HashSet();

      for (HCHRIROHHHCORIOCROOCHRCIOROOCI var5 : this.CRCOOHOOOCRICHRCCIOCCIRCCOHCRO()) {
         var5.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var2);
         if (var3 != null) {
            var3.add(var5.getId());
         }
      }

      if (this.IHIIOCICOCIROHOICIHIIIOIICIIOR != null) {
         for (Entry var7 : this.IHIIOCICOCIROHOICIHIIIOIICIIOR.entrySet()) {
            if (var3 == null || !var3.contains(var7.getKey())) {
               var2.add((String)var7.getKey(), (JsonElement)var7.getValue());
            }
         }
      }

      if (!var2.entrySet().isEmpty()) {
         var1.add("options", var2);
      }
   }

   @Override
   public int priority() {
      return 200;
   }

   @Generated
   public IHHCHHHCRIHOOCOIOOCRIIICIOROIR(Predicate<String> var1, boolean var2) {
      this.ICHHHIRCOCCIHOICORRCIHOOIHOHRI = var1;
      this.RHOCCICCCRCHORRIIICCIICORRHRRR = var2;
   }
}
