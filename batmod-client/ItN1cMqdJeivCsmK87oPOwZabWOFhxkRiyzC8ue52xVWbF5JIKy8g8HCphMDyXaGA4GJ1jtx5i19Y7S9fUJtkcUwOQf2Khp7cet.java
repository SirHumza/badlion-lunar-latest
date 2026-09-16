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
   public static final Splitter BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW = Splitter.on('/')
      .omitEmptyStrings()
      .limit(3);
   private ZipFile vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5;

   public ItN1cMqdJeivCsmK87oPOwZabWOFhxkRiyzC8ue52xVWbF5JIKy8g8HCphMDyXaGA4GJ1jtx5i19Y7S9fUJtkcUwOQf2Khp7cet(File var1) {
      super(var1);
   }

   private ZipFile PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u() {
      if (this.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5 == null) {
         this.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5 = new ZipFile(
            this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I
         );
      }

      return this.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5;
   }

   @Override
   protected InputStream Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(String var1) {
      ZipFile var2 = this.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u();
      ZipEntry var3 = var2.getEntry(var1);
      if (var3 == null) {
         throw new RsDO8adnfOPNY9KKQQyVM7fj6ZdVeqDUui5sCpfuO6bq4v38rXgqlST1ulHDJIMiRYk791misFcP1LzQrmi5AK1Z52gG8dZUmQgw(
            this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I, var1
         );
      } else {
         return var2.getInputStream(var3);
      }
   }

   @Override
   public boolean BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(String var1) {
      try {
         return this.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u().getEntry(var1) != null;
      } catch (IOException var3) {
         return false;
      }
   }

   @Override
   public Set vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5() {
      ZipFile var1;
      try {
         var1 = this.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u();
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
               BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW.split(var5)
            );
            if (var6.size() > 1) {
               String var7 = (String)var6.get(1);
               if (!var7.equals(var7.toLowerCase())) {
                  this.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(var7);
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
      if (this.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5 != null) {
         this.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5.close();
         this.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5 = null;
      }
   }
}
