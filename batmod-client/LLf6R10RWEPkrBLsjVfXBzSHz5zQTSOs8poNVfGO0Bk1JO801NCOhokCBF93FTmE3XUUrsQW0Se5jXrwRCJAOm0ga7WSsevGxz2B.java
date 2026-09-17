import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.io.File;

public class IL2UTDNWUanExOapXazSGnDGxsF8fMQvkBKuxocrIISsux6Y5DBKve7gWvIvfjrBiOM0fIaMRZb14xXEyrFrx7IicwqxHyM0BSzI
   extends LLf6R10RWEPkrBLsjVfXBzSHz5zQTSOs8poNVfGO0Bk1JO801NCOhokCBF93FTmE3XUUrsQW0Se5jXrwRCJAOm0ga7WSsevGxz2B {
   public IL2UTDNWUanExOapXazSGnDGxsF8fMQvkBKuxocrIISsux6Y5DBKve7gWvIvfjrBiOM0fIaMRZb14xXEyrFrx7IicwqxHyM0BSzI(File var1) {
      super(var1);
   }

   @Override
   protected lBXU78tcwrhR6m2MdZVeXkF8BVD00PoI0b3FRjbR7yr9Rkb1UUncBGp5kCKGodBGVU8dZYX3SdWeDb6QxQKowOUqVzHQWXSTa76C BatModClient(
      JsonObject var1
   ) {
      return new hDM28ZquUeShDo4n4jcDPlQKOS0yKGD9MMxyswNxXaV7MMCWIkqFu3u4xkCPbRCqdTMVFYUogqgEK20vrtUpCDCqCBGFSAym6Nde(var1);
   }

   public boolean BatModClient(GameProfile var1) {
      return this.ButtonAction(var1);
   }

   @Override
   public String[] Button() {
      String[] var1 = new String[this.CustomSpinner().size()];
      int var2 = 0;

      for (hDM28ZquUeShDo4n4jcDPlQKOS0yKGD9MMxyswNxXaV7MMCWIkqFu3u4xkCPbRCqdTMVFYUogqgEK20vrtUpCDCqCBGFSAym6Nde var4 : this.CustomSpinner()
         .values()) {
         var1[var2++] = ((GameProfile)var4.ButtonAction()).getName();
      }

      return var1;
   }

   protected String Button(GameProfile var1) {
      return var1.getId().toString();
   }

   public GameProfile BatModClient(String var1) {
      for (hDM28ZquUeShDo4n4jcDPlQKOS0yKGD9MMxyswNxXaV7MMCWIkqFu3u4xkCPbRCqdTMVFYUogqgEK20vrtUpCDCqCBGFSAym6Nde var3 : this.CustomSpinner()
         .values()) {
         if (var1.equalsIgnoreCase(
            ((GameProfile)var3.ButtonAction()).getName()
         )) {
            return (GameProfile)var3.ButtonAction();
         }
      }

      return null;
   }
}
