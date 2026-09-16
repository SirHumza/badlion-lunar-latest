package com.github.trilarion.sound.vorbis.sampled;

import com.github.trilarion.sound.sampled.AsynchronousFilteredAudioInputStream;
import com.github.trilarion.sound.sampled.CircularBuffer;
import com.github.trilarion.sound.vorbis.jcraft.jogg.Packet;
import com.github.trilarion.sound.vorbis.jcraft.jogg.Page;
import com.github.trilarion.sound.vorbis.jcraft.jogg.StreamState;
import com.github.trilarion.sound.vorbis.jcraft.jogg.SyncState;
import com.github.trilarion.sound.vorbis.jcraft.jorbis.Block;
import com.github.trilarion.sound.vorbis.jcraft.jorbis.Comment;
import com.github.trilarion.sound.vorbis.jcraft.jorbis.DspState;
import com.github.trilarion.sound.vorbis.jcraft.jorbis.Info;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;

public class DecodedVorbisAudioInputStream extends AsynchronousFilteredAudioInputStream implements CircularBuffer.BufferListener {
   private static final Logger LOG = Logger.getLogger(DecodedVorbisAudioInputStream.class.getName());
   private InputStream oggBitStream_;
   private SyncState oggSyncState_ = null;
   private StreamState oggStreamState_ = null;
   private Page oggPage_ = null;
   private Packet oggPacket_ = null;
   private Info vorbisInfo = null;
   private Comment vorbisComment = null;
   private DspState vorbisDspState = null;
   private Block vorbisBlock = null;
   static final int playState_NeedHeaders = 0;
   static final int playState_ReadData = 1;
   static final int playState_WriteData = 2;
   static final int playState_Done = 3;
   static final int playState_BufferFull = 4;
   static final int playState_Corrupt = -1;
   private int playState;
   private final int bufferMultiple_ = 4;
   private final int bufferSize_ = 2048;
   private int convsize = 4096;
   private final byte[] convbuffer = new byte[this.convsize];
   private byte[] buffer = null;
   private int bytes = 0;
   private float[][][] _pcmf = null;
   private int[] _index = null;
   private int index = 0;
   private int i = 0;
   int bout = 0;
   private long currentBytes = 0L;

   public DecodedVorbisAudioInputStream(AudioFormat var1, AudioInputStream var2) {
      super(var1, -1L);
      this.oggBitStream_ = var2;
      this.init_jorbis();
      this.index = 0;
      this.playState = 0;
   }

   private void init_jorbis() {
      this.oggSyncState_ = new SyncState();
      this.oggStreamState_ = new StreamState();
      this.oggPage_ = new Page();
      this.oggPacket_ = new Packet();
      this.vorbisInfo = new Info();
      this.vorbisComment = new Comment();
      this.vorbisDspState = new DspState();
      this.vorbisBlock = new Block(this.vorbisDspState);
      this.buffer = null;
      this.bytes = 0;
      this.currentBytes = 0L;
      this.oggSyncState_.init();
   }

