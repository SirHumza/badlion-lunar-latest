package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OIOORROOHCRRCOCOHICICRCIOCIIOH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OIOORROOHCRRCOCOHICICRCIOCIIOH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO;
import java.util.List;
import java.util.OptionalInt;
import lombok.Generated;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   private final List<CRICCOOHHHCHOORCICOCOHIHOIRHOO> HCCICCIHOHIIOHCRHORROCIRHRRCOR;
   private final float OIRRICCICCRCHHORIOCIICRROOIROR;

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(CRICCOOHHHCHOORCICOCOHIHOIRHOO... var1) {
      this(1.0F, var1);
   }

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(float var1, CRICCOOHHHCHOORCICOCOHIHOIRHOO... var2) {
      this.HCCICCIHOHIIOHCRHORROCIRHRRCOR = List.of(var2);
      this.OIRRICCICCRCHHORIOCIICRROOIROR = var1;
   }

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(List<CRICCOOHHHCHOORCICOCOHIHOIRHOO> var1) {
      this(1.0F, var1);
   }

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(float var1, List<CRICCOOHHHCHOORCICOCOHIHOIRHOO> var2) {
      this.HCCICCIHOHIIOHCRHORROCIRHRRCOR = var2;
      this.OIRRICCICCRCHHORIOCIICRROOIROR = var1;
   }

   public int getWidth() {
      return (int)(this.HCCICCIHOHIIOHCRHORROCIRHRRCOR.stream().mapToInt(CRICCOOHHHCHOORCICOCOHIHOIRHOO::getWidth).sum() * this.OIRRICCICCRCHHORIOCIICRROOIROR);
   }

   public int getHeight() {
      OptionalInt var1 = this.HCCICCIHOHIIOHCRHORROCIRHRRCOR.stream().mapToInt(CRICCOOHHHCHOORCICOCOHIHOIRHOO::getHeight).max();
      return var1.isPresent() ? (int)(var1.getAsInt() * this.OIRRICCICCRCHHORIOCIICRROOIROR) : 0;
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OIOORROOHCRRCOCOHICICRCIOCIIOH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2,
      int var3,
      int var4
   ) {
      int var5 = 0;
      var1.push();
      var1.scale(this.OIRRICCICCRCHHORIOCIICRROOIROR, this.OIRRICCICCRCHHORIOCIICRROOIROR, this.OIRRICCICCRCHHORIOCIICRROOIROR);

      for (CRICCOOHHHCHOORCICOCOHIHOIRHOO var7 : this.HCCICCIHOHIIOHCRHORROCIRHRRCOR) {
         var7.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var1, var2, (int)(var3 / this.OIRRICCICCRCHHORIOCIICRROOIROR) + var5, (int)(var4 / this.OIRRICCICCRCHHORIOCIICRROOIROR)
         );
         var5 = (int)(var5 + var7.getWidth() * this.OIRRICCICCRCHHORIOCIICRROOIROR);
      }

      var1.pop();
   }

   @Generated
   public List<CRICCOOHHHCHOORCICOCOHIHOIRHOO> getElements() {
      return this.HCCICCIHOHIIOHCRHORROCIRHRRCOR;
   }

   @Generated
   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof IRCIIHHICIHRCOCRROCOICRIHHCCHH var2)) {
         return false;
      } else {
         if (!var2.canEqual(this)) {
            return false;
         }

         if (Float.compare(this.getScale(), var2.getScale()) != 0) {
            return false;
         }

         List var3 = this.getElements();
         List var4 = var2.getElements();
         return var3 == null ? var4 == null : var3.equals(var4);
      }
   }

   @Generated
   protected boolean canEqual(Object var1) {
      return var1 instanceof IRCIIHHICIHRCOCRROCOICRIHHCCHH;
   }

   @Generated
   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      var2 = var2 * 59 + Float.floatToIntBits(this.getScale());
      List var3 = this.getElements();
      return var2 * 59 + (var3 == null ? 43 : var3.hashCode());
   }

   @Generated
   @Override
   public String toString() {
      return "WAILARow(elements=" + this.getElements() + ", scale=" + this.getScale() + ")";
   }

   @Generated
   public float getScale() {
      return this.OIRRICCICCRCHHORIOCIICRROOIROR;
   }
}
