package com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI;

import com.google.common.base.CaseFormat;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import lombok.Generated;
import org.jetbrains.annotations.TestOnly;
import org.lwjgl.actually3.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.MemoryUtil;

@TestOnly
public class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   private static int CHOCRCHCIOIHIRIIIIHHRHHHRCCRCC = -1;
   private static final com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI[] ICOHIOOROCCICORCCICCOCOCHCCHHO = new com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI[3];
   private static com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI IIRCCRIIICCRIRCCCIIHIIOROORIRR = null;
   private com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO HCCOHIROHCHOICIORHORIIIOIIOHCO = null;
   private boolean HHROORCOICCHRIIRROHCRHIHORCRRC = true;
   private boolean CCOIRIHRIRRCRCRRIORHCHRORCCOHO = true;
   private boolean CHHRROOIHHICHORRIHCRIICOCORRII = true;
   private boolean RCCRCRCIOIOIICCCIRCOIOOICOOCRO = true;
   private boolean RRICIRRCIRIIRRRIHCOCROICCHCRRH = true;

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
      if (CHOCRCHCIOIHIRIIIIHHRHHHRCCRCC == -1) {
         CHOCRCHCIOIHIRIIIIHHRHHHRCCRCC = GL11.glGetInteger(33307);
      }

      for (int var1 = 0; var1 < Math.min(ICOHIOOROCCICORCCICCOCOCHCCHHO.length, CHOCRCHCIOIHIRIIIIHHRHHHRCCRCC); var1++) {
         if (ICOHIOOROCCICORCCICCOCOCHCCHHO[var1] == null) {
            ICOHIOOROCCICORCCICCOCOCHCCHHO[var1] = CCOIROOCRICIOIHOHCHRRHCCIHCRCO(var1);
         }
      }

      if (IIRCCRIIICCRIRCCCIIHIIOROORIRR == null) {
         Builder var9 = new Builder();
         Builder var2 = new Builder();
         Builder var3 = new Builder();
         Builder var4 = new Builder();

         for (com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var8 : ICOHIOOROCCICORCCICCOCOCHCCHHO) {
            if (var8 != null) {
               var9.putAll(var8.CRICIIRIOIORHCCCIRCRIHIHCCICIC);
               var2.putAll(var8.HHIHHRRICOHORHROHRHRHHRHICORRI);
               var3.putAll(var8.CRROCCCCHHIHRRHCROOIORCRRORRIR);
               var4.putAll(var8.RHOHOOIOOHHCRIORRCROHCIHRHCIOO);
            }
         }

         IIRCCRIIICCRIRCCCIIHIIOROORIRR = new com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
            var9.build(), var2.build(), var3.build(), var4.build()
         );
      }
   }

   public com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH HHCCIOOCCCOCCIHCIIHHRRCIICOIHO(boolean var1) {
      this.HHROORCOICCHRIIRROHCRHIHORCRRC = var1;
      return this;
   }

   public com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH RRIOHRHHRHORRROIIRHRHROICRHCRO(boolean var1) {
      this.CCOIRIHRIRRCRCRRIORHCHRORCCOHO = var1;
      return this;
   }

   public com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH HIRRICOIICIHRRICIOCOOOCOCHHORR(boolean var1) {
      this.CHHRROOIHHICHORRIHCRIICOCORRII = var1;
      return this;
   }

   public com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH CCCCCHHRHOIHHORCHHOCIHHRCHOCRC(boolean var1) {
      this.RCCRCRCIOIOIICCCIRCOIOOICOOCRO = var1;
      return this;
   }

   public com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH OIIHROORCRORRRCOICCCHIOIHIHHRC(boolean var1) {
      this.RRICIRRCIRIIRRRIHCOCROICCHCRRH = var1;
      return this;
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var1, int var2, IntConsumer var3) {
      int var4 = GL11.glGetInteger(var1);
      if (var4 != var2) {
         var3.accept(var4);
         if (this.RRICIRRCIRIIRRRIHCOCROICCHCRRH) {
            System.exit(0);
         }
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var1, boolean var2, BooleanConsumer var3) {
      boolean var4 = GL11.glIsEnabled(var1);
      if (var4 != var2) {
         var3.accept(var4);
         if (this.RRICIRRCIRIIRRRIHCOCROICCHCRRH) {
            System.exit(0);
         }
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var1, int var2, Object var3, Consumer<Object> var4) {
      com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 = IIRCCRIIICCRIRCCCIIHIIOROORIRR.RHOHOOIOOHHCRIORRCROHCIHRHCIOO
         .get(var1);
      if (var5 == null) {
         throw new RuntimeException("GLAnalyser does not contain array information for: " + var1);
      }

      com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var6 = var5.COOCROORIHCHIOOCHHCCOROHHCIIHH;
      Buffer var7 = var6.createBuffer.apply(var6.objectSize * var5.OCOCRORCCRHIOIHCOHOOHHCHHRCROC);
      var6.getData.accept(var1, var7);
      Object var8 = BufferUtils.toArray(var7);
      Object var9 = Array.get(var8, var2);
      MemoryUtil.memFree(var7);
      if (var9 != var3) {
         var4.accept(var9);
         if (this.RRICIRRCIRIIRRRIHCOCROICCHCRRH) {
            System.exit(0);
         }
      }
   }

   public void start() {
      com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var1 = new com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO();
      if (this.HHROORCOICCHRIIRROHCRHIHORCRRC) {
         for (Integer var3 : IIRCCRIIICCRIRCCCIIHIIOROORIRR.CRICIIRIOIORHCCCIRCRIHIHCCICIC.keySet()) {
            var1.OCROCROOOICCRICROIIHRRHHHHOHRC.put(var3, GL11.glGetInteger(var3));
         }
      }

      if (this.CCOIRIHRIRRCRCRRIORHCHRORCCOHO) {
         for (Integer var11 : IIRCCRIIICCRIRCCCIIHIIOROORIRR.HHIHHRRICOHORHROHRHRHHRHICORRI.keySet()) {
            var1.OICROOIHCRHRCCOIHCOIIRIOHRCOIH.put(var11, GL11.glIsEnabled(var11));
         }
      }

      if (this.CHHRROOIHHICHORRIHCRIICOCORRII) {
         for (Integer var12 : IIRCCRIIICCRIRCCCIIHIIOROORIRR.CRROCCCCHHIHRRHCROOIORCRRORRIR.keySet()) {
            var1.IRCIOCROORHORCRHOOOCCHHIOCCRHO.put(var12, GL11.glGetInteger(var12));
         }
      }

      if (this.RCCRCRCIOIOIICCCIRCOIOOICOOCRO) {
         for (Entry var13 : IIRCCRIIICCRIRCCCIIHIIOROORIRR.RHOHOOIOOHHCRIORRCROHCIHRHCIOO.entrySet()) {
            Integer var4 = (Integer)var13.getKey();
            com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 = (com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var13.getValue();
            com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var6 = var5.COOCROORIHCHIOOCHHCCOROHHCIIHH;
            Buffer var7 = var6.createBuffer.apply(var6.objectSize * var5.OCOCRORCCRHIOIHCOHOOHHCHHRCROC);
            var6.getData.accept(var4, var7);
            var1.RROOOCRCORCHCRRIRCRIIHHHHROOHO.put(var4, BufferUtils.toArray(var7));
            MemoryUtil.memFree(var7);
         }
      }

      this.HCCOHIROHCHOICIORHORIIIOIIOHCO = var1;
   }

   public void OCCOCOOOCOIORORRHOCHIRIOCRHCCO() {
      try {
         if (this.HCCOHIROHCHOICIORHORIIIOIIOHCO == null) {
            throw new Exception("GlAnalyser requires you to run start() before analyse()!");
         }

         StringBuilder var1 = new StringBuilder();
         var1.append("\nOpenGl: ")
            .append(GL11.glGetString(7938))
            .append(" - Major Version: ")
            .append(CHOCRCHCIOIHIRIIIIHHRHHHRCCRCC)
            .append("\n========================= GL Analysis =========================\n");
         StringBuilder var2 = new StringBuilder();
         StringBuilder var3 = new StringBuilder();
         if (this.HHROORCOICCHRIIRROHCRHIHORCRRC) {
            RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var2, IIRCCRIIICCRIRCCCIIHIIOROORIRR.CRICIIRIOIORHCCCIRCRIHIHCCICIC, this.HCCOHIROHCHOICIORHORIIIOIIOHCO.OCROCROOOICCRICROIIHRRHHHHOHRC, "s"
            );
         }

         if (this.CCOIRIHRIRRCRCRRIORHCHRORCCOHO) {
            HHCCIRHCCCIIRHCROHIORHIRHHIORH(
               var2, IIRCCRIIICCRIRCCCIIHIIOROORIRR.HHIHHRRICOHORHROHRHRHHRHICORRI, this.HCCOHIROHCHOICIORHORIIIOIIOHCO.OICROOIHCRHRCCOIHCOIIRIOHRCOIH, "c"
            );
         }

         if (this.CHHRROOIHHICHORRIHCRIICOCORRII) {
            IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               var2, IIRCCRIIICCRIRCCCIIHIIOROORIRR.CRROCCCCHHIHRRHCROOIORCRRORRIR, this.HCCOHIROHCHOICIORHORIIIOIIOHCO.IRCIOCROORHORCRHOOOCCHHIOCCRHO, "p"
            );
         }

         if (this.RCCRCRCIOIOIICCCIRCOIOOICOOCRO) {
            CRRRICCRROCOHHOHIICIHORCOORRRH(
               var3, IIRCCRIIICCRIRCCCIIHIIOROORIRR.RHOHOOIOOHHCRIORRCROHCIHRHCIOO, this.HCCOHIROHCHOICIORHORIIIOIIOHCO.RROOOCRCORCHCRRIRCRIIHHHHROOHO, "a"
            );
         }

         if (var2.isEmpty() && var3.isEmpty()) {
            var1.append("\n\nNo changes where found between points!");
         } else {
            if (!var2.isEmpty()) {
               var1.append("\n ++++ Single State Changes ++++\n")
                  .append("%-3s%-30s%-20s%-45s%-45s%n".formatted("ID", "Name", "Change", "Get Method", "Set Method"))
                  .append(var2);
               var1.append("\nExample:\n---------------------------------------------------------------\n")
                  .append("var lastValue = <GetMethod>;\n**Run Code Here**\n<SetMethod>;\n---------------------------------------------------------------\n");
            }

            if (!var3.isEmpty()) {
               if (!var2.isEmpty()) {
                  var1.append("\n===============================================================\n");
               }

               var1.append("\n ++++ Array State Changes ++++\n")
                  .append("%-3s%-20s%-30s%-72s%-80s%n".formatted("ID", "Name", "Create Buffer", "Get Method", "Change"))
                  .append(var3);
               var1.append("\nExample:\n---------------------------------------------------------------\n")
                  .append(
                     "var buffer = <CreateBufferMethod>; \n<GetMethod>;\n# Access the buffer object, changes are reflected.\n# Use `BufferUtils.toArray()` to get it as an array!\n---------------------------------------------------------------"
                  );
            }

            var1.append("\n\n===============================================================\n\n");
         }

         System.out.println(var1);
         if (this.RRICIRRCIRIIRRRIHCOCROICCHCRRH) {
            System.exit(0);
         }
      } catch (Throwable var4) {
         throw var4;
      }
   }

   public void dump() {
      try {
         StringBuilder var1 = new StringBuilder();
         var1.append("\n ===================================\n ======= Dumping OpenGL Info =======\n ===================================\n");
         if (this.HHROORCOICCHRIIRROHCRHIHORCRRC) {
            var1.append("\n ========== Single States ==========\n");
            RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, IIRCCRIIICCRIRCCCIIHIIOROORIRR.CRICIIRIOIORHCCCIRCRIHIHCCICIC, "s");
         }

         if (this.CCOIRIHRIRRCRCRRIORHCHRORCCOHO) {
            var1.append("\n ========== Capabilities ===========\n");
            HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1, IIRCCRIIICCRIRCCCIIHIIOROORIRR.HHIHHRRICOHORHROHRHRHHRHICORRI, "c");
         }

         if (this.CHHRROOIHHICHORRIHCRIICOCORRII) {
            var1.append("\n ========== Pixel Stores ===========\n");
            IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, IIRCCRIIICCRIRCCCIIHIIOROORIRR.CRROCCCCHHIHRRHCROOIORCRRORRIR, "p");
         }

         if (this.RCCRCRCIOIOIICCCIRCOIOOICOOCRO) {
            var1.append("\n ============= Arrays ==============\n");
            CRRRICCRROCOHHOHIICIHORCOORRRH(var1, IIRCCRIIICCRIRCCCIIHIIOROORIRR.RHOHOOIOOHHCRIORRCROHCIHRHCIOO, "a");
         }

         var1.append("\n ===================================\n");
         System.out.println(var1);
         if (this.RRICIRRCIRIIRRRIHCOCROICCHCRRH) {
            System.exit(0);
         }
      } catch (Throwable var2) {
         throw var2;
      }
   }

   private static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      StringBuilder var0,
      Map<Integer, com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH> var1,
      Map<Integer, Integer> var2,
      String var3
   ) {
      for (Entry var5 : var1.entrySet()) {
         int var6 = (Integer)var5.getKey();
         int var7 = (Integer)var2.get(var6);
         int var8 = GL11.glGetInteger(var6);
         if (var7 != var8) {
            com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var9 = (com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var5.getValue();
            var0.append(
               "%-3s%-30s%-20s%-45s%-45s%n"
                  .formatted(
                     var3,
                     var9.CCOCHOHRHORHIRORIOHRHCOOIIRIHR,
                     var7 + " -> " + var8,
                     var9.IHIRIOOIIHCCOCHCIOCCOROIOOHCHC.getMethod().formatted(var9.CCOCHOHRHORHIRORIOHRHCOOIIRIHR),
                     var9.CRIRCRHOORCROIOHORIIHRICIRCRIR.formatted("lastValue")
                  )
            );
         }
      }
   }

   private static void IRCIIHHICIHRCOCRROCOICRIHHCCHH(StringBuilder var0, Map<Integer, String> var1, Map<Integer, Integer> var2, String var3) {
      for (Entry var5 : var1.entrySet()) {
         int var6 = (Integer)var5.getKey();
         int var7 = (Integer)var2.get(var6);
         int var8 = GL11.glGetInteger(var6);
         if (var7 != var8) {
            String var9 = (String)var5.getValue();
            var0.append("%-3s%-30s%-20s%-45s%-45s%n".formatted(var3, var9, var7 + " -> " + var8, "glGetInteger(" + var9 + ")", "glPixelStorei(lastValue)"));
         }
      }
   }

   private static void HHCCIRHCCCIIRHCROHIORHIRHHIORH(StringBuilder var0, Map<Integer, String> var1, Map<Integer, Boolean> var2, String var3) {
      for (Entry var5 : var1.entrySet()) {
         int var6 = (Integer)var5.getKey();
         boolean var7 = (Boolean)var2.get(var6);
         boolean var8 = GL11.glIsEnabled(var6);
         if (var7 != var8) {
            String var9 = (String)var5.getValue();
            var0.append(
               "%-3s%-30s%-20s%-45s%-45s%n"
                  .formatted(var3, var9, var7 + " -> " + var8, "glIsEnabled(" + var9 + ")", (var7 ? "glEnable(" : "glDisable(") + var9 + ")")
            );
         }
      }
   }

   private static void CRRRICCRROCOHHOHIICIHORCOORRRH(
      StringBuilder var0,
      Map<Integer, com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var1,
      Map<Integer, Object> var2,
      String var3
   ) {
      for (Entry var5 : var1.entrySet()) {
         int var6 = (Integer)var5.getKey();
         com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var7 = (com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var5.getValue();
         Object var8 = var2.get(var6);
         com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var9 = var7.COOCROORIHCHIOOCHHCCOROHHCIIHH;
         Buffer var10 = var9.createBuffer.apply(var9.objectSize * var7.OCOCRORCCRHIOIHCOHOOHHCHHRCROC);
         var9.getData.accept(var6, var10);
         Object var11 = BufferUtils.toArray(var10);
         MemoryUtil.memFree(var10);
         if (!com.moonsworth.lunar.client.util.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var8, var11)) {
            var0.append(
               "%-3s%-20s%-30s%-72s%-80s%n"
                  .formatted(
                     var3,
                     var7.HIORCRHCHRCOCHIRIIROCOHICOHRCR,
                     var9.method.formatted(var9.objectSize * var7.OCOCRORCCRHIOIHCOHOOHHCHHRCROC),
                     "BridgeManager.getGlHelper().bridge$glGet"
                        + CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, var9.name())
                        + "v("
                        + var7.HIORCRHCHRCOCHIRIIROCOHICOHRCR
                        + ", buffer)",
                     com.moonsworth.lunar.client.util.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCIIROIOORRIOIIIRHIRRCCIIRRROH(var8)
                        + " -> "
                        + com.moonsworth.lunar.client.util.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCIIROIOORRIOIIIRHIRRCCIIRRROH(var11)
                  )
            );
            return;
         }
      }
   }

   private static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      StringBuilder var0,
      Map<Integer, com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH> var1,
      String var2
   ) {
      for (Entry var4 : var1.entrySet()) {
         int var5 = (Integer)var4.getKey();
         int var6 = GL11.glGetInteger(var5);
         com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var7 = (com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var4.getValue();
         var0.append("%-3s%-30s%-40s%n".formatted(var2, var7.CCOCHOHRHORHIRORIOHRHCOOIIRIHR, var6));
      }
   }

   private static void IRCIIHHICIHRCOCRROCOICRIHHCCHH(StringBuilder var0, Map<Integer, String> var1, String var2) {
      for (Entry var4 : var1.entrySet()) {
         int var5 = (Integer)var4.getKey();
         int var6 = GL11.glGetInteger(var5);
         String var7 = (String)var4.getValue();
         var0.append("%-3s%-30s%-40s%n".formatted(var2, var7, var6));
      }
   }

   private static void HHCCIRHCCCIIRHCROHIORHIRHHIORH(StringBuilder var0, Map<Integer, String> var1, String var2) {
      for (Entry var4 : var1.entrySet()) {
         int var5 = (Integer)var4.getKey();
         boolean var6 = GL11.glIsEnabled(var5);
         String var7 = (String)var4.getValue();
         var0.append("%-3s%-30s%-40s%n".formatted(var2, var7, var6));
      }
   }

   private static void CRRRICCRROCOHHOHIICIHORCOORRRH(
      StringBuilder var0,
      Map<Integer, com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var1,
      String var2
   ) {
      for (Entry var4 : var1.entrySet()) {
         int var5 = (Integer)var4.getKey();
         com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 = (com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var4.getValue();
         com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var7 = var6.COOCROORIHCHIOOCHHCCOROHHCIIHH;
         Buffer var8 = var7.createBuffer.apply(var7.objectSize * var6.OCOCRORCCRHIOIHCOHOOHHCHHRCROC);
         var7.getData.accept(var5, var8);
         Object var9 = BufferUtils.toArray(var8);
         MemoryUtil.memFree(var8);
         var0.append(
            "%-3s%-20s%-80s%n"
               .formatted(
                  var2,
                  var6.HIORCRHCHRCOCHIRIIROCOHICOHRCR,
                  com.moonsworth.lunar.client.util.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCIIROIOORRIOIIIRHIRRCCIIRRROH(var9)
               )
         );
      }
   }

   private static com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI CCOIROOCRICIOIHOHCHRRHCCIHCRCO(
      int var0
   ) {
      return switch (var0) {
         case 1 -> {
            Builder var6 = ImmutableMap.builder();
            var6.put(
                  32873,
                  com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     "GL_TEXTURE_BINDING_2D",
                     com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.INTEGER,
                     "GL11.glBindTexture(GL_TEXTURE_2D, %s)"
                  )
               )
               .put(
                  34016,
                  com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     "GL_ACTIVE_TEXTURE",
                     com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.INTEGER,
                     "GL13.glActiveTexture(%s)"
                  )
               )
               .put(
                  34964,
                  com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     "GL_ARRAY_BUFFER_BINDING",
                     com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.INTEGER,
                     "GL15.glBindBuffer(GL_ARRAY_BUFFER, %s)"
                  )
               )
               .put(
                  32969,
                  com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     "GL_BLEND_SRC_RGB",
                     com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.INTEGER,
                     "GL14.glBlendFuncSeparate(%s, blendDst, blendSrcAlpha, blendDstAlpha)"
                  )
               )
               .put(
                  32968,
                  com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     "GL_BLEND_DST_RGB",
                     com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.INTEGER,
                     "GL14.glBlendFuncSeparate(blendSrc, %s, blendSrcAlpha, blendDstAlpha)"
                  )
               )
               .put(
                  32971,
                  com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     "GL_BLEND_SRC_ALPHA",
                     com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.INTEGER,
                     "GL14.glBlendFuncSeparate(blendSrc, blendDst, %s, blendDstAlpha)"
                  )
               )
               .put(
                  32970,
                  com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     "GL_BLEND_DST_ALPHA",
                     com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.INTEGER,
                     "GL14.glBlendFuncSeparate(blendSrc, blendDst, blendSrcAlpha, %s)"
                  )
               );
            Builder var7 = ImmutableMap.builder();
            var7.put(3042, "GL_BLEND")
               .put(3058, "GL_COLOR_LOGIC_OP")
               .put(2884, "GL_CULL_FACE")
               .put(2929, "GL_DEPTH_TEST")
               .put(3024, "GL_DITHER")
               .put(2848, "GL_LINE_SMOOTH")
               .put(32823, "GL_POLYGON_OFFSET_FILL")
               .put(10754, "GL_POLYGON_OFFSET_LINE")
               .put(10753, "GL_POLYGON_OFFSET_POINT")
               .put(2881, "GL_POLYGON_SMOOTH")
               .put(3089, "GL_SCISSOR_TEST")
               .put(2960, "GL_STENCIL_TEST")
               .put(32925, "GL_MULTISAMPLE")
               .put(32926, "GL_SAMPLE_ALPHA_TO_COVERAGE")
               .put(32927, "GL_SAMPLE_ALPHA_TO_ONE")
               .put(32928, "GL_SAMPLE_COVERAGE");
            Builder var3 = ImmutableMap.builder();
            var3.put(3328, "GL_PACK_SWAP_BYTES")
               .put(3329, "GL_PACK_LSB_FIRST")
               .put(3330, "GL_PACK_ROW_LENGTH")
               .put(32876, "GL_PACK_IMAGE_HEIGHT")
               .put(3332, "GL_PACK_SKIP_PIXELS")
               .put(3331, "GL_PACK_SKIP_ROWS")
               .put(32875, "GL_PACK_SKIP_IMAGES")
               .put(3333, "GL_PACK_ALIGNMENT")
               .put(3312, "GL_UNPACK_SWAP_BYTES")
               .put(3313, "GL_UNPACK_LSB_FIRST")
               .put(3314, "GL_UNPACK_ROW_LENGTH")
               .put(32878, "GL_UNPACK_IMAGE_HEIGHT")
               .put(3316, "GL_UNPACK_SKIP_PIXELS")
               .put(3315, "GL_UNPACK_SKIP_ROWS")
               .put(32877, "GL_UNPACK_SKIP_IMAGES")
               .put(3317, "GL_UNPACK_ALIGNMENT");
            Builder var4 = ImmutableMap.builder();
            var4.put(
                  2978,
                  com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     "GL_VIEWPORT",
                     com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.INTEGER,
                     4
                  )
               )
               .put(
                  3088,
                  com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     "GL_SCISSOR_BOX",
                     com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.INTEGER,
                     4
                  )
               );
            yield new com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
               var6.build(), var7.build(), var3.build(), var4.build()
            );
         }
         case 2 -> {
            Builder var5 = ImmutableMap.builder();
            var5.put(
                  35725,
                  com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     "GL_CURRENT_PROGRAM",
                     com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.INTEGER,
                     "GL20.glUseProgram(%s)"
                  )
               )
               .put(
                  32777,
                  com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     "GL_BLEND_EQUATION_RGB",
                     com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.INTEGER,
                     "GL20.glBlendEquationSeparate(%s, blendEquationAlpha)"
                  )
               )
               .put(
                  34877,
                  com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     "GL_BLEND_EQUATION_ALPHA",
                     com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.INTEGER,
                     "GL20.glBlendEquationSeparate(blendEquationRgb, %s)"
                  )
               );
            yield new com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
               var5.build(), Map.of(), Map.of(), Map.of()
            );
         }
         case 3 -> {
            Builder var1 = ImmutableMap.builder();
            var1.put(
                  35097,
                  com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     "GL_SAMPLER_BINDING",
                     com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.INTEGER,
                     "GL33.glBindSampler(0, %s)"
                  )
               )
               .put(
                  34229,
                  com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     "GL_VERTEX_ARRAY_BINDING",
                     com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.INTEGER,
                     "GL30.glBindVertexArray(%s)"
                  )
               );
            Builder var2 = ImmutableMap.builder();
            var2.put(34383, "GL_DEPTH_CLAMP")
               .put(36281, "GL_FRAMEBUFFER_SRGB")
               .put(34370, "GL_PROGRAM_POINT_SIZE")
               .put(35977, "GL_RASTERIZER_DISCARD")
               .put(36433, "GL_SAMPLE_MASK");
            yield new com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
               var1.build(), var2.build(), Map.of(), Map.of()
            );
         }
         default -> null;
      };
   }

   enum CRRRICCRROCOHHOHIICIHORCOORRRH {
      BOOLEAN("GL11.glGetBoolean(%s)"),
      INTEGER("GL11.glGetInteger(%s)"),
      DOUBLE("GL11.glGetDouble(%s)"),
      FLOAT("GL11.glGetFloat(%s)"),
      POINTER("GL11.glGetPointer(%s)"),
      STRING("GL11.glGetString(%s)");

      private final String method;

      @Generated
      public String getMethod() {
         return this.method;
      }

      @Generated
      CRRRICCRROCOHHOHIICIHORCOORRRH(String var3) {
         this.method = var3;
      }
   }

   static class HHCCIRHCCCIIRHCROHIORHIRHHIORH {
      private final String CCOCHOHRHORHIRORIOHRHCOOIIRIHR;
      private final com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH IHIRIOOIIHCCOCHCIOCCOROIOOHCHC;
      private final String CRIRCRHOORCROIOHORIIHRICIRCRIR;

      public static com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         String var0,
         com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH var1,
         String var2
      ) {
         return new com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var0, var1, var2);
      }

      @Generated
      public HHCCIRHCCCIIRHCROHIORHIRHHIORH(
         String var1,
         com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH var2,
         String var3
      ) {
         this.CCOCHOHRHORHIRORIOHRHCOOIIRIHR = var1;
         this.IHIRIOOIIHCCOCHCIOCCOROIOOHCHC = var2;
         this.CRIRCRHOORCROIOHORIIHRICIRCRIR = var3;
      }
   }

   enum IRCIIHHICIHRCOCRROCOICRIHHCCHH {
      BOOLEAN(
         "MemoryUtil.memAlloc(%s)",
         1,
         MemoryUtil::memAlloc,
         (var0, var1) -> com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHHROCORIHCIORRRIIOHIRHCRIOH()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, (ByteBuffer)var1)
      ),
      INTEGER(
         "MemoryUtil.memAllocInt(%s)",
         4,
         MemoryUtil::memAllocInt,
         (var0, var1) -> com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHHROCORIHCIORRRIIOHIRHCRIOH()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, (IntBuffer)var1)
      ),
      FLOAT(
         "MemoryUtil.memAllocFloat(%s)",
         4,
         MemoryUtil::memAllocFloat,
         (var0, var1) -> com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHHROCORIHCIORRRIIOHIRHCRIOH()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, (FloatBuffer)var1)
      ),
      DOUBLE(
         "MemoryUtil.memAllocDouble(%s)",
         8,
         MemoryUtil::memAllocDouble,
         (var0, var1) -> com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHHROCORIHCIORRRIIOHIRHCRIOH()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, (DoubleBuffer)var1)
      );

      private final String method;
      private final int objectSize;
      private final IntFunction<Buffer> createBuffer;
      private final BiConsumer<Integer, Buffer> getData;

      @Generated
      public String getMethod() {
         return this.method;
      }

      @Generated
      public int getObjectSize() {
         return this.objectSize;
      }

      @Generated
      public IntFunction<Buffer> getCreateBuffer() {
         return this.createBuffer;
      }

      @Generated
      public BiConsumer<Integer, Buffer> getGetData() {
         return this.getData;
      }

      @Generated
      IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var3, int var4, IntFunction<Buffer> var5, BiConsumer<Integer, Buffer> var6) {
         this.method = var3;
         this.objectSize = var4;
         this.createBuffer = var5;
         this.getData = var6;
      }
   }

   static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      private final String HIORCRHCHRCOCHIRIIROCOHICOHRCR;
      private final com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH COOCROORIHCHIOOCHHCCOROHHCIIHH;
      private final int OCOCRORCCRHIOIHCOHOOHHCHHRCROC;

      public static com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         String var0, com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1, int var2
      ) {
         return new com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, var2);
      }

      @Generated
      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         String var1, com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2, int var3
      ) {
         this.HIORCRHCHRCOCHIRIIROCOHICOHRCR = var1;
         this.COOCROORIHCHIOOCHHCCOROHHCIIHH = var2;
         this.OCOCRORCCRHIOIHCOHOOHHCHHRCROC = var3;
      }
   }

   static class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI {
      private final Map<Integer, com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH> CRICIIRIOIORHCCCIRCRIHIHCCICIC;
      private final Map<Integer, String> HHIHHRRICOHORHROHRHRHHRHICORRI;
      private final Map<Integer, String> CRROCCCCHHIHRRHCROOIORCRRORRIR;
      private final Map<Integer, com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> RHOHOOIOOHHCRIORRCROHCIHRHCIOO;

      @Generated
      public RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
         Map<Integer, com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH> var1,
         Map<Integer, String> var2,
         Map<Integer, String> var3,
         Map<Integer, com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var4
      ) {
         this.CRICIIRIOIORHCCCIRCRIHIHCCICIC = var1;
         this.HHIHHRRICOHORHROHRHRHHRHICORRI = var2;
         this.CRROCCCCHHIHRRHCROOIORCRRORRIR = var3;
         this.RHOHOOIOOHHCRIORRCROHCIHRHCIOO = var4;
      }
   }

   static class RRCRRCORICCHOHHIRCHIROOHIIOHCO {
      private final Map<Integer, Integer> OCROCROOOICCRICROIIHRRHHHHOHRC = new HashMap<>();
      private final Map<Integer, Boolean> OICROOIHCRHRCCOIHCOIIRIOHRCOIH = new HashMap<>();
      private final Map<Integer, Integer> IRCIOCROORHORCRHOOOCCHHIOCCRHO = new HashMap<>();
      private final Map<Integer, Object> RROOOCRCORCHCRRIRCRIIHHHHROOHO = new HashMap<>();
   }
}
