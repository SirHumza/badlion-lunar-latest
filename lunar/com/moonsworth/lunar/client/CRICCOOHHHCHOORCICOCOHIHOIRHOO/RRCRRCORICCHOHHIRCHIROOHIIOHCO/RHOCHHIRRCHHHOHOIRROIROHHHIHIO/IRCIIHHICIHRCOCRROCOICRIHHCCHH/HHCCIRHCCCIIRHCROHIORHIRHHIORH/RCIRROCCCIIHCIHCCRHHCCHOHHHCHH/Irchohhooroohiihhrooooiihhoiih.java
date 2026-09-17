package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   private final DataOutputStream dos;
   private final Map<String, Integer> OCCHOIIROCICORROIIHHHROCIIHHIH = new HashMap<>();
   private final List<String> RHROIOHOIIOHOIIIIOOICHIOIHOCOI = new ArrayList<>();
   private boolean hasWritten;

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(DataOutputStream var1) {
      this.dos = var1;
   }

   public void IRCHOHHOOROOHIIHHROOOOIIHHOIIH(String var1) {
      if (this.hasWritten) {
         throw new IllegalStateException("Cannot collect strings after writing");
      }

      if (var1 == null) {
         var1 = "null";
      }

      this.OCCHOIIROCICORROIIHHHROCIIHHIH.computeIfAbsent(var1, var1x -> {
         this.RHROIOHOIIOHOIIIIOOICHIOIHOCOI.add(var1x);
         return this.RHROIOHOIIOHOIIIIOOICHIOIHOCOI.size() - 1;
      });
   }

   public void HROIHRCHHRCCCCHIHICIORRHIRHCOC() {
      this.hasWritten = true;
      this.dos.writeInt(this.RHROIOHOIIOHOIIIIOOICHIOIHOCOI.size());

      for (String var2 : this.RHROIOHOIIOHOIIIIOOICHIOIHOCOI) {
         this.dos.writeUTF(var2);
      }
   }

   public void writeString(String var1) {
      if (!this.hasWritten) {
         throw new IllegalStateException("Cannot write strings before writing");
      }

      if (var1 == null) {
         var1 = "null";
      }

      if (!this.OCCHOIIROCICORROIIHHHROCIIHHIH.containsKey(var1)) {
         throw new IllegalArgumentException("String must be collected before writing");
      }

      int var2 = this.OCCHOIIROCICORROIIHHHROCIIHHIH.get(var1);
      this.dos.writeInt(var2);
   }
}
