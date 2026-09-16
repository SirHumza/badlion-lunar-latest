package org.java_websocket;

import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLEngineResult.HandshakeStatus;
import javax.net.ssl.SSLEngineResult.Status;
import org.java_websocket.interfaces.ISSLChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SSLSocketChannel2 implements ByteChannel, WrappedByteChannel, ISSLChannel {
   protected static ByteBuffer emptybuffer = ByteBuffer.allocate(0);
   private final Logger log = LoggerFactory.getLogger(SSLSocketChannel2.class);
   protected ExecutorService exec;
   protected List<Future<?>> tasks;
   protected ByteBuffer inData;
   protected ByteBuffer outCrypt;
   protected ByteBuffer inCrypt;
   protected SocketChannel socketChannel;
   protected SelectionKey selectionKey;
   protected SSLEngine sslEngine;
   protected SSLEngineResult readEngineResult;
   protected SSLEngineResult writeEngineResult;
   protected int bufferallocations = 0;
   private byte[] saveCryptData = null;

   public SSLSocketChannel2(SocketChannel var1, SSLEngine var2, ExecutorService var3, SelectionKey var4) {
      if (var1 != null && var2 != null && var3 != null) {
         this.socketChannel = var1;
         this.sslEngine = var2;
         this.exec = var3;
         this.readEngineResult = this.writeEngineResult = new SSLEngineResult(Status.BUFFER_UNDERFLOW, var2.getHandshakeStatus(), 0, 0);
         this.tasks = new ArrayList<>(3);
         if (var4 != null) {
            var4.interestOps(var4.interestOps() | 4);
            this.selectionKey = var4;
         }

         this.createBuffers(var2.getSession());
         this.socketChannel.write(this.wrap(emptybuffer));
         this.processHandshake();
      } else {
         throw new IllegalArgumentException("parameter must not be null");
      }
   }

   private void consumeFutureUninterruptible(Future<?> var1) {
      try {
         while (true) {
            try {
               var1.get();
               return;
            } catch (InterruptedException var3) {
               Thread.currentThread().interrupt();
            }
         }
      } catch (ExecutionException var4) {
         throw new RuntimeException(var4);
      }
   }

   private synchronized void processHandshake() {
      if (this.sslEngine.getHandshakeStatus() != HandshakeStatus.NOT_HANDSHAKING) {
         if (!this.tasks.isEmpty()) {
            Iterator var1 = this.tasks.iterator();

            while (var1.hasNext()) {
               Future var2 = (Future)var1.next();
               if (!var2.isDone()) {
                  if (this.isBlocking()) {
                     this.consumeFutureUninterruptible(var2);
                  }

                  return;
               }

               var1.remove();
            }
         }

         if (this.sslEngine.getHandshakeStatus() == HandshakeStatus.NEED_UNWRAP) {
            if (!this.isBlocking() || this.readEngineResult.getStatus() == Status.BUFFER_UNDERFLOW) {
               this.inCrypt.compact();
               int var3 = this.socketChannel.read(this.inCrypt);
               if (var3 == -1) {
                  throw new IOException("connection closed unexpectedly by peer");
               }

               ((Buffer)this.inCrypt).flip();
            }

            this.inData.compact();
            this.unwrap();
            if (this.readEngineResult.getHandshakeStatus() == HandshakeStatus.FINISHED) {
               this.createBuffers(this.sslEngine.getSession());
               return;
            }
         }

         this.consumeDelegatedTasks();
         if (this.tasks.isEmpty() || this.sslEngine.getHandshakeStatus() == HandshakeStatus.NEED_WRAP) {
            this.socketChannel.write(this.wrap(emptybuffer));
            if (this.writeEngineResult.getHandshakeStatus() == HandshakeStatus.FINISHED) {
               this.createBuffers(this.sslEngine.getSession());
               return;
            }
         }

         assert this.sslEngine.getHandshakeStatus() != HandshakeStatus.NOT_HANDSHAKING;
         this.bufferallocations = 1;
      }
   }

   private synchronized ByteBuffer wrap(ByteBuffer var1) {
      this.outCrypt.compact();
      this.writeEngineResult = this.sslEngine.wrap(var1, this.outCrypt);
      ((Buffer)this.outCrypt).flip();
      return this.outCrypt;
   }

   private synchronized ByteBuffer unwrap() {
      if (this.readEngineResult.getStatus() == Status.CLOSED && this.sslEngine.getHandshakeStatus() == HandshakeStatus.NOT_HANDSHAKING) {
         try {
            this.close();
         } catch (IOException var3) {
         }
      }

      int var1;
      do {
         var1 = this.inData.remaining();
         this.readEngineResult = this.sslEngine.unwrap(this.inCrypt, this.inData);
      } while (
         this.readEngineResult.getStatus() == Status.OK
            && (var1 != this.inData.remaining() || this.sslEngine.getHandshakeStatus() == HandshakeStatus.NEED_UNWRAP)
      );

      ((Buffer)this.inData).flip();
      return this.inData;
   }

   protected void consumeDelegatedTasks() {
      Runnable var1;
      while ((var1 = this.sslEngine.getDelegatedTask()) != null) {
         this.tasks.add(this.exec.submit(var1));
      }
   }

   protected void createBuffers(SSLSession var1) {
      this.saveCryptedData();
      int var2 = var1.getPacketBufferSize();
      int var3 = Math.max(var1.getApplicationBufferSize(), var2);
      if (this.inData == null) {
         this.inData = ByteBuffer.allocate(var3);
         this.outCrypt = ByteBuffer.allocate(var2);
         this.inCrypt = ByteBuffer.allocate(var2);
      } else {
         if (this.inData.capacity() != var3) {
            this.inData = ByteBuffer.allocate(var3);
         }

         if (this.outCrypt.capacity() != var2) {
            this.outCrypt = ByteBuffer.allocate(var2);
         }

         if (this.inCrypt.capacity() != var2) {
            this.inCrypt = ByteBuffer.allocate(var2);
         }
      }

      if (this.inData.remaining() != 0 && this.log.isTraceEnabled()) {
         this.log.trace(new String(this.inData.array(), this.inData.position(), this.inData.remaining()));
      }

      ((Buffer)this.inData).rewind();
      ((Buffer)this.inData).flip();
      if (this.inCrypt.remaining() != 0 && this.log.isTraceEnabled()) {
         this.log.trace(new String(this.inCrypt.array(), this.inCrypt.position(), this.inCrypt.remaining()));
      }

      ((Buffer)this.inCrypt).rewind();
      ((Buffer)this.inCrypt).flip();
      ((Buffer)this.outCrypt).rewind();
      ((Buffer)this.outCrypt).flip();
      this.bufferallocations++;
   }

   @Override
   public int write(ByteBuffer var1) {
      if (!this.isHandShakeComplete()) {
         this.processHandshake();
         return 0;
      } else {
         int var2 = this.socketChannel.write(this.wrap(var1));
         if (this.writeEngineResult.getStatus() == Status.CLOSED) {
            throw new EOFException("Connection is closed");
         } else {
            return var2;
         }
      }
   }

   @Override
   public int read(ByteBuffer var1) {
      this.tryRestoreCryptedData();

      while (var1.hasRemaining()) {
         if (!this.isHandShakeComplete()) {
            if (this.isBlocking()) {
               while (!this.isHandShakeComplete()) {
                  this.processHandshake();
               }
            } else {
               this.processHandshake();
               if (!this.isHandShakeComplete()) {
                  return 0;
               }
            }
         }

         int var2 = this.readRemaining(var1);
         if (var2 != 0) {
            return var2;
         }

         assert this.inData.position() == 0;
         ((Buffer)this.inData).clear();
         if (!this.inCrypt.hasRemaining()) {
            ((Buffer)this.inCrypt).clear();
         } else {
            this.inCrypt.compact();
         }

         if ((this.isBlocking() || this.readEngineResult.getStatus() == Status.BUFFER_UNDERFLOW) && this.socketChannel.read(this.inCrypt) == -1) {
            return -1;
         }

         ((Buffer)this.inCrypt).flip();
         this.unwrap();
         int var3 = this.transfereTo(this.inData, var1);
         if (var3 != 0 || !this.isBlocking()) {
            return var3;
         }
      }

      return 0;
   }

   private int readRemaining(ByteBuffer var1) {
      if (this.inData.hasRemaining()) {
         return this.transfereTo(this.inData, var1);
      }

      if (!this.inData.hasRemaining()) {
         ((Buffer)this.inData).clear();
      }

      this.tryRestoreCryptedData();
      if (this.inCrypt.hasRemaining()) {
         this.unwrap();
         int var2 = this.transfereTo(this.inData, var1);
         if (this.readEngineResult.getStatus() == Status.CLOSED) {
            return -1;
         }

         if (var2 > 0) {
            return var2;
         }
      }

      return 0;
   }

   public boolean isConnected() {
      return this.socketChannel.isConnected();
   }

   @Override
   public void close() {
      this.sslEngine.closeOutbound();
      this.sslEngine.getSession().invalidate();
      if (this.socketChannel.isOpen()) {
         this.socketChannel.write(this.wrap(emptybuffer));
      }

      this.socketChannel.close();
   }

   private boolean isHandShakeComplete() {
      HandshakeStatus var1 = this.sslEngine.getHandshakeStatus();
      return var1 == HandshakeStatus.FINISHED || var1 == HandshakeStatus.NOT_HANDSHAKING;
   }

   public SelectableChannel configureBlocking(boolean var1) {
      return this.socketChannel.configureBlocking(var1);
   }

   public boolean connect(SocketAddress var1) {
      return this.socketChannel.connect(var1);
   }

   public boolean finishConnect() {
      return this.socketChannel.finishConnect();
   }

   public Socket socket() {
      return this.socketChannel.socket();
   }

   public boolean isInboundDone() {
      return this.sslEngine.isInboundDone();
   }

   @Override
   public boolean isOpen() {
      return this.socketChannel.isOpen();
   }

   @Override
   public boolean isNeedWrite() {
      return this.outCrypt.hasRemaining() || !this.isHandShakeComplete();
   }

   @Override
   public void writeMore() {
      this.write(this.outCrypt);
   }

   @Override
   public boolean isNeedRead() {
      return this.saveCryptData != null
         || this.inData.hasRemaining()
         || this.inCrypt.hasRemaining() && this.readEngineResult.getStatus() != Status.BUFFER_UNDERFLOW && this.readEngineResult.getStatus() != Status.CLOSED;
   }

   @Override
   public int readMore(ByteBuffer var1) {
      return this.readRemaining(var1);
   }

   private int transfereTo(ByteBuffer var1, ByteBuffer var2) {
      int var3 = var1.remaining();
      int var4 = var2.remaining();
      if (var3 <= var4) {
         var2.put(var1);
         return var3;
      }

      int var5 = Math.min(var3, var4);

      for (int var6 = 0; var6 < var5; var6++) {
         var2.put(var1.get());
      }

      return var5;
   }

   @Override
   public boolean isBlocking() {
      return this.socketChannel.isBlocking();
   }

   @Override
   public SSLEngine getSSLEngine() {
      return this.sslEngine;
   }

   private void saveCryptedData() {
      if (this.inCrypt != null && this.inCrypt.remaining() > 0) {
         int var1 = this.inCrypt.remaining();
         this.saveCryptData = new byte[var1];
         this.inCrypt.get(this.saveCryptData);
      }
   }

   private void tryRestoreCryptedData() {
      if (this.saveCryptData != null) {
         ((Buffer)this.inCrypt).clear();
         this.inCrypt.put(this.saveCryptData);
         ((Buffer)this.inCrypt).flip();
         this.saveCryptData = null;
      }
   }
}
