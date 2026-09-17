import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class f95YjYzHBT7OhPsVTZ0C2NjlFiC1kIm2bzCS3mPvlgc5SeUYozUJjnj9a0XxYP5CcJdkfHr98FmcheWggMVL7tWRNx1EoLIlnNF7
   extends lBXU78tcwrhR6m2MdZVeXkF8BVD00PoI0b3FRjbR7yr9Rkb1UUncBGp5kCKGodBGVU8dZYX3SdWeDb6QxQKowOUqVzHQWXSTa76C {
   private final int BatModClient;
   private final boolean Button;

   public f95YjYzHBT7OhPsVTZ0C2NjlFiC1kIm2bzCS3mPvlgc5SeUYozUJjnj9a0XxYP5CcJdkfHr98FmcheWggMVL7tWRNx1EoLIlnNF7(GameProfile var1, int var2, boolean var3) {
      super(var1);
      this.BatModClient = var2;
      this.Button = var3;
   }

   public f95YjYzHBT7OhPsVTZ0C2NjlFiC1kIm2bzCS3mPvlgc5SeUYozUJjnj9a0XxYP5CcJdkfHr98FmcheWggMVL7tWRNx1EoLIlnNF7(JsonObject var1) {
      super(Button(var1), var1);
      this.BatModClient = var1.has("level")
         ? var1.get("level").getAsInt()
         : 0;
      this.Button = var1.has("bypassesPlayerLimit")
         && var1.get("bypassesPlayerLimit").getAsBoolean();
   }

   public int BatModClient() {
      return this.BatModClient;
   }

   public boolean Button() {
      return this.Button;
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
         var1.addProperty("level", this.BatModClient);
         var1.addProperty("bypassesPlayerLimit", this.Button);
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
