package org.spongepowered.asm.logging;

public class LoggerAdapterDefault extends LoggerAdapterAbstract {
   public LoggerAdapterDefault(String var1) {
      super(var1);
   }

   @Override
   public String getType() {
      return "Default Logger (No Logging)";
   }

   @Override
   public void catching(Level var1, Throwable var2) {
   }

   @Override
   public void log(Level var1, String var2, Object... var3) {
   }

   @Override
   public void log(Level var1, String var2, Throwable var3) {
   }

   @Override
   public <T extends Throwable> T throwing(T var1) {
      return null;
   }
}
