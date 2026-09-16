package com.moonsworth.lunar.client.RORCHCIIICOHIRROOORHOCCCCIOCCI;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import org.jetbrains.annotations.NotNull;

public record RRCRRCORICCHOHHIRCHIROOHIIOHCO<T>() {
   private final int RRICOOOHRHRHCHHRCIRCRORIIIIRHI;
   private final T ICHRIICIRCHCRORORHORCHICCIROIO;

   public RRCRRCORICCHOHHIRCHIROOHIIOHCO(int var1, T var2) {
      this.RRICOOOHRHRHCHHRCIRCRORIIIIRHI = var1;
      this.ICHRIICIRCHCRORORHORCHICCIROIO = (T)var2;
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HHCCIRHCCCIIRHCROHIORHIRHHIORH var1) {
      var1.set(this.RRICOOOHRHRHCHHRCIRCRORIIIIRHI, this.ICHRIICIRCHCRORORHORCHICCIROIO);
   }

   @NotNull
   @Override
   public String toString() {
      return this.RRICOOOHRHRHCHHRCIRCRORIIIIRHI + ">" + this.ICHRIICIRCHCRORORHORCHICCIROIO;
   }

   static RRCRRCORICCHOHHIRCHIROOHIIOHCO<?> IRCIIHHICIHRCOCRROCOICRIHHCCHH(Entry<Object> var0) {
      return RRCRRCORICCHOHHIRCHIROOHIIOHCO(var0.getIntKey(), var0.getValue());
   }

   public static <T> RRCRRCORICCHOHHIRCHIROOHIIOHCO<T> RRCRRCORICCHOHHIRCHIROOHIIOHCO(int var0, Object var1) {
      return new RRCRRCORICCHOHHIRCHIROOHIIOHCO<>(var0, (T)var1);
   }

   public int type() {
      return this.RRICOOOHRHRHCHHRCIRCRORIIIIRHI;
   }

   public T value() {
      return this.ICHRIICIRCHCRORORHORCHICCIROIO;
   }
}
