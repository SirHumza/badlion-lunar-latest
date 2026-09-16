package org.tritonus.midi.file;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.net.URL;
import java.nio.file.Files;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MetaMessage;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiFileFormat;
import javax.sound.midi.MidiMessage;
import javax.sound.midi.Sequence;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.SysexMessage;
import javax.sound.midi.Track;
import javax.sound.midi.spi.MidiFileReader;
import org.tritonus.share.midi.TMidiFileFormat;

public class StandardMidiFileReader extends MidiFileReader {
   private static final Logger logger = System.getLogger("org.tritonus.TraceAllExceptions");
   public static boolean CANCEL_RUNNING_STATUS_ON_META_AND_SYSEX = true;
   private static final int STATUS_NONE = 0;
   private static final int STATUS_ONE_BYTE = 1;
   private static final int STATUS_TWO_BYTES = 2;
   private static final int STATUS_SYSEX = 3;
   private static final int STATUS_META = 4;

   @Override
   public MidiFileFormat getMidiFileFormat(InputStream var1) {
      DataInputStream var2 = new DataInputStream(var1);
      int var3 = var2.readInt();
      if (var3 != 1297377380) {
         throw new InvalidMidiDataException("not a MIDI file: wrong header magic");
      }

      int var4 = var2.readInt();
      if (var4 < 6) {
         throw new InvalidMidiDataException("corrupt MIDI file: wrong header length");
      }

      short var5 = var2.readShort();
      if (var5 < 0 || var5 > 2) {
         throw new InvalidMidiDataException("corrupt MIDI file: illegal type");
      }

      if (var5 == 2) {
         throw new InvalidMidiDataException("this implementation doesn't support type 2 MIDI files");
      }

      short var6 = var2.readShort();
      if (var6 <= 0) {
         throw new InvalidMidiDataException("corrupt MIDI file: number of tracks must be positive");
      }

      if (var5 == 0 && var6 != 1) {
         throw new InvalidMidiDataException("corrupt MIDI file:  type 0 files must contain exactely one track");
      }

      int var7 = var2.readUnsignedShort();
      float var8;
      int var9;
      if ((var7 & 32768) != 0) {
         int var10 = -(var7 >>> 8 & 0xFF);

         var8 = switch (var10) {
            case 24 -> 24.0F;
            case 25 -> 25.0F;
            default -> throw new InvalidMidiDataException("corrupt MIDI file: illegal frame division type");
            case 29 -> 29.97F;
            case 30 -> 30.0F;
         };
         var9 = var7 & 0xFF;
      } else {
         var8 = 0.0F;
         var9 = var7 & 32767;
      }

      var2.skip(var4 - 6);
      return new TMidiFileFormat(var5, var8, var9, -1, -1L, var6);
   }

   @Override
   public MidiFileFormat getMidiFileFormat(URL var1) {
      try (InputStream var2 = var1.openStream()) {
         return this.getMidiFileFormat(var2);
      }
   }

   @Override
   public MidiFileFormat getMidiFileFormat(File var1) {
      try (FileInputStream var2 = new FileInputStream(var1)) {
         return this.getMidiFileFormat(var2);
      }
   }

   @Override
   public Sequence getSequence(URL var1) {
      InputStream var2 = var1.openStream();

      try {
         return this.getSequence(var2);
      } catch (InvalidMidiDataException | IOException var4) {
         logger.log(Level.ERROR, var4.getMessage(), var4);
         var2.close();
         throw var4;
      }
   }

   @Override
   public Sequence getSequence(File var1) {
      InputStream var2 = Files.newInputStream(var1.toPath());

      try {
         return this.getSequence(var2);
      } catch (InvalidMidiDataException | IOException var4) {
         logger.log(Level.ERROR, var4.getMessage(), var4);
         var2.close();
         throw var4;
      }
   }

   @Override
   public Sequence getSequence(InputStream var1) {
      MidiFileFormat var2 = this.getMidiFileFormat(var1);
      Sequence var3 = new Sequence(var2.getDivisionType(), var2.getResolution());
      DataInputStream var4 = new DataInputStream(var1);
      int var5 = ((TMidiFileFormat)var2).getTrackCount();

      for (int var6 = 0; var6 < var5; var6++) {
         Track var7 = var3.createTrack();
         this.readTrack(var4, var7);
      }

      return var3;
   }

