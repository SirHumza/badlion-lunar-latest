package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO;

import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.COIRRRCIORROCHIROCHROCHICCICIC;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IOHHOIIOCRHCHHCRORICCOHOHROOIH;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.Charset;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.SecureDirectoryStream;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
public final class RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO {
   private static final IOHHOIIOCRHCHHCRORICCOHOHROOIH<Path> HOOHICHOOROCICHCIOHOHIRROIOOIC = new IOHHOIIOCRHCHHCRORICCOHOHROOIH<Path>() {
      public Iterable<Path> successors(Path var1) {
         return RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO.fileTreeChildren(var1);
      }
   };

   private RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO() {
   }

   public static HRCHROOHRIHCRCRHRIIROCIRHOIRHH IRCIIHHICIHRCOCRROCOICRIHHCCHH(Path var0, OpenOption... var1) {
      return new RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, var1);
   }

   public static RIOOCHICIHRHOHCCCCCHOCCCOHCRHI HHCCIRHCCCIIRHCROHIORHIRHHIORH(Path var0, OpenOption... var1) {
      return new RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1);
   }

   public static HICHRCOHCCRHOHCICOOCHOIHCCHIRI RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Path var0, Charset var1, OpenOption... var2) {
      return IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, var2).CRRRICCRROCOHHOHIICIHORCOORRRH(var1);
   }

   public static CRICCOOHHHCHOORCICOCOHIHOIRHOO IRCIIHHICIHRCOCRROCOICRIHHCCHH(Path var0, Charset var1, OpenOption... var2) {
      return HHCCIRHCCCIIRHCROHIORHIRHHIORH(var0, var2).HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1);
   }

   public static COIRRRCIORROCHIROCHROCHICCICIC<Path> IOIICIRIICICIIOORHCIIIIRRIHRHI(Path var0) {
      try (DirectoryStream var1 = Files.newDirectoryStream(var0)) {
         return COIRRRCIORROCHIROCHROCHICCICIC.HICRRICCHCCROOHHCHOCOCCHOIHHOC(var1);
      } catch (DirectoryIteratorException var15) {
         throw var15.getCause();
      }
   }

   public static IIHRHCCOOHOOOOCHRRCOROOIOHCOOO<Path> IOICROCHCRRIRHRORORHRHOHHOIICI() {
      return IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH(HOOHICHOOROCICHCIOHOHIRROIOOIC);
   }

   private static Iterable<Path> fileTreeChildren(Path var0) {
      if (Files.isDirectory(var0, LinkOption.NOFOLLOW_LINKS)) {
         try {
            return IOIICIRIICICIIOORHCIIIIRRIHRHI(var0);
         } catch (IOException var2) {
            throw new DirectoryIteratorException(var2);
         }
      } else {
         return COIRRRCIORROCHIROCHROCHICCICIC.HHOIROIHOHHRHIRRRHRIRHOOIRCIOH();
      }
   }

   public static com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<Path> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      LinkOption... var0
   ) {
      final LinkOption[] var1 = (LinkOption[])var0.clone();
      return new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<Path>(
         
      ) {
         public boolean apply(Path var1x) {
            return Files.isDirectory(var1x, var1);
         }

         @Override
         public String toString() {
            return "MoreFiles.isDirectory(" + Arrays.toString(var1) + ")";
         }
      };
   }

   private static boolean isDirectory(SecureDirectoryStream<Path> var0, Path var1, LinkOption... var2) {
      return var0.getFileAttributeView(var1, BasicFileAttributeView.class, var2).readAttributes().isDirectory();
   }

   public static com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<Path> IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      LinkOption... var0
   ) {
      final LinkOption[] var1 = (LinkOption[])var0.clone();
      return new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<Path>(
         
      ) {
         public boolean apply(Path var1x) {
            return Files.isRegularFile(var1x, var1);
         }

         @Override
         public String toString() {
            return "MoreFiles.isRegularFile(" + Arrays.toString(var1) + ")";
         }
      };
   }

   public static boolean equal(Path var0, Path var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      if (Files.isSameFile(var0, var1)) {
         return true;
      }

      HRCHROOHRIHCRCRHRIIROCIRHOIRHH var2 = IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0);
      HRCHROOHRIHCRCRHRIIROCIRHOIRHH var3 = IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1);
      long var4 = var2.IRIRHRHOHCCRCORHOOCICHHIOCHCCI().or(0L);
      long var6 = var3.IRIRHRHOHCCRCORHOOCICHHIOCHCCI().or(0L);
      return var4 != 0L && var6 != 0L && var4 != var6 ? false : var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3);
   }

   public static void touch(Path var0) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );

      try {
         Files.setLastModifiedTime(var0, FileTime.fromMillis(System.currentTimeMillis()));
      } catch (NoSuchFileException var4) {
         try {
            Files.createFile(var0);
         } catch (FileAlreadyExistsException var3) {
         }
      }
   }

   public static void createParentDirectories(Path var0, FileAttribute<?>... var1) {
      Path var2 = var0.toAbsolutePath().normalize();
      Path var3 = var2.getParent();
      if (var3 != null) {
         if (!Files.isDirectory(var3)) {
            Files.createDirectories(var3, var1);
            if (!Files.isDirectory(var3)) {
               throw new IOException("Unable to create parent directories of " + var0);
            }
         }
      }
   }

   public static String getFileExtension(Path var0) {
      Path var1 = var0.getFileName();
      if (var1 == null) {
         return "";
      }

      String var2 = var1.toString();
      int var3 = var2.lastIndexOf(46);
      return var3 == -1 ? "" : var2.substring(var3 + 1);
   }

   public static String getNameWithoutExtension(Path var0) {
      Path var1 = var0.getFileName();
      if (var1 == null) {
         return "";
      }

      String var2 = var1.toString();
      int var3 = var2.lastIndexOf(46);
      return var3 == -1 ? var2 : var2.substring(0, var3);
   }

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Path var0, OIHCOHRCICCCRHRCROOCIOIRRHHHIH... var1) {
      Path var2 = getParentPath(var0);
      if (var2 == null) {
         throw new FileSystemException(var0.toString(), null, "can't delete recursively");
      }

      Collection var3 = null;

      try {
         boolean var4 = false;

         try (DirectoryStream var5 = Files.newDirectoryStream(var2)) {
            if (var5 instanceof SecureDirectoryStream) {
               var4 = true;
               var3 = deleteRecursivelySecure((SecureDirectoryStream<Path>)var5, var0.getFileName());
            }
         }

         if (!var4) {
            HHCCIRHCCCIIRHCROHIORHIRHHIORH(var0, var1);
            var3 = deleteRecursivelyInsecure(var0);
         }
      } catch (IOException var18) {
         if (var3 == null) {
            throw var18;
         }

         var3.add(var18);
      }

      if (var3 != null) {
         throwDeleteFailed(var0, var3);
      }
   }

   public static void IRCIIHHICIHRCOCRROCOICRIHHCCHH(Path var0, OIHCOHRCICCCRHRCROOCIOIRRHHHIH... var1) {
      Collection var2 = null;

      try (DirectoryStream var3 = Files.newDirectoryStream(var0)) {
         if (var3 instanceof SecureDirectoryStream) {
            SecureDirectoryStream var5 = (SecureDirectoryStream)var3;
            var2 = deleteDirectoryContentsSecure(var5);
         } else {
            HHCCIRHCCCIIRHCROHIORHIRHHIORH(var0, var1);
            var2 = deleteDirectoryContentsInsecure(var3);
         }
      } catch (IOException var16) {
         if (var2 == null) {
            throw var16;
         }

         var2.add(var16);
      }

      if (var2 != null) {
         throwDeleteFailed(var0, var2);
      }
   }

   private static @Nullable Collection<IOException> deleteRecursivelySecure(SecureDirectoryStream<Path> var0, Path var1) {
      Collection var2 = null;

      try {
         if (isDirectory(var0, var1, LinkOption.NOFOLLOW_LINKS)) {
            try (SecureDirectoryStream var3 = var0.newDirectoryStream(var1, LinkOption.NOFOLLOW_LINKS)) {
               var2 = deleteDirectoryContentsSecure(var3);
            }

            if (var2 == null) {
               var0.deleteDirectory(var1);
            }
         } else {
            var0.deleteFile(var1);
         }

         return var2;
      } catch (IOException var16) {
         return addException(var2, var16);
      }
   }

   private static @Nullable Collection<IOException> deleteDirectoryContentsSecure(SecureDirectoryStream<Path> var0) {
      Collection var1 = null;

      try {
         for (Path var3 : var0) {
            var1 = concat(var1, deleteRecursivelySecure(var0, var3.getFileName()));
         }

         return var1;
      } catch (DirectoryIteratorException var4) {
         return addException(var1, var4.getCause());
      }
   }

   private static @Nullable Collection<IOException> deleteRecursivelyInsecure(Path var0) {
      Collection var1 = null;

      try {
         if (Files.isDirectory(var0, LinkOption.NOFOLLOW_LINKS)) {
            try (DirectoryStream var2 = Files.newDirectoryStream(var0)) {
               var1 = deleteDirectoryContentsInsecure(var2);
            }
         }

         if (var1 == null) {
            Files.delete(var0);
         }

         return var1;
      } catch (IOException var15) {
         return addException(var1, var15);
      }
   }

   private static @Nullable Collection<IOException> deleteDirectoryContentsInsecure(DirectoryStream<Path> var0) {
      Collection var1 = null;

      try {
         for (Path var3 : var0) {
            var1 = concat(var1, deleteRecursivelyInsecure(var3));
         }

         return var1;
      } catch (DirectoryIteratorException var4) {
         return addException(var1, var4.getCause());
      }
   }

   private static @Nullable Path getParentPath(Path var0) {
      Path var1 = var0.getParent();
      if (var1 != null) {
         return var1;
      } else {
         return var0.getNameCount() == 0 ? null : var0.getFileSystem().getPath(".");
      }
   }

   private static void HHCCIRHCCCIIRHCROHIORHIRHHIORH(Path var0, OIHCOHRCICCCRHRCROOCIOIRRHHHIH[] var1) {
      if (!Arrays.asList(var1).contains(OIHCOHRCICCCRHRCROOCIOIRRHHHIH.ALLOW_INSECURE)) {
         throw new HICRRICCHCCROOHHCHOCOCCHOIHHOC(var0.toString());
      }
   }

   private static Collection<IOException> addException(@Nullable Collection<IOException> var0, IOException var1) {
      if (var0 == null) {
         var0 = new ArrayList();
      }

      var0.add(var1);
      return var0;
   }

   private static @Nullable Collection<IOException> concat(@Nullable Collection<IOException> var0, @Nullable Collection<IOException> var1) {
      if (var0 == null) {
         return var1;
      }

      if (var1 != null) {
         var0.addAll(var1);
      }

      return var0;
   }

   private static void throwDeleteFailed(Path var0, Collection<IOException> var1) {
      FileSystemException var2 = new FileSystemException(var0.toString(), null, "failed to delete one or more files; see suppressed exceptions for details");

      for (IOException var4 : var1) {
         var2.addSuppressed(var4);
      }

      throw var2;
   }

   private static final class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
      private static final LinkOption[] IHRORRHHCHCCRCOIOCIOORICICROCC = new LinkOption[0];
      private final Path IOOOOHOHCIOCICRRCROHIHCICROOIO;
      private final OpenOption[] ORIRCCIRIICIOOHIIOHOIIIIHROCHI;
      private final boolean CIOOCHHHICCORHCRHRRHHHCIHORICC;

      private IRCIIHHICIHRCOCRROCOICRIHHCCHH(Path var1, OpenOption... var2) {
         this.IOOOOHOHCIOCICRRCROHIHCICROOIO = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         this.ORIRCCIRIICIOOHIIOHOIIIIHROCHI = (OpenOption[])var2.clone();
         this.CIOOCHHHICCORHCRHRRHHHCIHORICC = followLinks(this.ORIRCCIRIICIOOHIIOHOIIIIHROCHI);
      }

      private static boolean followLinks(OpenOption[] var0) {
         for (OpenOption var4 : var0) {
            if (var4 == LinkOption.NOFOLLOW_LINKS) {
               return false;
            }
         }

         return true;
      }

      @Override
      public InputStream openStream() {
         return Files.newInputStream(this.IOOOOHOHCIOCICRRCROHIHCICROOIO, this.ORIRCCIRIICIOOHIIOHOIIIIHROCHI);
      }

      private BasicFileAttributes readAttributes() {
         return Files.readAttributes(
            this.IOOOOHOHCIOCICRRCROHIHCICROOIO,
            BasicFileAttributes.class,
            this.CIOOCHHHICCORHCRHRRHHHCIHORICC ? IHRORRHHCHCCRCOIOCIOORICICROCC : new LinkOption[]{LinkOption.NOFOLLOW_LINKS}
         );
      }

      @Override
      public com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR<Long> IRIRHRHOHCCRCORHOOCICHHIOCHCCI() {
         BasicFileAttributes var1;
         try {
            var1 = this.readAttributes();
         } catch (IOException var3) {
            return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR.IHIRCRORCOOROROHHRRIIOOOOCCHRH();
         }

         return !var1.isDirectory() && !var1.isSymbolicLink()
            ? com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR.COIRRRCIORROCHIROCHROCHICCICIC(
               var1.size()
            )
            : com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR.IHIRCRORCOOROROHHRRIIOOOOCCHRH();
      }

      @Override
      public long size() {
         BasicFileAttributes var1 = this.readAttributes();
         if (var1.isDirectory()) {
            throw new IOException("can't read: is a directory");
         } else if (var1.isSymbolicLink()) {
            throw new IOException("can't read: is a symbolic link");
         } else {
            return var1.size();
         }
      }

      @Override
      public byte[] read() {
         try (SeekableByteChannel var1 = Files.newByteChannel(this.IOOOOHOHCIOCICRRCROHIHCICROOIO, this.ORIRCCIRIICIOOHIIOHOIIIIHROCHI)) {
            return OOROOCCIRCCRHOIOIORIHCHHOOCCOR.toByteArray(Channels.newInputStream(var1), var1.size());
         }
      }

      @Override
      public HICHRCOHCCRHOHCICOOCHOIHCCHIRI CRRRICCRROCOHHOHIICIHORCOORRRH(Charset var1) {
         return this.ORIRCCIRIICIOOHIIOHOIIIIHROCHI.length == 0 ? new HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1) {
            @Override
            public Stream<String> lines() {
               return Files.lines(IRCIIHHICIHRCOCRROCOICRIHHCCHH.this.IOOOOHOHCIOCICRRCROHIHCICROOIO, this.CIOOROHIHICOHOOIOOIIICCOIROIIR);
            }
         } : super.CRRRICCRROCOHHOHIICIHORCOORRRH(var1);
      }

      @Override
      public String toString() {
         return "MoreFiles.asByteSource(" + this.IOOOOHOHCIOCICRRCROHIHCICROOIO + ", " + Arrays.toString(this.ORIRCCIRIICIOOHIIOHOIIIIHROCHI) + ")";
      }
   }

   private static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends RIOOCHICIHRHOHCCCCCHOCCCOHCRHI {
      private final Path IOICHOCOCHICCCCRIHCRRIORHHHOHO;
      private final OpenOption[] OCCCIHORRRIHICIIOHIHCICOIOOOIH;

      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Path var1, OpenOption... var2) {
         this.IOICHOCOCHICCCCRIHCRRIORHHHOHO = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         this.OCCCIHORRRIHICIIOHIHCICOIOOOIH = (OpenOption[])var2.clone();
      }

      @Override
      public OutputStream openStream() {
         return Files.newOutputStream(this.IOICHOCOCHICCCCRIHCRRIORHHHOHO, this.OCCCIHORRRIHICIIOHIHCICOIOOOIH);
      }

      @Override
      public String toString() {
         return "MoreFiles.asByteSink(" + this.IOICHOCOCHICCCCRIHCRRIORHHHOHO + ", " + Arrays.toString(this.OCCCIHORRRIHICIIOHIHCICOIOOOIH) + ")";
      }
   }
}
