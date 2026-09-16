package net.optifine.player;

import java.util.Map;
import java.util.Set;

public class PlayerItemsLayer implements blb {
   private bln renderPlayer = null;

   public PlayerItemsLayer(bln renderPlayer) {
      this.renderPlayer = renderPlayer;
   }

   public void a(
      pr entityLiving, float limbSwing, float limbSwingAmount, float partialTicks, float ticksExisted, float headYaw, float rotationPitch, float scale
   ) {
      this.renderEquippedItems(entityLiving, scale, partialTicks);
   }

   protected void renderEquippedItems(pr entityLiving, float scale, float partialTicks) {
      if (Config.isShowCapes()) {
         if (!entityLiving.ax()) {
            if (entityLiving instanceof bet) {
               bet player = (bet)entityLiving;
               bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
               bfl.C();
               bfl.o();
               bbj modelBipedMain = this.renderPlayer.g();
               PlayerConfigurations.renderPlayerItems(modelBipedMain, player, scale, partialTicks);
               bfl.p();
            }
         }
      }
   }

   public boolean b() {
      return false;
   }

   public static void register(Map renderPlayerMap) {
      Set keys = renderPlayerMap.keySet();
      boolean registered = false;

      for (Object key : keys) {
         Object renderer = renderPlayerMap.get(key);
         if (renderer instanceof bln) {
            bln renderPlayer = (bln)renderer;
            renderPlayer.a(new PlayerItemsLayer(renderPlayer));
            registered = true;
         }
      }

      if (!registered) {
         Config.warn("PlayerItemsLayer not registered");
      }
   }
}
