import java.util.LinkedHashMap;
import java.util.Map;

public class XfPecFep61ZBzdk4gspvUeqsHUhhK1lUpLuDIigASeSJxX7FTLbfAamzE80cuvVAUxtYce77SOzCIzTawmktcknHHvZPlMMeaoS1 {
   private int BatModClient = 0;
   private String Button = null;
   private Map CustomSpinner = new LinkedHashMap();
   private byte[] ButtonAction = null;

   public XfPecFep61ZBzdk4gspvUeqsHUhhK1lUpLuDIigASeSJxX7FTLbfAamzE80cuvVAUxtYce77SOzCIzTawmktcknHHvZPlMMeaoS1(int var1, String var2, Map var3, byte[] var4) {
      this.BatModClient = var1;
      this.Button = var2;
      this.CustomSpinner = var3;
      this.ButtonAction = var4;
   }

   public int BatModClient() {
      return this.BatModClient;
   }

   public String Button() {
      return this.Button;
   }

   public Map CustomSpinner() {
      return this.CustomSpinner;
   }

   public String BatModClient(String var1) {
      return (String)this.CustomSpinner.get(var1);
   }

   public byte[] ButtonAction() {
      return this.ButtonAction;
   }
}
