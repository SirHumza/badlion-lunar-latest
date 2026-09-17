package shadersmod.client;

public class z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP {
   private static String Downloader = "MC_";
   public static final String BatModClient = "MC_VERSION";
   public static final String Button = "MC_GL_VERSION";
   public static final String CustomSpinner = "MC_GLSL_VERSION";
   public static final String ButtonAction = "MC_OS_WINDOWS";
   public static final String Spinner = "MC_OS_MAC";
   public static final String Checkbox = "MC_OS_LINUX";
   public static final String ProgressBar = "MC_OS_OTHER";
   public static final String BatModProgressBar = "MC_GL_VENDOR_ATI";
   public static final String ColorChooser = "MC_GL_VENDOR_INTEL";
   public static final String IntegerSpinner = "MC_GL_VENDOR_NVIDIA";
   public static final String TextField = "MC_GL_VENDOR_XORG";
   public static final String ColorTextPane = "MC_GL_VENDOR_OTHER";
   public static final String BatModInstallerMain = "MC_GL_RENDERER_RADEON";
   public static final String aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA = "MC_GL_RENDERER_GEFORCE";
   public static final String LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN = "MC_GL_RENDERER_QUADRO";
   public static final String G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr = "MC_GL_RENDERER_INTEL";
   public static final String iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF = "MC_GL_RENDERER_GALLIUM";
   public static final String bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ = "MC_GL_RENDERER_MESA";
   public static final String RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB = "MC_GL_RENDERER_OTHER";
   private static String[] InstallationLogger;

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static String BatModClient() {
      e0Yg3AMN2CP0omNHHhoSSC8pezsnCicOv5xl7j15VgUpCed9VIED8PK9UGxRaRkDHvWwHnsKLQ66vPDl7Q0xVpLTBXCCkVUWKkAG var0 = uLbWaHoMNVfJWYaIXcAgF7c5PZFBGWXJ31hS7tuu5lkYxoszlvaIsZL1PiM0drXyHOnWCCT4Nfexg4LZWipIv4epRhMtHlXTb5Zy.ProgressBar();
      switch (shadersmod.client.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8.BatModClient[var0.ordinal()]) {
         case 1:
            return "MC_OS_WINDOWS";
         case 2:
            return "MC_OS_MAC";
         case 3:
            return "MC_OS_LINUX";
         default:
            return "MC_OS_OTHER";
      }
   }

   public static String Button() {
      String var0 = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModProgressBar;
      if (var0 == null) {
         return "MC_GL_VENDOR_OTHER";
      }

      var0 = var0.toLowerCase();
      return var0.startsWith("ati")
         ? "MC_GL_VENDOR_ATI"
         : (
            var0.startsWith("intel")
               ? "MC_GL_VENDOR_INTEL"
               : (var0.startsWith("nvidia") ? "MC_GL_VENDOR_NVIDIA" : (var0.startsWith("x.org") ? "MC_GL_VENDOR_XORG" : "MC_GL_VENDOR_OTHER"))
         );
   }

   public static String CustomSpinner() {
      String var0 = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.ProgressBar;
      if (var0 == null) {
         return "MC_GL_RENDERER_OTHER";
      }

      var0 = var0.toLowerCase();
      return var0.startsWith("amd")
         ? "MC_GL_RENDERER_RADEON"
         : (
            var0.startsWith("ati")
               ? "MC_GL_RENDERER_RADEON"
               : (
                  var0.startsWith("radeon")
                     ? "MC_GL_RENDERER_RADEON"
                     : (
                        var0.startsWith("gallium")
                           ? "MC_GL_RENDERER_GALLIUM"
                           : (
                              var0.startsWith("intel")
                                 ? "MC_GL_RENDERER_INTEL"
                                 : (
                                    var0.startsWith("geforce")
                                       ? "MC_GL_RENDERER_GEFORCE"
                                       : (
                                          var0.startsWith("nvidia")
                                             ? "MC_GL_RENDERER_GEFORCE"
                                             : (
                                                var0.startsWith("quadro")
                                                   ? "MC_GL_RENDERER_QUADRO"
                                                   : (
                                                      var0.startsWith("nvs")
                                                         ? "MC_GL_RENDERER_QUADRO"
                                                         : (var0.startsWith("mesa") ? "MC_GL_RENDERER_MESA" : "MC_GL_RENDERER_OTHER")
                                                   )
                                             )
                                       )
                                 )
                           )
                     )
               )
         );
   }

   public static String ButtonAction() {
      return Downloader;
   }

   public static String[] Spinner() {
      if (InstallationLogger == null) {
         String[] var0 = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.TextField();
         String[] var1 = new String[var0.length];

         for (int var2 = 0; var2 < var0.length; var2++) {
            var1[var2] = Downloader + var0[var2];
         }

         InstallationLogger = var1;
      }

      return InstallationLogger;
   }
}
