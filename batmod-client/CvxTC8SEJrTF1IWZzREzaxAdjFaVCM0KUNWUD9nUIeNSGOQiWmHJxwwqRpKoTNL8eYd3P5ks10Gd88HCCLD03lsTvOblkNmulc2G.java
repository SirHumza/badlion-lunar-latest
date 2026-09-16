import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class CvxTC8SEJrTF1IWZzREzaxAdjFaVCM0KUNWUD9nUIeNSGOQiWmHJxwwqRpKoTNL8eYd3P5ks10Gd88HCCLD03lsTvOblkNmulc2G {
   public static YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      InputStream var0
   ) {
      DataInputStream var1 = new DataInputStream(new BufferedInputStream(new GZIPInputStream(var0)));

      YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var2;
      try {
         var2 = Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            var1,
            pSMeU82G73wXOJETfbETA72PAoUf39JDhxz7IqD6ZuNr61azuHQek1mO1d7rWnjZIOhv5QWcSIfZYwSJAeZbES4Wq7bGcKJrmHre.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I
         );
      } finally {
         var1.close();
      }

      return var2;
   }

   public static void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var0, OutputStream var1
   ) {
      DataOutputStream var2 = new DataOutputStream(new BufferedOutputStream(new GZIPOutputStream(var1)));

      try {
         Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var0, var2);
      } finally {
         var2.close();
      }
   }

   public static void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var0, File var1
   ) {
      File var2 = new File(var1.getAbsolutePath() + "_tmp");
      if (var2.exists()) {
         var2.delete();
      }

      BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(var0, var2);
      if (var1.exists()) {
         var1.delete();
      }

      if (var1.exists()) {
         throw new IOException("Failed to delete " + var1);
      }

      var2.renameTo(var1);
   }

   public static void BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(
      YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var0, File var1
   ) {
      DataOutputStream var2 = new DataOutputStream(new FileOutputStream(var1));

      try {
         Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var0, var2);
      } finally {
         var2.close();
      }
   }

   public static YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      File var0
   ) {
      if (!var0.exists()) {
         return null;
      }

      DataInputStream var1 = new DataInputStream(new FileInputStream(var0));

      YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var2;
      try {
         var2 = Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            var1,
            pSMeU82G73wXOJETfbETA72PAoUf39JDhxz7IqD6ZuNr61azuHQek1mO1d7rWnjZIOhv5QWcSIfZYwSJAeZbES4Wq7bGcKJrmHre.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I
         );
      } finally {
         var1.close();
      }

      return var2;
   }

   public static YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      DataInputStream var0
   ) {
      return Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         var0,
         pSMeU82G73wXOJETfbETA72PAoUf39JDhxz7IqD6ZuNr61azuHQek1mO1d7rWnjZIOhv5QWcSIfZYwSJAeZbES4Wq7bGcKJrmHre.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I
      );
   }

   public static YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      DataInput var0, pSMeU82G73wXOJETfbETA72PAoUf39JDhxz7IqD6ZuNr61azuHQek1mO1d7rWnjZIOhv5QWcSIfZYwSJAeZbES4Wq7bGcKJrmHre var1
   ) {
      NwaFZAyszLLHph2168JrLGtSlAj0Dl82LoyvKABMfC0FK0TwhpnvEZjU1lha841nbEvUx6KWrEj2L78DKrRiK3XnWiWfVVSXCcju var2 = Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         var0, 0, var1
      );
      if (var2 instanceof YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm) {
         return (YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm)var2;
      } else {
         throw new IOException("Root tag must be a named compound tag");
      }
   }

   public static void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      YuzfeXjeTK1T00vprZ5Ne0pbh8PiCRpNIxWseM8J5H635vwMw61pRxBVyA583AeqHHKDCmFTPf52sWq6aX7W62BMh6dFjmyF3IUm var0, DataOutput var1
   ) {
      Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         (NwaFZAyszLLHph2168JrLGtSlAj0Dl82LoyvKABMfC0FK0TwhpnvEZjU1lha841nbEvUx6KWrEj2L78DKrRiK3XnWiWfVVSXCcju)var0, var1
      );
   }

   private static void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      NwaFZAyszLLHph2168JrLGtSlAj0Dl82LoyvKABMfC0FK0TwhpnvEZjU1lha841nbEvUx6KWrEj2L78DKrRiK3XnWiWfVVSXCcju var0, DataOutput var1
   ) {
      var1.writeByte(var0.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I());
      if (var0.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I() != 0) {
         var1.writeUTF("");
         var0.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var1);
      }
   }

   private static NwaFZAyszLLHph2168JrLGtSlAj0Dl82LoyvKABMfC0FK0TwhpnvEZjU1lha841nbEvUx6KWrEj2L78DKrRiK3XnWiWfVVSXCcju Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      DataInput var0, int var1, pSMeU82G73wXOJETfbETA72PAoUf39JDhxz7IqD6ZuNr61azuHQek1mO1d7rWnjZIOhv5QWcSIfZYwSJAeZbES4Wq7bGcKJrmHre var2
   ) {
      byte var3 = var0.readByte();
      if (var3 == 0) {
         return new GAh1eFSjStcwDRtgr9ETFUBIrwF7L2LhqhcsX8d8033hXmZSTenP3suqPd4vGuCqHziHfpy1nNsiPK28aniA9SHB6PBTitZ6SBls();
      }

      var0.readUTF();
      NwaFZAyszLLHph2168JrLGtSlAj0Dl82LoyvKABMfC0FK0TwhpnvEZjU1lha841nbEvUx6KWrEj2L78DKrRiK3XnWiWfVVSXCcju var4 = NwaFZAyszLLHph2168JrLGtSlAj0Dl82LoyvKABMfC0FK0TwhpnvEZjU1lha841nbEvUx6KWrEj2L78DKrRiK3XnWiWfVVSXCcju.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         var3
      );

      try {
         var4.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var0, var1, var2);
         return var4;
      } catch (IOException var8) {
         dYRU8kZZi9iCpYQ5cTFEJaOYxItWxAoHj02DIqn4ES0X0sIZCbd2emwajjqvW8TMMCUz6wNmhhl1AN75TGrnvdi963hCekgbLQrK var6 = dYRU8kZZi9iCpYQ5cTFEJaOYxItWxAoHj02DIqn4ES0X0sIZCbd2emwajjqvW8TMMCUz6wNmhhl1AN75TGrnvdi963hCekgbLQrK.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            var8, "Loading NBT data"
         );
         jbxQDpKgBIWhE7pHauqynFQUvqYDUW7OzHk8ctp7Peb6M6NLNn5fDAVGaQZ4c0p8H8lwFv3PPamtrehe3GqDwAfLrtdMNVCHOgsZ var7 = var6.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            "NBT Tag"
         );
         var7.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I("Tag name", "[UNNAMED TAG]");
         var7.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I("Tag type", var3);
         throw new Dc41HPIq0a1xWB4dC16xLjPSVijfmvpwZZouM5QYeWBIDiJ7WTMw2Brq92CF9bQXihBiepW7oz9feFpGQHEnHZYJW7ADgayaEHgg(var6);
      }
   }
}
