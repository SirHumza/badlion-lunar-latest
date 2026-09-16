import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import com.mojang.util.UUIDTypeAdapter;
import java.util.HashMap;
import java.util.UUID;

public class RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB extends TypeAdapter {
   public void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      JsonWriter var1, zYsFhXndsTXpBULV9SbQRAPo7Eko9Z3Zs5nhhj1ndgHpLTUagG4wFepuFXrzHesiyrTZAHxS9VR68lIK48usZWN38KwLp7RwGH1t var2
   ) {
   }

   public zYsFhXndsTXpBULV9SbQRAPo7Eko9Z3Zs5nhhj1ndgHpLTUagG4wFepuFXrzHesiyrTZAHxS9VR68lIK48usZWN38KwLp7RwGH1t Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      JsonReader var1
   ) {
      long var2 = -1L;
      UUID var4 = null;
      String var5 = null;
      HashMap var6 = new HashMap();
      var1.beginObject();

      while (var1.hasNext()) {
         switch (var1.nextName()) {
            case "timestamp":
               var2 = var1.nextLong();
               break;
            case "profileId":
               var4 = UUIDTypeAdapter.fromString(var1.nextString());
               break;
            case "profileName":
               var5 = var1.nextString();
               break;
            case "textures":
               var1.beginObject();

               while (var1.hasNext()) {
                  String var9 = var1.nextName();

                  for (Type var13 : Type.values()) {
                     if (var13.toString().equals(var9)) {
                        var1.beginObject();

                        while (var1.hasNext()) {
                           if (var1.nextName().equals("url")) {
                              var6.put(var13, var1.nextString());
                           } else {
                              var1.skipValue();
                           }
                        }

                        var1.endObject();
                        break;
                     }
                  }
               }

               var1.endObject();
         }
      }

      var1.endObject();
      if (var2 != -1L && var4 != null && var5 != null && !var6.isEmpty()) {
         return new zYsFhXndsTXpBULV9SbQRAPo7Eko9Z3Zs5nhhj1ndgHpLTUagG4wFepuFXrzHesiyrTZAHxS9VR68lIK48usZWN38KwLp7RwGH1t(var2, var4, var5, var6);
      }

      try {
         throw new RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM("Could not adapt profile textures");
      } catch (RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM var14) {
         var14.printStackTrace();
         return null;
      }
   }
}
