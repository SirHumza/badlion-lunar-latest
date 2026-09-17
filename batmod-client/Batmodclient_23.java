import com.google.common.collect.Lists;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class S6FSn2L54EBuvX6exPqOhflciIRHEuLfzQBVDVHsosfozmUeCxyTH2gNCXwr2XUtlWi3EZtqsL8ZzPJiYSqCdsk6cCJD4MFYYtlr {
   private String BatModClient = null;
   private final List Button = Lists.newArrayList();

   private S6FSn2L54EBuvX6exPqOhflciIRHEuLfzQBVDVHsosfozmUeCxyTH2gNCXwr2XUtlWi3EZtqsL8ZzPJiYSqCdsk6cCJD4MFYYtlr() {
   }

   private void BatModClient(String var1) {
      this.Button.add(0, var1);
   }

   public String BatModClient() {
      return StringUtils.join(this.Button, "->");
   }

   @Override
   public String toString() {
      return this.BatModClient != null
         ? (
            !this.Button.isEmpty()
               ? this.BatModClient
                  + " "
                  + this.BatModClient()
               : this.BatModClient
         )
         : (
            !this.Button.isEmpty()
               ? "(Unknown file) " + this.BatModClient()
               : "(Unknown file)"
         );
   }
}
