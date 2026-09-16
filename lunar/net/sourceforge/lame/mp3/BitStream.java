package net.sourceforge.lame.mp3;

import java.util.Arrays;
import net.sourceforge.lame.mpg.MPGLib;

public class BitStream {
   private static final int CRC16_POLYNOMIAL = 32773;
   private static final int MAX_LENGTH = 32;
   GainAnalysis ga;
   MPGLib mpg;
   VBRTag vbr;
   private Version version = new Version();
   private byte[] buf;
   private int totbit;
   private int bufByteIdx;
   private int bufBitIdx;

   public static boolean EQ(float var0, float var1) {
      return Math.abs(var0) > Math.abs(var1) ? Math.abs(var0 - var1) <= Math.abs(var0) * 1.0E-6F : Math.abs(var0 - var1) <= Math.abs(var1) * 1.0E-6F;
   }

   public static boolean NEQ(float var0, float var1) {
      return !EQ(var0, var1);
   }

   public final void setModules(GainAnalysis var1, MPGLib var2, VBRTag var3) {
      this.ga = var1;
      this.mpg = var2;
      this.vbr = var3;
   }

   public final int getframebits(LameGlobalFlags var1) {
      LameInternalFlags var2 = var1.internal_flags;
      int var3;
      if (var2.bitrate_index != 0) {
         var3 = Tables.bitrate_table[var1.getMpegVersion()][var2.bitrate_index];
      } else {
         var3 = var1.getBitRate();
      }

      assert 8 <= var3 && var3 <= 640;
      return 8 * ((var1.getMpegVersion() + 1) * 72000 * var3 / var1.getOutSampleRate() + var2.padding);
   }

   private void putheader_bits(LameInternalFlags var1) {
      System.arraycopy(var1.header[var1.w_ptr].buf, 0, this.buf, this.bufByteIdx, var1.sideinfo_len);
      this.bufByteIdx = this.bufByteIdx + var1.sideinfo_len;
      this.totbit = this.totbit + var1.sideinfo_len * 8;
      var1.w_ptr = var1.w_ptr + 1 & 0xFF;
   }

   private void putbits2(LameInternalFlags var1, int var2, int var3) {
      assert var3 < 30;

      while (var3 > 0) {
         if (this.bufBitIdx == 0) {
            this.bufBitIdx = 8;
            this.bufByteIdx++;
            assert this.bufByteIdx < 147456;
            assert var1.header[var1.w_ptr].write_timing >= this.totbit;
            if (var1.header[var1.w_ptr].write_timing == this.totbit) {
               this.putheader_bits(var1);
            }

            this.buf[this.bufByteIdx] = 0;
         }

         int var4 = Math.min(var3, this.bufBitIdx);
         var3 -= var4;
         this.bufBitIdx -= var4;
         assert var3 < 32;
         assert this.bufBitIdx < 32;
         this.buf[this.bufByteIdx] = (byte)(this.buf[this.bufByteIdx] | var2 >> var3 << this.bufBitIdx);
         this.totbit += var4;
      }
   }

   private void putbits_noheaders(LameInternalFlags var1, int var2, int var3) {
      assert var3 < 30;

      while (var3 > 0) {
         if (this.bufBitIdx == 0) {
            this.bufBitIdx = 8;
            this.bufByteIdx++;
            assert this.bufByteIdx < 147456;
            this.buf[this.bufByteIdx] = 0;
         }

         int var4 = Math.min(var3, this.bufBitIdx);
         var3 -= var4;
         this.bufBitIdx -= var4;
         assert var3 < 32;
         assert this.bufBitIdx < 32;
         this.buf[this.bufByteIdx] = (byte)(this.buf[this.bufByteIdx] | var2 >> var3 << this.bufBitIdx);
         this.totbit += var4;
      }
   }

