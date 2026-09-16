import java.io.File;
import java.io.FileFilter;

final class HIlu0e4ZGdXoB2VecJiW5mFNWj2u94CxmgypBW626qWrf9ycF6fQXkKdfQhPhMF3GEnFDYICuEiTmN4EuqsrOtVwYe565ymqWkjg implements FileFilter {
   @Override
   public boolean accept(File var1) {
      boolean var2 = var1.isFile() && var1.getName().endsWith(".zip");
      boolean var3 = var1.isDirectory() && new File(var1, "pack.mcmeta").isFile();
      return var2 || var3;
   }
}
