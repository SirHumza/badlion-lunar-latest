package com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.util.function.Function;
import java.util.function.Supplier;
import lombok.Generated;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH
   implements com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private final Object[] COIIIHOIHCHIOCHRHHIRHCCIHHOIHH;

   @Override
   public int IOHCHROOHOCIHHHHIRROHIHOCICRHI() {
      return this.COIIIHOIHCHIOCHRHHIRHCCIHHOIHH.length - 1;
   }

   @Override
   public String RRCRRCORICCHOHHIRCHIROOHIIOHCO(Object... var1) {
      StringBuilder var2 = new StringBuilder();

      for (int var3 = 0; var3 < this.COIIIHOIHCHIOCHRHHIRHCCIHHOIHH.length; var3++) {
         Object var4 = this.COIIIHOIHCHIOCHRHHIRHCCIHHOIHH[var3];
         if (var4 instanceof Supplier var5) {
            var2.append(var5.get().toString());
         } else {
            var2.append(var4.toString());
         }

         if (var3 < var1.length) {
            var2.append(var1[var3].toString());
         }
      }

      return var2.toString();
   }

   @SafeVarargs
   @Override
   public final <T> String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Function<T, String> var1, T... var2) {
      StringBuilder var3 = new StringBuilder();

      for (int var4 = 0; var4 < this.COIIIHOIHCHIOCHRHHIRHCCIHHOIHH.length; var4++) {
         Object var5 = this.COIIIHOIHCHIOCHRHHIRHCCIHHOIHH[var4];
         if (var5 instanceof Supplier var6) {
            var3.append(var6.get().toString());
         } else {
            var3.append(var5.toString());
         }

         if (var4 < var2.length) {
            var3.append((String)var1.apply(var2[var4]));
         }
      }

      return var3.toString();
   }

   @Generated
   IRCIIHHICIHRCOCRROCOICRIHHCCHH(Object[] var1) {
      this.COIIIHOIHCHIOCHRHHIRHCCIHHOIHH = var1;
   }
}