   private void drain_into_ancillary(LameGlobalFlags var1, int var2) {
      LameInternalFlags var3 = var1.internal_flags;
      assert var2 >= 0;
      if (var2 >= 8) {
         this.putbits2(var3, 76, 8);
         var2 -= 8;
      }

      if (var2 >= 8) {
         this.putbits2(var3, 65, 8);
         var2 -= 8;
      }

      if (var2 >= 8) {
         this.putbits2(var3, 77, 8);
         var2 -= 8;
      }

      if (var2 >= 8) {
         this.putbits2(var3, 69, 8);
         var2 -= 8;
      }

      if (var2 >= 32) {
         String var5 = this.version.getLameShortVersion();
         if (var2 >= 32) {
            for (int var4 = 0; var4 < var5.length() && var2 >= 8; var4++) {
               var2 -= 8;
               this.putbits2(var3, var5.charAt(var4), 8);
            }
         }
      }

      while (var2 >= 1) {
         this.putbits2(var3, var3.ancillary_flag, 1);
         var3.ancillary_flag = var3.ancillary_flag ^ (!var1.disable_reservoir ? 1 : 0);
         var2--;
      }

      assert var2 == 0;
   }

   private void writeheader(LameInternalFlags var1, int var2, int var3) {
      int var4 = var1.header[var1.h_ptr].ptr;

      while (var3 > 0) {
         int var5 = Math.min(var3, 8 - (var4 & 7));
         var3 -= var5;
         assert var3 < 32;
         var1.header[var1.h_ptr].buf[var4 >> 3] = (byte)(var1.header[var1.h_ptr].buf[var4 >> 3] | var2 >> var3 << 8 - (var4 & 7) - var5);
         var4 += var5;
      }

      var1.header[var1.h_ptr].ptr = var4;
   }

   private int CRC_update(int var1, int var2) {
      var1 <<= 8;

      for (int var3 = 0; var3 < 8; var3++) {
         var1 <<= 1;
         var2 <<= 1;
         if (((var2 ^ var1) & 65536) != 0) {
            var2 ^= 32773;
         }
      }

      return var2;
   }

   public final void CRC_writeheader(LameInternalFlags var1, byte[] var2) {
      int var3 = 65535;
      var3 = this.CRC_update(var2[2] & 255, var3);
      var3 = this.CRC_update(var2[3] & 255, var3);

      for (int var4 = 6; var4 < var1.sideinfo_len; var4++) {
         var3 = this.CRC_update(var2[var4] & 255, var3);
      }

      var2[4] = (byte)(var3 >> 8);
      var2[5] = (byte)(var3 & 0xFF);
   }

