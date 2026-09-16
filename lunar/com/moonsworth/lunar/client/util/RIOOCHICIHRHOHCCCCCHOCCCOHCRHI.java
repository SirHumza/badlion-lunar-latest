package com.moonsworth.lunar.client.util;

import com.lunarclient.gameipc.browser.v1.OpenUrlRequest;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Locale;
import java.util.Set;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public final class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI {
   private static final Set<String> OHROICROIICOICIORIHRCICRIOCCOR = Set.of("http", "https");
   private static final String ROROCCRCORHICCICIRIHICIIHRIIOC = "lunarclient";

   public static boolean IRCIIHHICIHRCOCRROCOICRIHHCCHH(@Nullable URI var0) {
      if (var0 == null) {
         return false;
      }

      String var1 = var0.getScheme();
      if (var1 == null) {
         return false;
      }

      String var2 = var1.toLowerCase(Locale.ROOT);
      return OHROICROIICOICIORIHRCICRIOCCOR.contains(var2) || var2.equals("lunarclient");
   }

   public static boolean ORRORHRIRHOCCRIROCCIIRRHHOHOIC(@Nullable String var0) {
      if (var0 == null) {
         return false;
      }

      try {
         return IRCIIHHICIHRCOCRROCOICRIHHCCHH(new URI(var0));
      } catch (URISyntaxException var2) {
         return false;
      }
   }

   public static boolean CHCCHOIHRRRCCRRCCHIRIRCORRHIHR(@Nullable String var0) {
      if (var0 == null) {
         return false;
      }

      try {
         String var1 = new URI(var0).getScheme();
         return var1 != null && !OHROICROIICOICIORIHRCICRIOCCOR.contains(var1.toLowerCase(Locale.ROOT));
      } catch (URISyntaxException var2) {
         return false;
      }
   }

   public static URI ROCIHHOOOHCROIRIRCHRICCICOHRIR(String var0) {
      URI var1 = new URI(var0);
      String var2 = var1.getScheme();
      if (var2 == null) {
         throw new URISyntaxException(var0, "Missing protocol");
      } else {
         String var3 = var2.toLowerCase(Locale.ROOT);
         if (!OHROICROIICOICIORIHRCICRIOCCOR.contains(var3)) {
            throw new URISyntaxException(var0, "Unsupported protocol: " + var3);
         } else {
            return var1;
         }
      }
   }

   public static boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(URI var0, OpenUrlRequest.Initiator var1) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, false);
   }

   public static boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(URI var0, OpenUrlRequest.Initiator var1, boolean var2) {
      if (IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0.toString(), var1, var2)) {
         return true;
      } else if (!IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0)) {
         ICCCHIOICRORIHCOOCRIRRIORIIROO(var0.toString());
         return false;
      } else {
         return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0);
      }
   }

   public static boolean IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var0, OpenUrlRequest.Initiator var1) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, false);
   }

   public static boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var0, OpenUrlRequest.Initiator var1, boolean var2) {
      if (IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, var1, var2)) {
         return true;
      } else if (var2) {
         return false;
      } else if (!ORRORHRIRHOCCRIROCCIIRRHHOHOIC(var0)) {
         ICCCHIOICRORIHCOOCRIRRIORIIROO(var0);
         return false;
      } else {
         return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
            .IHHCCRIROCRCRROCCRIHCCHOOOOIRC(var0);
      }
   }

   public static boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(URL var0, OpenUrlRequest.Initiator var1) {
      return IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0.toString(), var1, false);
   }

   public static boolean CRHROHHHCIHHCOHCOORCRIHHIICROR(File var0) {
      return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
         .IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0);
   }

   private static void ICCCHIOICRORIHCOOCRIRRIORIIROO(String var0) {
      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
         "Browser", "Refusing to open a URL with an unsupported protocol: " + var0
      );
   }

   private static boolean IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var0, OpenUrlRequest.Initiator var1, boolean var2) {
      try {
         URL var3 = new URL(var0);
         String var4 = var3.getProtocol();
         if (!var4.equals("http") && !var4.equals("https") && !var4.equals("lunarclient")) {
            return false;
         }
      } catch (Exception var5) {
         return false;
      }

      if (!IICCOOCHCHROORHHIIHROHCCRHRCOR.HOOOHOORHRIOCRICIIOCHIRHOOCHCC().isEmpty()
         && IICCOOCHCHROORHHIIHROHCCRHRCOR.HOOOHOORHRIOCRICIIOCHIRHOOCHCC().get().ROORROCCCRCRCOHHOROROIRHCIROHR()
            != com.moonsworth.lunar.client.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.DISCONNECTED) {
         IICCOOCHCHROORHHIIHROHCCRHRCOR.HOOOHOORHRIOCRICIIOCHIRHOOCHCC()
            .get()
            .HRHOROIIOOIRIICOHIHCHCRCOHCIIO()
            .openUrl(
               null,
               OpenUrlRequest.newBuilder()
                  .setUrl(var0)
                  .setInitiator(var1)
                  .setOpenType(var2 ? OpenUrlRequest.OpenType.OPEN_TYPE_FORCE_EMBEDDED : OpenUrlRequest.OpenType.OPEN_TYPE_UNSPECIFIED)
                  .build(),
               var0x -> {}
            );
         return true;
      } else {
         return false;
      }
   }

   @Generated
   private RIOOCHICIHRHOHCCCCCHOCCCOHCRHI() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
