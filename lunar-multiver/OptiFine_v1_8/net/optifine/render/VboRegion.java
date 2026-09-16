package net.optifine.render;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import net.optifine.util.LinkedList;

public class VboRegion {
   private adf layer = null;
   private int glBufferId = bqs.e();
   private int capacity = 4096;
   private int positionTop = 0;
   private int sizeUsed;
   private LinkedList<VboRange> rangeList = new LinkedList<>();
   private VboRange compactRangeLast = null;
   private IntBuffer bufferIndexVertex = Config.createDirectIntBuffer(this.capacity);
   private IntBuffer bufferCountVertex = Config.createDirectIntBuffer(this.capacity);
   private int drawMode = 7;
   private final int vertexBytes = bms.a.g();

   public VboRegion(adf layer) {
      this.layer = layer;
      this.bindBuffer();
      long capacityBytes = this.toBytes(this.capacity);
      bqs.glBufferData(bqs.R, capacityBytes, bqs.S);
      this.unbindBuffer();
   }

   public void bufferData(ByteBuffer data, VboRange range) {
      int posOld = range.getPosition();
      int sizeOld = range.getSize();
      int sizeNew = this.toVertex(data.limit());
      if (sizeNew <= 0) {
         if (posOld >= 0) {
            range.setPosition(-1);
            range.setSize(0);
            this.rangeList.remove(range.getNode());
            this.sizeUsed -= sizeOld;
         }
      } else {
         if (sizeNew > sizeOld) {
            range.setPosition(this.positionTop);
            range.setSize(sizeNew);
            this.positionTop += sizeNew;
            if (posOld >= 0) {
               this.rangeList.remove(range.getNode());
            }

            this.rangeList.addLast(range.getNode());
         }

         range.setSize(sizeNew);
         this.sizeUsed += sizeNew - sizeOld;
         this.checkVboSize(range.getPositionNext());
         long positionBytes = this.toBytes(range.getPosition());
         this.bindBuffer();
         bqs.glBufferSubData(bqs.R, positionBytes, data);
         this.unbindBuffer();
         if (this.positionTop > this.sizeUsed * 11 / 10) {
            this.compactRanges(1);
         }
      }
   }

   private void compactRanges(int countMax) {
      if (!this.rangeList.isEmpty()) {
         VboRange range = this.compactRangeLast;
         if (range == null || !this.rangeList.contains(range.getNode())) {
            range = this.rangeList.getFirst().getItem();
         }

         int posCompact = range.getPosition();
         VboRange rangePrev = range.getPrev();
         if (rangePrev == null) {
            posCompact = 0;
         } else {
            posCompact = rangePrev.getPositionNext();
         }

         int count = 0;

         while (range != null && count < countMax) {
            count++;
            if (range.getPosition() == posCompact) {
               posCompact += range.getSize();
               range = range.getNext();
            } else {
               int sizeFree = range.getPosition() - posCompact;
               if (range.getSize() <= sizeFree) {
                  this.copyVboData(range.getPosition(), posCompact, range.getSize());
                  range.setPosition(posCompact);
                  posCompact += range.getSize();
                  range = range.getNext();
               } else {
                  this.checkVboSize(this.positionTop + range.getSize());
                  this.copyVboData(range.getPosition(), this.positionTop, range.getSize());
                  range.setPosition(this.positionTop);
                  this.positionTop = this.positionTop + range.getSize();
                  VboRange rangeNext = range.getNext();
                  this.rangeList.remove(range.getNode());
                  this.rangeList.addLast(range.getNode());
                  range = rangeNext;
               }
            }
         }

         if (range == null) {
            this.positionTop = this.rangeList.getLast().getItem().getPositionNext();
         }

         this.compactRangeLast = range;
      }
   }

   private void checkRanges() {
      int count = 0;
      int size = 0;

      for (VboRange range = this.rangeList.getFirst().getItem(); range != null; range = range.getNext()) {
         count++;
         size += range.getSize();
         if (range.getPosition() < 0 || range.getSize() <= 0 || range.getPositionNext() > this.positionTop) {
            throw new RuntimeException("Invalid range: " + range);
         }

         VboRange rangePrev = range.getPrev();
         if (rangePrev != null && range.getPosition() < rangePrev.getPositionNext()) {
            throw new RuntimeException("Invalid range: " + range);
         }

         VboRange rangeNext = range.getNext();
         if (rangeNext != null && range.getPositionNext() > rangeNext.getPosition()) {
            throw new RuntimeException("Invalid range: " + range);
         }
      }

      if (count != this.rangeList.getSize()) {
         throw new RuntimeException("Invalid count: " + count + " <> " + this.rangeList.getSize());
      }

      if (size != this.sizeUsed) {
         throw new RuntimeException("Invalid size: " + size + " <> " + this.sizeUsed);
      }
   }