   private void encodeSideInfo2(LameGlobalFlags var1, int var2) {
      LameInternalFlags var3 = var1.internal_flags;
      IIISideInfo var4 = var3.l3_side;
      var3.header[var3.h_ptr].ptr = 0;
      Arrays.fill(var3.header[var3.h_ptr].buf, 0, var3.sideinfo_len, (byte)0);
      if (var1.getOutSampleRate() < 16000) {
         this.writeheader(var3, 4094, 12);
      } else {
         this.writeheader(var3, 4095, 12);
      }

      this.writeheader(var3, var1.getMpegVersion(), 1);
      this.writeheader(var3, 1, 2);
      this.writeheader(var3, !var1.error_protection ? 1 : 0, 1);
      this.writeheader(var3, var3.bitrate_index, 4);
      this.writeheader(var3, var3.samplerate_index, 2);
      this.writeheader(var3, var3.padding, 1);
      this.writeheader(var3, var1.extension, 1);
      this.writeheader(var3, var1.getMode().getNumMode(), 2);
      this.writeheader(var3, var3.mode_ext, 2);
      this.writeheader(var3, var1.copyright, 1);
      this.writeheader(var3, var1.original, 1);
      this.writeheader(var3, var1.emphasis, 2);
      if (var1.error_protection) {
         this.writeheader(var3, 0, 16);
      }

      if (var1.getMpegVersion() != 1) {
         assert var4.main_data_begin >= 0;
         this.writeheader(var3, var4.main_data_begin, 8);
         this.writeheader(var3, var4.private_bits, var3.channels_out);
         byte var8 = 0;
         int var10 = 0;

         while (var10 < var3.channels_out) {
            GrInfo var12 = var4.tt[var8][var10];
            this.writeheader(var3, var12.part2_3_length + var12.part2_length, 12);
            this.writeheader(var3, var12.big_values / 2, 9);
            this.writeheader(var3, var12.global_gain, 8);
            this.writeheader(var3, var12.scalefac_compress, 9);
            if (var12.block_type != 0) {
               this.writeheader(var3, 1, 1);
               this.writeheader(var3, var12.block_type, 2);
               this.writeheader(var3, var12.mixed_block_flag, 1);
               if (var12.table_select[0] == 14) {
                  var12.table_select[0] = 16;
               }

               this.writeheader(var3, var12.table_select[0], 5);
               if (var12.table_select[1] == 14) {
                  var12.table_select[1] = 16;
               }

               this.writeheader(var3, var12.table_select[1], 5);
               this.writeheader(var3, var12.subblock_gain[0], 3);
               this.writeheader(var3, var12.subblock_gain[1], 3);
               this.writeheader(var3, var12.subblock_gain[2], 3);
            } else {
               this.writeheader(var3, 0, 1);
               if (var12.table_select[0] == 14) {
                  var12.table_select[0] = 16;
               }

               this.writeheader(var3, var12.table_select[0], 5);
               if (var12.table_select[1] == 14) {
                  var12.table_select[1] = 16;
               }

               this.writeheader(var3, var12.table_select[1], 5);
               if (var12.table_select[2] == 14) {
                  var12.table_select[2] = 16;
               }

               this.writeheader(var3, var12.table_select[2], 5);
               assert 0 <= var12.region0_count && var12.region0_count < 16;
               assert 0 <= var12.region1_count && var12.region1_count < 8;
               this.writeheader(var3, var12.region0_count, 4);
               this.writeheader(var3, var12.region1_count, 3);
            }

            this.writeheader(var3, var12.scalefac_scale, 1);
            this.writeheader(var3, var12.count1table_select, 1);
            var10++;
            continue;

            throw new AssertionError();
         }
      } else {
         assert var4.main_data_begin >= 0;
         this.writeheader(var3, var4.main_data_begin, 9);
         if (var3.channels_out == 2) {
            this.writeheader(var3, var4.private_bits, 3);
         } else {
            this.writeheader(var3, var4.private_bits, 5);
         }

         for (int var6 = 0; var6 < var3.channels_out; var6++) {
            for (int var7 = 0; var7 < 4; var7++) {
               this.writeheader(var3, var4.scfsi[var6][var7], 1);
            }
         }

         for (int var5 = 0; var5 < 2; var5++) {
            for (int var9 = 0; var9 < var3.channels_out; var9++) {
               GrInfo var11 = var4.tt[var5][var9];
               this.writeheader(var3, var11.part2_3_length + var11.part2_length, 12);
               this.writeheader(var3, var11.big_values / 2, 9);
               this.writeheader(var3, var11.global_gain, 8);
               this.writeheader(var3, var11.scalefac_compress, 4);
               if (var11.block_type != 0) {
                  this.writeheader(var3, 1, 1);
                  this.writeheader(var3, var11.block_type, 2);
                  this.writeheader(var3, var11.mixed_block_flag, 1);
                  if (var11.table_select[0] == 14) {
                     var11.table_select[0] = 16;
                  }

                  this.writeheader(var3, var11.table_select[0], 5);
                  if (var11.table_select[1] == 14) {
                     var11.table_select[1] = 16;
                  }

                  this.writeheader(var3, var11.table_select[1], 5);
                  this.writeheader(var3, var11.subblock_gain[0], 3);
                  this.writeheader(var3, var11.subblock_gain[1], 3);
                  this.writeheader(var3, var11.subblock_gain[2], 3);
               } else {
                  this.writeheader(var3, 0, 1);
                  if (var11.table_select[0] == 14) {
                     var11.table_select[0] = 16;
                  }

                  this.writeheader(var3, var11.table_select[0], 5);
                  if (var11.table_select[1] == 14) {
                     var11.table_select[1] = 16;
                  }

                  this.writeheader(var3, var11.table_select[1], 5);
                  if (var11.table_select[2] == 14) {
                     var11.table_select[2] = 16;
                  }

                  this.writeheader(var3, var11.table_select[2], 5);
                  assert 0 <= var11.region0_count && var11.region0_count < 16;
                  assert 0 <= var11.region1_count && var11.region1_count < 8;
                  this.writeheader(var3, var11.region0_count, 4);
                  this.writeheader(var3, var11.region1_count, 3);
               }

               this.writeheader(var3, var11.preflag, 1);
               this.writeheader(var3, var11.scalefac_scale, 1);
               this.writeheader(var3, var11.count1table_select, 1);
            }
         }
      }

      if (var1.error_protection) {
         this.CRC_writeheader(var3, var3.header[var3.h_ptr].buf);
      }

      int var13 = var3.h_ptr;
      assert var3.header[var13].ptr == var3.sideinfo_len * 8;
      var3.h_ptr = var13 + 1 & 0xFF;
      var3.header[var3.h_ptr].write_timing = var3.header[var13].write_timing + var2;
      if (var3.h_ptr == var3.w_ptr) {
         System.err.println("Error: MAX_HEADER_BUF too small in bitstream.c \n");
      }
   }

