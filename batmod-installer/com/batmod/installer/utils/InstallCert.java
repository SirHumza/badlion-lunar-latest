package com.batmod.installer.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.Proxy.Type;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

public class InstallCert {
   private static final char[] Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I = "0123456789abcdef"
      .toCharArray();

   public static void main(String[] var0) {
      String var1 = null;
      short var2 = -1;
      char[] var3 = null;
      boolean var4 = false;
      String var5 = null;
      int var6 = -1;
      SocketAddress var7 = null;
      Socket var8 = null;
      int var9 = 0;
      int var10 = var0.length;
      boolean var11 = false;
      boolean var12 = false;

      while (var9 < var10) {
         String var13 = var0[var9++];
         if (var13.startsWith("--proxy=")) {
            String var14 = var13.substring("--proxy=".length());
            var4 = true;
            String[] var15 = var14.split(":");
            var5 = var15[0];
            var6 = Integer.parseInt(var15[1]);
         } else if (var13.startsWith("--quiet")) {
            var12 = true;
         } else if (var1 == null) {
            String[] var34 = var13.split(":");
            var1 = var34[0];
            var2 = (short)(var34.length == 1 ? 443 : Integer.parseInt(var34[1]));
         } else if (var3 == null) {
            var3 = var13.toCharArray();
         } else {
            var11 = true;
         }
      }

      if (var1 == null) {
         var11 = true;
      }

      if (var11) {
         System.out.println("Usage: java InstallCert [--proxy=proxyHost:proxyPort] host[:port] [passphrase] [--quiet]");
      } else {
         if (var2 == -1) {
            var2 = 443;
         }

         if (var3 == null) {
            var3 = "changeit".toCharArray();
         }

         File var33 = new File("jssecacerts");
         if (!var33.isFile()) {
            char var35 = File.separatorChar;
            File var37 = new File(System.getProperty("java.home") + var35 + "lib" + var35 + "security");
            var33 = new File(var37, "jssecacerts");
            if (!var33.isFile()) {
               var33 = new File(var37, "cacerts");
            }
         }

         System.out.println("Loading KeyStore " + var33 + "...");
         FileInputStream var36 = new FileInputStream(var33);
         KeyStore var38 = KeyStore.getInstance(KeyStore.getDefaultType());
         var38.load(var36, var3);
         var36.close();
         if (var4) {
            var7 = new InetSocketAddress(var5, var6);
            var8 = new Socket(new Proxy(Type.HTTP, var7));
         }

         SSLContext var16 = SSLContext.getInstance("TLS");
         TrustManagerFactory var17 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
         var17.init(var38);
         X509TrustManager var18 = (X509TrustManager)var17.getTrustManagers()[0];
         com.batmod.installer.utils.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW var19 = new com.batmod.installer.utils.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(
            var18
         );
         var16.init(null, new TrustManager[]{var19}, null);
         SSLSocketFactory var20 = var16.getSocketFactory();
         System.out.println("Opening connection to " + var1 + ":" + var2 + (var4 ? " via proxy " + var5 + ":" + var6 : "") + " ...");
         SSLSocket var21;
         if (var4) {
            var8.connect(new InetSocketAddress(var1, var2));
            var21 = (SSLSocket)var20.createSocket(var8, var1, var2, true);
         } else {
            var21 = (SSLSocket)var20.createSocket(var1, var2);
         }

         var21.setSoTimeout(10000);

         try {
            System.out.println("Starting SSL handshake...");
            var21.startHandshake();
            var21.close();
            System.out.println();
            System.out.println("No errors, certificate is already trusted");
         } catch (SSLException var31) {
            System.out.println();
            var31.printStackTrace(System.out);
         }

         X509Certificate[] var22 = com.batmod.installer.utils.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            var19
         );
         if (var22 == null) {
            System.out.println("Could not obtain server certificate chain");
         } else {
            BufferedReader var23 = new BufferedReader(new InputStreamReader(System.in));
            System.out.println();
            System.out.println("Server sent " + var22.length + " certificate(s):");
            System.out.println();
            MessageDigest var24 = MessageDigest.getInstance("SHA1");
            MessageDigest var25 = MessageDigest.getInstance("MD5");

            for (int var26 = 0; var26 < var22.length; var26++) {
               X509Certificate var27 = var22[var26];
               System.out.println(" " + (var26 + 1) + " Subject " + var27.getSubjectDN());
               System.out.println("   Issuer  " + var27.getIssuerDN());
               var24.update(var27.getEncoded());
               System.out
                  .println("   sha1    " + Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var24.digest()));
               var25.update(var27.getEncoded());
               System.out
                  .println("   md5     " + Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var25.digest()));
               System.out.println();
            }

            byte var39;
            if (var12) {
               System.out.println("Adding first certificate to trusted keystore");
               var39 = 0;
            } else {
               System.out.println("Enter certificate to add to trusted keystore or 'q' to quit: [1]");
               String var40 = var23.readLine().trim();

               try {
                  var39 = (byte)(var40.length() == 0 ? 0 : Integer.parseInt(var40) - 1);
               } catch (NumberFormatException var30) {
                  System.out.println("KeyStore not changed");
                  return;
               }
            }

            X509Certificate var41 = var22[var39];
            String var28 = var1 + "-" + (var39 + 1);
            var38.setCertificateEntry(var28, var41);
            FileOutputStream var29 = new FileOutputStream("jssecacerts");
            var38.store(var29, var3);
            var29.close();
            System.out.println();
            System.out.println(var41);
            System.out.println();
            System.out.println("Added certificate to keystore 'jssecacerts' using alias '" + var28 + "'");
         }
      }
   }

   private static String Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(byte[] var0) {
      StringBuilder var1 = new StringBuilder(var0.length * 3);

      for (int var5 : var0) {
         var5 &= 255;
         var1.append(Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I[var5 >> 4]);
         var1.append(Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I[var5 & 15]);
         var1.append(' ');
      }

      return var1.toString();
   }
}
