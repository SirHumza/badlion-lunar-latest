package com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import javax.annotation.Nullable;
import lombok.Generated;
import org.jetbrains.annotations.Contract;
import org.objectweb.asm.signature.SignatureReader;
import org.objectweb.asm.signature.SignatureVisitor;

public class HRCHROOHRIHCRCRHRIIROCIRHOIRHH extends SignatureVisitor {
   private HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HHOIRCROOIRHOCRIHICIOIRRIROIHC = HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.NONE;
   private Stack<OOROOCCIRCCRHOIOIORIHCHHOOCCOR> stack = null;
   private OOROOCCIRCCRHOIOIORIHCHHOOCCOR OORROOCIIICIHIRICCRCOCOIHIRIHC = null;
   private HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH RCOCOROIIHCRCHIIORIOICCIHIRIOR = null;
   private final List<HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH> CRHOHICHRRHROCOCHHRHHRICRCIHII = new ArrayList<>();
   private List<OOROOCCIRCCRHOIOIORIHCHHOOCCOR> CIHOHOOOCIIRROICHHCHHCIHOCRICO;
   private final Map<String, HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> OHORORICHRHCCRHRHOORIIRHOCHIIR = new LinkedHashMap<>(4);
   private final List<OOROOCCIRCCRHOIOIORIHCHHOOCCOR> CHHOIORCOCCCORCIIOHIHOCHCICHCI = new ArrayList<>();
   private OOROOCCIRCCRHOIOIORIHCHHOOCCOR RCRIIOCRCOOIROOHHOOOIORHRRCHHR = null;
   private OOROOCCIRCCRHOIOIORIHCHHOOCCOR RIHROHIORHHRIHIROORCIRCIIOOCII = null;
   private final List<OOROOCCIRCCRHOIOIORIHCHHOOCCOR> ORIHOIRIIRRHIOIROHHRROCHIOHHII = new ArrayList<>();

