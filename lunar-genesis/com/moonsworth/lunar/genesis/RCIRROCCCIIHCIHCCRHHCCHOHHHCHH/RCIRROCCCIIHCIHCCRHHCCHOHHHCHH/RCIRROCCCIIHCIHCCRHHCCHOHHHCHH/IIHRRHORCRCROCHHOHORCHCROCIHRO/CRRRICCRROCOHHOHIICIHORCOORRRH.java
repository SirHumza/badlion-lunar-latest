package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IIHRRHORCRCROCHHOHORCHCROCIHRO;

import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRIHOIRCHIRRCRIOORCOICORHHORHH;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IOIICIRIICICIIOORHCIIIIRRIHRHI;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.HICHRCOHCCRHOHCICOOCHOIHCCHIRI;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OHHRIOHROOIHOROCIRHCHORIHRRRRI;
import java.math.BigInteger;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
public final class CRRRICCRROCOHHOHIICIHORCOORRRH {
   private static final int HCHCCOICOCCCOHRIOICCIRORHHHCOH = 4;
   private static final int OORCORICCIRIRIORCHCRROIORIOOHR = 8;
   private static final RCIROOOOICRHCCRRCIORHHIRCOIIIC HCRRCIHIRCRICHOIHCOIRCIIOIROIR = RCIROOOOICRHCCRRCIORHHIRCOIIIC.IRRCCOICORICIHCHRHIHIHROIRHOCR('.')
      .ROICOCHCIHIRICHOOCHHCRHCHOORIR(4);
   private static final RCIROOOOICRHCCRRCIORHHIRCOIIIC COCHHOOHROHORIHRIHRIHIOHRHOOHO = RCIROOOOICRHCCRRCIORHHIRCOIIIC.IRRCCOICORICIHCHRHIHIHROIRHOCR(':')
      .ROICOCHCIHIRICHOOCHHCRHCHOORIR(10);
   private static final Inet4Address HOHOCHCOIHHCIRCOCIICIHROCIIOHH = (Inet4Address)forString("127.0.0.1");
   private static final Inet4Address OOCCOCCCCCCHCIIHHHIHORHIORCOCH = (Inet4Address)forString("0.0.0.0");

   private CRRRICCRROCOHHOHIICIHORCOORRRH() {
   }

