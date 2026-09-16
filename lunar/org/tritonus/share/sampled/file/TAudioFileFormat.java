package org.tritonus.share.sampled.file;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioFileFormat.Type;

public class TAudioFileFormat extends AudioFileFormat {
   private Map<String, Object> m_properties;
   private Map<String, Object> m_unmodifiableProperties;

   public TAudioFileFormat(Type var1, AudioFormat var2, int var3, int var4) {
      super(var1, var4, var2, var3);
   }

   public TAudioFileFormat(Type var1, AudioFormat var2, int var3, int var4, Map<String, Object> var5) {
      super(var1, var4, var2, var3);
      this.initMaps(var5);
   }

   private void initMaps(Map<String, Object> var1) {
      this.m_properties = new HashMap<>();
      this.m_properties.putAll(var1);
      this.m_unmodifiableProperties = Collections.unmodifiableMap(this.m_properties);
   }

   @Override
   public Map<String, Object> properties() {
      return this.m_unmodifiableProperties;
   }

   protected void setProperty(String var1, Object var2) {
      this.m_properties.put(var1, var2);
   }
}
