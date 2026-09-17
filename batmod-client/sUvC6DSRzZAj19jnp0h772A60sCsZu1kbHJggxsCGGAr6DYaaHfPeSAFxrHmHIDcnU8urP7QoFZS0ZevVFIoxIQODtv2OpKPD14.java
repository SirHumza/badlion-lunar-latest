public class sUvC6DSRzZAj19jnp0h772A60sCsZu1kbHJggxsCGGAr6DYaaHfPeSAFxrHmHIDcnU8urP7QoFZS0ZevVFIoxIQODtv2OpKPD14 {
   private final it4ImSJ8BhIhaw8NuKj4J7yfinx3vXSb3XmnKbX9xYMrcBe1VYlipxoJbYADROpzTvfHPI57otj4v3YBoqaCBk24SpB76l15slgX BatModClient;
   private final String Button;

   public sUvC6DSRzZAj19jnp0h772A60sCsZu1kbHJggxsCGGAr6DYaaHfPeSAFxrHmHIDcnU8urP7QoFZS0ZevVFIoxIQODtv2OpKPD14(
      it4ImSJ8BhIhaw8NuKj4J7yfinx3vXSb3XmnKbX9xYMrcBe1VYlipxoJbYADROpzTvfHPI57otj4v3YBoqaCBk24SpB76l15slgX var1, String var2
   ) {
      this.BatModClient = var1;
      this.Button = var2;
   }

   public it4ImSJ8BhIhaw8NuKj4J7yfinx3vXSb3XmnKbX9xYMrcBe1VYlipxoJbYADROpzTvfHPI57otj4v3YBoqaCBk24SpB76l15slgX BatModClient() {
      return this.BatModClient;
   }

   public String Button() {
      return this.Button;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (var1 != null && this.getClass() == var1.getClass()) {
         sUvC6DSRzZAj19jnp0h772A60sCsZu1kbHJggxsCGGAr6DYaaHfPeSAFxrHmHIDcnU8urP7QoFZS0ZevVFIoxIQODtv2OpKPD14 var2 = (sUvC6DSRzZAj19jnp0h772A60sCsZu1kbHJggxsCGGAr6DYaaHfPeSAFxrHmHIDcnU8urP7QoFZS0ZevVFIoxIQODtv2OpKPD14)var1;
         if (this.BatModClient
            != var2.BatModClient) {
            return false;
         }

         if (this.Button != null) {
            if (!this.Button
               .equals(var2.Button)) {
               return false;
            }
         } else if (var2.Button != null) {
            return false;
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return "ClickEvent{action="
         + this.BatModClient
         + ", value='"
         + this.Button
         + '\''
         + '}';
   }

   @Override
   public int hashCode() {
      int var1 = this.BatModClient.hashCode();
      return 31 * var1
         + (
            this.Button != null
               ? this.Button.hashCode()
               : 0
         );
   }
}
