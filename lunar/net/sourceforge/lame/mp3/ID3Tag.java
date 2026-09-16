package net.sourceforge.lame.mp3;

import java.nio.charset.Charset;
import java.util.Arrays;

public class ID3Tag {
   private static final int CHANGED_FLAG = 1;
   private static final int ADD_V2_FLAG = 2;
   private static final int V1_ONLY_FLAG = 4;
   private static final int V2_ONLY_FLAG = 8;
   private static final int SPACE_V1_FLAG = 16;
   private static final int PAD_V2_FLAG = 32;
   private static final String[] genre_names = new String[]{
      "Blues",
      "Classic Rock",
      "Country",
      "Dance",
      "Disco",
      "Funk",
      "Grunge",
      "Hip-Hop",
      "Jazz",
      "Metal",
      "New Age",
      "Oldies",
      "Other",
      "Pop",
      "R&B",
      "Rap",
      "Reggae",
      "Rock",
      "Techno",
      "Industrial",
      "Alternative",
      "Ska",
      "Death Metal",
      "Pranks",
      "Soundtrack",
      "Euro-Techno",
      "Ambient",
      "Trip-Hop",
      "Vocal",
      "Jazz+Funk",
      "Fusion",
      "Trance",
      "Classical",
      "Instrumental",
      "Acid",
      "House",
      "Game",
      "Sound Clip",
      "Gospel",
      "Noise",
      "Alternative Rock",
      "Bass",
      "Soul",
      "Punk",
      "Space",
      "Meditative",
      "Instrumental Pop",
      "Instrumental Rock",
      "Ethnic",
      "Gothic",
      "Darkwave",
      "Techno-Industrial",
      "Electronic",
      "Pop-Folk",
      "Eurodance",
      "Dream",
      "Southern Rock",
      "Comedy",
      "Cult",
      "Gangsta",
      "Top 40",
      "Christian Rap",
      "Pop/Funk",
      "Jungle",
      "Native US",
      "Cabaret",
      "New Wave",
      "Psychedelic",
      "Rave",
      "Showtunes",
      "Trailer",
      "Lo-Fi",
      "Tribal",
      "Acid Punk",
      "Acid Jazz",
      "Polka",
      "Retro",
      "Musical",
      "Rock & Roll",
      "Hard Rock",
      "Folk",
      "Folk-Rock",
      "National Folk",
      "Swing",
      "Fast Fusion",
      "Bebob",
      "Latin",
      "Revival",
      "Celtic",
      "Bluegrass",
      "Avantgarde",
      "Gothic Rock",
      "Progressive Rock",
      "Psychedelic Rock",
      "Symphonic Rock",
      "Slow Rock",
      "Big Band",
      "Chorus",
      "Easy Listening",
      "Acoustic",
      "Humour",
      "Speech",
      "Chanson",
      "Opera",
      "Chamber Music",
      "Sonata",
      "Symphony",
      "Booty Bass",
      "Primus",
      "Porn Groove",
      "Satire",
      "Slow Jam",
      "Club",
      "Tango",
      "Samba",
      "Folklore",
      "Ballad",
      "Power Ballad",
      "Rhythmic Soul",
      "Freestyle",
      "Duet",
      "Punk Rock",
      "Drum Solo",
      "A Cappella",
      "Euro-House",
      "Dance Hall",
      "Goa",
      "Drum & Bass",
      "Club-House",
      "Hardcore",
      "Terror",
      "Indie",
      "BritPop",
      "Negerpunk",
      "Polsk Punk",
      "Beat",
      "Christian Gangsta",
      "Heavy Metal",
      "Black Metal",
      "Crossover",
      "Contemporary Christian",
      "Christian Rock",
      "Merengue",
      "Salsa",
      "Thrash Metal",
      "Anime",
      "JPop",
      "SynthPop"
   };
   private static final int[] genre_alpha_map = new int[]{
      123,
      34,
      74,
      73,
      99,
      20,
      40,
      26,
      145,
      90,
      116,
      41,
      135,
      85,
      96,
      138,
      89,
      0,
      107,
      132,
      65,
      88,
      104,
      102,
      97,
      136,
      61,
      141,
      32,
      1,
      112,
      128,
      57,
      140,
      2,
      139,
      58,
      3,
      125,
      50,
      22,
      4,
      55,
      127,
      122,
      120,
      98,
      52,
      48,
      54,
      124,
      25,
      84,
      80,
      115,
      81,
      119,
      5,
      30,
      36,
      59,
      126,
      38,
      49,
      91,
      6,
      129,
      79,
      137,
      7,
      35,
      100,
      131,
      19,
      33,
      46,
      47,
      8,
      29,
      146,
      63,
      86,
      71,
      45,
      142,
      9,
      77,
      82,
      64,
      133,
      10,
      66,
      39,
      11,
      103,
      12,
      75,
      134,
      13,
      53,
      62,
      109,
      117,
      23,
      108,
      92,
      67,
      93,
      43,
      121,
      15,
      68,
      14,
      16,
      76,
      87,
      118,
      17,
      78,
      143,
      114,
      110,
      69,
      21,
      111,
      95,
      105,
      42,
      37,
      24,
      56,
      44,
      101,
      83,
      94,
      106,
      147,
      113,
      18,
      51,
      130,
      144,
      60,
      70,
      31,
      72,
      27,
      28
   };
   private static final int GENRE_INDEX_OTHER = 12;
   private static final int ID_TITLE = FRAME_ID('T', 'I', 'T', '2');
   private static final int ID_ARTIST = FRAME_ID('T', 'P', 'E', '1');
   private static final int ID_ALBUM = FRAME_ID('T', 'A', 'L', 'B');
   private static final int ID_GENRE = FRAME_ID('T', 'C', 'O', 'N');
   private static final int ID_ENCODER = FRAME_ID('T', 'S', 'S', 'E');
   private static final int ID_PLAYLENGTH = FRAME_ID('T', 'L', 'E', 'N');
   private static final int ID_COMMENT = FRAME_ID('C', 'O', 'M', 'M');
   private static final int ID_DATE = FRAME_ID('T', 'D', 'A', 'T');
   private static final int ID_TIME = FRAME_ID('T', 'I', 'M', 'E');
   private static final int ID_TPOS = FRAME_ID('T', 'P', 'O', 'S');
   private static final int ID_TRACK = FRAME_ID('T', 'R', 'C', 'K');
   private static final int ID_YEAR = FRAME_ID('T', 'Y', 'E', 'R');
   private static final int ID_TXXX = FRAME_ID('T', 'X', 'X', 'X');
   private static final int ID_WXXX = FRAME_ID('W', 'X', 'X', 'X');
   private static final int ID_SYLT = FRAME_ID('S', 'Y', 'L', 'T');
   private static final int ID_APIC = FRAME_ID('A', 'P', 'I', 'C');
   private static final int ID_GEOB = FRAME_ID('G', 'E', 'O', 'B');
   private static final int ID_PCNT = FRAME_ID('P', 'C', 'N', 'T');
   private static final int ID_AENC = FRAME_ID('A', 'E', 'N', 'C');
   private static final int ID_LINK = FRAME_ID('L', 'I', 'N', 'K');
   private static final int ID_ENCR = FRAME_ID('E', 'N', 'C', 'R');
   private static final int ID_GRID = FRAME_ID('G', 'R', 'I', 'D');
   private static final int ID_PRIV = FRAME_ID('P', 'R', 'I', 'V');
   private static final int GENRE_NUM_UNKNOWN = 255;
   private static final Charset ASCII = Charset.forName("US-ASCII");
   private static final String mime_jpeg = "image/jpeg";
   private static final String mime_png = "image/png";
   private static final String mime_gif = "image/gif";
   BitStream bits;
   private Version version = new Version();

