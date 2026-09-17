package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;

import com.google.gson.JsonObject;
import com.lunarclient.items.ItemsResponse;
import com.lunarclient.items.item.Item;
import com.lunarclient.items.item.skin.Skin;
import com.lunarclient.minecraft.hypixel.skyblock.SkyBlockItemsUtil;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.client.util.COOCCHICCCIIICRHIOCOCIOOORCOCC;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.OCIOROHIHRROROOIRRHRRCCHHRRRHI;
import com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import com.moonsworth.lunar.client.util.ORCOCORROHIROCCIORORRRRCHIOOCH;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import lombok.Generated;

public final class HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   private static final Pattern CHCRRIORHRCOICRHHRRIHIHRHORCRH = Pattern.compile("%%(\\w+)%%");
   public static ItemsResponse IHCIIRORHIHHCIROOHHROCCHRIOHCR;
   public static Item[] items = new Item[0];
   public static final Map<String, Item> CHORHCHRCICCHIICOHIIRROCRHCHHH = new HashMap<>();
   public static final Map<String, String> IORHOHICORROHCRHHOIIRRORHHOOOC = new HashMap<>();
   public static final Map<String, String> HIOHROICIHRRRRIHIRHHIIRRCCHRHO = new HashMap<>();

   public static void onEnable() {
      if (IHCIIRORHIHHCIROOHHROCCHRIOHCR == null || !IHCIIRORHIHHCIROOHHROCCHRIOHCR.success()) {
         ORCOCORROHIROCCIORORRRRCHIOOCH.IOHHOIIOCRHCHHCRORICCOHOHROOIH(
            () -> {
               IHCIIRORHIHHCIROOHHROCCHRIOHCR = SkyBlockItemsUtil.getItemsSync();
               if (IHCIIRORHIHHCIROOHHROCCHRIOHCR != null && IHCIIRORHIHHCIROOHHROCCHRIOHCR.success()) {
                  items = IHCIIRORHIHHCIROOHHROCCHRIOHCR.items();

                  for (Item var3 : items) {
                     CHORHCHRCICCHIICOHIIRROCRHCHHH.put(var3.id(), var3);
                     String var4 = CHCRRIORHRCOICRHHRRIHIHRHORCRH.matcher(var3.name())
                        .replaceAll(
                           var0 -> {
                              try {
                                 String var1 = var0.group(1).toUpperCase(Locale.ROOT);
                                 return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.valueOf(
                                       var1
                                    )
                                    .toString();
                              } catch (IllegalArgumentException var2) {
                                 return var0.group();
                              }
                           }
                        );
                     IORHOHICORROHCRHHOIIRRORHHOOOC.put(var3.id(), var4);
                     HIOHROICIHRRRRIHIRHHIIRRCCHRHO.put(var4, var3.id());
                  }

                  Map var5 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                     .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
                     .IHIIROIOIHOHCHICOIIIHOHHCOIOCI()
                     .ORICRIRORRCHHHRRHOORHIRCICHCCO()
                     .IIORHOCIOCCROROOHRIIRIRCRIHHCC();
                  if (var5 != null) {
                     for (Entry var7 : var5.entrySet()) {
                        String var8 = (String)var7.getKey();
                        String var9 = (String)var7.getValue();
                        IORHOHICORROHCRHHOIIRRORHHOOOC.put(var8, var9);
                        HIOHROICIHRRRRIHIRHHIIRRCCHRHO.put(var9, var8);
                     }
                  }
               }
            }
         );
      }
   }

   @Nullable
   public static IIRHCHHOICHRICOOCRORCCIOOIHOIR HRHRRRIROIRIOOCHROIHCRHIROCOIH(String var0) {
      Item var1 = CHORHCHRCICCHIICOHIIRROCRHCHHH.get(var0);
      return var1 != null ? RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var0) : null;
   }

   @Nullable
   public static IIRHCHHOICHRICOOCRORCCIOOIHOIR RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Item var0, String var1) {
      Skin var2 = var0.skin();
      if (var2 == null) {
         return null;
      }

      String var3 = var2.value();
      String var4 = new String(Base64.getDecoder().decode(var3), StandardCharsets.UTF_8);
      JsonObject var5 = com.moonsworth.lunar.client.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR.ORHHIICRRIOIOHCHHCHHHRCIORCHRI.fromJson(var4, JsonObject.class);
      String var6 = OCIOROHIHRROROOIRRHRRCCHHRRRHI.CCHHHHCICRCCCIOOIOICOOCRCRHCCR(var5.get("profileId").getAsString());
      IIRHCHHOICHRICOOCRORCCIOOIHOIR var7 = CRRRICCRROCOHHOHIICIHORCOORRRH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var6, var3, var2.signature());
      var7.bridge$setStackDisplayName(
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.asAdventure(
            IORHOHICORROHCRHHOIIRRORHHOOOC.get(var1)
         )
      );
      return var7;
   }

   @Nullable
   public static IIRHCHHOICHRICOOCRORCCIOOIHOIR OIIHHROICRCRHOHCCOCIHRHIRIICRC(String var0) {
      Item var1 = CHORHCHRCICCHIICOHIIRROCRHCHHH.get(var0);
      if (var1 == null) {
         return null;
      }

      String var2 = var1.itemModel();
      String var3 = var2 != null && !var2.startsWith("hypixel_skyblock:") ? var2 : var1.material();
      Map var4 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IHIIROIOIHOHCHICOIIIHOHHCOIOCI()
         .ORICRIRORRCHHHRRHOORHIRCICHCCO()
         .CRICRRHOIHCIORRCOHOIHHRICIIHOO();
      if (var4 != null) {
         String var5 = var3 + ":" + var1.durability();
         var3 = var4.getOrDefault(var5, var4.getOrDefault(var3, var3));
      }

      if (var3.equals("SKULL_ITEM") && var1.durability() == 3) {
         IIRHCHHOICHRICOOCRORCCIOOIHOIR var9 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var0);
         if (var9 != null) {
            return var9;
         }
      }

      HRCHROOHRIHCRCRHRIIROCIRHOIRHH var10 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CIHHIHOORIIHCOORRRICHHCCRRRCHO()
         .HCCCIIHICHIROIHHIIHCIIICCORCCR(var3.toLowerCase(Locale.ROOT));
      if (var10 == null) {
         return null;
      }

      IIRHCHHOICHRICOOCRORCCIOOIHOIR var6 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
         .IRCIIHHICIHRCOCRROCOICRIHHCCHH(var10);
      var6.bridge$setFoil(var1.glowing());
      if (var1.color() != null) {
         String[] var7 = var1.color().split(",");
         if (var7.length >= 3) {
            int var8 = OCOHORHCROHICRRIHCIHHRRCIHICRI.OOCCRCRCOHIIORCCORCRCIRRROIOOR(
               COOCCHICCCIIICRHIOCOCIOOORCOCC.IOORROIRICCOCCOOCCIROIIIHRCCCC(var7[0]),
               COOCCHICCCIIICRHIOCOCIOOORCOCC.IOORROIRICCOCCOOCCIROIIIHRCCCC(var7[1]),
               COOCCHICCCIIICRHIOCOCIOOORCOCC.IOORROIRICCOCCOOCCIROIIIHRCCCC(var7[2])
            );
            var6.bridge$setDyedColor(var8);
         }
      }

      if (var2 != null && var2.startsWith("hypixel_skyblock:")) {
         var6.bridge$setItemModel(RCIROOOOICRHCCRRCIORHHIRCOIIIC.create(var2));
      }

      return var6;
   }

   @Generated
   private HHCCIRHCCCIIRHCROHIORHIRHHIORH() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
