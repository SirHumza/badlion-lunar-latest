package com.moonsworth.lunar.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public String bridge$getEntityString(CRRRICCRROCOHHOHIICIHORCOORRRH var1) {
      ResourceLocation var2 = EntityList.getKey((Entity)var1);
      if (var2 != null) {
         EntityEntry var3 = (EntityEntry)ForgeRegistries.ENTITIES.getValue(var2);
         if (var3 != null) {
            return var3.name;
         }
      }

      return "";
   }

   public int bridge$getEntityId(String var1) {
      EntityEntry var2 = (EntityEntry)ForgeRegistries.ENTITIES.getValue(new ResourceLocation(var1));
      return var2 == null ? -1 : EntityList.getID(var2.cls);
   }
}
