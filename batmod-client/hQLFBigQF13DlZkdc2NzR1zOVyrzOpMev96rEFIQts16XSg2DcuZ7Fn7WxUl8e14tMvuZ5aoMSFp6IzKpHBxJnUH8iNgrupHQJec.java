import com.google.common.collect.Lists;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map.Entry;

public class hQLFBigQF13DlZkdc2NzR1zOVyrzOpMev96rEFIQts16XSg2DcuZ7Fn7WxUl8e14tMvuZ5aoMSFp6IzKpHBxJnUH8iNgrupHQJec implements JsonDeserializer {
   public NHmY67TZ9yaidO2OYen7B10KFqW5CCCuxldmi7Q2qCKwFygbNVSigGKjNM9U3wasEED3XL6nHOe6jhnl8qXWriP6dicRcnYI5bc0 Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      JsonElement var1, Type var2, JsonDeserializationContext var3
   ) {
      JsonObject var4 = var1.getAsJsonObject();
      List var5 = this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var3, var4);
      return new NHmY67TZ9yaidO2OYen7B10KFqW5CCCuxldmi7Q2qCKwFygbNVSigGKjNM9U3wasEED3XL6nHOe6jhnl8qXWriP6dicRcnYI5bc0((Collection)var5);
   }

   protected List Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      JsonDeserializationContext var1, JsonObject var2
   ) {
      JsonObject var3 = QRGLTlIBns8b6qqQbJeeQvIuCEu2Qk1HcmIz0hT7TNrQMZsCnCH6bniJNOXIQAxoPQoPZjjMuMK8W3dGlG7NillS9cpb2P7W35fb.lupDZ2Cnh8fIgzDGHlnSYSWdtTyhGvQM8ySvPCDcouYi9MkHlLktznCZqsSuMBFSPFPFDsZ7NP0MqV4XGlOC2qxTDOCxMbPdCQAQ(
         var2, "variants"
      );
      ArrayList var4 = Lists.newArrayList();

      for (Entry var6 : var3.entrySet()) {
         var4.add(this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var1, var6));
      }

      return var4;
   }

   protected L3ImoMdOhVpFPzo8eDStKvBALCrWZBJecSgI0e0960HNwnV8YlejO5PT78bpt8NXwAdN7PbMR9Yvmaf0cYa1kVi2t2LEqED3gZm2 Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      JsonDeserializationContext var1, Entry var2
   ) {
      String var3 = (String)var2.getKey();
      ArrayList var4 = Lists.newArrayList();
      JsonElement var5 = (JsonElement)var2.getValue();
      if (var5.isJsonArray()) {
         for (JsonElement var7 : var5.getAsJsonArray()) {
            var4.add(
               (lCdpQOIF3jvmVeAEx0SvyQ4xJcZ91eluCpbvhNBoYkOj3UTuN07aclHt47NFWOIT3sCDHsiIxWrDdaLClLAVIcxNObiwnrcjY3kA)var1.deserialize(
                  var7, lCdpQOIF3jvmVeAEx0SvyQ4xJcZ91eluCpbvhNBoYkOj3UTuN07aclHt47NFWOIT3sCDHsiIxWrDdaLClLAVIcxNObiwnrcjY3kA.class
               )
            );
         }
      } else {
         var4.add(
            (lCdpQOIF3jvmVeAEx0SvyQ4xJcZ91eluCpbvhNBoYkOj3UTuN07aclHt47NFWOIT3sCDHsiIxWrDdaLClLAVIcxNObiwnrcjY3kA)var1.deserialize(
               var5, lCdpQOIF3jvmVeAEx0SvyQ4xJcZ91eluCpbvhNBoYkOj3UTuN07aclHt47NFWOIT3sCDHsiIxWrDdaLClLAVIcxNObiwnrcjY3kA.class
            )
         );
      }

      return new L3ImoMdOhVpFPzo8eDStKvBALCrWZBJecSgI0e0960HNwnV8YlejO5PT78bpt8NXwAdN7PbMR9Yvmaf0cYa1kVi2t2LEqED3gZm2(var3, var4);
   }
}
