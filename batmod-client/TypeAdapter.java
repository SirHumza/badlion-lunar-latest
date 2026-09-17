import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.Map;

class H2DmSAD4QlSZy75es3k00O5BJevvXiGJ4RHyszEUUYmxMUUETIvrhKhVfTQ10mjruwCe2zhBIoBlReFxwE3cDR9TYCZP0u4g0blD extends TypeAdapter {
   H2DmSAD4QlSZy75es3k00O5BJevvXiGJ4RHyszEUUYmxMUUETIvrhKhVfTQ10mjruwCe2zhBIoBlReFxwE3cDR9TYCZP0u4g0blD(
      pirT6lL2sekWRlDOCL8eRehsXt1QNyEERj9G5VDRk0Of26YX5yBKEDklQFIoyMfHszZu26zc4rUmobmy6xvPwLBl8ocI4JJfaOX var1, Map var2
   ) {
      this.Button = var1;
      this.BatModClient = var2;
   }

   public void write(JsonWriter var1, Object var2) {
      if (var2 == null) {
         var1.nullValue();
      } else {
         var1.value(
            pirT6lL2sekWRlDOCL8eRehsXt1QNyEERj9G5VDRk0Of26YX5yBKEDklQFIoyMfHszZu26zc4rUmobmy6xvPwLBl8ocI4JJfaOX.BatModClient(
               this.Button, var2
            )
         );
      }
   }

   public Object read(JsonReader var1) {
      if (var1.peek() == JsonToken.NULL) {
         var1.nextNull();
         return null;
      } else {
         return this.BatModClient.get(var1.nextString());
      }
   }
}