   private void readTrack(DataInputStream var1, Track var2) {
      while (true) {
         int var3 = var1.readInt();
         if (var3 == 1297379947) {
            var3 = var1.readInt();
            long var12 = 0L;
            long[] var6 = new long[]{var3};
            int[] var7 = new int[]{-1};

            while (var6[0] > 0L) {
               long var8 = readVariableLengthQuantity(var1, var6);
               var12 += var8;
               MidiEvent var10 = readEvent(var1, var6, var7, var12);
               var2.add(var10);
            }

            return;
         }

         int var4 = var1.readInt();
         if (var4 % 2 != 0) {
            var4++;
         }

         var1.skip(var4);
      }
   }

   private static MidiEvent readEvent(DataInputStream var0, long[] var1, int[] var2, long var3) {
      int var5 = readUnsignedByte(var0, var1);
      MidiMessage var6 = null;
      boolean var7 = false;
      int var8 = 0;
      if (var5 < 128) {
         if (var2[0] == -1) {
            throw new InvalidMidiDataException("corrupt MIDI file: status byte missing");
         }

         var7 = true;
         var8 = var5;
         var5 = var2[0];
      }

      switch (getType(var5)) {
         case 1:
            int var9;
            if (var7) {
               var9 = var8;
            } else {
               var9 = readUnsignedByte(var0, var1);
               var2[0] = var5;
            }

            ShortMessage var10 = new ShortMessage();
            var10.setMessage(var5, var9, 0);
            var6 = var10;
            break;
         case 2:
            int var11;
            if (var7) {
               var11 = var8;
            } else {
               var11 = readUnsignedByte(var0, var1);
               var2[0] = var5;
            }

            int var12 = readUnsignedByte(var0, var1);
            ShortMessage var13 = new ShortMessage();
            var13.setMessage(var5, var11, var12);
            var6 = var13;
            break;
         case 3:
            if (CANCEL_RUNNING_STATUS_ON_META_AND_SYSEX) {
               var2[0] = -1;
            }

            int var14 = (int)readVariableLengthQuantity(var0, var1);
            byte[] var15 = new byte[var14];

            for (int var16 = 0; var16 < var14; var16++) {
               int var23 = readUnsignedByte(var0, var1);
               var15[var16] = (byte)var23;
            }

            SysexMessage var22 = new SysexMessage();
            var22.setMessage(var5, var15, var14);
            var6 = var22;
            break;
         case 4:
            if (CANCEL_RUNNING_STATUS_ON_META_AND_SYSEX) {
               var2[0] = -1;
            }

            int var17 = readUnsignedByte(var0, var1);
            int var18 = (int)readVariableLengthQuantity(var0, var1);
            byte[] var19 = new byte[var18];

            for (int var20 = 0; var20 < var18; var20++) {
               int var21 = readUnsignedByte(var0, var1);
               var19[var20] = (byte)var21;
            }

            MetaMessage var24 = new MetaMessage();
            var24.setMessage(var17, var19, var18);
            var6 = var24;
      }

      return new MidiEvent(var6, var3);
   }

   private static int getType(int var0) {
      if (var0 < 240) {
         int var1 = var0 & 240;

         return switch (var1) {
            case 128, 144, 160, 176, 224 -> 2;
            case 192, 208 -> 1;
            default -> 0;
         };
      } else if (var0 == 240 || var0 == 247) {
         return 3;
      } else {
         return var0 == 255 ? 4 : 0;
      }
   }

   public static long readVariableLengthQuantity(DataInputStream var0, long[] var1) {
      long var2 = 0L;
      int var4 = 0;

      while (var4 < 4) {
         int var5 = readUnsignedByte(var0, var1);
         var4++;
         var2 <<= 7;
         var2 |= var5 & 127;
         if (var5 < 128) {
            return var2;
         }
      }

      throw new InvalidMidiDataException("not a MIDI file: unterminated variable-length quantity");
   }

   public static int readUnsignedByte(DataInputStream var0, long[] var1) {
      int var2 = var0.readUnsignedByte();
      var1[0]--;
      return var2;
   }
}
