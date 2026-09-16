import com.google.common.base.Predicate;
import java.net.IDN;

class HoUd5aWT5H9wYzftmQhsFO4DWBZKmNDVeIO77Z3qgnGGNe7XTaGfzJLWPRTGuseajjDkmpXVL36lVoRtUGJPUThMBFwLhvnx1rm2 implements Predicate {
   HoUd5aWT5H9wYzftmQhsFO4DWBZKmNDVeIO77Z3qgnGGNe7XTaGfzJLWPRTGuseajjDkmpXVL36lVoRtUGJPUThMBFwLhvnx1rm2(
      oNGyM02djX267yQANV7qcAXMnFwIO1RqLHPU0SRw0owvml50LSp2x83wbCfvXmdfkVyp8kMmC9pryyZL4erzYvCnfr7tw1UpRt7Q var1
   ) {
      this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I = var1;
   }

   public boolean Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(String var1) {
      if (var1.length() == 0) {
         return true;
      }

      String[] var2 = var1.split(":");
      if (var2.length == 0) {
         return true;
      }

      try {
         String var3 = IDN.toASCII(var2[0]);
         return true;
      } catch (IllegalArgumentException var4) {
         return false;
      }
   }
}
