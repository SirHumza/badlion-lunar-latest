package org.java_websocket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import javax.net.ssl.SSLSession;
import org.java_websocket.drafts.Draft;
import org.java_websocket.drafts.Draft_6455;
import org.java_websocket.enums.CloseHandshakeType;
import org.java_websocket.enums.HandshakeState;
import org.java_websocket.enums.Opcode;
import org.java_websocket.enums.ReadyState;
import org.java_websocket.enums.Role;
import org.java_websocket.exceptions.IncompleteHandshakeException;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.exceptions.InvalidHandshakeException;
import org.java_websocket.exceptions.LimitExceededException;
import org.java_websocket.exceptions.WebsocketNotConnectedException;
import org.java_websocket.framing.CloseFrame;
import org.java_websocket.framing.Framedata;
import org.java_websocket.framing.PingFrame;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.handshake.ClientHandshakeBuilder;
import org.java_websocket.handshake.Handshakedata;
import org.java_websocket.handshake.ServerHandshake;
import org.java_websocket.handshake.ServerHandshakeBuilder;
import org.java_websocket.interfaces.ISSLChannel;
import org.java_websocket.server.WebSocketServer;
import org.java_websocket.util.Charsetfunctions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WebSocketImpl implements WebSocket {
   public static final int DEFAULT_PORT = 80;
   public static final int DEFAULT_WSS_PORT = 443;
   public static final int RCVBUF = 16384;
   private final Logger log = LoggerFactory.getLogger(WebSocketImpl.class);
   public final BlockingQueue<ByteBuffer> outQueue;
   public final BlockingQueue<ByteBuffer> inQueue;
   private final WebSocketListener wsl;
   private SelectionKey key;
   private ByteChannel channel;
   private WebSocketServer.WebSocketWorker workerThread;
   private boolean flushandclosestate = false;
   private volatile ReadyState readyState = ReadyState.NOT_YET_CONNECTED;
   private List<Draft> knownDrafts;
   private Draft draft = null;
   private Role role;
   private ByteBuffer tmpHandshakeBytes = ByteBuffer.allocate(0);
   private ClientHandshake handshakerequest = null;
   private String closemessage = null;
   private Integer closecode = null;
   private Boolean closedremotely = null;
   private String resourceDescriptor = null;
   private long lastPong = System.nanoTime();
   private final Object synchronizeWriteObject = new Object();
   private Object attachment;

   public WebSocketImpl(WebSocketListener var1, List<Draft> var2) {
      this(var1, (Draft)null);
      this.role = Role.SERVER;
      if (var2 != null && !var2.isEmpty()) {
         this.knownDrafts = var2;
      } else {
         this.knownDrafts = new ArrayList<>();
         this.knownDrafts.add(new Draft_6455());
      }
   }

   public WebSocketImpl(WebSocketListener var1, Draft var2) {
      if (var1 != null && (var2 != null || this.role != Role.SERVER)) {
         this.outQueue = new LinkedBlockingQueue<>();
         this.inQueue = new LinkedBlockingQueue<>();
         this.wsl = var1;
         this.role = Role.CLIENT;
         if (var2 != null) {
            this.draft = var2.copyInstance();
         }
      } else {
         throw new IllegalArgumentException("parameters must not be null");
      }
   }

   public void decode(ByteBuffer var1) {
      assert var1.hasRemaining();
      this.log
         .trace(
            "process({}): ({})", var1.remaining(), var1.remaining() > 1000 ? "too big to display" : new String(var1.array(), var1.position(), var1.remaining())
         );
      if (this.readyState != ReadyState.NOT_YET_CONNECTED) {
         if (this.readyState == ReadyState.OPEN) {
            this.decodeFrames(var1);
         }
      } else if (this.decodeHandshake(var1) && !this.isClosing() && !this.isClosed()) {
         assert this.tmpHandshakeBytes.hasRemaining() != var1.hasRemaining() || !var1.hasRemaining();
         if (var1.hasRemaining()) {
            this.decodeFrames(var1);
         } else if (this.tmpHandshakeBytes.hasRemaining()) {
            this.decodeFrames(this.tmpHandshakeBytes);
         }
      }
   }

   private boolean decodeHandshake(ByteBuffer var1) {
      ByteBuffer var2;
      if (this.tmpHandshakeBytes.capacity() == 0) {
         var2 = var1;
      } else {
         if (this.tmpHandshakeBytes.remaining() < var1.remaining()) {
            ByteBuffer var3 = ByteBuffer.allocate(this.tmpHandshakeBytes.capacity() + var1.remaining());
            ((Buffer)this.tmpHandshakeBytes).flip();
            var3.put(this.tmpHandshakeBytes);
            this.tmpHandshakeBytes = var3;
         }

         this.tmpHandshakeBytes.put(var1);
         ((Buffer)this.tmpHandshakeBytes).flip();
         var2 = this.tmpHandshakeBytes;
      }

      ((Buffer)var2).mark();

      try {
         try {
            if (this.role == Role.SERVER) {
               if (this.draft != null) {
                  Handshakedata var22 = this.draft.translateHandshake(var2);
                  if (!(var22 instanceof ClientHandshake)) {
                     this.log.trace("Closing due to protocol error: wrong http function");
                     this.flushAndClose(1002, "wrong http function", false);
                     return false;
                  }

                  ClientHandshake var25 = (ClientHandshake)var22;
                  HandshakeState var19 = this.draft.acceptHandshakeAsServer(var25);
                  if (var19 == HandshakeState.MATCHED) {
                     this.open(var25);
                     return true;
                  }

                  this.log.trace("Closing due to protocol error: the handshake did finally not match");
                  this.close(1002, "the handshake did finally not match");
                  return false;
               }

               for (Draft var23 : this.knownDrafts) {
                  var23 = var23.copyInstance();

                  try {
                     var23.setParseMode(this.role);
                     ((Buffer)var2).reset();
                     Handshakedata var6 = var23.translateHandshake(var2);
                     if (!(var6 instanceof ClientHandshake)) {
                        this.log.trace("Closing due to wrong handshake");
                        this.closeConnectionDueToWrongHandshake(new InvalidDataException(1002, "wrong http function"));
                        return false;
                     }

                     ClientHandshake var7 = (ClientHandshake)var6;
                     HandshakeState var18 = var23.acceptHandshakeAsServer(var7);
                     if (var18 == HandshakeState.MATCHED) {
                        this.resourceDescriptor = var7.getResourceDescriptor();

                        ServerHandshakeBuilder var8;
                        try {
                           var8 = this.wsl.onWebsocketHandshakeReceivedAsServer(this, var23, var7);
                        } catch (InvalidDataException var12) {
                           this.log.trace("Closing due to wrong handshake. Possible handshake rejection", var12);
                           this.closeConnectionDueToWrongHandshake(var12);
                           return false;
                        } catch (RuntimeException var13) {
                           this.log.error("Closing due to internal server error", var13);
                           this.wsl.onWebsocketError(this, var13);
                           this.closeConnectionDueToInternalServerError(var13);
                           return false;
                        }

                        this.write(var23.createHandshake(var23.postProcessHandshakeResponseAsServer(var7, var8)));
                        this.draft = var23;
                        this.open(var7);
                        return true;
                     }
                  } catch (InvalidHandshakeException var14) {
                  }
               }

               if (this.draft == null) {
                  this.log.trace("Closing due to protocol error: no draft matches");
                  this.closeConnectionDueToWrongHandshake(new InvalidDataException(1002, "no draft matches"));
               }

               return false;
            }

            if (this.role == Role.CLIENT) {
               this.draft.setParseMode(this.role);
               Handshakedata var20 = this.draft.translateHandshake(var2);
               if (!(var20 instanceof ServerHandshake)) {
                  this.log.trace("Closing due to protocol error: wrong http function");
                  this.flushAndClose(1002, "wrong http function", false);
                  return false;
               }

               ServerHandshake var5 = (ServerHandshake)var20;
               HandshakeState var17 = this.draft.acceptHandshakeAsClient(this.handshakerequest, var5);
               if (var17 == HandshakeState.MATCHED) {
                  try {
                     this.wsl.onWebsocketHandshakeReceivedAsClient(this, this.handshakerequest, var5);
                  } catch (InvalidDataException var10) {
                     this.log.trace("Closing due to invalid data exception. Possible handshake rejection", var10);
                     this.flushAndClose(var10.getCloseCode(), var10.getMessage(), false);
                     return false;
                  } catch (RuntimeException var11) {
                     this.log.error("Closing since client was never connected", var11);
                     this.wsl.onWebsocketError(this, var11);
                     this.flushAndClose(-1, var11.getMessage(), false);
                     return false;
                  }

                  this.open(var5);
                  return true;
               }

               this.log.trace("Closing due to protocol error: draft {} refuses handshake", this.draft);
               this.close(1002, "draft " + this.draft + " refuses handshake");
            }
         } catch (InvalidHandshakeException var15) {
            this.log.trace("Closing due to invalid handshake", var15);
            this.close(var15);
         }
      } catch (IncompleteHandshakeException var16) {
         if (this.tmpHandshakeBytes.capacity() == 0) {
            ((Buffer)var2).reset();
            int var4 = var16.getPreferredSize();
            if (var4 == 0) {
               var4 = var2.capacity() + 16;
            } else {
               assert var16.getPreferredSize() >= var2.remaining();
            }

            this.tmpHandshakeBytes = ByteBuffer.allocate(var4);
            this.tmpHandshakeBytes.put(var1);
         } else {
            ((Buffer)this.tmpHandshakeBytes).position(this.tmpHandshakeBytes.limit());
            ((Buffer)this.tmpHandshakeBytes).limit(this.tmpHandshakeBytes.capacity());
         }
      }

      return false;
   }

   private void decodeFrames(ByteBuffer var1) {
      try {
         for (Framedata var4 : this.draft.translateFrame(var1)) {
            this.log.trace("matched frame: {}", var4);
            this.draft.processFrame(this, var4);
         }
      } catch (LimitExceededException var5) {
         if (var5.getLimit() == Integer.MAX_VALUE) {
            this.log.error("Closing due to invalid size of frame", var5);
            this.wsl.onWebsocketError(this, var5);
         }

         this.close(var5);
      } catch (InvalidDataException var6) {
         this.log.error("Closing due to invalid data in frame", var6);
         this.wsl.onWebsocketError(this, var6);
         this.close(var6);
      }
   }

   private void closeConnectionDueToWrongHandshake(InvalidDataException var1) {
      this.write(this.generateHttpResponseDueToError(404));
      this.flushAndClose(var1.getCloseCode(), var1.getMessage(), false);
   }

   private void closeConnectionDueToInternalServerError(RuntimeException var1) {
      this.write(this.generateHttpResponseDueToError(500));
      this.flushAndClose(-1, var1.getMessage(), false);
   }

   private ByteBuffer generateHttpResponseDueToError(int var1) {
      String var2;
      switch (var1) {
         case 404:
            var2 = "404 WebSocket Upgrade Failure";
            break;
         case 500:
         default:
            var2 = "500 Internal Server Error";
      }

      return ByteBuffer.wrap(
         Charsetfunctions.asciiBytes(
            "HTTP/1.1 "
               + var2
               + "\r\nContent-Type: text/html\nServer: TooTallNate Java-WebSocket\r\nContent-Length: "
               + (48 + var2.length())
               + "\r\n\r\n<html><head></head><body><h1>"
               + var2
               + "</h1></body></html>"
         )
      );
   }

   public synchronized void close(int var1, String var2, boolean var3) {
      if (this.readyState != ReadyState.CLOSING && this.readyState != ReadyState.CLOSED) {
         if (this.readyState == ReadyState.OPEN) {
            if (var1 == 1006) {
               assert !var3;
               this.readyState = ReadyState.CLOSING;
               this.flushAndClose(var1, var2, false);
               return;
            }

            if (this.draft.getCloseHandshakeType() != CloseHandshakeType.NONE) {
               try {
                  if (!var3) {
                     try {
                        this.wsl.onWebsocketCloseInitiated(this, var1, var2);
                     } catch (RuntimeException var5) {
                        this.wsl.onWebsocketError(this, var5);
                     }
                  }

                  if (this.isOpen()) {
                     CloseFrame var4 = new CloseFrame();
                     var4.setReason(var2);
                     var4.setCode(var1);
                     var4.isValid();
                     this.sendFrame(var4);
                  }
               } catch (InvalidDataException var6) {
                  this.log.error("generated frame is invalid", var6);
                  this.wsl.onWebsocketError(this, var6);
                  this.flushAndClose(1006, "generated frame is invalid", false);
               }
            }

            this.flushAndClose(var1, var2, var3);
         } else if (var1 == -3) {
            assert var3;
            this.flushAndClose(-3, var2, true);
         } else if (var1 == 1002) {
            this.flushAndClose(var1, var2, var3);
         } else {
            this.flushAndClose(-1, var2, false);
         }

         this.readyState = ReadyState.CLOSING;
         this.tmpHandshakeBytes = null;
      }
   }

   @Override
   public void close(int var1, String var2) {
      this.close(var1, var2, false);
   }

   public synchronized void closeConnection(int var1, String var2, boolean var3) {
      if (this.readyState != ReadyState.CLOSED) {
         if (this.readyState == ReadyState.OPEN && var1 == 1006) {
            this.readyState = ReadyState.CLOSING;
         }

         if (this.key != null) {
            this.key.cancel();
         }

         if (this.channel != null) {
            try {
               this.channel.close();
            } catch (IOException var6) {
               if (var6.getMessage() != null && var6.getMessage().equals("Broken pipe")) {
                  this.log.trace("Caught IOException: Broken pipe during closeConnection()", var6);
               } else {
                  this.log.error("Exception during channel.close()", var6);
                  this.wsl.onWebsocketError(this, var6);
               }
            }
         }

         try {
            this.wsl.onWebsocketClose(this, var1, var2, var3);
         } catch (RuntimeException var5) {
            this.wsl.onWebsocketError(this, var5);
         }

         if (this.draft != null) {
            this.draft.reset();
         }

         this.handshakerequest = null;
         this.readyState = ReadyState.CLOSED;
      }
   }

   protected void closeConnection(int var1, boolean var2) {
      this.closeConnection(var1, "", var2);
   }

   public void closeConnection() {
      if (this.closedremotely == null) {
         throw new IllegalStateException("this method must be used in conjunction with flushAndClose");
      }

      this.closeConnection(this.closecode, this.closemessage, this.closedremotely);
   }

   @Override
   public void closeConnection(int var1, String var2) {
      this.closeConnection(var1, var2, false);
   }

   public synchronized void flushAndClose(int var1, String var2, boolean var3) {
      if (!this.flushandclosestate) {
         this.closecode = var1;
         this.closemessage = var2;
         this.closedremotely = var3;
         this.flushandclosestate = true;
         this.wsl.onWriteDemand(this);

         try {
            this.wsl.onWebsocketClosing(this, var1, var2, var3);
         } catch (RuntimeException var5) {
            this.log.error("Exception in onWebsocketClosing", var5);
            this.wsl.onWebsocketError(this, var5);
         }

         if (this.draft != null) {
            this.draft.reset();
         }

         this.handshakerequest = null;
      }
   }

   public void eot() {
      if (this.readyState == ReadyState.NOT_YET_CONNECTED) {
         this.closeConnection(-1, true);
      } else if (this.flushandclosestate) {
         this.closeConnection(this.closecode, this.closemessage, this.closedremotely);
      } else if (this.draft.getCloseHandshakeType() == CloseHandshakeType.NONE) {
         this.closeConnection(1000, true);
      } else if (this.draft.getCloseHandshakeType() == CloseHandshakeType.ONEWAY) {
         if (this.role == Role.SERVER) {
            this.closeConnection(1006, true);
         } else {
            this.closeConnection(1000, true);
         }
      } else {
         this.closeConnection(1006, true);
      }
   }

   @Override
   public void close(int var1) {
      this.close(var1, "", false);
   }

   public void close(InvalidDataException var1) {
      this.close(var1.getCloseCode(), var1.getMessage(), false);
   }

   @Override
   public void send(String var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
      }

      this.send(this.draft.createFrames(var1, this.role == Role.CLIENT));
   }

   @Override
   public void send(ByteBuffer var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
      }

      this.send(this.draft.createFrames(var1, this.role == Role.CLIENT));
   }

   @Override
   public void send(byte[] var1) {
      this.send(ByteBuffer.wrap(var1));
   }

   private void send(Collection<Framedata> var1) {
      if (!this.isOpen()) {
         throw new WebsocketNotConnectedException();
      }

      if (var1 == null) {
         throw new IllegalArgumentException();
      }

      ArrayList var2 = new ArrayList();

      for (Framedata var4 : var1) {
         this.log.trace("send frame: {}", var4);
         var2.add(this.draft.createBinaryFrame(var4));
      }

      this.write(var2);
   }

   @Override
   public void sendFragmentedFrame(Opcode var1, ByteBuffer var2, boolean var3) {
      this.send(this.draft.continuousFrame(var1, var2, var3));
   }

   @Override
   public void sendFrame(Collection<Framedata> var1) {
      this.send(var1);
   }

   @Override
   public void sendFrame(Framedata var1) {
      this.send(Collections.singletonList(var1));
   }

   @Override
   public void sendPing() {
      PingFrame var1 = this.wsl.onPreparePing(this);
      if (var1 == null) {
         throw new NullPointerException("onPreparePing(WebSocket) returned null. PingFrame to sent can't be null.");
      }

      this.sendFrame(var1);
   }

   @Override
   public boolean hasBufferedData() {
      return !this.outQueue.isEmpty();
   }

   public void startHandshake(ClientHandshakeBuilder var1) {
      this.handshakerequest = this.draft.postProcessHandshakeRequestAsClient(var1);
      this.resourceDescriptor = var1.getResourceDescriptor();
      assert this.resourceDescriptor != null;

      try {
         this.wsl.onWebsocketHandshakeSentAsClient(this, this.handshakerequest);
      } catch (InvalidDataException var3) {
         throw new InvalidHandshakeException("Handshake data rejected by client.");
      } catch (RuntimeException var4) {
         this.log.error("Exception in startHandshake", var4);
         this.wsl.onWebsocketError(this, var4);
         throw new InvalidHandshakeException("rejected because of " + var4);
      }

      this.write(this.draft.createHandshake(this.handshakerequest));
   }

   private void write(ByteBuffer var1) {
      this.log.trace("write({}): {}", var1.remaining(), var1.remaining() > 1000 ? "too big to display" : new String(var1.array()));
      this.outQueue.add(var1);
      this.wsl.onWriteDemand(this);
   }

   private void write(List<ByteBuffer> var1) {
      synchronized (this.synchronizeWriteObject) {
         for (ByteBuffer var4 : var1) {
            this.write(var4);
         }
      }
   }

   private void open(Handshakedata var1) {
      this.log.trace("open using draft: {}", this.draft);
      this.readyState = ReadyState.OPEN;

      try {
         this.wsl.onWebsocketOpen(this, var1);
      } catch (RuntimeException var3) {
         this.wsl.onWebsocketError(this, var3);
      }
   }

   @Override
   public boolean isOpen() {
      return this.readyState == ReadyState.OPEN;
   }

   @Override
   public boolean isClosing() {
      return this.readyState == ReadyState.CLOSING;
   }

   @Override
   public boolean isFlushAndClose() {
      return this.flushandclosestate;
   }

   @Override
   public boolean isClosed() {
      return this.readyState == ReadyState.CLOSED;
   }

   @Override
   public ReadyState getReadyState() {
      return this.readyState;
   }

   public void setSelectionKey(SelectionKey var1) {
      this.key = var1;
   }

   public SelectionKey getSelectionKey() {
      return this.key;
   }

   @Override
   public String toString() {
      return super.toString();
   }

   @Override
   public InetSocketAddress getRemoteSocketAddress() {
      return this.wsl.getRemoteSocketAddress(this);
   }

   @Override
   public InetSocketAddress getLocalSocketAddress() {
      return this.wsl.getLocalSocketAddress(this);
   }

   @Override
   public Draft getDraft() {
      return this.draft;
   }

   @Override
   public void close() {
      this.close(1000);
   }

   @Override
   public String getResourceDescriptor() {
      return this.resourceDescriptor;
   }

   long getLastPong() {
      return this.lastPong;
   }

   public void updateLastPong() {
      this.lastPong = System.nanoTime();
   }

   public WebSocketListener getWebSocketListener() {
      return this.wsl;
   }

   @Override
   public <T> T getAttachment() {
      return (T)this.attachment;
   }

   @Override
   public boolean hasSSLSupport() {
      return this.channel instanceof ISSLChannel;
   }

   @Override
   public SSLSession getSSLSession() {
      if (!this.hasSSLSupport()) {
         throw new IllegalArgumentException("This websocket uses ws instead of wss. No SSLSession available.");
      } else {
         return ((ISSLChannel)this.channel).getSSLEngine().getSession();
      }
   }

   @Override
   public <T> void setAttachment(T var1) {
      this.attachment = var1;
   }

   public ByteChannel getChannel() {
      return this.channel;
   }

   public void setChannel(ByteChannel var1) {
      this.channel = var1;
   }

   public WebSocketServer.WebSocketWorker getWorkerThread() {
      return this.workerThread;
   }

   public void setWorkerThread(WebSocketServer.WebSocketWorker var1) {
      this.workerThread = var1;
   }
}
