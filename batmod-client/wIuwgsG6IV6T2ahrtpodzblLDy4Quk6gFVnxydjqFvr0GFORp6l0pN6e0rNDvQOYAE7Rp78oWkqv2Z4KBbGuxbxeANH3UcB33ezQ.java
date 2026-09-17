import com.google.common.collect.Lists;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.InflaterInputStream;

public class wIuwgsG6IV6T2ahrtpodzblLDy4Quk6gFVnxydjqFvr0GFORp6l0pN6e0rNDvQOYAE7Rp78oWkqv2Z4KBbGuxbxeANH3UcB33ezQ {
   private static final byte[] BatModClient = new byte[4096];
   private final File Button;
   private RandomAccessFile CustomSpinner;
   private final int[] ButtonAction = new int[1024];
   private final int[] Spinner = new int[1024];
   private List Checkbox;
   private int ProgressBar;
   private long BatModProgressBar;

   public wIuwgsG6IV6T2ahrtpodzblLDy4Quk6gFVnxydjqFvr0GFORp6l0pN6e0rNDvQOYAE7Rp78oWkqv2Z4KBbGuxbxeANH3UcB33ezQ(File var1) {
      this.Button = var1;
      this.ProgressBar = 0;

      try {
         if (var1.exists()) {
            this.BatModProgressBar = var1.lastModified();
         }

         this.CustomSpinner = new RandomAccessFile(var1, "rw");
         if (this.CustomSpinner.length() < 4096L) {
            for (int var2 = 0; var2 < 1024; var2++) {
               this.CustomSpinner.writeInt(0);
            }

            for (int var7 = 0; var7 < 1024; var7++) {
               this.CustomSpinner.writeInt(0);
            }

            this.ProgressBar += 8192;
         }

         if ((this.CustomSpinner.length() & 4095L) != 0L) {
            for (int var8 = 0;
               var8 < (this.CustomSpinner.length() & 4095L);
               var8++
            ) {
               this.CustomSpinner.write(0);
            }
         }

         int var9 = (int)this.CustomSpinner.length() / 4096;
         this.Checkbox = Lists.newArrayListWithCapacity(var9);

         for (int var3 = 0; var3 < var9; var3++) {
            this.Checkbox.add(true);
         }

         this.Checkbox.set(0, false);
         this.Checkbox.set(1, false);
         this.CustomSpinner.seek(0L);

         for (int var10 = 0; var10 < 1024; var10++) {
            int var4 = this.CustomSpinner.readInt();
            this.ButtonAction[var10] = var4;
            if (var4 != 0
               && (var4 >> 8) + (var4 & 0xFF)
                  <= this.Checkbox.size()) {
               for (int var5 = 0; var5 < (var4 & 0xFF); var5++) {
                  this.Checkbox.set((var4 >> 8) + var5, false);
               }
            }
         }

         for (int var11 = 0; var11 < 1024; var11++) {
            int var12 = this.CustomSpinner.readInt();
            this.Spinner[var11] = var12;
         }
      } catch (IOException var6) {
         var6.printStackTrace();
      }
   }

   public synchronized DataInputStream BatModClient(int var1, int var2) {
      if (this.ButtonAction(var1, var2)) {
         return null;
      }

      try {
         int var3 = this.Spinner(var1, var2);
         if (var3 == 0) {
            return null;
         } else {
            int var4 = var3 >> 8;
            int var5 = var3 & 0xFF;
            if (var4 + var5 > this.Checkbox.size()) {
               return null;
            } else {
               this.CustomSpinner.seek(var4 * 4096);
               int var6 = this.CustomSpinner.readInt();
               if (var6 > 4096 * var5) {
                  return null;
               } else if (var6 <= 0) {
                  return null;
               } else {
                  byte var7 = this.CustomSpinner.readByte();
                  if (var7 == 1) {
                     byte[] var10 = new byte[var6 - 1];
                     this.CustomSpinner.read(var10);
                     return new DataInputStream(new BufferedInputStream(new GZIPInputStream(new ByteArrayInputStream(var10))));
                  } else if (var7 == 2) {
                     byte[] var8 = new byte[var6 - 1];
                     this.CustomSpinner.read(var8);
                     return new DataInputStream(new BufferedInputStream(new InflaterInputStream(new ByteArrayInputStream(var8))));
                  } else {
                     return null;
                  }
               }
            }
         }
      } catch (IOException var9) {
         return null;
      }
   }

