import com.mojang.realmsclient.gui.ChatFormatting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E9FnR5p0ebmCMjr9gvrr4LsoQMw9pTyIKGUBB27Wvs7bVIy2iFra5NJU5C4VLO6qyVTLtsUuHQT7GrSb1Kv0ocJbAWplb1tQ8zvb
   extends kX7CE3LXbiFNkVJzBSuFkmvyirzHbtbPlI1aLDvbj4Wz8ez2PvMpuuqAB4M3fbcNcp4yzxe5r5TXEPEQgVjE53BCNwsXyoNcJDq {
   private List BatModClient = new ArrayList();
   private int Button = -1;

   public E9FnR5p0ebmCMjr9gvrr4LsoQMw9pTyIKGUBB27Wvs7bVIy2iFra5NJU5C4VLO6qyVTLtsUuHQT7GrSb1Kv0ocJbAWplb1tQ8zvb(
      AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6
   ) {
      super(var1, var2, var3, var4, var5, var6);
      nuWP3Bei4rUZ6VCX2iWCHlHKiAsicTC9Ae69Jpwv4oZQMYPCTjiB0SikRnqAxZeaL93OS1vPuNC116DLDmI1tI2KbykrrH2Hg5n.BatModClient(
         BatModClient.Button
            ? "http://localhost:8080/changelog"
            : "https://api.batmod.com/changelog",
         var1x -> {
            this.BatModClient.addAll(Arrays.asList(var1x.split("\n")));
            gIBRYSDE1aamwqBz5AM6JAtjQqwtTRlJsgbKnm4fFuKKDYykiaZiAZ1kT1QZRi6pcOVBLOt0i8O6ht4cdm0L95Z3vwWTCjPJhbLK var2x = BatModClient.BatModClient()
               .G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr();
            if (!this.BatModClient.isEmpty()
               && !var2x.Button
                  .equals(
                     ChatFormatting.stripFormatting(
                        (String)this.BatModClient.get(0)
                     )
                  )) {
               var2x.Button = ChatFormatting.stripFormatting(
                  (String)this.BatModClient.get(0)
               );
               var2x.Button();
            }
         }
      );
   }

   @Override
   public jiMAhQFkQYurAFgHZJFvHozQV7c7qsHvZck7kgMJTlsxdUm85bAQ4scqw5nGMgbBVNsUddbkQxqm3dSae3RXtMSyewWa4gFB8AK BatModClient(
      int var1
   ) {
      return new wX3R7BkV4rlSinjJGAkKzn2yEOJbq8aj8GAK5ELavlGRCoE6oBVtZlLxNm4q45YujY9xSJNINuti8I7BNZobS1sk7Ejc0kAcjA68(this);
   }

   @Override
   protected int BatModClient() {
      return this.BatModClient.size() + 1;
   }

   public void Button(int var1) {
      this.Button = var1;
   }

   @Override
   protected boolean CustomSpinner(int var1) {
      return var1 == this.Button;
   }

   public int b_() {
      return this.Button;
   }

   @Override
   protected int CustomSpinner() {
      return super.CustomSpinner() + 60;
   }

   @Override
   public int ButtonAction() {
      return super.ButtonAction() + 85 + 50;
   }
}
