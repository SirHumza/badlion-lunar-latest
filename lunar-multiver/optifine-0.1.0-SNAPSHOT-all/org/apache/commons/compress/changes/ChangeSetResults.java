package org.apache.commons.compress.changes;

import java.util.ArrayList;
import java.util.List;

public class ChangeSetResults {
   private final List<String> addedFromChangeSet = new ArrayList<>();
   private final List<String> addedFromStream = new ArrayList<>();
   private final List<String> deleted = new ArrayList<>();

   void deleted(String var1) {
      this.deleted.add(var1);
   }

   void addedFromStream(String var1) {
      this.addedFromStream.add(var1);
   }

   void addedFromChangeSet(String var1) {
      this.addedFromChangeSet.add(var1);
   }

   public List<String> getAddedFromChangeSet() {
      return this.addedFromChangeSet;
   }

   public List<String> getAddedFromStream() {
      return this.addedFromStream;
   }

   public List<String> getDeleted() {
      return this.deleted;
   }

   boolean hasBeenAdded(String var1) {
      return this.addedFromChangeSet.contains(var1) || this.addedFromStream.contains(var1);
   }
}
