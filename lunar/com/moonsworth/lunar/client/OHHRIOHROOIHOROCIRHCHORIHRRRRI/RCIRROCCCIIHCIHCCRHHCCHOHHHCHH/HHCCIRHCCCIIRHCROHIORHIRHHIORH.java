package com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.util.function.Function;
import lombok.Generated;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH
   implements com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private final String[] OICICOCIOIOICCHCHORCRRRIHIOHOH;

   @Override
   public int IOHCHROOHOCIHHHHIRROHIHOCICRHI() {
      return this.OICICOCIOIOICCHCHORCRRRIHIOHOH.length - 1;
   }

   @Override
   public String RRCRRCORICCHOHHIRCHIROOHIIOHCO(Object... var1) {
      StringBuilder var2 = new StringBuilder();

      for (int var3 = 0; var3 < this.OICICOCIOIOICCHCHORCRRRIHIOHOH.length; var3++) {
         var2.append(this.OICICOCIOIOICCHCHORCRRRIHIOHOH[var3]);
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

      for (int var4 = 0; var4 < this.OICICOCIOIOICCHCHORCRRRIHIOHOH.length; var4++) {
         var3.append(this.OICICOCIOIOICCHCHORCRRRIHIOHOH[var4]);
         if (var4 < var2.length) {
            var3.append((String)var1.apply(var2[var4]));
         }
      }

      return var3.toString();
   }

   @Generated
   HHCCIRHCCCIIRHCROHIORHIRHHIORH(String[] var1) {
      this.OICICOCIOIOICCHCHORCRRRIHIOHOH = var1;
   }
}
