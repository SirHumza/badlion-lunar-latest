package com.moonsworth.lunar.client.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import net.minecraft.client.renderer.Tessellator;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends Tessellator {
   private IRCIIHHICIHRCOCRROCOICRIHHCCHH IIIRRCRHHOCOROOHRCOHHHCHICCOOI;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      super(0);
      this.worldRenderer = this.IIIRRCRHHOCOROOHRCOHHHCHICCOOI = new IRCIIHHICIHRCOCRROCOICRIHHCCHH(Tessellator.instance.worldRenderer);
   }

   public void draw() {
      this.IIIRRCRHHOCOROOHRCOHHHCHICCOOI.flush();
      Tessellator.instance.draw();
   }
}
