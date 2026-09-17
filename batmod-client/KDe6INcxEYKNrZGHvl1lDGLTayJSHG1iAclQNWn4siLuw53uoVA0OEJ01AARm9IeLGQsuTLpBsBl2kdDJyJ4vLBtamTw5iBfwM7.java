import com.google.common.collect.HashMultimap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class KDe6INcxEYKNrZGHvl1lDGLTayJSHG1iAclQNWn4siLuw53uoVA0OEJ01AARm9IeLGQsuTLpBsBl2kdDJyJ4vLBtamTw5iBfwM7 {
   private HashMultimap BatModClient;
   private YO7NWhkMEs26GWxR0q5bIKbXkMOQDIYZ8jdKlWNrIFfzPk4j1o1GI2eIIeGJxtdmxUVwcMMMBnevAdYbwuILDpk3CFsgHZHkdyCf Button;

   public KDe6INcxEYKNrZGHvl1lDGLTayJSHG1iAclQNWn4siLuw53uoVA0OEJ01AARm9IeLGQsuTLpBsBl2kdDJyJ4vLBtamTw5iBfwM7(
      LTQwE0DrNKFDjmvx0fe8LpzggEMbyrNsjGxF9MSkTuiCRDJkRIuJ7MTRryUkPshBnTbPg4NTBAjHSn2k3rTwfLgb6HE9s7OE5rZP var1, HashMultimap var2
   ) {
      this.BatModClient = var2;
      int var3 = 0;
      LTQwE0DrNKFDjmvx0fe8LpzggEMbyrNsjGxF9MSkTuiCRDJkRIuJ7MTRryUkPshBnTbPg4NTBAjHSn2k3rTwfLgb6HE9s7OE5rZP var4 = null;
      VuBHKpL8HD24blvyQeU8yXcbGyxW64reqNqPzuPffAuFuCn5pFfYH6OE0Vw1vcG4wwKAEo6bdPfya6LTElkzp3EzlUKHQvBNGbe var5 = null;

      for (Entry var7 : var2.entries()) {
         for (Entry var9 : ((Map)var7.getValue()).entrySet()) {
            if ((Integer)var9.getValue() > var3) {
               var3 = (Integer)var9.getValue();
               var4 = (LTQwE0DrNKFDjmvx0fe8LpzggEMbyrNsjGxF9MSkTuiCRDJkRIuJ7MTRryUkPshBnTbPg4NTBAjHSn2k3rTwfLgb6HE9s7OE5rZP)var7.getKey();
               var5 = (VuBHKpL8HD24blvyQeU8yXcbGyxW64reqNqPzuPffAuFuCn5pFfYH6OE0Vw1vcG4wwKAEo6bdPfya6LTElkzp3EzlUKHQvBNGbe)var9.getKey();
            }
         }
      }

      if (var4 != null && var5 != null) {
         this.Button = new YO7NWhkMEs26GWxR0q5bIKbXkMOQDIYZ8jdKlWNrIFfzPk4j1o1GI2eIIeGJxtdmxUVwcMMMBnevAdYbwuILDpk3CFsgHZHkdyCf(
            var4,
            var5,
            var1.BatModInstallerMain()
               - var4.BatModInstallerMain(),
            var1.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA()
               - var4.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA()
         );
      }
   }

   public List BatModClient() {
      ArrayList var1 = new ArrayList();

      for (Map var3 : this.BatModClient.values()) {
         var1.addAll(var3.keySet());
      }

      return var1;
   }

   public YO7NWhkMEs26GWxR0q5bIKbXkMOQDIYZ8jdKlWNrIFfzPk4j1o1GI2eIIeGJxtdmxUVwcMMMBnevAdYbwuILDpk3CFsgHZHkdyCf Button() {
      return this.Button;
   }

   public boolean CustomSpinner() {
      return this.BatModClient()
         .stream()
         .anyMatch(
            var0 -> var0
               == VuBHKpL8HD24blvyQeU8yXcbGyxW64reqNqPzuPffAuFuCn5pFfYH6OE0Vw1vcG4wwKAEo6bdPfya6LTElkzp3EzlUKHQvBNGbe.BatModClient
         );
   }

   public boolean ButtonAction() {
      return this.BatModClient()
         .stream()
         .anyMatch(
            var0 -> var0
               == VuBHKpL8HD24blvyQeU8yXcbGyxW64reqNqPzuPffAuFuCn5pFfYH6OE0Vw1vcG4wwKAEo6bdPfya6LTElkzp3EzlUKHQvBNGbe.Button
         );
   }

   public boolean Spinner() {
      return this.BatModClient()
         .stream()
         .anyMatch(
            var0 -> var0
               == VuBHKpL8HD24blvyQeU8yXcbGyxW64reqNqPzuPffAuFuCn5pFfYH6OE0Vw1vcG4wwKAEo6bdPfya6LTElkzp3EzlUKHQvBNGbe.CustomSpinner
         );
   }

   public boolean Checkbox() {
      return this.BatModClient()
         .stream()
         .anyMatch(
            var0 -> var0
               == VuBHKpL8HD24blvyQeU8yXcbGyxW64reqNqPzuPffAuFuCn5pFfYH6OE0Vw1vcG4wwKAEo6bdPfya6LTElkzp3EzlUKHQvBNGbe.ButtonAction
         );
   }
}
