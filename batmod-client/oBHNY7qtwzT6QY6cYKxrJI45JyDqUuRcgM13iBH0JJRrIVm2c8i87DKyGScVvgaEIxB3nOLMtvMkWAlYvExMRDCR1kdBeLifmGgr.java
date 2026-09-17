import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.hash.Hashing;
import com.google.common.io.Files;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.apache.commons.io.filefilter.IOFileFilter;
import org.apache.commons.io.filefilter.TrueFileFilter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CbObeQLYxAMWk6v1eXx4q28XmeQdfaLSGr1rGnk8ScyDNMMgaCRkwLn7YXWVobebhmaxTZYYKtmgVqEcxaJ9nbSLRHK2OCEyP2Wr {
   private static final Logger CustomSpinner = LogManager.getLogger();
   private static final FileFilter ButtonAction = new HIlu0e4ZGdXoB2VecJiW5mFNWj2u94CxmgypBW626qWrf9ycF6fQXkKdfQhPhMF3GEnFDYICuEiTmN4EuqsrOtVwYe565ymqWkjg();
   private final File Spinner;
   public final oBHNY7qtwzT6QY6cYKxrJI45JyDqUuRcgM13iBH0JJRrIVm2c8i87DKyGScVvgaEIxB3nOLMtvMkWAlYvExMRDCR1kdBeLifmGgr BatModClient;
   private final File Checkbox;
   public final hATkAPBwIEPgHXsrwb7k44D34FW1bnEFH7O4aBRGY7io2TGG25TrsxUBfJ7r19aEdz8OY9YsEo0k3qy708yrnzBepBehO1GnNXUo Button;
   private oBHNY7qtwzT6QY6cYKxrJI45JyDqUuRcgM13iBH0JJRrIVm2c8i87DKyGScVvgaEIxB3nOLMtvMkWAlYvExMRDCR1kdBeLifmGgr ProgressBar;
   private final ReentrantLock BatModProgressBar = new ReentrantLock();
   private ListenableFuture ColorChooser;
   private List IntegerSpinner = Lists.newArrayList();
   private List TextField = Lists.newArrayList();

   public CbObeQLYxAMWk6v1eXx4q28XmeQdfaLSGr1rGnk8ScyDNMMgaCRkwLn7YXWVobebhmaxTZYYKtmgVqEcxaJ9nbSLRHK2OCEyP2Wr(
      File var1,
      File var2,
      oBHNY7qtwzT6QY6cYKxrJI45JyDqUuRcgM13iBH0JJRrIVm2c8i87DKyGScVvgaEIxB3nOLMtvMkWAlYvExMRDCR1kdBeLifmGgr var3,
      hATkAPBwIEPgHXsrwb7k44D34FW1bnEFH7O4aBRGY7io2TGG25TrsxUBfJ7r19aEdz8OY9YsEo0k3qy708yrnzBepBehO1GnNXUo var4,
      fyZHvAc42MB0Bu0J2ogCjNyWdEgSTnpzdP2jvMzOaPsju8nPffPRDzLwKSnmA6lzZri3iNZGNWrbINOrUPalHNlLqHUVU6Zoy5hx var5
   ) {
      this.Spinner = var1;
      this.Checkbox = var2;
      this.BatModClient = var3;
      this.Button = var4;
      this.ProgressBar();
      this.BatModClient();
      Iterator var6 = var5.TextField.iterator();

      while (var6.hasNext()) {
         String var7 = (String)var6.next();

         for (IhqTPhERQScqyMXGKrf16PRTjoTv0po3O7UO4evEf90EkIBCAnMVcITGjUlqttVjzEk2EFEewk4QrbjmomxC8GqsF8dhU6oiVa42 var9 : this.IntegerSpinner) {
            if (var9.ButtonAction().equals(var7)) {
               if (var9.Checkbox() == 1
                  || var5.ColorTextPane
                     .contains(var9.ButtonAction())) {
                  this.TextField.add(var9);
                  break;
               }

               var6.remove();
               CustomSpinner.warn(
                  "Removed selected resource pack {} because it's no longer compatible",
                  new Object[]{var9.ButtonAction()}
               );
            }
         }
      }
   }

   private void ProgressBar() {
      if (this.Spinner.exists()) {
         if (!this.Spinner.isDirectory()
            && (
               !this.Spinner.delete()
                  || !this.Spinner.mkdirs()
            )) {
            CustomSpinner.warn(
               "Unable to recreate resourcepack folder, it exists but is not a directory: "
                  + this.Spinner
            );
         }
      } else if (!this.Spinner.mkdirs()) {
         CustomSpinner.warn(
            "Unable to create resourcepack folder: "
               + this.Spinner
         );
      }
   }

   private List BatModProgressBar() {
      return this.Spinner.isDirectory()
         ? Arrays.asList(
            this.Spinner
               .listFiles(ButtonAction)
         )
         : Collections.emptyList();
   }

   public void BatModClient() {
      ArrayList var1 = Lists.newArrayList();

      for (File var3 : this.BatModProgressBar()) {
         IhqTPhERQScqyMXGKrf16PRTjoTv0po3O7UO4evEf90EkIBCAnMVcITGjUlqttVjzEk2EFEewk4QrbjmomxC8GqsF8dhU6oiVa42 var4 = new IhqTPhERQScqyMXGKrf16PRTjoTv0po3O7UO4evEf90EkIBCAnMVcITGjUlqttVjzEk2EFEewk4QrbjmomxC8GqsF8dhU6oiVa42(
            this, var3, null
         );
         if (!this.IntegerSpinner.contains(var4)) {
            try {
               var4.BatModClient();
               var1.add(var4);
            } catch (Exception var6) {
               var1.remove(var4);
            }
         } else {
            int var5 = this.IntegerSpinner.indexOf(var4);
            if (var5 > -1 && var5 < this.IntegerSpinner.size()) {
               var1.add(this.IntegerSpinner.get(var5));
            }
         }
      }

      this.IntegerSpinner.removeAll(var1);

      for (IhqTPhERQScqyMXGKrf16PRTjoTv0po3O7UO4evEf90EkIBCAnMVcITGjUlqttVjzEk2EFEewk4QrbjmomxC8GqsF8dhU6oiVa42 var8 : this.IntegerSpinner) {
         var8.Button();
      }

      this.IntegerSpinner = var1;
   }

   public List Button() {
      return ImmutableList.copyOf(this.IntegerSpinner);
   }

   public List CustomSpinner() {
      return ImmutableList.copyOf(this.TextField);
   }

   public void BatModClient(List var1) {
      this.TextField.clear();
      this.TextField.addAll(var1);
   }

   public File ButtonAction() {
      return this.Spinner;
   }

   public ListenableFuture BatModClient(String var1, String var2) {
      String var3;
      if (var2.matches("^[a-f0-9]{40}$")) {
         var3 = var2;
      } else {
         var3 = "legacy";
      }

      File var4 = new File(this.Checkbox, var3);
      this.BatModProgressBar.lock();

      try {
         this.Checkbox();
         if (var4.exists() && var2.length() == 40) {
            try {
               String var5 = Hashing.sha1().hashBytes(Files.toByteArray(var4)).toString();
               if (var5.equals(var2)) {
                  return this.BatModClient(var4);
               }

               CustomSpinner.warn(
                  "File " + var4 + " had wrong hash (expected " + var2 + ", found " + var5 + "). Deleting it."
               );
               FileUtils.deleteQuietly(var4);
            } catch (IOException var14) {
               CustomSpinner.warn(
                  "File " + var4 + " couldn't be hashed. Deleting it.", var14
               );
               FileUtils.deleteQuietly(var4);
            }
         }

         this.ColorChooser();
         A4y4i4lXgsjv0asZWzjsWEfjd81nkUr5sxIbXj1hNNmDbx2HG58KM0mHLrBi8vt5oYlRqcpBdxsk42W2TKtBeqQx0K47HtadIMpH var16 = new A4y4i4lXgsjv0asZWzjsWEfjd81nkUr5sxIbXj1hNNmDbx2HG58KM0mHLrBi8vt5oYlRqcpBdxsk42W2TKtBeqQx0K47HtadIMpH();
         Map var6 = AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB.GTTFIpW7LKqGKoWGA47cvb3R5ReJdfyazRf94cakcY1SpiFs1VSJHig8p3R2L4mCl8t4FvUCnwW4eVIoXQeKbwTt7D90bMhTto7W();
         AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB var7 = AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB.BatModJson();
         Futures.getUnchecked(
            var7.BatModClient(
               new S3mwu7RHQlLJGEdCv4n9kMRXOi1jABc0OTFfCifRkiwEYpiJMQj0YG1HCJ6lxGSa4UWoPru70OcA8STMe8QAfSzmJgQ9NvQlhKgD(this, var7, var16)
            )
         );
         SettableFuture var8 = SettableFuture.create();
         this.ColorChooser = f6mn9nlOp6AKSViY5CgMqQ4l78WWuF4U2S0ofUUtCyy1JlWFSvtEEgxUOBfG7I2A3SM5V3LNgPBYDUE7Qg8egajPYM5ZEYm3KE4s.BatModClient(
            var4, var1, var6, 52428800, var16, var7.WkHLtxh0OBE988n6Z0s69VckSEH7sjJ2sJEkoBxEnB9TRCVCnrzX8qoWr1JeSS1QxNVIPsIB8QiJnFqynvUoIajlh0Sg8n21w13o()
         );
         Futures.addCallback(
            this.ColorChooser,
            new uxgHDcIBxH79jIkWHiKLqm9BWrKc3y5hiNKrHJPHLD3i1iPzSWhyyQrD5tDzaKc06K3DWjUyygPYQSUOYRIpt6MjaBLkWp3iSbLI(this, var4, var8)
         );
         return this.ColorChooser;
      } finally {
         this.BatModProgressBar.unlock();
      }
   }

   private void ColorChooser() {
      ArrayList var1 = Lists.newArrayList(
         FileUtils.listFiles(
            this.Checkbox, TrueFileFilter.TRUE, (IOFileFilter)null
         )
      );
      Collections.sort(var1, LastModifiedFileComparator.LASTMODIFIED_REVERSE);
      int var2 = 0;

      for (File var4 : var1) {
         if (var2++ >= 10) {
            CustomSpinner.info(
               "Deleting old server resource pack " + var4.getName()
            );
            FileUtils.deleteQuietly(var4);
         }
      }
   }

   public ListenableFuture BatModClient(File var1) {
      this.ProgressBar = new ItN1cMqdJeivCsmK87oPOwZabWOFhxkRiyzC8ue52xVWbF5JIKy8g8HCphMDyXaGA4GJ1jtx5i19Y7S9fUJtkcUwOQf2Khp7cet(
         var1
      );
      return AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB.BatModJson()
         .z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP();
   }

   public oBHNY7qtwzT6QY6cYKxrJI45JyDqUuRcgM13iBH0JJRrIVm2c8i87DKyGScVvgaEIxB3nOLMtvMkWAlYvExMRDCR1kdBeLifmGgr Spinner() {
      return this.ProgressBar;
   }

   public void Checkbox() {
      this.BatModProgressBar.lock();

      try {
         if (this.ColorChooser != null) {
            this.ColorChooser.cancel(true);
         }

         this.ColorChooser = null;
         if (this.ProgressBar != null) {
            this.ProgressBar = null;
            AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB.BatModJson()
               .z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP();
         }
      } finally {
         this.BatModProgressBar.unlock();
      }
   }
}
