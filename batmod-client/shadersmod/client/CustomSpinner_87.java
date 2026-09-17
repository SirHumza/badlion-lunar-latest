package shadersmod.client;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ {
   private static final Pattern BatModClient = Pattern.compile(
      "^\\s*#version\\s+.*$"
   );
   private static final Pattern Button = Pattern.compile(
      "^\\s*#include\\s+\"([A-Za-z0-9_/\\.]+)\".*$"
   );
   private static final Set CustomSpinner = BatModClient();

   public static shadersmod.client.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa[] BatModClient(
      shadersmod.client.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN var0, String[] var1, List var2
   ) {
      if (var0 == null) {
         return new shadersmod.client.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa[0];
      }

      HashMap var3 = new HashMap();
      BatModClient(var0, "/shaders", var1, var3);

      for (int var5 : var2) {
         String var6 = "/shaders/world" + var5;
         BatModClient(var0, var6, var1, var3);
      }

      Collection var8 = var3.values();
      shadersmod.client.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa[] var9 = var8.toArray(
         new shadersmod.client.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa[var8.size()]
      );
      shadersmod.client.WkHLtxh0OBE988n6Z0s69VckSEH7sjJ2sJEkoBxEnB9TRCVCnrzX8qoWr1JeSS1QxNVIPsIB8QiJnFqynvUoIajlh0Sg8n21w13o var7 = new shadersmod.client.WkHLtxh0OBE988n6Z0s69VckSEH7sjJ2sJEkoBxEnB9TRCVCnrzX8qoWr1JeSS1QxNVIPsIB8QiJnFqynvUoIajlh0Sg8n21w13o();
      Arrays.sort(var9, var7);
      return var9;
   }

   private static void BatModClient(
      shadersmod.client.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN var0,
      String var1,
      String[] var2,
      Map var3
   ) {
      for (int var4 = 0; var4 < var2.length; var4++) {
         String var5 = var2[var4];
         if (!var5.equals("")) {
            String var6 = var1 + "/" + var5 + ".vsh";
            String var7 = var1 + "/" + var5 + ".fsh";
            BatModClient(var0, var6, var3);
            BatModClient(var0, var7, var3);
         }
      }
   }

   private static void BatModClient(
      shadersmod.client.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN var0, String var1, Map var2
   ) {
      String[] var3 = BatModClient(var0, var1);

      for (int var4 = 0; var4 < var3.length; var4++) {
         String var5 = var3[var4];
         shadersmod.client.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa var6 = BatModClient(
            var5, var1
         );
         if (var6 != null
            && !var6.BatModClient()
               .startsWith(
                  shadersmod.client.z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP.ButtonAction()
               )
            && (
               !var6.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA()
                  || BatModClient(var6, var3)
            )) {
            String var7 = var6.BatModClient();
            shadersmod.client.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa var8 = (shadersmod.client.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa)var2.get(
               var7
            );
            if (var8 != null) {
               if (!xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
                  (Object)var8.Spinner(),
                  (Object)var6.Spinner()
               )) {
                  xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Button(
                     "Ambiguous shader option: " + var6.BatModClient()
                  );
                  xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Button(
                     " - in "
                        + xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
                           var8.ColorChooser()
                        )
                        + ": "
                        + var8.Spinner()
                  );
                  xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Button(
                     " - in "
                        + xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
                           var6.ColorChooser()
                        )
                        + ": "
                        + var6.Spinner()
                  );
                  var8.BatModClient(false);
               }

               if (var8.Button() == null
                  || var8.Button().length() <= 0) {
                  var8.BatModClient(
                     var6.Button()
                  );
               }

               var8.BatModClient(
                  var6.ColorChooser()
               );
            } else {
               var2.put(var7, var6);
            }
         }
      }
   }

   private static boolean BatModClient(
      shadersmod.client.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa var0, String[] var1
   ) {
      for (int var2 = 0; var2 < var1.length; var2++) {
         String var3 = var1[var2];
         if (var0.ProgressBar(var3)) {
            return true;
         }
      }

      return false;
   }

   private static String[] BatModClient(
      shadersmod.client.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN var0, String var1
   ) {
      try {
         ArrayList var2 = new ArrayList();
         String var3 = BatModClient(var1, var0, 0, var2, 0);
         if (var3 == null) {
            return new String[0];
         }

         ByteArrayInputStream var4 = new ByteArrayInputStream(var3.getBytes());
         return xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
            var4
         );
      } catch (IOException var6) {
         xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
            var6.getClass().getName() + ": " + var6.getMessage()
         );
         return new String[0];
      }
   }

   private static shadersmod.client.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa BatModClient(
      String var0, String var1
   ) {
      shadersmod.client.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa var2 = null;
      if (var2 == null) {
         var2 = shadersmod.client.GpDFKWkpAtoLQB0W2XCV5bHrfhV8v60U9eVAz8acb1obB7yclvZIoJJBby5GbawXebsAfQocYajpCi0D7X4qgixSfAmUGJnoMIBj.BatModClient(
            var0, var1
         );
      }

      if (var2 == null) {
         var2 = shadersmod.client.f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb.BatModClient(
            var0, var1
         );
      }

      if (var2 != null) {
         return var2;
      }

      if (var2 == null) {
         var2 = shadersmod.client.OVft42XaDrpCid053XFq1EPZ8CkxDYortlwtRX4zTf4L5KT5wFCJrMIQs1I0or0K1OcKP82y3PpnybjZEMRPyyEezZIs1zuJDGFF.Button(
            var0, var1
         );
      }

      if (var2 == null) {
         var2 = shadersmod.client.fDoAJ9W9bXAT89550qV528PlQ3xBSnLnpyVbFpWqc5e8BN9pOqCYta3tS7TuKU1dJl7tt01b3fzVmBCmYvz5SizTFbmamdEnbpee.CustomSpinner(
            var0, var1
         );
      }

      return var2 != null
            && CustomSpinner.contains(
               var2.BatModClient()
            )
         ? var2
         : null;
   }

   private static Set BatModClient() {
      HashSet var0 = new HashSet();
      var0.add("shadowMapResolution");
      var0.add("shadowDistance");
      var0.add("shadowIntervalSize");
      var0.add("generateShadowMipmap");
      var0.add("generateShadowColorMipmap");
      var0.add("shadowHardwareFiltering");
      var0.add("shadowHardwareFiltering0");
      var0.add("shadowHardwareFiltering1");
      var0.add("shadowtex0Mipmap");
      var0.add("shadowtexMipmap");
      var0.add("shadowtex1Mipmap");
      var0.add("shadowcolor0Mipmap");
      var0.add("shadowColor0Mipmap");
      var0.add("shadowcolor1Mipmap");
      var0.add("shadowColor1Mipmap");
      var0.add("shadowtex0Nearest");
      var0.add("shadowtexNearest");
      var0.add("shadow0MinMagNearest");
      var0.add("shadowtex1Nearest");
      var0.add("shadow1MinMagNearest");
      var0.add("shadowcolor0Nearest");
      var0.add("shadowColor0Nearest");
      var0.add("shadowColor0MinMagNearest");
      var0.add("shadowcolor1Nearest");
      var0.add("shadowColor1Nearest");
      var0.add("shadowColor1MinMagNearest");
      var0.add("wetnessHalflife");
      var0.add("drynessHalflife");
      var0.add("eyeBrightnessHalflife");
      var0.add("centerDepthHalflife");
      var0.add("sunPathRotation");
      var0.add("ambientOcclusionLevel");
      var0.add("superSamplingLevel");
      var0.add("noiseTextureResolution");
      return var0;
   }

   public static shadersmod.client.vc1vcQvCMb57ohl4fnHncmfADNI2HiLhnbvKDKbyboq1tjQYZTJWWhxnvRflDZG2Ua8cyVLVIyIjEdfHKjYk6i05W15bM39R7XzP[] BatModClient(
      Properties var0, shadersmod.client.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa[] var1
   ) {
      String var2 = "profile.";
      ArrayList var3 = new ArrayList();

      for (Object var5 : var0.keySet()) {
         String var6 = (String)var5;
         if (var6.startsWith(var2)) {
            String var7 = var6.substring(var2.length());
            var0.getProperty(var6);
            HashSet var8 = new HashSet();
            shadersmod.client.vc1vcQvCMb57ohl4fnHncmfADNI2HiLhnbvKDKbyboq1tjQYZTJWWhxnvRflDZG2Ua8cyVLVIyIjEdfHKjYk6i05W15bM39R7XzP var9 = BatModClient(
               var7, var0, var8, var1
            );
            if (var9 != null) {
               var3.add(var9);
            }
         }
      }

      return var3.size() <= 0
         ? null
         : var3.toArray(new shadersmod.client.vc1vcQvCMb57ohl4fnHncmfADNI2HiLhnbvKDKbyboq1tjQYZTJWWhxnvRflDZG2Ua8cyVLVIyIjEdfHKjYk6i05W15bM39R7XzP[var3.size()]);
   }

   private static shadersmod.client.vc1vcQvCMb57ohl4fnHncmfADNI2HiLhnbvKDKbyboq1tjQYZTJWWhxnvRflDZG2Ua8cyVLVIyIjEdfHKjYk6i05W15bM39R7XzP BatModClient(
      String var0,
      Properties var1,
      Set var2,
      shadersmod.client.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa[] var3
   ) {
      String var4 = "profile.";
      String var5 = var4 + var0;
      if (var2.contains(var5)) {
         xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Button(
            "[Shaders] Profile already parsed: " + var0
         );
         return null;
      }

      var2.add(var0);
      shadersmod.client.vc1vcQvCMb57ohl4fnHncmfADNI2HiLhnbvKDKbyboq1tjQYZTJWWhxnvRflDZG2Ua8cyVLVIyIjEdfHKjYk6i05W15bM39R7XzP var6 = new shadersmod.client.vc1vcQvCMb57ohl4fnHncmfADNI2HiLhnbvKDKbyboq1tjQYZTJWWhxnvRflDZG2Ua8cyVLVIyIjEdfHKjYk6i05W15bM39R7XzP(
         var0
      );
      String var7 = var1.getProperty(var5);
      String[] var8 = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
         var7, " "
      );

      for (int var9 = 0; var9 < var8.length; var9++) {
         String var10 = var8[var9];
         if (var10.startsWith(var4)) {
            String var11 = var10.substring(var4.length());
            shadersmod.client.vc1vcQvCMb57ohl4fnHncmfADNI2HiLhnbvKDKbyboq1tjQYZTJWWhxnvRflDZG2Ua8cyVLVIyIjEdfHKjYk6i05W15bM39R7XzP var12 = BatModClient(
               var11, var1, var2, var3
            );
            if (var6 != null) {
               var6.BatModClient(var12);
               var6.BatModClient(
                  var12.CustomSpinner()
               );
            }
         } else {
            String[] var16 = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
               var10, ":="
            );
            if (var16.length == 1) {
               String var17 = var16[0];
               boolean var13 = true;
               if (var17.startsWith("!")) {
                  var13 = false;
                  var17 = var17.substring(1);
               }

               String var14 = "program.";
               if (!var13 && var17.startsWith("program.")) {
                  String var21 = var17.substring(var14.length());
                  if (!shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.ProgressBar(
                     var21
                  )) {
                     xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Button(
                        "Invalid program: "
                           + var21
                           + " in profile: "
                           + var6.BatModClient()
                     );
                  } else {
                     var6.Button(var21);
                  }
               } else {
                  shadersmod.client.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa var15 = shadersmod.client.GsonTypeAdapter.BatModClient(
                     var17, var3
                  );
                  if (!(var15 instanceof shadersmod.client.GpDFKWkpAtoLQB0W2XCV5bHrfhV8v60U9eVAz8acb1obB7yclvZIoJJBby5GbawXebsAfQocYajpCi0D7X4qgixSfAmUGJnoMIBj)
                     )
                   {
                     xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Button(
                        "[Shaders] Invalid option: " + var17
                     );
                  } else {
                     var6.BatModClient(var17, String.valueOf(var13));
                     var15.Button(true);
                  }
               }
            } else if (var16.length != 2) {
               xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Button(
                  "[Shaders] Invalid option value: " + var10
               );
            } else {
               String var18 = var16[0];
               String var19 = var16[1];
               shadersmod.client.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa var20 = shadersmod.client.GsonTypeAdapter.BatModClient(
                  var18, var3
               );
               if (var20 == null) {
                  xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Button(
                     "[Shaders] Invalid option: " + var10
                  );
               } else if (!var20.CustomSpinner(var19)) {
                  xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Button(
                     "[Shaders] Invalid value: " + var10
                  );
               } else {
                  var20.Button(true);
                  var6.BatModClient(var18, var19);
               }
            }
         }
      }

      return var6;
   }

   public static Map BatModClient(
      Properties var0,
      shadersmod.client.vc1vcQvCMb57ohl4fnHncmfADNI2HiLhnbvKDKbyboq1tjQYZTJWWhxnvRflDZG2Ua8cyVLVIyIjEdfHKjYk6i05W15bM39R7XzP[] var1,
      shadersmod.client.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa[] var2
   ) {
      HashMap var3 = new HashMap();
      BatModClient("screen", var0, var3, var1, var2);
      return var3.isEmpty() ? null : var3;
   }

   private static boolean BatModClient(
      String var0,
      Properties var1,
      Map var2,
      shadersmod.client.vc1vcQvCMb57ohl4fnHncmfADNI2HiLhnbvKDKbyboq1tjQYZTJWWhxnvRflDZG2Ua8cyVLVIyIjEdfHKjYk6i05W15bM39R7XzP[] var3,
      shadersmod.client.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa[] var4
   ) {
      String var5 = var1.getProperty(var0);
      if (var5 == null) {
         return false;
      }

      ArrayList var6 = new ArrayList();
      HashSet var7 = new HashSet();
      String[] var8 = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
         var5, " "
      );

      for (int var9 = 0; var9 < var8.length; var9++) {
         String var10 = var8[var9];
         if (var10.equals("<empty>")) {
            var6.add((shadersmod.client.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa)null);
         } else if (var7.contains(var10)) {
            xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Button(
               "[Shaders] Duplicate option: " + var10 + ", key: " + var0
            );
         } else {
            var7.add(var10);
            if (var10.equals("<profile>")) {
               if (var3 == null) {
                  xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Button(
                     "[Shaders] Option profile can not be used, no profiles defined: " + var10 + ", key: " + var0
                  );
               } else {
                  shadersmod.client.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4 var11 = new shadersmod.client.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4(
                     var3, var4
                  );
                  var6.add(var11);
               }
            } else if (var10.equals("*")) {
               shadersmod.client.K3xIIKuansJDsNpUbxdGFQOW7ziqP9U19c78A63CpbBZjLSHxNriRDpAObixCLzkOrF62HK8YpIH3YDfQC1PdPMNAtRybku3jLjL var14 = new shadersmod.client.K3xIIKuansJDsNpUbxdGFQOW7ziqP9U19c78A63CpbBZjLSHxNriRDpAObixCLzkOrF62HK8YpIH3YDfQC1PdPMNAtRybku3jLjL(
                  "<rest>"
               );
               var6.add(var14);
            } else if (var10.startsWith("[") && var10.endsWith("]")) {
               String var16 = XNrTHXLTQKSETGXGPxZtLk2A9OxtpcmTbu70hUEHJOFDX7N0ccHsrfTHryRVzj3np8mXgHso74TsSPlsRgajDOKDiLj72LE9f9H8.Button(
                  var10, "[", "]"
               );
               if (!var16.matches("^[a-zA-Z0-9_]+$")) {
                  xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Button(
                     "[Shaders] Invalid screen: " + var10 + ", key: " + var0
                  );
               } else if (!BatModClient(
                  "screen." + var16, var1, var2, var3, var4
               )) {
                  xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Button(
                     "[Shaders] Invalid screen: " + var10 + ", key: " + var0
                  );
               } else {
                  shadersmod.client.sv3zyZxD3xWlWeYYLSruuAtLQlLVOZKZqSxLVzG6LIkZdnBFYCEMpWDCJcCIGmpZLZXeGEhykSNrDIB7ylGQaaBiJWzGovTp1Wyr var12 = new shadersmod.client.sv3zyZxD3xWlWeYYLSruuAtLQlLVOZKZqSxLVzG6LIkZdnBFYCEMpWDCJcCIGmpZLZXeGEhykSNrDIB7ylGQaaBiJWzGovTp1Wyr(
                     var16
                  );
                  var6.add(var12);
               }
            } else {
               shadersmod.client.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa var15 = shadersmod.client.GsonTypeAdapter.BatModClient(
                  var10, var4
               );
               if (var15 == null) {
                  xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Button(
                     "[Shaders] Invalid option: " + var10 + ", key: " + var0
                  );
                  var6.add((shadersmod.client.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa)null);
               } else {
                  var15.Button(true);
                  var6.add(var15);
               }
            }
         }
      }

      shadersmod.client.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa[] var13 = var6.toArray(
         new shadersmod.client.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa[var6.size()]
      );
      var2.put(var0, var13);
      return true;
   }

   public static BufferedReader BatModClient(
      BufferedReader var0,
      String var1,
      shadersmod.client.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN var2,
      int var3,
      List var4,
      int var5
   ) {
      String var6 = "/";
      int var7 = var1.lastIndexOf("/");
      if (var7 >= 0) {
         var6 = var1.substring(0, var7);
      }

      CharArrayWriter var8 = new CharArrayWriter();
      int var9 = -1;
      LinkedHashSet var10 = new LinkedHashSet();
      int var11 = 1;

      while (true) {
         String var12 = var0.readLine();
         if (var12 == null) {
            char[] var20 = var8.toCharArray();
            if (var9 >= 0 && var10.size() > 0) {
               StringBuilder var23 = new StringBuilder();

               for (String var31 : var10) {
                  var23.append("#define ");
                  var23.append(var31);
                  var23.append("\n");
               }

               String var28 = var23.toString();
               StringBuilder var32 = new StringBuilder(new String(var20));
               var32.insert(var9, var28);
               String var33 = var32.toString();
               var20 = var33.toCharArray();
            }

            CharArrayReader var24 = new CharArrayReader(var20);
            return new BufferedReader(var24);
         }

         if (var9 < 0) {
            Matcher var13 = BatModClient.matcher(var12);
            if (var13.matches()) {
               String var14 = "#define MC_VERSION "
                  + xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.ProgressBar()
                  + "\n"
                  + "#define "
                  + "MC_GL_VERSION"
                  + " "
                  + xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.ColorChooser()
                     .ButtonAction()
                  + "\n"
                  + "#define "
                  + "MC_GLSL_VERSION"
                  + " "
                  + xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.IntegerSpinner()
                     .ButtonAction()
                  + "\n"
                  + "#define "
                  + shadersmod.client.z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP.BatModClient()
                  + "\n"
                  + "#define "
                  + shadersmod.client.z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP.Button()
                  + "\n"
                  + "#define "
                  + shadersmod.client.z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP.CustomSpinner()
                  + "\n";
               String var15 = var12 + "\n" + var14;
               String var16 = "#line " + (var11 + 1) + " " + var3;
               var12 = var15 + var16;
               var9 = var8.size() + var15.length();
            }
         }

         Matcher var19 = Button.matcher(var12);
         if (var19.matches()) {
            String var21 = var19.group(1);
            boolean var25 = var21.startsWith("/");
            String var29 = var25 ? "/shaders" + var21 : var6 + "/" + var21;
            if (!var4.contains(var29)) {
               var4.add(var29);
            }

            int var17 = var4.indexOf(var29) + 1;
            var12 = BatModClient(var29, var2, var17, var4, var5);
            if (var12 == null) {
               throw new IOException("Included file not found: " + var1);
            }

            if (var12.endsWith("\n")) {
               var12 = var12.substring(0, var12.length() - 1);
            }

            var12 = "#line 1 " + var17 + "\n" + var12 + "\n" + "#line " + (var11 + 1) + " " + var3;
         }

         if (var9 >= 0
            && var12.contains(
               shadersmod.client.z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP.ButtonAction()
            )) {
            String[] var22 = BatModClient(
               var12,
               shadersmod.client.z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP.Spinner()
            );

            for (int var26 = 0; var26 < var22.length; var26++) {
               String var30 = var22[var26];
               var10.add(var30);
            }
         }

         var8.write(var12);
         var8.write("\n");
         var11++;
      }
   }

   private static String[] BatModClient(String var0, String[] var1) {
      ArrayList var2 = new ArrayList();

      for (int var3 = 0; var3 < var1.length; var3++) {
         String var4 = var1[var3];
         if (var0.contains(var4)) {
            var2.add(var4);
         }
      }

      return var2.toArray(new String[var2.size()]);
   }

   private static String BatModClient(
      String var0,
      shadersmod.client.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN var1,
      int var2,
      List var3,
      int var4
   ) {
      if (var4 >= 10) {
         throw new IOException("#include depth exceeded: " + var4 + ", file: " + var0);
      }

      var4++;
      InputStream var5 = var1.BatModClient(var0);
      if (var5 == null) {
         return null;
      }

      InputStreamReader var6 = new InputStreamReader(var5, "ASCII");
      BufferedReader var7 = new BufferedReader(var6);
      var7 = BatModClient(var7, var0, var1, var2, var3, var4);
      CharArrayWriter var8 = new CharArrayWriter();

      while (true) {
         String var9 = var7.readLine();
         if (var9 == null) {
            return var8.toString();
         }

         var8.write(var9);
         var8.write("\n");
      }
   }
}
