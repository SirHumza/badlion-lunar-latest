import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

public class m9JRNjxWC3aYJk4q2LLXe6nvUPWhYO2B2z1PGWi8Z5GbXnDxgheGkZDPQQ5OBPkvHuPppeHxtEWFQJsXI3a2UkBmWOwpYu3C6Jib
   implements NEmPB154kcO19F3l5OQqjm6KzKQbkajeXLwesiQhxza0JYWNCESSF2uxzLKmAFwvTXzHkJbACLTfiktKVORXvwxyQT0wy09YNWkZ {
   protected final nLK7ggr72JCMQAkNhlEZI1loJkpbLeNtbvky2vwkTBBwzYOIDypvHnBT7HlGQKJlFC4smVv14MzvvHNuiQ2ntsWFYuxyYaPA3iI8 BatModClient;
   protected final CompletableFuture Button = new CompletableFuture();
   private final Set CustomSpinner;
   private final int ButtonAction;
   private int Spinner;
   private int Checkbox;
   private final AtomicInteger ProgressBar = new AtomicInteger();
   private final AtomicInteger BatModProgressBar = new AtomicInteger();
   private boolean ColorChooser;

   public static m9JRNjxWC3aYJk4q2LLXe6nvUPWhYO2B2z1PGWi8Z5GbXnDxgheGkZDPQQ5OBPkvHuPppeHxtEWFQJsXI3a2UkBmWOwpYu3C6Jib BatModClient(
      UEVgBvjcwKiajcM2JSXRvFQN8BzL5Er8ihG7qgCwgJy1YcKeyTwvg1L7XBFnGdxBxGl3fu1mzIQxDaUSwcXDVtsBviEV2nUbsPF4 var0, List var1, CompletableFuture var2
   ) {
      return new m9JRNjxWC3aYJk4q2LLXe6nvUPWhYO2B2z1PGWi8Z5GbXnDxgheGkZDPQQ5OBPkvHuPppeHxtEWFQJsXI3a2UkBmWOwpYu3C6Jib(
         uLbWaHoMNVfJWYaIXcAgF7c5PZFBGWXJ31hS7tuu5lkYxoszlvaIsZL1PiM0drXyHOnWCCT4Nfexg4LZWipIv4epRhMtHlXTb5Zy.Spinner(),
         var0,
         var1,
         (var0x, var1x, var2x, var3, var4) -> var2x.BatModClient(
            var0x, var1x, var3
         ),
         var2
      );
   }

   public m9JRNjxWC3aYJk4q2LLXe6nvUPWhYO2B2z1PGWi8Z5GbXnDxgheGkZDPQQ5OBPkvHuPppeHxtEWFQJsXI3a2UkBmWOwpYu3C6Jib(
      Executor var1,
      UEVgBvjcwKiajcM2JSXRvFQN8BzL5Er8ihG7qgCwgJy1YcKeyTwvg1L7XBFnGdxBxGl3fu1mzIQxDaUSwcXDVtsBviEV2nUbsPF4 var2,
      List var3,
      z7Z3NB9soF3EVgzvj9h1dVqSoe47wNpwQ3694lBxmqmJ9wtrHJllS3K97fbeCHesaEUkGBkeV4DX9YtEh6N4eaFXXDfH8ThfNMdP var4,
      CompletableFuture var5
   ) {
      this.BatModClient = var2;
      this.ButtonAction = var3.size();
      this.ProgressBar.incrementAndGet();
      var5.thenRun(this.BatModProgressBar::incrementAndGet);
      ArrayList var6 = Lists.newArrayList();
      CompletableFuture var7 = var5;
      this.CustomSpinner = Sets.newHashSet(var3);

      for (UpOyfyeXZqewS5PEJ48JnLscDTm7T3LJT7LHWvMLv6WPVGmjLpXQ5krYrpDWA8OP3PRbTXxGDdiHEai3cbf7EO5TvGQsYtoCV4V5 var9 : var3) {
         CompletableFuture var10 = var7;
         CompletableFuture var11 = var4.create(
            new A9NyoDBS9UZqc2juO8MA8WGagO1FFghwHLKxrgaNaqkoD0TUskVVNRtTNJRpPb5d2IudCi84sulfZP4YiOyIsoca8hOJuzJJl2(this, var1, var9, var10),
            var2,
            var9,
            var2x -> {
               this.ProgressBar.incrementAndGet();
               var1.execute(() -> {
                  var2x.run();
                  this.BatModProgressBar.incrementAndGet();
               });
            },
            var2x -> {
               this.Spinner++;
               var1.execute(() -> {
                  var2x.run();
                  this.Checkbox++;
               });
            }
         );
         var6.add(var11);
         var7 = var11;
      }
   }

   @Override
   public boolean BatModClient() {
      return this.ColorChooser;
   }

   @Override
   public void BatModClient(boolean var1) {
      this.ColorChooser = var1;
   }

   @Override
   public float Button() {
      int var1 = this.ButtonAction
         - this.CustomSpinner.size();
      float var2 = this.BatModProgressBar.get() * 2
         + this.Checkbox * 2
         + var1;
      float var3 = this.ProgressBar.get() * 2
         + this.Spinner * 2
         + this.ButtonAction;
      return var2 / var3;
   }

   @Override
   public boolean CustomSpinner() {
      return this.Button.isDone();
   }
}
