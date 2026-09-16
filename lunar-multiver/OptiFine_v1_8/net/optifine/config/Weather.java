package net.optifine.config;

public enum Weather {
   CLEAR,
   RAIN,
   THUNDER;

   public static Weather getWeather(adm world, float partialTicks) {
      float thunderStrength = world.h(partialTicks);
      if (thunderStrength > 0.5F) {
         return THUNDER;
      }

      float rainStrength = world.j(partialTicks);
      return rainStrength > 0.5F ? RAIN : CLEAR;
   }
}
