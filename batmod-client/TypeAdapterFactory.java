import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import java.util.HashMap;
import java.util.Locale;

public class pirT6lL2sekWRlDOCL8eRehsXt1QNyEERj9G5VDRk0Of26YX5yBKEDklQFIoyMfHszZu26zc4rUmobmy6xvPwLBl8ocI4JJfaOX implements TypeAdapterFactory {
   public TypeAdapter create(Gson var1, TypeToken var2) {
      Class var3 = var2.getRawType();
      if (!var3.isEnum()) {
         return null;
      }

      HashMap var4 = Maps.newHashMap();

      for (Object var8 : var3.getEnumConstants()) {
         var4.put(this.BatModClient(var8), var8);
      }

      return new H2DmSAD4QlSZy75es3k00O5BJevvXiGJ4RHyszEUUYmxMUUETIvrhKhVfTQ10mjruwCe2zhBIoBlReFxwE3cDR9TYCZP0u4g0blD(this, var4);
   }

   private String BatModClient(Object var1) {
      return var1 instanceof Enum ? ((Enum)var1).name().toLowerCase(Locale.US) : var1.toString().toLowerCase(Locale.US);
   }
}
