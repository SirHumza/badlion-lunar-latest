package net.minecraft.client.renderer;

import com.google.common.primitives.Floats;
import java.util.Comparator;

class H5AfuPi6A5dR1CMugDXgAoLQyJOF06VOkDTd7xZhA4PQTQa65SGEWInSjIFDT4he5MqClJs80ceNMzYDIqSK0srjcdqq9co84vr implements Comparator {
   final float[] BatModClient;
   final net.minecraft.client.renderer.ujUvuz4WyO6KoH1kqyAYetKlhzPeqhJYrlcw4WEnxC5xzhepgcfvLGNVE3iaZoqsbxiWt1wSduLhMcgeZzoiKvZye9DJRdI2yr82 Button;

   H5AfuPi6A5dR1CMugDXgAoLQyJOF06VOkDTd7xZhA4PQTQa65SGEWInSjIFDT4he5MqClJs80ceNMzYDIqSK0srjcdqq9co84vr(
      net.minecraft.client.renderer.ujUvuz4WyO6KoH1kqyAYetKlhzPeqhJYrlcw4WEnxC5xzhepgcfvLGNVE3iaZoqsbxiWt1wSduLhMcgeZzoiKvZye9DJRdI2yr82 var1, float[] var2
   ) {
      this.Button = var1;
      this.BatModClient = var2;
   }

   public int BatModClient(Integer var1, Integer var2) {
      return Floats.compare(
         this.BatModClient[var2],
         this.BatModClient[var1]
      );
   }

   @Override
   public int compare(Object var1, Object var2) {
      return this.BatModClient((Integer)var1, (Integer)var2);
   }
}
