package com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import lombok.Generated;
import lombok.NonNull;

public class OOROOCCIRCCRHOIOIORIHCHHOOCCOR {
   public static final OOROOCCIRCCRHOIOIORIHCHHOOCCOR CIICCHHOHCHIIRCROCCOHCHHCHHCIO = new OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
      new IRCIIHHICIHRCOCRROCOICRIHHCCHH('V')
   );
   @NonNull
   CRICCOOHHHCHOORCICOCOHIHOIRHOO RRCHCIHRHIIOCICCRRRIROOCIRHOOR;
   @Nullable
   List<OOROOCCIRCCRHOIOIORIHCHHOOCCOR> params = null;

   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1) {
      if (this.params == null) {
         this.params = new ArrayList<>();
      }

      this.params.add(var1);
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder();
      if (this.RRCHCIHRHIIOCICCRRRIROOCIRHOOR instanceof HHCCIRHCCCIIRHCROHIORHIRHHIORH var2) {
         var1.append("L").append(var2.name());
      } else {
         var1.append(this.RRCHCIHRHIIOCICCRRRIROOCIRHOOR.getDescriptor());
      }

      if (this.params != null && !this.params.isEmpty()) {
         var1.append('<');

         for (OOROOCCIRCCRHOIOIORIHCHHOOCCOR var6 : this.params) {
            if (var6 != this) {
               if (var6 instanceof HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var4) {
                  var1.append("T").append(var4.RHOCROICRCHCIHHCROIHHCIOIROHII).append(";");
               } else {
                  var1.append(var6);
               }
            }
         }

         var1.append(">");
      }

      if (this.RRCHCIHRHIIOCICCRRRIROOCIRHOOR instanceof HHCCIRHCCCIIRHCROHIORHIRHHIORH) {
         var1.append(';');
      }

      return var1.toString();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (var1 instanceof OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2) {
         if (!this.RRCHCIHRHIIOCICCRRRIROOCIRHOOR.equals(var2.RRCHCIHRHIIOCICCRRRIROOCIRHOOR)) {
            return false;
         }

         if (this.params == null) {
            return var2.params == null;
         }

         if (var2.params == null) {
            return false;
         }

         if (this.params.size() != var2.params.size()) {
            return false;
         }

         for (int var3 = 0; var3 < this.params.size(); var3++) {
            OOROOCCIRCCRHOIOIORIHCHHOOCCOR var4 = this.params.get(var3);
            OOROOCCIRCCRHOIOIORIHCHHOOCCOR var5 = var2.params.get(var3);
            if (var4 != this && var5 != var2 && var4 != var5 && !var4.equals(var5)) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @NonNull
   @Generated
   public CRICCOOHHHCHOORCICOCOHIHOIRHOO IICRHRIOIROIOHRICHHHHHIHIOOICI() {
      return this.RRCHCIHRHIIOCICCRRRIROOCIRHOOR;
   }

   @Nullable
   @Generated
   public List<OOROOCCIRCCRHOIOIORIHCHHOOCCOR> getParams() {
      return this.params;
   }

   @Generated
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(@NonNull CRICCOOHHHCHOORCICOCOHIHOIRHOO var1) {
      if (var1 == null) {
         throw new NullPointerException("typeDesc is marked non-null but is null");
      }

      this.RRCHCIHRHIIOCICCRRRIROOCIRHOOR = var1;
   }

   @Generated
   public void setParams(@Nullable List<OOROOCCIRCCRHOIOIORIHCHHOOCCOR> var1) {
      this.params = var1;
   }

   @Generated
   public OOROOCCIRCCRHOIOIORIHCHHOOCCOR(@NonNull CRICCOOHHHCHOORCICOCOHIHOIRHOO var1) {
      if (var1 == null) {
         throw new NullPointerException("typeDesc is marked non-null but is null");
      }

      this.RRCHCIHRHIIOCICCRRRIROOCIRHOOR = var1;
   }
}