   private static int FRAME_ID(char var0, char var1, char var2, char var3) {
      return (var0 & 0xFF) << 24 | (var1 & 0xFF) << 16 | (var2 & 0xFF) << 8 | (var3 & 0xFF) << 0;
   }

   public final void setModules(BitStream var1) {
      this.bits = var1;
   }

   private void copyV1ToV2(LameGlobalFlags var1, int var2, String var3) {
      LameInternalFlags var4 = var1.internal_flags;
      int var5 = var4.tag_spec.flags;
      this.id3v2_add_latin1(var1, var2, null, null, var3);
      var4.tag_spec.flags = var5;
   }

   private void id3v2AddLameVersion(LameGlobalFlags var1) {
      this.copyV1ToV2(var1, ID_ENCODER, this.version.getVersion());
   }

   private void id3v2AddAudioDuration(LameGlobalFlags var1) {
      if (var1.num_samples != -1) {
         double var3 = 2.147483647E9;
         double var5 = var1.num_samples;
         var5 *= 1000.0;
         var5 /= var1.getInSampleRate();
         long var7;
         if (var5 > 2.147483647E9) {
            var7 = (long)var3;
         } else if (var5 < 0.0) {
            var7 = 0L;
         } else {
            var7 = (long)var5;
         }

         String var2 = String.format("%d", var7);
         this.copyV1ToV2(var1, ID_PLAYLENGTH, var2);
      }
   }

   public final void id3tag_genre_list(GenreListHandler var1) {
      if (var1 != null) {
         for (int var2 = 0; var2 < genre_names.length; var2++) {
            if (var2 < genre_alpha_map.length) {
               int var3 = genre_alpha_map[var2];
               var1.genre_list_handler(var3, genre_names[var3]);
            }
         }
      }
   }

   public final void init(LameGlobalFlags var1) {
      LameInternalFlags var2 = var1.internal_flags;
      var2.tag_spec = new ID3TagSpec();
      var2.tag_spec.genre_id3v1 = 255;
      var2.tag_spec.padding_size = 128;
      this.id3v2AddLameVersion(var1);
   }

