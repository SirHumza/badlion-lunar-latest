package org.tritonus.share.sampled;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioFormat.Encoding;

public class TAudioFormat extends AudioFormat {
   private Map<String, Object> m_properties;
   private Map<String, Object> m_unmodifiableProperties;

   public TAudioFormat(Encoding var1, float var2, int var3, int var4, int var5, float var6, boolean var7, Map<String, Object> var8) {
      super(var1, var2, var3, var4, var5, var6, var7);
      this.initMaps(var8);
   }

   public TAudioFormat(AudioFormat var1) {
      this(
         var1.getEncoding(),
         var1.getSampleRate(),
         var1.getSampleSizeInBits(),
         var1.getChannels(),
         var1.getFrameSize(),
         var1.getFrameRate(),
         var1.isBigEndian(),
         var1.properties()
      );
   }

   public TAudioFormat(AudioFormat var1, Map<String, Object> var2) {
      this(var1);
      this.m_properties.putAll(var2);
   }

   public TAudioFormat(float var1, int var2, int var3, boolean var4, boolean var5, Map<String, Object> var6) {
      super(var1, var2, var3, var4, var5);
      this.initMaps(var6);
   }

   private void initMaps(Map<String, Object> var1) {
      this.m_properties = new HashMap<>();
      if (var1 != null) {
         this.m_properties.putAll(var1);
      }

      this.m_unmodifiableProperties = Collections.unmodifiableMap(this.m_properties);
   }

   @Override
   public Map<String, Object> properties() {
      if (this.m_properties == null) {
         this.initMaps(null);
      }

      return this.m_unmodifiableProperties;
   }

   @Override
   public Object getProperty(String var1) {
      return this.m_properties == null ? null : this.m_properties.get(var1);
   }

   protected void setProperty(String var1, Object var2) {
      if (this.m_properties == null) {
         this.initMaps(null);
      }

      this.m_properties.put(var1, var2);
   }
}
