package com.nothome.delta;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.HashMap;

public class Checksum {
   private HashMap<Long, Integer> checksums = new HashMap<>();
   private static final char[] single_hash = new char[]{
      '병',
      '뭥',
      '䋂',
      '\udffe',
      '陦',
      '䌛',
      '蔄',
      '\ueb46',
      '捹',
      '푠',
      '켔',
      '叏',
      '\udb51',
      '\udb08',
      'ወ',
      '\uf602',
      '\ue766',
      '⎔',
      '┍',
      '\udcbb',
      'ꙸ',
      'ʯ',
      'ꗆ',
      '约',
      '뙅',
      '쭍',
      '쑋',
      '\ue5dc',
      '鿦',
      '孜',
      '㗵',
      '瀚',
      '∏',
      '永',
      'ᩖ',
      '䲣',
      'ￆ',
      '녒',
      '赡',
      '穘',
      '逥',
      '謽',
      '뼏',
      '閣',
      '\ue5f4',
      '섧',
      '㯭',
      '㈋',
      '럳',
      '恔',
      '㌼',
      '펃',
      '腔',
      '剂',
      '不',
      'ઔ',
      '瀨',
      '蚉',
      '㨢',
      'ঀ',
      'ᡇ',
      '냱',
      '魜',
      '䅶',
      '롘',
      '핂',
      'Ὤ',
      '⒗',
      '橚',
      '龩',
      '豚',
      '睃',
      'ꢩ',
      '騂',
      '䤘',
      '䎌',
      '쎈',
      '鸫',
      '䲭',
      'ƶ',
      '\uab19',
      '\uf777',
      '㙟',
      'Ẳ',
      'ञ',
      '篸',
      '窎',
      '刧',
      '\ueab1',
      '⁴',
      '䔣',
      '\ue781',
      'ƣ',
      'ᘽ',
      '㬮',
      '⡽',
      '广',
      'ꁣ',
      '넴',
      '辮',
      '庎',
      '랷',
      '䕈',
      '\u1f5a',
      '節',
      '稤',
      '透',
      '䋜',
      '챩',
      'ʠ',
      'ଢ',
      '\udb31',
      '燾',
      '౽',
      'ᜲ',
      'ᅙ',
      '쬉',
      '\ue1d2',
      'ፑ',
      '勩',
      '\uf536',
      '婏',
      '쌖',
      '毹',
      '覔',
      '띴',
      '弾',
      '\uf6d6',
      '㩡',
      '\uf82c',
      '찢',
      '鴆',
      '⦜',
      '\u09e5',
      'Ử',
      '兏',
      '赓',
      'Ꙑ',
      '屮',
      '앷',
      '祘',
      '熬',
      '褖',
      '魏',
      'Ⰹ',
      '刑',
      '\uf6d8',
      '쪪',
      '\uf7ef',
      '⡿',
      '窔',
      'ꭉ',
      '館',
      '爢',
      '\ue457',
      '휚',
      'Ã',
      '᩶',
      '\ue98c',
      '쀷',
      '興',
      '尭',
      '\udfda',
      '\ue5f5',
      '\u0b45',
      'ᗎ',
      '詾',
      'ﲭ',
      'ꨭ',
      '䭜',
      '퐮',
      '뉑',
      '遾',
      '驇',
      '즦',
      '\ud93f',
      '࡞',
      '㗎',
      'ꅓ',
      '繻',
      '鼋',
      '▪',
      '嶟',
      '쁍',
      '討',
      '⡵',
      '䨜',
      '⥟',
      '᎓',
      '\uf760',
      '酸',
      'ཛ',
      '墳',
      '莴',
      '₂',
      '爝',
      '摢',
      'ͨ',
      '柢',
      '蘤',
      '᥍',
      '⋶',
      '磻',
      '枑',
      '눸',
      '댲',
      '牶',
      '\uf272',
      '䟬',
      '䔄',
      'ꥡ',
      '鿈',
      '㿜',
      '됓',
      'z',
      'ࠆ',
      '瑘',
      '闆',
      '첪',
      'ᣖ',
      '\ue2ae',
      'ᬆ',
      '\uf3f6',
      '偐',
      '죨',
      '\uf4ac',
      '쁌',
      '\uf41c',
      '餯',
      '깄',
      '弛',
      'ᄓ',
      '\u1738',
      '\ud9a8',
      '᧪',
      'ⴳ',
      '隘',
      '\u2fe9',
      '㈿',
      '췢',
      '浱',
      '\ue37d',
      '뚗',
      'ⱏ',
      '䍳',
      '鄂',
      'ݝ',
      '踥',
      'ᙲ',
      '\uec28',
      '櫋',
      '蛌',
      'ᡮ',
      '鐔',
      '홴',
      '톥'
   };

   public Checksum(SeekableSource var1, int var2) {
      ByteBuffer var3 = ByteBuffer.allocate(var2 * 2);
      int var4 = 0;

      while (true) {
         var1.read(var3);
         ((Buffer)var3).flip();
         if (var3.remaining() < var2) {
            return;
         }

         while (var3.remaining() >= var2) {
            long var5 = queryChecksum0(var3, var2);
            this.checksums.put(var5, var4++);
         }

         var3.compact();
      }
   }

   public static long queryChecksum(ByteBuffer var0, int var1) {
      ((Buffer)var0).mark();
      long var2 = queryChecksum0(var0, var1);
      ((Buffer)var0).reset();
      return var2;
   }

   private static long queryChecksum0(ByteBuffer var0, int var1) {
      char var2 = 0;
      char var3 = 0;

      for (int var4 = 0; var4 < var1; var4++) {
         var3 += single_hash[var0.get() + 128];
         var2 += var3;
      }

      return (var2 & '\uffff') << 16 | var3 & 65535;
   }

   public static long incrementChecksum(long var0, byte var2, byte var3, int var4) {
      char var5 = single_hash[var2 + 128];
      char var6 = single_hash[var3 + 128];
      int var7 = (int)(var0 & 65535L) - var5 + var6 & 65535;
      int var8 = (int)(var0 >> 16) - var5 * var4 + var7 & 65535;
      return var8 << 16 | var7 & 65535;
   }

   public static char[] getSingleHash() {
      return single_hash;
   }

   public int findChecksumIndex(long var1) {
      return !this.checksums.containsKey(var1) ? -1 : this.checksums.get(var1);
   }

   @Override
   public String toString() {
      return super.toString() + " checksums=" + this.checksums;
   }
}
