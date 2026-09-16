package net.minecraft.client.main;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.authlib.properties.PropertyMap.Serializer;
import java.io.File;
import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.util.List;
import joptsimple.ArgumentAcceptingOptionSpec;
import joptsimple.NonOptionArgumentSpec;
import joptsimple.OptionParser;
import joptsimple.OptionSet;

public class Main {
   public static void main(String[] var0) {
      System.setProperty("java.net.preferIPv4Stack", "true");
      OptionParser var1 = new OptionParser();
      var1.allowsUnrecognizedOptions();
      var1.accepts("demo");
      var1.accepts("fullscreen");
      var1.accepts("checkGlErrors");
      ArgumentAcceptingOptionSpec var2 = var1.accepts("bmDebug").withRequiredArg();
      ArgumentAcceptingOptionSpec var3 = var1.accepts("server").withRequiredArg();
      ArgumentAcceptingOptionSpec var4 = var1.accepts("port").withRequiredArg().ofType(Integer.class).defaultsTo(25565, new Integer[0]);
      ArgumentAcceptingOptionSpec var5 = var1.accepts("gameDir").withRequiredArg().ofType(File.class).defaultsTo(new File("."), new File[0]);
      ArgumentAcceptingOptionSpec var6 = var1.accepts("assetsDir").withRequiredArg().ofType(File.class);
      ArgumentAcceptingOptionSpec var7 = var1.accepts("resourcePackDir").withRequiredArg().ofType(File.class);
      ArgumentAcceptingOptionSpec var8 = var1.accepts("proxyHost").withRequiredArg();
      ArgumentAcceptingOptionSpec var9 = var1.accepts("proxyPort").withRequiredArg().defaultsTo("8080", new String[0]).ofType(Integer.class);
      ArgumentAcceptingOptionSpec var10 = var1.accepts("proxyUser").withRequiredArg();
      ArgumentAcceptingOptionSpec var11 = var1.accepts("proxyPass").withRequiredArg();
      ArgumentAcceptingOptionSpec var12 = var1.accepts("username").withRequiredArg().defaultsTo("BatMod", new String[0]);
      ArgumentAcceptingOptionSpec var13 = var1.accepts("uuid").withRequiredArg();
      ArgumentAcceptingOptionSpec var14 = var1.accepts("accessToken").withRequiredArg().required();
      ArgumentAcceptingOptionSpec var15 = var1.accepts("version").withRequiredArg().required();
      ArgumentAcceptingOptionSpec var16 = var1.accepts("width").withRequiredArg().ofType(Integer.class).defaultsTo(854, new Integer[0]);
      ArgumentAcceptingOptionSpec var17 = var1.accepts("height").withRequiredArg().ofType(Integer.class).defaultsTo(480, new Integer[0]);
      ArgumentAcceptingOptionSpec var18 = var1.accepts("userProperties").withRequiredArg().defaultsTo("{}", new String[0]);
      ArgumentAcceptingOptionSpec var19 = var1.accepts("profileProperties").withRequiredArg().defaultsTo("{}", new String[0]);
      ArgumentAcceptingOptionSpec var20 = var1.accepts("assetIndex").withRequiredArg();
      ArgumentAcceptingOptionSpec var21 = var1.accepts("userType").withRequiredArg().defaultsTo("legacy", new String[0]);
      NonOptionArgumentSpec var22 = var1.nonOptions();
      OptionSet var23 = var1.parse(var0);
      List var24 = var23.valuesOf(var22);
      if (!var24.isEmpty()) {
         System.out.println("Completely ignored arguments: " + var24);
      }

      Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         var0, (String)var23.valueOf(var2)
      );
      String var25 = (String)var23.valueOf(var8);
      Proxy var26 = Proxy.NO_PROXY;
      if (var25 != null) {
         try {
            var26 = new Proxy(Type.SOCKS, new InetSocketAddress(var25, (Integer)var23.valueOf(var9)));
         } catch (Exception var47) {
         }
      }

      String var27 = (String)var23.valueOf(var10);
      String var28 = (String)var23.valueOf(var11);
      if (!var26.equals(Proxy.NO_PROXY)
         && Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var27)
         && Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var28)) {
         Authenticator.setDefault(
            new net.minecraft.client.main.kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ(var27, var28)
         );
      }

      int var29 = (Integer)var23.valueOf(var16);
      int var30 = (Integer)var23.valueOf(var17);
      boolean var31 = var23.has("fullscreen");
      boolean var32 = var23.has("checkGlErrors");
      boolean var33 = var23.has("demo");
      String var34 = (String)var23.valueOf(var15);
      Gson var35 = new GsonBuilder().registerTypeAdapter(PropertyMap.class, new Serializer()).create();
      PropertyMap var36 = (PropertyMap)var35.fromJson("{}", PropertyMap.class);
      PropertyMap var37 = (PropertyMap)var35.fromJson((String)var23.valueOf(var19), PropertyMap.class);
      File var38 = (File)var23.valueOf(var5);
      File var39 = var23.has(var6) ? (File)var23.valueOf(var6) : new File(var38, "assets/");
      File var40 = var23.has(var7) ? (File)var23.valueOf(var7) : new File(var38, "resourcepacks/");
      String var41 = var23.has(var13) ? (String)var13.value(var23) : (String)var12.value(var23);
      String var42 = var23.has(var20) ? (String)var20.value(var23) : null;
      String var43 = (String)var23.valueOf(var3);
      Integer var44 = (Integer)var23.valueOf(var4);
      eIWjt9Txw5Ftl6kgo0YhggpT54ubA6Rq3Bb8vbG8e1xVxCXC58KLFe3CEqsOf50QOMp3Y2RKD4XJSTSPiY30R3v5gORmjBmgcGE var45 = new eIWjt9Txw5Ftl6kgo0YhggpT54ubA6Rq3Bb8vbG8e1xVxCXC58KLFe3CEqsOf50QOMp3Y2RKD4XJSTSPiY30R3v5gORmjBmgcGE(
         (String)var12.value(var23), var41, (String)var14.value(var23), (String)var21.value(var23)
      );
      net.minecraft.client.main.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I var46 = new net.minecraft.client.main.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         new net.minecraft.client.main.QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0(
            var45, var36, var37, var26
         ),
         new net.minecraft.client.main.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(
            var29, var30, var31, var32
         ),
         new net.minecraft.client.main.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
            var38, var40, var39, var42
         ),
         new net.minecraft.client.main.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u(var33, var34),
         new net.minecraft.client.main.uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590(var43, var44)
      );
      Runtime.getRuntime()
         .addShutdownHook(
            new net.minecraft.client.main.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY(
               "Client Shutdown Thread"
            )
         );
      Thread.currentThread().setName("Client thread");
      new AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB(var46)
         .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I();
   }

   private static boolean Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(String var0) {
      return var0 != null && !var0.isEmpty();
   }
}
