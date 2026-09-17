import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import java.util.List;

final class Ep15XhQj3RnhxVJYMeqMfYxRvQ25ip7fKZW5PiwCfhJw2foSPJZgTOi7BglTPkkf9HBFPcRN7kOpKU4abS22qwvBvz1AhCWjjR75 implements ProfileLookupCallback {
   Ep15XhQj3RnhxVJYMeqMfYxRvQ25ip7fKZW5PiwCfhJw2foSPJZgTOi7BglTPkkf9HBFPcRN7kOpKU4abS22qwvBvz1AhCWjjR75(
      TDI1rwhE6ftgpT0jnIkLxDzDc0kfx23fe5G5xeWfGWo1r95rLIJvkBpIvia4qynITY7zhShMOxrj3sgpclCo8KBYm5raxCQbPjtD var1, List var2
   ) {
      this.BatModClient = var1;
      this.Button = var2;
   }

   public void onProfileLookupSucceeded(GameProfile var1) {
      this.BatModClient
         .H5AfuPi6A5dR1CMugDXgAoLQyJOF06VOkDTd7xZhA4PQTQa65SGEWInSjIFDT4he5MqClJs80ceNMzYDIqSK0srjcdqq9co84vr()
         .BatModClient(var1);
      this.Button.add(var1);
   }

   public void onProfileLookupFailed(GameProfile var1, Exception var2) {
      GpOXUXjnvrtLXpR4tInHIce4vaM7Cwb247ZzX09h4TDzSSO57BwbJWUH2MiOWEcQbAMINBbNZxOlsEEdArN8IWoS5rh1KdVlUk8.BatModClient()
         .warn("Could not lookup user whitelist entry for " + var1.getName(), var2);
   }
}
