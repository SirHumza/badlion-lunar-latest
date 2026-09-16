package net.optifine.gui;

import java.awt.Rectangle;

public interface TooltipProvider {
   Rectangle getTooltipBounds(axu var1, int var2, int var3);

   String[] getTooltipLines(avs var1, int var2);

   boolean isRenderBorder();
}
