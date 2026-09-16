package com.lunarclient.garden.commission_data;

import com.google.gson.annotations.SerializedName;
import java.util.Map;

public record CommissionData() {
   @SerializedName("visits")
   private final Map<String, Integer> visits;
   @SerializedName("completed")
   private final Map<String, Integer> completed;
   @SerializedName("total_completed")
   private final int totalCompleted;
   @SerializedName("unique_npcs_served")
   private final int uniqueNPCsServed;

   public CommissionData(Map<String, Integer> var1, Map<String, Integer> var2, int var3, int var4) {
      this.visits = var1;
      this.completed = var2;
      this.totalCompleted = var3;
      this.uniqueNPCsServed = var4;
   }
}