   private void checkVboSize(int sizeMin) {
      if (this.capacity < sizeMin) {
         this.expandVbo(sizeMin);
      }
   }

   private void copyVboData(int posFrom, int posTo, int size) {
      long posFromBytes = this.toBytes(posFrom);
      long posToBytes = this.toBytes(posTo);
      long sizeBytes = this.toBytes(size);
      bqs.g(bqs.GL_COPY_READ_BUFFER, this.glBufferId);
      bqs.g(bqs.GL_COPY_WRITE_BUFFER, this.glBufferId);
      bqs.glCopyBufferSubData(bqs.GL_COPY_READ_BUFFER, bqs.GL_COPY_WRITE_BUFFER, posFromBytes, posToBytes, sizeBytes);
      Config.checkGlError("Copy VBO range");
      bqs.g(bqs.GL_COPY_READ_BUFFER, 0);
      bqs.g(bqs.GL_COPY_WRITE_BUFFER, 0);
   }

   private void expandVbo(int sizeMin) {
      int capacityNew = this.capacity * 6 / 4;

      while (capacityNew < sizeMin) {
         capacityNew = capacityNew * 6 / 4;
      }

      long capacityBytes = this.toBytes(this.capacity);
      long capacityNewBytes = this.toBytes(capacityNew);
      int glBufferIdNew = bqs.e();
      bqs.g(bqs.R, glBufferIdNew);
      bqs.glBufferData(bqs.R, capacityNewBytes, bqs.S);
      Config.checkGlError("Expand VBO");
      bqs.g(bqs.R, 0);
      bqs.g(bqs.GL_COPY_READ_BUFFER, this.glBufferId);
      bqs.g(bqs.GL_COPY_WRITE_BUFFER, glBufferIdNew);
      bqs.glCopyBufferSubData(bqs.GL_COPY_READ_BUFFER, bqs.GL_COPY_WRITE_BUFFER, 0L, 0L, capacityBytes);
      Config.checkGlError("Copy VBO: " + capacityNewBytes);
      bqs.g(bqs.GL_COPY_READ_BUFFER, 0);
      bqs.g(bqs.GL_COPY_WRITE_BUFFER, 0);
      bqs.g(this.glBufferId);
      this.bufferIndexVertex = Config.createDirectIntBuffer(capacityNew);
      this.bufferCountVertex = Config.createDirectIntBuffer(capacityNew);
      this.glBufferId = glBufferIdNew;
      this.capacity = capacityNew;
   }

   public void bindBuffer() {
      bqs.g(bqs.R, this.glBufferId);
   }

   public void drawArrays(int drawMode, VboRange range) {
      if (this.drawMode != drawMode) {
         if (this.bufferIndexVertex.position() > 0) {
            throw new IllegalArgumentException("Mixed region draw modes: " + this.drawMode + " != " + drawMode);
         }

         this.drawMode = drawMode;
      }

      this.bufferIndexVertex.put(range.getPosition());
      this.bufferCountVertex.put(range.getSize());
   }

   public void finishDraw(bfy vboRenderList) {
      this.bindBuffer();
      vboRenderList.a();
      ((Buffer)this.bufferIndexVertex).flip();
      ((Buffer)this.bufferCountVertex).flip();
      bfl.glMultiDrawArrays(this.drawMode, this.bufferIndexVertex, this.bufferCountVertex);
      ((Buffer)this.bufferIndexVertex).limit(this.bufferIndexVertex.capacity());
      ((Buffer)this.bufferCountVertex).limit(this.bufferCountVertex.capacity());
      if (this.positionTop > this.sizeUsed * 11 / 10) {
         this.compactRanges(1);
      }
   }

   public void unbindBuffer() {
      bqs.g(bqs.R, 0);
   }

   public void deleteGlBuffers() {
      if (this.glBufferId >= 0) {
         bqs.g(this.glBufferId);
         this.glBufferId = -1;
      }
   }

   private long toBytes(int vertex) {
      return (long)vertex * this.vertexBytes;
   }

   private int toVertex(long bytes) {
      return (int)(bytes / this.vertexBytes);
   }

   public int getPositionTop() {
      return this.positionTop;
   }
}