   private int huffman_coder_count1(LameInternalFlags var1, GrInfo var2) {
      HuffCodeTab var3 = Tables.ht[var2.count1table_select + 32];
      int var5 = 0;
      int var6 = var2.big_values;
      int var7 = var2.big_values;
      assert var2.count1table_select < 2;

      for (int var4 = (var2.count1 - var2.big_values) / 4; var4 > 0; var4--) {
         int var8 = 0;
         int var9 = 0;
         int var10 = var2.l3_enc[var6 + 0];
         if (var10 != 0) {
            var9 += 8;
            if (var2.xr[var7 + 0] < 0.0F) {
               var8++;
            }

            assert var10 <= 1;
         }

         var10 = var2.l3_enc[var6 + 1];
         if (var10 != 0) {
            var9 += 4;
            var8 *= 2;
            if (var2.xr[var7 + 1] < 0.0F) {
               var8++;
            }

            assert var10 <= 1;
         }

         var10 = var2.l3_enc[var6 + 2];
         if (var10 != 0) {
            var9 += 2;
            var8 *= 2;
            if (var2.xr[var7 + 2] < 0.0F) {
               var8++;
            }

            assert var10 <= 1;
         }

         var10 = var2.l3_enc[var6 + 3];
         if (var10 != 0) {
            var9++;
            var8 *= 2;
            if (var2.xr[var7 + 3] < 0.0F) {
               var8++;
            }

            assert var10 <= 1;
         }

         var6 += 4;
         var7 += 4;
         this.putbits2(var1, var8 + var3.table[var9], var3.hlen[var9]);
         var5 += var3.hlen[var9];
      }

      return var5;
   }

   private int Huffmancode(LameInternalFlags var1, int var2, int var3, int var4, GrInfo var5) {
      HuffCodeTab var6 = Tables.ht[var2];
      int var7 = 0;
      assert var2 < 32;
      if (0 == var2) {
         return var7;
      }

      for (int var8 = var3; var8 < var4; var8 += 2) {
         int var9 = 0;
         int var10 = 0;
         int var11 = var6.xlen;
         int var12 = var6.xlen;
         int var13 = 0;
         int var14 = var5.l3_enc[var8];
         int var15 = var5.l3_enc[var8 + 1];
         if (var14 != 0) {
            if (var5.xr[var8] < 0.0F) {
               var13++;
            }

            var9--;
         }

         if (var2 > 15) {
            if (var14 > 14) {
               int var16 = var14 - 15;
               assert var16 <= var6.linmax;
               var13 |= var16 << 1;
               var10 = var11;
               var14 = 15;
            }

            if (var15 > 14) {
               int var21 = var15 - 15;
               assert var21 <= var6.linmax;
               var13 <<= var11;
               var13 |= var21;
               var10 += var11;
               var15 = 15;
            }

            var12 = 16;
         }

         if (var15 != 0) {
            var13 <<= 1;
            if (var5.xr[var8 + 1] < 0.0F) {
               var13++;
            }

            var9--;
         }

         assert (var14 | var15) < 16;
         var14 = var14 * var12 + var15;
         var10 -= var9;
         var9 += var6.hlen[var14];
         assert var9 <= 32;
         assert var10 <= 32;
         this.putbits2(var1, var6.table[var14], var9);
         this.putbits2(var1, var13, var10);
         var7 += var9 + var10;
      }

      return var7;
   }

