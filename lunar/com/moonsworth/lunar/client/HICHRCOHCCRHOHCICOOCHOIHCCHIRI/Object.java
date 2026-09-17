package com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI;

import java.nio.IntBuffer;
import java.util.function.Consumer;
import org.lwjgl.system.MemoryUtil;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   public static final HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RHIHICRHRRRROCHHCHIRHHHOIRCCCR = new HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      10000
   );
   public static final HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IIHOHOCOROCCIHCHOCIIHCOCRRCHRH = new HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      1000
   );
   public static final HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH ORHOHRIOIOOIHHRHRRRCHORIRCROIO = new HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      200
   );

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      private final int COHCCICIORRIIHRCHCHRCROCHIRRII;
      private IntBuffer HOHORIICRICCHRHRIORORRHCIIHIRR = null;

      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var1) {
         this.COHCCICIORRIIHRCHCHRCROCHIRRII = var1;
      }

      private IntBuffer IIHOICHCRCORIRIHIOIHRRRHIIHOOO() {
         if (this.HOHORIICRICCHRHRIORORRHCIIHIRR == null) {
            this.HOHORIICRICCHRHRIORORRHCIIHIRR = MemoryUtil.memCallocInt(this.COHCCICIORRIIHRCHCHRCROCHIRRII);
            this.HOHORIICRICCHRHRIORORRHCIIHIRR.position(this.COHCCICIORRIIHRCHCHRCROCHIRRII);
         }

         return this.HOHORIICRICCHRHRIORORRHCIIHIRR;
      }

      public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Consumer<IntBuffer> var1, boolean var2) {
         if (!var2 || this.HOHORIICRICCHRHRIORORRHCIIHIRR != null) {
            IntBuffer var3 = this.IIHOICHCRCORIRIHIOIHRRRHIIHOOO();
            int var4 = var3.position();
            if (var4 != 0) {
               var3.limit(var4);
               var3.position(0);
               var1.accept(var3);
               var3.limit(var3.capacity());
               var3.position(0);
            }
         }
      }

      public int OIHCOHRCICCCRHRCROOCIOIRRHHHIH(Consumer<IntBuffer> var1) {
         IntBuffer var2 = this.IIHOICHCRCORIRIHIOIHRRRHIIHOOO();
         if (!var2.hasRemaining()) {
            var2.position(0);
            var1.accept(var2);
            var2.position(0);
         }

         return var2.get();
      }
   }
}