   public final void id3tag_add_v2(LameGlobalFlags var1) {
      LameInternalFlags var2 = var1.internal_flags;
      var2.tag_spec.flags &= -5;
      var2.tag_spec.flags |= 2;
   }

   public final void id3tag_v1_only(LameGlobalFlags var1) {
      LameInternalFlags var2 = var1.internal_flags;
      var2.tag_spec.flags &= -11;
      var2.tag_spec.flags |= 4;
   }

   public final void id3tag_v2_only(LameGlobalFlags var1) {
      LameInternalFlags var2 = var1.internal_flags;
      var2.tag_spec.flags &= -5;
      var2.tag_spec.flags |= 8;
   }

   public final void id3tag_space_v1(LameGlobalFlags var1) {
      LameInternalFlags var2 = var1.internal_flags;
      var2.tag_spec.flags &= -9;
      var2.tag_spec.flags |= 16;
   }

   public final void id3tag_pad_v2(LameGlobalFlags var1) {
      this.id3tag_set_pad(var1, 128);
   }

   public final void id3tag_set_pad(LameGlobalFlags var1, int var2) {
      LameInternalFlags var3 = var1.internal_flags;
      var3.tag_spec.flags &= -5;
      var3.tag_spec.flags |= 32;
      var3.tag_spec.flags |= 2;
      var3.tag_spec.padding_size = var2;
   }

   public final boolean id3tag_set_albumart(LameGlobalFlags var1, byte[] var2, int var3) {
      ID3Tag.MimeType var4 = ID3Tag.MimeType.MIMETYPE_NONE;
      byte[] var5 = var2;
      LameInternalFlags var6 = var1.internal_flags;
      if (131072 < var3) {
         return false;
      }

      if (2 < var3 && var5[0] == -1 && var5[1] == -40) {
         var4 = ID3Tag.MimeType.MIMETYPE_JPEG;
      } else if (4 < var3 && var5[0] == 137 && new String(var5, 1, 3, ASCII).startsWith("PNG")) {
         var4 = ID3Tag.MimeType.MIMETYPE_PNG;
      } else {
         if (4 >= var3 || !new String(var5, 1, 3, ASCII).startsWith("GIF8")) {
            return false;
         }

         var4 = ID3Tag.MimeType.MIMETYPE_GIF;
      }

      if (var6.tag_spec.albumart != null) {
         var6.tag_spec.albumart = null;
         var6.tag_spec.albumart_size = 0;
         var6.tag_spec.albumart_mimetype = ID3Tag.MimeType.MIMETYPE_NONE;
      }

      if (var3 < 1) {
         return true;
      }

      var6.tag_spec.albumart = new byte[var3];
      if (var6.tag_spec.albumart != null) {
         System.arraycopy(var2, 0, var6.tag_spec.albumart, 0, var3);
         var6.tag_spec.albumart_size = var3;
         var6.tag_spec.albumart_mimetype = var4;
         var6.tag_spec.flags |= 1;
         this.id3tag_add_v2(var1);
      }

      return true;
   }

   private int set_4_byte_value(byte[] var1, int var2, int var3) {
      for (int var4 = 3; var4 >= 0; var4--) {
         var1[var2 + var4] = (byte)(var3 & 0xFF);
         var3 >>= 8;
      }

      return var2 + 4;
   }

   private int toID3v2TagId(String var1) {
      int var3 = 0;
      if (var1 == null) {
         return 0;
      }

      for (int var2 = 0; var2 < 4 && var2 < var1.length(); var2++) {
         char var4 = var1.charAt(var2);
         int var5 = 255 & var4;
         var3 <<= 8;
         var3 |= var5;
         if ((var4 < 'A' || 'Z' < var4) && (var4 < '0' || '9' < var4)) {
            return 0;
         }
      }

      return var3;
   }

   private boolean isNumericString(int var1) {
      return var1 == ID_DATE || var1 == ID_TIME || var1 == ID_TPOS || var1 == ID_TRACK || var1 == ID_YEAR;
   }

   private boolean isMultiFrame(int var1) {
      return var1 == ID_TXXX
         || var1 == ID_WXXX
         || var1 == ID_COMMENT
         || var1 == ID_SYLT
         || var1 == ID_APIC
         || var1 == ID_GEOB
         || var1 == ID_PCNT
         || var1 == ID_AENC
         || var1 == ID_LINK
         || var1 == ID_ENCR
         || var1 == ID_GRID
         || var1 == ID_PRIV;
   }

   private boolean hasUcs2ByteOrderMarker(char var1) {
      return var1 == '\ufffe' || var1 == '\ufeff';
   }

   private FrameDataNode findNode(ID3TagSpec var1, int var2, FrameDataNode var3) {
      for (FrameDataNode var4 = var3 != null ? var3.nxt : var1.v2_head; var4 != null; var4 = var4.nxt) {
         if (var4.fid == var2) {
            return var4;
         }
      }

      return null;
   }

