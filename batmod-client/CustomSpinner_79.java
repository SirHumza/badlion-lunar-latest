import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

class A9NyoDBS9UZqc2juO8MA8WGagO1FFghwHLKxrgaNaqkoD0TUskVVNRtTNJRpPb5d2IudCi84sulfZP4YiOyIsoca8hOJuzJJl2
   implements VWdxH0KIAR9p6utwV7JavYaK8LxmL3n0bOtemXdQU9DbdNAJIplIwMrFKqYhON2pGkjXtvkAWoScqyzxN8G5oqmFOWyJuxPTmYfW {
   A9NyoDBS9UZqc2juO8MA8WGagO1FFghwHLKxrgaNaqkoD0TUskVVNRtTNJRpPb5d2IudCi84sulfZP4YiOyIsoca8hOJuzJJl2(
      m9JRNjxWC3aYJk4q2LLXe6nvUPWhYO2B2z1PGWi8Z5GbXnDxgheGkZDPQQ5OBPkvHuPppeHxtEWFQJsXI3a2UkBmWOwpYu3C6Jib var1,
      Executor var2,
      UpOyfyeXZqewS5PEJ48JnLscDTm7T3LJT7LHWvMLv6WPVGmjLpXQ5krYrpDWA8OP3PRbTXxGDdiHEai3cbf7EO5TvGQsYtoCV4V5 var3,
      CompletableFuture var4
   ) {
      this.ButtonAction = var1;
      this.BatModClient = var2;
      this.Button = var3;
      this.CustomSpinner = var4;
   }

   @Override
   public CompletableFuture BatModClient(Object var1) {
      this.BatModClient
         .execute(
            () -> {
               m9JRNjxWC3aYJk4q2LLXe6nvUPWhYO2B2z1PGWi8Z5GbXnDxgheGkZDPQQ5OBPkvHuPppeHxtEWFQJsXI3a2UkBmWOwpYu3C6Jib.BatModClient(
                     this.ButtonAction
                  )
                  .remove(var1x);
               if (m9JRNjxWC3aYJk4q2LLXe6nvUPWhYO2B2z1PGWi8Z5GbXnDxgheGkZDPQQ5OBPkvHuPppeHxtEWFQJsXI3a2UkBmWOwpYu3C6Jib.BatModClient(
                     this.ButtonAction
                  )
                  .isEmpty()) {
                  this.ButtonAction
                     .Button
                     .complete(
                        i3FKIibOVjc8ysCVOye0jIxvLLa89s0N5MO5k0ctGSa5xgSUGZ7T60i8ATgbbmJ0yItfQY0WrQpOE8CUKPSAt77VzBLEYOO5cGCJ.BatModClient
                     );
               }
            }
         );
      return this.ButtonAction
         .Button
         .thenCombine(this.CustomSpinner, (var1x, var2) -> var1);
   }
}
