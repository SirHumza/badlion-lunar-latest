package com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRICCOOHHHCHOORCICOCOHIHOIRHOO;
import com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI;
import com.moonsworth.lunar.ichor.util.FatalIchorError;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.nio.file.Path;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.cadixdev.bombe.analysis.InheritanceProvider;
import org.cadixdev.lorenz.MappingSet;
import org.cadixdev.lorenz.io.MappingsWriter;
import org.objectweb.asm.tree.ClassNode;

public class HRCHROOHRIHCRCRHRIIROCIRHOIRHH extends RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<HICHRCOHCCRHOHCICOOCHOIHCCHIRI> {
   private CRICCOOHHHCHOORCICOCOHIHOIRHOO<HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH, com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO> RHOIHHRHHHOHCIIOIOCRHIOIRRRHHI;
   private MappingSet IOIOHIORIROHRRCOOOHCROHORCOIIH;
   private final AtomicBoolean IRRCROOOIIHRIIHHRRIOCOCHRCIIRI = new AtomicBoolean(false);
   private final AtomicBoolean HHRHIIOICCIIIHCROIOIIIRIHCCOCR = new AtomicBoolean(false);
   private Function<String, Boolean> RRIHRHCIIORCRIHICHOIHCCIORCIRO = null;

   public HRCHROOHRIHCRCRHRIIROCIRHOIRHH(HICHRCOHCCRHOHCICOOCHOIHCCHIRI var1, com.moonsworth.lunar.ichor.CRRRICCRROCOHHOHIICIHORCOORRRH var2, Method var3) {
      super(var1, var2, var3);
      if (!var1.CCCIROHORHHCRCCOIRHRRCOIROOCRH()) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2.IHIRRIIORRHORHRORIHOROIRCORCOO(), null);
      }
   }

   private synchronized void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.ichor.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1, @Nullable com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2
   ) {
      try {
         if (!this.IRRCROOOIIHRIIHHRRIOCOCHRCIIRI.getAcquire() && !this.HHRHIIOICCIIIHCROIOIIIRIHCCOCR.getAcquire()) {
            long var3 = System.currentTimeMillis();
            String var5 = this.RCIOHHIOOCOHROCCIRICHHIHIRCHRH.getDeclaringClass().getName() + "." + this.RCIOHHIOOCOHROCCIRICHHIHIRCHRH.getName();
            Path var6 = var1.OIHCRHOORHCHRCOIRHIIROROCHIOOO();
            Object var7 = null;
            HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var8 = null;
            if (!this.IRRCROOOIIHRIIHHRRIOCOCHRCIIRI.getAcquire()) {
               Object var9 = null;
               if (this.ROOCHRCRIHOOOHIHCRRRRHIOIHORHI.CCCIROHORHHCRCCOIRHRRCOIROOCRH() && this.RCIOHHIOOCOHROCCIRICHHIHIRCHRH.getParameterTypes().length > 0) {
                  var9 = this.RCIOHHIOOCOHROCCIRICHHIHIRCHRH.invoke(this.RROIORRRCCCIRIOHCRHCHCCRCIHHIH.RHIRRIRRHCIRIRICORCOHHHCHOOOCR(), var2);
               } else {
                  var9 = this.RCIOHHIOOCOHROCCIRICHHIHIRCHRH.invoke(this.RROIORRRCCCIRIOHCRHCHCCRCIHHIH.RHIRRIRRHCIRIRICORCOHHHCHOOOCR());
               }

               if (var9 == null) {
                  this.HHRHIIOICCIIIHCROIOIIIRIHCCOCR.setRelease(true);
                  return;
               }

               long var10 = System.currentTimeMillis() - var3;
               if (var10 > 200L) {
                  com.moonsworth.lunar.ichor.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CHOCCCRCHIOCCOOICCOHOOIHROHIHI
                     .info("Built mapping set for " + var5 + " " + var10 + "ms on thread " + Thread.currentThread().getName());
               }

               if (var9 instanceof HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var13) {
                  this.RRIHRHCIIORCRIHICHOIHCCIORCIRO = var13.ROCHHRIIHHOOCHIICRHOICOCCRHROC;
                  this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var13.IHCRCRIHRHHHRROCHCCCCIHIHOHRII);
                  if (var7 != null) {
                     try (MappingsWriter var15 = com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IIRORROHOCCHCICCCRIRCHRHROCIIC
                           .createWriter(new FileOutputStream(var7.toFile()))) {
                        var15.write(var13.IHCRCRIHRHHHRROCHCCCCIHIHOHRII);
                     }
                  }

                  var8 = var13.HIRROHRRHORIOOOHIHCIRIIHHCCIOH;
               } else if (var9 instanceof MappingSet var14) {
                  this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var14);
                  if (var7 != null) {
                     try (MappingsWriter var26 = com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IIRORROHOCCHCICCCRIRCHRHROCIIC
                           .createWriter(new FileOutputStream(var7.toFile()))) {
                        var26.write(var14);
                     }
                  }
               } else {
                  if (!(var9 instanceof com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var12)) {
                     throw new IllegalStateException("RemapNectarHandler(" + this.RCIOHHIOOCOHROCCIRICHHIHIRCHRH.getName() + ") didn't return a MappingSet!");
                  }

                  this.RROIORRRCCCIRIOHCRHCHCCRCIHHIH.HRRICOIHHHHOIIIIIHIIORROICRIIC().add(var12);
               }
            }

            final HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var24 = var8;
            com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var25 = new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH, com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO>(
               
            ) {
               public com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1
               ) {
                  InheritanceProvider var2x;
                  if (HRCHROOHRIHCRCRHRIIROCIRHOIRHH.this.ROOCHRCRIHOOOHIHCRRRRHIOIHORHI.HRHRCHHHOOHCOOIIIRROHOCCRCCORC()) {
                     var2x = new com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(
                        var1.HOIIROOIIIIHCRIOOORORIROHRCORC, HRCHROOHRIHCRCRHRIIROCIRHOIRHH.this.IOIOHIORIROHRRCOOOHCROHORCOIIH, var24
                     );
                  } else {
                     var2x = var1.HOIIROOIIIIHCRIOOORORIROHRCORC;
                  }

                  return new com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
                     HRCHROOHRIHCRCRHRIIROCIRHOIRHH.this.RROIORRRCCCIRIOHCRHCHCCRCIHHIH,
                     HRCHROOHRIHCRCRHRIIROCIRHOIRHH.this.IOIOHIORIROHRRCOOOHCROHORCOIIH,
                     var2x,
                     HRCHROOHRIHCRCRHRIIROCIRHOIRHH.this.ROOCHRCRIHOOOHIHCRRRRHIOIHORHI.IHOOICIHHROORHIHHORHIOROCHRCHH(),
                     HRCHROOHRIHCRCRHRIIROCIRHOIRHH.this.ROOCHRCRIHOOOHIHCRRRRHIOIHORHI.HHOOCHRORRHHRIIIHHCHCOIHIOOCCC()
                  );
               }
            };
            this.RHOIHHRHHHOHCIIOIOCRHIOIRRRHHI = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.OHRCCIIHCHIIRORORRICRHOIOOCHRH()
               .RICHHRCCHRIICHROOROCCICOIRRHCR(20L)
               .ICIIRHHIHRHOCRHHHROHHCHCHRIICR()
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(10L, TimeUnit.SECONDS)
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var25);
            this.IRRCROOOIIHRIIHHRRIOCOCHRCIIRI.setRelease(true);
         }
      } catch (Throwable var22) {
         throw var22;
      }
   }

   private synchronized void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(MappingSet var1) {
      String var2 = this.RCIOHHIOOCOHROCCIRICHHIHIRCHRH.getDeclaringClass().getName() + "." + this.RCIOHHIOOCOHROCCIRICHHIHIRCHRH.getName();
      if (var1.getTopLevelClassMappings().isEmpty()) {
         String var3 = "MappingSet for " + var2 + " has 0 top level class mappings.";
         if (!this.ROOCHRCRIHOOOHIHCRRRRHIOIHORHI.optional()) {
            throw new FatalIchorError(var3);
         }

         com.moonsworth.lunar.ichor.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CHOCCCRCHIOCCOOICCOHOOIHROHIHI.warn(var3);
      }

      if (var1.getTopLevelClassMappings().stream().flatMap(var0 -> var0.getFieldMappings().stream()).findFirst().isEmpty()) {
         com.moonsworth.lunar.ichor.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CHOCCCRCHIOCCOOICCOHOOIHROHIHI.warn("MappingSet for " + var2 + " has 0 field mappings.");
      }

      if (var1.getTopLevelClassMappings().stream().flatMap(var0 -> var0.getMethodMappings().stream()).findFirst().isEmpty()) {
         com.moonsworth.lunar.ichor.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CHOCCCRCHIOCCOOICCOHOOIHROHIHI.warn("MappingSet for " + var2 + " has 0 method mappings.");
      }

      this.IOIOHIORIROHRRCOOOHCROHORCOIIH = var1;
      if (this.ROOCHRCRIHOOOHIHCRRRRHIOIHORHI.RICRHOOCRRCCRCCHOOHRHHRCOOHCIC()) {
         this.RROIORRRCCCIRIOHCRHCHCCRCIHHIH.CHRHHCIIRCOOIRICHIOHHHROOHIRRO().add(this.IOIOHIORIROHRRCOOOHCROHORCOIIH);
         this.RROIORRRCCCIRIOHCRHCHCCRCIHHIH
            .HRRICOIHHHHOIIIIIHIIORROICRIIC()
            .add(new com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(this.IOIOHIORIROHRRCOOOHCROHORCOIIH));
      }
   }

   @Override
   public boolean HHCCIRHCCCIIRHCROHIORHIRHHIORH(com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1) {
      if (this.IOIOHIORIROHRRCOOOHCROHORCOIIH == null && !this.ROOCHRCRIHOOOHIHCRRRRHIOIHORHI.CCCIROHORHHCRCCOIRHRRCOIROOCRH()) {
         return false;
      }

      com.moonsworth.lunar.ichor.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2 = var1.HCRHICROCOCICCOCCCCHRCCCIORRRH().IHIRRIIORRHORHRORIHOROIRCORCOO();
      if (!this.IRRCROOOIIHRIIHHRRIOCOCHRCIIRI.getAcquire()) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var1.HCRHICROCOCICCOCCCCHRCCCIORRRH());
      }

      if (this.HHRHIIOICCIIIHCROIOIIIRIHCCOCR.getAcquire()) {
         return false;
      }

      if (this.RRIHRHCIIORCRIHICHOIHCCIORCIRO != null && !this.RRIHRHCIIORCRIHICHOIHCCIORCIRO.apply(var1.className())) {
         return false;
      }

      com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = var1.HCRHICROCOCICCOCCCCHRCCCIORRRH();

      try {
         com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO var4 = this.RHOIHHRHHHOHCIIOIOCRHIOIRRRHHI
            .get(new HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(Thread.currentThread(), var3));
         ClassNode var5 = var1.HIHHOCRHHRORRHHRORRRIIHHORIHOC(this.RCIOHHIOOCOHROCCIRICHHIHIRCHRH.getDeclaringClass());
         com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var5, var4);
         if (this.ROOCHRCRIHOOOHIHCRRRRHIOIHORHI.HROIHICIRRCOOOOIHCOCRCCICCICCC()) {
            com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               this.RROIORRRCCCIRIOHCRHCHCCRCIHHIH, var3, var5, this.IOIOHIORIROHRRCOOOHCROHORCOIIH, var4
            );
         }

         return true;
      } catch (Throwable var6) {
         throw new FatalIchorError("Failed to remap " + var1.className(), var6);
      }
   }

   public record HHCCIRHCCCIIRHCROHIORHIRHHIORH() {
      private final Thread HCCICIICRRHCOCRCOHIORRHIIHRIRC;
      private final com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH HOIIROOIIIIHCRIOOORORIROHRCORC;

      public HHCCIRHCCCIIRHCROHIORHIRHHIORH(Thread var1, com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2) {
         this.HCCICIICRRHCOCRCOHIORRHIIHRIRC = var1;
         this.HOIIROOIIIIHCRIOOORORIROHRCORC = var2;
      }

      public Thread OCRHCICCRCIHHOHROHROROHROHCIRR() {
         return this.HCCICIICRRHCOCRCOHIORRHIIHRIRC;
      }

      public com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH HICRCCRCORCCIROHHCCOOCCIHOIHCC() {
         return this.HOIIROOIIIIHCRIOOORORIROHRCORC;
      }
   }

   public record IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
      private final MappingSet IHCRCRIHRHHHRROCHCCCCIHIHOHRII;
      private final Function<String, Boolean> ROCHHRIIHHOOCHIICRHOICOCCRHROC;
      private final HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HIRROHRRHORIOOOHIHCIRIIHHCCIOH;

      public IRCIIHHICIHRCOCRROCOICRIHHCCHH(MappingSet var1, Function<String, Boolean> var2) {
         this(var1, var2, null);
      }

      public IRCIIHHICIHRCOCRROCOICRIHHCCHH(MappingSet var1, Function<String, Boolean> var2, HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3) {
         this.IHCRCRIHRHHHRROCHCCCCIHIHOHRII = var1;
         this.ROCHHRIIHHOOCHIICRHOICOCCRHROC = var2;
         this.HIRROHRRHORIOOOHIHCIRIIHHCCIOH = var3;
      }

      public MappingSet RCIROOOOICRHCCRRCIORHHIRCOIIIC() {
         return this.IHCRCRIHRHHHRROCHCCCCIHIHOHRII;
      }

      public Function<String, Boolean> HIHIHHRROCIIIOCHHIHHOHICHOIICC() {
         return this.ROCHHRIIHHOOCHIICRHOICOCCRHROC;
      }

      public HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IIICCOIICHRHCOHRCCORCCICHIRICH() {
         return this.HIRROHRRHORIOOOHIHCIRIIHHCCIOH;
      }
   }

   @FunctionalInterface
   public interface RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      @Nullable
      InheritanceProvider.ClassInfo fix(InheritanceProvider var1, String var2, @Nullable InheritanceProvider.ClassInfo var3);
   }
}
