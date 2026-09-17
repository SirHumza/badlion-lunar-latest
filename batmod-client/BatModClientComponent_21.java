import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.mojang.authlib.Agent;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GpOXUXjnvrtLXpR4tInHIce4vaM7Cwb247ZzX09h4TDzSSO57BwbJWUH2MiOWEcQbAMINBbNZxOlsEEdArN8IWoS5rh1KdVlUk8 {
   private static final Logger Spinner = LogManager.getLogger();
   public static final File BatModClient = new File("banned-ips.txt");
   public static final File Button = new File(
      "banned-players.txt"
   );
   public static final File CustomSpinner = new File("ops.txt");
   public static final File ButtonAction = new File("white-list.txt");

   private static void BatModClient(
      TDI1rwhE6ftgpT0jnIkLxDzDc0kfx23fe5G5xeWfGWo1r95rLIJvkBpIvia4qynITY7zhShMOxrj3sgpclCo8KBYm5raxCQbPjtD var0, Collection var1, ProfileLookupCallback var2
   ) {
      String[] var3 = (String[])Iterators.toArray(
         Iterators.filter(var1.iterator(), new y5TtZtnOM2zjFGAAQ1B9UNTYlqA1v2OvVc6qKJ4HKFXK4fPgE4i3R85PZGvpoH72gcenKkeHGMrcrCqAQ1c6qEOn2Y4ag5ijAtQs()),
         String.class
      );
      if (var0.FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV()) {
         var0.ujUvuz4WyO6KoH1kqyAYetKlhzPeqhJYrlcw4WEnxC5xzhepgcfvLGNVE3iaZoqsbxiWt1wSduLhMcgeZzoiKvZye9DJRdI2yr82()
            .findProfilesByNames(var3, Agent.MINECRAFT, var2);
      } else {
         for (String var7 : var3) {
            UUID var8 = EiOGTpOuNvp5WsKk6jGR2jglsq9JaB2IWjuipLa7gU6vDDYOtqWblwLscEr9nhr3XGEIpYHMHSqPgq2F6xpysdofz60nmyg8x8u.BatModClient(
               new GameProfile((UUID)null, var7)
            );
            GameProfile var9 = new GameProfile(var8, var7);
            var2.onProfileLookupSucceeded(var9);
         }
      }
   }

   public static String BatModClient(String var0) {
      if (!fYyzxc43Zo2emVcwht8CPm0ETgdV28dUGJB2JVM9dxOEMlO5epPhmmPyiItpRydL59TMtC6nOgFWAAj5urqioxwSgQIkRec6J80F.Button(
            var0
         )
         && var0.length() <= 16) {
         TDI1rwhE6ftgpT0jnIkLxDzDc0kfx23fe5G5xeWfGWo1r95rLIJvkBpIvia4qynITY7zhShMOxrj3sgpclCo8KBYm5raxCQbPjtD var1 = TDI1rwhE6ftgpT0jnIkLxDzDc0kfx23fe5G5xeWfGWo1r95rLIJvkBpIvia4qynITY7zhShMOxrj3sgpclCo8KBYm5raxCQbPjtD.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ();
         GameProfile var2 = var1.H5AfuPi6A5dR1CMugDXgAoLQyJOF06VOkDTd7xZhA4PQTQa65SGEWInSjIFDT4he5MqClJs80ceNMzYDIqSK0srjcdqq9co84vr()
            .BatModClient(var0);
         if (var2 != null && var2.getId() != null) {
            return var2.getId().toString();
         } else if (!var1.ww31cPhIzaBGCu7C6N9NLUlcKVAo5KLtAV5pEaRayswjNp6ENrQSkaNKjj9WE47YcT5DbyyiazfM1ex0Mp9CnKjyju3jPzOVeaxV()
            && var1.FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV()) {
            ArrayList var3 = Lists.newArrayList();
            Ep15XhQj3RnhxVJYMeqMfYxRvQ25ip7fKZW5PiwCfhJw2foSPJZgTOi7BglTPkkf9HBFPcRN7kOpKU4abS22qwvBvz1AhCWjjR75 var4 = new Ep15XhQj3RnhxVJYMeqMfYxRvQ25ip7fKZW5PiwCfhJw2foSPJZgTOi7BglTPkkf9HBFPcRN7kOpKU4abS22qwvBvz1AhCWjjR75(
               var1, var3
            );
            BatModClient(
               var1, Lists.newArrayList(new String[]{var0}), var4
            );
            return var3.size() > 0 && ((GameProfile)var3.get(0)).getId() != null ? ((GameProfile)var3.get(0)).getId().toString() : "";
         } else {
            return EiOGTpOuNvp5WsKk6jGR2jglsq9JaB2IWjuipLa7gU6vDDYOtqWblwLscEr9nhr3XGEIpYHMHSqPgq2F6xpysdofz60nmyg8x8u.BatModClient(
                  new GameProfile((UUID)null, var0)
               )
               .toString();
         }
      } else {
         return var0;
      }
   }
}
