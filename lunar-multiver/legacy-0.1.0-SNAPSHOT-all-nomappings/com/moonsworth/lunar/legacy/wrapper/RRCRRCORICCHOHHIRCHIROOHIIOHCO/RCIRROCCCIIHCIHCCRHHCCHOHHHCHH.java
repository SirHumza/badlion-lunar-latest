package com.moonsworth.lunar.legacy.wrapper.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.client.util.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.AudioFormat.Encoding;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;
import paulscode.sound.ICodec;
import paulscode.sound.SoundBuffer;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.SoundSystemLogger;
import paulscode.sound.libraries.ChannelLWJGLOpenAL;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements ICodec {
   private static final int HROHIHICICHIIIROIRCIIIHRRRCIRC = 16384;
   private static final LoadingCache<URL, HRCHROOHRIHCRCRHRIIROCIRHOIRHH> CCOOIOHHIHCCHOHCOIIRIHIOOHHOCR = CacheBuilder.newBuilder()
      .expireAfterAccess(60L, TimeUnit.SECONDS)
      .removalListener(var0 -> {
         try {
            HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1 = (HRCHROOHRIHCRCRHRIIROCIRHOIRHH)var0.getValue();
            if (var1 != null) {
               var1.close();
            }
         } catch (IOException var2) {
         }
      })
      .build(new CacheLoader<URL, HRCHROOHRIHCRCRHRIIROCIRHOIRHH>() {
         @NotNull
         public HRCHROOHRIHCRCRHRIIROCIRHOIRHH CRRRICCRROCOHHOHIICIHORCOORRRH(@NotNull URL var1) {
            return new HRCHROOHRIHCRCRHRIIROCIRHOIRHH(new BufferedInputStream(var1.openStream(), 16384));
         }
      });
   private static final boolean RCCHRIORIHHORRCRCCORCRCIICOOIO = false;
   private static final boolean HRCCHCORCCHRRIIICHIOHHCIORHIOC = true;
   private static final boolean COHRHCIRRHCROCHROIORHIOORHHROR = false;
   private boolean HRROOCCIIHROICOIIRHHRCCHOOCIHC = false;
   private boolean initialized = false;
   private AudioFormat IRCOOCRHCHIIRCIOHRIRORRCHOHRCC = null;
   private AudioInputStream IRIICROIOOIHRIRCRHCRRICROOOIHR = null;
   private final SoundSystemLogger ORHOIOHRORHCIHRHRRCHHHHHIIRHOO = SoundSystemConfig.getLogger();
   private ChannelLWJGLOpenAL RROCOIIOIHROHCCHHIHOCROCRICCCC;

   public void reverseByteOrder(boolean var1) {
   }

   public boolean initialize(URL var1) {
      if (this.IRCOOCRHCHIIRCIOHRIRORRCHOHRCC != null) {
         return true;
      }

      this.IRCOOCRHCHIIRCIOHRIRORRCHOHRCC = new AudioFormat(Encoding.PCM_SIGNED, 44100.0F, 16, 2, 4, 44100.0F, false);
      new Thread(() -> {
         this.IHIRRIIORRHORHRORIHOROIRCORCOO(true, false);
         if (var1 == null) {
            this.ROORROCCCRCRCOHHOROROIRHCIROHR("URL null in method 'initialize'");
            this.cleanup();
         } else {
            try {
               HRCHROOHRIHCRCRHRIIROCIRHOIRHH var2 = (HRCHROOHRIHCRCRHRIIROCIRHOIRHH)CCOOIOHHIHCCHOHCOIIRIHIOOHHOCR.get(var1);
               if (var2.getPosition() == 0) {
                  var2.mark(16384);
                  var2.readNBytes(16384);
               }

               var2.reset();
               AudioInputStream var3 = AudioSystem.getAudioInputStream(var2);
               int var4 = RRCRRCORICCHOHHIRCHIROOHIIOHCO.clamp(var3.getFormat().getChannels(), 1, 2);
               int var5 = (int)var3.getFormat().getSampleRate();
               this.IRCOOCRHCHIIRCIOHRIRORRCHOHRCC = new AudioFormat(Encoding.PCM_SIGNED, var5, 16, var4, var4 * 2, var5, false);
               this.IRIICROIOOIHRIRCRHCRRICROOOIHR = AudioSystem.getAudioInputStream(this.IRCOOCRHCHIIRCIOHRIRORRCHOHRCC, var3);
            } catch (Exception var6) {
               this.ROORROCCCRCRCOHHOROROIRHCIROHR("Unable to set up input streams in method 'initialize'");
               this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var6);
               this.cleanup();
               return;
            }

            if (this.IRIICROIOOIHRIRCRHCRRICROOOIHR == null) {
               this.ROORROCCCRCRCOHHOROROIRHCIROHR("Unable to set up audio input stream in method 'initialize'");
               this.cleanup();
            } else {
               this.IOIICIRIICICIIOORHCIIIIRRIHRHI(true, false);
               this.IHIRRIIORRHORHRORIHOROIRCORCOO(true, true);
               LinkedList var7 = new LinkedList();

               for (int var8 = 0; var8 < SoundSystemConfig.getNumberStreamingBuffers(); var8++) {
                  SoundBuffer var9 = this.read();
                  if (var9 == null) {
                     break;
                  }

                  var7.add(var9.audioData);
               }

               if (!var7.isEmpty()) {
                  this.RROCOIIOIHROHCCHHIHOCROCRICCCC.preLoadBuffers(var7);
               }
            }
         }
      }).start();
      return true;
   }

   public boolean initialized() {
      return !this.IOIICIRIICICIIOORHCIIIIRRIHRHI(false, false);
   }

   public SoundBuffer read() {
      if (!this.IHIRRIIORRHORHRORIHOROIRCORCOO(false, false)) {
         return new SoundBuffer(new byte[SoundSystemConfig.getStreamingBufferSize()], this.IRCOOCRHCHIIRCIOHRIRORRCHOHRCC);
      }

      if (this.IRIICROIOOIHRIRCRHCRRICROOOIHR == null) {
         this.IOIICIRIICICIIOORHCIIIIRRIHRHI(true, true);
         return null;
      }

      AudioFormat var1 = this.IRIICROIOOIHRIRCRHCRRICROOOIHR.getFormat();
      if (var1 == null) {
         this.ROORROCCCRCRCOHHOROROIRHCIROHR("Audio Format null in method 'read'");
         this.IOIICIRIICICIIOORHCIIIIRRIHRHI(true, true);
         return null;
      }

      int var2 = 0;
      byte[] var4 = new byte[SoundSystemConfig.getStreamingBufferSize()];

      try {
         while (!this.IOIICIRIICICIIOORHCIIIIRRIHRHI(false, false) && var2 < var4.length) {
            int var3;
            if ((var3 = this.IRIICROIOOIHRIRCRHCRRICROOOIHR.read(var4, var2, var4.length - var2)) <= 0) {
               this.IOIICIRIICICIIOORHCIIIIRRIHRHI(true, true);
               break;
            }

            var2 += var3;
         }
      } catch (IOException var6) {
         this.IOIICIRIICICIIOORHCIIIIRRIHRHI(true, true);
         return null;
      } catch (ArrayIndexOutOfBoundsException var7) {
         this.IOIICIRIICICIIOORHCIIIIRRIHRHI(true, true);
         return null;
      }

      if (var2 <= 0) {
         this.IOIICIRIICICIIOORHCIIIIRRIHRHI(true, true);
         return null;
      } else {
         return new SoundBuffer(var4, var1);
      }
   }

   public SoundBuffer readAll() {
      if (this.IRCOOCRHCHIIRCIOHRIRORRCHOHRCC == null) {
         this.ROORROCCCRCRCOHHOROROIRHCIROHR("Audio Format null in method 'readAll'");
         return null;
      }

      ByteArrayOutputStream var1 = new ByteArrayOutputStream();
      byte[] var2 = new byte[SoundSystemConfig.getFileChunkSize()];

      try {
         int var3;
         try {
            while ((var3 = this.IRIICROIOOIHRIRCRHCRRICROOOIHR.read(var2)) != -1) {
               var1.write(var2, 0, var3);
            }
         } catch (IOException var15) {
            this.ROORROCCCRCRCOHHOROROIRHCIROHR("Exception thrown while reading from the AudioInputStream");
            this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var15);
            return null;
         }
      } finally {
         try {
            this.IRIICROIOOIHRIRCRHCRRICROOOIHR.close();
         } catch (IOException var14) {
         }

         this.IOIICIRIICICIIOORHCIIIIRRIHRHI(true, true);
      }

      return new SoundBuffer(var1.toByteArray(), this.IRCOOCRHCHIIRCIOHRIRORRCHOHRCC);
   }

   public boolean endOfStream() {
      return this.IOIICIRIICICIIOORHCIIIIRRIHRHI(false, false);
   }

   public void cleanup() {
      this.IOIICIRIICICIIOORHCIIIIRRIHRHI(true, true);
   }

   public AudioFormat getAudioFormat() {
      return this.IRCOOCRHCHIIRCIOHRIRORRCHOHRCC;
   }

   private synchronized boolean IHIRRIIORRHORHRORIHOROIRCORCOO(boolean var1, boolean var2) {
      if (var1) {
         this.initialized = var2;
      }

      return this.initialized;
   }

   private synchronized boolean IOIICIRIICICIIOORHCIIIIRRIHRHI(boolean var1, boolean var2) {
      if (var1) {
         this.HRROOCCIIHROICOIIRHHRCCHOOCIHC = var2;
      }

      return this.HRROOCCIIHROICOIIRHHRCCHOOCIHC;
   }

   private void ROORROCCCRCRCOHHOROROIRHCIROHR(String var1) {
      this.ORHOIOHRORHCIHRHRRCHHHHHIIRHOO.errorMessage("Mp3Codec", var1, 0);
   }

   private void HHCCIRHCCCIIRHCROHIORHIRHHIORH(Exception var1) {
      this.ORHOIOHRORHCIHRHRRCHHHHHIIRHOO.printStackTrace(var1, 1);
   }

   @Generated
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ChannelLWJGLOpenAL var1) {
      this.RROCOIIOIHROHCCHHIHOCROCRICCCC = var1;
   }
}