   private void appendNode(ID3TagSpec var1, FrameDataNode var2) {
      if (var1.v2_tail != null && var1.v2_head != null) {
         var1.v2_tail.nxt = var2;
         var1.v2_tail = var2;
      } else {
         var1.v2_head = var2;
         var1.v2_tail = var2;
      }
   }

   private String setLang(String var1) {
      if (var1 != null && var1.length() != 0) {
         StringBuilder var3 = new StringBuilder();
         if (var1 != null) {
            var3.append(var1.substring(0, 3));
         }

         for (int var2 = var3.length(); var2 < 3; var2++) {
            var3.append(' ');
         }

         return var3.toString();
      } else {
         return "XXX";
      }
   }

   private boolean isSameLang(String var1, String var2) {
      String var3 = this.setLang(var2);

      for (int var4 = 0; var4 < 3; var4++) {
         char var5 = Character.toLowerCase(var1.charAt(var4));
         char var6 = Character.toLowerCase(var3.charAt(var4));
         if (var5 < ' ') {
            var5 = ' ';
         }

         if (var6 < ' ') {
            var6 = ' ';
         }

         if (var5 != var6) {
            return false;
         }
      }

      return true;
   }

   private boolean isSameDescriptor(FrameDataNode var1, String var2) {
      if (var1.dsc.enc == 1 && var1.dsc.dim > 0) {
         return false;
      }

      for (int var3 = 0; var3 < var1.dsc.dim; var3++) {
         if (null == var2 || var1.dsc.l.charAt(var3) != var2.charAt(var3)) {
            return false;
         }
      }

      return true;
   }

   private boolean isSameDescriptorUcs2(FrameDataNode var1, String var2) {
      if (var1.dsc.enc != 1 && var1.dsc.dim > 0) {
         return false;
      }

      for (int var3 = 0; var3 < var1.dsc.dim; var3++) {
         if (null == var2 || var1.dsc.l.charAt(var3) != var2.charAt(var3)) {
            return false;
         }
      }

      return true;
   }

   private void id3v2_add_ucs2(LameGlobalFlags var1, int var2, String var3, String var4, String var5) {
      LameInternalFlags var6 = var1.internal_flags;
      if (var6 != null) {
         FrameDataNode var7 = this.findNode(var6.tag_spec, var2, null);
         if (this.isMultiFrame(var2)) {
            while (var7 != null && (!this.isSameLang(var7.lng, var3) || !this.isSameDescriptorUcs2(var7, var4))) {
               var7 = this.findNode(var6.tag_spec, var2, var7);
            }
         }

         if (var7 == null) {
            var7 = new FrameDataNode();
            this.appendNode(var6.tag_spec, var7);
         }

         var7.fid = var2;
         var7.lng = this.setLang(var3);
         var7.dsc.l = var4;
         var7.dsc.dim = var4 != null ? var4.length() : 0;
         var7.dsc.enc = 1;
         var7.txt.l = var5;
         var7.txt.dim = var5 != null ? var5.length() : 0;
         var7.txt.enc = 1;
         var6.tag_spec.flags |= 3;
      }
   }

   private void id3v2_add_latin1(LameGlobalFlags var1, int var2, String var3, String var4, String var5) {
      LameInternalFlags var6 = var1.internal_flags;
      if (var6 != null) {
         FrameDataNode var7 = this.findNode(var6.tag_spec, var2, null);
         if (this.isMultiFrame(var2)) {
            while (var7 != null && (!this.isSameLang(var7.lng, var3) || !this.isSameDescriptor(var7, var4))) {
               var7 = this.findNode(var6.tag_spec, var2, var7);
            }
         }

         if (var7 == null) {
            var7 = new FrameDataNode();
            this.appendNode(var6.tag_spec, var7);
         }

         var7.fid = var2;
         var7.lng = this.setLang(var3);
         var7.dsc.l = var4;
         var7.dsc.dim = var4 != null ? var4.length() : 0;
         var7.dsc.enc = 0;
         var7.txt.l = var5;
         var7.txt.dim = var5 != null ? var5.length() : 0;
         var7.txt.enc = 0;
         var6.tag_spec.flags |= 3;
      }
   }

   public final int id3tag_set_textinfo_ucs2(LameGlobalFlags var1, String var2, String var3) {
      long var4 = FRAME_ID('T', '\u0000', '\u0000', '\u0000');
      int var6 = this.toID3v2TagId(var2);
      if (var6 == 0) {
         return -1;
      }

      if ((var6 & var4) == var4) {
         if (this.isNumericString(var6)) {
            return -2;
         }

         if (var3 == null) {
            return 0;
         }

         if (!this.hasUcs2ByteOrderMarker(var3.charAt(0))) {
            return -3;
         }

         if (var1 != null) {
            this.id3v2_add_ucs2(var1, var6, null, null, var3);
            return 0;
         }
      }

      return -255;
   }

