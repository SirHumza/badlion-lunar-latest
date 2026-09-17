import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class hATkAPBwIEPgHXsrwb7k44D34FW1bnEFH7O4aBRGY7io2TGG25TrsxUBfJ7r19aEdz8OY9YsEo0k3qy708yrnzBepBehO1GnNXUo {
   private final MIhWEF0Lmu8kDXveHvHNGS6xXNmLbQ5tjSM7NVwSiEnKHSAiP2xxi3lLXjXjqCrcMwicGQBy2oEg2vFgNCvcmVnOAd8JCgS95Gj BatModClient = new kIEmAXkGWrKa6WgAaD9RdUxNmBgFErVhqQxlhumSQcw69apmdFXdlXgb4cDsQ09Z872QbEqnhZQ8kH3N4EizIv89IiQWvxa1HJm3();
   private final GsonBuilder Button = new GsonBuilder();
   private Gson CustomSpinner;

   public hATkAPBwIEPgHXsrwb7k44D34FW1bnEFH7O4aBRGY7io2TGG25TrsxUBfJ7r19aEdz8OY9YsEo0k3qy708yrnzBepBehO1GnNXUo() {
      this.Button
         .registerTypeHierarchyAdapter(
            WeTqa0g0NbkXZOZDrvSeeDCHHN7RPZ9gR2j4c4e9IpymEt17UQor6B2FDPaiPIcNX5cuF15DrhMPMyE1uzL2mO8ZpMjwpJby4mVY.class,
            new nMK8kAcK1E9JGdO8NcNynr3pQa53houHGTxyYWhful1qkKBREVWm9tMddCyyPojSsrXSOoQhgceK0oqnECW6Gh5SeiFl65AYu3z()
         );
      this.Button
         .registerTypeHierarchyAdapter(
            yl0mZb2L6LsYutskbvdy92R5O0ucwqxLdFRSY88HQHekYrPd9yTOSLXzu590OIVgg9Qk21zwAmAaGRt3c1ubj2k0ZmcBHYGMFHag.class,
            new dC1BoUgIRnR8qMJBM3U4h5lxS0BqwdejxLTrOmDndzyHvpGvHaBU40Jft4sMSmq0rn852ge3hCS9fOFLqzjz1npDVZnBXnVJJF4r()
         );
      this.Button
         .registerTypeAdapterFactory(new pirT6lL2sekWRlDOCL8eRehsXt1QNyEERj9G5VDRk0Of26YX5yBKEDklQFIoyMfHszZu26zc4rUmobmy6xvPwLBl8ocI4JJfaOX());
   }

   public void BatModClient(
      FvPq29CDmswBf6FvbtcGw4E7SR7LTT1pP1xpQjDcmQ3aEzqsYLL8a72AL6zqsE10UQ3WOVX55HSdLk9YS5x9IXBq9SoKR2uo3OQk var1, Class var2
   ) {
      this.BatModClient
         .BatModClient(
            var1.BatModClient(),
            new A8B9xaYRO968NIJylpYkFWjcdmEHUTZrMkyeuTA9Y8Mg17uyZxVwCJQdmVePezhyUPfT9AfCmSOosnItYQGRAgllujaM23l2U2(this, var1, var2, null)
         );
      this.Button.registerTypeAdapter(var2, var1);
      this.CustomSpinner = null;
   }

   public GKI8hVOzlNyTWBE7bhZIrn2kF90Q758qOVw6oCRRarchKn8TiaLdjZ9TCLbrOdHUcZMCBruBW4WnovdJZ15K1VWTYIon2hPtWlJr BatModClient(
      String var1, JsonObject var2
   ) {
      if (var1 == null) {
         throw new IllegalArgumentException("Metadata section name cannot be null");
      } else if (!var2.has(var1)) {
         return (GKI8hVOzlNyTWBE7bhZIrn2kF90Q758qOVw6oCRRarchKn8TiaLdjZ9TCLbrOdHUcZMCBruBW4WnovdJZ15K1VWTYIon2hPtWlJr)null;
      } else if (!var2.get(var1).isJsonObject()) {
         throw new IllegalArgumentException("Invalid metadata for '" + var1 + "' - expected object, found " + var2.get(var1));
      } else {
         A8B9xaYRO968NIJylpYkFWjcdmEHUTZrMkyeuTA9Y8Mg17uyZxVwCJQdmVePezhyUPfT9AfCmSOosnItYQGRAgllujaM23l2U2 var3 = (A8B9xaYRO968NIJylpYkFWjcdmEHUTZrMkyeuTA9Y8Mg17uyZxVwCJQdmVePezhyUPfT9AfCmSOosnItYQGRAgllujaM23l2U2)this.BatModClient
            .BatModClient(var1);
         if (var3 == null) {
            throw new IllegalArgumentException("Don't know how to handle metadata section '" + var1 + "'");
         } else {
            return (GKI8hVOzlNyTWBE7bhZIrn2kF90Q758qOVw6oCRRarchKn8TiaLdjZ9TCLbrOdHUcZMCBruBW4WnovdJZ15K1VWTYIon2hPtWlJr)this.BatModClient()
               .fromJson(var2.getAsJsonObject(var1), var3.Button);
         }
      }
   }

   private Gson BatModClient() {
      if (this.CustomSpinner == null) {
         this.CustomSpinner = this.Button
            .create();
      }

      return this.CustomSpinner;
   }
}
