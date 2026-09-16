package com.github.trilarion.sound.vorbis.sampled.spi;

import com.github.trilarion.sound.sampled.spi.TAudioFileReader;
import com.github.trilarion.sound.util.SoundException;
import com.github.trilarion.sound.vorbis.jcraft.jogg.Packet;
import com.github.trilarion.sound.vorbis.jcraft.jogg.Page;
import com.github.trilarion.sound.vorbis.jcraft.jogg.StreamState;
import com.github.trilarion.sound.vorbis.jcraft.jogg.SyncState;
import com.github.trilarion.sound.vorbis.jcraft.jorbis.Comment;
import com.github.trilarion.sound.vorbis.jcraft.jorbis.Info;
import com.github.trilarion.sound.vorbis.jcraft.jorbis.VorbisFile;
import com.github.trilarion.sound.vorbis.sampled.VorbisAudioFileFormat;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.sound.sampled.AudioFileFormat.Type;
import javax.sound.sampled.AudioFormat.Encoding;

public class VorbisAudioFileReader extends TAudioFileReader {
   private static final Logger LOG = Logger.getLogger(VorbisAudioFileReader.class.getName());
   public static final Encoding VORBISENC = new Encoding("VORBISENC");
   public static final Type OGG_AUDIOFILEFORMAT_TYPE = new Type("OGG", "ogg");
   private SyncState oggSyncState_ = null;
   private StreamState oggStreamState_ = null;
   private Page oggPage_ = null;
   private Packet oggPacket_ = null;
   private Info vorbisInfo = null;
   private Comment vorbisComment = null;
   private final int bufferMultiple_ = 4;
   private byte[] buffer = null;
   private int bytes = 0;
   private int index = 0;
   private InputStream oggBitStream_ = null;
   private static final int INITAL_READ_LENGTH = 64000;
   private static final int MARK_LIMIT = 64001;

   public VorbisAudioFileReader() {
      super(64001, true);
   }

   @Override
   public AudioFileFormat getAudioFileFormat(File var1) {
      LOG.log(Level.FINE, "getAudioFileFormat(File file)");

      try {
         BufferedInputStream var2 = new BufferedInputStream(new FileInputStream(var1));

         AudioFileFormat var4;
         try {
            var2.mark(64001);
            this.getAudioFileFormat(var2);
            var2.reset();
            VorbisFile var3 = new VorbisFile(var1.getAbsolutePath());
            var4 = this.getAudioFileFormat(var2, (int)var1.length(), Math.round(var3.time_total(-1) * 1000.0F));
         } catch (Throwable var6) {
            try {
               var2.close();
            } catch (Throwable var5) {
               var6.addSuppressed(var5);
            }

            throw var6;
         }

         var2.close();
         return var4;
      } catch (SoundException var7) {
         throw new IOException(var7.getMessage());
      }
   }

   @Override
   public AudioFileFormat getAudioFileFormat(URL var1) {
      LOG.log(Level.FINE, "getAudioFileFormat(URL url)");
      InputStream var2 = var1.openStream();

      AudioFileFormat var3;
      try {
         var3 = this.getAudioFileFormat(var2);
      } catch (Throwable var6) {
         if (var2 != null) {
            try {
               var2.close();
            } catch (Throwable var5) {
               var6.addSuppressed(var5);
            }
         }

         throw var6;
      }

      if (var2 != null) {
         var2.close();
      }

      return var3;
   }

   @Override
   public AudioFileFormat getAudioFileFormat(InputStream var1) {
      LOG.log(Level.FINE, "getAudioFileFormat(InputStream inputStream)");

      try {
         if (!var1.markSupported()) {
            var1 = new BufferedInputStream(var1);
         }

         var1.mark(64001);
         return this.getAudioFileFormat(var1, -1, -1);
      } finally {
         var1.reset();
      }
   }

   @Override
   public AudioFileFormat getAudioFileFormat(InputStream var1, long var2) {
      return this.getAudioFileFormat(var1, (int)var2, -1);
   }

