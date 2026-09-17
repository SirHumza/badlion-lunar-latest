package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap.Builder;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public class IHHCHHHCRIHOOCOIOOCRIIICIOROIR
   implements com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR> {
   private static final BiMap<Integer, String> ICCIOIRIIRHORIRHIHIHRCHOCCRICH = new Builder()
      .put(1, "item")
      .put(2, "experience_orb")
      .put(3, "area_effect_cloud")
      .put(4, "elder_guardian")
      .put(5, "wither_skeleton")
      .put(6, "stray")
      .put(7, "egg")
      .put(8, "leash_knot")
      .put(9, "painting")
      .put(10, "arrow")
      .put(11, "snowball")
      .put(12, "fireball")
      .put(13, "small_fireball")
      .put(14, "ender_pearl")
      .put(15, "eye_of_ender")
      .put(16, "potion")
      .put(17, "experience_bottle")
      .put(18, "item_frame")
      .put(19, "wither_skull")
      .put(20, "tnt")
      .put(21, "falling_block")
      .put(22, "firework_rocket")
      .put(23, "husk")
      .put(24, "spectral_arrow")
      .put(25, "shulker_bullet")
      .put(26, "dragon_fireball")
      .put(27, "zombie_villager")
      .put(28, "skeleton_horse")
      .put(29, "zombie_horse")
      .put(30, "armor_stand")
      .put(31, "donkey")
      .put(32, "mule")
      .put(33, "evoker_fangs")
      .put(34, "evoker")
      .put(35, "vex")
      .put(36, "vindicator")
      .put(37, "illusioner")
      .put(40, "command_block_minecart")
      .put(41, "null")
      .put(42, "minecart")
      .put(43, "chest_minecart")
      .put(44, "furnace_minecart")
      .put(45, "tnt_minecart")
      .put(46, "hopper_minecart")
      .put(47, "spawner_minecart")
      .put(50, "creeper")
      .put(51, "skeleton")
      .put(52, "spider")
      .put(53, "giant")
      .put(54, "zombie")
      .put(55, "slime")
      .put(56, "ghast")
      .put(57, "zombified_piglin")
      .put(58, "enderman")
      .put(59, "cave_spider")
      .put(60, "silverfish")
      .put(61, "blaze")
      .put(62, "magma_cube")
      .put(63, "ender_dragon")
      .put(64, "wither")
      .put(65, "bat")
      .put(66, "witch")
      .put(67, "endermite")
      .put(68, "guardian")
      .put(69, "shulker")
      .put(90, "pig")
      .put(91, "sheep")
      .put(92, "cow")
      .put(93, "chicken")
      .put(94, "squid")
      .put(95, "wolf")
      .put(96, "mooshroom")
      .put(97, "snow_golem")
      .put(98, "ocelot")
      .put(99, "iron_golem")
      .put(100, "horse")
      .put(101, "rabbit")
      .put(102, "polar_bear")
      .put(103, "llama")
      .put(104, "llama_spit")
      .put(105, "parrot")
      .put(120, "villager")
      .put(200, "end_crystal")
      .build();

   @NotNull
   @Override
   public String RRIICCIOCHRHOHIRIHCHRHOCOROOCC() {
      return "spawn_eggs";
   }

   public boolean HICRRICCHCCROOHHCHOCOCCHOIHHOC(@NotNull IIRHCHHOICHRICOOCRORCCIOOIHOIR var1) {
      String var2 = var1.bridge$getItemRegistryName();
      return "minecraft:spawn_egg".equals(var2) || "minecraft:monster_egg".equals(var2) || var2.endsWith("_spawn_egg");
   }

   @NotNull
   public CRRRICCRROCOHHOHIICIHORCOORRRH ORHIOICIOCRRHOOCOHRORIHICHRCRR(@NotNull IIRHCHHOICHRICOOCRORCCIOOIHOIR var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION > 5) {
         return com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHIRRIIORRHORHRORIHOROIRCORCOO(
               var1
            )
            .map(
               var0 -> com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.OOIHOHCIIRORIOHIRRRORHHHIIIHCH(
                  var0.replace("_spawn_egg", "")
               )
            )
            .orElse(
               com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.OORIOHCICHIHCIRRIIOHCCHCIHCOIH()
            );
      }

      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 5) {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var5 = var1.bridge$getTagCompound();
         if (var5 != null && var5.bridge$contains("EntityTag", 10)) {
            var5 = var5.bridge$getCompoundTag("EntityTag");
            String var3 = var5.bridge$getString("id");
            if (var3 != null) {
               int var4 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRHHRCHIRRCHICHIORIICHRCHOCHR()
                  .bridge$getEntityId(var3);
               return com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.OOIHOHCIIRORIOHIRRRORHHHIIIHCH(
                  (String)ICCIOIRIIRHORIRHIHIHRCHOCCRICH.get(var4)
               );
            }
         }

         return com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.OORIOHCICHIHCIRRIIOHCCHCIHCOIH();
      } else {
         int var2 = var1.bridge$getItemDamage();
         return com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.OOIHOHCIIRORIOHIRRRORHHHIIIHCH(
            (String)ICCIOIRIIRHORIRHIHIHRCHOCCRICH.get(var2)
         );
      }
   }

   @Override
   public Optional<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      @NotNull CRRRICCRROCOHHOHIICIHORCOORRRH var1
   ) {
      if (var1.isEmpty()) {
         return com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ICHHRRHHCCCCIRHCORIHIRHHOCHIOO(
            "minecraft:spawn_egg"
         );
      }

      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION > 5) {
         return com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ICHHRRHHCCCCIRHCORIHIRHHOCHIOO(
            "minecraft:" + var1.value() + "_spawn_egg"
         );
      }

      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR var2 = com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHIOICROIRRRIROHIHICIRRHCCIRHO(
         "minecraft:spawn_egg"
      );
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 5) {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
            .RRCROCCRIOIROHCCRCCIORICOCIOHC();
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
            .RRCROCCRIOIROHCCRCCIORICOCIOHC();
         var4.bridge$putString("id", "minecraft:" + var1.value());
         var3.bridge$putCompound("EntityTag", var4);
         var2.bridge$setTagCompound(var3);
      } else {
         Integer var5 = (Integer)ICCIOIRIIRHORIRHIHIHRCHOCCRICH.inverse().get(var1.value());
         if (var5 != null) {
            var2.bridge$setItemDamage(var5);
         }
      }

      return com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHRIICOIOORCHCOIICOOIHIRHHICRI(
         var2
      );
   }
}
