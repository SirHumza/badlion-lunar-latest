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
   protected InputStream BatModClient(String var1) {
      return new BufferedInputStream(
         new FileInputStream(new File(this.BatModClient, var1))
      );
   }

   @Override
   protected boolean Button(String var1) {
      return new File(this.BatModClient, var1).isFile();
   }

   @Override
   public Set CustomSpinner() {
      HashSet var1 = Sets.newHashSet();
      File var2 = new File(this.BatModClient, "assets/");
      if (var2.isDirectory()) {
         for (File var6 : var2.listFiles(DirectoryFileFilter.DIRECTORY)) {
            String var7 = BatModClient(var2, var6);
            if (!var7.equals(var7.toLowerCase())) {
               this.CustomSpinner(var7);
            } else {
               var1.add(var7.substring(0, var7.length() - 1));
            }
         }
      }

      return var1;
   }
}
