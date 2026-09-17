import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mojang.util.UUIDTypeAdapter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

public class G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr {
   private static final String BatModClient = "https://sessionserver.mojang.com/session/minecraft/profile/%s";
   private static Gson Button = new GsonBuilder()
      .registerTypeAdapter(
         iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF.class,
         new LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN()
      )
      .create();
   private static ExecutorService CustomSpinner = Executors.newCachedThreadPool();
   private static Map ButtonAction = new HashMap();

   public static void BatModClient(UUID var0, Consumer var1) {
      CustomSpinner.execute(
         () -> var1.accept(BatModClient(var0))
      );
   }

   public static iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF BatModClient(
      UUID var0
   ) {
      if (ButtonAction.containsKey(var0)) {
         return (iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF)ButtonAction.get(
            var0
         );
      }

      try {
         HttpURLConnection var1 = (HttpURLConnection)new URL(
               String.format("https://sessionserver.mojang.com/session/minecraft/profile/%s", UUIDTypeAdapter.fromUUID(var0))
            )
            .openConnection();
         var1.setReadTimeout(5000);
         iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF var2 = (iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF)Button.fromJson(
            new BufferedReader(new InputStreamReader(var1.getInputStream())),
            iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF.class
         );
         ButtonAction.put(var0, var2);
         return var2;
      } catch (Exception var3) {
         var3.printStackTrace();
         return null;
      }
   }
}
