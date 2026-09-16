package org.apache.commons.compress.changes;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.archivers.ArchiveOutputStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipFile;
import org.apache.commons.compress.utils.IOUtils;

public class ChangeSetPerformer {
   private final Set<Change> changes;

   public ChangeSetPerformer(ChangeSet var1) {
      this.changes = var1.getChanges();
   }

   public ChangeSetResults perform(ArchiveInputStream var1, ArchiveOutputStream var2) {
      return this.perform(new ChangeSetPerformer.ArchiveInputStreamIterator(var1), var2);
   }

   public ChangeSetResults perform(ZipFile var1, ArchiveOutputStream var2) {
      return this.perform(new ChangeSetPerformer.ZipFileIterator(var1), var2);
   }

   private ChangeSetResults perform(ChangeSetPerformer.ArchiveEntryIterator var1, ArchiveOutputStream var2) {
      ChangeSetResults var3 = new ChangeSetResults();
      LinkedHashSet var4 = new LinkedHashSet<>(this.changes);
      Iterator var5 = var4.iterator();

      while (var5.hasNext()) {
         Change var6 = (Change)var5.next();
         if (var6.type() == 2 && var6.isReplaceMode()) {
            this.copyStream(var6.getInput(), var2, var6.getEntry());
            var5.remove();
            var3.addedFromChangeSet(var6.getEntry().getName());
         }
      }

      while (var1.hasNext()) {
         ArchiveEntry var11 = var1.next();
         boolean var13 = true;
         Iterator var7 = var4.iterator();

         while (var7.hasNext()) {
            Change var8 = (Change)var7.next();
            int var9 = var8.type();
            String var10 = var11.getName();
            if (var9 == 1 && var10 != null) {
               if (var10.equals(var8.targetFile())) {
                  var13 = false;
                  var7.remove();
                  var3.deleted(var10);
                  break;
               }
            } else if (var9 == 4 && var10 != null && var10.startsWith(var8.targetFile() + "/")) {
               var13 = false;
               var3.deleted(var10);
               break;
            }
         }

         if (var13 && !this.isDeletedLater(var4, var11) && !var3.hasBeenAdded(var11.getName())) {
            this.copyStream(var1.getInputStream(), var2, var11);
            var3.addedFromStream(var11.getName());
         }
      }

      var5 = var4.iterator();

      while (var5.hasNext()) {
         Change var14 = (Change)var5.next();
         if (var14.type() == 2 && !var14.isReplaceMode() && !var3.hasBeenAdded(var14.getEntry().getName())) {
            this.copyStream(var14.getInput(), var2, var14.getEntry());
            var5.remove();
            var3.addedFromChangeSet(var14.getEntry().getName());
         }
      }

      var2.finish();
      return var3;
   }

   private boolean isDeletedLater(Set<Change> var1, ArchiveEntry var2) {
      String var3 = var2.getName();
      if (!var1.isEmpty()) {
         for (Change var5 : var1) {
            int var6 = var5.type();
            String var7 = var5.targetFile();
            if (var6 == 1 && var3.equals(var7)) {
               return true;
            }

            if (var6 == 4 && var3.startsWith(var7 + "/")) {
               return true;
            }
         }
      }

      return false;
   }

   private void copyStream(InputStream var1, ArchiveOutputStream var2, ArchiveEntry var3) {
      var2.putArchiveEntry(var3);
      IOUtils.copy(var1, var2);
      var2.closeArchiveEntry();
   }

   interface ArchiveEntryIterator {
      boolean hasNext();

      ArchiveEntry next();

      InputStream getInputStream();
   }

   private static class ArchiveInputStreamIterator implements ChangeSetPerformer.ArchiveEntryIterator {
      private final ArchiveInputStream in;
      private ArchiveEntry next;

      ArchiveInputStreamIterator(ArchiveInputStream var1) {
         this.in = var1;
      }

      @Override
      public boolean hasNext() {
         return (this.next = this.in.getNextEntry()) != null;
      }

      @Override
      public ArchiveEntry next() {
         return this.next;
      }

      @Override
      public InputStream getInputStream() {
         return this.in;
      }
   }

   private static class ZipFileIterator implements ChangeSetPerformer.ArchiveEntryIterator {
      private final ZipFile in;
      private final Enumeration<ZipArchiveEntry> nestedEnum;
      private ZipArchiveEntry current;

      ZipFileIterator(ZipFile var1) {
         this.in = var1;
         this.nestedEnum = var1.getEntriesInPhysicalOrder();
      }

      @Override
      public boolean hasNext() {
         return this.nestedEnum.hasMoreElements();
      }

      @Override
      public ArchiveEntry next() {
         return this.current = this.nestedEnum.nextElement();
      }

      @Override
      public InputStream getInputStream() {
         return this.in.getInputStream(this.current);
      }
   }
}
