import io.netty.util.internal.ThreadLocalRandom;
import java.util.UUID;
import org.apache.commons.lang3.Validate;

public class kT9lV1jpqd4tlAa84NGN5SIufoeuYrV5ZEfW1Ufa8hmBzd1H18bErxZEzA0wbbBss101fGCqNdkhXHetWVg7ALC7bFPIiaRWKKR7 {
   private final double BatModClient;
   private final int Button;
   private final String CustomSpinner;
   private final UUID ButtonAction;
   private boolean Spinner = true;

   public kT9lV1jpqd4tlAa84NGN5SIufoeuYrV5ZEfW1Ufa8hmBzd1H18bErxZEzA0wbbBss101fGCqNdkhXHetWVg7ALC7bFPIiaRWKKR7(String var1, double var2, int var4) {
      this(
         u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BatModClient(
            ThreadLocalRandom.current()
         ),
         var1,
         var2,
         var4
      );
   }

   public kT9lV1jpqd4tlAa84NGN5SIufoeuYrV5ZEfW1Ufa8hmBzd1H18bErxZEzA0wbbBss101fGCqNdkhXHetWVg7ALC7bFPIiaRWKKR7(UUID var1, String var2, double var3, int var5) {
      this.ButtonAction = var1;
      this.CustomSpinner = var2;
      this.BatModClient = var3;
      this.Button = var5;
      Validate.notEmpty(var2, "Modifier name cannot be empty", new Object[0]);
      Validate.inclusiveBetween(0L, 2L, var5, "Invalid operation");
   }

   public UUID BatModClient() {
      return this.ButtonAction;
   }

   public String Button() {
      return this.CustomSpinner;
   }

   public int CustomSpinner() {
      return this.Button;
   }

   public double ButtonAction() {
      return this.BatModClient;
   }

   public boolean Spinner() {
      return this.Spinner;
   }

   public kT9lV1jpqd4tlAa84NGN5SIufoeuYrV5ZEfW1Ufa8hmBzd1H18bErxZEzA0wbbBss101fGCqNdkhXHetWVg7ALC7bFPIiaRWKKR7 BatModClient(
      boolean var1
   ) {
      this.Spinner = var1;
      return this;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (var1 != null && this.getClass() == var1.getClass()) {
         kT9lV1jpqd4tlAa84NGN5SIufoeuYrV5ZEfW1Ufa8hmBzd1H18bErxZEzA0wbbBss101fGCqNdkhXHetWVg7ALC7bFPIiaRWKKR7 var2 = (kT9lV1jpqd4tlAa84NGN5SIufoeuYrV5ZEfW1Ufa8hmBzd1H18bErxZEzA0wbbBss101fGCqNdkhXHetWVg7ALC7bFPIiaRWKKR7)var1;
         if (this.ButtonAction != null) {
            if (!this.ButtonAction
               .equals(var2.ButtonAction)) {
               return false;
            }
         } else if (var2.ButtonAction != null) {
            return false;
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.ButtonAction != null
         ? this.ButtonAction.hashCode()
         : 0;
   }

   @Override
   public String toString() {
      return "AttributeModifier{amount="
         + this.BatModClient
         + ", operation="
         + this.Button
         + ", name='"
         + this.CustomSpinner
         + '\''
         + ", id="
         + this.ButtonAction
         + ", serialize="
         + this.Spinner
         + '}';
   }
}
