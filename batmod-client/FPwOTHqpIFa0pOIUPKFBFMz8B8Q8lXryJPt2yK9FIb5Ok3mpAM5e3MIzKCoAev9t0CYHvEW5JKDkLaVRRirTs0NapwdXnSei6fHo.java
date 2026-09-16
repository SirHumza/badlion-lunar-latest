import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class FPwOTHqpIFa0pOIUPKFBFMz8B8Q8lXryJPt2yK9FIb5Ok3mpAM5e3MIzKCoAev9t0CYHvEW5JKDkLaVRRirTs0NapwdXnSei6fHo
   extends lBXU78tcwrhR6m2MdZVeXkF8BVD00PoI0b3FRjbR7yr9Rkb1UUncBGp5kCKGodBGVU8dZYX3SdWeDb6QxQKowOUqVzHQWXSTa76C {
   public FPwOTHqpIFa0pOIUPKFBFMz8B8Q8lXryJPt2yK9FIb5Ok3mpAM5e3MIzKCoAev9t0CYHvEW5JKDkLaVRRirTs0NapwdXnSei6fHo(GameProfile var1) {
      super(var1);
   }

   public FPwOTHqpIFa0pOIUPKFBFMz8B8Q8lXryJPt2yK9FIb5Ok3mpAM5e3MIzKCoAev9t0CYHvEW5JKDkLaVRRirTs0NapwdXnSei6fHo(JsonObject var1) {
      super(BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(var1), var1);
   }

   @Override
   protected void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(JsonObject var1) {
      if (this.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u() != null) {
         var1.addProperty(
            "uuid",
            ((GameProfile)this.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u()).getId() == null
               ? ""
               : ((GameProfile)this.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u()).getId().toString()
         );
         var1.addProperty(
            "name", ((GameProfile)this.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u()).getName()
         );
         super.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var1);
      }
   }

   private static GameProfile BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(JsonObject var0) {
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
