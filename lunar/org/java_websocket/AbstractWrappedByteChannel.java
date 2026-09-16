package org.java_websocket;

import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SocketChannel;

@Deprecated
public class AbstractWrappedByteChannel implements WrappedByteChannel {
   private final ByteChannel channel;

   @Deprecated
   public AbstractWrappedByteChannel(ByteChannel var1) {
      this.channel = var1;
   }

   @Deprecated
   public AbstractWrappedByteChannel(WrappedByteChannel var1) {
      this.channel = var1;
   }

   @Override
   public int read(ByteBuffer var1) {
      return this.channel.read(var1);
   }

   @Override
   public boolean isOpen() {
      return this.channel.isOpen();
   }

   @Override
   public void close() {
      this.channel.close();
   }

   @Override
   public int write(ByteBuffer var1) {
      return this.channel.write(var1);
   }

   @Override
   public boolean isNeedWrite() {
      return this.channel instanceof WrappedByteChannel && ((WrappedByteChannel)this.channel).isNeedWrite();
   }

   @Override
   public void writeMore() {
      if (this.channel instanceof WrappedByteChannel) {
         ((WrappedByteChannel)this.channel).writeMore();
      }
   }

   @Override
   public boolean isNeedRead() {
      return this.channel instanceof WrappedByteChannel && ((WrappedByteChannel)this.channel).isNeedRead();
   }

   @Override
   public int readMore(ByteBuffer var1) {
      return this.channel instanceof WrappedByteChannel ? ((WrappedByteChannel)this.channel).readMore(var1) : 0;
   }

   @Override
   public boolean isBlocking() {
      if (this.channel instanceof SocketChannel) {
         return ((SocketChannel)this.channel).isBlocking();
      } else {
         return this.channel instanceof WrappedByteChannel ? ((WrappedByteChannel)this.channel).isBlocking() : false;
      }
   }
}
