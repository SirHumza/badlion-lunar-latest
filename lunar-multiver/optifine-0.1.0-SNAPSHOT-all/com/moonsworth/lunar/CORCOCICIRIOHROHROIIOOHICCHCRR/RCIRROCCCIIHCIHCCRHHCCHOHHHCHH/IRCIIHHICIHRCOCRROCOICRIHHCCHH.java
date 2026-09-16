package com.moonsworth.lunar.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.ichor.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IIHRRHORCRCROCHHOHORCHCROCIHRO;
import com.nothome.delta.GDiffPatcher;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.regex.Pattern;

public final class IRCIIHHICIHRCOCRROCOICRIHHCCHH implements com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private static final Map<String, List<String>> CIHROCRIRIRRCIIRCOOHICHRCIIIRC = Map.of(
      "v1_7", List.of(), "v1_8", List.of("bot"), "v1_12", List.of("cgb"), "v1_16", List.of(), "v1_17", List.of()
   );
   private final com.moonsworth.lunar.CORCOCICIRIOHROHROIIOOHICCHCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH HOOIIRRHCRRCHRRICRORCIROCOORIH;
   private final Map<String, byte[]> IRRCCOHCHHOIRHICOHIROHIRRORCOO;
   private final Map<String, byte[]> CCIOIRRHHHCOCCIHCCCICCCCCRHCRI;
   private final List<IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> ORCCCHRRCOCHHHCOCRHHICOHCCCOOR;
   private boolean initialized = false;
   private final File HOIICORRRRHHRIIOCCIIRIIOOOCORR;
   private final boolean OCIOHIHOROHOCORHCRCORRIRRIHRCR;

   public CORCOCICIRIOHROHROIIOOHICCHCRR[] RIRHOCHIORCCIIOIIRHOCCCRHHCHHH() {
      return new CORCOCICIRIOHROHROIIOOHICCHCRR[]{com.moonsworth.lunar.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OPTIFINE_PATCH};
   }

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(com.moonsworth.lunar.CORCOCICIRIOHROHROIIOOHICCHCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1, File var2, boolean var3) {
      this.HOOIIRRHCRRCHRRICRORCIROCOORIH = var1;
      this.IRRCCOHCHHOIRHICOHIROHIRRORCOO = new ConcurrentHashMap<>();
      this.CCIOIRRHHHCOCCIHCCCICCCCCRHCRI = new ConcurrentHashMap<>();
      this.ORCCCHRRCOCHHHCOCRHHICOHCCCOOR = new LinkedList<>();
      this.HOIICORRRRHHRIIOCCIIRIIOOOCORR = var2;
      this.OCIOHIHOROHOCORHCRCORRIRRIHRCR = var3;
   }

   public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1) {
      return !var1.className().contains("/") || var1.className().startsWith("com/mojang/blaze3d/") || var1.className().startsWith("net/minecraft/");
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public byte[] IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var1, byte[] var2, com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3) {
      try {
         if (this.OCIOHIHOROHOCORHCRCORRIRRIHRCR) {
            com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 = com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCIIROIOORRIOIIIRHIRRCCIIRRROH(
               var3.IHIRRIIORRHORHRORIHOROIRCORCOO().ICRROHROHHOHRRRIIHORIRICHRCOIC().OIIOOOICRROIHRIROICHOCOHIHHRHH()
            );
            List var5 = CIHROCRIRIRRCIIRCOOHICHRCIIIRC.get(var4.getId());
            if (var5 != null && var5.contains(var1)) {
               com.moonsworth.lunar.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OIIOOIIHICRRIOHCCRCOIICICRRCRO
                  .info("Skipping OptiFine patch for " + var1, new Object[0]);
               return var2;
            }
         }

         this.CCOHHCRIIHHCOCHIORCCOHCICORHCC();
         String var15 = var1 + ".class";
         byte[] var16 = this.IRRCCOHCHHOIRHICOHIROHIRRORCOO.get(var15);
         if (var16 != null) {
            InputStream var6 = Thread.currentThread().getContextClassLoader().getResourceAsStream(var15);
            if (var6 == null) {
               return var2;
            }

            byte[] var7 = com.moonsworth.lunar.ichor.util.HHCCIRHCCCIIRHCROHIORHIRHHIORH.toByteArray(var6);
            ByteArrayInputStream var8 = new ByteArrayInputStream(var16);
            ByteArrayOutputStream var9 = new ByteArrayOutputStream();
            byte[] var10 = var7;

            try {
               GDiffPatcher var11 = new GDiffPatcher();
               var11.patch(var7, var8, var9);
               var10 = var9.toByteArray();
            } catch (EOFException var12) {
               var10 = var9.toByteArray();
            } catch (IOException var13) {
               var13.printStackTrace();
            }

            return var10;
         } else {
            return var2;
         }
      } catch (Throwable var14) {
         throw var14;
      }
   }

   @IIHRRHORCRCROCHHOHORCHCROCIHRO
   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(com.moonsworth.lunar.ichor.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      String var2 = var1.CHRROHIRHRCRHHCRCHHIIRHOCHHCOO();
      byte[] var3 = var1.CIIRICRCHCORHRIOHCHHCOHCOROIOR();
      this.CCOHHCRIIHHCOCHIORCCOHCICORHCC();

      try {
         for (IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 : this.ORCCCHRRCOCHHHCOCRHHICOHCCCOOR) {
            if (var5.IHHCRCCHCCIIOCOHOOHCHOHIRRCICH.matcher(var1.CHRROHIRHRCRHHCRCHHIIRHOCHHCOO()).matches()) {
               if (!"*".equals(var5.CHOHHOHRRROCOHOCCOCOHCCIOCRICR)) {
                  var1.HRHIRCRROIHRIOHCOOCCHIHCCROHRR(var5.CHOHHOHRRROCOHOCCOCOHCCIOCRICR);
               }

               if (var3 == null && !var1.CHRROHIRHRCRHHCRCHHIIRHOCHHCOO().equals(var2)) {
                  InputStream var6 = Thread.currentThread().getContextClassLoader().getResourceAsStream(var1.CHRROHIRHRCRHHCRCHHIIRHOCHHCOO());
                  if (var6 != null) {
                     var3 = com.moonsworth.lunar.ichor.util.HHCCIRHCCCIIRHCROHIORHIRHHIORH.toByteArray(var6);
                  }
               }
               break;
            }
         }

         byte[] var12 = this.IRRCCOHCHHOIRHICOHIROHIRRORCOO.get(var1.CHRROHIRHRCRHHCRCHHIIRHOCHHCOO());
         if (var3 == null) {
            var3 = this.CCIOIRRHHHCOCCIHCCCICCCCCRHCRI.get(var1.CHRROHIRHRCRHHCRCHHIIRHOCHHCOO());
         }

         if (var12 != null && var3 != null) {
            ByteArrayInputStream var13 = new ByteArrayInputStream(var12);
            ByteArrayOutputStream var14 = new ByteArrayOutputStream();

            try {
               GDiffPatcher var7 = new GDiffPatcher();
               var7.patch(var3, var13, var14);
               var3 = var14.toByteArray();
            } catch (EOFException var8) {
               var3 = var14.toByteArray();
            } catch (IOException var9) {
               var9.printStackTrace();
            } catch (NullPointerException var10) {
               throw new IllegalStateException("Failed to patch " + var1.CHRROHIRHRCRHHCRCHHIIRHOCHHCOO(), var10);
            }
         }

         var1.OHCIIOCHHOHOHCOHHCRRHHCRHOIICC(var3);
      } catch (IOException var11) {
         var11.printStackTrace();
      }
   }

   private void CCOHHCRIIHHCOCHIORCCOHCICORHCC() {
      if (!this.initialized) {
         this.initialized = true;
         this.IIHCHCHIHHHCRRRIIRORRCICCICIHI();
      }
   }

   private void IIHCHCHIHHHCRRRIIRORRCICCICIHI() {
      try (JarFile var1 = new JarFile(this.HOIICORRRRHHRIIOCCIIRIIOOOCORR)) {
         Enumeration var2 = var1.entries();

         while (var2.hasMoreElements()) {
            JarEntry var3 = (JarEntry)var2.nextElement();
            String var4 = var3.getName();
            if (var4.startsWith("patch/") && var4.endsWith(".xdelta")) {
               JarEntry var19 = var1.getJarEntry(var4);
               InputStream var21 = var1.getInputStream(var19);
               byte[] var23 = com.moonsworth.lunar.ichor.util.HHCCIRHCCCIIRHCROHIORHIRHHIORH.toByteArray(var21);
               this.HOOIIRRHCRRCHRRICRORCIROCOORIH.getFileFilter().apply(var4).ifPresent(var2x -> {
                  String var3x = var2x.substring(6, var2x.lastIndexOf(46));
                  this.IRRCCOHCHHOIRHICOHIROHIRRORCOO.put(var3x, var23);
               });
            } else if (var4.startsWith("assets/")) {
               JarEntry var18 = var1.getJarEntry(var4);
               InputStream var20 = var1.getInputStream(var18);
               byte[] var22 = com.moonsworth.lunar.ichor.util.HHCCIRHCCCIIRHCROHIORHIRHHIORH.toByteArray(var20);
               this.CCIOIRRHHHCOCCIHCCCICCCCCRHCRI.put(var4, var22);
            } else if (var4.equals("patch.cfg")) {
               JarEntry var5 = var1.getJarEntry(var4);
               byte[] var6 = com.moonsworth.lunar.ichor.util.HHCCIRHCCCIIRHCROHIORHIRHHIORH.toByteArray(var1.getInputStream(var5));
               String[] var7 = new String(var6).split("\n");

               for (String var11 : var7) {
                  if (!var11.startsWith("#") && var11.contains("=")) {
                     String[] var12 = var11.split("=");
                     assert var12.length == 2 : String.format("Illegal pattern in OptiFine patch.cfg: %s", var11);
                     Pattern var13 = Pattern.compile(var12[0].trim());
                     String var14 = var12[1].trim();
                     this.ORCCCHRRCOCHHHCOCRHHICOHCCCOOR.add(new IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var13, var14));
                  }
               }
            }
         }
      } catch (Throwable var17) {
         throw var17;
      }
   }

   private record RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      private final Pattern IHHCRCCHCCIIOCOHOOHCHOHIRRCICH;
      private final String CHOHHOHRRROCOHOCCOCOHCCIOCRICR;

      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Pattern var1, String var2) {
         this.IHHCRCCHCCIIOCOHOOHCHOHIRRCICH = var1;
         this.CHOHHOHRRROCOHOCCOCOHCCIOCRICR = var2;
      }

      public Pattern IROOCIIRICCORROHOIHIOCRRRCIHRH() {
         return this.IHHCRCCHCCIIOCOHOOHCHOHIRRCICH;
      }

      public String OHIOOOOHICIOIHRIICICCHHIIIRCIR() {
         return this.CHOHHOHRRROCOHOCCOCOHCCIOCRICR;
      }
   }
}