   private int ShortHuffmancodebits(LameInternalFlags var1, GrInfo var2) {
      int var3 = 3 * var1.scalefac_band.s[3];
      if (var3 > var2.big_values) {
         var3 = var2.big_values;
      }

      int var4 = this.Huffmancode(var1, var2.table_select[0], 0, var3, var2);
      return var4 + this.Huffmancode(var1, var2.table_select[1], var3, var2.big_values, var2);
   }

   private int LongHuffmancodebits(LameInternalFlags var1, GrInfo var2) {
      int var3 = var2.big_values;
      assert 0 <= var3 && var3 <= 576;
      int var7 = var2.region0_count + 1;
      assert 0 <= var7;
      assert var7 < var1.scalefac_band.l.length;
      int var5 = var1.scalefac_band.l[var7];
      var7 += var2.region1_count + 1;
      assert 0 <= var7;
      assert var7 < var1.scalefac_band.l.length;
      int var6 = var1.scalefac_band.l[var7];
      if (var5 > var3) {
         var5 = var3;
      }

      if (var6 > var3) {
         var6 = var3;
      }

      int var4 = this.Huffmancode(var1, var2.table_select[0], 0, var5, var2);
      var4 += this.Huffmancode(var1, var2.table_select[1], var5, var6, var2);
      return var4 + this.Huffmancode(var1, var2.table_select[2], var6, var3, var2);
   }

   private int writeMainData(LameGlobalFlags var1) {
      int var6 = 0;
      LameInternalFlags var7 = var1.internal_flags;
      IIISideInfo var8 = var7.l3_side;
      if (var1.getMpegVersion() == 1) {
         for (int var2 = 0; var2 < 2; var2++) {
            for (int var3 = 0; var3 < var7.channels_out; var3++) {
               GrInfo var9 = var8.tt[var2][var3];
               int var10 = Takehiro.slen1_tab[var9.scalefac_compress];
               int var11 = Takehiro.slen2_tab[var9.scalefac_compress];
               int var5 = 0;

               int var4;
               for (var4 = 0; var4 < var9.sfbdivide; var4++) {
                  if (var9.scalefac[var4] != -1) {
                     this.putbits2(var7, var9.scalefac[var4], var10);
                     var5 += var10;
                  }
               }

               for (; var4 < var9.sfbmax; var4++) {
                  if (var9.scalefac[var4] != -1) {
                     this.putbits2(var7, var9.scalefac[var4], var11);
                     var5 += var11;
                  }
               }

               assert var5 == var9.part2_length;
               if (var9.block_type == 2) {
                  var5 += this.ShortHuffmancodebits(var7, var9);
               } else {
                  var5 += this.LongHuffmancodebits(var7, var9);
               }

               var5 += this.huffman_coder_count1(var7, var9);
               assert var5 == var9.part2_3_length + var9.part2_length;
               var6 += var5;
            }
         }
      } else {
         byte var15 = 0;

         for (int var16 = 0; var16 < var7.channels_out; var16++) {
            GrInfo var23 = var8.tt[var15][var16];
            int var12 = 0;
            assert var23.sfb_partition_table != null;
            int var20 = 0;
            int var17 = 0;
            int var26 = 0;
            if (var23.block_type == 2) {
               while (true) {
                  if (var26 >= 4) {
                     var20 += this.ShortHuffmancodebits(var7, var23);
                     break;
                  }

                  int var27 = var23.sfb_partition_table[var26] / 3;
                  int var28 = var23.slen[var26];

                  for (int var25 = 0; var25 < var27; var17++) {
                     this.putbits2(var7, Math.max(var23.scalefac[var17 * 3 + 0], 0), var28);
                     this.putbits2(var7, Math.max(var23.scalefac[var17 * 3 + 1], 0), var28);
                     this.putbits2(var7, Math.max(var23.scalefac[var17 * 3 + 2], 0), var28);
                     var12 += 3 * var28;
                     var25++;
                  }

                  var26++;
               }
            } else {
               while (var26 < 4) {
                  int var13 = var23.sfb_partition_table[var26];
                  int var14 = var23.slen[var26];

                  for (int var24 = 0; var24 < var13; var17++) {
                     this.putbits2(var7, Math.max(var23.scalefac[var17], 0), var14);
                     var12 += var14;
                     var24++;
                  }

                  var26++;
               }

               var20 += this.LongHuffmancodebits(var7, var23);
            }

            var20 += this.huffman_coder_count1(var7, var23);
            assert var20 == var23.part2_3_length;
            assert var12 == var23.part2_length;
            var6 += var12 + var20;
         }
      }

      return var6;
   }