   @Override
   public void dataReady() {
      switch (this.playState) {
         case -1:
            LOG.log(Level.FINE, "playState = playState_Corrupt");
            break;
         case 0:
            LOG.log(Level.FINE, "playState = playState_NeedHeaders");
            break;
         case 1:
            LOG.log(Level.FINE, "playState = playState_ReadData");
            break;
         case 2:
            LOG.log(Level.FINE, "playState = playState_WriteData");
            break;
         case 3:
            LOG.log(Level.FINE, "playState = playState_Done");
            break;
         case 4:
            LOG.log(Level.FINE, "playState = playState_BufferFull");
      }

      switch (this.playState) {
         case -1:
            LOG.log(Level.FINE, "Corrupt Song.");
         case 3:
            this.oggStreamState_.clear();
            this.vorbisBlock.clear();
            this.vorbisDspState.clear();
            this.vorbisInfo.clear();
            this.oggSyncState_.clear();
            LOG.log(Level.FINE, "Done Song.");

            try {
               if (this.oggBitStream_ != null) {
                  this.oggBitStream_.close();
               }

               this.getCircularBuffer().close();
            } catch (Exception var3) {
               LOG.log(Level.FINE, var3.getMessage());
            }
            break;
         case 0:
            try {
               this.readHeaders();
            } catch (IOException var4) {
               this.playState = -1;
               return;
            }

            this.playState = 1;
            break;
         case 1:
            this.index = this.oggSyncState_.buffer(2048);
            this.buffer = this.oggSyncState_.data;
            this.bytes = this.readFromStream(this.buffer, this.index, 2048);
            LOG.log(Level.FINE, "More data : {0}", this.bytes);
            if (this.bytes == -1) {
               this.playState = 3;
               LOG.log(Level.FINE, "Ogg Stream empty. Settings playState to playState_Done.");
            } else {
               this.oggSyncState_.wrote(this.bytes);
               if (this.bytes == 0) {
                  if (this.oggPage_.eos() != 0 || this.oggStreamState_.e_o_s != 0 || this.oggPacket_.e_o_s != 0) {
                     LOG.log(Level.FINE, "oggSyncState wrote 0 bytes: settings playState to playState_Done.");
                     this.playState = 3;
                  }

                  LOG.log(Level.FINE, "oggSyncState wrote 0 bytes: but stream not yet empty.");
               } else {
                  int var5 = this.oggSyncState_.pageout(this.oggPage_);
                  if (var5 == 0) {
                     LOG.log(Level.FINE, "Setting playState to playState_ReadData.");
                     this.playState = 1;
                  } else if (var5 == -1) {
                     LOG.log(Level.FINE, "Corrupt or missing data in bitstream; setting playState to playState_ReadData");
                     this.playState = 1;
                  } else {
                     this.oggStreamState_.pagein(this.oggPage_);
                     LOG.log(Level.FINE, "Setting playState to playState_WriteData.");
                     this.playState = 2;
                  }
               }
            }
            break;
         case 2:
            LOG.log(Level.FINE, "Decoding");

            while (true) {
               int var1 = this.oggStreamState_.packetout(this.oggPacket_);
               switch (var1) {
                  case -1:
                     LOG.log(Level.FINE, "Corrupt or missing data in packetout bitstream; going to read state...");
                     break;
                  case 0:
                     LOG.log(Level.FINE, "Packetout returned 0, going to read state.");
                     this.playState = 1;
                     if (this.oggPage_.eos() != 0) {
                        LOG.log(Level.FINE, "Settings playState to playState_Done.");
                        this.playState = 3;
                     }

                     return;
                  default:
                     if (this.vorbisBlock.synthesis(this.oggPacket_) == 0) {
                        this.vorbisDspState.synthesis_blockin(this.vorbisBlock);
                        this.outputSamples();
                        if (this.playState == 4) {
                           return;
                        }
                     } else {
                        LOG.log(Level.FINE, "VorbisBlock.synthesis() returned !0, continuing.");
                     }
               }
            }
         case 4:
            this.continueFromBufferFull();
      }
   }

   private void outputSamples() {
      int var1;
      while ((var1 = this.vorbisDspState.synthesis_pcmout(this._pcmf, this._index)) > 0) {
         float[][] var2 = this._pcmf[0];
         this.bout = var1 < this.convsize ? var1 : this.convsize;

         for (this.i = 0; this.i < this.vorbisInfo.channels; this.i++) {
            int var3 = this.i * 2;
            int var4 = this._index[this.i];

            for (int var5 = 0; var5 < this.bout; var5++) {
               double var6 = var2[this.i][var4 + var5] * 32767.0;
               int var8 = (int)var6;
               if (var8 > 32767) {
                  var8 = 32767;
               }

               if (var8 < -32768) {
                  var8 = -32768;
               }

               if (var8 < 0) {
                  var8 |= 32768;
               }

               this.convbuffer[var3] = (byte)var8;
               this.convbuffer[var3 + 1] = (byte)(var8 >>> 8);
               var3 += 2 * this.vorbisInfo.channels;
            }
         }

         LOG.log(Level.FINE, "about to write: {0}", 2 * this.vorbisInfo.channels * this.bout);
         if (this.getCircularBuffer().availableWrite() < 2 * this.vorbisInfo.channels * this.bout) {
            LOG.log(Level.FINE, "Too much data in this data packet, better return, let the channel drain, and try again...");
            this.playState = 4;
            return;
         }

         this.getCircularBuffer().write(this.convbuffer, 0, 2 * this.vorbisInfo.channels * this.bout);
         if (this.bytes < 2048) {
            LOG.log(Level.FINE, "Finished with final buffer of music?");
         }

         if (this.vorbisDspState.synthesis_read(this.bout) != 0) {
            LOG.log(Level.FINE, "VorbisDspState.synthesis_read returned -1.");
         }
      }

      this.playState = 1;
   }

