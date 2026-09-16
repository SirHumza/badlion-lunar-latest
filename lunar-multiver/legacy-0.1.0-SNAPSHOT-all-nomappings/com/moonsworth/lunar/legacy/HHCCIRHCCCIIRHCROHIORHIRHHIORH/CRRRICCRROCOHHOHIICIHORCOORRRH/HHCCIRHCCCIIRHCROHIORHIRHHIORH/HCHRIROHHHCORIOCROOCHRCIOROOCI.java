package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.CRHROHHHCIHHCOHCOORCRIHHIICROR;
import com.moonsworth.lunar.lib.adventure.text.Component;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiSubtitleOverlay.Subtitle;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
@Mixin(Subtitle.class)
public abstract class HCHRIROHHHCORIOCROOCHRCIOROOCI
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR {
   @Shadow
   public abstract String getString();

   @Shadow
   public abstract long getStartTime();

   @Shadow
   public abstract Vec3d getLocation();

   public Component bridge$getText() {
      return Component.text(this.getString());
   }

   public long bridge$getAliveTime() {
      return Minecraft.getSystemTime() - this.getStartTime();
   }

   public CRHROHHHCIHHCOHCOORCRIHHIICROR bridge$getLocation() {
      return (CRHROHHHCIHHCOHCOORCRIHHIICROR)this.getLocation();
   }
}