   private int id3tag_set_textinfo_latin1(LameGlobalFlags var1, String var2, String var3) {
      long var4 = FRAME_ID('T', '\u0000', '\u0000', '\u0000');
      int var6 = this.toID3v2TagId(var2);
      if (var6 == 0) {
         return -1;
      }

      if ((var6 & var4) == var4) {
         if (var3 == null) {
            return 0;
         }

         if (var1 != null) {
            this.id3v2_add_latin1(var1, var6, null, null, var3);
            return 0;
         }
      }

      return -255;
   }

   public final int id3tag_set_comment(LameGlobalFlags var1, String var2, String var3, String var4, int var5) {
      if (var1 != null) {
         this.id3v2_add_latin1(var1, ID_COMMENT, var2, var3, var4);
         return 0;
      } else {
         return -255;
      }
   }

   public final void id3tag_set_title(LameGlobalFlags var1, String var2) {
      LameInternalFlags var3 = var1.internal_flags;
      if (var2 != null && var2.length() != 0) {
         var3.tag_spec.title = var2;
         var3.tag_spec.flags |= 1;
         this.copyV1ToV2(var1, ID_TITLE, var2);
      }
   }

   public final void id3tag_set_artist(LameGlobalFlags var1, String var2) {
      LameInternalFlags var3 = var1.internal_flags;
      if (var2 != null && var2.length() != 0) {
         var3.tag_spec.artist = var2;
         var3.tag_spec.flags |= 1;
         this.copyV1ToV2(var1, ID_ARTIST, var2);
      }
   }

   public final void id3tag_set_album(LameGlobalFlags var1, String var2) {
      LameInternalFlags var3 = var1.internal_flags;
      if (var2 != null && var2.length() != 0) {
         var3.tag_spec.album = var2;
         var3.tag_spec.flags |= 1;
         this.copyV1ToV2(var1, ID_ALBUM, var2);
      }
   }

   public final void id3tag_set_year(LameGlobalFlags var1, String var2) {
      LameInternalFlags var3 = var1.internal_flags;
      if (var2 != null && var2.length() != 0) {
         int var4 = Integer.valueOf(var2);
         if (var4 < 0) {
            var4 = 0;
         }

         if (var4 > 9999) {
            var4 = 9999;
         }

         if (var4 != 0) {
            var3.tag_spec.year = var4;
            var3.tag_spec.flags |= 1;
         }

         this.copyV1ToV2(var1, ID_YEAR, var2);
      }
   }

   public final void id3tag_set_comment(LameGlobalFlags var1, String var2) {
      LameInternalFlags var3 = var1.internal_flags;
      if (var2 != null && var2.length() != 0) {
         var3.tag_spec.comment = var2;
         var3.tag_spec.flags |= 1;
         int var4 = var3.tag_spec.flags;
         this.id3v2_add_latin1(var1, ID_COMMENT, "XXX", "", var2);
         var3.tag_spec.flags = var4;
      }
   }

   public final int id3tag_set_track(LameGlobalFlags var1, String var2) {
      LameInternalFlags var3 = var1.internal_flags;
      byte var4 = 0;
      if (var2 != null && var2.length() != 0) {
         int var5 = var2.indexOf(47);
         int var6;
         if (var5 != -1) {
            var6 = Integer.parseInt(var2.substring(0, var5));
         } else {
            var6 = Integer.parseInt(var2);
         }

         if (var6 < 1 || var6 > 255) {
            var6 = 0;
            var4 = -1;
            var3.tag_spec.flags |= 3;
         }

         if (var6 != 0) {
            var3.tag_spec.track_id3v1 = var6;
            var3.tag_spec.flags |= 1;
         }

         if (var5 != -1) {
            var3.tag_spec.flags |= 3;
         }

         this.copyV1ToV2(var1, ID_TRACK, var2);
      }

      return var4;
   }

   private int nextUpperAlpha(String var1, int var2, char var3) {
      for (char var4 = Character.toUpperCase(var1.charAt(var2)); var2 < var1.length(); var4 = Character.toUpperCase(var1.charAt(var2++))) {
         if ('A' <= var4 && var4 <= 'Z' && var4 != var3) {
            return var2;
         }
      }

      return var2;
   }

   private boolean sloppyCompared(String var1, String var2) {
      int var3 = this.nextUpperAlpha(var1, 0, '\u0000');
      int var4 = this.nextUpperAlpha(var2, 0, '\u0000');
      char var5 = var3 < var1.length() ? Character.toUpperCase(var1.charAt(var3)) : '\u0000';

      for (char var6 = Character.toUpperCase(var2.charAt(var4)); var5 == var6; var6 = Character.toUpperCase(var2.charAt(var4))) {
         if (var5 == 0) {
            return true;
         }

         if (var1.charAt(1) == '.') {
            while (var4 < var2.length() && var2.charAt(var4++) != ' ') {
            }
         }

         var3 = this.nextUpperAlpha(var1, var3, var5);
         var4 = this.nextUpperAlpha(var2, var4, var6);
         var5 = var3 < var1.length() ? Character.toUpperCase(var1.charAt(var3)) : '\u0000';
      }

      return false;
   }