   private void continueFromBufferFull() {
      if (this.getCircularBuffer().availableWrite() < 2 * this.vorbisInfo.channels * this.bout) {
         LOG.log(Level.FINE, "Too much data in this data packet, better return, let the channel drain, and try again...");
      } else {
         this.getCircularBuffer().write(this.convbuffer, 0, 2 * this.vorbisInfo.channels * this.bout);
         this.outputSamples();
      }
   }

   private void readHeaders() {
      LOG.log(Level.FINE, "readHeaders(");
      this.index = this.oggSyncState_.buffer(2048);
      this.buffer = this.oggSyncState_.data;
      this.bytes = this.readFromStream(this.buffer, this.index, 2048);
      if (this.bytes == -1) {
         LOG.log(Level.FINE, "Cannot get any data from selected Ogg bitstream.");
         throw new IOException("Cannot get any data from selected Ogg bitstream.");
      }

      this.oggSyncState_.wrote(this.bytes);
      if (this.oggSyncState_.pageout(this.oggPage_) != 1) {
         if (this.bytes < 2048) {
            throw new IOException("EOF");
         }

         LOG.log(Level.FINE, "Input does not appear to be an Ogg bitstream.");
         throw new IOException("Input does not appear to be an Ogg bitstream.");
      } else {
         this.oggStreamState_.init(this.oggPage_.serialno());
         this.vorbisInfo.init();
         this.vorbisComment.init();
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

         this.i = 0;

         while (this.i < 2) {
            while (this.i < 2) {
               int var1 = this.oggSyncState_.pageout(this.oggPage_);
               if (var1 == 0) {
                  break;
               }

               if (var1 == 1) {
                  this.oggStreamState_.pagein(this.oggPage_);

                  while (this.i < 2) {
                     var1 = this.oggStreamState_.packetout(this.oggPacket_);
                     if (var1 == 0) {
                        break;
                     }

                     if (var1 == -1) {
                        LOG.log(Level.FINE, "Corrupt secondary header.  Exiting.");
                        throw new IOException("Corrupt secondary header.  Exiting.");
                     }

                     this.vorbisInfo.synthesis_headerin(this.vorbisComment, this.oggPacket_);
                     this.i++;
                  }
               }
            }

            this.index = this.oggSyncState_.buffer(2048);
            this.buffer = this.oggSyncState_.data;
            this.bytes = this.readFromStream(this.buffer, this.index, 2048);
            if (this.bytes == -1) {
               break;
            }

            if (this.bytes == 0 && this.i < 2) {
               LOG.log(Level.FINE, "End of file before finding all Vorbis headers!");
               throw new IOException("End of file before finding all Vorbis  headers!");
            }

            this.oggSyncState_.wrote(this.bytes);
         }

         byte[][] var8 = this.vorbisComment.user_comments;

         for (byte[] var5 : var8) {
            if (var5 == null) {
               break;
            }

            String var6 = new String(var5, 0, var5.length - 1, Charset.forName("US-ASCII")).trim();
            LOG.log(Level.FINE, "Comment: {0}", var6);
         }

         this.convsize = 2048 / this.vorbisInfo.channels;
         this.vorbisDspState.synthesis_init(this.vorbisInfo);
         this.vorbisBlock.init(this.vorbisDspState);
         this._pcmf = new float[1][][];
         this._index = new int[this.vorbisInfo.channels];
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

      this.currentBytes += var4;
      return var4;
   }

   @Override
   public void close() {
      super.close();
      this.oggBitStream_.close();
   }
}
