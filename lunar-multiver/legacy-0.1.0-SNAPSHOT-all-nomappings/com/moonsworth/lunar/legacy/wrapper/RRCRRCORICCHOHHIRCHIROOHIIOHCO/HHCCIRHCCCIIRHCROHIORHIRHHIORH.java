package com.moonsworth.lunar.legacy.wrapper.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.io.ByteArrayOutputStream;
import java.net.URL;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import paulscode.sound.ICodec;
import paulscode.sound.SoundBuffer;
import paulscode.sound.SoundSystemConfig;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH implements ICodec {
   private boolean HRROOCCIIHROICOIIRHHRCCHOOCIHC = false;
   private boolean initialized = false;
   private AudioFormat HCRROORIHHHRORRORHIIHHRRRRHRCO = null;
   private AudioInputStream IRROOIOIOOIIHOHIICOCRICOICORCI = null;

   public void reverseByteOrder(boolean var1) {
   }

   public boolean initialize(URL var1) {
      AudioInputStream var2 = IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var1);
      if (var2 != null) {
         this.IRROOIOIOOIIHOHIICOCRICOICORCI = var2;
         this.HCRROORIHHHRORRORHIIHHRRRRHRCO = var2.getFormat();
      }

      if (this.IRROOIOIOOIIHOHIICOCRICOICORCI == null) {
         SoundSystemConfig.getLogger().errorMessage("StaticMp3Codec", "Unable to set up audio input stream in method 'initialize'", 0);
         this.cleanup();
         return false;
      } else {
         this.initialized = true;
         return true;
      }
   }

   public boolean initialized() {
      return this.initialized;
   }

   public SoundBuffer read() {
      return null;
   }

   public SoundBuffer readAll() {
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();
      byte[] var2 = new byte[SoundSystemConfig.getFileChunkSize()];
      AudioInputStream var4 = this.IRROOIOIOOIIHOHIICOCRICOICORCI;

      try {
         int var3;
         try (var4) {
            while ((var3 = var4.read(var2)) != -1) {
               var1.write(var2, 0, var3);
            }
         } catch (Exception var15) {
            SoundSystemConfig.getLogger().errorMessage("StaticMp3Codec", "Exception thrown while reading from the AudioInputStream", 0);
            SoundSystemConfig.getLogger().printStackTrace(var15, 1);
            IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .IHCHHRRIIIORORCHIICIIOORCOIOIO()
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  CORCOCICIRIOHROHROIIOOHICCHCRR.ERROR, OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH("failedToPlaySound", new Object[0])
               );
            return null;
         }
      } finally {
         this.HRROOCCIIHROICOIIRHHRCCHOOCIHC = true;
      }

      return new SoundBuffer(var1.toByteArray(), this.HCRROORIHHHRORRORHIIHHRRRRHRCO);
   }

   public boolean endOfStream() {
      return this.HRROOCCIIHROICOIIRHHRCCHOOCIHC;
   }

   public void cleanup() {
      try {
         this.IRROOIOIOOIIHOHIICOCRICOICORCI.close();
      } catch (Exception var5) {
         SoundSystemConfig.getLogger().errorMessage("StaticMp3Codec", "Exception thrown while reading cleaning up AudioInputStream", 0);
         SoundSystemConfig.getLogger().printStackTrace(var5, 1);
      } finally {
         this.HRROOCCIIHROICOIIRHHRCCHOOCIHC = true;
      }
   }

   public AudioFormat getAudioFormat() {
      return this.HCRROORIHHHRORRORHIIHHRRRRHRCO;
   }
}