   public DataOutputStream Button(int var1, int var2) {
      return this.ButtonAction(var1, var2)
         ? null
         : new DataOutputStream(
            new DeflaterOutputStream(new wm1F2hxkR0rOfU6Gmoa8FovX2cylfkzvcZAnOPpkZ9ZLZY9Jb1i94gL3wkfUIfZ6IWgeoBbXp9VuDekmOvh4ubALeORthcw3vKxr(this, var1, var2))
         );
   }

   protected synchronized void BatModClient(
      int var1, int var2, byte[] var3, int var4
   ) {
      try {
         int var5 = this.Spinner(var1, var2);
         int var6 = var5 >> 8;
         int var7 = var5 & 0xFF;
         int var8 = (var4 + 5) / 4096 + 1;
         if (var8 >= 256) {
            return;
         }

         if (var6 != 0 && var7 == var8) {
            this.BatModClient(var6, var3, var4);
         } else {
            for (int var9 = 0; var9 < var7; var9++) {
               this.Checkbox.set(var6 + var9, true);
            }

            int var15 = this.Checkbox.indexOf(true);
            int var10 = 0;
            if (var15 != -1) {
               for (int var11 = var15;
                  var11 < this.Checkbox.size();
                  var11++
               ) {
                  if (var10 != 0) {
                     if ((Boolean)this.Checkbox.get(var11)) {
                        var10++;
                     } else {
                        var10 = 0;
                     }
                  } else if ((Boolean)this.Checkbox.get(var11)) {
                     var15 = var11;
                     var10 = 1;
                  }

                  if (var10 >= var8) {
                     break;
                  }
               }
            }

            if (var10 >= var8) {
               var6 = var15;
               this.BatModClient(var1, var2, var15 << 8 | var8);

               for (int var17 = 0; var17 < var8; var17++) {
                  this.Checkbox.set(var6 + var17, false);
               }

               this.BatModClient(var6, var3, var4);
            } else {
               this.CustomSpinner
                  .seek(this.CustomSpinner.length());
               var6 = this.Checkbox.size();

               for (int var16 = 0; var16 < var8; var16++) {
                  this.CustomSpinner
                     .write(BatModClient);
                  this.Checkbox.add(false);
               }

               this.ProgressBar += 4096 * var8;
               this.BatModClient(var6, var3, var4);
               this.BatModClient(var1, var2, var6 << 8 | var8);
            }
         }

         this.Button(
            var1,
            var2,
            (int)(
               TDI1rwhE6ftgpT0jnIkLxDzDc0kfx23fe5G5xeWfGWo1r95rLIJvkBpIvia4qynITY7zhShMOxrj3sgpclCo8KBYm5raxCQbPjtD.jnCis9uEMIJZ4LbcTWwzvNFcfAAQmKbr9Emwb0P9A3l7dJFPYTlXePtRtSEtG9LkNhbL6vucUprNYzqcrc7GaplIkT1KqhS8UUG2()
                  / 1000L
            )
         );
      } catch (IOException var12) {
         var12.printStackTrace();
      }
   }

   private void BatModClient(int var1, byte[] var2, int var3) {
      this.CustomSpinner.seek(var1 * 4096);
      this.CustomSpinner.writeInt(var3 + 1);
      this.CustomSpinner.writeByte(2);
      this.CustomSpinner.write(var2, 0, var3);
   }

   private boolean ButtonAction(int var1, int var2) {
      return var1 < 0 || var1 >= 32 || var2 < 0 || var2 >= 32;
   }

   private int Spinner(int var1, int var2) {
      return this.ButtonAction[var1 + var2 * 32];
   }

   public boolean CustomSpinner(int var1, int var2) {
      return this.Spinner(var1, var2) != 0;
   }

   private void BatModClient(int var1, int var2, int var3) {
      this.ButtonAction[var1 + var2 * 32] = var3;
      this.CustomSpinner.seek((var1 + var2 * 32) * 4);
      this.CustomSpinner.writeInt(var3);
   }

   private void Button(int var1, int var2, int var3) {
      this.Spinner[var1 + var2 * 32] = var3;
      this.CustomSpinner.seek(4096 + (var1 + var2 * 32) * 4);
      this.CustomSpinner.writeInt(var3);
   }

   public void BatModClient() {
      if (this.CustomSpinner != null) {
         this.CustomSpinner.close();
      }
   }
}
