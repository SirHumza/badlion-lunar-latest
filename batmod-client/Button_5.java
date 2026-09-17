import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class FPwOTHqpIFa0pOIUPKFBFMz8B8Q8lXryJPt2yK9FIb5Ok3mpAM5e3MIzKCoAev9t0CYHvEW5JKDkLaVRRirTs0NapwdXnSei6fHo
   extends lBXU78tcwrhR6m2MdZVeXkF8BVD00PoI0b3FRjbR7yr9Rkb1UUncBGp5kCKGodBGVU8dZYX3SdWeDb6QxQKowOUqVzHQWXSTa76C {
   public FPwOTHqpIFa0pOIUPKFBFMz8B8Q8lXryJPt2yK9FIb5Ok3mpAM5e3MIzKCoAev9t0CYHvEW5JKDkLaVRRirTs0NapwdXnSei6fHo(GameProfile var1) {
      super(var1);
   }

   public FPwOTHqpIFa0pOIUPKFBFMz8B8Q8lXryJPt2yK9FIb5Ok3mpAM5e3MIzKCoAev9t0CYHvEW5JKDkLaVRRirTs0NapwdXnSei6fHo(JsonObject var1) {
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
