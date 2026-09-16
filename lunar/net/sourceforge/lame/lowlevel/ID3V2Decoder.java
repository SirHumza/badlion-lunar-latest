package net.sourceforge.lame.lowlevel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ID3V2Decoder {
   private String imageMimeType;
   private byte[] imageBytes;
   private String commentLanguage;
   private String comment;
   private String album;
   private String interpret;
   private String albumInterpret;
   private String componist;
   private String cdNumber;
   private String genre;
   private String title;
   private String track;
   private String year;

   public static void main(String[] var0) {
      try {
         ID3V2Decoder var1 = new ID3V2Decoder();
         var1.read(new RandomAccessFile(var0[0], "r"));
         System.out.println();
         FileOutputStream var2 = new FileOutputStream(new File("d:/out.jpg"));
         var2.write(var1.getImageBytes());
         var2.close();
      } catch (IOException var3) {
         var3.printStackTrace();
      }
   }

   public String getImageMimeType() {
      return this.imageMimeType;
   }

   public void setImageMimeType(String var1) {
      this.imageMimeType = var1;
   }

   public byte[] getImageBytes() {
      return this.imageBytes;
   }

   public void setImageBytes(byte[] var1) {
      this.imageBytes = var1;
   }

   public String getCommentLanguage() {
      return this.commentLanguage;
   }

   public void setCommentLanguage(String var1) {
      this.commentLanguage = var1;
   }

   public String getComment() {
      return this.comment;
   }

   public void setComment(String var1) {
      this.comment = var1;
   }

   public String getAlbum() {
      return this.album;
   }

   public void setAlbum(String var1) {
      this.album = var1;
   }

   public String getInterpret() {
      return this.interpret;
   }

   public void setInterpret(String var1) {
      this.interpret = var1;
   }

   public String getAlbumInterpret() {
      return this.albumInterpret;
   }

   public void setAlbumInterpret(String var1) {
      this.albumInterpret = var1;
   }

   public String getComponist() {
      return this.componist;
   }

   public void setComponist(String var1) {
      this.componist = var1;
   }

   public String getCdNumber() {
      return this.cdNumber;
   }

   public void setCdNumber(String var1) {
      this.cdNumber = var1;
   }

   public String getGenre() {
      return this.genre;
   }

   public void setGenre(String var1) {
      this.genre = var1;
   }

   public String getTitle() {
      return this.title;
   }

   public void setTitle(String var1) {
      this.title = var1;
   }

   public String getTrack() {
      return this.track;
   }

   public void setTrack(String var1) {
      this.track = var1;
   }

   public String getYear() {
      return this.year;
   }

   public void setYear(String var1) {
      this.year = var1;
   }

   public final void read(RandomAccessFile var1) {
      byte[] var2 = new byte[4];
      var1.readFully(var2);
      if (var2[0] == 73 && var2[1] == 68 && var2[2] == 51) {
         byte[] var3 = new byte[6];
         var1.readFully(var3);
         var3[2] = (byte)(var3[2] & 127);
         var3[3] = (byte)(var3[3] & 127);
         var3[4] = (byte)(var3[4] & 127);
         var3[5] = (byte)(var3[5] & 127);
         int var4 = (((var3[2] << 7) + var3[3] << 7) + var3[4] << 7) + var3[5];
         this.readTags(var1, var4);
      }
   }

   private void readTags(RandomAccessFile var1, int var2) {
      while (var1.getFilePointer() < var2 && !this.readTag(var1)) {
      }
   }

   private boolean readTag(RandomAccessFile var1) {
      byte[] var2 = new byte[4];
      var1.readFully(var2);
      if (var2[0] == 0) {
         return true;
      }

      String var3 = this.getType(var2);
      byte[] var4 = new byte[4];
      var1.readFully(var4);
      var1.skipBytes(2);
      if ("APIC".equals(var3)) {
         this.readImage(var1, this.readLength(var4));
      } else if ("COMM".equals(var3)) {
         var1.skipBytes((int)this.readLength(var4));
      } else {
         int var5 = var1.read();
         String var6 = this.readField(var1, var3, (int)this.readLength(var4), var5);
         if (var3.equals("TALB")) {
            this.setAlbum(var6);
         } else if (var3.equals("TPE1")) {
            this.setInterpret(var6);
         } else if (var3.equals("TPE2")) {
            this.setAlbumInterpret(var6);
         } else if (var3.equals("TCOM")) {
            this.setComponist(var6);
         } else if (var3.equals("TPOS")) {
            this.setCdNumber(var6);
         } else if (var3.equals("TCON")) {
            this.setGenre(var6);
         } else if (var3.equals("TIT2")) {
            this.setTitle(var6);
         } else if (var3.equals("TRCK")) {
            this.setTrack(var6);
         } else if (var3.equals("TYER")) {
            this.setYear(var6);
         }
      }

      return false;
   }

   private long readLength(byte[] var1) {
      long var2 = (var1[0] & 255) << 24;
      var2 += (var1[1] & 255) << 16;
      var2 += (var1[2] & 255) << 8;
      return var2 + (var1[3] & 0xFF);
   }

   private String readField(RandomAccessFile var1, String var2, int var3, int var4) {
      byte[] var5 = new byte[var3];
      var1.readFully(var5, 0, var3 - 1);
      if (var4 == 0) {
         return new String(var5, 0, var3 - 1, "ISO-8859-1");
      } else if (var4 == 1) {
         return new String(var5, 0, var3 - 1, "UTF-16");
      } else {
         return var4 == 3 ? new String(var5, 0, var3 - 1, "UTF-8") : "";
      }
   }

   private void readImage(RandomAccessFile var1, long var2) {
      var1.read();
      StringBuilder var5 = new StringBuilder();

      int var4;
      do {
         var4 = var1.read();
         if (var4 > 0) {
            var5.append((char)var4);
         }
      } while (var4 > 0);

      this.setImageMimeType(var5.toString());
      var1.skipBytes(2);
      byte[] var6 = new byte[(int)(var2 - var5.length() - 4L)];
      var1.readFully(var6);
      this.setImageBytes(var6);
   }

   private String getType(byte[] var1) {
      return (char)var1[0] + String.valueOf((char)var1[1]) + (char)var1[2] + (char)var1[3];
   }
}
