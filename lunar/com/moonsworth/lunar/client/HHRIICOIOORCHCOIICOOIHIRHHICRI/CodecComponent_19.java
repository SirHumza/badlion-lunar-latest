package com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI;

import com.lunarclient.dfu.serialization.Codec;
import com.lunarclient.dfu.serialization.codecs.RecordCodecBuilder;
import lombok.Generated;
import org.jetbrains.annotations.Contract;

public class ICICIOCHHHIHOCHCOHORIHRCOHHOCR {
   public static final Codec<ICICIOCHHHIHOCHCOHORIHRCOHHOCR> CROCHROROIIRIRHRHOHRHROIOIIORI = RecordCodecBuilder.create(
      var0 -> var0.group(
            Codec.BOOL.optionalFieldOf("alt", false).forGetter(ICICIOCHHHIHOCHCOHORIHRCOHHOCR::RHICCOCHIHRIOHHCCORIHCHIIROCRC),
            Codec.BOOL.optionalFieldOf("shift", false).forGetter(ICICIOCHHHIHOCHCOHORIHRCOHHOCR::HHCCIRIOIRCORIORRRCHCCORRCCHOO),
            Codec.BOOL.optionalFieldOf("control", false).forGetter(ICICIOCHHHIHOCHCOHORIHRCOHHOCR::RHOHIOICRROOHHRCOCHOCOHOHIHCCC),
            com.moonsworth.lunar.client.util.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HIHHOCRHHRORRHHRORRRIIHHORIHOC(
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH::values
               )
               .fieldOf("value")
               .forGetter(ICICIOCHHHIHOCHCOHORIHRCOHHOCR::ICOHRHCIHIIOOHRHRICHIHOCCHHCRC)
         )
         .apply(var0, ICICIOCHHHIHOCHCOHORIHRCOHHOCR::new)
   );
   private final boolean IRCHOHOCOIHHRHHICHCRIIRIICOHCH;
   private final boolean OOIOIHORRIIHRCIHCHHIHROCCCIRHI;
   private final boolean OCHRCOCHIRHRICIIRICOHCRHCRCORC;
   private final com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH HRIRIHOCCCCOOCRHIIICIRHCIHOIHH;

   public boolean hasModifiers() {
      return this.IRCHOHOCOIHHRHHICHCRIIRIICOHCH || this.OOIOIHORRIIHRCIHCHHIHROCCCIRHI || this.OCHRCOCHIRHRICIIRICOHCRHCRCORC;
   }

   @Contract("_->new")
   public static ICICIOCHHHIHOCHCOHORIHRCOHHOCR IIHRRHORCRCROCHHOHORCHCROCIHRO(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var0
   ) {
      return new ICICIOCHHHIHOCHCOHORIHRCOHHOCR(false, false, false, var0);
   }

   @Contract("_->new")
   public static ICICIOCHHHIHOCHCOHORIHRCOHHOCR OCOHORHCROHICRRIHCIHHRRCIHICRI(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var0
   ) {
      return new ICICIOCHHHIHOCHCOHORIHRCOHHOCR(false, false, true, var0);
   }

   @Contract("_->new")
   public static ICICIOCHHHIHOCHCOHORIHRCOHHOCR CIOHHCORHRCCRICCCORIHCRHCCCRRR(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var0
   ) {
      return new ICICIOCHHHIHOCHCOHORIHRCOHHOCR(false, true, false, var0);
   }

   @Contract("_->new")
   public static ICICIOCHHHIHOCHCOHORIHRCOHHOCR IHHCHHHCRIHOOCOIOOCRIIICIOROIR(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var0
   ) {
      return new ICICIOCHHHIHOCHCOHORIHRCOHHOCR(true, false, false, var0);
   }

   @Generated
   public boolean RHICCOCHIHRIOHHCCORIHCHIIROCRC() {
      return this.IRCHOHOCOIHHRHHICHCRIIRIICOHCH;
   }

   @Generated
   public boolean HHCCIRIOIRCORIORRRCHCCORRCCHOO() {
      return this.OOIOIHORRIIHRCIHCHHIHROCCCIRHI;
   }

   @Generated
   public boolean RHOHIOICRROOHHRCOCHOCOHOHIHCCC() {
      return this.OCHRCOCHIRHRICIIRICOHCRHCRCORC;
   }

   @Generated
   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH ICOHRHCIHIIOOHRHRICHIHOCCHHCRC() {
      return this.HRIRIHOCCCCOOCRHIIICIRHCIHOIHH;
   }

   @Generated
   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof ICICIOCHHHIHOCHCOHORIHRCOHHOCR var2)) {
         return false;
      } else {
         if (!var2.canEqual(this)) {
            return false;
         }

         if (this.RHICCOCHIHRIOHHCCORIHCHIIROCRC() != var2.RHICCOCHIHRIOHHCCORIHCHIIROCRC()) {
            return false;
         }

         if (this.HHCCIRIOIRCORIORRRCHCCORRCCHOO() != var2.HHCCIRIOIRCORIORRRCHCCORRCCHOO()) {
            return false;
         }

         if (this.RHOHIOICRROOHHRCOCHOCOHOHIHCCC() != var2.RHOHIOICRROOHHRCOCHOCOHOHIHCCC()) {
            return false;
         }

         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = this.ICOHRHCIHIIOOHRHRICHIHOCCHHCRC();
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 = var2.ICOHRHCIHIIOOHRHRICHIHOCCHHCRC();
         return var3 == null ? var4 == null : var3.equals(var4);
      }
   }

   @Generated
   protected boolean canEqual(Object var1) {
      return var1 instanceof ICICIOCHHHIHOCHCOHORIHRCOHHOCR;
   }

   @Generated
   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      var2 = var2 * 59 + (this.RHICCOCHIHRIOHHCCORIHCHIIROCRC() ? 79 : 97);
      var2 = var2 * 59 + (this.HHCCIRIOIRCORIORRRCHCCORRCCHOO() ? 79 : 97);
      var2 = var2 * 59 + (this.RHOHIOICRROOHHRCOCHOCOHOHIHCCC() ? 79 : 97);
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = this.ICOHRHCIHIIOOHRHRICHIHOCCHHCRC();
      return var2 * 59 + (var3 == null ? 43 : var3.hashCode());
   }

   @Generated
   @Override
   public String toString() {
      return "KeyBind(alt="
         + this.RHICCOCHIHRIOHHCCORIHCHIIROCRC()
         + ", shift="
         + this.HHCCIRIOIRCORIORRRCHCCORRCCHOO()
         + ", control="
         + this.RHOHIOICRROOHHRCOCHOCOHOHIHCCC()
         + ", value="
         + this.ICOHRHCIHIIOOHRHRICHIHOCCHHCRC()
         + ")";
   }

   @Generated
   public ICICIOCHHHIHOCHCOHORIHRCOHHOCR(
      boolean var1,
      boolean var2,
      boolean var3,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4
   ) {
      this.IRCHOHOCOIHHRHHICHCRIIRIICOHCH = var1;
      this.OOIOIHORRIIHRCIHCHHIHROCCCIRHI = var2;
      this.OCHRCOCHIRHRICIIRICOHCRHCRCORC = var3;
      this.HRIRIHOCCCCOOCRHIIICIRHCIHOIHH = var4;
   }
}
