package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.util.Objects;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
   @NotNull
   private final String HHCRHOOIRRRRHRCOOROOHOIIRICIHC;
   @NotNull
   private final String OHICICOOOICCIHCOCCHHORIRCHIRIR;
   private final Optional<String> IOIHIIRRCHHHCIHIRCROROHRHRCOHI;
   private final int HCCHIOICIRHHICHORCHRROOHIRCIHC;
   public static IRCIIHHICIHRCOCRROCOICRIHHCCHH CCCCOOCIRIIOOIROHCCCCHICICHHOR = new IRCIIHHICIHRCOCRROCOICRIHHCCHH("none", "None", Optional.empty(), 0);

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(@NotNull String var1, @NotNull String var2, Optional<String> var3, int var4) {
      this.HHCRHOOIRRRRHRCOOROOHOIIRICIHC = var1;
      this.OHICICOOOICCIHCOCCHHORIRCHIRIR = var2;
      this.IOIHIIRRCHHHCIHIRCROROHRHRCOHI = var3;
      this.HCCHIOICIRHHICHORCHRROOHIRCIHC = var4;
   }

   @Override
   public String toString() {
      return this.HHCRHOOIRRRRHRCOOROOHOIIRICIHC;
   }

   @Override
   public boolean equals(Object var1) {
      return var1 == this
         || var1 instanceof IRCIIHHICIHRCOCRROCOICRIHHCCHH
            && Objects.equals(((IRCIIHHICIHRCOCRROCOICRIHHCCHH)var1).HHCRHOOIRRRRHRCOOROOHOIIRICIHC, this.HHCRHOOIRRRRHRCOOROOHOIIRICIHC);
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.HHCRHOOIRRRRHRCOOROOHOIIRICIHC);
   }

   @NotNull
   public String apiName() {
      return this.HHCRHOOIRRRRHRCOOROOHOIIRICIHC;
   }

   @NotNull
   public String niceName() {
      return this.OHICICOOOICCIHCOCCHHORIRCHIRIR;
   }

   public Optional<String> OHCRCOHIRIICORIOHHCHOCCIOORCOO() {
      return this.IOIHIIRRCHHHCIHIRCROROHRHRCOHI;
   }

   public int HICHRICIIOOIHIIRHCCOHOHICHHOCC() {
      return this.HCCHIOICIRHHICHORCHRROOHIRCIHC;
   }
}
