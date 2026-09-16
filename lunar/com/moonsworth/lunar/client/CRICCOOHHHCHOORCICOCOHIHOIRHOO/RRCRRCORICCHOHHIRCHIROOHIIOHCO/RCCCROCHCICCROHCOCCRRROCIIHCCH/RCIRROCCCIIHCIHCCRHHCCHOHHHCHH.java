package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCCCROCHCICCROHCOCCRRROCIIHCCH;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.CIOHHCORHRCCRICCCORIHCRHCCCRRR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import io.netty.util.concurrent.DefaultThreadFactory;
import it.unimi.dsi.fastutil.longs.Long2ObjectArrayMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import javax.imageio.ImageIO;
import org.jetbrains.annotations.Nullable;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private static final Path IOCRRCIORIORCHIORRHRCRCRIORCII = new File(
         IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getMcDataDir(), "lunar"
      )
      .toPath();
   private static final Path ORROOHHOICCIOOORHOIIHIOHHRRCCC = IOCRRCIORIORCHIORRHRCRCRIORCII.resolve("minimap");
   private static final int COOCHRROIHIOHIRHCCOCIRRICHOOOR = 512;
   private final ScheduledExecutorService RIRRIOIIHIHCHROCORHIROICHIRRIH = Executors.newSingleThreadScheduledExecutor(
      new DefaultThreadFactory("lunar-map-manager-texture-save-thread", true)
   );
   private final AtomicReference<Long2ObjectMap<int[]>> HCIORRCRRIOCCIOOICCHCICOHICHIR = new AtomicReference<>(new Long2ObjectArrayMap());
   private final AtomicBoolean CIICOHCOIRORCHIRRICRHHHIHCHRIH = new AtomicBoolean(false);
   private final Cache<Long, BufferedImage> CIRCHRIHOCCHRORCRHOOCHCCCIHICH = CacheBuilder.newBuilder().maximumSize(64L).build();
   @Nullable
   private Path COOIOICCIIRROICCORCOCCHICCIHOH;

   RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            CIOHHCORHRCCRICCCORIHCRHCCCRRR.class, var1 -> this.COOIOICCIIRROICCORCOCCHICCIHOH = var1.IHCHHOHHOHCRHHCOCICHRIIRROIOHH().toPath()
         );
   }

   void reset() {
      this.CIRCHRIHOCCHRORCRHOOCHCCCIHICH.invalidateAll();
      this.CIICOHCOIRORCHIRRICRHHHIHCHRIH.set(false);
      this.HCIORRCRRIOCCIOOICCHCICOHICHIR.set(new Long2ObjectArrayMap());
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Long2ObjectMap<int[]> var1) {
      RRCRRCORICCHOHHIRCHIROOHIIOHCO var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .HICRHORRRIHRCCCICRRIHCOIROHRIO();
      if (var2.HOOOHOIOCOOIHCRHRHOCCHCOCRCIRR().get()) {
         Path var3 = this.CRIIRRHHOORCOICRCOICHRIORIIHCH();
         if (var3 != null) {
            this.HCIORRCRRIOCCIOOICCHCICOHICHIR.getAndUpdate(var1x -> {
               Long2ObjectArrayMap var2x = new Long2ObjectArrayMap(var1x);
               var2x.putAll(var1);
               return var2x;
            });
            if (this.CIICOHCOIRORCHIRRICRHHHIHCHRIH.compareAndSet(false, true)) {
               this.RIRRIOIIHIHCHROCORHIROICHIRRIH.schedule(() -> this.IIHRRHORCRCROCHHOHORCHCROCIHRO(var3), 1L, TimeUnit.SECONDS);
            }
         }
      }
   }

   private void IIHRRHORCRCROCHHOHORCHCROCIHRO(Path var1) {
      if (this.CIICOHCOIRORCHIRRICRHHHIHCHRIH.get()) {
         LongOpenHashSet var2 = new LongOpenHashSet();
         Long2ObjectMap var3 = this.HCIORRCRRIOCCIOOICCHCICOHICHIR.getAndSet(new Long2ObjectArrayMap());
         ObjectIterator var4 = var3.long2ObjectEntrySet().iterator();

         while (var4.hasNext()) {
            Entry var5 = (Entry)var4.next();

            try {
               long var6 = var5.getLongKey();
               long var8 = com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCCCROCHCICCROHCOCCRRROCIIHCCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(
                  com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCCCROCHCICCROHCOCCRRROCIIHCCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHRIICOIOORCHCOIICOOIHIRHHICRI(
                     var6
                  ),
                  com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCCCROCHCICCROHCOCCRRROCIIHCCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR(
                     var6
                  )
               );
               BufferedImage var10 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var8);
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var10, var8, var6, (int[])var5.getValue());
               var2.add(var8);
            } catch (Exception var11) {
            }
         }

         if (this.CIICOHCOIRORCHIRRICRHHHIHCHRIH.get()) {
            LongIterator var12 = var2.iterator();

            while (var12.hasNext()) {
               long var13 = (Long)var12.next();
               this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var13);
            }

            this.CIICOHCOIRORCHIRRICRHHHIHCHRIH.set(false);
            if (!this.HCIORRCRRIOCCIOOICCHCICOHICHIR.get().isEmpty() && this.CIICOHCOIRORCHIRRICRHHHIHCHRIH.compareAndSet(false, true)) {
               this.RIRRIOIIHIHCHROCORHIROICHIRRIH.schedule(() -> this.IIHRRHORCRCROCHHOHORCHCROCIHRO(var1), 1L, TimeUnit.SECONDS);
            }
         }
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(BufferedImage var1, long var2, long var4, int[] var6) {
      int var7 = com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCCCROCHCICCROHCOCCRRROCIIHCCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHRIICOIOORCHCOIICOOIHIRHHICRI(
            var4
         )
         - com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCCCROCHCICCROHCOCCRRROCIIHCCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHRIICOIOORCHCOIICOOIHIRHHICRI(
               var2
            )
            * 32;
      int var8 = com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCCCROCHCICCROHCOCCRRROCIIHCCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR(
            var4
         )
         - com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCCCROCHCICCROHCOCCRRROCIIHCCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR(
               var2
            )
            * 32;
      int[] var9 = new int[var6.length];
      boolean var10 = true;

      for (int var11 = 0; var11 < var6.length; var11++) {
         int var12 = var6[var11];
         if (var10 && var12 != 0) {
            var10 = false;
         }

         if (!var10) {
            var9[var11] = OCOHORHCROHICRRIHCIHHRRCIHICRI.OCOHIOCHOCHRCCROORRIIIHIOHOIIR(var12);
         }
      }

      if (!var10) {
         var1.setRGB(var7 * 16, var8 * 16, 16, 16, var9, 0, 16);
      }
   }

   private BufferedImage RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Path var1, long var2) {
      BufferedImage var4 = (BufferedImage)this.CIRCHRIHOCCHRORCRHOOCHCCCIHICH.getIfPresent(var2);
      if (var4 != null) {
         return var4;
      }

      File var5 = this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1, var2);
      BufferedImage var6 = null;
      if (var5.exists()) {
         try {
            var6 = ImageIO.read(var5);
         } catch (IOException var8) {
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
               "Minimap", "Failed to read existing minimap region image " + var5, var8
            );
         }
      }

      if (var6 == null) {
         var6 = new BufferedImage(512, 512, 2);
      }

      this.CIRCHRIHOCCHRORCRHOOCHCCCIHICH.put(var2, var6);
      return var6;
   }

   private void IRCIIHHICIHRCOCRROCOICRIHHCCHH(Path var1, long var2) {
      File var4 = this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1, var2);
      BufferedImage var5 = (BufferedImage)this.CIRCHRIHOCCHRORCRHOOCHCCCIHICH.getIfPresent(var2);
      if (var5 != null) {
         try {
            var4.getParentFile().mkdirs();
            ImageIO.write(var5, "png", var4);
         } catch (IOException var7) {
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
               "Minimap", "Failed to save minimap region image to " + var4, var7
            );
         }
      }
   }

   @Nullable
   Path CRIIRRHHOORCOICRCOICHRIORIIHCH() {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI();
      if (var1.bridge$getWorld() == null) {
         return null;
      }

      Path var2;
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .HICRHORRRIHRCCCICRRIHCOIROHRIO()
         .OOCOOHHOIHCRIHRROHORCCRIOHIHCI()) {
         if (this.COOIOICCIIRROICCORCOCCHICCIHOH == null) {
            return null;
         }

         var2 = this.COOIOICCIIRROICCORCOCCHICCIHOH.resolve("minimap").resolve("images");
      } else {
         var2 = ORROOHHOICCIOOORHOIIHIOHHRRCCC.resolve(OHIROCOCCHORRCCHIOICOCOHRHORCC(IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.HIRHRIOCOCCCORCRICIICOIIIOCOHI()))
            .resolve("images");
      }

      String var3 = var1.bridge$getWorld().bridge$getDimensionKey();
      if (var3 == null) {
         var3 = "dim" + var1.bridge$getWorld().bridge$getDimensionId();
      }

      Path var4 = var2.resolve(OHIROCOCCHORRCCHIOICOCOHRHORCC(var3));
      return !var4.normalize().startsWith(var2.normalize()) ? null : var4;
   }

   private static String OHIROCOCCHORRCCHIOICOCOHRHORCC(String var0) {
      String var1 = var0.replaceAll("[^A-Za-z0-9._-]", "_");
      return var1.isEmpty() ? "_" : var1;
   }

   private File HHCCIRHCCCIIRHCROHIORHIRHHIORH(Path var1, long var2) {
      String var4 = com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCCCROCHCICCROHCOCCRRROCIIHCCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHRIICOIOORCHCOIICOOIHIRHHICRI(
            var2
         )
         + "_"
         + com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCCCROCHCICCROHCOCCRRROCIIHCCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR(
            var2
         )
         + ".png";
      return var1.resolve(var4).toFile();
   }
}
