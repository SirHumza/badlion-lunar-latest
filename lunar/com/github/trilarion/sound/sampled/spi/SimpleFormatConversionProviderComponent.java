package com.github.trilarion.sound.sampled.spi;

import com.github.trilarion.sound.sampled.AudioFormats;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Logger;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioFormat.Encoding;

public abstract class MatrixFormatConversionProvider extends SimpleFormatConversionProvider {
   private static final Logger LOG = Logger.getLogger(MatrixFormatConversionProvider.class.getName());
   private final Map<AudioFormat, List<Encoding>> m_targetEncodingsFromSourceFormat = new HashMap<>();
   private final Map<AudioFormat, Map<Encoding, Collection<AudioFormat>>> m_targetFormatsFromSourceFormat = new HashMap<>();

   protected MatrixFormatConversionProvider(List<AudioFormat> var1, List<AudioFormat> var2, boolean[][] var3) {
      super(var1, var2);

      for (int var4 = 0; var4 < var1.size(); var4++) {
         AudioFormat var5 = (AudioFormat)var1.get(var4);
         ArrayList var6 = new ArrayList();
         this.m_targetEncodingsFromSourceFormat.put(var5, var6);
         HashMap var7 = new HashMap();
         this.m_targetFormatsFromSourceFormat.put(var5, var7);

         for (int var8 = 0; var8 < var2.size(); var8++) {
            AudioFormat var9 = (AudioFormat)var2.get(var8);
            if (var3[var4][var8]) {
               Encoding var10 = var9.getEncoding();
               var6.add(var10);
               Collection var11 = (Collection)var7.get(var10);
               if (var11 == null) {
                  var11 = new ArrayList();
                  var7.put(var10, var11);
               }

               var11.add(var9);
            }
         }
      }
   }

   @Override
   public Encoding[] getTargetEncodings(AudioFormat var1) {
      for (Entry var3 : this.m_targetEncodingsFromSourceFormat.entrySet()) {
         AudioFormat var4 = (AudioFormat)var3.getKey();
         if (AudioFormats.matches(var4, var1)) {
            List var5 = (List)var3.getValue();
            return var5.toArray(EMPTY_ENCODING_ARRAY);
         }
      }

      return EMPTY_ENCODING_ARRAY;
   }

   @Override
   public AudioFormat[] getTargetFormats(Encoding var1, AudioFormat var2) {
      for (Entry var4 : this.m_targetFormatsFromSourceFormat.entrySet()) {
         AudioFormat var5 = (AudioFormat)var4.getKey();
         if (AudioFormats.matches(var5, var2)) {
            Map var6 = (Map)var4.getValue();
            Collection var7 = (Collection)var6.get(var1);
            if (var7 != null) {
               return var7.toArray(EMPTY_FORMAT_ARRAY);
            }

            return EMPTY_FORMAT_ARRAY;
         }
      }

      return EMPTY_FORMAT_ARRAY;
   }
}
