import com.mojang.authlib.GameProfile;
import com.mojang.util.UUIDTypeAdapter;
import java.util.UUID;

public class eIWjt9Txw5Ftl6kgo0YhggpT54ubA6Rq3Bb8vbG8e1xVxCXC58KLFe3CEqsOf50QOMp3Y2RKD4XJSTSPiY30R3v5gORmjBmgcGE {
   private final String BatModClient;
   private final String Button;
   private final String CustomSpinner;
   private final lUueqakrVNU8jXDGWcbJgd09WY86wTIZVLyPooZaMJAsc5KCAlY0sPE5C3e0pjdY0DLPsegLY5PVfd9naiLiDZX5F1qJYCmmit8T ButtonAction;

   public eIWjt9Txw5Ftl6kgo0YhggpT54ubA6Rq3Bb8vbG8e1xVxCXC58KLFe3CEqsOf50QOMp3Y2RKD4XJSTSPiY30R3v5gORmjBmgcGE(
      String var1, String var2, String var3, String var4
   ) {
      this.BatModClient = var1;
      this.Button = var2;
      this.CustomSpinner = var3;
      this.ButtonAction = lUueqakrVNU8jXDGWcbJgd09WY86wTIZVLyPooZaMJAsc5KCAlY0sPE5C3e0pjdY0DLPsegLY5PVfd9naiLiDZX5F1qJYCmmit8T.BatModClient(
         var4
      );
   }

   public String BatModClient() {
      return "token:"
         + this.CustomSpinner
         + ":"
         + this.Button;
   }

   public String Button() {
      return this.Button;
   }

   public String CustomSpinner() {
      return this.BatModClient;
   }

   public String ButtonAction() {
      return this.CustomSpinner;
   }

   public GameProfile Spinner() {
      try {
         UUID var1 = UUIDTypeAdapter.fromString(this.Button());
         return new GameProfile(var1, this.CustomSpinner());
      } catch (IllegalArgumentException var2) {
         return new GameProfile((UUID)null, this.CustomSpinner());
      }
   }

   public lUueqakrVNU8jXDGWcbJgd09WY86wTIZVLyPooZaMJAsc5KCAlY0sPE5C3e0pjdY0DLPsegLY5PVfd9naiLiDZX5F1qJYCmmit8T Checkbox() {
      return this.ButtonAction;
   }
}
