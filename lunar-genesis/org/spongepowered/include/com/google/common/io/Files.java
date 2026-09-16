package org.spongepowered.include.com.google.common.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.List;
import org.spongepowered.include.com.google.common.base.Preconditions;
import org.spongepowered.include.com.google.common.collect.ImmutableSet;
import org.spongepowered.include.com.google.common.collect.Lists;
import org.spongepowered.include.com.google.common.collect.TreeTraverser;
import org.spongepowered.include.com.google.errorprone.annotations.CanIgnoreReturnValue;

public final class Files {
   private static final TreeTraverser<File> FILE_TREE_TRAVERSER = new TreeTraverser<File>() {
      @Override
      public String toString() {
         return "Files.fileTreeTraverser()";
      }
   };

   public static ByteSource asByteSource(File var0) {
      return new Files.FileByteSource(var0);
   }

   static byte[] readFile(InputStream var0, long var1) {
      if (var1 > 2147483647L) {
         throw new OutOfMemoryError("file is too large to fit in a byte array: " + var1 + " bytes");
      } else {
         return var1 == 0L ? ByteStreams.toByteArray(var0) : ByteStreams.toByteArray(var0, (int)var1);
      }
   }

   public static ByteSink asByteSink(File var0, FileWriteMode... var1) {
      return new Files.FileByteSink(var0, var1);
   }

   public static CharSource asCharSource(File var0, Charset var1) {
      return asByteSource(var0).asCharSource(var1);
   }

   public static CharSink asCharSink(File var0, Charset var1, FileWriteMode... var2) {
      return asByteSink(var0, var2).asCharSink(var1);
   }

   private static FileWriteMode[] modes(boolean var0) {
      return var0 ? new FileWriteMode[]{FileWriteMode.APPEND} : new FileWriteMode[0];
   }

   public static void write(byte[] var0, File var1) {
      asByteSink(var1).write(var0);
   }

   public static void write(CharSequence var0, File var1, Charset var2) {
      asCharSink(var1, var2).write(var0);
   }

   public static void append(CharSequence var0, File var1, Charset var2) {
      write(var0, var1, var2, true);
   }

   private static void write(CharSequence var0, File var1, Charset var2, boolean var3) {
      asCharSink(var1, var2, modes(var3)).write(var0);
   }

   public static List<String> readLines(File var0, Charset var1) {
      return readLines(var0, var1, new LineProcessor<List<String>>() {
         final List<String> result = Lists.newArrayList();

         @Override
         public boolean processLine(String var1) {
            this.result.add(var1);
            return true;
         }

         public List<String> getResult() {
            return this.result;
         }
      });
   }

   @CanIgnoreReturnValue
   public static <T> T readLines(File var0, Charset var1, LineProcessor<T> var2) {
      return asCharSource(var0, var1).readLines(var2);
   }

   private static final class FileByteSink extends ByteSink {
      private final File file;
      private final ImmutableSet<FileWriteMode> modes;

      private FileByteSink(File var1, FileWriteMode... var2) {
         this.file = Preconditions.checkNotNull(var1);
         this.modes = ImmutableSet.copyOf(var2);
      }

      public FileOutputStream openStream() {
         return new FileOutputStream(this.file, this.modes.contains(FileWriteMode.APPEND));
      }

      @Override
      public String toString() {
         return "Files.asByteSink(" + this.file + ", " + this.modes + ")";
      }
   }

   private static final class FileByteSource extends ByteSource {
      private final File file;

      private FileByteSource(File var1) {
         this.file = Preconditions.checkNotNull(var1);
      }

      public FileInputStream openStream() {
         return new FileInputStream(this.file);
      }

      @Override
      public byte[] read() {
         Closer var1 = Closer.create();

         try {
            FileInputStream var2 = var1.register(this.openStream());
            return Files.readFile(var2, var2.getChannel().size());
         } catch (Throwable var7) {
            throw var1.rethrow(var7);
         } finally {
            var1.close();
         }
      }

      @Override
      public String toString() {
         return "Files.asByteSource(" + this.file + ")";
      }
   }
}
