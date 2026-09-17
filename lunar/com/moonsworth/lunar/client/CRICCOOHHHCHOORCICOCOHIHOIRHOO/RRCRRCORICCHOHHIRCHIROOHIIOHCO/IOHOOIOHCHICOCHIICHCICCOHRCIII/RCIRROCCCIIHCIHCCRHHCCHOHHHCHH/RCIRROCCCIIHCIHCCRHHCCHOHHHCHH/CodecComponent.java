package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.zip.Inflater;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   private static final String[] OICIOHIRICIRRICHIROHHOHHOOCCOO = new String[]{
      "Waypoint",
      "Unnamed group",
      "mc.hypixel.net",
      "SKYBLOCK",
      "Singleplayer",
      "Multiplayer",
      "Supplies",
      "Build Ballista",
      "Fuel Ballista",
      "Killed",
      "P5",
      "BLOOD_OPEN",
      "BLOOD_CLEAR",
      "F1_BONZO_1_KILLED",
      "F1_BONZO_2_KILLED",
      "F2_SCARF_FREED",
      "F2_SCARF_KILLED",
      "F3_BOSS_ENTERED",
      "F3_PROFESSOR_FREED",
      "F3_PROFESSOR_1_KILLED",
      "F3_PROFESSOR_2_KILLED",
      "F4_THORN_ENTERED",
      "F4_THORN_KILLED",
      "F5_LIVID_ENTERED",
      "F5_LIVID_KILLED",
      "F6_ENTRY",
      "F6_TERRACOTTA",
      "F6_GIANTS",
      "F6_SADAN",
      "F7_ENTRY",
      "F7_PHASE1",
      "F7_PHASE2",
      "F7_PHASE3",
      "F7_PHASE4",
      "F7_PHASE5"
   };
   private static final String CIORIIIOCCHOOHCICRHHOROCHRRRIO = String.join("", OICIOHIRICIRRICHIROHHOHHOOCCOO);
   private final RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCHCOORCCIHHRHCHHCHHRRRIHIOHCO;
   private final String string;

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      this.RCHCOORCCIHHRHCHHCHHRRRIHIOHCO = var1;
      boolean var2 = var1.readBool();
      int var3 = var1.readInt();
      byte[] var4 = var1.RIROOOIRCIRHOHIHROCICIOICCRICR(var3);
      if (var2) {
         this.string = this.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var4);
      } else {
         this.string = StandardCharsets.UTF_8.decode(ByteBuffer.wrap(var4)).toString();
      }
   }

   private String OOROOCCIRCCRHOIOIORIHCHHOOCCOR(byte[] var1) {
      Inflater var2 = new Inflater();
      var2.setInput(var1);
      byte[] var3 = new byte[1024];
      byte[] var4 = new byte[0];

      int var5;
      do {
         var5 = var2.inflate(var3, 0, var3.length);
         var4 = Arrays.copyOf(var4, var4.length + var5);
         System.arraycopy(var3, 0, var4, var4.length - var5, var5);
      } while (var5 >= var3.length);

      return StandardCharsets.UTF_8.decode(ByteBuffer.wrap(var4)).toString();
   }

   public String readString() {
      boolean var1 = this.RCHCOORCCIHHRHCHHCHHRRRIHIOHCO.readBool();
      long var2 = this.RCHCOORCCIHHRHCHHCHHRRRIHIOHCO.HIHHCRRHHORCOHOCIRCRHHICCCIIHO();
      long var4 = this.RCHCOORCCIHHRHCHHCHHRRRIHIOHCO.HIHHCRRHHORCOHOCIRCRHHICCCIIHO();
      return var1 ? CIORIIIOCCHOOHCICRHHOROCHRRRIO.substring((int)var2, (int)(var2 + var4)) : this.string.substring((int)var2, (int)(var2 + var4));
   }
}
