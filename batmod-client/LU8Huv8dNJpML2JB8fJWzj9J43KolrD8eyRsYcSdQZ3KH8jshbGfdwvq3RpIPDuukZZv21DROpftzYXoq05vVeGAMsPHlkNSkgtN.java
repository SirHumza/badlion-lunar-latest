import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.mojang.authlib.properties.Property;
import com.mojang.util.UUIDTypeAdapter;
import java.util.ArrayList;
import java.util.UUID;

public class LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN extends TypeAdapter {
   public void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      JsonWriter var1, iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF var2
   ) {
   }

   public iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      JsonReader var1
   ) {
      UUID var2 = null;
      String var3 = null;
      ArrayList var4 = new ArrayList();
      var1.beginObject();

      while (var1.hasNext()) {
         switch (var1.nextName()) {
            case "id":
               var2 = UUIDTypeAdapter.fromString(var1.nextString());
               break;
            case "name":
               var3 = var1.nextString();
               break;
            case "properties":
               var1.beginArray();

               while (var1.hasNext()) {
                  var1.beginObject();
                  String var7 = null;
                  String var8 = null;
                  String var9 = null;

                  while (var1.hasNext()) {
                     switch (var1.nextName()) {
                        case "name":
                           var7 = var1.nextString();
                           break;
                        case "value":
                           var8 = var1.nextString();
                           break;
                        case "signature":
                           var9 = var1.nextString();
                     }
                  }

                  if (var7 == null || var8 == null) {
                     try {
                        throw new bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ(
                           "Could not adapt profile properties"
                        );
                     } catch (bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ var12) {
                        var12.printStackTrace();
                        return null;
                     }
                  }

                  var4.add(var9 == null ? new Property(var7, var8) : new Property(var7, var8, var9));
                  var1.endObject();
               }

               var1.endArray();
         }
      }

      var1.endObject();
      if (var2 != null && var3 != null && !var4.isEmpty()) {
         return new iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF(var2, var3, var4);
      }

      try {
         throw new bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ("Could not adapt profile");
      } catch (bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ var13) {
         var13.printStackTrace();
         return null;
      }
   }
}
