package org.spongepowered.asm.service.modlauncher;

import java.util.function.Consumer;
import org.spongepowered.asm.service.IMixinAuditTrail;

public class ModLauncherAuditTrail implements IMixinAuditTrail {
   private String currentClass;
   private Consumer<String[]> consumer;

   public void setConsumer(String var1, Consumer<String[]> var2) {
      this.currentClass = var1;
      this.consumer = var2;
   }

   @Override
   public void onApply(String var1, String var2) {
      this.writeActivity(var1, "APP", var2);
   }

   @Override
   public void onPostProcess(String var1) {
      this.writeActivity(var1, "DEC");
   }

   @Override
   public void onGenerate(String var1, String var2) {
      this.writeActivity(var1, "GEN");
   }

   private void writeActivity(String var1, String... var2) {
      if (this.consumer != null && var1.equals(this.currentClass)) {
         this.consumer.accept(var2);
      }
   }
}
