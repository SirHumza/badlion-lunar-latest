package org.tritonus.share.sampled.mixer;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.Line;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.Port;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.TargetDataLine;
import javax.sound.sampled.Line.Info;
import org.tritonus.share.ArraySet;
import org.tritonus.share.sampled.AudioFormats;

public abstract class TMixer extends TLine implements Mixer {
   private static final Logger logger = System.getLogger("org.tritonus.TraceMixer");
   private static Info[] EMPTY_LINE_INFO_ARRAY = new Info[0];
   private static Line[] EMPTY_LINE_ARRAY = new Line[0];
   private Mixer.Info m_mixerInfo;
   private Collection<AudioFormat> m_supportedSourceFormats;
   private Collection<AudioFormat> m_supportedTargetFormats;
   private Collection<Info> m_supportedSourceLineInfos;
   private Collection<Info> m_supportedTargetLineInfos;
   private final Set<SourceDataLine> m_openSourceDataLines;
   private final Set<TargetDataLine> m_openTargetDataLines;

   protected TMixer(Mixer.Info var1, Info var2) {
      this(var1, var2, new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
   }

   protected TMixer(Mixer.Info var1, Info var2, Collection<AudioFormat> var3, Collection<AudioFormat> var4, Collection<Info> var5, Collection<Info> var6) {
      super(null, var2);
      logger.log(Level.TRACE, "TMixer.<init>(): begin");
      this.m_mixerInfo = var1;
      this.setSupportInformation(var3, var4, var5, var6);
      this.m_openSourceDataLines = new ArraySet<>();
      this.m_openTargetDataLines = new ArraySet<>();
      logger.log(Level.TRACE, "TMixer.<init>(): end");
   }

   protected void setSupportInformation(Collection<AudioFormat> var1, Collection<AudioFormat> var2, Collection<Info> var3, Collection<Info> var4) {
      logger.log(Level.TRACE, "TMixer.setSupportInformation(): begin");
      this.m_supportedSourceFormats = var1;
      this.m_supportedTargetFormats = var2;
      this.m_supportedSourceLineInfos = var3;
      this.m_supportedTargetLineInfos = var4;
      logger.log(Level.TRACE, "TMixer.setSupportInformation(): end");
   }

   @Override
   public Mixer.Info getMixerInfo() {
      logger.log(Level.TRACE, "TMixer.getMixerInfo(): begin");
      logger.log(Level.TRACE, "TMixer.getMixerInfo(): end");
      return this.m_mixerInfo;
   }

   @Override
   public Info[] getSourceLineInfo() {
      logger.log(Level.TRACE, "TMixer.getSourceLineInfo(): begin");
      Info[] var1 = this.m_supportedSourceLineInfos.toArray(EMPTY_LINE_INFO_ARRAY);
      logger.log(Level.TRACE, "TMixer.getSourceLineInfo(): end");
      return var1;
   }

   @Override
   public Info[] getTargetLineInfo() {
      logger.log(Level.TRACE, "TMixer.getTargetLineInfo(): begin");
      Info[] var1 = this.m_supportedTargetLineInfos.toArray(EMPTY_LINE_INFO_ARRAY);
      logger.log(Level.TRACE, "TMixer.getTargetLineInfo(): end");
      return var1;
   }

   @Override
   public Info[] getSourceLineInfo(Info var1) {
      logger.log(Level.TRACE, "TMixer.getSourceLineInfo(Line.Info): info to test: " + var1);
      return EMPTY_LINE_INFO_ARRAY;
   }

   @Override
   public Info[] getTargetLineInfo(Info var1) {
      logger.log(Level.TRACE, "TMixer.getTargetLineInfo(Line.Info): info to test: " + var1);
      return EMPTY_LINE_INFO_ARRAY;
   }

   @Override
   public boolean isLineSupported(Info var1) {
      logger.log(Level.TRACE, "TMixer.isLineSupported(): info to test: " + var1);
      Class var2 = var1.getLineClass();
      if (var2.equals(SourceDataLine.class)) {
         return isLineSupportedImpl(var1, this.m_supportedSourceLineInfos);
      } else if (var2.equals(TargetDataLine.class)) {
         return isLineSupportedImpl(var1, this.m_supportedTargetLineInfos);
      } else {
         return !var2.equals(Port.class)
            ? false
            : isLineSupportedImpl(var1, this.m_supportedSourceLineInfos) || isLineSupportedImpl(var1, this.m_supportedTargetLineInfos);
      }
   }

   private static boolean isLineSupportedImpl(Info var0, Collection<Info> var1) {
      for (Info var3 : var1) {
         if (var3.matches(var0)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public Line getLine(Info var1) {
      logger.log(Level.TRACE, "TMixer.getLine(): begin");
      Class var2 = var1.getLineClass();
      DataLine.Info var3 = null;
      Port.Info var4 = null;
      AudioFormat[] var5 = null;
      if (var1 instanceof DataLine.Info) {
         var3 = (DataLine.Info)var1;
         var5 = var3.getFormats();
      } else if (var1 instanceof Port.Info) {
         var4 = (Port.Info)var1;
      }

      Line var7;
      if (var2 == SourceDataLine.class) {
         logger.log(Level.TRACE, "TMixer.getLine(): type: SourceDataLine");
         if (var3 == null) {
            throw new IllegalArgumentException("need DataLine.Info for SourceDataLine");
         }

         AudioFormat var6 = this.getSupportedSourceFormat(var5);
         var7 = this.getSourceDataLine(var6, var3.getMaxBufferSize());
      } else if (var2 == Clip.class) {
         logger.log(Level.TRACE, "TMixer.getLine(): type: Clip");
         if (var3 == null) {
            throw new IllegalArgumentException("need DataLine.Info for Clip");
         }

         AudioFormat var8 = this.getSupportedSourceFormat(var5);
         var7 = this.getClip(var8);
      } else if (var2 == TargetDataLine.class) {
         logger.log(Level.TRACE, "TMixer.getLine(): type: TargetDataLine");
         if (var3 == null) {
            throw new IllegalArgumentException("need DataLine.Info for TargetDataLine");
         }

         AudioFormat var9 = this.getSupportedTargetFormat(var5);
         var7 = this.getTargetDataLine(var9, var3.getMaxBufferSize());
      } else {
         if (var2 != Port.class) {
            logger.log(Level.TRACE, "TMixer.getLine(): unknown line type, will throw exception");
            throw new LineUnavailableException("unknown line class: " + var2);
         }

         logger.log(Level.TRACE, "TMixer.getLine(): type: TargetDataLine");
         if (var4 == null) {
            throw new IllegalArgumentException("need Port.Info for Port");
         }

         var7 = this.getPort(var4);
      }

      logger.log(Level.TRACE, "TMixer.getLine(): end");
      return var7;
   }

   protected SourceDataLine getSourceDataLine(AudioFormat var1, int var2) {
      logger.log(Level.TRACE, "TMixer.getSourceDataLine(): begin");
      throw new IllegalArgumentException("this mixer does not support SourceDataLines");
   }

   protected Clip getClip(AudioFormat var1) {
      logger.log(Level.TRACE, "TMixer.getClip(): begin");
      throw new IllegalArgumentException("this mixer does not support Clips");
   }

   protected TargetDataLine getTargetDataLine(AudioFormat var1, int var2) {
      logger.log(Level.TRACE, "TMixer.getTargetDataLine(): begin");
      throw new IllegalArgumentException("this mixer does not support TargetDataLines");
   }

   protected Port getPort(Port.Info var1) {
      logger.log(Level.TRACE, "TMixer.getTargetDataLine(): begin");
      throw new IllegalArgumentException("this mixer does not support Ports");
   }

   private AudioFormat getSupportedSourceFormat(AudioFormat[] var1) {
      logger.log(Level.TRACE, "TMixer.getSupportedSourceFormat(): begin");
      AudioFormat var2 = null;

      for (AudioFormat var6 : var1) {
         logger.log(Level.TRACE, "TMixer.getSupportedSourceFormat(): checking " + var6 + "...");
         if (this.isSourceFormatSupported(var6)) {
            logger.log(Level.TRACE, "TMixer.getSupportedSourceFormat(): ...supported");
            var2 = var6;
            break;
         }

         logger.log(Level.TRACE, "TMixer.getSupportedSourceFormat(): ...no luck");
      }

      if (var2 == null) {
         throw new IllegalArgumentException("no line matchine one of the passed formats");
      }

      logger.log(Level.TRACE, "TMixer.getSupportedSourceFormat(): end");
      return var2;
   }

   private AudioFormat getSupportedTargetFormat(AudioFormat[] var1) {
      logger.log(Level.TRACE, "TMixer.getSupportedTargetFormat(): begin");
      AudioFormat var2 = null;

      for (AudioFormat var6 : var1) {
         logger.log(Level.TRACE, "TMixer.getSupportedTargetFormat(): checking " + var6 + " ...");
         if (this.isTargetFormatSupported(var6)) {
            logger.log(Level.TRACE, "TMixer.getSupportedTargetFormat(): ...supported");
            var2 = var6;
            break;
         }

         logger.log(Level.TRACE, "TMixer.getSupportedTargetFormat(): ...no luck");
      }

      if (var2 == null) {
         throw new IllegalArgumentException("no line matchine one of the passed formats");
      }

      logger.log(Level.TRACE, "TMixer.getSupportedTargetFormat(): end");
      return var2;
   }

   @Override
   public Line[] getSourceLines() {
      logger.log(Level.TRACE, "TMixer.getSourceLines(): called");
      return this.m_openSourceDataLines.toArray(EMPTY_LINE_ARRAY);
   }

   @Override
   public Line[] getTargetLines() {
      logger.log(Level.TRACE, "TMixer.getTargetLines(): called");
      return this.m_openTargetDataLines.toArray(EMPTY_LINE_ARRAY);
   }

   @Override
   public void synchronize(Line[] var1, boolean var2) {
      throw new UnsupportedOperationException("synchronization not supported");
   }

   @Override
   public void unsynchronize(Line[] var1) {
      throw new UnsupportedOperationException("synchronization not supported");
   }

   @Override
   public boolean isSynchronizationSupported(Line[] var1, boolean var2) {
      return false;
   }

   protected boolean isSourceFormatSupported(AudioFormat var1) {
      logger.log(Level.TRACE, "TMixer.isSourceFormatSupported(): format to test: " + var1);

      for (AudioFormat var3 : this.m_supportedSourceFormats) {
         if (AudioFormats.matches(var3, var1)) {
            return true;
         }
      }

      return false;
   }

   protected boolean isTargetFormatSupported(AudioFormat var1) {
      logger.log(Level.TRACE, "TMixer.isTargetFormatSupported(): format to test: " + var1);

      for (AudioFormat var3 : this.m_supportedTargetFormats) {
         if (AudioFormats.matches(var3, var1)) {
            return true;
         }
      }

      return false;
   }

   void registerOpenLine(Line var1) {
      logger.log(Level.TRACE, "TMixer.registerOpenLine(): line to register: " + var1);
      if (var1 instanceof SourceDataLine) {
         synchronized (this.m_openSourceDataLines) {
            this.m_openSourceDataLines.add((SourceDataLine)var1);
         }
      } else if (var1 instanceof TargetDataLine) {
         synchronized (this.m_openSourceDataLines) {
            this.m_openTargetDataLines.add((TargetDataLine)var1);
         }
      }
   }

   void unregisterOpenLine(Line var1) {
      logger.log(Level.TRACE, "TMixer.unregisterOpenLine(): line to unregister: " + var1);
      if (var1 instanceof SourceDataLine) {
         synchronized (this.m_openSourceDataLines) {
            this.m_openSourceDataLines.remove(var1);
         }
      } else if (var1 instanceof TargetDataLine) {
         synchronized (this.m_openTargetDataLines) {
            this.m_openTargetDataLines.remove(var1);
         }
      }
   }
}
