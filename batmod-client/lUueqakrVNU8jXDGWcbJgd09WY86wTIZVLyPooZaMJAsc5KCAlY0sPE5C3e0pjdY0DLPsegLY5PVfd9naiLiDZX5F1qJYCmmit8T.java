import com.google.common.collect.Maps;
import java.util.Map;

public enum lUueqakrVNU8jXDGWcbJgd09WY86wTIZVLyPooZaMJAsc5KCAlY0sPE5C3e0pjdY0DLPsegLY5PVfd9naiLiDZX5F1qJYCmmit8T {
   BatModClient("legacy"),
   Button("mojang");

   private static final Map CustomSpinner = Maps.newHashMap();
   private final String ButtonAction;

   lUueqakrVNU8jXDGWcbJgd09WY86wTIZVLyPooZaMJAsc5KCAlY0sPE5C3e0pjdY0DLPsegLY5PVfd9naiLiDZX5F1qJYCmmit8T(String var3) {
      this.ButtonAction = var3;
   }

   public static lUueqakrVNU8jXDGWcbJgd09WY86wTIZVLyPooZaMJAsc5KCAlY0sPE5C3e0pjdY0DLPsegLY5PVfd9naiLiDZX5F1qJYCmmit8T BatModClient(
      String var0
   ) {
      return (lUueqakrVNU8jXDGWcbJgd09WY86wTIZVLyPooZaMJAsc5KCAlY0sPE5C3e0pjdY0DLPsegLY5PVfd9naiLiDZX5F1qJYCmmit8T)CustomSpinner.get(
         var0.toLowerCase()
      );
   }

   static {
      for (lUueqakrVNU8jXDGWcbJgd09WY86wTIZVLyPooZaMJAsc5KCAlY0sPE5C3e0pjdY0DLPsegLY5PVfd9naiLiDZX5F1qJYCmmit8T var3 : values()) {
         CustomSpinner.put(
            var3.ButtonAction, var3
         );
      }
   }
}
