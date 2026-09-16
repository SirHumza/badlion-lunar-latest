package org.tritonus.midi.file;

import java.io.DataOutputStream;
import java.io.File;
import java.io.OutputStream;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.nio.file.Files;
import javax.sound.midi.MetaMessage;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiMessage;
import javax.sound.midi.Sequence;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.SysexMessage;
import javax.sound.midi.Track;
import javax.sound.midi.spi.MidiFileWriter;

public class StandardMidiFileWriter extends MidiFileWriter {
   private static final Logger logger = System.getLogger(StandardMidiFileWriter.class.getName());
   public static boolean USE_RUNNING_STATUS = true;
   public static boolean CANCEL_RUNNING_STATUS_ON_META_AND_SYSEX = true;

   @Override
   public int[] getMidiFileTypes() {
      return new int[]{0, 1};
   }

   @Override
   public int[] getMidiFileTypes(Sequence var1) {
      Track[] var2 = var1.getTracks();
      return var2.length == 1 ? new int[]{0} : new int[]{1};
   }

   @Override
   public int write(Sequence var1, int var2, OutputStream var3) {
      if (!this.isFileTypeSupported(var2, var1)) {
         throw new IllegalArgumentException("file type is not supported for this sequence");
      }

      Track[] var4 = var1.getTracks();
      DataOutputStream var5 = new DataOutputStream(var3);
      var5.writeInt(1297377380);
      var5.writeInt(6);
      var5.writeShort(var2);
      var5.writeShort(var4.length);
      float var6 = var1.getDivisionType();
      int var7 = var1.getResolution();
      int var8 = 0;
      if (var6 == 0.0F) {
         var8 = var7 & 32767;
      }

      var5.writeShort(var8);
      int var9 = 14;

      for (Track var13 : var4) {
         var9 += writeTrack(var13, var5);
      }

      return var9;
   }

   @Override
   public int write(Sequence var1, int var2, File var3) {
      OutputStream var4 = Files.newOutputStream(var3.toPath());
      int var5 = this.write(var1, var2, var4);
      var4.close();
      return var5;
   }

   private static int writeTrack(Track var0, DataOutputStream var1) {
      int var2 = 0;
      if (var1 != null) {
         var1.writeInt(1297379947);
      }

      int var3 = 0;
      if (var1 != null) {
         var3 = writeTrack(var0, null);
      }

      if (var1 != null) {
         var1.writeInt(var3);
      }

      MidiEvent var4 = null;
      int[] var5 = new int[]{-1};

      for (int var6 = 0; var6 < var0.size(); var6++) {
         MidiEvent var7 = var0.get(var6);
         var2 += writeEvent(var7, var4, var5, var1);
         var4 = var7;
      }

      return var2;
   }

   private static int writeEvent(MidiEvent var0, MidiEvent var1, int[] var2, DataOutputStream var3) {
      int var4 = 0;
      long var5 = 0L;
      if (var1 != null) {
         var5 = var0.getTick() - var1.getTick();
      }

      if (var5 < 0L) {
         logger.log(Level.TRACE, "StandardMidiFileWriter.writeEvent(): warning: events not in order");
      }

      var4 += writeVariableLengthQuantity(var5, var3);
      MidiMessage var7 = var0.getMessage();
      if (var7 instanceof ShortMessage) {
         var4 += writeShortMessage((ShortMessage)var7, var2, var3);
      } else if (var7 instanceof SysexMessage) {
         var4 += writeSysexMessage((SysexMessage)var7, var2, var3);
      } else if (var7 instanceof MetaMessage) {
         var4 += writeMetaMessage((MetaMessage)var7, var2, var3);
      } else {
         logger.log(Level.TRACE, "StandardMidiFileWriter.writeEvent(): warning: unknown message class");
      }

      return var4;
   }

   private static int writeShortMessage(ShortMessage var0, int[] var1, DataOutputStream var2) {
      int var3 = 0;
      int var4 = var0.getLength();
      if (USE_RUNNING_STATUS && var1[0] == var0.getStatus()) {
         if (var2 != null) {
            var2.write(var0.getMessage(), 1, var4 - 1);
         }

         var3 += var4 - 1;
      } else {
         if (var2 != null) {
            var2.write(var0.getMessage(), 0, var4);
         }

         var3 += var4;
         var1[0] = var0.getStatus();
      }

      return var3;
   }

   private static int writeSysexMessage(SysexMessage var0, int[] var1, DataOutputStream var2) {
      int var3 = 0;
      int var4 = var0.getLength();
      if (CANCEL_RUNNING_STATUS_ON_META_AND_SYSEX) {
         var1[0] = -1;
      }

      if (var2 != null) {
         var2.write(var0.getStatus());
      }

      var3 = ++var3 + writeVariableLengthQuantity(var4 - 1, var2);
      if (var2 != null) {
         var2.write(var0.getData(), 0, var4 - 1);
      }

      return var3 + (var4 - 1);
   }

   private static int writeMetaMessage(MetaMessage var0, int[] var1, DataOutputStream var2) {
      int var3 = 0;
      byte[] var4 = var0.getData();
      int var5 = var4.length;
      if (CANCEL_RUNNING_STATUS_ON_META_AND_SYSEX) {
         var1[0] = -1;
      }

      if (var2 != null) {
         var2.write(var0.getStatus());
         var2.write(var0.getType());
      }

      var3 += 2;
      var3 += writeVariableLengthQuantity(var5, var2);
      if (var2 != null) {
         var2.write(var4);
      }

      return var3 + var5;
   }

   private static int writeVariableLengthQuantity(long var0, OutputStream var2) {
      int var3 = 0;
      boolean var4 = false;
      int var5 = (int)(var0 >> 21 & 127L);
      if (var5 != 0) {
         if (var2 != null) {
            var2.write(var5 | 128);
         }

         var3++;
         var4 = true;
      }

      var5 = (int)(var0 >> 14 & 127L);
      if (var5 != 0 || var4) {
         if (var2 != null) {
            var2.write(var5 | 128);
         }

         var3++;
         var4 = true;
      }

      var5 = (int)(var0 >> 7 & 127L);
      if (var5 != 0 || var4) {
         if (var2 != null) {
            var2.write(var5 | 128);
         }

         var3++;
      }

      var5 = (int)(var0 & 127L);
      if (var2 != null) {
         var2.write(var5);
      }

      return var3 + 1;
   }
}
