public class T7NcVYW29picitBJCFrVl7wfvVtepg2QKFA2AUXXdnOb91aT7gB24svsINSG9TpuwAaZzPd7L7Bgu7XcK4YqxtY87n5kjp3m3q5
   implements fvKISyhjtidEfAo9GUDVyJzNehUtrdzsiGxY2s19EDEEk0tKuce6ztVZPAM3xilMlKOMBNJsgl2Spy2Ojw7DED3JNznNgMVQdCFM {
   private int BatModClient;
   private String Button;
   private WeTqa0g0NbkXZOZDrvSeeDCHHN7RPZ9gR2j4c4e9IpymEt17UQor6B2FDPaiPIcNX5cuF15DrhMPMyE1uzL2mO8ZpMjwpJby4mVY CustomSpinner;
   private int ButtonAction;
   private int Spinner;

   public T7NcVYW29picitBJCFrVl7wfvVtepg2QKFA2AUXXdnOb91aT7gB24svsINSG9TpuwAaZzPd7L7Bgu7XcK4YqxtY87n5kjp3m3q5() {
   }

   public T7NcVYW29picitBJCFrVl7wfvVtepg2QKFA2AUXXdnOb91aT7gB24svsINSG9TpuwAaZzPd7L7Bgu7XcK4YqxtY87n5kjp3m3q5(
      int var1, String var2, WeTqa0g0NbkXZOZDrvSeeDCHHN7RPZ9gR2j4c4e9IpymEt17UQor6B2FDPaiPIcNX5cuF15DrhMPMyE1uzL2mO8ZpMjwpJby4mVY var3
   ) {
      this(var1, var2, var3, 0);
   }

   public T7NcVYW29picitBJCFrVl7wfvVtepg2QKFA2AUXXdnOb91aT7gB24svsINSG9TpuwAaZzPd7L7Bgu7XcK4YqxtY87n5kjp3m3q5(
      int var1, String var2, WeTqa0g0NbkXZOZDrvSeeDCHHN7RPZ9gR2j4c4e9IpymEt17UQor6B2FDPaiPIcNX5cuF15DrhMPMyE1uzL2mO8ZpMjwpJby4mVY var3, int var4
   ) {
      this.BatModClient = var1;
      this.Button = var2;
      this.CustomSpinner = var3;
      this.ButtonAction = var4;
   }

   public T7NcVYW29picitBJCFrVl7wfvVtepg2QKFA2AUXXdnOb91aT7gB24svsINSG9TpuwAaZzPd7L7Bgu7XcK4YqxtY87n5kjp3m3q5(
      int var1, String var2, WeTqa0g0NbkXZOZDrvSeeDCHHN7RPZ9gR2j4c4e9IpymEt17UQor6B2FDPaiPIcNX5cuF15DrhMPMyE1uzL2mO8ZpMjwpJby4mVY var3, int var4, int var5
   ) {
      this(var1, var2, var3, var4);
      this.Spinner = var5;
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
      this.Button = var1.CustomSpinner(
         32
      );
      this.CustomSpinner = var1.CustomSpinner();
      this.ButtonAction = var1.readUnsignedByte();
      if (this.Button.equals("EntityHorse")) {
         this.Spinner = var1.readInt();
      }
   }

   @Override
   public void Button(
      LfZTvlpvtfpqdXBRQcpwEVcD5DJAHNXLq1vR03uvcQx2UYuaKocglsNzIec4U3Pt8HvzbZYmVwW4qp97ksdsccBVU4wkiTErBbjx var1
   ) {
      var1.writeByte(this.BatModClient);
      var1.BatModClient(
         this.Button
      );
      var1.BatModClient(
         this.CustomSpinner
      );
      var1.writeByte(this.ButtonAction);
      if (this.Button.equals("EntityHorse")) {
         var1.writeInt(this.Spinner);
      }
   }

   public int BatModClient() {
      return this.BatModClient;
   }

   public String Button() {
      return this.Button;
   }

   public WeTqa0g0NbkXZOZDrvSeeDCHHN7RPZ9gR2j4c4e9IpymEt17UQor6B2FDPaiPIcNX5cuF15DrhMPMyE1uzL2mO8ZpMjwpJby4mVY CustomSpinner() {
      return this.CustomSpinner;
   }

   public int ButtonAction() {
      return this.ButtonAction;
   }

   public int Spinner() {
      return this.Spinner;
   }

   public boolean Checkbox() {
      return this.ButtonAction > 0;
   }
}
