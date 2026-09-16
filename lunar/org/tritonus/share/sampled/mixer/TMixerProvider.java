package org.tritonus.share.sampled.mixer;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.Mixer.Info;
import javax.sound.sampled.spi.MixerProvider;

public abstract class TMixerProvider extends MixerProvider {
   private static final Logger logger = System.getLogger("org.tritonus.TraceMixerProvider");
   private static final Info[] EMPTY_MIXER_INFO_ARRAY = new Info[0];
   private static Map<Class<?>, TMixerProvider.MixerProviderStruct> sm_mixerProviderStructs = new HashMap<>();
   private boolean m_bDisabled = false;

   public TMixerProvider() {
      logger.log(Level.TRACE, "TMixerProvider.<init>(): begin");
      logger.log(Level.TRACE, "TMixerProvider.<init>(): end");
   }

   protected abstract void staticInit();

   private TMixerProvider.MixerProviderStruct getMixerProviderStruct() {
      logger.log(Level.TRACE, "TMixerProvider.getMixerProviderStruct(): begin");
      Class var1 = this.getClass();
      logger.log(Level.TRACE, "TMixerProvider.getMixerProviderStruct(): called from " + var1);
      synchronized (TMixerProvider.class) {
         TMixerProvider.MixerProviderStruct var3 = sm_mixerProviderStructs.get(var1);
         if (var3 == null) {
            logger.log(Level.TRACE, "TMixerProvider.getMixerProviderStruct(): creating new MixerProviderStruct for " + var1);
            var3 = new TMixerProvider.MixerProviderStruct();
            sm_mixerProviderStructs.put(var1, var3);
         }

         logger.log(Level.TRACE, "TMixerProvider.getMixerProviderStruct(): end");
         return var3;
      }
   }

   protected void disable() {
      logger.log(Level.TRACE, "disabling " + this.getClass().getName());
      this.m_bDisabled = true;
   }

   protected boolean isDisabled() {
      return this.m_bDisabled;
   }

   protected void addMixer(Mixer var1) {
      logger.log(Level.TRACE, "TMixerProvider.addMixer(): begin");
      TMixerProvider.MixerProviderStruct var2 = this.getMixerProviderStruct();
      synchronized (var2) {
         var2.m_mixers.add(var1);
         if (var2.m_defaultMixer == null) {
            var2.m_defaultMixer = var1;
         }
      }

      logger.log(Level.TRACE, "TMixerProvider.addMixer(): end");
   }

   protected void removeMixer(Mixer var1) {
      logger.log(Level.TRACE, "TMixerProvider.removeMixer(): begin");
      TMixerProvider.MixerProviderStruct var2 = this.getMixerProviderStruct();
      synchronized (var2) {
         var2.m_mixers.remove(var1);
         if (var2.m_defaultMixer == var1) {
            var2.m_defaultMixer = null;
         }
      }

      logger.log(Level.TRACE, "TMixerProvider.removeMixer(): end");
   }

   @Override
   public boolean isMixerSupported(Info var1) {
      logger.log(Level.TRACE, "TMixerProvider.isMixerSupported(): begin");
      boolean var2 = false;
      Info[] var3 = this.getMixerInfo();

      for (Info var7 : var3) {
         if (var7.equals(var1)) {
            var2 = true;
            break;
         }
      }

      logger.log(Level.TRACE, "TMixerProvider.isMixerSupported(): end");
      return var2;
   }

   @Override
   public Mixer getMixer(Info var1) {
      logger.log(Level.TRACE, "TMixerProvider.getMixer(): begin");
      TMixerProvider.MixerProviderStruct var2 = this.getMixerProviderStruct();
      Mixer var3 = null;
      synchronized (var2) {
         if (var1 == null) {
            var3 = var2.m_defaultMixer;
         } else {
            for (Mixer var6 : var2.m_mixers) {
               if (var6.getMixerInfo().equals(var1)) {
                  var3 = var6;
                  break;
               }
            }
         }
      }

      if (var3 == null) {
         throw new IllegalArgumentException("no mixer available for " + var1);
      }

      logger.log(Level.TRACE, "TMixerProvider.getMixer(): end");
      return var3;
   }

   @Override
   public Info[] getMixerInfo() {
      logger.log(Level.TRACE, "TMixerProvider.getMixerInfo(): begin");
      HashSet var1 = new HashSet();
      TMixerProvider.MixerProviderStruct var2 = this.getMixerProviderStruct();
      synchronized (var2) {
         for (Mixer var5 : var2.m_mixers) {
            var1.add(var5.getMixerInfo());
         }
      }

      logger.log(Level.TRACE, "TMixerProvider.getMixerInfo(): end");
      return var1.toArray(EMPTY_MIXER_INFO_ARRAY);
   }

   private static class MixerProviderStruct {
      public List<Mixer> m_mixers = new ArrayList<>();
      public Mixer m_defaultMixer = null;

      public MixerProviderStruct() {
      }
   }
}
