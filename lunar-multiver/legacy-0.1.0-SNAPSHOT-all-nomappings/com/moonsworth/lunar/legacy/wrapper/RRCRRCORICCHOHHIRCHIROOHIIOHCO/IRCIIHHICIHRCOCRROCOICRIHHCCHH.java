package com.moonsworth.lunar.legacy.wrapper.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.client.util.ORCOCORROHIROCCIORORRRRCHIOOCH;
import java.io.BufferedInputStream;
import java.net.URL;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.AudioFormat.Encoding;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public final class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   private static final Map<String, AudioInputStream> HHRCHOHOOROIORRCIRCRRRHOCRHOIO = new ConcurrentHashMap<>();
   private static final Set<String> CIHIOIHRHORRCHRRCIOHICOOHOROIO = new HashSet<>();

   @Nullable
   public static AudioInputStream RRCRRCORICCHOHHIRCHIROOHIIOHCO(URL var0) {
      String var1 = var0.toString();
      AudioInputStream var2 = null;
      if (CIHIOIHRHORRCHRRCIOHICOOHOROIO.contains(var1)) {
         var2 = HHRCHOHOOROIORRCIRCRRRHOCRHOIO.remove(var1);
         if (var2 == null) {
            CIHIOIHRHORRCHRRCIOHICOOHOROIO.remove(var1);
         }
      }

      return var2;
   }

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(URL var0, Runnable var1) {
      String var2 = var0.toString();
      if (CIHIOIHRHORRCHRRCIOHICOOHOROIO.contains(var2)) {
         var1.run();
      } else {
         ORCOCORROHIROCCIORORRRRCHIOOCH.IOHHOIIOCRHCHHCRORICCOHOHROOIH(() -> {
            CIHIOIHRHORRCHRRCIOHICOOHOROIO.add(var2);
            HHRCHOHOOROIORRCIRCRRRHOCRHOIO.put(var2, RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var0));
            var1.run();
         });
      }
   }

   public static void IHCHCRCIIOCOICCCCIRICCROIIOHCI() {
      HHRCHOHOOROIORRCIRCRRRHOCRHOIO.clear();
      CIHIOIHRHORRCHRRCIOHICOOHOROIO.clear();
   }

   private static AudioInputStream RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(URL var0) {
      try {
         AudioInputStream var1 = AudioSystem.getAudioInputStream(new BufferedInputStream(var0.openStream()));
         int var2 = RRCRRCORICCHOHHIRCHIROOHIIOHCO.clamp(var1.getFormat().getChannels(), 1, 2);
         int var3 = (int)var1.getFormat().getSampleRate();
         int var4 = var1.getFormat().getSampleSizeInBits();
         var4 = var4 != -1 ? var4 : 16;
         AudioFormat var5 = new AudioFormat(Encoding.PCM_SIGNED, var3, var4, var2, var2 * 2, var3, false);
         return AudioSystem.getAudioInputStream(var5, var1);
      } catch (Exception var6) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
            "Could not load MP3 audio stream!", new Object[]{var6.getMessage()}
         );
         throw new RuntimeException(var6);
      }
   }

   @Generated
   private IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
