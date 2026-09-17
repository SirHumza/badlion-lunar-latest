public class Y4LxseRr49uSG6jQVBB1n4DLVEkiYlwC1HfCc1JAF26I3I9LRXQe2EgT3YWFBp8wgzcaidpDbioDsCIYGKdVIufTLzYYcumGUNFH
   implements fvKISyhjtidEfAo9GUDVyJzNehUtrdzsiGxY2s19EDEEk0tKuce6ztVZPAM3xilMlKOMBNJsgl2Spy2Ojw7DED3JNznNgMVQdCFM {
   private int BatModClient;
   private short Button;
   private boolean CustomSpinner;

   public Y4LxseRr49uSG6jQVBB1n4DLVEkiYlwC1HfCc1JAF26I3I9LRXQe2EgT3YWFBp8wgzcaidpDbioDsCIYGKdVIufTLzYYcumGUNFH() {
   }

   public Y4LxseRr49uSG6jQVBB1n4DLVEkiYlwC1HfCc1JAF26I3I9LRXQe2EgT3YWFBp8wgzcaidpDbioDsCIYGKdVIufTLzYYcumGUNFH(int var1, short var2, boolean var3) {
      this.BatModClient = var1;
      this.Button = var2;
      this.CustomSpinner = var3;
   }

   public void BatModClient(
      iPTL23HOVfk0ZAY9Qu46G4HFkkITYltA3Ieh3ProSkQvVZWtbH7mm2IDojoNJzUk3Rv2BZV7QZXXv5ogbBO0Nplt0KTxGmS8hc var1
   ) {
      var1.BatModClient(this);
   }

   @Override
   public void BatModClient(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      this.BatModClient = var1.readUnsignedByte();
      this.Button = var1.readShort();
      this.CustomSpinner = var1.readBoolean();
   }

   @Override
   public void Button(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      var1.writeByte(this.BatModClient);
      var1.writeShort(this.Button);
      var1.writeBoolean(this.CustomSpinner);
   }

   public int BatModClient() {
      return this.BatModClient;
   }

   public short Button() {
      return this.Button;
   }

   public boolean CustomSpinner() {
      return this.CustomSpinner;
   }
}
