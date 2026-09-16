package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityPigZombie;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(EntityMob.class)
public abstract class CRRRICCRROCOHHOHIICIHORCOORRRH implements OOROOCCIRCCRHOIOIORIHCHHOOCCOR {
   public boolean bridge$isHostile() {
      EntityMob var2 = (EntityMob)this;
      return var2 instanceof EntityPigZombie var1 ? var1.angerLevel > 0 : true;
   }
}