   protected AudioFileFormat getAudioFileFormat(InputStream var1, int var2, int var3) {
      HashMap var4 = new HashMap();
      HashMap var5 = new HashMap();
      if (var3 == -1) {
         var3 = 0;
      }

      if (var3 > 0) {
         var4.put("duration", var3 * 1000L);
      }

      this.oggBitStream_ = var1;
      this.oggSyncState_ = new SyncState();
      this.oggStreamState_ = new StreamState();
      this.oggPage_ = new Page();
      this.oggPacket_ = new Packet();
      this.vorbisInfo = new Info();
      this.vorbisComment = new Comment();
      this.buffer = null;
      this.bytes = 0;
      this.oggSyncState_.init();
      this.index = 0;

      try {
         this.readHeaders(var4, var5);
      } catch (IOException var13) {
         LOG.log(Level.FINE, var13.getMessage());
         throw new UnsupportedAudioFileException(var13.getMessage());
      }

      String var6 = this.vorbisInfo.toString();
      LOG.log(Level.FINE, var6);
      int var7 = var6.lastIndexOf("bitrate:");
      int var8 = -1;
      int var9 = -1;
      int var10 = -1;
      if (var7 != -1) {
         var6 = var6.substring(var7 + 8);
         StringTokenizer var11 = new StringTokenizer(var6, ",");
         if (var11.hasMoreTokens()) {
            var8 = Integer.parseInt(var11.nextToken());
         }

         if (var11.hasMoreTokens()) {
            var9 = Integer.parseInt(var11.nextToken());
         }

         if (var11.hasMoreTokens()) {
            var10 = Integer.parseInt(var11.nextToken());
         }
      }

      if (var9 > 0) {
         var5.put("bitrate", var9);
      }

      var5.put("vbr", true);
      if (var8 > 0) {
         var4.put("ogg.bitrate.min.bps", var8);
      }

      if (var10 > 0) {
         var4.put("ogg.bitrate.max.bps", var10);
      }

      if (var9 > 0) {
         var4.put("ogg.bitrate.nominal.bps", var9);
      }

      if (this.vorbisInfo.channels > 0) {
         var4.put("ogg.channels", this.vorbisInfo.channels);
      }

      if (this.vorbisInfo.rate > 0) {
         var4.put("ogg.frequency.hz", this.vorbisInfo.rate);
      }

      if (var2 > 0) {
         var4.put("ogg.length.bytes", var2);
      }

      var4.put("ogg.version", this.vorbisInfo.version);
      float var15 = -1.0F;
      if (var9 > 0) {
         var15 = var9 / 8;
      } else if (var8 > 0) {
         var15 = var8 / 8;
      }

      AudioFormat var12 = new AudioFormat(VORBISENC, this.vorbisInfo.rate, -1, this.vorbisInfo.channels, 1, var15, false, var5);
      return new VorbisAudioFileFormat(OGG_AUDIOFILEFORMAT_TYPE, var12, -1, var2, var4);
   }

   @Override
   public AudioInputStream getAudioInputStream(InputStream var1) {
      LOG.log(Level.FINE, "getAudioInputStream(InputStream inputStream)");
      return this.getAudioInputStream(var1, -1, -1);
   }

   public AudioInputStream getAudioInputStream(InputStream var1, int var2, int var3) {
      LOG.log(Level.FINE, "getAudioInputStream(InputStream inputStreamint medialength, int totalms)");

      try {
         if (!var1.markSupported()) {
            var1 = new BufferedInputStream(var1);
         }

         var1.mark(64001);
         AudioFileFormat var4 = this.getAudioFileFormat(var1, var2, var3);
         var1.reset();
         return new AudioInputStream(var1, var4.getFormat(), var4.getFrameLength());
      } catch (UnsupportedAudioFileException | IOException var5) {
         var1.reset();
         throw var5;
      }
   }

   @Override
   public AudioInputStream getAudioInputStream(File var1) {
      LOG.log(Level.FINE, "getAudioInputStream(File file)");
      FileInputStream var2 = new FileInputStream(var1);

      try {
         return this.getAudioInputStream(var2);
      } catch (UnsupportedAudioFileException | IOException var4) {
         var2.close();
         throw var4;
      }
   }

   @Override
   public AudioInputStream getAudioInputStream(URL var1) {
      LOG.log(Level.FINE, "getAudioInputStream(URL url)");
      InputStream var2 = var1.openStream();

      try {
         return this.getAudioInputStream(var2);
      } catch (UnsupportedAudioFileException | IOException var4) {
         if (var2 != null) {
            var2.close();
         }

         throw var4;
      }
   }

