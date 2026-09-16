package com.moonsworth.lunar.legacy.wrapper.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.IIHRRHORCRCROCHHOHORCHCROCIHRO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.lib.adventure.text.Component;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import lombok.Generated;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.translation.I18n;

public class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public IIHRRHORCRCROCHHOHORCHCROCIHRO ICRRHRIICIRRCIHIHRHCHIIOHRROOR() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? new RRCRRCORICCHOHHIRCHIROOHIIOHCO(EntityRabbit::new) : null;
   }

   public IIHRRHORCRCROCHHOHORCHCROCIHRO HHOHHHOICCCOOHHIOOHHORHOROIHOH() {
      return new RRCRRCORICCHOHHIRCHIROOHIIOHCO(EntityCreeper::new);
   }

   public IIHRRHORCRCROCHHOHORCHCROCIHRO OCHRHCOIIRIOOCCRCROHOIHHIHIROI() {
      return new RRCRRCORICCHOHHIRCHIROOHIIOHCO(EntityChicken::new);
   }

   public Map<String, Class<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH>> OCOCRRIRIORIROOICHRIROHOIHIOHH() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 0) {
         return EntityList.stringToClassMapping$v1_7;
      }

      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 1) {
         return EntityList.stringToClassMapping$v1_8;
      }

      HashMap var1 = new HashMap();

      for (ResourceLocation var3 : EntityList.getEntityNameList$v1_12()) {
         if (var3.getNamespace$v1_12().equals("minecraft")) {
            String var4 = EntityList.getTranslationName$v1_12(var3);
            if (var4 != null) {
               var1.put(var4, EntityList.getClassFromName$v1_12(var3.toString()));
            }
         }
      }

      return var1;
   }

   public Component OHCIOCCCOHCCHHOCCHOIHRHOHCICOR(String var1) {
      String var2 = "entity." + var1 + ".name";
      String var3 = I18n.translateToLocal(var2);
      return var3 != null && !var2.equals(var3) && !var3.equalsIgnoreCase("unknown") ? Component.text(var3) : Component.empty();
   }

   public int bridge$getEntityId(String var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 0) {
         Integer var4 = (Integer)EntityList.stringToIDMapping$v1_7.get(var1);
         return var4 == null ? -1 : var4;
      }

      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 1) {
         return (Integer)EntityList.stringToIDMapping$v1_8.get(var1);
      }

      Optional var2 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHHCHIIHOOHRROCRRRHHHCOOHCOORC();
      if (var2.isPresent()) {
         return ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var2.get())
            .bridge$getEntityId(var1);
      }

      Class var3 = (Class)EntityList.REGISTRY$v1_12.getObject(ResourceLocation.newInstance(var1));
      return var3 == null ? -1 : EntityList.REGISTRY$v1_12.getIDForObject(var3);
   }
}
