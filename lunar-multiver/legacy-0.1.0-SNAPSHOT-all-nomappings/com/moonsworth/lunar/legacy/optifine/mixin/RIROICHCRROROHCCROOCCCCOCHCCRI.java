package com.moonsworth.lunar.legacy.optifine.mixin;

import net.optifine.shaders.Program;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
@Mixin(Program.class)
public abstract class RIROICHCRROROHCCROOCCCCOCHCCRI
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR {
   @Shadow
   public int id;

   public int getId() {
      return this.id;
   }
}