   private int sloppySearchGenre(String var1) {
      for (int var2 = 0; var2 < genre_names.length; var2++) {
         if (this.sloppyCompared(var1, genre_names[var2])) {
            return var2;
         }
      }

      return genre_names.length;
   }

   private int searchGenre(String var1) {
      for (int var2 = 0; var2 < genre_names.length; var2++) {
         if (genre_names[var2].equals(var1)) {
            return var2;
         }
      }

      return genre_names.length;
   }

   public final int id3tag_set_genre(LameGlobalFlags var1, String var2) {
      LameInternalFlags var3 = var1.internal_flags;
      byte var4 = 0;
      if (var2 != null && var2.length() != 0) {
         int var5;
         try {
            var5 = Integer.parseInt(var2);
            if (var5 < 0 || var5 >= genre_names.length) {
               return -1;
            }

            var2 = genre_names[var5];
         } catch (NumberFormatException var7) {
            var5 = this.searchGenre(var2);
            if (var5 == genre_names.length) {
               var5 = this.sloppySearchGenre(var2);
            }

            if (var5 == genre_names.length) {
               var5 = 12;
               var4 = -2;
            } else {
               var2 = genre_names[var5];
            }
         }

         var3.tag_spec.genre_id3v1 = var5;
         var3.tag_spec.flags |= 1;
         if (var4 != 0) {
            var3.tag_spec.flags |= 2;
         }

         this.copyV1ToV2(var1, ID_GENRE, var2);
      }

      return var4;
   }

   private int set_frame_custom(byte[] var1, int var2, char[] var3) {
      if (var3 != null && var3[0] != 0) {
         int var4 = 5;
         int var5 = new String(var3, var4, var3.length - var4).length();
         int var10;
         var1[var10++] = (byte)var3[0];
         var1[var10++] = (byte)var3[1];
         var1[var10++] = (byte)var3[2];
         var1[var10++] = (byte)var3[3];
         var2 = this.set_4_byte_value(var1, var4, new String(var3, var4, var3.length - var4).length() + 1);
         var1[var2++] = 0;
         var1[var2++] = 0;
         var1[var2++] = 0;

         while (var5-- != 0) {
            var1[var2++] = (byte)var3[var4++];
         }
      }

      return var2;
   }

   private int sizeOfNode(FrameDataNode var1) {
      int var2 = 0;
      if (var1 != null) {
         var2 = 10;
         var2++;
         switch (var1.txt.enc) {
            case 0:
            default:
               var2 += var1.txt.dim;
               break;
            case 1:
               var2 += var1.txt.dim * 2;
         }
      }

      return var2;
   }

   private int sizeOfCommentNode(FrameDataNode var1) {
      int var2 = 0;
      if (var1 != null) {
         var2 = 10;
         var2 = ++var2 + 3;
         switch (var1.dsc.enc) {
            case 0:
            default:
               var2 += 1 + var1.dsc.dim;
               break;
            case 1:
               var2 += 2 + var1.dsc.dim * 2;
         }

         switch (var1.txt.enc) {
            case 0:
            default:
               var2 += var1.txt.dim;
               break;
            case 1:
               var2 += var1.txt.dim * 2;
         }
      }

      return var2;
   }

   private int writeChars(byte[] var1, int var2, String var3, int var4, int var5) {
      while (var5-- != 0) {
         var1[var2++] = (byte)var3.charAt(var4++);
      }

      return var2;
   }

   private int writeUcs2s(byte[] var1, int var2, String var3, int var4, int var5) {
      while (var5-- != 0) {
         var1[var2++] = (byte)(0xFF & var3.charAt(var4) >> '\b');
         var1[var2++] = (byte)(0xFF & var3.charAt(var4++));
      }

      return var2;
   }

   private int set_frame_comment(byte[] var1, int var2, FrameDataNode var3) {
      int var4 = this.sizeOfCommentNode(var3);
      if (var4 > 10) {
         var2 = this.set_4_byte_value(var1, var2, ID_COMMENT);
         var2 = this.set_4_byte_value(var1, var2, var4 - 10);
         var1[var2++] = 0;
         var1[var2++] = 0;
         var1[var2++] = (byte)(var3.txt.enc == 1 ? 1 : 0);
         var1[var2++] = (byte)var3.lng.charAt(0);
         var1[var2++] = (byte)var3.lng.charAt(1);
         var1[var2++] = (byte)var3.lng.charAt(2);
         if (var3.dsc.enc != 1) {
            var2 = this.writeChars(var1, var2, var3.dsc.l, 0, var3.dsc.dim);
            var1[var2++] = 0;
         } else {
            var2 = this.writeUcs2s(var1, var2, var3.dsc.l, 0, var3.dsc.dim);
            var1[var2++] = 0;
            var1[var2++] = 0;
         }

         if (var3.txt.enc != 1) {
            var2 = this.writeChars(var1, var2, var3.txt.l, 0, var3.txt.dim);
         } else {
            var2 = this.writeUcs2s(var1, var2, var3.txt.l, 0, var3.txt.dim);
         }
      }

      return var2;
   }

