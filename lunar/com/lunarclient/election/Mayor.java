package com.lunarclient.election;

import com.google.gson.annotations.SerializedName;
import com.lunarclient.election.mayor.Mayor;

public record ElectionResponse() {
   @SerializedName("success")
   private final boolean success;
   @SerializedName("lastUpdated")
   private final long lastUpdated;
   @SerializedName("mayor")
   private final Mayor mayor;
   @SerializedName("current")
   private final Election current;

   public ElectionResponse(boolean var1, long var2, Mayor var4, Election var5) {
      this.success = var1;
      this.lastUpdated = var2;
      this.mayor = var4;
      this.current = var5;
   }
}
