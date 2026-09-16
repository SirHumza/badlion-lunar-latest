import com.google.common.collect.Sets;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.io.filefilter.DirectoryFileFilter;

public class sFwZoCLbe2plq6RQGdOZvQTSw5PHoSb75lolMjTAhnShHfjymIQh41razLFRBA4WZDXl7GDKIgL136rAh5XpBMBEVFpEmwyuR8i
   extends js8IhP7JieBz8pRpMyza2AHRscWcsir5ONrBljFoJMl6PtgMlsk34luC3IRado0LemsX3zBSzRCMdozHX5n0pZFPO1B4GZIBv1Rh {
   public sFwZoCLbe2plq6RQGdOZvQTSw5PHoSb75lolMjTAhnShHfjymIQh41razLFRBA4WZDXl7GDKIgL136rAh5XpBMBEVFpEmwyuR8i(File var1) {
      super(var1);
   }

   @Override
   protected InputStream Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(String var1) {
      return new BufferedInputStream(
         new FileInputStream(new File(this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I, var1))
      );
   }

   @Override
   protected boolean BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(String var1) {
      return new File(this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I, var1).isFile();
   }

   @Override
   public Set vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5() {
      HashSet var1 = Sets.newHashSet();
      File var2 = new File(this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I, "assets/");
      if (var2.isDirectory()) {
         for (File var6 : var2.listFiles(DirectoryFileFilter.DIRECTORY)) {
            String var7 = Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var2, var6);
            if (!var7.equals(var7.toLowerCase())) {
               this.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(var7);
            } else {
               var1.add(var7.substring(0, var7.length() - 1));
            }
         }
      }

      return var1;
   }
}
