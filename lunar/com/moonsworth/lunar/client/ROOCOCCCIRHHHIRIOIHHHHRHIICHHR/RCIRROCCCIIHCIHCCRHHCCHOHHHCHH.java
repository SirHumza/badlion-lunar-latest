package com.moonsworth.lunar.client.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR;

import com.moonsworth.lunar.ichor.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;
import com.moonsworth.lunar.ichor.api.IchorAPI;
import com.moonsworth.lunar.ichor.util.CIOHHCORHRCCRICCCORIHCRHCCCRRR;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public static void RRCRRCORICCHOHHIRCHIROOHIIOHCO(Throwable var0) {
      OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1 = (OOROOCCIRCCRHOIOIORIHCHHOOCCOR)IchorAPI.getPipeline(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class.getClassLoader())
         .orElseThrow();
      StackTraceElement[] var2 = var0.getStackTrace();
      boolean var3 = false;

      for (int var4 = 0; var4 < var2.length; var4++) {
         StackTraceElement var5 = var2[var4];
         if (!var5.isNativeMethod()) {
            String var6 = var5.getClassName();
            CIOHHCORHRCCRICCCORIHCRHCCCRRR var7 = var1.OIORROROOROHHRIIORIHHHOCIIHRRC(var6.replace('.', '/'));
            if (var7 != null) {
               String var8 = var5.getMethodName();
               com.moonsworth.lunar.ichor.util.CIOHHCORHRCCRICCCORIHCRHCCCRRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var9 = var7.CIRORIOCCCICOHIHRICOHOCIICIOIH(var8);
               if (var9 != null) {
                  String var10 = var5.getFileName() + ":" + var9.RCRIHIICHHIHHRIIROHORHHICCOOOO().name();
                  var2[var4] = new StackTraceElement(var5.getClassName(), var5.getMethodName(), var10, var5.getLineNumber());
                  var3 = true;
               }
            }
         }
      }

      if (var3) {
         var0.setStackTrace(var2);
      }
   }
}