   @Nullable
   @Contract("!null, _, _ -> !null")
   public static RIOOCHICIHRHOHCCCCCHOCCCOHCRHI RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      String var0, @Nullable String var1, @Nullable OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
   ) {
      if (var0 == null) {
         return null;
      }

      HRCHROOHRIHCRCRHRIIROCIRHOIRHH var3 = new HRCHROOHRIHCRCRHRIIROCIRHOIRHH();
      if (var1 != null) {
         if (var2 != null) {
            var3.CIHOHOOOCIIRROICHHCHHCIHOCRICO = var2.getParams();
         }

         new SignatureReader(var1).accept(var3);
      }

      try {
         SignatureReader var4 = new SignatureReader(var0);
         var4.accept(var3);
         return var3.IOHHHCCOHICOOHCHCROCIHRRIHCORR();
      } catch (Exception var5) {
         throw new IllegalArgumentException("Invalid method signature: " + var0, var5);
      }
   }

   @Nullable
   @Contract("!null, _, _ -> !null")
   public static OOROOCCIRCCRHOIOIORIHCHHOOCCOR IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      String var0, @Nullable String var1, @Nullable OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
   ) {
      if (var0 == null) {
         return null;
      }

      HRCHROOHRIHCRCRHRIIROCIRHOIRHH var3 = new HRCHROOHRIHCRCRHRIIROCIRHOIRHH();
      if (var1 != null) {
         if (var2 != null) {
            var3.CIHOHOOOCIIRROICHHCHHCIHOCRICO = var2.getParams();
         }

         new SignatureReader(var1).accept(var3);
      }

      SignatureReader var4 = new SignatureReader(var0);
      var3.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RETURN);

      try {
         var4.acceptType(var3);
         var3.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.NONE);
         return var3.RCRIIOCRCOOIROOHHOOOIORHRRCHHR;
      } catch (Exception var6) {
         throw new IllegalArgumentException("Invalid type signature: " + var0, var6);
      }
   }

   @Nullable
   @Contract("!null, _, _ -> !null")
   public static RRCRRCORICCHOHHIRCHIROOHIIOHCO HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      String var0, @Nullable String var1, @Nullable OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
   ) {
      if (var0 == null) {
         return null;
      }

      HRCHROOHRIHCRCRHRIIROCIRHOIRHH var3 = new HRCHROOHRIHCRCRHRIIROCIRHOIRHH();
      if (var1 != null) {
         if (var2 != null) {
            var3.CIHOHOOOCIIRROICHHCHHCIHOCRICO = var2.getParams();
         }

         new SignatureReader(var1).accept(var3);
      }

      SignatureReader var4 = new SignatureReader(var0);

      try {
         var4.accept(var3);
         return var3.RCHCHCOHCOIHRCCHHRCCHRHHOIHHCO();
      } catch (Exception var6) {
         throw new IllegalArgumentException("Invalid class signature: " + var0, var6);
      }
   }

   public HRCHROOHRIHCRCRHRIIROCIRHOIRHH() {
      super(589824);
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = this.HHOIRCROOIRHOCRIHICIOIRRIROIHC;
      switch (var2) {
         case CLASS_BOUND:
            this.RCOCOROIIHCRCHIIORIOICCIHIRIOR.CRCCIIOHHICCROIRCICCCCOHCCRROC = this.OORROOCIIICIHIRICCRCOCOIHIRIHC;
            break;
         case INTERFACE_BOUND:
            this.RCOCOROIIHCRCHIIORIOICCIHIRIOR.IIROCHHIROOCCHCHRIIHCCCOORHRIH.add(this.OORROOCIIICIHIRICCRCOCOIHIRIHC);
            break;
         case PARAM:
            this.CHHOIORCOCCCORCIIOHIHOCHCICHCI.add(this.OORROOCIIICIHIRICCRCOCOIHIRIHC);
            break;
         case RETURN:
            this.RCRIIOCRCOOIROOHHOOOIORHRRCHHR = this.OORROOCIIICIHIRICCRCOCOIHIRIHC;
            break;
         case SUPERCLASS:
            this.RIHROHIORHHRIHIROORCIRCIIOOCII = this.OORROOCIIICIHIRICCRCOCOIHIRIHC;
            break;
         case INTERFACE:
            this.ORIHOIRIIRRHIOIROHHRROCHIOHHII.add(this.OORROOCIIICIHIRICCRCOCOIHIRIHC);
      }

      this.OORROOCIIICIHIRICCRCOCOIHIRIHC = null;
      this.stack = null;
      this.HHOIRCROOIRHOCRIHICIOIRRIROIHC = var1;
   }

   public RIOOCHICIHRHOHCCCCCHOCCCOHCRHI IOHHHCCOHICOOHCHCROCIHRRIHCORR() {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.NONE);
      this.CRHOHICHRRHROCOCHHRHHRICRCIHII.forEach(HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH::resolve);
      return new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.CHHOIORCOCCCORCIIOHIHOCHCICHCI, this.RCRIIOCRCOOIROOHHOOOIORHRRCHHR);
   }

   public RRCRRCORICCHOHHIRCHIROOHIIOHCO RCHCHCOHCOIHRCCHHRCCHRHHOIHHCO() {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.NONE);
      return new RRCRRCORICCHOHHIRCHIROOHIIOHCO(this.OHORORICHRHCCRHRHOORIIRHOCHIIR, this.RIHROHIORHHRIHIROORCIRCIIOOCII, this.ORIHOIRIIRRHIOIROHHRROCHIOHHII);
   }

   @Override
   public void visitFormalTypeParameter(String var1) {
      int var2 = this.OHORORICHRHCCRHRHOORIIRHOCHIIR.size();
      OOROOCCIRCCRHOIOIORIHCHHOOCCOR var3 = null;
      if (this.CIHOHOOOCIIRROICHHCHHCIHOCRICO != null && this.CIHOHOOOCIIRROICHHCHHCIHOCRICO.size() > var2) {
         var3 = this.CIHOHOOOCIIRROICHHCHHCIHOCRICO.get(var2);
      }

      HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 = new HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var3);
      this.OHORORICHRHCCRHRHOORIIRHOCHIIR.put(var4.CIHOIIIOOIORRRORCOOCCHCIIHRCHI, var4);
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.TYPE_PARAMETER);
      this.RCOCOROIIHCRCHIIORIOICCIHIRIOR = var4;
   }

   @Override
   public SignatureVisitor visitClassBound() {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CLASS_BOUND);
      return this;
   }

   @Override
   public SignatureVisitor visitInterfaceBound() {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.INTERFACE_BOUND);
      return this;
   }

   @Override
   public SignatureVisitor visitSuperclass() {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.SUPERCLASS);
      return this;
   }

   @Override
   public SignatureVisitor visitInterface() {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.INTERFACE);
      return this;
   }

   @Override
   public SignatureVisitor visitParameterType() {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.PARAM);
      return this;
   }

   @Override
   public SignatureVisitor visitReturnType() {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RETURN);
      return this;
   }

   @Override
   public SignatureVisitor visitExceptionType() {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.NONE);
      return this;
   }

   @Override
   public void visitBaseType(char var1) {
      if (this.HHOIRCROOIRHOCRIHICIOIRRIROIHC != HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.NONE) {
         if (this.OORROOCIIICIHIRICCRCOCOIHIRIHC instanceof com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CRRRICCRROCOHHOHIICIHORCOORRRH var2
            && var2.HRIICHCROOORCICCHIHRCCOHRCHHRC == null) {
            var2.HRIICHCROOORCICCHIHRCCOHRCHHRC = new OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
               new com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1)
            );
         } else {
            this.OORROOCIIICIHIRICCRCOCOIHIRIHC = new OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
               new com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1)
            );
         }
      }
   }

   @Override
   public SignatureVisitor visitArrayType() {
      if (this.HHOIRCROOIRHOCRIHICIOIRRIROIHC != HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.NONE) {
         if (this.OORROOCIIICIHIRICCRCOCOIHIRIHC instanceof com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CRRRICCRROCOHHOHIICIHORCOORRRH var1) {
            var1.depth++;
         } else {
            this.OORROOCIIICIHIRICCRCOCOIHIRIHC = new com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CRRRICCRROCOHHOHIICIHORCOORRRH();
         }
      }

      return this;
   }

   @Override
   public void visitClassType(String var1) {
      if (this.HHOIRCROOIRHOCRIHICIOIRRIROIHC != HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.NONE) {
         com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = new com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            var1
         );
         if (this.OORROOCIIICIHIRICCRCOCOIHIRIHC instanceof com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CRRRICCRROCOHHOHIICIHORCOORRRH var3
            && var3.HRIICHCROOORCICCHIHRCCOHRCHHRC == null) {
            var3.HRIICHCROOORCICCHIHRCCOHRCHHRC = new OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var2);
         } else {
            this.OORROOCIIICIHIRICCRCOCOIHIRIHC = new OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var2);
         }
      }
   }

   @Override
   public void visitTypeVariable(String var1) {
      if (this.HHOIRCROOIRHOCRIHICIOIRRIROIHC != HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.NONE) {
         HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = new HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1);
         if (this.OORROOCIIICIHIRICCRCOCOIHIRIHC instanceof com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CRRRICCRROCOHHOHIICIHORCOORRRH var3
            && var3.HRIICHCROOORCICCHIHRCCOHRCHHRC == null) {
            var3.HRIICHCROOORCICCHIHRCCOHRCHHRC = var2;
         } else if (this.OORROOCIIICIHIRICCRCOCOIHIRIHC != null) {
            this.OORROOCIIICIHIRICCRCOCOIHIRIHC.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var2);
            if (this.stack != null && this.stack.peek() == this.OORROOCIIICIHIRICCRCOCOIHIRIHC) {
               this.stack.pop();
            }
         } else {
            this.OORROOCIIICIHIRICCRCOCOIHIRIHC = var2;
         }
      }
   }

   @Override
   public void visitInnerClassType(String var1) {
   }

   @Override
   public void visitTypeArgument() {
      if (this.HHOIRCROOIRHOCRIHICIOIRRIROIHC != HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.NONE
         && this.OORROOCIIICIHIRICCRCOCOIHIRIHC != null) {
         this.OORROOCIIICIHIRICCRCOCOIHIRIHC.HHCCIRHCCCIIRHCROHIORHIRHHIORH(new CORCOCICIRIOHROHROIIOOHICCHCRR());
         if (this.stack != null && !this.stack.isEmpty() && this.stack.peek() == this.OORROOCIIICIHIRICCRCOCOIHIRIHC) {
            this.stack.pop();
         }
      }
   }

   @Override
   public SignatureVisitor visitTypeArgument(char var1) {
      if (this.HHOIRCROOIRHOCRIHICIOIRRIROIHC != HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.NONE
         && this.OORROOCIIICIHIRICCRCOCOIHIRIHC != null) {
         if (this.stack == null) {
            this.stack = new Stack<>();
         }

         this.stack.push(this.OORROOCIIICIHIRICCRCOCOIHIRIHC);
      }

      return this;
   }

   @Override
   public void visitEnd() {
      if (this.stack != null && !this.stack.isEmpty()) {
         OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1 = this.stack.pop();
         if (this.OORROOCIIICIHIRICCRCOCOIHIRIHC != null) {
            var1.HHCCIRHCCCIIRHCROHIORHIRHHIORH(this.OORROOCIIICIHIRICCRCOCOIHIRIHC);
         }

         this.OORROOCIIICIHIRICCRCOCOIHIRIHC = var1;
      }
   }

   record CRRRICCRROCOHHOHIICIHORCOORRRH() implements CRICCOOHHHCHOORCICOCOHIHOIRHOO {
      private final String HIHCIOOCRRIOOCIOHOOIHROOORIIOR;

      CRRRICCRROCOHHOHIICIHORCOORRRH(String var1) {
         this.HIHCIOOCRRIOOCIOHOOIHROOORIIOR = var1;
      }

      @Override
      public String getDescriptor() {
         return "T" + this.HIHCIOOCRRIOOCIOHOOIHROOORIIOR + ";";
      }

      public String name() {
         return this.HIHCIOOCRRIOOCIOHOOIHROOORIIOR;
      }
   }

   public class HHCCIRHCCCIIRHCROHIORHIRHHIORH extends OOROOCCIRCCRHOIOIORIHCHHOOCCOR {
      public final String RHOCROICRCHCIHHCROIHHCIOIROHII;

      public HHCCIRHCCCIIRHCROHIORHIRHHIORH(String var2) {
         super(new HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRRRICCRROCOHHOHIICIHORCOORRRH(var2));
         this.RHOCROICRCHCIHHCROIHHCIOIROHII = var2;
         HRCHROOHRIHCRCRHRIIROCIRHOIRHH.this.CRHOHICHRRHROCOCHHRHHRICRCIHII.add(this);
      }

      public void resolve() {
         if (this.RRCHCIHRHIIOCICCRRRIROOCIRHOOR instanceof HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRRRICCRROCOHHOHIICIHORCOORRRH) {
            HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1 = HRCHROOHRIHCRCRHRIIROCIRHOIRHH.this.OHORORICHRHCCRHRHOORIIRHOCHIIR
               .get(this.RHOCROICRCHCIHHCROIHHCIOIROHII);
            if (var1 == null) {
               this.RRCHCIHRHIIOCICCRRRIROOCIRHOOR = new HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRRRICCRROCOHHOHIICIHORCOORRRH(this.RHOCROICRCHCIHHCROIHHCIOIROHII);
            } else {
               OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2 = var1.HOCHCICCCOCOHCHHIRROHORCORHOOH();
               if (var2 == null) {
                  this.RRCHCIHRHIIOCICCRRRIROOCIRHOOR = new HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRRRICCRROCOHHOHIICIHORCOORRRH(this.RHOCROICRCHCIHHCROIHHCIOIROHII);
               } else {
                  if (var2 instanceof HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var3) {
                     var3.resolve();
                  }

                  this.RRCHCIHRHIIOCICCRRRIROOCIRHOOR = var2.RRCHCIHRHIIOCICCRRRIROOCIRHOOR;
                  this.params = var2.params == null ? null : new ArrayList<>(var2.params);
               }
            }
         }
      }
   }

   public static class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
      public final String CIHOIIIOOIORRRORCOOCCHCIIHRCHI;
      @Nullable
      public final OOROOCCIRCCRHOIOIORIHCHHOOCCOR COCHCORRROOOIOHIRRCRRCIOCIIRIC;
      @Nullable
      public OOROOCCIRCCRHOIOIORIHCHHOOCCOR CRCCIIOHHICCROIRCICCCCOHCCRROC = null;
      public final List<OOROOCCIRCCRHOIOIORIHCHHOOCCOR> IIROCHHIROOCCHCHRIIHCCCOORHRIH = new ArrayList<>();

      public IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var1, @Nullable OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2) {
         this.CIHOIIIOOIORRRORCOOCCHCIIHRCHI = var1;
         this.COCHCORRROOOIOHIRRCRRCIOCIIRIC = var2;
      }

      public OOROOCCIRCCRHOIOIORIHCHHOOCCOR HOCHCICCCOCOHCHHIRROHORCORHOOH() {
         return this.COCHCORRROOOIOHIRRCRRCIOCIIRIC != null
            ? this.COCHCORRROOOIOHIRRCRRCIOCIIRIC
            : (
               this.CRCCIIOHHICCROIRCICCCCOHCCRROC != null
                  ? this.CRCCIIOHHICCROIRCICCCCOHCCRROC
                  : (!this.IIROCHHIROOCCHCHRIIHCCCOORHRIH.isEmpty() ? this.IIROCHHIROOCCHCHRIIHCCCOORHRIH.get(0) : null)
            );
      }

      @Override
      public String toString() {
         return this.CIHOIIIOOIORRRORCOOCCHCIIHRCHI + ":" + this.COCHCORRROOOIOHIRRCRRCIOCIIRIC;
      }

      @Generated
      @Override
      public boolean equals(Object var1) {
         if (var1 == this) {
            return true;
         } else if (!(var1 instanceof HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2)) {
            return false;
         } else {
            if (!var2.canEqual(this)) {
               return false;
            }

            String var3 = this.CIHOIIIOOIORRRORCOOCCHCIIHRCHI;
            String var4 = var2.CIHOIIIOOIORRRORCOOCCHCIIHRCHI;
            if (var3 == null ? var4 == null : var3.equals(var4)) {
               OOROOCCIRCCRHOIOIORIHCHHOOCCOR var5 = this.COCHCORRROOOIOHIRRCRRCIOCIIRIC;
               OOROOCCIRCCRHOIOIORIHCHHOOCCOR var6 = var2.COCHCORRROOOIOHIRRCRRCIOCIIRIC;
               if (var5 == null ? var6 == null : var5.equals(var6)) {
                  OOROOCCIRCCRHOIOIORIHCHHOOCCOR var7 = this.CRCCIIOHHICCROIRCICCCCOHCCRROC;
                  OOROOCCIRCCRHOIOIORIHCHHOOCCOR var8 = var2.CRCCIIOHHICCROIRCICCCCOHCCRROC;
                  if (var7 == null ? var8 == null : var7.equals(var8)) {
                     List var9 = this.IIROCHHIROOCCHCHRIIHCCCOORHRIH;
                     List var10 = var2.IIROCHHIROOCCHCHRIIHCCCOORHRIH;
                     return var9 == null ? var10 == null : var9.equals(var10);
                  } else {
                     return false;
                  }
               } else {
                  return false;
               }
            } else {
               return false;
            }
         }
      }

      @Generated
      protected boolean canEqual(Object var1) {
         return var1 instanceof HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;
      }

      @Generated
      @Override
      public int hashCode() {
         byte var1 = 59;
         int var2 = 1;
         String var3 = this.CIHOIIIOOIORRRORCOOCCHCIIHRCHI;
         var2 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
         OOROOCCIRCCRHOIOIORIHCHHOOCCOR var4 = this.COCHCORRROOOIOHIRRCRRCIOCIIRIC;
         var2 = var2 * 59 + (var4 == null ? 43 : var4.hashCode());
         OOROOCCIRCCRHOIOIORIHCHHOOCCOR var5 = this.CRCCIIOHHICCROIRCICCCCOHCCRROC;
         var2 = var2 * 59 + (var5 == null ? 43 : var5.hashCode());
         List var6 = this.IIROCHHIROOCCHCHRIIHCCCOORHRIH;
         return var2 * 59 + (var6 == null ? 43 : var6.hashCode());
      }
   }

   public enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      NONE,
      TYPE_PARAMETER,
      CLASS_BOUND,
      INTERFACE_BOUND,
      PARAM,
      RETURN,
      SUPERCLASS,
      INTERFACE;
   }
}
