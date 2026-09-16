package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.TreeMap;
import java.util.UUID;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   private final File HCOHIRIRHIHIOIIROORORCROCHHHIR;
   private final Map<UUID, TreeMap<Integer, String>> ORRIIRHHCRCICRHIHCIRRIRORIICHI = new HashMap<>();
   private final Queue<RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> RCCRHIHCCOCOCIHIHIIOCICOIIHCCH = new LinkedList<>();

   public void IIOCHOIICCIORCOROIROHICCHIOHIC(UUID var1) {
      File var2 = new File(this.HCOHIRIRHIHIOIIROORORCROCHHHIR, "thumbnails/" + var1);
      if (var2.isDirectory()) {
         TreeMap var3 = new TreeMap();

         for (File var7 : Objects.requireNonNull(var2.listFiles())) {
            if (var7.getName().endsWith(".png")) {
               try {
                  int var8 = Integer.parseInt(var7.getName().substring(0, var7.getName().length() - ".png".length()));
                  var3.put(var8, null);
               } catch (Exception var9) {
                  var9.printStackTrace();
               }
            }
         }

         this.ORRIIRHHCRCICRHIHCIRRIRORIICHI.put(var1, var3);
      }
   }

   public String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(UUID var1, int var2) {
      TreeMap var3 = this.ORRIIRHHCRCICRHIHCIRRIRORIICHI.computeIfAbsent(var1, var0 -> new TreeMap<>());
      var3.put(var2, null);
      return this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var2);
   }

   public String IRCIIHHICIHRCOCRROCOICRIHHCCHH(UUID var1, int var2) {
      TreeMap var3 = this.ORRIIRHHCRCICRHIHCIRRIRORIICHI.get(var1);
      if (var3 == null) {
         return null;
      }

      if (!var3.containsKey(var2)) {
         return null;
      }

      String var4 = (String)var3.get(var2);
      if (var4 == null) {
         File var5 = new File(this.HCOHIRIRHIHIOIIROORORCROCHHHIR, "thumbnails/" + var1 + "/" + var2 + ".png");
         var4 = HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var5, CRICCOOHHHCHOORCICOCOHIHOIRHOO.RHROIROROOHRHROIOCRROOIHCCOIRI);
         var3.put(var2, var4);
      }

      return var4;
   }

   public void OCIIICHORIOICOHOIOHHHHRHOCIORO() {
      this.ORRIIRHHCRCICRHIHCIRRIRORIICHI.clear();
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      this.RCCRHIHCCOCOCIHIHIIOCICOIIHCCH.add(var1);
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      int var2,
      com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3
   ) {
      Iterator var4 = this.RCCRHIHCCOCOCIHIHIIOCICOIIHCCH.iterator();

      while (var4.hasNext()) {
         try {
            RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 = (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var4.next();
            int var6 = var5.HOHIICRROHCHCCRRRRHCCIHIRRRCOI();
            String var7 = this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var5.RRICCOIIIIHOCHCORROORCIHHCCHIC(), var6);
            if (var7 != null) {
               var4.remove();
               var5.OOHIRIHCRCOCHCOOCROCROHHHOIOHI().RRIRHIRRCRIIHCCIOORCCIOCICOCHI(var7);
               var1.RRRCCRHRIHCOHRCCHRCOOCCOIIOCHO();
            } else if (var2 >= (Integer)var5.CIHHCCRHCOOCCCCIHHCHIHHRRRCHIO().getMinimum()
               && var2 < (Integer)var5.CIHHCCRHCOOCCCCIHHCHIHHRRRCHIO().getMaximum()) {
               var4.remove();
               File var8 = new File(this.HCOHIRIRHIHIOIIROORORCROCHHHIR, "thumbnails/" + var5.RRICCOIIIIHOCHCORROORCIHHCCHIC() + "/" + var6 + ".png");
               com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIHHICHCCCOHCHROIRIHICCHHOROCR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var9 = new com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIHHICHCCCOHCHROIRIHICCHHOROCR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH();
               int var10 = var3.HOIHRCIOCIHORHIRHCOHRHHCCHOOOR().bridge$framebufferTextureWidth();
               int var11 = var3.HOIHRCIOCIHORHIRHCOHRHHCCHOOOR().bridge$framebufferTextureHeight();
               var9.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  null,
                  var8,
                  -1,
                  -1,
                  var3.HOIHRCIOCIHORHIRHCOHRHHCCHOOOR(),
                  false,
                  var3x -> this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3x, var10, var11, 64),
                  () -> IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
                     .bridge$submit(
                        () -> {
                           try {
                              var5.OOHIRIHCRCOCHCOOCROCROHHHOIOHI()
                                 .RRIRHIRRCRIIHCCIOORCCIOCICOCHI(this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5.RRICCOIIIIHOCHCORROORCIHHCCHIC(), var6));
                              var1.RRRCCRHRIHCOHRCCHRCOOCCOIIOCHO();
                           } catch (IOException var5x) {
                              var5x.printStackTrace();
                           }
                        }
                     )
               );
            }
         } catch (IOException var12) {
            var12.printStackTrace();
         }
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      File var2 = new File(this.HCOHIRIRHIHIOIIROORORCROCHHHIR, "thumbnails/project.png");
      int var3 = var1.HOIHRCIOCIHORHIRHCOHRHHCCHOOOR().bridge$framebufferTextureWidth();
      int var4 = var1.HOIHRCIOCIHORHIRHCOHRHHCCHOOOR().bridge$framebufferTextureHeight();
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIHHICHCCCOHCHROIRIHICCHHOROCR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var5 = new com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIHHICHCCCOHCHROIRIHICCHHOROCR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH();
      var5.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         null, var2, -1, -1, var1.HOIHRCIOCIHORHIRHCOHRHHCCHOOOR(), false, var3x -> this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3x, var3, var4, 256), () -> {}
      );
   }

   @NotNull
   private BufferedImage RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int[] var1, int var2, int var3, int var4) {
      BufferedImage var5 = new BufferedImage(var2, var3, 1);
      var5.setRGB(0, 0, var2, var3, var1, 0, var2);
      if (var2 > var3) {
         var3 = var4 * var3 / var2;
         var2 = var4;
      } else {
         var2 = var4 * var2 / var3;
         var3 = var4;
      }

      BufferedImage var6 = new BufferedImage(var2, var3, 1);
      var6.getGraphics().drawImage(var5.getScaledInstance(var2, var3, 4), 0, 0, null);
      return var6;
   }

   @Generated
   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(File var1) {
      this.HCOHIRIRHIHIOIIROORORCROCHHHIR = var1;
   }
}