   private int set_frame_custom2(byte[] var1, int var2, FrameDataNode var3) {
      int var4 = this.sizeOfNode(var3);
      if (var4 > 10) {
         var2 = this.set_4_byte_value(var1, var2, var3.fid);
         var2 = this.set_4_byte_value(var1, var2, var4 - 10);
         var1[var2++] = 0;
         var1[var2++] = 0;
         var1[var2++] = (byte)(var3.txt.enc == 1 ? 1 : 0);
         if (var3.txt.enc != 1) {
            var2 = this.writeChars(var1, var2, var3.txt.l, 0, var3.txt.dim);
         } else {
            var2 = this.writeUcs2s(var1, var2, var3.txt.l, 0, var3.txt.dim);
         }
      }

      return var2;
   }

   private int set_frame_apic(byte[] var1, int var2, char[] var3, byte[] var4, int var5) {
      if (var3 != null && var4 != null && var5 != 0) {
         byte var9;
         int var8 = this.set_4_byte_value(var1, var9, FRAME_ID('A', 'P', 'I', 'C'));
         var2 = this.set_4_byte_value(var1, var8, 4 + var3.length + var5);
         var1[var2++] = 0;
         var1[var2++] = 0;
         var1[var2++] = 0;
         int var6 = 0;

         while (var6 < var3.length) {
            var1[var2++] = (byte)var3[var6++];
         }

         var1[var2++] = 0;
         var1[var2++] = 0;
         var1[var2++] = 0;
         int var7 = 0;

         while (var5-- != 0) {
            var1[var2++] = var4[var7++];
         }
      }

      return var2;
   }

   public final int id3tag_set_fieldvalue(LameGlobalFlags var1, String var2) {
      LameInternalFlags var3 = var1.internal_flags;
      if (var2 != null && var2.length() != 0) {
         int var4 = this.toID3v2TagId(var2);
         if (var2.length() < 5 || var2.charAt(4) != '=') {
            return -1;
         }

         if (var4 != 0 && this.id3tag_set_textinfo_latin1(var1, var2, var2.substring(5)) != 0) {
            var3.tag_spec.values.add(var2);
            var3.tag_spec.num_values++;
         }

         var3.tag_spec.flags |= 1;
      }

      this.id3tag_add_v2(var1);
      return 0;
   }

   public final int lame_get_id3v2_tag(LameGlobalFlags var1, byte[] var2, int var3) {
      if (var1 == null) {
         return 0;
      }

      LameInternalFlags var4 = var1.internal_flags;
      if (var4 == null) {
         return 0;
      }

      if ((var4.tag_spec.flags & 4) != 0) {
         return 0;
      }

      int var5 = var4.tag_spec.title != null ? var4.tag_spec.title.length() : 0;
      int var6 = var4.tag_spec.artist != null ? var4.tag_spec.artist.length() : 0;
      int var7 = var4.tag_spec.album != null ? var4.tag_spec.album.length() : 0;
      int var8 = var4.tag_spec.comment != null ? var4.tag_spec.comment.length() : 0;
      if ((var4.tag_spec.flags & 10) != 0 || var5 > 30 || var6 > 30 || var7 > 30 || var8 > 30 || var4.tag_spec.track_id3v1 != 0 && var8 > 28) {
         String var13 = null;
         this.id3v2AddAudioDuration(var1);
         int var9 = 10;

         for (int var12 = 0; var12 < var4.tag_spec.num_values; var12++) {
            var9 += 6 + var4.tag_spec.values.get(var12).length();
         }

         if (var4.tag_spec.albumart != null && var4.tag_spec.albumart_size != 0) {
            switch (var4.tag_spec.albumart_mimetype) {
               case MIMETYPE_JPEG:
                  var13 = "image/jpeg";
                  break;
               case MIMETYPE_PNG:
                  var13 = "image/png";
                  break;
               case MIMETYPE_GIF:
                  var13 = "image/gif";
            }

            if (var13 != null) {
               var9 += 14 + var13.length() + var4.tag_spec.albumart_size;
            }
         }

         ID3TagSpec var14 = var4.tag_spec;
         if (var14.v2_head != null) {
            for (FrameDataNode var15 = var14.v2_head; var15 != null; var15 = var15.nxt) {
               if (var15.fid == ID_COMMENT) {
                  var9 += this.sizeOfCommentNode(var15);
               } else {
                  var9 += this.sizeOfNode(var15);
               }
            }
         }

         if ((var4.tag_spec.flags & 32) != 0) {
            var9 += var4.tag_spec.padding_size;
         }

         if (var3 < var9) {
            return var9;
         }

         if (var2 == null) {
            return 0;
         }

         int var10 = 0;
         var2[var10++] = 73;
         var2[var10++] = 68;
         var2[var10++] = 51;
         var2[var10++] = 3;
         var2[var10++] = 0;
         var2[var10++] = 0;
         int var11 = var9 - 10;
         var2[var10++] = (byte)(var11 >> 21 & 127);
         var2[var10++] = (byte)(var11 >> 14 & 127);
         var2[var10++] = (byte)(var11 >> 7 & 127);
         var2[var10++] = (byte)(var11 & 127);
         var14 = var4.tag_spec;
         if (var14.v2_head != null) {
            for (FrameDataNode var28 = var14.v2_head; var28 != null; var28 = var28.nxt) {
               if (var28.fid == ID_COMMENT) {
                  var10 = this.set_frame_comment(var2, var10, var28);
               } else {
                  var10 = this.set_frame_custom2(var2, var10, var28);
               }
            }
         }

         for (int var26 = 0; var26 < var4.tag_spec.num_values; var26++) {
            var10 = this.set_frame_custom(var2, var10, var4.tag_spec.values.get(var26).toCharArray());
         }

         if (var13 != null) {
            var10 = this.set_frame_apic(var2, var10, var13.toCharArray(), var4.tag_spec.albumart, var4.tag_spec.albumart_size);
         }

         Arrays.fill(var2, var10, var9, (byte)0);
         return var9;
      } else {
         return 0;
      }
   }