   private void readHeaders(Map<String, Object> var1, Map<String, Object> var2) {
      LOG.log(Level.FINE, "readHeaders(");
      short var3 = 2048;
      this.index = this.oggSyncState_.buffer(var3);
      this.buffer = this.oggSyncState_.data;
      this.bytes = this.readFromStream(this.buffer, this.index, var3);
      if (this.bytes == -1) {
         LOG.log(Level.FINE, "Cannot get any data from selected Ogg bitstream.");
         throw new IOException("Cannot get any data from selected Ogg bitstream.");
      }

      this.oggSyncState_.wrote(this.bytes);
      if (this.oggSyncState_.pageout(this.oggPage_) != 1) {
         if (this.bytes < var3) {
            throw new IOException("EOF");
         }

         LOG.log(Level.FINE, "Input does not appear to be an Ogg bitstream.");
         throw new IOException("Input does not appear to be an Ogg bitstream.");
      } else {
         this.oggStreamState_.init(this.oggPage_.serialno());
         this.vorbisInfo.init();
         this.vorbisComment.init();
         var1.put("ogg.serial", this.oggPage_.serialno());
         if (this.oggStreamState_.pagein(this.oggPage_) < 0) {
            LOG.log(Level.FINE, "Error reading first page of Ogg bitstream data.");
            throw new IOException("Error reading first page of Ogg bitstream data.");
         }

         if (this.oggStreamState_.packetout(this.oggPacket_) != 1) {
            LOG.log(Level.FINE, "Error reading initial header packet.");
            throw new IOException("Error reading initial header packet.");
         }

         if (this.vorbisInfo.synthesis_headerin(this.vorbisComment, this.oggPacket_) < 0) {
            LOG.log(Level.FINE, "This Ogg bitstream does not contain Vorbis audio data.");
            throw new IOException("This Ogg bitstream does not contain Vorbis audio data.");
         }

         int var4 = 0;

         while (var4 < 2) {
            while (var4 < 2) {
               int var5 = this.oggSyncState_.pageout(this.oggPage_);
               if (var5 == 0) {
                  break;
               }

               if (var5 == 1) {
                  this.oggStreamState_.pagein(this.oggPage_);

                  while (var4 < 2) {
                     var5 = this.oggStreamState_.packetout(this.oggPacket_);
                     if (var5 == 0) {
                        break;
                     }

                     if (var5 == -1) {
                        LOG.log(Level.FINE, "Corrupt secondary header.  Exiting.");
                        throw new IOException("Corrupt secondary header.  Exiting.");
                     }

                     this.vorbisInfo.synthesis_headerin(this.vorbisComment, this.oggPacket_);
                     var4++;
                  }
               }
            }

            this.index = this.oggSyncState_.buffer(var3);
            this.buffer = this.oggSyncState_.data;
            this.bytes = this.readFromStream(this.buffer, this.index, var3);
            if (this.bytes == -1) {
               break;
            }

            if (this.bytes == 0 && var4 < 2) {
               LOG.log(Level.FINE, "End of file before finding all Vorbis headers!");
               throw new IOException("End of file before finding all Vorbis  headers!");
            }

            this.oggSyncState_.wrote(this.bytes);
         }

         byte[][] var13 = this.vorbisComment.user_comments;
         int var6 = 0;

         for (byte[] var10 : var13) {
            if (var10 == null) {
               break;
            }

            String var11 = new String(var10, 0, var10.length - 1, StandardCharsets.UTF_8).trim();
            LOG.log(Level.FINE, var11);
            if (var11.toLowerCase(Locale.ENGLISH).startsWith("artist")) {
               var1.put("author", var11.substring(7));
            } else if (var11.toLowerCase(Locale.ENGLISH).startsWith("title")) {
               var1.put("title", var11.substring(6));
            } else if (var11.toLowerCase(Locale.ENGLISH).startsWith("album")) {
               var1.put("album", var11.substring(6));
            } else if (var11.toLowerCase(Locale.ENGLISH).startsWith("date")) {
               var1.put("date", var11.substring(5));
            } else if (var11.toLowerCase(Locale.ENGLISH).startsWith("copyright")) {
               var1.put("copyright", var11.substring(10));
            } else if (var11.toLowerCase(Locale.ENGLISH).startsWith("comment")) {
               var1.put("comment", var11.substring(8));
            } else if (var11.toLowerCase(Locale.ENGLISH).startsWith("genre")) {
               var1.put("ogg.comment.genre", var11.substring(6));
            } else if (var11.toLowerCase(Locale.ENGLISH).startsWith("tracknumber")) {
               var1.put("ogg.comment.track", var11.substring(12));
            } else {
               var1.put("ogg.comment.ext." + ++var6, var11);
            }

            var1.put("ogg.comment.encodedby", new String(this.vorbisComment.vendor, 0, this.vorbisComment.vendor.length - 1, Charset.forName("US-ASCII")));
         }
      }
   }

   private int readFromStream(byte[] var1, int var2, int var3) {
      int var4;
      try {
         var4 = this.oggBitStream_.read(var1, var2, var3);
      } catch (Exception var6) {
         LOG.log(Level.FINE, "Cannot Read Selected Song");
         var4 = -1;
      }

      return var4;
   }
}
