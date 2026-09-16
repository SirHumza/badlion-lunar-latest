package com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.common.collect.Sets;
import com.google.protobuf.Message;
import com.lunarclient.apollo.option.Option;
import com.lunarclient.apollo.option.Options;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import lombok.Generated;

public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   private final List<com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> ROHCIRRIRIRRHHCOOHHIRORRIHOORR = new ArrayList<>();
   private boolean enabled;
   private Options options = Options.empty();
   private final String ROHOCRIOIOHRICRRHCRCRRRIOCOCRR;
   private final String CRICCIOICHOOOOCOHROROORIORHRHI;

   protected RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, String var2) {
      this.ROHOCRIOIOHRICRRHCRCRRRIOCOCRR = var1;
      this.CRICCIOICHOOOOCOHROROORIORHRHI = var2;
   }

   public Collection<Option<?, ?, ?>> IOHHOCRCCCIRHRCORCRCCCOCIOCCRH() {
      return Collections.emptyList();
   }

   public Set<Class<? extends Message>> CRCHOOOCICHCRCCCCRORHRICCOCHCI() {
      return Sets.newHashSet();
   }

   public void enable() {
      if (!this.enabled) {
         this.enabled = true;
         Collection var1 = this.IOHHOCRCCCIRHRCORCRCCCOCIOCCRH();
         if (!var1.isEmpty()) {
            this.options = new com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
         }

         this.onEnable();
         this.IOOCRRRIHHHRHROIIHOOIHROHRRIRI();
      }
   }

   protected void onEnable() {
   }

   public void disable() {
      if (this.enabled) {
         this.enabled = false;
         this.options = new com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            Collections.emptyList()
         );
         this.onDisable();
         this.RHOCICCROICIHRRIIHRRIORRHOHIHC();
      }
   }

   protected void onDisable() {
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
   }

   @Override
   public <T extends IRCIIHHICIHRCOCRROCOICRIHHCCHH> void handle(Class<T> var1, Consumer<T> var2) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, -1);
   }

   @Override
   public <T extends IRCIIHHICIHRCOCRROCOICRIHHCCHH> void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Class<T> var1, Consumer<T> var2, int var3) {
      com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = new com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var1, var2, var3
      );
      this.ROHCIRRIRIRRHHCOOHHIRORRIHOORR.add(var4);
      if (this.enabled) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4);
      }
   }

   protected void sendPacket(Message var1) {
      IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .CIRCCCHCCCROROIIOIHIOROIHCHRCH()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, this.ROHOCRIOIOHRICRRHCRCRRRIOCOCRR);
   }

   private void IOOCRRRIHHHRHROIIHOOIHROHRRIRI() {
      for (com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 : this.ROHCIRRIRIRRHHCOOHHIRORRIHOORR) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2);
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      if (var1.priority() == -1) {
         HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1.HHHRHCIHRICCHOCRIICIOOCHROOCHC(), var1.COIOHCOCOHIRRRRRCCIHRRCICOCOII());
      } else {
         HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1.HHHRHCIHRICCHOCRIICIOOCHROOCHC(), var1.COIOHCOCOHIRRRRRCCIHRRCICOCOII(), var1.priority());
      }
   }

   private void RHOCICCROICIHRRIIHRRIORRHOHIHC() {
      for (com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 : this.ROHCIRRIRIRRHHCOOHHIRORRIHOORR) {
         HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .CRRRICCRROCOHHOHIICIHORCOORRRH(var2.HHHRHCIHRICCHOCRIICIOOCHROOCHC(), var2.COIOHCOCOHIRRRRRCCIHRRCICOCOII());
      }
   }

   @Generated
   public boolean isEnabled() {
      return this.enabled;
   }

   @Generated
   public Options getOptions() {
      return this.options;
   }

   @Generated
   public void setOptions(Options var1) {
      this.options = var1;
   }

   @Generated
   public String getId() {
      return this.ROHOCRIOIOHRICRRHCRCRRRIOCOCRR;
   }

   @Generated
   public String getName() {
      return this.CRICCIOICHOOOOCOHROROORIORHRHI;
   }

   private record RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T extends IRCIIHHICIHRCOCRROCOICRIHHCCHH>() {
      private final Class<T> CCHRCOHOCCROCHIOHRHICIIRCRCICC;
      private final Consumer<T> consumer;
      private final int OHHROORCIRIRORCHOOOHOCCHHHHCHH;

      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Class<T> var1, Consumer<T> var2, int var3) {
         this.CCHRCOHOCCROCHIOHRHICIIRCRCICC = var1;
         this.consumer = var2;
         this.OHHROORCIRIRORCHOOOHOCCHHHHCHH = var3;
      }

      public Class<T> HHHRHCIHRICCHOCRIICIOOCHROOCHC() {
         return this.CCHRCOHOCCROCHIOHRHICIIRCRCICC;
      }

      public Consumer<T> COIOHCOCOHIRRRRRCCIHRRCICOCOII() {
         return this.consumer;
      }

      public int priority() {
         return this.OHHROORCIRIRORCHOOOHOCCHHHHCHH;
      }
   }
}
