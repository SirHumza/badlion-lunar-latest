package net.optifine.gui;

import java.awt.Rectangle;
import java.util.Arrays;
import java.util.List;

public class TooltipManager {
   private axu guiScreen;
   private TooltipProvider tooltipProvider;
   private int lastMouseX = 0;
   private int lastMouseY = 0;
   private long mouseStillTime = 0L;

   public TooltipManager(axu guiScreen, TooltipProvider tooltipProvider) {
      this.guiScreen = guiScreen;
      this.tooltipProvider = tooltipProvider;
   }

   public void drawTooltips(int x, int y, List buttonList) {
      if (Math.abs(x - this.lastMouseX) <= 5 && Math.abs(y - this.lastMouseY) <= 5) {
         int activateDelay = 700;
         if (System.currentTimeMillis() >= this.mouseStillTime + activateDelay) {
            avs btn = GuiScreenOF.getSelectedButton(x, y, buttonList);
            if (btn != null) {
               Rectangle rect = this.tooltipProvider.getTooltipBounds(this.guiScreen, x, y);
               String[] lines = this.tooltipProvider.getTooltipLines(btn, rect.width);
               if (lines != null) {
                  if (lines.length > 8) {
                     lines = Arrays.copyOf(lines, 8);
                     lines[lines.length - 1] = lines[lines.length - 1] + " ...";
                  }

                  if (this.tooltipProvider.isRenderBorder()) {
                     int colBorder = -528449408;
                     this.drawRectBorder(rect.x, rect.y, rect.x + rect.width, rect.y + rect.height, colBorder);
                  }

                  avp.a(rect.x, rect.y, rect.x + rect.width, rect.y + rect.height, -536870912);

                  for (int i = 0; i < lines.length; i++) {
                     String line = lines[i];
                     int col = 14540253;
                     if (line.endsWith("!")) {
                        col = 16719904;
                     }

                     avn fontRenderer = ave.A().k;
                     fontRenderer.a(line, rect.x + 5, rect.y + 5 + i * 11, col);
                  }
               }
            }
         }
      } else {
         this.lastMouseX = x;
         this.lastMouseY = y;
         this.mouseStillTime = System.currentTimeMillis();
      }
   }

   private void drawRectBorder(int x1, int y1, int x2, int y2, int col) {
      avp.a(x1, y1 - 1, x2, y1, col);
      avp.a(x1, y2, x2, y2 + 1, col);
      avp.a(x1 - 1, y1, x1, y2, col);
      avp.a(x2, y1, x2 + 1, y2, col);
   }
}
