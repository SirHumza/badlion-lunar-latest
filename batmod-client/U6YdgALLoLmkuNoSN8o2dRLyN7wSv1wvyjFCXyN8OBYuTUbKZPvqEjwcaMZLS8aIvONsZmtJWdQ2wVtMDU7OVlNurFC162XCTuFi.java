import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Timer;
import net.coffeebunny.rpc.DiscordEventHandlers;
import net.coffeebunny.rpc.DiscordRPC;
import net.coffeebunny.rpc.DiscordRichPresence;
import net.coffeebunny.rpc.util.UtilRPC;

public class U6YdgALLoLmkuNoSN8o2dRLyN7wSv1wvyjFCXyN8OBYuTUbKZPvqEjwcaMZLS8aIvONsZmtJWdQ2wVtMDU7OVlNurFC162XCTuFi {
   private static final String BatModClient = "503588598684319744";
   private DiscordRPC Button;
   private DiscordRichPresence CustomSpinner;
   private List ButtonAction = new ArrayList();
   private String Spinner;

   public U6YdgALLoLmkuNoSN8o2dRLyN7wSv1wvyjFCXyN8OBYuTUbKZPvqEjwcaMZLS8aIvONsZmtJWdQ2wVtMDU7OVlNurFC162XCTuFi() {
      this.Button();
      Timer var1 = new Timer("Discord Timer", true);
      var1.schedule(new J3gqUwkDP9cGFNTz5r2DW1enqStsbYCDRDN2hW4S1R2MWHXCc33hHe08AO7ksEDK8j7sik5gPxEJJytAqWHatyjelrqjXSk2qoz1(this), 0L, 1000L);
   }

   private void Button() {
      nuWP3Bei4rUZ6VCX2iWCHlHKiAsicTC9Ae69Jpwv4oZQMYPCTjiB0SikRnqAxZeaL93OS1vPuNC116DLDmI1tI2KbykrrH2Hg5n.Button(
         BatModClient.Button
            ? "http://localhost:8080/rpc-servers"
            : "https://api.batmod.com/rpc-servers",
         var1x -> {
            for (JsonElement var3 : (JsonArray)var1x) {
               JsonObject var4 = (JsonObject)var3;
               this.ButtonAction
                  .add(
                     new I6LkhDoyobAZpUWR7u8TLy96BaEzLD6NsEfZ1WToN49InL8ZmXzTR7xLAiP8QMALeyDHn6dbCQa1qdSAuOjVLAu5yoLQUJN6UcxK(
                        var4.get("key").getAsString(), var4.get("name").getAsString(), (String[])new Gson().fromJson(var4.get("address"), String[].class)
                     )
                  );
            }
         }
      );
      this.Button = DiscordRPC.INSTANCE;
      DiscordEventHandlers var1 = new DiscordEventHandlers();
      var1.ready = var0 -> BatModClient.BatModClient(
         "Discord RPC initialized (localPath: " + UtilRPC.getLocalPath() + ", tempPath: " + UtilRPC.getTempPath() + ", userId: " + var0.userId + ")"
      );
      this.Button
         .Discord_Initialize("503588598684319744", var1, true, "");
      this.CustomSpinner = new DiscordRichPresence();
      this.CustomSpinner.startTimestamp = System.currentTimeMillis()
         / 1000L;
      this.CustomSpinner.state = "In Main Menu";
      this.CustomSpinner.largeImageKey = "logo";
      this.CustomSpinner.largeImageText = "BatMod 0.6.7 BETA";
      this.Button
         .Discord_UpdatePresence(this.CustomSpinner);
   }

   private I6LkhDoyobAZpUWR7u8TLy96BaEzLD6NsEfZ1WToN49InL8ZmXzTR7xLAiP8QMALeyDHn6dbCQa1qdSAuOjVLAu5yoLQUJN6UcxK BatModClient(
      String var1
   ) {
      return this.ButtonAction
         .stream()
         .filter(
            var1x -> Arrays.stream(var1x.CustomSpinner())
               .anyMatch(var1::endsWith)
         )
         .findFirst()
         .orElse(null);
   }

   public void BatModClient() {
      this.Button.Discord_Shutdown();
   }
}
