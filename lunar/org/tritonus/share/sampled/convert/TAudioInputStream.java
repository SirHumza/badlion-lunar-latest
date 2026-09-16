package org.tritonus.share.sampled.convert;

import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;

public class TAudioInputStream extends AudioInputStream {
   private Map<String, Object> m_properties;
   private Map<String, Object> m_unmodifiableProperties;

   public TAudioInputStream(InputStream var1, AudioFormat var2, long var3) {
      super(var1, var2, var3);
      this.initMaps(new HashMap<>());
   }

   public TAudioInputStream(InputStream var1, AudioFormat var2, long var3, Map<String, Object> var5) {
      super(var1, var2, var3);
      this.initMaps(var5);
   }

   private void initMaps(Map<String, Object> var1) {
      this.m_properties = var1;
      this.m_unmodifiableProperties = Collections.unmodifiableMap(this.m_properties);
   }

   public Map<String, Object> properties() {
      return this.m_unmodifiableProperties;
   }

   protected void setProperty(String var1, Object var2) {
      this.m_properties.put(var1, var2);
   }
}
