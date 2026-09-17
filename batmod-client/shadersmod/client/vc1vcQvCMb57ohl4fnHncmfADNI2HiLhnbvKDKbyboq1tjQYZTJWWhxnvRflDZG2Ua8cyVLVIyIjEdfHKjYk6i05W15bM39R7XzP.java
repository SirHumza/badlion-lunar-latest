package shadersmod.client;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class vc1vcQvCMb57ohl4fnHncmfADNI2HiLhnbvKDKbyboq1tjQYZTJWWhxnvRflDZG2Ua8cyVLVIyIjEdfHKjYk6i05W15bM39R7XzP {
   private String BatModClient = null;
   private Map Button = new HashMap();
   private Set CustomSpinner = new HashSet();

   public vc1vcQvCMb57ohl4fnHncmfADNI2HiLhnbvKDKbyboq1tjQYZTJWWhxnvRflDZG2Ua8cyVLVIyIjEdfHKjYk6i05W15bM39R7XzP(String var1) {
      this.BatModClient = var1;
   }

   public String BatModClient() {
      return this.BatModClient;
   }

   public void BatModClient(String var1, String var2) {
      this.Button.put(var1, var2);
   }

   public void BatModClient(
      shadersmod.client.vc1vcQvCMb57ohl4fnHncmfADNI2HiLhnbvKDKbyboq1tjQYZTJWWhxnvRflDZG2Ua8cyVLVIyIjEdfHKjYk6i05W15bM39R7XzP var1
   ) {
      if (var1 != null) {
         this.Button
            .putAll(var1.Button);
      }
   }

   public void BatModClient(
      shadersmod.client.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa[] var1
   ) {
      for (int var2 = 0; var2 < var1.length; var2++) {
         shadersmod.client.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa var3 = var1[var2];
         String var4 = var3.BatModClient();
         String var5 = (String)this.Button.get(var4);
         if (var5 != null) {
            var3.Button(var5);
         }
      }
   }

   public String[] Button() {
      Set var1 = this.Button.keySet();
      return var1.toArray(new String[var1.size()]);
   }

   public String BatModClient(String var1) {
      return (String)this.Button.get(var1);
   }

   public void Button(String var1) {
      this.CustomSpinner.add(var1);
   }

   public Collection CustomSpinner() {
      return new HashSet(this.CustomSpinner);
   }

   public void BatModClient(Collection var1) {
      this.CustomSpinner.addAll(var1);
   }

   public boolean CustomSpinner(String var1) {
      return this.CustomSpinner.contains(var1);
   }
}
