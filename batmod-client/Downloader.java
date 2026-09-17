import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Downloader {
   private static Gson BatModClient = new GsonBuilder()
      .registerTypeAdapter(
         InstallationLogger.class,
         new RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB()
      )
      .create();

   public static InstallationLogger BatModClient(
      String var0
   ) {
      return (InstallationLogger)BatModClient.fromJson(
         var0, InstallationLogger.class
      );
   }
}
