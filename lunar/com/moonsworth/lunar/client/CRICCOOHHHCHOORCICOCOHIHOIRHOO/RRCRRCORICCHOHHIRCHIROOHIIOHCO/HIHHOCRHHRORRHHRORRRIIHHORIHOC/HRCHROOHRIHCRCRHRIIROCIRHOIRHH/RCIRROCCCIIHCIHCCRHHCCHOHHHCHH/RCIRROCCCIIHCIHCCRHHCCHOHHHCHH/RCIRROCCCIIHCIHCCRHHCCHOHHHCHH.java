package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import io.netty.util.concurrent.DefaultThreadFactory;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import javax.imageio.ImageIO;
import lombok.Generated;
import org.apache.commons.lang3.Range;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private final File CHIRRIIRRRIORIIRHHHROCIROHRIIO;
   private final Map<String, List<Float>> OCHRROICHOHICIOHRCHRCIOROOOOCC = new HashMap<>();
   private final Executor RCHORRROCCRIRIRCCOHIORIHOOIICR = Executors.newSingleThreadExecutor(new DefaultThreadFactory("lunar-waveform-thread", true));
   private final Map<UUID, String> OCICHOHCCCOHOCHHRCOCOCICIHCHHH = new HashMap<>();
   private final Set<String> IRRROOORRRHRIROHRCIIOCHIHCOHOC = new HashSet<>();
   private static final float RCHOIRHRCOOCIOCROHRCCRIIHCHRHI = -48.0F;

   public List<Float> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, IRCIIHHICIHRCOCRROCOICRIHHCCHH<?> var2) {
      if (var2.getKey() != null) {
         var1 = var1 + "$" + var2.getKey();
      }

      if (this.OCHRROICHOHICIOHRCHRCIOROOOOCC.containsKey(var1)) {
         return this.OCHRROICHOHICIOHRCHRCIOROOOOCC.get(var1);
      }

      File var3 = new File(this.CHIRRIIRRRIORIIRHHHROCIROHRIIO, "audio_cache");
      var3.mkdirs();
      File var4 = new File(var3, "waveform_" + var1);
      if (var4.exists()) {
         ArrayList var15 = new ArrayList();
         this.OCHRROICHOHICIOHRCHRCIOROOOOCC.put(var1, var15);

         try (FileInputStream var16 = new FileInputStream(var4)) {
            byte[] var17 = new byte[4096];

            while (var16.read(var17) != -1) {
               for (byte var18 = 0; var18 < var17.length; var18 += 4) {
                  int var19 = (var17[var18] & 255) << 24 | (var17[var18 + 1] & 255) << 16 | (var17[var18 + 2] & 255) << 8 | var17[var18 + 3] & 255;
                  float var20 = Float.intBitsToFloat(var19);
                  var15.add(var20);
               }
            }
         }

         return var15;
      } else {
         List var5 = var2.RIHOORCROICHOCRCICIRIRRRCCRRCO();
         this.OCHRROICHOHICIOHRCHRCIOROOOOCC.put(var1, var5);

         try (FileOutputStream var6 = new FileOutputStream(var4)) {
            for (short var7 = 0; var7 < var5.size(); var7 += 1024) {
               byte[] var8 = new byte[4096];

               for (int var9 = 0; var9 < 1024 && var7 + var9 < var5.size(); var9++) {
                  int var10 = Float.floatToIntBits((Float)var5.get(var7 + var9));
                  var8[var9 * 4] = (byte)(var10 >> 24);
                  var8[var9 * 4 + 1] = (byte)(var10 >> 16);
                  var8[var9 * 4 + 2] = (byte)(var10 >> 8);
                  var8[var9 * 4 + 3] = (byte)var10;
               }

               var6.write(var8);
            }
         }

         return var5;
      }
   }

   private float COOCCHICCCIIICRHIOCOCIOOORCOCC(float var1) {
      if (var1 <= 0.0F) {
         return 0.0F;
      }

      float var2 = (float)(20.0 * Math.log10(var1));
      return var2 < -48.0F ? 0.0F : (var2 - -48.0F) / 48.0F;
   }

   public String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      Range<Integer> var2,
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3,
      float var4,
      float var5,
      long var6,
      Runnable var8
   ) {
      IRCIIHHICIHRCOCRROCOICRIHHCCHH var9 = var3.OCIOORICROORICROOHROOOIOHORCCR();
      List var10 = var9.HCRHRHHRRIRRCRCIHOIIRIROIHHCHO();
      if (var10 == null) {
         return "";
      }

      int var11 = (Integer)var2.getMaximum() - (Integer)var2.getMinimum();
      File var12 = new File(this.CHIRRIIRRRIORIIRHHHROCIROHRIIO, "audio_cache");
      File var13 = new File(var12, "renders_" + var9.getHash());
      File var14 = new File(
         var13,
         var3.getId()
            + "-"
            + (var9.getKey() == null ? "" : var9.getKey() + "-")
            + var3.COOHHIORORHOORRCHHHIOHROOOHHHR()
            + "-"
            + var11
            + "@"
            + var4
            + "@"
            + var5
            + "-"
            + var6
            + ".png"
      );
      var14.deleteOnExit();
      if (this.IRRROOORRRHRIROHRCIIOCHIHCOHOC.contains(var14.getName())) {
         return this.OCICHOHCCCOHOCHHRCOCOCICIHCHHH.getOrDefault(var3.getId(), "");
      }

      if (var14.exists()) {
         return HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var14, CRICCOOHHHCHOORCICOCOHIHOIRHOO.RHROIROROOHRHROIOCRROOIHCCOIRI);
      }

      this.IRRROOORRRHRIROHRCIIOCHIHCOHOC.add(var14.getName());
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var15 = var3.HIIHOIHOCORCOOHHRCCCRCIIIIHIIH()
         .get("audio");
      RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var16 = var15.HCIORRCRIRHIOIHORHHHRRIRRIROIC().get("volume");
      int var17 = var9.HCRHRHHRRIRRCRCIHOIIRIROIHHCHO().size();
      double var18 = var1.IIICOCHRRRCIIRORCCIHOHHROCIHCH() / 1000.0;
      double var20 = var11 * var18;
      byte var22 = 40;
      int var23 = (int)(var20 * var4);
      if (var23 <= 0) {
         return "";
      }

      if (var23 > 100000) {
         return "";
      }

      float var24 = (float)(var9.RORHHHHIOOCHIRCHOOIOOOCIHCICIH() * var9.IHHIRIIRHRHCIICIHOOOCICRIHOHCO() * var20) / var23;
      double var25 = var9.RORHHHHIOOCHIRCHOOIOOOCIHCICIH() * (var3.COOHHIORORHOORRCHHHIOHROOOHHHR() * var18);
      float var27 = 2.0F;
      BufferedImage var28 = new BufferedImage(var23, var22, 2);
      Graphics2D var29 = var28.createGraphics();
      var29.setColor(Color.white);

      for (float var30 = 0.0F; var30 < var23 && var25 + var30 * var24 < var17; var30 += var27) {
         float var31 = (Float)var16.getAt((int)(var30 / var23 * var11)) / 100.0F;
         float var32 = 0.0F;
         if (var25 + var30 * var24 + var27 < var17) {
            float var33 = 0.0F;

            for (int var34 = 0; var34 < var27; var34++) {
               var33 = Math.max(var33, var9.HCRHRHHRRIRRCRCIHOIIRIROIHHCHO().get((int)(var25 + var30 * var24 + var34)));
            }

            var32 = var33;
         }

         int var37 = var22 / 2;
         float var38 = var32 * var31;
         float var35 = this.COOCCHICCCIIICRHIOCOCIOOORCOCC(var38);
         float var36 = var35 * var37;
         var29.drawLine((int)var30, var37 - (int)var36, (int)var30, var37 + (int)var36);
      }

      var29.dispose();
      this.RCHORRROCCRIRIRCCOHIORIHOOIICR
         .execute(
            () -> {
               try {
                  var14.getParentFile().mkdirs();
                  ImageIO.write(var28, "PNG", var14);
               } catch (IOException var6x) {
                  var6x.printStackTrace();
               }

               this.OCICHOHCCCOHOCHHRCOCOCICIHCHHH
                  .put(
                     var3.getId(),
                     HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var14, CRICCOOHHHCHOORCICOCOHIHOIRHOO.RHROIROROOHRHROIOCRROOIHCCOIRI)
                  );
               this.IRRROOORRRHRIROHRCIIOCHIHCOHOC.remove(var14.getName());
               var8.run();
            }
         );
      return this.OCICHOHCCCOHOCHHRCOCOCICIHCHHH.getOrDefault(var3.getId(), "");
   }

   @Generated
   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(File var1) {
      this.CHIRRIIRRRIORIIRHHHROCIROHRIIO = var1;
   }
}
