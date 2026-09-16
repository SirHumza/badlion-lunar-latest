package com.lunarclient.election;

import com.google.gson.annotations.SerializedName;
import com.lunarclient.election.candidate.Candidate;

public record Election() {
   @SerializedName("year")
   private final int year;
   @SerializedName("candidates")
   private final Candidate[] candidates;

   public Election(int var1, Candidate[] var2) {
      this.year = var1;
      this.candidates = var2;
   }
}