   private static Inet4Address getInet4Address(byte[] var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var0.length == 4, "Byte array has invalid length for an IPv4 address: %s != 4.", var0.length);
      return (Inet4Address)bytesToInetAddress(var0);
   }

   public static InetAddress forString(String var0) {
      byte[] var1 = ipStringToBytes(var0);
      if (var1 == null) {
         throw formatIllegalArgumentException("'%s' is not an IP string literal.", var0);
      } else {
         return bytesToInetAddress(var1);
      }
   }

   public static boolean isInetAddress(String var0) {
      return ipStringToBytes(var0) != null;
   }

   private static byte @Nullable [] ipStringToBytes(String var0) {
      boolean var1 = false;
      boolean var2 = false;
      int var3 = -1;

      for (int var4 = 0; var4 < var0.length(); var4++) {
         char var5 = var0.charAt(var4);
         if (var5 == '.') {
            var2 = true;
         } else if (var5 == ':') {
            if (var2) {
               return null;
            }

            var1 = true;
         } else {
            if (var5 == '%') {
               var3 = var4;
               break;
            }

            if (Character.digit(var5, 16) == -1) {
               return null;
            }
         }
      }

      if (var1) {
         if (var2) {
            var0 = convertDottedQuadToHex(var0);
            if (var0 == null) {
               return null;
            }
         }

         if (var3 != -1) {
            var0 = var0.substring(0, var3);
         }

         return textToNumericFormatV6(var0);
      } else {
         return var2 ? textToNumericFormatV4(var0) : null;
      }
   }

   private static byte @Nullable [] textToNumericFormatV4(String var0) {
      byte[] var1 = new byte[4];
      int var2 = 0;

      try {
         for (String var4 : HCRRCIHIRCRICHOIHCOIRCIIOIROIR.split(var0)) {
            var1[var2++] = parseOctet(var4);
         }
      } catch (NumberFormatException var5) {
         return null;
      }

      return var2 == 4 ? var1 : null;
   }

   private static byte @Nullable [] textToNumericFormatV6(String var0) {
      List var1 = COCHHOOHROHORIHRIHRIHIOHRHOOHO.splitToList(var0);
      if (var1.size() >= 3 && var1.size() <= 9) {
         int var2 = -1;

         for (int var3 = 1; var3 < var1.size() - 1; var3++) {
            if (((String)var1.get(var3)).length() == 0) {
               if (var2 >= 0) {
                  return null;
               }

               var2 = var3;
            }
         }

         int var4;
         int var9;
         if (var2 >= 0) {
            var9 = var2;
            var4 = var1.size() - var2 - 1;
            if (((String)var1.get(0)).length() == 0) {
               if (--var9 != 0) {
                  return null;
               }
            }

            if (IRIHOIRCHIRRCRIOORCOICORHHORHH.getLast(var1).length() == 0) {
               if (--var4 != 0) {
                  return null;
               }
            }
         } else {
            var9 = var1.size();
            var4 = 0;
         }

         int var5 = 8 - (var9 + var4);
         if (var2 >= 0 ? var5 >= 1 : var5 == 0) {
            ByteBuffer var6 = ByteBuffer.allocate(16);

            try {
               for (int var7 = 0; var7 < var9; var7++) {
                  var6.putShort(parseHextet((String)var1.get(var7)));
               }

               for (int var10 = 0; var10 < var5; var10++) {
                  var6.putShort((short)0);
               }

               for (int var11 = var4; var11 > 0; var11--) {
                  var6.putShort(parseHextet((String)var1.get(var1.size() - var11)));
               }
            } catch (NumberFormatException var8) {
               return null;
            }

            return var6.array();
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private static @Nullable String convertDottedQuadToHex(String var0) {
      int var1 = var0.lastIndexOf(58);
      String var2 = var0.substring(0, var1 + 1);
      String var3 = var0.substring(var1 + 1);
      byte[] var4 = textToNumericFormatV4(var3);
      if (var4 == null) {
         return null;
      }

      String var5 = Integer.toHexString((var4[0] & 255) << 8 | var4[1] & 255);
      String var6 = Integer.toHexString((var4[2] & 255) << 8 | var4[3] & 255);
      return var2 + var5 + ":" + var6;
   }

   private static byte parseOctet(String var0) {
      int var1 = Integer.parseInt(var0);
      if (var1 <= 255 && (!var0.startsWith("0") || var0.length() <= 1)) {
         return (byte)var1;
      } else {
         throw new NumberFormatException();
      }
   }

   private static short parseHextet(String var0) {
      int var1 = Integer.parseInt(var0, 16);
      if (var1 > 65535) {
         throw new NumberFormatException();
      } else {
         return (short)var1;
      }
   }

   private static InetAddress bytesToInetAddress(byte[] var0) {
      try {
         return InetAddress.getByAddress(var0);
      } catch (UnknownHostException var2) {
         throw new AssertionError(var2);
      }
   }

   public static String toAddrString(InetAddress var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      if (var0 instanceof Inet4Address) {
         return var0.getHostAddress();
      }

      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var0 instanceof Inet6Address);
      byte[] var1 = var0.getAddress();
      int[] var2 = new int[8];

      for (int var3 = 0; var3 < var2.length; var3++) {
         var2[var3] = HICHRCOHCCRHOHCICOOCHOIHCCHIRI.fromBytes((byte)0, (byte)0, var1[2 * var3], var1[2 * var3 + 1]);
      }

      compressLongestRunOfZeroes(var2);
      return hextetsToIPv6String(var2);
   }

   private static void compressLongestRunOfZeroes(int[] var0) {
      int var1 = -1;
      int var2 = -1;
      int var3 = -1;

      for (int var4 = 0; var4 < var0.length + 1; var4++) {
         if (var4 < var0.length && var0[var4] == 0) {
            if (var3 < 0) {
               var3 = var4;
            }
         } else if (var3 >= 0) {
            int var5 = var4 - var3;
            if (var5 > var2) {
               var1 = var3;
               var2 = var5;
            }

            var3 = -1;
         }
      }

      if (var2 >= 2) {
         Arrays.fill(var0, var1, var1 + var2, -1);
      }
   }

   private static String hextetsToIPv6String(int[] var0) {
      StringBuilder var1 = new StringBuilder(39);
      boolean var2 = false;

      for (int var3 = 0; var3 < var0.length; var3++) {
         boolean var4 = var0[var3] >= 0;
         if (var4) {
            if (var2) {
               var1.append(':');
            }

            var1.append(Integer.toHexString(var0[var3]));
         } else if (var3 == 0 || var2) {
            var1.append("::");
         }

         var2 = var4;
      }

      return var1.toString();
   }

   public static String toUriString(InetAddress var0) {
      return var0 instanceof Inet6Address ? "[" + toAddrString(var0) + "]" : toAddrString(var0);
   }

   public static InetAddress forUriString(String var0) {
      InetAddress var1 = forUriStringNoThrow(var0);
      if (var1 == null) {
         throw formatIllegalArgumentException("Not a valid URI IP literal: '%s'", var0);
      } else {
         return var1;
      }
   }

   private static @Nullable InetAddress forUriStringNoThrow(String var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      String var1;
      byte var2;
      if (var0.startsWith("[") && var0.endsWith("]")) {
         var1 = var0.substring(1, var0.length() - 1);
         var2 = 16;
      } else {
         var1 = var0;
         var2 = 4;
      }

      byte[] var3 = ipStringToBytes(var1);
      return var3 != null && var3.length == var2 ? bytesToInetAddress(var3) : null;
   }

   public static boolean isUriInetAddress(String var0) {
      return forUriStringNoThrow(var0) != null;
   }

   public static boolean isCompatIPv4Address(Inet6Address var0) {
      if (!var0.isIPv4CompatibleAddress()) {
         return false;
      }

      byte[] var1 = var0.getAddress();
      return var1[12] != 0 || var1[13] != 0 || var1[14] != 0 || var1[15] != 0 && var1[15] != 1;
   }

   public static Inet4Address getCompatIPv4Address(Inet6Address var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(isCompatIPv4Address(var0), "Address '%s' is not IPv4-compatible.", toAddrString(var0));
      return getInet4Address(Arrays.copyOfRange(var0.getAddress(), 12, 16));
   }

   public static boolean is6to4Address(Inet6Address var0) {
      byte[] var1 = var0.getAddress();
      return var1[0] == 32 && var1[1] == 2;
   }

   public static Inet4Address get6to4IPv4Address(Inet6Address var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(is6to4Address(var0), "Address '%s' is not a 6to4 address.", toAddrString(var0));
      return getInet4Address(Arrays.copyOfRange(var0.getAddress(), 2, 6));
   }

   public static boolean isTeredoAddress(Inet6Address var0) {
      byte[] var1 = var0.getAddress();
      return var1[0] == 32 && var1[1] == 1 && var1[2] == 0 && var1[3] == 0;
   }

   public static CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Inet6Address var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(isTeredoAddress(var0), "Address '%s' is not a Teredo address.", toAddrString(var0));
      byte[] var1 = var0.getAddress();
      Inet4Address var2 = getInet4Address(Arrays.copyOfRange(var1, 4, 8));
      int var3 = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OHHRIOHROOIHOROCIRHCHORIHRRRRI(
               var1, 8
            )
            .readShort()
         & '\uffff';
      int var4 = ~com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OHHRIOHROOIHOROCIRHCHORIHRRRRI(
               var1, 10
            )
            .readShort()
         & 65535;
      byte[] var5 = Arrays.copyOfRange(var1, 12, 16);

      for (int var6 = 0; var6 < var5.length; var6++) {
         var5[var6] = (byte)(~var5[var6]);
      }

      Inet4Address var7 = getInet4Address(var5);
      return new CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var7, var4, var3);
   }

   public static boolean isIsatapAddress(Inet6Address var0) {
      if (isTeredoAddress(var0)) {
         return false;
      }

      byte[] var1 = var0.getAddress();
      return (var1[8] | 3) != 3 ? false : var1[9] == 0 && var1[10] == 94 && var1[11] == -2;
   }

   public static Inet4Address getIsatapIPv4Address(Inet6Address var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(isIsatapAddress(var0), "Address '%s' is not an ISATAP address.", toAddrString(var0));
      return getInet4Address(Arrays.copyOfRange(var0.getAddress(), 12, 16));
   }

   public static boolean hasEmbeddedIPv4ClientAddress(Inet6Address var0) {
      return isCompatIPv4Address(var0) || is6to4Address(var0) || isTeredoAddress(var0);
   }

   public static Inet4Address getEmbeddedIPv4ClientAddress(Inet6Address var0) {
      if (isCompatIPv4Address(var0)) {
         return getCompatIPv4Address(var0);
      } else if (is6to4Address(var0)) {
         return get6to4IPv4Address(var0);
      } else if (isTeredoAddress(var0)) {
         return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0).getClient();
      } else {
         throw formatIllegalArgumentException("'%s' has no embedded IPv4 address.", toAddrString(var0));
      }
   }

   public static boolean isMappedIPv4Address(String var0) {
      byte[] var1 = ipStringToBytes(var0);
      if (var1 != null && var1.length == 16) {
         for (int var2 = 0; var2 < 10; var2++) {
            if (var1[var2] != 0) {
               return false;
            }
         }

         for (int var3 = 10; var3 < 12; var3++) {
            if (var1[var3] != -1) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public static Inet4Address getCoercedIPv4Address(InetAddress var0) {
      if (var0 instanceof Inet4Address) {
         return (Inet4Address)var0;
      }

      byte[] var1 = var0.getAddress();
      boolean var2 = true;

      for (int var3 = 0; var3 < 15; var3++) {
         if (var1[var3] != 0) {
            var2 = false;
            break;
         }
      }

      if (var2 && var1[15] == 1) {
         return HOHOCHCOIHHCIRCOCIICIHROCIIOHH;
      }

      if (var2 && var1[15] == 0) {
         return OOCCOCCCCCCHCIIHHHIHORHIORCOCH;
      }

      Inet6Address var7 = (Inet6Address)var0;
      long var4 = 0L;
      if (hasEmbeddedIPv4ClientAddress(var7)) {
         var4 = getEmbeddedIPv4ClientAddress(var7).hashCode();
      } else {
         var4 = ByteBuffer.wrap(var7.getAddress(), 0, 8).getLong();
      }

      int var6 = OHHRIOHROOIHOROCIRHCHORIHRRRRI.CORCHRCHRIHOHIIIOICOCOOOROROCC().ROIOROHRIHRRHIHRRRIHHHIICCHIOI(var4).asInt();
      var6 |= -536870912;
      if (var6 == -1) {
         var6 = -2;
      }

      return getInet4Address(HICHRCOHCCRHOHCICOOCHOIHCCHIRI.toByteArray(var6));
   }

   public static int coerceToInteger(InetAddress var0) {
      return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IIOIROIHIHHCCRICRCOOCHIICHRCOI(
            getCoercedIPv4Address(var0).getAddress()
         )
         .readInt();
   }

   public static BigInteger toBigInteger(InetAddress var0) {
      return new BigInteger(1, var0.getAddress());
   }

   public static Inet4Address fromInteger(int var0) {
      return getInet4Address(HICHRCOHCCRHOHCICOOCHOIHCCHIRI.toByteArray(var0));
   }

   public static Inet4Address fromIPv4BigInteger(BigInteger var0) {
      return (Inet4Address)fromBigInteger(var0, false);
   }

   public static Inet6Address fromIPv6BigInteger(BigInteger var0) {
      return (Inet6Address)fromBigInteger(var0, true);
   }

   private static InetAddress fromBigInteger(BigInteger var0, boolean var1) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var0.signum() >= 0, "BigInteger must be greater than or equal to 0");
      int var2 = var1 ? 16 : 4;
      byte[] var3 = var0.toByteArray();
      byte[] var4 = new byte[var2];
      int var5 = Math.max(0, var3.length - var2);
      int var6 = var3.length - var5;
      int var7 = var2 - var6;

      for (int var8 = 0; var8 < var5; var8++) {
         if (var3[var8] != 0) {
            throw formatIllegalArgumentException("BigInteger cannot be converted to InetAddress because it has more than %d bytes: %s", var2, var0);
         }
      }

      System.arraycopy(var3, var5, var4, var7, var6);

      try {
         return InetAddress.getByAddress(var4);
      } catch (UnknownHostException var9) {
         throw new AssertionError(var9);
      }
   }

   public static InetAddress fromLittleEndianByteArray(byte[] var0) {
      byte[] var1 = new byte[var0.length];

      for (int var2 = 0; var2 < var0.length; var2++) {
         var1[var2] = var0[var0.length - var2 - 1];
      }

      return InetAddress.getByAddress(var1);
   }

   public static InetAddress decrement(InetAddress var0) {
      byte[] var1 = var0.getAddress();

      int var2;
      for (var2 = var1.length - 1; var2 >= 0 && var1[var2] == 0; var2--) {
         var1[var2] = -1;
      }

      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var2 >= 0, "Decrementing %s would wrap.", var0);
      var1[var2]--;
      return bytesToInetAddress(var1);
   }

   public static InetAddress increment(InetAddress var0) {
      byte[] var1 = var0.getAddress();

      int var2;
      for (var2 = var1.length - 1; var2 >= 0 && var1[var2] == -1; var2--) {
         var1[var2] = 0;
      }

      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var2 >= 0, "Incrementing %s would wrap.", var0);
      var1[var2]++;
      return bytesToInetAddress(var1);
   }

   public static boolean isMaximum(InetAddress var0) {
      byte[] var1 = var0.getAddress();

      for (int var2 = 0; var2 < var1.length; var2++) {
         if (var1[var2] != -1) {
            return false;
         }
      }

      return true;
   }

   private static IllegalArgumentException formatIllegalArgumentException(String var0, Object... var1) {
      return new IllegalArgumentException(String.format(Locale.ROOT, var0, var1));
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      private final Inet4Address CHCRIHRIORCRCRORIIRCOCCHOORORI;
      private final Inet4Address IOOOOHHORCIRHHCIROCHHOOCROHICH;
      private final int CCIICCROCHRCROIHHORHORORRICRHR;
      private final int IOCRIRIHIRCRRHHRICROHCOIROIRIO;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(@Nullable Inet4Address var1, @Nullable Inet4Address var2, int var3, int var4) {
         IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var3 >= 0 && var3 <= 65535, "port '%s' is out of range (0 <= port <= 0xffff)", var3);
         IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var4 >= 0 && var4 <= 65535, "flags '%s' is out of range (0 <= flags <= 0xffff)", var4);
         this.CHCRIHRIORCRCRORIIRCOCCHOORORI = IOIICIRIICICIIOORHCIIIIRRIHRHI.firstNonNull(var1, CRRRICCRROCOHHOHIICIHORCOORRRH.OOCCOCCCCCCHCIIHHHIHORHIORCOCH);
         this.IOOOOHHORCIRHHCIROCHHOOCROHICH = IOIICIRIICICIIOORHCIIIIRRIHRHI.firstNonNull(var2, CRRRICCRROCOHHOHIICIHORCOORRRH.OOCCOCCCCCCHCIIHHHIHORHIORCOCH);
         this.CCIICCROCHRCROIHHORHORORRICRHR = var3;
         this.IOCRIRIHIRCRRHHRICROHCOIROIRIO = var4;
      }

      public Inet4Address getServer() {
         return this.CHCRIHRIORCRCRORIIRCOCCHOORORI;
      }

      public Inet4Address getClient() {
         return this.IOOOOHHORCIRHHCIROCHHOOCROHICH;
      }

      public int getPort() {
         return this.CCIICCROCHRCROIHHORHORORRICRHR;
      }

      public int getFlags() {
         return this.IOCRIRIHIRCRRHHRICROHCOIROIRIO;
      }
   }
}
