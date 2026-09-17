import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.util.Date;
import java.util.UUID;

public class hDM28ZquUeShDo4n4jcDPlQKOS0yKGD9MMxyswNxXaV7MMCWIkqFu3u4xkCPbRCqdTMVFYUogqgEK20vrtUpCDCqCBGFSAym6Nde
   extends O0Lad1hAOHNJ5NfiQgxwVmZZKugltriiy1EGbdw3J43QdK7TOZAfY96BBekzgHil1HLaQ1Dq0IhTBnAOtXqScS7sXfbu25sSIBSV {
   public hDM28ZquUeShDo4n4jcDPlQKOS0yKGD9MMxyswNxXaV7MMCWIkqFu3u4xkCPbRCqdTMVFYUogqgEK20vrtUpCDCqCBGFSAym6Nde(GameProfile var1) {
      this(var1, (Date)null, (String)null, (Date)null, (String)null);
   }

   public hDM28ZquUeShDo4n4jcDPlQKOS0yKGD9MMxyswNxXaV7MMCWIkqFu3u4xkCPbRCqdTMVFYUogqgEK20vrtUpCDCqCBGFSAym6Nde(
      GameProfile var1, Date var2, String var3, Date var4, String var5
   ) {
      super(var1, var4, var3, var4, var5);
   }

   public hDM28ZquUeShDo4n4jcDPlQKOS0yKGD9MMxyswNxXaV7MMCWIkqFu3u4xkCPbRCqdTMVFYUogqgEK20vrtUpCDCqCBGFSAym6Nde(JsonObject var1) {
      super(Button(var1), var1);
   }

   @Override
   protected void BatModClient(JsonObject var1) {
      if (this.ButtonAction() != null) {
         var1.addProperty(
            "uuid",
            ((GameProfile)this.ButtonAction()).getId() == null
               ? ""
               : ((GameProfile)this.ButtonAction()).getId().toString()
         );
         var1.addProperty(
            "name", ((GameProfile)this.ButtonAction()).getName()
         );
         super.BatModClient(var1);
      }
   }

   private static GameProfile Button(JsonObject var0) {
      if (var0.has("uuid") && var0.has("name")) {
         String var1 = var0.get("uuid").getAsString();

         UUID var2;
         try {
            var2 = UUID.fromString(var1);
         } catch (Throwable var4) {
            return null;
         }

         return new GameProfile(var2, var0.get("name").getAsString());
      } else {
         return null;
      }
   }
}
