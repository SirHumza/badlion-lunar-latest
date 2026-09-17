package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;

import com.google.common.base.CaseFormat;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HICRRICCHCCROOHHCHOCOCCHOIHHOC;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IHHCHHHCRIHOOCOIOOCRIIICIOROIR;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HCHRIROHHHCORIOCROOCHRCIOROOCI;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.OHHRIOHROOIHOROCIRHCHORIHRRRRI;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO;
import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRRCCOICORICIHCHRHIHIHROIRHOCR;
import com.moonsworth.lunar.client.util.CRHROHHHCIHHCOHCOORCRIHHIICROR;
import com.moonsworth.lunar.client.util.ICOHIIIRCIORCORHRRROOOOCOOROIC;
import com.moonsworth.lunar.client.util.IRRCHICCRHCHRRCHIOHIIRIORIRHRI;
import com.moonsworth.lunar.client.util.RIROICHCRROROHCCROOCCCCOCHCCRI;
import java.awt.Color;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import org.jetbrains.annotations.Nullable;

public class RRCRRCORICCHOHHIRCHIROOHIIOHCO
   extends com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH<String, CRRRICCRROCOHHOHIICIHORCOORRRH>
   implements HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   @Nullable
   public static final Path IHIHCCICIHOOIOHOIHHROOCCCRHRIH;
   public static final CRRRICCRROCOHHOHIICIHORCOORRRH HCOCRRRRRRHOOHHCRHOCCICCOCRCHH = new CRRRICCRROCOHHOHIICIHORCOORRRH(null, null, null, null);
   private com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OOIRRRHOHHOOICCCHRRICOOHIICOOR;
   private JsonObject ROHHRORIRCHRRRCIHICHOIOIOCIORC = new JsonObject();
   private CompletableFuture<HttpResponse<String>> CCIICHRHOIHCRIHRHCHRRHRCHIRIOR;

   public RRCRRCORICCHOHHIRCHIROOHIIOHCO() {
      if (IHIHCCICIHOOIOHOIHHROOCCCRHRIH != null) {
         this.OOIRRRHOHHOOICCCHRRICOOHIICOOR = new com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
      } else if (com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.MOD_METADATA
         .isEnabled()) {
         this.HCCOOCIRIROORCOCCIHIIIHHRORROH();
      }
   }

   public CRRRICCRROCOHHOHIICIHORCOORRRH OIRHOOHORRRROHHOCHIRCRHRCHICRC(String var1) {
      if (IHIHCCICIHOOIOHOIHHROOCCCRHRIH != null) {
         return HCOCRRRRRRHOOHHCRHOCCICCOCRCHH;
      }

      if (this.CCIICHRHOIHCRIHRHCHRRHRCHIRIOR != null) {
         try {
            HttpResponse var2 = this.CCIICHRHOIHCRIHRHCHRRHRCHIRIOR.get();
            if (var2.statusCode() == 200) {
               String var3 = (String)var2.body();
               Gson var4 = new GsonBuilder().setLenient().create();
               JsonObject var5 = var4.fromJson(var3, JsonObject.class);

               try {
                  if (var5.has("mods")) {
                     this.load(var5);
                  } else {
                     this.OHRRCRHHCOHOHHCORRROHROOCOCCHH();
                  }
               } catch (IOException var11) {
                  var11.printStackTrace();
                  this.OHRRCRHHCOHOHHCORRROHROOCOCCHH();
               }
            } else {
               this.OHRRCRHHCOHOHHCORRROHROOCOCCHH();
            }
         } catch (InterruptedException | ExecutionException var12) {
            var12.printStackTrace();
            this.OHRRCRHHCOHOHHCORRROHROOCOCCHH();
         } finally {
            this.CCIICHRHOIHCRIHRHCHRRHRCHIRIOR = null;
         }
      }

      return this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR().getOrDefault(var1, HCOCRRRRRRHOOHHCRHOCCICCOCRCHH);
   }

   public void HICRRICCHCCROOHHCHOCOCCHOIHHOC(Set<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH> var1) {
      var1.forEach(var1x -> {
         RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var2 = var1x.IHCRORHRORIICHRHRCHRRIRRHHOCOO(HICRRICCHCCROOHHCHOCOCCHOIHHOC.RRIIOCRCRHHRORCROHRRIOCCHROORO);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1x.getId(), var1x, var2);
      });
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      String var1,
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2,
      @Nullable RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var3
   ) {
      Set var4;
      Set var5;
      Set var6;
      if (var3 != null) {
         var4 = new HashSet();

         for (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var8 : var3.CCCCRRHICIRRIIRCIRROOROHRCRIRI()) {
            if (var8 == com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CCCIRORHIRRORROOOOCCHCRIORHOIC) {
               return;
            }

            var4.add(var8.getName());
         }

         var5 = var3.HRROOHIHRHIOIOIRHHRIROOOHRORRH();
         var6 = var3.OROIRHIOOCCCHRCICICCHRRHIIRRCR();
      } else {
         var4 = Collections.emptySet();
         var5 = Collections.emptySet();
         var6 = Collections.emptySet();
      }

      CRRRICCRROCOHHOHIICIHORCOORRRH var12 = new CRRRICCRROCOHHOHIICIHORCOORRRH(var5, var4, var6, null);
      this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR().put(var1, var12);
      LinkedList var13 = new LinkedList();
      var2.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRIIIRORRHRROOOIRHROOOIIHIHIRH)
         .flatMap(CORCOCICIRIOHROHROIIOOHICCHCRR::OCIOICIOHHHIRIOCIHCHHCCHRRRIHI)
         .ifPresent(var13::add);
      IHHCHHHCRIHOOCOIOOCRIIICIOROIR var9 = var2.IHCRORHRORIICHRHRCHRRIRRHHOCOO(HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRHCCHCRHIHOCRICOHOIICHCHOHICC);
      if (var9 != null) {
         for (HCHRIROHHHCORIOCROOCHRCIOROOCI var11 : var9.CRCOOHOOOCRICHRCCIOCCIRCCOHCRO()) {
            if (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var11)) {
               var13.add(var11);
            }
         }
      }

      this.OOIRRRHOHHOOICCCHRRICOOHIICOOR
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, new HHCCIRHCCCIIRHCROHIORHIRHHIORH(var12.HROCROICOIHCCHOHCORORCIORCCOCC(var1) + ".details", var13));
   }

   @Override
   protected Map<String, CRRRICCRROCOHHOHIICIHORCOORRRH> HOIHRIHCOICOOORCIORHOCRCRRCRHI() {
      return new HashMap<>();
   }

   @Override
   public String OCHOCOHHHIOCRIOIOOIHOHRIIIHHOC() {
      return "mod_fallback.json";
   }

   @Override
   public void load(JsonObject var1) {
      var1 = var1.get("mods").getAsJsonObject();
      this.ROHHRORIRCHRRRCIHICHOIOIOCIORC = var1;
      Gson var2 = new Gson();
      Map var3 = this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR();
      var3.clear();

      for (Entry var5 : var1.entrySet()) {
         var3.put((String)var5.getKey(), var2.fromJson((JsonElement)var5.getValue(), CRRRICCRROCOHHOHIICIHORCOORRRH.class));
      }

      this.HRIIIOIIRHOHORIRICIOIORRIRCHHO();
   }

   @Override
   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(JsonObject var1) {
      var1.add("mods", this.ROHHRORIRCHRRRCIHICHOIOIOCIORC);
   }

   public void HCCOOCIRIROORCOCCIHIIIHHRORROH() {
      try {
         HttpRequest var1 = HttpRequest.newBuilder()
            .uri(URI.create(RIROICHCRROROHCCROOCCCCOCHCCRI.RHCCCIOHCRHIICRCHIOCHICHOHRCCR() + "/game/metadata/mod"))
            .header("X-Installation-Id", IRRCHICCRHCHRRCHIOHIIRIORIRHRI.CIIRORRIRORRRHCROCICCCHIHOHRCR)
            .header("X-Overwolf-Muid", IRRCHICCRHCHRRCHIOHIIRIORIRHRI.OOROIOCCRCOROORRIOOOICRHHRIHHC)
            .GET()
            .build();
         this.CCIICHRHOIHCRIHRHCHRRHRCHIRIOR = HttpClient.newHttpClient().sendAsync(var1, BodyHandlers.ofString());
      } catch (Exception var2) {
         var2.printStackTrace();
         this.OHRRCRHHCOHOHHCORRROHROOCOCCHH();
      }
   }

   @Override
   public void close() {
      if (IHIHCCICIHOOIOHOIHHROOCCCRHRIH != null) {
         this.RRIRRRHCCIRHOCOIRROHCCRHCOHHIC();

         try {
            this.OOIRRRHOHHOOICCCHRRICOOHIICOOR.RICRIRRCOHRCOCRRHHCRHRROOIOHHR(IHIHCCICIHOOIOHOIHHROOCCCRHRIH.resolve("api"));
            this.HICRRICCHCCROOHHCHOCOCCHOIHHOC(IHIHCCICIHOOIOHOIHHROOCCCRHRIH);
         } catch (IOException var2) {
            throw new RuntimeException(var2);
         }

         System.exit(0);
      } else {
         this.clear();
         this.ROHHRORIRCHRRRCIHICHOIOIOCIORC = null;
      }
   }

   private void RRIRRRHCCIRHOCOIRROHCCRHCOHHIC() {
      Gson var1 = new GsonBuilder()
         .setPrettyPrinting()
         .registerTypeAdapter(String.class, new CRHROHHHCIHHCOHCOORCRIHHIICROR.CRRRICCRROCOHHOHIICIHORCOORRRH())
         .registerTypeHierarchyAdapter(Set.class, new CRHROHHHCIHHCOHCOORCRIHHIICROR.HHCCIRHCCCIIRHCROHIORHIRHHIORH())
         .registerTypeHierarchyAdapter(Map.class, new CRHROHHHCIHHCOHCOORCRIHHIICROR.IRCIIHHICIHRCOCRROCOICRIHHCCHH())
         .create();
      JsonObject var2 = var1.fromJson(var1.toJson(this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR()), JsonObject.class);
      JsonObject var3 = new JsonObject();
      var3.add("mods", var2);
      File var4 = Paths.get(".").normalize().toAbsolutePath().toFile();
      File var5 = new File(var4, "mod_metadata.json");

      try {
         var4.mkdirs();
         var5.createNewFile();
         var1.toJson(var3, new FileWriter(var5));
      } catch (IOException var7) {
         var7.printStackTrace();
      }
   }

   private void HICRRICCHCCROOHHCHOCOCCHOIHHOC(Path var1) {
      Path var2 = var1.resolve("docs").resolve("developers").resolve("mods");
      Files.createDirectories(var2);
      IRRCCOICORICIHCHRHIHIHROIRHOCR var3 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .CCHHHHCICRCCCIOOIOICOOCRCRHCCR();
      String var4 = "_meta.json";
      File var5 = var2.resolve(var4).toFile();
      var5.createNewFile();
      FileWriter var6 = new FileWriter(var5, false);
      var6.write("{\n");
      List var7 = this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR().entrySet().stream().sorted(Entry.comparingByKey()).toList();
      int var8 = 0;

      for (Entry var10 : var7) {
         String var11 = (String)var10.getKey();
         CRRRICCRROCOHHOHIICIHORCOORRRH var12 = (CRRRICCRROCOHHOHIICIHORCOORRRH)var10.getValue();
         String var13 = var12.HROCROICOIHCCHOHCORORCIORCCOCC(var11) + ".details";
         String var14 = ICOHIIIRCIORCORHRRROOOOCOOROIC.OOCCRCRCOHIIORCCORCRCIRRROIOOR(var11, false).toLowerCase() + ".mdx";
         File var15 = var2.resolve(var14).toFile();
         var15.createNewFile();
         var8++;
         String var16 = var8 != this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR().entrySet().size() ? "," : "";
         var6.write(
            com.moonsworth.lunar.client.util.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRHRHOOHRRICOHRHHOCRCCHHRIIIHR(1)
               + "\""
               + var14.replace(".mdx", "")
               + "\": \""
               + ICOHIIIRCIORCORHRRROOOOCOOROIC.OOCCRCRCOHIIORCCORCRCIRRROIOOR(var11, true)
               + "\""
               + var16
               + "\n"
         );
         FileWriter var17 = new FileWriter(var15, false);
         String var18 = var3.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var13, "name");
         var17.write("# " + var18 + "\n\n");
         String var19 = var3.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var13, "description");
         if (!"description".equals(var19)) {
            var17.write(var19 + "\n\n");
         }

         var17.write("## Integration\n\n");
         var17.write("### How to toggle the mod\n\n");
         var17.write(
            "```java\npublic void toggle%sExample(Player viewer, boolean value) {\n    Optional<ApolloPlayer> apolloPlayerOpt = Apollo.getPlayerManager().getPlayer(viewer.getUniqueId());\n    apolloPlayerOpt.ifPresent(apolloPlayer -> this.modSettingModule.getOptions().set(apolloPlayer, %s.ENABLED, value));\n}\n```\n\n"
               .formatted(var18.replaceAll("[ ./]", ""), "Mod" + HOIIRICIHIHCOCHIHHICIIOOOCICOO(var11))
         );
         var17.write("## Available options\n\n");

         for (HCHRIROHHHCORIOCROOCHRCIOROOCI var22 : this.OOIRRRHOHHOOICCCHRRICOOHIICOOR.getOptions(var11)) {
            Object var23 = var22.get();
            String var24 = OHHRIOHROOIHOROCIRHCHORIHRRRRI.class.isAssignableFrom(var22.HRIOIIOORCRIRCROHOHRIRIIRRCCOR())
               ? "String"
               : var23.getClass().getSimpleName();
            String var25 = var22.CHIIRICICCCIIRRRICIICCCIIHHRRO();
            String var26 = var25 + "Description";
            String var27 = var22.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var26);
            var17.write("- __`" + ICOHIIIRCIORCORHRRROOOOCOOROIC.RHIIORHOIHHICHORHRIRHIIROCHOHO(var22.getId()) + "`__\n");
            if (!var26.equals(var27)) {
               var17.write("    - " + var27 + "\n");
            }

            var17.write("    - Config Key: `" + CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_HYPHEN, var25) + "`\n");
            var17.write("    - Values\n");
            var17.write("        - Type: `" + var24 + "`\n");
            var17.write("        - Default: `" + RRCRRCORICCHOHHIRCHIROOHIIOHCO(var22, var23) + "`\n");
            if (!OHHRIOHROOIHOROCIRHCHORIHRRRRI.class.isAssignableFrom(var22.HRIOIIOORCRIRCROHOHRIRIIRRCCOR())) {
               com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var28 = var22.IHCRORHRORIICHRHRCHRRIRRHHOCOO(
                  CRICCOOHHHCHOORCICOCOHIHOIRHOO.CHOCCRCCIRIHOROCHHICOHHHOICHHH
               );
               if (var28 != null) {
                  var17.write("        - Minimum: `" + RRCRRCORICCHOHHIRCHIROOHIIOHCO(var22, var28.getMin()) + "`\n");
                  var17.write("        - Maximum: `" + RRCRRCORICCHOHHIRCHIROOHIIOHCO(var22, var28.getMax()) + "`\n\n");
               } else {
                  var17.write("\n");
               }
            } else {
               var17.write("\n");
            }
         }

         var17.close();
      }

      var6.write("}");
      var6.close();
   }

   public static boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HCHRIROHHHCORIOCROOCHRCIOROOCI<?> var0) {
      return !var0.ICICIOCHHHIHOCHCOHORIHRCOHHOCR(CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRROHCRHORRICIOHCIIHHHORHHHHHH)
            && var0.ICICIOCHHHIHOCHCOHORIHRCOHHOCR(CRICCOOHHHCHOORCICOCOHIHOIRHOO.COIIHHRHOCRHHHCICCIHOHHOCICORR)
         ? var0.ICICIOCHHHIHOCHCOHORIHRCOHHOCR(CRICCOOHHHCHOORCICOCOHIHOIRHOO.CHOCCRCCIRIHOROCHHICOHHHOICHHH) || var0.getDefaultValue() instanceof Boolean
         : false;
   }

   protected static String HOIIRICIHIHCOCHIHHICIIOOOCICOO(String var0) {
      return ICOHIIIRCIORCORHRRROOOOCOOROIC.OOCCRCRCOHIIORCCORCRCIRRROIOOR(var0.replace('.', '_'), true);
   }

   protected static String CRRRICCRROCOHHOHIICIHORCOORRRH(HCHRIROHHHCORIOCROOCHRCIOROOCI<?> var0, Object var1) {
      if (var1 instanceof Integer var2 && OHHRIOHROOIHOROCIRHCHORIHRRRRI.class.isAssignableFrom(var0.HRIOIIOORCRIRCROHOHRIRIIRRCCOR())) {
         Color var3 = new Color(var2, true);
         int var4 = var3.getRed();
         int var5 = var3.getGreen();
         int var6 = var3.getBlue();
         int var7 = var3.getAlpha();
         return var7 < 255 ? String.format("new Color(%d, %d, %d, %d)", var4, var5, var6, var7) : String.format("new Color(%d, %d, %d)", var4, var5, var6);
      } else {
         return var1.toString() + HOIHOROOIOOCOIHCRIRIRIRRICIIHC(var1);
      }
   }

   protected static String RRCRRCORICCHOHHIRCHIROOHIIOHCO(HCHRIROHHHCORIOCROOCHRCIOROOCI<?> var0, Object var1) {
      return var1 instanceof Integer var2 && OHHRIOHROOIHOROCIRHCHORIHRRRRI.class.isAssignableFrom(var0.HRIOIIOORCRIRCROHOHRIRIIRRCCOR())
         ? "#" + Integer.toHexString(var2).toUpperCase()
         : var1.toString() + HOIHOROOIOOCOIHCRIRIRIRRICIIHC(var1);
   }

   protected static String HOIHOROOIOOCOIHCRIRIRIRRICIIHC(Object var0) {
      if (var0 instanceof Float) {
         return "F";
      } else if (var0 instanceof Double) {
         return "D";
      } else {
         return var0 instanceof Long ? "L" : "";
      }
   }

   static {
      String var0 = System.getProperty("lunar.generateModClasses");
      IHIHCCICIHOOIOHOIHHROOCCCRHRIH = var0 != null && !var0.isEmpty() ? Path.of(var0) : null;
   }

   public record RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      private final String OCCRRIOHORRIORCRCCRHCRIHCIOOCR;
      private final com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH ICHROORHCHRORRCIHHHHIOCOOHHORO;
      private final RIOOCHICIHRHOHCCCCCHOCCCOHCRHI IHRIOIHIOIIHOORRRROOOOCCRCHRIH;
      private final boolean IRHCRRIHRRIOHCRRIICRCRHCOCRIIR;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         String var1,
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2,
         RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var3,
         boolean var4
      ) {
         this.OCCRRIOHORRIORCRCCRHCRIHCIOOCR = var1;
         this.ICHROORHCHRORRCIHHHHIOCOOHHORO = var2;
         this.IHRIOIHIOIIHOORRRROOOOCCRCHRIH = var3;
         this.IRHCRRIHRRIOHCRRIICRCRHCOCRIIR = var4;
      }

      public String CIHHHHHRRORHCIHIRROROROICRIHIR() {
         return this.OCCRRIOHORRIORCRCCRHCRIHCIOOCR;
      }

      public com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH OHRCHIRROOOIRCRIIOCRHCCIRRHCIC() {
         return this.ICHROORHCHRORRCIHHHHIOCOOHHORO;
      }

      public RIOOCHICIHRHOHCCCCCHOCCCOHCRHI IOIHRHHRICOOOHHOORCCICICIRIOCH() {
         return this.IHRIOIHIOIIHOORRRROOOOCCRCHRIH;
      }

      public boolean enabledByDefault() {
         return this.IRHCRRIHRRIOHCRRIICRCRHCOCRIIR;
      }
   }
}
