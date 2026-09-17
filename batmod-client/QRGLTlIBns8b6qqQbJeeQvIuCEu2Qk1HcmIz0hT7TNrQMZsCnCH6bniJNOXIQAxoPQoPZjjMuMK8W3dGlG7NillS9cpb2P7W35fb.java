import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import org.apache.commons.lang3.StringUtils;

public class QRGLTlIBns8b6qqQbJeeQvIuCEu2Qk1HcmIz0hT7TNrQMZsCnCH6bniJNOXIQAxoPQoPZjjMuMK8W3dGlG7NillS9cpb2P7W35fb {
   public static boolean BatModClient(JsonObject var0, String var1) {
      return !ButtonAction(var0, var1)
         ? false
         : var0.getAsJsonPrimitive(var1).isString();
   }

   public static boolean BatModClient(JsonElement var0) {
      return !var0.isJsonPrimitive() ? false : var0.getAsJsonPrimitive().isString();
   }

   public static boolean Button(JsonObject var0, String var1) {
      return !ButtonAction(var0, var1)
         ? false
         : var0.getAsJsonPrimitive(var1).isBoolean();
   }

   public static boolean CustomSpinner(JsonObject var0, String var1) {
      return !Spinner(var0, var1)
         ? false
         : var0.get(var1).isJsonArray();
   }

   public static boolean ButtonAction(JsonObject var0, String var1) {
      return !Spinner(var0, var1)
         ? false
         : var0.get(var1).isJsonPrimitive();
   }

   public static boolean Spinner(JsonObject var0, String var1) {
      return var0 == null ? false : var0.get(var1) != null;
   }

   public static String BatModClient(JsonElement var0, String var1) {
      if (var0.isJsonPrimitive()) {
         return var0.getAsString();
      } else {
         throw new JsonSyntaxException(
            "Expected "
               + var1
               + " to be a string, was "
               + Button(var0)
         );
      }
   }

   public static String Checkbox(JsonObject var0, String var1) {
      if (var0.has(var1)) {
         return BatModClient(var0.get(var1), var1);
      } else {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find a string");
      }
   }

   public static String BatModClient(
      JsonObject var0, String var1, String var2
   ) {
      return var0.has(var1) ? BatModClient(var0.get(var1), var1) : var2;
   }

   public static boolean Button(JsonElement var0, String var1) {
      if (var0.isJsonPrimitive()) {
         return var0.getAsBoolean();
      } else {
         throw new JsonSyntaxException(
            "Expected "
               + var1
               + " to be a Boolean, was "
               + Button(var0)
         );
      }
   }

   public static boolean ProgressBar(JsonObject var0, String var1) {
      if (var0.has(var1)) {
         return Button(var0.get(var1), var1);
      } else {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find a Boolean");
      }
   }

   public static boolean BatModClient(
      JsonObject var0, String var1, boolean var2
   ) {
      return var0.has(var1) ? Button(var0.get(var1), var1) : var2;
   }

   public static float CustomSpinner(JsonElement var0, String var1) {
      if (var0.isJsonPrimitive() && var0.getAsJsonPrimitive().isNumber()) {
         return var0.getAsFloat();
      } else {
         throw new JsonSyntaxException(
            "Expected "
               + var1
               + " to be a Float, was "
               + Button(var0)
         );
      }
   }

   public static float BatModProgressBar(JsonObject var0, String var1) {
      if (var0.has(var1)) {
         return CustomSpinner(var0.get(var1), var1);
      } else {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find a Float");
      }
   }

   public static float BatModClient(
      JsonObject var0, String var1, float var2
   ) {
      return var0.has(var1) ? CustomSpinner(var0.get(var1), var1) : var2;
   }

   public static int ButtonAction(JsonElement var0, String var1) {
      if (var0.isJsonPrimitive() && var0.getAsJsonPrimitive().isNumber()) {
         return var0.getAsInt();
      } else {
         throw new JsonSyntaxException(
            "Expected "
               + var1
               + " to be a Int, was "
               + Button(var0)
         );
      }
   }

   public static int ColorChooser(JsonObject var0, String var1) {
      if (var0.has(var1)) {
         return ButtonAction(var0.get(var1), var1);
      } else {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find a Int");
      }
   }

   public static int BatModClient(
      JsonObject var0, String var1, int var2
   ) {
      return var0.has(var1) ? ButtonAction(var0.get(var1), var1) : var2;
   }

   public static JsonObject Spinner(JsonElement var0, String var1) {
      if (var0.isJsonObject()) {
         return var0.getAsJsonObject();
      } else {
         throw new JsonSyntaxException(
            "Expected "
               + var1
               + " to be a JsonObject, was "
               + Button(var0)
         );
      }
   }

   public static JsonObject IntegerSpinner(JsonObject var0, String var1) {
      if (var0.has(var1)) {
         return Spinner(var0.get(var1), var1);
      } else {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find a JsonObject");
      }
   }

   public static JsonObject BatModClient(
      JsonObject var0, String var1, JsonObject var2
   ) {
      return var0.has(var1) ? Spinner(var0.get(var1), var1) : var2;
   }

   public static JsonArray Checkbox(JsonElement var0, String var1) {
      if (var0.isJsonArray()) {
         return var0.getAsJsonArray();
      } else {
         throw new JsonSyntaxException(
            "Expected "
               + var1
               + " to be a JsonArray, was "
               + Button(var0)
         );
      }
   }

   public static JsonArray TextField(JsonObject var0, String var1) {
      if (var0.has(var1)) {
         return Checkbox(var0.get(var1), var1);
      } else {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find a JsonArray");
      }
   }

   public static JsonArray BatModClient(
      JsonObject var0, String var1, JsonArray var2
   ) {
      return var0.has(var1) ? Checkbox(var0.get(var1), var1) : var2;
   }

   public static String Button(JsonElement var0) {
      String var1 = StringUtils.abbreviateMiddle(String.valueOf(var0), "...", 10);
      if (var0 == null) {
         return "null (missing)";
      }

      if (var0.isJsonNull()) {
         return "null (json)";
      }

      if (var0.isJsonArray()) {
         return "an array (" + var1 + ")";
      }

      if (var0.isJsonObject()) {
         return "an object (" + var1 + ")";
      }

      if (var0.isJsonPrimitive()) {
         JsonPrimitive var2 = var0.getAsJsonPrimitive();
         if (var2.isNumber()) {
            return "a number (" + var1 + ")";
         }

         if (var2.isBoolean()) {
            return "a boolean (" + var1 + ")";
         }
      }

      return var1;
   }
}
