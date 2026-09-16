import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.Map;

class H2DmSAD4QlSZy75es3k00O5BJevvXiGJ4RHyszEUUYmxMUUETIvrhKhVfTQ10mjruwCe2zhBIoBlReFxwE3cDR9TYCZP0u4g0blD extends TypeAdapter {
   H2DmSAD4QlSZy75es3k00O5BJevvXiGJ4RHyszEUUYmxMUUETIvrhKhVfTQ10mjruwCe2zhBIoBlReFxwE3cDR9TYCZP0u4g0blD(
      pirT6lL2sekWRlDOCL8eRehsXt1QNyEERj9G5VDRk0Of26YX5yBKEDklQFIoyMfHszZu26zc4rUmobmy6xvPwLBl8ocI4JJfaOX var1, Map var2
   ) {
      this.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW = var1;
      this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I = var2;
   }

   public void write(JsonWriter var1, Object var2) {
      if (var2 == null) {
         var1.nullValue();
      } else {
         var1.value(
            pirT6lL2sekWRlDOCL8eRehsXt1QNyEERj9G5VDRk0Of26YX5yBKEDklQFIoyMfHszZu26zc4rUmobmy6xvPwLBl8ocI4JJfaOX.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               this.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW, var2
            )
         );
      }
   }

   public Object read(JsonReader var1) {
      if (var1.peek() == JsonToken.NULL) {
         var1.nextNull();
         return null;
      } else {
         return this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I.get(var1.nextString());
      }
   }
}
