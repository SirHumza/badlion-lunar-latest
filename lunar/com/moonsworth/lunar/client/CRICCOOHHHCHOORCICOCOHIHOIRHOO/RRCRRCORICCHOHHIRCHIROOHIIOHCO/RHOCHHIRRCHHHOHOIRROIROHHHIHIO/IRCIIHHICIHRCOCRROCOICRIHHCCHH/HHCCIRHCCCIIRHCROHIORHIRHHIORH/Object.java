package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import java.io.DataOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   private long time;
   private final String className;
   private final String methodName;
   private final int OCRCRHRCOHCCICHCRCORHORIIOORCC;
   private final Map<String, RRCRRCORICCHOHHIRCHIROOHIIOHCO> HOICCHRCOORIHOIHORCCCOIHOHORHI = new HashMap<>();

   public RRCRRCORICCHOHHIRCHIROOHIIOHCO() {
      this.className = "";
      this.methodName = "root";
      this.OCRCRHRCOHCCICHCRCORHORIIOORCC = 0;
   }

   public RRCRRCORICCHOHHIRCHIROOHIIOHCO(String var1) {
      this.className = "";
      this.methodName = var1;
      this.OCRCRHRCOHCCICHCRCORHORIIOORCC = 0;
   }

   public RRCRRCORICCHOHHIRCHIROOHIIOHCO(StackTraceElement var1) {
      this.className = var1.getClassName();
      this.methodName = var1.getMethodName();
      this.OCRCRHRCOHCCICHCRCORHORIIOORCC = var1.getLineNumber();
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(StackTraceElement[] var1, long var2) {
      if (var1.length != 0) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var1.length - 1, var2);
      }
   }

   public void RICRIRRCOHRCOCRRHHCRHRROOIOHHR(long var1) {
      this.time += var1;
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(StackTraceElement[] var1, int var2, long var3) {
      this.time += var3;
      if (var2 != 0) {
         StackTraceElement var5 = var1[var2];
         RRCRRCORICCHOHHIRCHIROOHIIOHCO var6 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5);
         var6.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, --var2, var3);
      }
   }

   private RRCRRCORICCHOHHIRCHIROOHIIOHCO RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(StackTraceElement var1) {
      String var2 = IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1);
      return this.HOICCHRCOORIHOIHORCCCOIHOHORHI.computeIfAbsent(var2, var1x -> new RRCRRCORICCHOHHIRCHIROOHIIOHCO(var1));
   }

   public RRCRRCORICCHOHHIRCHIROOHIIOHCO HHHRRIRIHIHRORCOHCRRCIOCRIORIR(String var1) {
      return this.HOICCHRCOORIHOIHORCCCOIHOHORHI.computeIfAbsent(var1, RRCRRCORICCHOHHIRCHIROOHIIOHCO::new);
   }

   private static String IRCIIHHICIHRCOCRROCOICRIHHCCHH(StackTraceElement var0) {
      return var0.getClassName() + "#" + var0.getMethodName() + ":" + var0.getLineNumber();
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      var1.IRCHOHHOOROOHIIHHROOOOIIHHOIIH(this.className);
      var1.IRCHOHHOOROOHIIHHROOOOIIHHOIIH(this.methodName);

      for (Entry var3 : this.HOICCHRCOORIHOIHORCCCOIHOHORHI.entrySet()) {
         ((RRCRRCORICCHOHHIRCHIROOHIIOHCO)var3.getValue()).RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      DataOutputStream var1,
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2
   ) {
      var1.writeLong(this.time);
      var2.writeString(this.className);
      var2.writeString(this.methodName);
      var1.writeInt(this.OCRCRHRCOHCCICHCRCORHORIIOORCC);
      var1.writeInt(this.HOICCHRCOORIHOIHORCCCOIHOHORHI.size());

      for (Entry var4 : this.HOICCHRCOORIHOIHORCCCOIHOHORHI.entrySet()) {
         ((RRCRRCORICCHOHHIRCHIROOHIIOHCO)var4.getValue()).RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2);
      }
   }
}
