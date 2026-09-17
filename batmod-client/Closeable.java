import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class ItN1cMqdJeivCsmK87oPOwZabWOFhxkRiyzC8ue52xVWbF5JIKy8g8HCphMDyXaGA4GJ1jtx5i19Y7S9fUJtkcUwOQf2Khp7cet
   extends js8IhP7JieBz8pRpMyza2AHRscWcsir5ONrBljFoJMl6PtgMlsk34luC3IRado0LemsX3zBSzRCMdozHX5n0pZFPO1B4GZIBv1Rh
   implements Closeable {
   public static final Splitter Button = Splitter.on('/')
      .omitEmptyStrings()
      .limit(3);
   private ZipFile CustomSpinner;

   public ItN1cMqdJeivCsmK87oPOwZabWOFhxkRiyzC8ue52xVWbF5JIKy8g8HCphMDyXaGA4GJ1jtx5i19Y7S9fUJtkcUwOQf2Khp7cet(File var1) {
      super(var1);
   }

   private ZipFile ButtonAction() {
      if (this.CustomSpinner == null) {
         this.CustomSpinner = new ZipFile(
            this.BatModClient
         );
      }

      return this.CustomSpinner;
   }

   @Override
   protected InputStream BatModClient(String var1) {
      ZipFile var2 = this.ButtonAction();
      ZipEntry var3 = var2.getEntry(var1);
      if (var3 == null) {
         throw new RsDO8adnfOPNY9KKQQyVM7fj6ZdVeqDUui5sCpfuO6bq4v38rXgqlST1ulHDJIMiRYk791misFcP1LzQrmi5AK1Z52gG8dZUmQgw(
            this.BatModClient, var1
         );
      } else {
         return var2.getInputStream(var3);
      }
   }

   @Override
   public boolean Button(String var1) {
      try {
         return this.ButtonAction().getEntry(var1) != null;
      } catch (IOException var3) {
         return false;
      }
   }

   @Override
   public Set CustomSpinner() {
      ZipFile var1;
      try {
         var1 = this.ButtonAction();
      } catch (IOException var8) {
         return Collections.emptySet();
      }

      Enumeration var2 = var1.entries();
      HashSet var3 = Sets.newHashSet();

      while (var2.hasMoreElements()) {
         ZipEntry var4 = (ZipEntry)var2.nextElement();
         String var5 = var4.getName();
         if (var5.startsWith("assets/")) {
            ArrayList var6 = Lists.newArrayList(
               Button.split(var5)
            );
            if (var6.size() > 1) {
               String var7 = (String)var6.get(1);
               if (!var7.equals(var7.toLowerCase())) {
                  this.CustomSpinner(var7);
               } else {
                  var3.add(var7);
               }
            }
         }
      }

      return var3;
   }

   @Override
   protected void finalize() {
      this.close();
      super.finalize();
   }

   @Override
   public void close() {
      if (this.CustomSpinner != null) {
         this.CustomSpinner.close();
         this.CustomSpinner = null;
      }
   }
}
