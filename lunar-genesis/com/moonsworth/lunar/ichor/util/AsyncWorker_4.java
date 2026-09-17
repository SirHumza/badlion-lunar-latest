package com.moonsworth.lunar.ichor.util;

import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHICORCROOROHCIHIHCOIHRRHICICO;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   private static final ThreadLocal<RRCRRCORICCHOHHIRCHIROOHIIOHCO> RHIHIHHRRROHHRHIHIHOHOHOCRICII = ThreadLocal.withInitial(
      RRCRRCORICCHOHHIRCHIROOHIIOHCO::new
   );
   private final Map<String, Deque<String>> OCHOORRROIOHRIHRCOCICHIRCRORRI = new HashMap<>();

   public static RRCRRCORICCHOHHIRCHIROOHIIOHCO CHORHCHRCICCHIICOHIIRROCRHCHHH() {
      return RHIHIHHRRROHHRHIHIHOHOHOCRICII.get();
   }

   public String HHHROIRRRRCHCHROHCORIIOHOIIOCC(String var1) {
      String var2 = IHICORCROOROHCIHIHCOIHRRHICICO.repeat("*", 70);
      Serializable var3 = "/" + var2 + "\\\n";
      String var4 = "\\" + var2 + "/\n";
      StringBuilder var5 = new StringBuilder();

      for (Iterator var6 = this.IRROIHHOOHCIOHICHHROOOCOCHCCOI(var1).descendingIterator(); var6.hasNext(); var5.append(" *|\n")) {
         String var7 = "|* " + (String)var6.next();
         var5.append(var7);
         int var8 = var3.length() - (var7.length() + 2);
         if (var8 > 0) {
            var5.append(IHICORCROOROHCIHIHCOIHRRHICICO.repeat(" ", var8 - 2));
         }
      }

      return var3 + var5 + var4;
   }

   public Deque<String> IRROIHHOOHCIOHICHHROOOCOCHCCOI(String var1) {
      return this.OCHOORRROIOHRIHRCOCICHIRCRORRI.computeIfAbsent(var1, var0 -> new ArrayDeque<>());
   }

   public void CIOORRCRICOIICROHRHRHHOHRCCRII(String var1, String var2) {
      this.IRROIHHOOHCIOHICHHROOOCOCHCCOI(var1).push(var2);
   }

   public void CRHRHRIOIHRCHRIORHRRCHHIHCOCCC(String var1, String var2) {
      this.IRROIHHOOHCIOHICHHROOOCOCHCCOI(var1).removeFirstOccurrence(var2);
   }
}