   private int compute_flushbits(LameGlobalFlags var1, BitStream.TotalBytes var2) {
      LameInternalFlags var3 = var1.internal_flags;
      int var8 = var3.w_ptr;
      int var7 = var3.h_ptr - 1;
      if (var7 == -1) {
         var7 = 255;
      }

      int var4 = var3.header[var7].write_timing - this.totbit;
      var2.total = var4;
      if (var4 >= 0) {
         int var5 = 1 + var7 - var8;
         if (var7 < var8) {
            var5 = 1 + var7 - var8 + 256;
         }

         var4 -= var5 * 8 * var3.sideinfo_len;
      }

      int var6 = this.getframebits(var1);
      var4 += var6;
      var2.total += var6;
      if (var2.total % 8 != 0) {
         var2.total = 1 + var2.total / 8;
      } else {
         var2.total /= 8;
      }

      var2.total = var2.total + this.bufByteIdx + 1;
      if (var4 < 0) {
         System.err.println("strange error flushing buffer ... \n");
      }

      return var4;
   }

   public final void flush_bitstream(LameGlobalFlags var1) {
      LameInternalFlags var2 = var1.internal_flags;
      int var5 = var2.h_ptr - 1;
      if (var5 == -1) {
         var5 = 255;
      }

      IIISideInfo var3 = var2.l3_side;
      int var4;
      if ((var4 = this.compute_flushbits(var1, new BitStream.TotalBytes())) >= 0) {
         this.drain_into_ancillary(var1, var4);
         assert var2.header[var5].write_timing + this.getframebits(var1) == this.totbit;
         var2.ResvSize = 0;
         var3.main_data_begin = 0;
         if (var2.findReplayGain) {
            float var6 = this.ga.GetTitleGain(var2.rgdata);
            assert NEQ(var6, -24601.0F);
            var2.RadioGain = (int)Math.floor(var6 * 10.0 + 0.5);
         }

         if (var2.findPeakSample) {
            var2.noclipGainChange = (int)Math.ceil(Math.log10(var2.PeakSample / 32767.0) * 20.0 * 10.0);
            if (var2.noclipGainChange > 0) {
               if (!EQ(var1.scale, 1.0F) && !EQ(var1.scale, 0.0F)) {
                  var2.noclipScale = -1.0F;
               } else {
                  var2.noclipScale = (float)(Math.floor(32767.0 / var2.PeakSample * 100.0) / 100.0);
               }
            } else {
               var2.noclipScale = -1.0F;
            }
         }
      }
   }

   public final void add_dummy_byte(LameGlobalFlags var1, int var2, int var3) {
      LameInternalFlags var4 = var1.internal_flags;

      while (var3-- > 0) {
         this.putbits_noheaders(var4, var2, 8);

         for (int var5 = 0; var5 < 256; var5++) {
            var4.header[var5].write_timing += 8;
         }
      }
   }

