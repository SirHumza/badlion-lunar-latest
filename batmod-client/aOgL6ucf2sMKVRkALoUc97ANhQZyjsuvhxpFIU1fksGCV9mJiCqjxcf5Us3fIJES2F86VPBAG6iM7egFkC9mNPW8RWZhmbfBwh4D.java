import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import javax.crypto.Cipher;

public class aOgL6ucf2sMKVRkALoUc97ANhQZyjsuvhxpFIU1fksGCV9mJiCqjxcf5Us3fIJES2F86VPBAG6iM7egFkC9mNPW8RWZhmbfBwh4D {
   private final Cipher BatModClient;
   private byte[] Button = new byte[0];
   private byte[] CustomSpinner = new byte[0];

   protected aOgL6ucf2sMKVRkALoUc97ANhQZyjsuvhxpFIU1fksGCV9mJiCqjxcf5Us3fIJES2F86VPBAG6iM7egFkC9mNPW8RWZhmbfBwh4D(Cipher var1) {
      this.BatModClient = var1;
   }

   private byte[] BatModClient(ByteBuf var1) {
      int var2 = var1.readableBytes();
      if (this.Button.length < var2) {
         this.Button = new byte[var2];
      }

      var1.readBytes(this.Button, 0, var2);
      return this.Button;
   }

   protected ByteBuf BatModClient(
      ChannelHandlerContext var1, ByteBuf var2
   ) {
      int var3 = var2.readableBytes();
      byte[] var4 = this.BatModClient(var2);
      ByteBuf var5 = var1.alloc()
         .heapBuffer(this.BatModClient.getOutputSize(var3));
      var5.writerIndex(
         this.BatModClient
            .update(var4, 0, var3, var5.array(), var5.arrayOffset())
      );
      return var5;
   }

   protected void BatModClient(ByteBuf var1, ByteBuf var2) {
      int var3 = var1.readableBytes();
      byte[] var4 = this.BatModClient(var1);
      int var5 = this.BatModClient.getOutputSize(var3);
      if (this.CustomSpinner.length < var5) {
         this.CustomSpinner = new byte[var5];
      }

      var2.writeBytes(
         this.CustomSpinner,
         0,
         this.BatModClient
            .update(var4, 0, var3, this.CustomSpinner)
      );
   }
}
