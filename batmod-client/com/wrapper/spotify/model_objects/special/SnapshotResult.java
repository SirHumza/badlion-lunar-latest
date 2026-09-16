package com.wrapper.spotify.model_objects.special;

import com.google.gson.JsonObject;
import com.wrapper.spotify.model_objects.AbstractModelObject;

public class SnapshotResult extends AbstractModelObject {
   private final String snapshotId;

   private SnapshotResult(SnapshotResult.Builder builder) {
      super(builder);
      this.snapshotId = builder.snapshotId;
   }

   public String getSnapshotId() {
      return this.snapshotId;
   }

   public SnapshotResult.Builder builder() {
      return new SnapshotResult.Builder();
   }

   public static final class Builder extends AbstractModelObject.Builder {
      public String snapshotId;

      public SnapshotResult.Builder setSnapshotId(String snapshotId) {
         this.snapshotId = snapshotId;
         return this;
      }

      public SnapshotResult build() {
         return new SnapshotResult(this);
      }
   }

   public static final class JsonUtil extends AbstractModelObject.JsonUtil<SnapshotResult> {
      public SnapshotResult createModelObject(JsonObject jsonObject) {
         return jsonObject != null && !jsonObject.isJsonNull()
            ? new SnapshotResult.Builder()
               .setSnapshotId(this.hasAndNotNull(jsonObject, "snapshot_id") ? jsonObject.get("snapshot_id").getAsString() : null)
               .build()
            : null;
      }
   }
}