   public final int format_bitstream(LameGlobalFlags var1) {
      LameInternalFlags var2 = var1.internal_flags;
      IIISideInfo var3 = var2.l3_side;
      int var4 = this.getframebits(var1);
      this.drain_into_ancillary(var1, var3.resvDrain_pre);
      this.encodeSideInfo2(var1, var4);
      int var5 = 8 * var2.sideinfo_len;
      var5 += this.writeMainData(var1);
      this.drain_into_ancillary(var1, var3.resvDrain_post);
      var5 += var3.resvDrain_post;
      var3.main_data_begin += (var4 - var5) / 8;
      if (this.compute_flushbits(var1, new BitStream.TotalBytes()) != var2.ResvSize) {
         System.err.println("Internal buffer inconsistency. flushbits <> ResvSize");
      }

      if (var3.main_data_begin * 8 != var2.ResvSize) {
         System.err
            .printf(
               "bit reservoir error: \nl3_side.main_data_begin: %d \nResvoir size:             %d \nresv drain (post)         %d \nresv drain (pre)          %d \nheader and sideinfo:      %d \ndata bits:                %d \ntotal bits:               %d (remainder: %d) \nbitsperframe:             %d \n",
               8 * var3.main_data_begin,
               var2.ResvSize,
               var3.resvDrain_post,
               var3.resvDrain_pre,
               8 * var2.sideinfo_len,
               var5 - var3.resvDrain_post - 8 * var2.sideinfo_len,
               var5,
               var5 % 8,
               var4
            );
         System.err.println("This is a fatal error.  It has several possible causes:");
         System.err.println("90%%  LAME compiled with buggy version of gcc using advanced optimizations");
         System.err.println(" 9%%  Your system is overclocked");
         System.err.println(" 1%%  bug in LAME encoding library");
         var2.ResvSize = var3.main_data_begin * 8;
      }

      assert this.totbit % 8 == 0;
      if (this.totbit > 1000000000) {
         for (int var6 = 0; var6 < 256; var6++) {
            var2.header[var6].write_timing = var2.header[var6].write_timing - this.totbit;
         }

         this.totbit = 0;
      }

      return 0;
   }

   public final int copy_buffer(LameInternalFlags var1, byte[] var2, int var3, int var4, int var5) {
      int var6 = this.bufByteIdx + 1;
      if (var6 <= 0) {
         return 0;
      }

      if (var4 != 0 && var6 > var4) {
         return -1;
      }

      System.arraycopy(this.buf, 0, var2, var3, var6);
      this.bufByteIdx = -1;
      this.bufBitIdx = 0;
      if (var5 != 0) {
         int[] var7 = new int[]{var1.nMusicCRC};
         this.vbr.updateMusicCRC(var7, var2, var3, var6);
         var1.nMusicCRC = var7[0];
         if (var6 > 0) {
            var1.VBR_seek_table.nBytesWritten += var6;
         }

         if (var1.decode_on_the_fly) {
            float[][] var8 = new float[2][1152];
            int var9 = var6;
            int var10 = -1;

            while (var10 != 0) {
               var10 = this.mpg.hip_decode1_unclipped(var1.hip, var2, var3, var9, var8[0], var8[1]);
               var9 = 0;
               if (var10 == -1) {
                  var10 = 0;
               }

               if (var10 > 0) {
                  assert var10 <= 1152;
                  if (var1.findPeakSample) {
                     for (int var11 = 0; var11 < var10; var11++) {
                        if (var8[0][var11] > var1.PeakSample) {
                           var1.PeakSample = var8[0][var11];
                        } else if (-var8[0][var11] > var1.PeakSample) {
                           var1.PeakSample = -var8[0][var11];
                        }
                     }

                     if (var1.channels_out > 1) {
                        for (int var12 = 0; var12 < var10; var12++) {
                           if (var8[1][var12] > var1.PeakSample) {
                              var1.PeakSample = var8[1][var12];
                           } else if (-var8[1][var12] > var1.PeakSample) {
                              var1.PeakSample = -var8[1][var12];
                           }
                        }
                     }
                  }

                  if (var1.findReplayGain && this.ga.AnalyzeSamples(var1.rgdata, var8[0], 0, var8[1], 0, var10, var1.channels_out) == 0) {
                     return -6;
                  }
               }
            }
         }
      }

      return var6;
   }

   public final void init_bit_stream_w(LameInternalFlags var1) {
      this.buf = new byte[147456];
      var1.h_ptr = var1.w_ptr = 0;
      var1.header[var1.h_ptr].write_timing = 0;
      this.bufByteIdx = -1;
      this.bufBitIdx = 0;
      this.totbit = 0;
   }

   public static class TotalBytes {
      public int total;
   }
}