   public final int id3tag_write_v2(LameGlobalFlags var1) {
      LameInternalFlags var2 = var1.internal_flags;
      if ((var2.tag_spec.flags & 1) != 0 && 0 == (var2.tag_spec.flags & 4)) {
         byte[] var3 = null;
         int var5 = this.lame_get_id3v2_tag(var1, null, 0);
         var3 = new byte[var5];
         int var4 = this.lame_get_id3v2_tag(var1, var3, var5);
         if (var4 > var5) {
            return -1;
         }

         for (int var6 = 0; var6 < var4; var6++) {
            this.bits.add_dummy_byte(var1, var3[var6] & 255, 1);
         }

         return var4;
      } else {
         return 0;
      }
   }

   private int set_text_field(byte[] var1, int var2, String var3, int var4, int var5) {
      int var6 = 0;

      while (var4-- != 0) {
         if (var3 != null && var6 < var3.length()) {
            var1[var2++] = (byte)var3.charAt(var6++);
         } else {
            var1[var2++] = (byte)var5;
         }
      }

      return var2;
   }

   public final int lame_get_id3v1_tag(LameGlobalFlags var1, byte[] var2, int var3) {
      short var4 = 128;
      if (var1 == null) {
         return 0;
      }

      if (var3 < var4) {
         return var4;
      }

      LameInternalFlags var5 = var1.internal_flags;
      if (var5 == null) {
         return 0;
      }

      if (var2 == null) {
         return 0;
      }

      if ((var5.tag_spec.flags & 1) != 0 && 0 == (var5.tag_spec.flags & 8)) {
         int var6 = 0;
         int var7 = (var5.tag_spec.flags & 16) != 0 ? 32 : 0;
         var2[var6++] = 84;
         var2[var6++] = 65;
         var2[var6++] = 71;
         var6 = this.set_text_field(var2, var6, var5.tag_spec.title, 30, var7);
         var6 = this.set_text_field(var2, var6, var5.tag_spec.artist, 30, var7);
         var6 = this.set_text_field(var2, var6, var5.tag_spec.album, 30, var7);
         String var8 = String.format("%d", var5.tag_spec.year);
         var6 = this.set_text_field(var2, var6, var5.tag_spec.year != 0 ? var8 : null, 4, var7);
         var6 = this.set_text_field(var2, var6, var5.tag_spec.comment, var5.tag_spec.track_id3v1 != 0 ? 28 : 30, var7);
         if (var5.tag_spec.track_id3v1 != 0) {
            var2[var6++] = 0;
            var2[var6++] = (byte)var5.tag_spec.track_id3v1;
         }

         var2[var6++] = (byte)var5.tag_spec.genre_id3v1;
         return var4;
      } else {
         return 0;
      }
   }

   public final int id3tag_write_v1(LameGlobalFlags var1) {
      byte[] var2 = new byte[128];
      int var3 = var2.length;
      int var4 = this.lame_get_id3v1_tag(var1, var2, var3);
      if (var4 > var3) {
         return 0;
      }

      for (int var5 = 0; var5 < var4; var5++) {
         this.bits.add_dummy_byte(var1, var2[var5] & 255, 1);
      }

      return var4;
   }

   enum MimeType {
      MIMETYPE_NONE,
      MIMETYPE_JPEG,
      MIMETYPE_PNG,
      MIMETYPE_GIF;
   }
}
