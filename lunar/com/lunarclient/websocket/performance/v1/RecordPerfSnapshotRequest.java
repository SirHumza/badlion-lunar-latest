package com.lunarclient.websocket.performance.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class RecordPerfSnapshotRequest extends GeneratedMessageV3 implements RecordPerfSnapshotRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private int gpuMemoryStateCase_ = 0;
   private Object gpuMemoryState_;
   public static final int FPS_FIELD_NUMBER = 1;
   private int fps_ = 0;
   public static final int RENDERED_CHUNK_SECTIONS_FIELD_NUMBER = 2;
   private int renderedChunkSections_ = 0;
   public static final int LOADED_CHUNKS_FIELD_NUMBER = 3;
   private int loadedChunks_ = 0;
   public static final int RENDERED_ENTITIES_FIELD_NUMBER = 4;
   private int renderedEntities_ = 0;
   public static final int RENDERED_PLAYERS_FIELD_NUMBER = 5;
   private int renderedPlayers_ = 0;
   public static final int RENDERED_PARTICLES_FIELD_NUMBER = 6;
   private int renderedParticles_ = 0;
   public static final int RENDERED_BLOCK_ENTITIES_FIELD_NUMBER = 22;
   private int renderedBlockEntities_ = 0;
   public static final int FREE_MEMORY_KB_FIELD_NUMBER = 7;
   private int freeMemoryKb_ = 0;
   public static final int TOTAL_MEMORY_KB_FIELD_NUMBER = 8;
   private int totalMemoryKb_ = 0;
   public static final int MAX_MEMORY_KB_FIELD_NUMBER = 9;
   private int maxMemoryKb_ = 0;
   public static final int GPU_USAGE_FIELD_NUMBER = 10;
   private float gpuUsage_ = 0.0F;
   public static final int FRAMETIME_FIELD_NUMBER = 15;
   private float frametime_ = 0.0F;
   public static final int DIRECT_MEMORY_KB_FIELD_NUMBER = 17;
   private int directMemoryKb_ = 0;
   public static final int OFF_HEAP_MEMORY_KB_FIELD_NUMBER = 18;
   private int offHeapMemoryKb_ = 0;
   public static final int LUNAR_HUDS_FIELD_NUMBER = 11;
   private int lunarHuds_ = 0;
   public static final int RENDERED_GECKOLIB_COSMETICS_FIELD_NUMBER = 12;
   private int renderedGeckolibCosmetics_ = 0;
   public static final int RENDERED_COSMETICS_FIELD_NUMBER = 13;
   private int renderedCosmetics_ = 0;
   public static final int RENDERED_EMOTES_FIELD_NUMBER = 14;
   private int renderedEmotes_ = 0;
   public static final int RENDERED_TURBO_ENTITIES_FIELD_NUMBER = 16;
   private int renderedTurboEntities_ = 0;
   public static final int RENDERED_TURBO_BLOCK_ENTITIES_FIELD_NUMBER = 21;
   private int renderedTurboBlockEntities_ = 0;
   public static final int USING_EXTERNAL_SHADERS_FIELD_NUMBER = 19;
   private boolean usingExternalShaders_ = false;
   public static final int AVERAGE_FPS_FIELD_NUMBER = 20;
   private RecordPerfSnapshotRequest.AverageGroup averageFps_;
   public static final int NVIDIA_MEMORY_FIELD_NUMBER = 23;
   public static final int AMD_MEMORY_FIELD_NUMBER = 24;
   public static final int WIDTH_FIELD_NUMBER = 25;
   private int width_ = 0;
   public static final int HEIGHT_FIELD_NUMBER = 26;
   private int height_ = 0;
   public static final int FULLSCREEN_FIELD_NUMBER = 27;
   private boolean fullscreen_ = false;
   public static final int VSYNC_FIELD_NUMBER = 28;
   private boolean vsync_ = false;
   public static final int SMOOTH_LIGHTING_FIELD_NUMBER = 29;
   private boolean smoothLighting_ = false;
   public static final int ENTITY_SHADOWS_FIELD_NUMBER = 30;
   private boolean entityShadows_ = false;
   public static final int MAX_FRAMERATE_FIELD_NUMBER = 31;
   private int maxFramerate_ = 0;
   public static final int GRAPHICS_STATUS_FIELD_NUMBER = 32;
   private int graphicsStatus_ = 0;
   public static final int CHUNK_BUILDER_FIELD_NUMBER = 33;
   private int chunkBuilder_ = 0;
   public static final int CLOUDS_FIELD_NUMBER = 34;
   private int clouds_ = 0;
   public static final int PARTICLES_FIELD_NUMBER = 35;
   private int particles_ = 0;
   public static final int RENDER_DISTANCE_FIELD_NUMBER = 36;
   private int renderDistance_ = 0;
   public static final int SIMULATED_DISTANCE_FIELD_NUMBER = 37;
   private int simulatedDistance_ = 0;
   public static final int ENTITY_DISTANCE_FIELD_NUMBER = 38;
   private int entityDistance_ = 0;
   public static final int BIOME_BLEND_FIELD_NUMBER = 39;
   private int biomeBlend_ = 0;
   public static final int FOV_FIELD_NUMBER = 40;
   private int fov_ = 0;
   public static final int HUD_CACHING_FIELD_NUMBER = 41;
   private boolean hudCaching_ = false;
   public static final int PARTICLE_PHYSICS_FIELD_NUMBER = 42;
   private boolean particlePhysics_ = false;
   public static final int LAZY_CHUNK_LOADING_FIELD_NUMBER = 43;
   private int lazyChunkLoading_ = 0;
   public static final int TURBO_ENTITIES_FIELD_NUMBER = 44;
   private boolean turboEntities_ = false;
   public static final int TURBO_ENTITIES_RATE_FIELD_NUMBER = 45;
   private int turboEntitiesRate_ = 0;
   public static final int TURBO_BLOCK_ENTITIES_FIELD_NUMBER = 46;
   private boolean turboBlockEntities_ = false;
   public static final int TURBO_BLOCK_ENTITIES_RATE_FIELD_NUMBER = 47;
   private int turboBlockEntitiesRate_ = 0;
   public static final int TURBO_BLOCK_ENTITIES_FAR_FIELD_NUMBER = 48;
   private boolean turboBlockEntitiesFar_ = false;
   public static final int GPU_NAME_FIELD_NUMBER = 49;
   private volatile Object gpuName_ = "";
   public static final int GC_CYCLES_FIELD_NUMBER = 50;
   private int gcCycles_ = 0;
   public static final int LONGEST_GC_MICRO_FIELD_NUMBER = 51;
   private int longestGcMicro_ = 0;
   public static final int SHORTEST_GC_MICRO_FIELD_NUMBER = 52;
   private int shortestGcMicro_ = 0;
   public static final int AVG_GC_MICRO_FIELD_NUMBER = 53;
   private int avgGcMicro_ = 0;
   public static final int MEDIAN_GC_MICRO_FIELD_NUMBER = 54;
   private int medianGcMicro_ = 0;
   public static final int FRAME_TIME_AVERAGE_FIELD_NUMBER = 55;
   private float frameTimeAverage_ = 0.0F;
   public static final int FRAME_TIME_FASTEST_FIELD_NUMBER = 57;
   private float frameTimeFastest_ = 0.0F;
   public static final int FRAME_TIME_SLOWEST_FIELD_NUMBER = 58;
   private float frameTimeSlowest_ = 0.0F;
   public static final int GRAPHICS_BACKEND_FIELD_NUMBER = 59;
   private volatile Object graphicsBackend_ = "";
   public static final int SODIUM_PRESENT_FIELD_NUMBER = 60;
   private boolean sodiumPresent_ = false;
   public static final int TEXTURE_FILTERING_FIELD_NUMBER = 61;
   private int textureFiltering_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final RecordPerfSnapshotRequest DEFAULT_INSTANCE = new RecordPerfSnapshotRequest();
   private static final Parser<RecordPerfSnapshotRequest> PARSER = new AbstractParser<RecordPerfSnapshotRequest>() {
      public RecordPerfSnapshotRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         RecordPerfSnapshotRequest.Builder var3 = RecordPerfSnapshotRequest.newBuilder();

         try {
            var3.mergeFrom(var1, var2);
         } catch (InvalidProtocolBufferException var5) {
            throw var5.setUnfinishedMessage(var3.buildPartial());
         } catch (UninitializedMessageException var6) {
            throw var6.asInvalidProtocolBufferException().setUnfinishedMessage(var3.buildPartial());
         } catch (IOException var7) {
            throw new InvalidProtocolBufferException(var7).setUnfinishedMessage(var3.buildPartial());
         }

         return var3.buildPartial();
      }
   };

   private RecordPerfSnapshotRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private RecordPerfSnapshotRequest() {
      this.graphicsStatus_ = 0;
      this.chunkBuilder_ = 0;
      this.clouds_ = 0;
      this.particles_ = 0;
      this.lazyChunkLoading_ = 0;
      this.gpuName_ = "";
      this.graphicsBackend_ = "";
      this.textureFiltering_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new RecordPerfSnapshotRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_performance_v1_RecordPerfSnapshotRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_performance_v1_RecordPerfSnapshotRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(RecordPerfSnapshotRequest.class, RecordPerfSnapshotRequest.Builder.class);
   }

   @Override
   public RecordPerfSnapshotRequest.GpuMemoryStateCase getGpuMemoryStateCase() {
      return RecordPerfSnapshotRequest.GpuMemoryStateCase.forNumber(this.gpuMemoryStateCase_);
   }

   @Override
   public int getFps() {
      return this.fps_;
   }

   @Override
   public int getRenderedChunkSections() {
      return this.renderedChunkSections_;
   }

   @Override
   public int getLoadedChunks() {
      return this.loadedChunks_;
   }

   @Override
   public int getRenderedEntities() {
      return this.renderedEntities_;
   }

   @Override
   public int getRenderedPlayers() {
      return this.renderedPlayers_;
   }

   @Override
   public int getRenderedParticles() {
      return this.renderedParticles_;
   }

   @Override
   public int getRenderedBlockEntities() {
      return this.renderedBlockEntities_;
   }

   @Override
   public int getFreeMemoryKb() {
      return this.freeMemoryKb_;
   }

   @Override
   public int getTotalMemoryKb() {
      return this.totalMemoryKb_;
   }

   @Override
   public int getMaxMemoryKb() {
      return this.maxMemoryKb_;
   }

   @Override
   public float getGpuUsage() {
      return this.gpuUsage_;
   }

   @Override
   public float getFrametime() {
      return this.frametime_;
   }

   @Override
   public int getDirectMemoryKb() {
      return this.directMemoryKb_;
   }

   @Override
   public int getOffHeapMemoryKb() {
      return this.offHeapMemoryKb_;
   }

   @Override
   public int getLunarHuds() {
      return this.lunarHuds_;
   }

   @Override
   public int getRenderedGeckolibCosmetics() {
      return this.renderedGeckolibCosmetics_;
   }

   @Override
   public int getRenderedCosmetics() {
      return this.renderedCosmetics_;
   }

   @Override
   public int getRenderedEmotes() {
      return this.renderedEmotes_;
   }

   @Override
   public int getRenderedTurboEntities() {
      return this.renderedTurboEntities_;
   }

   @Override
   public int getRenderedTurboBlockEntities() {
      return this.renderedTurboBlockEntities_;
   }

   @Override
   public boolean getUsingExternalShaders() {
      return this.usingExternalShaders_;
   }

   @Override
   public boolean hasAverageFps() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public RecordPerfSnapshotRequest.AverageGroup getAverageFps() {
      return this.averageFps_ == null ? RecordPerfSnapshotRequest.AverageGroup.getDefaultInstance() : this.averageFps_;
   }

   @Override
   public RecordPerfSnapshotRequest.AverageGroupOrBuilder getAverageFpsOrBuilder() {
      return this.averageFps_ == null ? RecordPerfSnapshotRequest.AverageGroup.getDefaultInstance() : this.averageFps_;
   }

   @Override
   public boolean hasNvidiaMemory() {
      return this.gpuMemoryStateCase_ == 23;
   }

   @Override
   public RecordPerfSnapshotRequest.NvidiaGpuMemoryState getNvidiaMemory() {
      return this.gpuMemoryStateCase_ == 23
         ? (RecordPerfSnapshotRequest.NvidiaGpuMemoryState)this.gpuMemoryState_
         : RecordPerfSnapshotRequest.NvidiaGpuMemoryState.getDefaultInstance();
   }

   @Override
   public RecordPerfSnapshotRequest.NvidiaGpuMemoryStateOrBuilder getNvidiaMemoryOrBuilder() {
      return this.gpuMemoryStateCase_ == 23
         ? (RecordPerfSnapshotRequest.NvidiaGpuMemoryState)this.gpuMemoryState_
         : RecordPerfSnapshotRequest.NvidiaGpuMemoryState.getDefaultInstance();
   }

   @Override
   public boolean hasAmdMemory() {
      return this.gpuMemoryStateCase_ == 24;
   }

   @Override
   public RecordPerfSnapshotRequest.AmdGpuMemoryState getAmdMemory() {
      return this.gpuMemoryStateCase_ == 24
         ? (RecordPerfSnapshotRequest.AmdGpuMemoryState)this.gpuMemoryState_
         : RecordPerfSnapshotRequest.AmdGpuMemoryState.getDefaultInstance();
   }

   @Override
   public RecordPerfSnapshotRequest.AmdGpuMemoryStateOrBuilder getAmdMemoryOrBuilder() {
      return this.gpuMemoryStateCase_ == 24
         ? (RecordPerfSnapshotRequest.AmdGpuMemoryState)this.gpuMemoryState_
         : RecordPerfSnapshotRequest.AmdGpuMemoryState.getDefaultInstance();
   }

   @Override
   public int getWidth() {
      return this.width_;
   }

   @Override
   public int getHeight() {
      return this.height_;
   }

   @Override
   public boolean getFullscreen() {
      return this.fullscreen_;
   }

   @Override
   public boolean getVsync() {
      return this.vsync_;
   }

   @Override
   public boolean getSmoothLighting() {
      return this.smoothLighting_;
   }

   @Override
   public boolean getEntityShadows() {
      return this.entityShadows_;
   }

   @Override
   public int getMaxFramerate() {
      return this.maxFramerate_;
   }

   @Override
   public int getGraphicsStatusValue() {
      return this.graphicsStatus_;
   }

   @Override
   public RecordPerfSnapshotRequest.GraphicsStatus getGraphicsStatus() {
      RecordPerfSnapshotRequest.GraphicsStatus var1 = RecordPerfSnapshotRequest.GraphicsStatus.forNumber(this.graphicsStatus_);
      return var1 == null ? RecordPerfSnapshotRequest.GraphicsStatus.UNRECOGNIZED : var1;
   }

   @Override
   public int getChunkBuilderValue() {
      return this.chunkBuilder_;
   }

   @Override
   public RecordPerfSnapshotRequest.ChunkBuilder getChunkBuilder() {
      RecordPerfSnapshotRequest.ChunkBuilder var1 = RecordPerfSnapshotRequest.ChunkBuilder.forNumber(this.chunkBuilder_);
      return var1 == null ? RecordPerfSnapshotRequest.ChunkBuilder.UNRECOGNIZED : var1;
   }

   @Override
   public int getCloudsValue() {
      return this.clouds_;
   }

   @Override
   public RecordPerfSnapshotRequest.CloudsMode getClouds() {
      RecordPerfSnapshotRequest.CloudsMode var1 = RecordPerfSnapshotRequest.CloudsMode.forNumber(this.clouds_);
      return var1 == null ? RecordPerfSnapshotRequest.CloudsMode.UNRECOGNIZED : var1;
   }

   @Override
   public int getParticlesValue() {
      return this.particles_;
   }

   @Override
   public RecordPerfSnapshotRequest.ParticlesMode getParticles() {
      RecordPerfSnapshotRequest.ParticlesMode var1 = RecordPerfSnapshotRequest.ParticlesMode.forNumber(this.particles_);
      return var1 == null ? RecordPerfSnapshotRequest.ParticlesMode.UNRECOGNIZED : var1;
   }

   @Override
   public int getRenderDistance() {
      return this.renderDistance_;
   }

   @Override
   public int getSimulatedDistance() {
      return this.simulatedDistance_;
   }

   @Override
   public int getEntityDistance() {
      return this.entityDistance_;
   }

   @Override
   public int getBiomeBlend() {
      return this.biomeBlend_;
   }

   @Override
   public int getFov() {
      return this.fov_;
   }

   @Override
   public boolean getHudCaching() {
      return this.hudCaching_;
   }

   @Override
   public boolean getParticlePhysics() {
      return this.particlePhysics_;
   }

   @Override
   public int getLazyChunkLoadingValue() {
      return this.lazyChunkLoading_;
   }

   @Override
   public RecordPerfSnapshotRequest.LazyChunkLoading getLazyChunkLoading() {
      RecordPerfSnapshotRequest.LazyChunkLoading var1 = RecordPerfSnapshotRequest.LazyChunkLoading.forNumber(this.lazyChunkLoading_);
      return var1 == null ? RecordPerfSnapshotRequest.LazyChunkLoading.UNRECOGNIZED : var1;
   }

   @Override
   public boolean getTurboEntities() {
      return this.turboEntities_;
   }

   @Override
   public int getTurboEntitiesRate() {
      return this.turboEntitiesRate_;
   }

   @Override
   public boolean getTurboBlockEntities() {
      return this.turboBlockEntities_;
   }

   @Override
   public int getTurboBlockEntitiesRate() {
      return this.turboBlockEntitiesRate_;
   }

   @Override
   public boolean getTurboBlockEntitiesFar() {
      return this.turboBlockEntitiesFar_;
   }

   @Override
   public String getGpuName() {
      Object var1 = this.gpuName_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.gpuName_ = var3;
      return var3;
   }

   @Override
   public ByteString getGpuNameBytes() {
      Object var1 = this.gpuName_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.gpuName_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public int getGcCycles() {
      return this.gcCycles_;
   }

   @Override
   public int getLongestGcMicro() {
      return this.longestGcMicro_;
   }

   @Override
   public int getShortestGcMicro() {
      return this.shortestGcMicro_;
   }

   @Override
   public int getAvgGcMicro() {
      return this.avgGcMicro_;
   }

   @Override
   public int getMedianGcMicro() {
      return this.medianGcMicro_;
   }

   @Override
   public float getFrameTimeAverage() {
      return this.frameTimeAverage_;
   }

   @Override
   public float getFrameTimeFastest() {
      return this.frameTimeFastest_;
   }

   @Override
   public float getFrameTimeSlowest() {
      return this.frameTimeSlowest_;
   }

   @Override
   public String getGraphicsBackend() {
      Object var1 = this.graphicsBackend_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.graphicsBackend_ = var3;
      return var3;
   }

   @Override
   public ByteString getGraphicsBackendBytes() {
      Object var1 = this.graphicsBackend_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.graphicsBackend_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public boolean getSodiumPresent() {
      return this.sodiumPresent_;
   }

   @Override
   public int getTextureFilteringValue() {
      return this.textureFiltering_;
   }

   @Override
   public RecordPerfSnapshotRequest.TextureFiltering getTextureFiltering() {
      RecordPerfSnapshotRequest.TextureFiltering var1 = RecordPerfSnapshotRequest.TextureFiltering.forNumber(this.textureFiltering_);
      return var1 == null ? RecordPerfSnapshotRequest.TextureFiltering.UNRECOGNIZED : var1;
   }

   @Override
   public final boolean isInitialized() {
      byte var1 = this.memoizedIsInitialized;
      if (var1 == 1) {
         return true;
      }

      if (var1 == 0) {
         return false;
      }

      this.memoizedIsInitialized = 1;
      return true;
   }

   @Override
   public void writeTo(CodedOutputStream var1) {
      if (this.fps_ != 0) {
         var1.writeInt32(1, this.fps_);
      }

      if (this.renderedChunkSections_ != 0) {
         var1.writeInt32(2, this.renderedChunkSections_);
      }

      if (this.loadedChunks_ != 0) {
         var1.writeInt32(3, this.loadedChunks_);
      }

      if (this.renderedEntities_ != 0) {
         var1.writeInt32(4, this.renderedEntities_);
      }

      if (this.renderedPlayers_ != 0) {
         var1.writeInt32(5, this.renderedPlayers_);
      }

      if (this.renderedParticles_ != 0) {
         var1.writeInt32(6, this.renderedParticles_);
      }

      if (this.freeMemoryKb_ != 0) {
         var1.writeInt32(7, this.freeMemoryKb_);
      }

      if (this.totalMemoryKb_ != 0) {
         var1.writeInt32(8, this.totalMemoryKb_);
      }

      if (this.maxMemoryKb_ != 0) {
         var1.writeInt32(9, this.maxMemoryKb_);
      }

      if (Float.floatToRawIntBits(this.gpuUsage_) != 0) {
         var1.writeFloat(10, this.gpuUsage_);
      }

      if (this.lunarHuds_ != 0) {
         var1.writeInt32(11, this.lunarHuds_);
      }

      if (this.renderedGeckolibCosmetics_ != 0) {
         var1.writeInt32(12, this.renderedGeckolibCosmetics_);
      }

      if (this.renderedCosmetics_ != 0) {
         var1.writeInt32(13, this.renderedCosmetics_);
      }

      if (this.renderedEmotes_ != 0) {
         var1.writeInt32(14, this.renderedEmotes_);
      }

      if (Float.floatToRawIntBits(this.frametime_) != 0) {
         var1.writeFloat(15, this.frametime_);
      }

      if (this.renderedTurboEntities_ != 0) {
         var1.writeInt32(16, this.renderedTurboEntities_);
      }

      if (this.directMemoryKb_ != 0) {
         var1.writeInt32(17, this.directMemoryKb_);
      }

      if (this.offHeapMemoryKb_ != 0) {
         var1.writeInt32(18, this.offHeapMemoryKb_);
      }

      if (this.usingExternalShaders_) {
         var1.writeBool(19, this.usingExternalShaders_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(20, this.getAverageFps());
      }

      if (this.renderedTurboBlockEntities_ != 0) {
         var1.writeInt32(21, this.renderedTurboBlockEntities_);
      }

      if (this.renderedBlockEntities_ != 0) {
         var1.writeInt32(22, this.renderedBlockEntities_);
      }

      if (this.gpuMemoryStateCase_ == 23) {
         var1.writeMessage(23, (RecordPerfSnapshotRequest.NvidiaGpuMemoryState)this.gpuMemoryState_);
      }

      if (this.gpuMemoryStateCase_ == 24) {
         var1.writeMessage(24, (RecordPerfSnapshotRequest.AmdGpuMemoryState)this.gpuMemoryState_);
      }

      if (this.width_ != 0) {
         var1.writeInt32(25, this.width_);
      }

      if (this.height_ != 0) {
         var1.writeInt32(26, this.height_);
      }

      if (this.fullscreen_) {
         var1.writeBool(27, this.fullscreen_);
      }

      if (this.vsync_) {
         var1.writeBool(28, this.vsync_);
      }

      if (this.smoothLighting_) {
         var1.writeBool(29, this.smoothLighting_);
      }

      if (this.entityShadows_) {
         var1.writeBool(30, this.entityShadows_);
      }

      if (this.maxFramerate_ != 0) {
         var1.writeInt32(31, this.maxFramerate_);
      }

      if (this.graphicsStatus_ != RecordPerfSnapshotRequest.GraphicsStatus.GRAPHICS_STATUS_UNSPECIFIED.getNumber()) {
         var1.writeEnum(32, this.graphicsStatus_);
      }

      if (this.chunkBuilder_ != RecordPerfSnapshotRequest.ChunkBuilder.CHUNK_BUILDER_UNSPECIFIED.getNumber()) {
         var1.writeEnum(33, this.chunkBuilder_);
      }

      if (this.clouds_ != RecordPerfSnapshotRequest.CloudsMode.CLOUDS_MODE_UNSPECIFIED.getNumber()) {
         var1.writeEnum(34, this.clouds_);
      }

      if (this.particles_ != RecordPerfSnapshotRequest.ParticlesMode.PARTICLES_MODE_UNSPECIFIED.getNumber()) {
         var1.writeEnum(35, this.particles_);
      }

      if (this.renderDistance_ != 0) {
         var1.writeInt32(36, this.renderDistance_);
      }

      if (this.simulatedDistance_ != 0) {
         var1.writeInt32(37, this.simulatedDistance_);
      }

      if (this.entityDistance_ != 0) {
         var1.writeInt32(38, this.entityDistance_);
      }

      if (this.biomeBlend_ != 0) {
         var1.writeInt32(39, this.biomeBlend_);
      }

      if (this.fov_ != 0) {
         var1.writeInt32(40, this.fov_);
      }

      if (this.hudCaching_) {
         var1.writeBool(41, this.hudCaching_);
      }

      if (this.particlePhysics_) {
         var1.writeBool(42, this.particlePhysics_);
      }

      if (this.lazyChunkLoading_ != RecordPerfSnapshotRequest.LazyChunkLoading.LAZY_CHUNK_LOADING_UNSPECIFIED.getNumber()) {
         var1.writeEnum(43, this.lazyChunkLoading_);
      }

      if (this.turboEntities_) {
         var1.writeBool(44, this.turboEntities_);
      }

      if (this.turboEntitiesRate_ != 0) {
         var1.writeInt32(45, this.turboEntitiesRate_);
      }

      if (this.turboBlockEntities_) {
         var1.writeBool(46, this.turboBlockEntities_);
      }

      if (this.turboBlockEntitiesRate_ != 0) {
         var1.writeInt32(47, this.turboBlockEntitiesRate_);
      }

      if (this.turboBlockEntitiesFar_) {
         var1.writeBool(48, this.turboBlockEntitiesFar_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.gpuName_)) {
         GeneratedMessageV3.writeString(var1, 49, this.gpuName_);
      }

      if (this.gcCycles_ != 0) {
         var1.writeInt32(50, this.gcCycles_);
      }

      if (this.longestGcMicro_ != 0) {
         var1.writeInt32(51, this.longestGcMicro_);
      }

      if (this.shortestGcMicro_ != 0) {
         var1.writeInt32(52, this.shortestGcMicro_);
      }

      if (this.avgGcMicro_ != 0) {
         var1.writeInt32(53, this.avgGcMicro_);
      }

      if (this.medianGcMicro_ != 0) {
         var1.writeInt32(54, this.medianGcMicro_);
      }

      if (Float.floatToRawIntBits(this.frameTimeAverage_) != 0) {
         var1.writeFloat(55, this.frameTimeAverage_);
      }

      if (Float.floatToRawIntBits(this.frameTimeFastest_) != 0) {
         var1.writeFloat(57, this.frameTimeFastest_);
      }

      if (Float.floatToRawIntBits(this.frameTimeSlowest_) != 0) {
         var1.writeFloat(58, this.frameTimeSlowest_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.graphicsBackend_)) {
         GeneratedMessageV3.writeString(var1, 59, this.graphicsBackend_);
      }

      if (this.sodiumPresent_) {
         var1.writeBool(60, this.sodiumPresent_);
      }

      if (this.textureFiltering_ != RecordPerfSnapshotRequest.TextureFiltering.TEXTURE_FILTERING_NONE_UNSPECIFIED.getNumber()) {
         var1.writeEnum(61, this.textureFiltering_);
      }

      this.getUnknownFields().writeTo(var1);
   }

   @Override
   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 != -1) {
         return var1;
      }

      var1 = 0;
      if (this.fps_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(1, this.fps_);
      }

      if (this.renderedChunkSections_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(2, this.renderedChunkSections_);
      }

      if (this.loadedChunks_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(3, this.loadedChunks_);
      }

      if (this.renderedEntities_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(4, this.renderedEntities_);
      }

      if (this.renderedPlayers_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(5, this.renderedPlayers_);
      }

      if (this.renderedParticles_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(6, this.renderedParticles_);
      }

      if (this.freeMemoryKb_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(7, this.freeMemoryKb_);
      }

      if (this.totalMemoryKb_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(8, this.totalMemoryKb_);
      }

      if (this.maxMemoryKb_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(9, this.maxMemoryKb_);
      }

      if (Float.floatToRawIntBits(this.gpuUsage_) != 0) {
         var1 += CodedOutputStream.computeFloatSize(10, this.gpuUsage_);
      }

      if (this.lunarHuds_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(11, this.lunarHuds_);
      }

      if (this.renderedGeckolibCosmetics_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(12, this.renderedGeckolibCosmetics_);
      }

      if (this.renderedCosmetics_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(13, this.renderedCosmetics_);
      }

      if (this.renderedEmotes_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(14, this.renderedEmotes_);
      }

      if (Float.floatToRawIntBits(this.frametime_) != 0) {
         var1 += CodedOutputStream.computeFloatSize(15, this.frametime_);
      }

      if (this.renderedTurboEntities_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(16, this.renderedTurboEntities_);
      }

      if (this.directMemoryKb_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(17, this.directMemoryKb_);
      }

      if (this.offHeapMemoryKb_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(18, this.offHeapMemoryKb_);
      }

      if (this.usingExternalShaders_) {
         var1 += CodedOutputStream.computeBoolSize(19, this.usingExternalShaders_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(20, this.getAverageFps());
      }

      if (this.renderedTurboBlockEntities_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(21, this.renderedTurboBlockEntities_);
      }

      if (this.renderedBlockEntities_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(22, this.renderedBlockEntities_);
      }

      if (this.gpuMemoryStateCase_ == 23) {
         var1 += CodedOutputStream.computeMessageSize(23, (RecordPerfSnapshotRequest.NvidiaGpuMemoryState)this.gpuMemoryState_);
      }

      if (this.gpuMemoryStateCase_ == 24) {
         var1 += CodedOutputStream.computeMessageSize(24, (RecordPerfSnapshotRequest.AmdGpuMemoryState)this.gpuMemoryState_);
      }

      if (this.width_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(25, this.width_);
      }

      if (this.height_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(26, this.height_);
      }

      if (this.fullscreen_) {
         var1 += CodedOutputStream.computeBoolSize(27, this.fullscreen_);
      }

      if (this.vsync_) {
         var1 += CodedOutputStream.computeBoolSize(28, this.vsync_);
      }

      if (this.smoothLighting_) {
         var1 += CodedOutputStream.computeBoolSize(29, this.smoothLighting_);
      }

      if (this.entityShadows_) {
         var1 += CodedOutputStream.computeBoolSize(30, this.entityShadows_);
      }

      if (this.maxFramerate_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(31, this.maxFramerate_);
      }

      if (this.graphicsStatus_ != RecordPerfSnapshotRequest.GraphicsStatus.GRAPHICS_STATUS_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(32, this.graphicsStatus_);
      }

      if (this.chunkBuilder_ != RecordPerfSnapshotRequest.ChunkBuilder.CHUNK_BUILDER_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(33, this.chunkBuilder_);
      }

      if (this.clouds_ != RecordPerfSnapshotRequest.CloudsMode.CLOUDS_MODE_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(34, this.clouds_);
      }

      if (this.particles_ != RecordPerfSnapshotRequest.ParticlesMode.PARTICLES_MODE_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(35, this.particles_);
      }

      if (this.renderDistance_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(36, this.renderDistance_);
      }

      if (this.simulatedDistance_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(37, this.simulatedDistance_);
      }

      if (this.entityDistance_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(38, this.entityDistance_);
      }

      if (this.biomeBlend_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(39, this.biomeBlend_);
      }

      if (this.fov_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(40, this.fov_);
      }

      if (this.hudCaching_) {
         var1 += CodedOutputStream.computeBoolSize(41, this.hudCaching_);
      }

      if (this.particlePhysics_) {
         var1 += CodedOutputStream.computeBoolSize(42, this.particlePhysics_);
      }

      if (this.lazyChunkLoading_ != RecordPerfSnapshotRequest.LazyChunkLoading.LAZY_CHUNK_LOADING_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(43, this.lazyChunkLoading_);
      }

      if (this.turboEntities_) {
         var1 += CodedOutputStream.computeBoolSize(44, this.turboEntities_);
      }

      if (this.turboEntitiesRate_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(45, this.turboEntitiesRate_);
      }

      if (this.turboBlockEntities_) {
         var1 += CodedOutputStream.computeBoolSize(46, this.turboBlockEntities_);
      }

      if (this.turboBlockEntitiesRate_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(47, this.turboBlockEntitiesRate_);
      }

      if (this.turboBlockEntitiesFar_) {
         var1 += CodedOutputStream.computeBoolSize(48, this.turboBlockEntitiesFar_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.gpuName_)) {
         var1 += GeneratedMessageV3.computeStringSize(49, this.gpuName_);
      }

      if (this.gcCycles_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(50, this.gcCycles_);
      }

      if (this.longestGcMicro_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(51, this.longestGcMicro_);
      }

      if (this.shortestGcMicro_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(52, this.shortestGcMicro_);
      }

      if (this.avgGcMicro_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(53, this.avgGcMicro_);
      }

      if (this.medianGcMicro_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(54, this.medianGcMicro_);
      }

      if (Float.floatToRawIntBits(this.frameTimeAverage_) != 0) {
         var1 += CodedOutputStream.computeFloatSize(55, this.frameTimeAverage_);
      }

      if (Float.floatToRawIntBits(this.frameTimeFastest_) != 0) {
         var1 += CodedOutputStream.computeFloatSize(57, this.frameTimeFastest_);
      }

      if (Float.floatToRawIntBits(this.frameTimeSlowest_) != 0) {
         var1 += CodedOutputStream.computeFloatSize(58, this.frameTimeSlowest_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.graphicsBackend_)) {
         var1 += GeneratedMessageV3.computeStringSize(59, this.graphicsBackend_);
      }

      if (this.sodiumPresent_) {
         var1 += CodedOutputStream.computeBoolSize(60, this.sodiumPresent_);
      }

      if (this.textureFiltering_ != RecordPerfSnapshotRequest.TextureFiltering.TEXTURE_FILTERING_NONE_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(61, this.textureFiltering_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof RecordPerfSnapshotRequest)) {
         return super.equals(var1);
      }

      RecordPerfSnapshotRequest var2 = (RecordPerfSnapshotRequest)var1;
      if (this.getFps() != var2.getFps()) {
         return false;
      }

      if (this.getRenderedChunkSections() != var2.getRenderedChunkSections()) {
         return false;
      }

      if (this.getLoadedChunks() != var2.getLoadedChunks()) {
         return false;
      }

      if (this.getRenderedEntities() != var2.getRenderedEntities()) {
         return false;
      }

      if (this.getRenderedPlayers() != var2.getRenderedPlayers()) {
         return false;
      }

      if (this.getRenderedParticles() != var2.getRenderedParticles()) {
         return false;
      }

      if (this.getRenderedBlockEntities() != var2.getRenderedBlockEntities()) {
         return false;
      }

      if (this.getFreeMemoryKb() != var2.getFreeMemoryKb()) {
         return false;
      }

      if (this.getTotalMemoryKb() != var2.getTotalMemoryKb()) {
         return false;
      }

      if (this.getMaxMemoryKb() != var2.getMaxMemoryKb()) {
         return false;
      }

      if (Float.floatToIntBits(this.getGpuUsage()) != Float.floatToIntBits(var2.getGpuUsage())) {
         return false;
      }

      if (Float.floatToIntBits(this.getFrametime()) != Float.floatToIntBits(var2.getFrametime())) {
         return false;
      }

      if (this.getDirectMemoryKb() != var2.getDirectMemoryKb()) {
         return false;
      }

      if (this.getOffHeapMemoryKb() != var2.getOffHeapMemoryKb()) {
         return false;
      }

      if (this.getLunarHuds() != var2.getLunarHuds()) {
         return false;
      }

      if (this.getRenderedGeckolibCosmetics() != var2.getRenderedGeckolibCosmetics()) {
         return false;
      }

      if (this.getRenderedCosmetics() != var2.getRenderedCosmetics()) {
         return false;
      }

      if (this.getRenderedEmotes() != var2.getRenderedEmotes()) {
         return false;
      }

      if (this.getRenderedTurboEntities() != var2.getRenderedTurboEntities()) {
         return false;
      }

      if (this.getRenderedTurboBlockEntities() != var2.getRenderedTurboBlockEntities()) {
         return false;
      }

      if (this.getUsingExternalShaders() != var2.getUsingExternalShaders()) {
         return false;
      }

      if (this.hasAverageFps() != var2.hasAverageFps()) {
         return false;
      }

      if (this.hasAverageFps() && !this.getAverageFps().equals(var2.getAverageFps())) {
         return false;
      }

      if (this.getWidth() != var2.getWidth()) {
         return false;
      }

      if (this.getHeight() != var2.getHeight()) {
         return false;
      }

      if (this.getFullscreen() != var2.getFullscreen()) {
         return false;
      }

      if (this.getVsync() != var2.getVsync()) {
         return false;
      }

      if (this.getSmoothLighting() != var2.getSmoothLighting()) {
         return false;
      }

      if (this.getEntityShadows() != var2.getEntityShadows()) {
         return false;
      }

      if (this.getMaxFramerate() != var2.getMaxFramerate()) {
         return false;
      }

      if (this.graphicsStatus_ != var2.graphicsStatus_) {
         return false;
      }

      if (this.chunkBuilder_ != var2.chunkBuilder_) {
         return false;
      }

      if (this.clouds_ != var2.clouds_) {
         return false;
      }

      if (this.particles_ != var2.particles_) {
         return false;
      }

      if (this.getRenderDistance() != var2.getRenderDistance()) {
         return false;
      }

      if (this.getSimulatedDistance() != var2.getSimulatedDistance()) {
         return false;
      }

      if (this.getEntityDistance() != var2.getEntityDistance()) {
         return false;
      }

      if (this.getBiomeBlend() != var2.getBiomeBlend()) {
         return false;
      }

      if (this.getFov() != var2.getFov()) {
         return false;
      }

      if (this.getHudCaching() != var2.getHudCaching()) {
         return false;
      }

      if (this.getParticlePhysics() != var2.getParticlePhysics()) {
         return false;
      }

      if (this.lazyChunkLoading_ != var2.lazyChunkLoading_) {
         return false;
      }

      if (this.getTurboEntities() != var2.getTurboEntities()) {
         return false;
      }

      if (this.getTurboEntitiesRate() != var2.getTurboEntitiesRate()) {
         return false;
      }

      if (this.getTurboBlockEntities() != var2.getTurboBlockEntities()) {
         return false;
      }

      if (this.getTurboBlockEntitiesRate() != var2.getTurboBlockEntitiesRate()) {
         return false;
      }

      if (this.getTurboBlockEntitiesFar() != var2.getTurboBlockEntitiesFar()) {
         return false;
      }

      if (!this.getGpuName().equals(var2.getGpuName())) {
         return false;
      }

      if (this.getGcCycles() != var2.getGcCycles()) {
         return false;
      }

      if (this.getLongestGcMicro() != var2.getLongestGcMicro()) {
         return false;
      }

      if (this.getShortestGcMicro() != var2.getShortestGcMicro()) {
         return false;
      }

      if (this.getAvgGcMicro() != var2.getAvgGcMicro()) {
         return false;
      }

      if (this.getMedianGcMicro() != var2.getMedianGcMicro()) {
         return false;
      }

      if (Float.floatToIntBits(this.getFrameTimeAverage()) != Float.floatToIntBits(var2.getFrameTimeAverage())) {
         return false;
      }

      if (Float.floatToIntBits(this.getFrameTimeFastest()) != Float.floatToIntBits(var2.getFrameTimeFastest())) {
         return false;
      }

      if (Float.floatToIntBits(this.getFrameTimeSlowest()) != Float.floatToIntBits(var2.getFrameTimeSlowest())) {
         return false;
      }

      if (!this.getGraphicsBackend().equals(var2.getGraphicsBackend())) {
         return false;
      }

      if (this.getSodiumPresent() != var2.getSodiumPresent()) {
         return false;
      }

      if (this.textureFiltering_ != var2.textureFiltering_) {
         return false;
      }

      if (!this.getGpuMemoryStateCase().equals(var2.getGpuMemoryStateCase())) {
         return false;
      }

      switch (this.gpuMemoryStateCase_) {
         case 0:
         default:
            break;
         case 23:
            if (!this.getNvidiaMemory().equals(var2.getNvidiaMemory())) {
               return false;
            }
            break;
         case 24:
            if (!this.getAmdMemory().equals(var2.getAmdMemory())) {
               return false;
            }
      }

      return this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.getFps();
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getRenderedChunkSections();
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.getLoadedChunks();
      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + this.getRenderedEntities();
      var1 = 37 * var1 + 5;
      var1 = 53 * var1 + this.getRenderedPlayers();
      var1 = 37 * var1 + 6;
      var1 = 53 * var1 + this.getRenderedParticles();
      var1 = 37 * var1 + 22;
      var1 = 53 * var1 + this.getRenderedBlockEntities();
      var1 = 37 * var1 + 7;
      var1 = 53 * var1 + this.getFreeMemoryKb();
      var1 = 37 * var1 + 8;
      var1 = 53 * var1 + this.getTotalMemoryKb();
      var1 = 37 * var1 + 9;
      var1 = 53 * var1 + this.getMaxMemoryKb();
      var1 = 37 * var1 + 10;
      var1 = 53 * var1 + Float.floatToIntBits(this.getGpuUsage());
      var1 = 37 * var1 + 15;
      var1 = 53 * var1 + Float.floatToIntBits(this.getFrametime());
      var1 = 37 * var1 + 17;
      var1 = 53 * var1 + this.getDirectMemoryKb();
      var1 = 37 * var1 + 18;
      var1 = 53 * var1 + this.getOffHeapMemoryKb();
      var1 = 37 * var1 + 11;
      var1 = 53 * var1 + this.getLunarHuds();
      var1 = 37 * var1 + 12;
      var1 = 53 * var1 + this.getRenderedGeckolibCosmetics();
      var1 = 37 * var1 + 13;
      var1 = 53 * var1 + this.getRenderedCosmetics();
      var1 = 37 * var1 + 14;
      var1 = 53 * var1 + this.getRenderedEmotes();
      var1 = 37 * var1 + 16;
      var1 = 53 * var1 + this.getRenderedTurboEntities();
      var1 = 37 * var1 + 21;
      var1 = 53 * var1 + this.getRenderedTurboBlockEntities();
      var1 = 37 * var1 + 19;
      var1 = 53 * var1 + Internal.hashBoolean(this.getUsingExternalShaders());
      if (this.hasAverageFps()) {
         var1 = 37 * var1 + 20;
         var1 = 53 * var1 + this.getAverageFps().hashCode();
      }

      var1 = 37 * var1 + 25;
      var1 = 53 * var1 + this.getWidth();
      var1 = 37 * var1 + 26;
      var1 = 53 * var1 + this.getHeight();
      var1 = 37 * var1 + 27;
      var1 = 53 * var1 + Internal.hashBoolean(this.getFullscreen());
      var1 = 37 * var1 + 28;
      var1 = 53 * var1 + Internal.hashBoolean(this.getVsync());
      var1 = 37 * var1 + 29;
      var1 = 53 * var1 + Internal.hashBoolean(this.getSmoothLighting());
      var1 = 37 * var1 + 30;
      var1 = 53 * var1 + Internal.hashBoolean(this.getEntityShadows());
      var1 = 37 * var1 + 31;
      var1 = 53 * var1 + this.getMaxFramerate();
      var1 = 37 * var1 + 32;
      var1 = 53 * var1 + this.graphicsStatus_;
      var1 = 37 * var1 + 33;
      var1 = 53 * var1 + this.chunkBuilder_;
      var1 = 37 * var1 + 34;
      var1 = 53 * var1 + this.clouds_;
      var1 = 37 * var1 + 35;
      var1 = 53 * var1 + this.particles_;
      var1 = 37 * var1 + 36;
      var1 = 53 * var1 + this.getRenderDistance();
      var1 = 37 * var1 + 37;
      var1 = 53 * var1 + this.getSimulatedDistance();
      var1 = 37 * var1 + 38;
      var1 = 53 * var1 + this.getEntityDistance();
      var1 = 37 * var1 + 39;
      var1 = 53 * var1 + this.getBiomeBlend();
      var1 = 37 * var1 + 40;
      var1 = 53 * var1 + this.getFov();
      var1 = 37 * var1 + 41;
      var1 = 53 * var1 + Internal.hashBoolean(this.getHudCaching());
      var1 = 37 * var1 + 42;
      var1 = 53 * var1 + Internal.hashBoolean(this.getParticlePhysics());
      var1 = 37 * var1 + 43;
      var1 = 53 * var1 + this.lazyChunkLoading_;
      var1 = 37 * var1 + 44;
      var1 = 53 * var1 + Internal.hashBoolean(this.getTurboEntities());
      var1 = 37 * var1 + 45;
      var1 = 53 * var1 + this.getTurboEntitiesRate();
      var1 = 37 * var1 + 46;
      var1 = 53 * var1 + Internal.hashBoolean(this.getTurboBlockEntities());
      var1 = 37 * var1 + 47;
      var1 = 53 * var1 + this.getTurboBlockEntitiesRate();
      var1 = 37 * var1 + 48;
      var1 = 53 * var1 + Internal.hashBoolean(this.getTurboBlockEntitiesFar());
      var1 = 37 * var1 + 49;
      var1 = 53 * var1 + this.getGpuName().hashCode();
      var1 = 37 * var1 + 50;
      var1 = 53 * var1 + this.getGcCycles();
      var1 = 37 * var1 + 51;
      var1 = 53 * var1 + this.getLongestGcMicro();
      var1 = 37 * var1 + 52;
      var1 = 53 * var1 + this.getShortestGcMicro();
      var1 = 37 * var1 + 53;
      var1 = 53 * var1 + this.getAvgGcMicro();
      var1 = 37 * var1 + 54;
      var1 = 53 * var1 + this.getMedianGcMicro();
      var1 = 37 * var1 + 55;
      var1 = 53 * var1 + Float.floatToIntBits(this.getFrameTimeAverage());
      var1 = 37 * var1 + 57;
      var1 = 53 * var1 + Float.floatToIntBits(this.getFrameTimeFastest());
      var1 = 37 * var1 + 58;
      var1 = 53 * var1 + Float.floatToIntBits(this.getFrameTimeSlowest());
      var1 = 37 * var1 + 59;
      var1 = 53 * var1 + this.getGraphicsBackend().hashCode();
      var1 = 37 * var1 + 60;
      var1 = 53 * var1 + Internal.hashBoolean(this.getSodiumPresent());
      var1 = 37 * var1 + 61;
      var1 = 53 * var1 + this.textureFiltering_;
      switch (this.gpuMemoryStateCase_) {
         case 0:
         default:
            break;
         case 23:
            var1 = 37 * var1 + 23;
            var1 = 53 * var1 + this.getNvidiaMemory().hashCode();
            break;
         case 24:
            var1 = 37 * var1 + 24;
            var1 = 53 * var1 + this.getAmdMemory().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static RecordPerfSnapshotRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static RecordPerfSnapshotRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RecordPerfSnapshotRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static RecordPerfSnapshotRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RecordPerfSnapshotRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static RecordPerfSnapshotRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RecordPerfSnapshotRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RecordPerfSnapshotRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static RecordPerfSnapshotRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static RecordPerfSnapshotRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static RecordPerfSnapshotRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RecordPerfSnapshotRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public RecordPerfSnapshotRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static RecordPerfSnapshotRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static RecordPerfSnapshotRequest.Builder newBuilder(RecordPerfSnapshotRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public RecordPerfSnapshotRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new RecordPerfSnapshotRequest.Builder() : new RecordPerfSnapshotRequest.Builder().mergeFrom(this);
   }

   protected RecordPerfSnapshotRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new RecordPerfSnapshotRequest.Builder(var1);
   }

   public static RecordPerfSnapshotRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<RecordPerfSnapshotRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<RecordPerfSnapshotRequest> getParserForType() {
      return PARSER;
   }

   public RecordPerfSnapshotRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class AmdGpuMemoryState extends GeneratedMessageV3 implements RecordPerfSnapshotRequest.AmdGpuMemoryStateOrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int VBO_TOTAL_POOL_AVAILABLE_KB_FIELD_NUMBER = 1;
      private int vboTotalPoolAvailableKb_ = 0;
      public static final int VBO_LARGEST_AVAILABLE_FREE_BLOCK_KB_FIELD_NUMBER = 2;
      private int vboLargestAvailableFreeBlockKb_ = 0;
      public static final int VBO_TOTAL_AUXILIARY_MEMORY_FREE_KB_FIELD_NUMBER = 3;
      private int vboTotalAuxiliaryMemoryFreeKb_ = 0;
      public static final int VBO_LARGEST_AUXILIARY_FREE_BLOCK_KB_FIELD_NUMBER = 4;
      private int vboLargestAuxiliaryFreeBlockKb_ = 0;
      private byte memoizedIsInitialized = -1;
      private static final RecordPerfSnapshotRequest.AmdGpuMemoryState DEFAULT_INSTANCE = new RecordPerfSnapshotRequest.AmdGpuMemoryState();
      private static final Parser<RecordPerfSnapshotRequest.AmdGpuMemoryState> PARSER = new AbstractParser<RecordPerfSnapshotRequest.AmdGpuMemoryState>() {
         public RecordPerfSnapshotRequest.AmdGpuMemoryState parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
            RecordPerfSnapshotRequest.AmdGpuMemoryState.Builder var3 = RecordPerfSnapshotRequest.AmdGpuMemoryState.newBuilder();

            try {
               var3.mergeFrom(var1, var2);
            } catch (InvalidProtocolBufferException var5) {
               throw var5.setUnfinishedMessage(var3.buildPartial());
            } catch (UninitializedMessageException var6) {
               throw var6.asInvalidProtocolBufferException().setUnfinishedMessage(var3.buildPartial());
            } catch (IOException var7) {
               throw new InvalidProtocolBufferException(var7).setUnfinishedMessage(var3.buildPartial());
            }

            return var3.buildPartial();
         }
      };

      private AmdGpuMemoryState(GeneratedMessageV3.Builder<?> var1) {
         super(var1);
      }

      private AmdGpuMemoryState() {
      }

      @Override
      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
         return new RecordPerfSnapshotRequest.AmdGpuMemoryState();
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_performance_v1_RecordPerfSnapshotRequest_AmdGpuMemoryState_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_performance_v1_RecordPerfSnapshotRequest_AmdGpuMemoryState_fieldAccessorTable
            .ensureFieldAccessorsInitialized(RecordPerfSnapshotRequest.AmdGpuMemoryState.class, RecordPerfSnapshotRequest.AmdGpuMemoryState.Builder.class);
      }

      @Override
      public int getVboTotalPoolAvailableKb() {
         return this.vboTotalPoolAvailableKb_;
      }

      @Override
      public int getVboLargestAvailableFreeBlockKb() {
         return this.vboLargestAvailableFreeBlockKb_;
      }

      @Override
      public int getVboTotalAuxiliaryMemoryFreeKb() {
         return this.vboTotalAuxiliaryMemoryFreeKb_;
      }

      @Override
      public int getVboLargestAuxiliaryFreeBlockKb() {
         return this.vboLargestAuxiliaryFreeBlockKb_;
      }

      @Override
      public final boolean isInitialized() {
         byte var1 = this.memoizedIsInitialized;
         if (var1 == 1) {
            return true;
         }

         if (var1 == 0) {
            return false;
         }

         this.memoizedIsInitialized = 1;
         return true;
      }

      @Override
      public void writeTo(CodedOutputStream var1) {
         if (this.vboTotalPoolAvailableKb_ != 0) {
            var1.writeInt32(1, this.vboTotalPoolAvailableKb_);
         }

         if (this.vboLargestAvailableFreeBlockKb_ != 0) {
            var1.writeInt32(2, this.vboLargestAvailableFreeBlockKb_);
         }

         if (this.vboTotalAuxiliaryMemoryFreeKb_ != 0) {
            var1.writeInt32(3, this.vboTotalAuxiliaryMemoryFreeKb_);
         }

         if (this.vboLargestAuxiliaryFreeBlockKb_ != 0) {
            var1.writeInt32(4, this.vboLargestAuxiliaryFreeBlockKb_);
         }

         this.getUnknownFields().writeTo(var1);
      }

      @Override
      public int getSerializedSize() {
         int var1 = this.memoizedSize;
         if (var1 != -1) {
            return var1;
         }

         var1 = 0;
         if (this.vboTotalPoolAvailableKb_ != 0) {
            var1 += CodedOutputStream.computeInt32Size(1, this.vboTotalPoolAvailableKb_);
         }

         if (this.vboLargestAvailableFreeBlockKb_ != 0) {
            var1 += CodedOutputStream.computeInt32Size(2, this.vboLargestAvailableFreeBlockKb_);
         }

         if (this.vboTotalAuxiliaryMemoryFreeKb_ != 0) {
            var1 += CodedOutputStream.computeInt32Size(3, this.vboTotalAuxiliaryMemoryFreeKb_);
         }

         if (this.vboLargestAuxiliaryFreeBlockKb_ != 0) {
            var1 += CodedOutputStream.computeInt32Size(4, this.vboLargestAuxiliaryFreeBlockKb_);
         }

         var1 += this.getUnknownFields().getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }

      @Override
      public boolean equals(Object var1) {
         if (var1 == this) {
            return true;
         } else if (!(var1 instanceof RecordPerfSnapshotRequest.AmdGpuMemoryState)) {
            return super.equals(var1);
         } else {
            RecordPerfSnapshotRequest.AmdGpuMemoryState var2 = (RecordPerfSnapshotRequest.AmdGpuMemoryState)var1;
            if (this.getVboTotalPoolAvailableKb() != var2.getVboTotalPoolAvailableKb()) {
               return false;
            } else if (this.getVboLargestAvailableFreeBlockKb() != var2.getVboLargestAvailableFreeBlockKb()) {
               return false;
            } else if (this.getVboTotalAuxiliaryMemoryFreeKb() != var2.getVboTotalAuxiliaryMemoryFreeKb()) {
               return false;
            } else {
               return this.getVboLargestAuxiliaryFreeBlockKb() != var2.getVboLargestAuxiliaryFreeBlockKb()
                  ? false
                  : this.getUnknownFields().equals(var2.getUnknownFields());
            }
         }
      }

      @Override
      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         }

         int var1 = 41;
         var1 = 19 * var1 + getDescriptor().hashCode();
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getVboTotalPoolAvailableKb();
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getVboLargestAvailableFreeBlockKb();
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getVboTotalAuxiliaryMemoryFreeKb();
         var1 = 37 * var1 + 4;
         var1 = 53 * var1 + this.getVboLargestAuxiliaryFreeBlockKb();
         var1 = 29 * var1 + this.getUnknownFields().hashCode();
         this.memoizedHashCode = var1;
         return var1;
      }

      public static RecordPerfSnapshotRequest.AmdGpuMemoryState parseFrom(ByteBuffer var0) {
         return PARSER.parseFrom(var0);
      }

      public static RecordPerfSnapshotRequest.AmdGpuMemoryState parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static RecordPerfSnapshotRequest.AmdGpuMemoryState parseFrom(ByteString var0) {
         return PARSER.parseFrom(var0);
      }

      public static RecordPerfSnapshotRequest.AmdGpuMemoryState parseFrom(ByteString var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static RecordPerfSnapshotRequest.AmdGpuMemoryState parseFrom(byte[] var0) {
         return PARSER.parseFrom(var0);
      }

      public static RecordPerfSnapshotRequest.AmdGpuMemoryState parseFrom(byte[] var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static RecordPerfSnapshotRequest.AmdGpuMemoryState parseFrom(InputStream var0) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0);
      }

      public static RecordPerfSnapshotRequest.AmdGpuMemoryState parseFrom(InputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
      }

      public static RecordPerfSnapshotRequest.AmdGpuMemoryState parseDelimitedFrom(InputStream var0) {
         return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
      }

      public static RecordPerfSnapshotRequest.AmdGpuMemoryState parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
      }

      public static RecordPerfSnapshotRequest.AmdGpuMemoryState parseFrom(CodedInputStream var0) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0);
      }

      public static RecordPerfSnapshotRequest.AmdGpuMemoryState parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
      }

      public RecordPerfSnapshotRequest.AmdGpuMemoryState.Builder newBuilderForType() {
         return newBuilder();
      }

      public static RecordPerfSnapshotRequest.AmdGpuMemoryState.Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static RecordPerfSnapshotRequest.AmdGpuMemoryState.Builder newBuilder(RecordPerfSnapshotRequest.AmdGpuMemoryState var0) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
      }

      public RecordPerfSnapshotRequest.AmdGpuMemoryState.Builder toBuilder() {
         return this == DEFAULT_INSTANCE
            ? new RecordPerfSnapshotRequest.AmdGpuMemoryState.Builder()
            : new RecordPerfSnapshotRequest.AmdGpuMemoryState.Builder().mergeFrom(this);
      }

      protected RecordPerfSnapshotRequest.AmdGpuMemoryState.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
         return new RecordPerfSnapshotRequest.AmdGpuMemoryState.Builder(var1);
      }

      public static RecordPerfSnapshotRequest.AmdGpuMemoryState getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<RecordPerfSnapshotRequest.AmdGpuMemoryState> parser() {
         return PARSER;
      }

      @Override
      public Parser<RecordPerfSnapshotRequest.AmdGpuMemoryState> getParserForType() {
         return PARSER;
      }

      public RecordPerfSnapshotRequest.AmdGpuMemoryState getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder
         extends GeneratedMessageV3.Builder<RecordPerfSnapshotRequest.AmdGpuMemoryState.Builder>
         implements RecordPerfSnapshotRequest.AmdGpuMemoryStateOrBuilder {
         private int bitField0_;
         private int vboTotalPoolAvailableKb_;
         private int vboLargestAvailableFreeBlockKb_;
         private int vboTotalAuxiliaryMemoryFreeKb_;
         private int vboLargestAuxiliaryFreeBlockKb_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ServiceProto.internal_static_lunarclient_websocket_performance_v1_RecordPerfSnapshotRequest_AmdGpuMemoryState_descriptor;
         }

         @Override
         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ServiceProto.internal_static_lunarclient_websocket_performance_v1_RecordPerfSnapshotRequest_AmdGpuMemoryState_fieldAccessorTable
               .ensureFieldAccessorsInitialized(RecordPerfSnapshotRequest.AmdGpuMemoryState.class, RecordPerfSnapshotRequest.AmdGpuMemoryState.Builder.class);
         }

         private Builder() {
         }

         private Builder(GeneratedMessageV3.BuilderParent var1) {
            super(var1);
         }

         public RecordPerfSnapshotRequest.AmdGpuMemoryState.Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.vboTotalPoolAvailableKb_ = 0;
            this.vboLargestAvailableFreeBlockKb_ = 0;
            this.vboTotalAuxiliaryMemoryFreeKb_ = 0;
            this.vboLargestAuxiliaryFreeBlockKb_ = 0;
            return this;
         }

         @Override
         public Descriptors.Descriptor getDescriptorForType() {
            return ServiceProto.internal_static_lunarclient_websocket_performance_v1_RecordPerfSnapshotRequest_AmdGpuMemoryState_descriptor;
         }

         public RecordPerfSnapshotRequest.AmdGpuMemoryState getDefaultInstanceForType() {
            return RecordPerfSnapshotRequest.AmdGpuMemoryState.getDefaultInstance();
         }

         public RecordPerfSnapshotRequest.AmdGpuMemoryState build() {
            RecordPerfSnapshotRequest.AmdGpuMemoryState var1 = this.buildPartial();
            if (!var1.isInitialized()) {
               throw newUninitializedMessageException(var1);
            } else {
               return var1;
            }
         }

         public RecordPerfSnapshotRequest.AmdGpuMemoryState buildPartial() {
            RecordPerfSnapshotRequest.AmdGpuMemoryState var1 = new RecordPerfSnapshotRequest.AmdGpuMemoryState(this);
            if (this.bitField0_ != 0) {
               this.buildPartial0(var1);
            }

            this.onBuilt();
            return var1;
         }

         private void buildPartial0(RecordPerfSnapshotRequest.AmdGpuMemoryState var1) {
            int var2 = this.bitField0_;
            if ((var2 & 1) != 0) {
               var1.vboTotalPoolAvailableKb_ = this.vboTotalPoolAvailableKb_;
            }

            if ((var2 & 2) != 0) {
               var1.vboLargestAvailableFreeBlockKb_ = this.vboLargestAvailableFreeBlockKb_;
            }

            if ((var2 & 4) != 0) {
               var1.vboTotalAuxiliaryMemoryFreeKb_ = this.vboTotalAuxiliaryMemoryFreeKb_;
            }

            if ((var2 & 8) != 0) {
               var1.vboLargestAuxiliaryFreeBlockKb_ = this.vboLargestAuxiliaryFreeBlockKb_;
            }
         }

         public RecordPerfSnapshotRequest.AmdGpuMemoryState.Builder clone() {
            return (RecordPerfSnapshotRequest.AmdGpuMemoryState.Builder)super.clone();
         }

         public RecordPerfSnapshotRequest.AmdGpuMemoryState.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
            return (RecordPerfSnapshotRequest.AmdGpuMemoryState.Builder)super.setField(var1, var2);
         }

         public RecordPerfSnapshotRequest.AmdGpuMemoryState.Builder clearField(Descriptors.FieldDescriptor var1) {
            return (RecordPerfSnapshotRequest.AmdGpuMemoryState.Builder)super.clearField(var1);
         }

         public RecordPerfSnapshotRequest.AmdGpuMemoryState.Builder clearOneof(Descriptors.OneofDescriptor var1) {
            return (RecordPerfSnapshotRequest.AmdGpuMemoryState.Builder)super.clearOneof(var1);
         }

         public RecordPerfSnapshotRequest.AmdGpuMemoryState.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
            return (RecordPerfSnapshotRequest.AmdGpuMemoryState.Builder)super.setRepeatedField(var1, var2, var3);
         }

         public RecordPerfSnapshotRequest.AmdGpuMemoryState.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
            return (RecordPerfSnapshotRequest.AmdGpuMemoryState.Builder)super.addRepeatedField(var1, var2);
         }

         public RecordPerfSnapshotRequest.AmdGpuMemoryState.Builder mergeFrom(Message var1) {
            if (var1 instanceof RecordPerfSnapshotRequest.AmdGpuMemoryState) {
               return this.mergeFrom((RecordPerfSnapshotRequest.AmdGpuMemoryState)var1);
            }

            super.mergeFrom(var1);
            return this;
         }

         public RecordPerfSnapshotRequest.AmdGpuMemoryState.Builder mergeFrom(RecordPerfSnapshotRequest.AmdGpuMemoryState var1) {
            if (var1 == RecordPerfSnapshotRequest.AmdGpuMemoryState.getDefaultInstance()) {
               return this;
            }

            if (var1.getVboTotalPoolAvailableKb() != 0) {
               this.setVboTotalPoolAvailableKb(var1.getVboTotalPoolAvailableKb());
            }

            if (var1.getVboLargestAvailableFreeBlockKb() != 0) {
               this.setVboLargestAvailableFreeBlockKb(var1.getVboLargestAvailableFreeBlockKb());
            }

            if (var1.getVboTotalAuxiliaryMemoryFreeKb() != 0) {
               this.setVboTotalAuxiliaryMemoryFreeKb(var1.getVboTotalAuxiliaryMemoryFreeKb());
            }

            if (var1.getVboLargestAuxiliaryFreeBlockKb() != 0) {
               this.setVboLargestAuxiliaryFreeBlockKb(var1.getVboLargestAuxiliaryFreeBlockKb());
            }

            this.mergeUnknownFields(var1.getUnknownFields());
            this.onChanged();
            return this;
         }

         @Override
         public final boolean isInitialized() {
            return true;
         }

         public RecordPerfSnapshotRequest.AmdGpuMemoryState.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            try {
               boolean var3 = false;

               while (!var3) {
                  int var4 = var1.readTag();
                  switch (var4) {
                     case 0:
                        var3 = true;
                        break;
                     case 8:
                        this.vboTotalPoolAvailableKb_ = var1.readInt32();
                        this.bitField0_ |= 1;
                        break;
                     case 16:
                        this.vboLargestAvailableFreeBlockKb_ = var1.readInt32();
                        this.bitField0_ |= 2;
                        break;
                     case 24:
                        this.vboTotalAuxiliaryMemoryFreeKb_ = var1.readInt32();
                        this.bitField0_ |= 4;
                        break;
                     case 32:
                        this.vboLargestAuxiliaryFreeBlockKb_ = var1.readInt32();
                        this.bitField0_ |= 8;
                        break;
                     default:
                        if (!super.parseUnknownField(var1, var2, var4)) {
                           var3 = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException var8) {
               throw var8.unwrapIOException();
            } finally {
               this.onChanged();
            }

            return this;
         }

         @Override
         public int getVboTotalPoolAvailableKb() {
            return this.vboTotalPoolAvailableKb_;
         }

         public RecordPerfSnapshotRequest.AmdGpuMemoryState.Builder setVboTotalPoolAvailableKb(int var1) {
            this.vboTotalPoolAvailableKb_ = var1;
            this.bitField0_ |= 1;
            this.onChanged();
            return this;
         }

         public RecordPerfSnapshotRequest.AmdGpuMemoryState.Builder clearVboTotalPoolAvailableKb() {
            this.bitField0_ &= -2;
            this.vboTotalPoolAvailableKb_ = 0;
            this.onChanged();
            return this;
         }

         @Override
         public int getVboLargestAvailableFreeBlockKb() {
            return this.vboLargestAvailableFreeBlockKb_;
         }

         public RecordPerfSnapshotRequest.AmdGpuMemoryState.Builder setVboLargestAvailableFreeBlockKb(int var1) {
            this.vboLargestAvailableFreeBlockKb_ = var1;
            this.bitField0_ |= 2;
            this.onChanged();
            return this;
         }

         public RecordPerfSnapshotRequest.AmdGpuMemoryState.Builder clearVboLargestAvailableFreeBlockKb() {
            this.bitField0_ &= -3;
            this.vboLargestAvailableFreeBlockKb_ = 0;
            this.onChanged();
            return this;
         }

         @Override
         public int getVboTotalAuxiliaryMemoryFreeKb() {
            return this.vboTotalAuxiliaryMemoryFreeKb_;
         }

         public RecordPerfSnapshotRequest.AmdGpuMemoryState.Builder setVboTotalAuxiliaryMemoryFreeKb(int var1) {
            this.vboTotalAuxiliaryMemoryFreeKb_ = var1;
            this.bitField0_ |= 4;
            this.onChanged();
            return this;
         }

         public RecordPerfSnapshotRequest.AmdGpuMemoryState.Builder clearVboTotalAuxiliaryMemoryFreeKb() {
            this.bitField0_ &= -5;
            this.vboTotalAuxiliaryMemoryFreeKb_ = 0;
            this.onChanged();
            return this;
         }

         @Override
         public int getVboLargestAuxiliaryFreeBlockKb() {
            return this.vboLargestAuxiliaryFreeBlockKb_;
         }

         public RecordPerfSnapshotRequest.AmdGpuMemoryState.Builder setVboLargestAuxiliaryFreeBlockKb(int var1) {
            this.vboLargestAuxiliaryFreeBlockKb_ = var1;
            this.bitField0_ |= 8;
            this.onChanged();
            return this;
         }

         public RecordPerfSnapshotRequest.AmdGpuMemoryState.Builder clearVboLargestAuxiliaryFreeBlockKb() {
            this.bitField0_ &= -9;
            this.vboLargestAuxiliaryFreeBlockKb_ = 0;
            this.onChanged();
            return this;
         }

         public final RecordPerfSnapshotRequest.AmdGpuMemoryState.Builder setUnknownFields(UnknownFieldSet var1) {
            return (RecordPerfSnapshotRequest.AmdGpuMemoryState.Builder)super.setUnknownFields(var1);
         }

         public final RecordPerfSnapshotRequest.AmdGpuMemoryState.Builder mergeUnknownFields(UnknownFieldSet var1) {
            return (RecordPerfSnapshotRequest.AmdGpuMemoryState.Builder)super.mergeUnknownFields(var1);
         }
      }
   }

   public interface AmdGpuMemoryStateOrBuilder extends MessageOrBuilder {
      int getVboTotalPoolAvailableKb();

      int getVboLargestAvailableFreeBlockKb();

      int getVboTotalAuxiliaryMemoryFreeKb();

      int getVboLargestAuxiliaryFreeBlockKb();
   }

   public static final class AverageGroup extends GeneratedMessageV3 implements RecordPerfSnapshotRequest.AverageGroupOrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int AVERAGE_FIELD_NUMBER = 1;
      private float average_ = 0.0F;
      public static final int HIGH_FIELD_NUMBER = 2;
      private int high_ = 0;
      public static final int LOW_FIELD_NUMBER = 3;
      private int low_ = 0;
      private byte memoizedIsInitialized = -1;
      private static final RecordPerfSnapshotRequest.AverageGroup DEFAULT_INSTANCE = new RecordPerfSnapshotRequest.AverageGroup();
      private static final Parser<RecordPerfSnapshotRequest.AverageGroup> PARSER = new AbstractParser<RecordPerfSnapshotRequest.AverageGroup>() {
         public RecordPerfSnapshotRequest.AverageGroup parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
            RecordPerfSnapshotRequest.AverageGroup.Builder var3 = RecordPerfSnapshotRequest.AverageGroup.newBuilder();

            try {
               var3.mergeFrom(var1, var2);
            } catch (InvalidProtocolBufferException var5) {
               throw var5.setUnfinishedMessage(var3.buildPartial());
            } catch (UninitializedMessageException var6) {
               throw var6.asInvalidProtocolBufferException().setUnfinishedMessage(var3.buildPartial());
            } catch (IOException var7) {
               throw new InvalidProtocolBufferException(var7).setUnfinishedMessage(var3.buildPartial());
            }

            return var3.buildPartial();
         }
      };

      private AverageGroup(GeneratedMessageV3.Builder<?> var1) {
         super(var1);
      }

      private AverageGroup() {
      }

      @Override
      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
         return new RecordPerfSnapshotRequest.AverageGroup();
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_performance_v1_RecordPerfSnapshotRequest_AverageGroup_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_performance_v1_RecordPerfSnapshotRequest_AverageGroup_fieldAccessorTable
            .ensureFieldAccessorsInitialized(RecordPerfSnapshotRequest.AverageGroup.class, RecordPerfSnapshotRequest.AverageGroup.Builder.class);
      }

      @Override
      public float getAverage() {
         return this.average_;
      }

      @Override
      public int getHigh() {
         return this.high_;
      }

      @Override
      public int getLow() {
         return this.low_;
      }

      @Override
      public final boolean isInitialized() {
         byte var1 = this.memoizedIsInitialized;
         if (var1 == 1) {
            return true;
         }

         if (var1 == 0) {
            return false;
         }

         this.memoizedIsInitialized = 1;
         return true;
      }

      @Override
      public void writeTo(CodedOutputStream var1) {
         if (Float.floatToRawIntBits(this.average_) != 0) {
            var1.writeFloat(1, this.average_);
         }

         if (this.high_ != 0) {
            var1.writeInt32(2, this.high_);
         }

         if (this.low_ != 0) {
            var1.writeInt32(3, this.low_);
         }

         this.getUnknownFields().writeTo(var1);
      }

      @Override
      public int getSerializedSize() {
         int var1 = this.memoizedSize;
         if (var1 != -1) {
            return var1;
         }

         var1 = 0;
         if (Float.floatToRawIntBits(this.average_) != 0) {
            var1 += CodedOutputStream.computeFloatSize(1, this.average_);
         }

         if (this.high_ != 0) {
            var1 += CodedOutputStream.computeInt32Size(2, this.high_);
         }

         if (this.low_ != 0) {
            var1 += CodedOutputStream.computeInt32Size(3, this.low_);
         }

         var1 += this.getUnknownFields().getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }

      @Override
      public boolean equals(Object var1) {
         if (var1 == this) {
            return true;
         } else if (!(var1 instanceof RecordPerfSnapshotRequest.AverageGroup)) {
            return super.equals(var1);
         } else {
            RecordPerfSnapshotRequest.AverageGroup var2 = (RecordPerfSnapshotRequest.AverageGroup)var1;
            if (Float.floatToIntBits(this.getAverage()) != Float.floatToIntBits(var2.getAverage())) {
               return false;
            } else if (this.getHigh() != var2.getHigh()) {
               return false;
            } else {
               return this.getLow() != var2.getLow() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
            }
         }
      }

      @Override
      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         }

         int var1 = 41;
         var1 = 19 * var1 + getDescriptor().hashCode();
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + Float.floatToIntBits(this.getAverage());
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getHigh();
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getLow();
         var1 = 29 * var1 + this.getUnknownFields().hashCode();
         this.memoizedHashCode = var1;
         return var1;
      }

      public static RecordPerfSnapshotRequest.AverageGroup parseFrom(ByteBuffer var0) {
         return PARSER.parseFrom(var0);
      }

      public static RecordPerfSnapshotRequest.AverageGroup parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static RecordPerfSnapshotRequest.AverageGroup parseFrom(ByteString var0) {
         return PARSER.parseFrom(var0);
      }

      public static RecordPerfSnapshotRequest.AverageGroup parseFrom(ByteString var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static RecordPerfSnapshotRequest.AverageGroup parseFrom(byte[] var0) {
         return PARSER.parseFrom(var0);
      }

      public static RecordPerfSnapshotRequest.AverageGroup parseFrom(byte[] var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static RecordPerfSnapshotRequest.AverageGroup parseFrom(InputStream var0) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0);
      }

      public static RecordPerfSnapshotRequest.AverageGroup parseFrom(InputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
      }

      public static RecordPerfSnapshotRequest.AverageGroup parseDelimitedFrom(InputStream var0) {
         return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
      }

      public static RecordPerfSnapshotRequest.AverageGroup parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
      }

      public static RecordPerfSnapshotRequest.AverageGroup parseFrom(CodedInputStream var0) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0);
      }

      public static RecordPerfSnapshotRequest.AverageGroup parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
      }

      public RecordPerfSnapshotRequest.AverageGroup.Builder newBuilderForType() {
         return newBuilder();
      }

      public static RecordPerfSnapshotRequest.AverageGroup.Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static RecordPerfSnapshotRequest.AverageGroup.Builder newBuilder(RecordPerfSnapshotRequest.AverageGroup var0) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
      }

      public RecordPerfSnapshotRequest.AverageGroup.Builder toBuilder() {
         return this == DEFAULT_INSTANCE
            ? new RecordPerfSnapshotRequest.AverageGroup.Builder()
            : new RecordPerfSnapshotRequest.AverageGroup.Builder().mergeFrom(this);
      }

      protected RecordPerfSnapshotRequest.AverageGroup.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
         return new RecordPerfSnapshotRequest.AverageGroup.Builder(var1);
      }

      public static RecordPerfSnapshotRequest.AverageGroup getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<RecordPerfSnapshotRequest.AverageGroup> parser() {
         return PARSER;
      }

      @Override
      public Parser<RecordPerfSnapshotRequest.AverageGroup> getParserForType() {
         return PARSER;
      }

      public RecordPerfSnapshotRequest.AverageGroup getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder
         extends GeneratedMessageV3.Builder<RecordPerfSnapshotRequest.AverageGroup.Builder>
         implements RecordPerfSnapshotRequest.AverageGroupOrBuilder {
         private int bitField0_;
         private float average_;
         private int high_;
         private int low_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ServiceProto.internal_static_lunarclient_websocket_performance_v1_RecordPerfSnapshotRequest_AverageGroup_descriptor;
         }

         @Override
         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ServiceProto.internal_static_lunarclient_websocket_performance_v1_RecordPerfSnapshotRequest_AverageGroup_fieldAccessorTable
               .ensureFieldAccessorsInitialized(RecordPerfSnapshotRequest.AverageGroup.class, RecordPerfSnapshotRequest.AverageGroup.Builder.class);
         }

         private Builder() {
         }

         private Builder(GeneratedMessageV3.BuilderParent var1) {
            super(var1);
         }

         public RecordPerfSnapshotRequest.AverageGroup.Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.average_ = 0.0F;
            this.high_ = 0;
            this.low_ = 0;
            return this;
         }

         @Override
         public Descriptors.Descriptor getDescriptorForType() {
            return ServiceProto.internal_static_lunarclient_websocket_performance_v1_RecordPerfSnapshotRequest_AverageGroup_descriptor;
         }

         public RecordPerfSnapshotRequest.AverageGroup getDefaultInstanceForType() {
            return RecordPerfSnapshotRequest.AverageGroup.getDefaultInstance();
         }

         public RecordPerfSnapshotRequest.AverageGroup build() {
            RecordPerfSnapshotRequest.AverageGroup var1 = this.buildPartial();
            if (!var1.isInitialized()) {
               throw newUninitializedMessageException(var1);
            } else {
               return var1;
            }
         }

         public RecordPerfSnapshotRequest.AverageGroup buildPartial() {
            RecordPerfSnapshotRequest.AverageGroup var1 = new RecordPerfSnapshotRequest.AverageGroup(this);
            if (this.bitField0_ != 0) {
               this.buildPartial0(var1);
            }

            this.onBuilt();
            return var1;
         }

         private void buildPartial0(RecordPerfSnapshotRequest.AverageGroup var1) {
            int var2 = this.bitField0_;
            if ((var2 & 1) != 0) {
               var1.average_ = this.average_;
            }

            if ((var2 & 2) != 0) {
               var1.high_ = this.high_;
            }

            if ((var2 & 4) != 0) {
               var1.low_ = this.low_;
            }
         }

         public RecordPerfSnapshotRequest.AverageGroup.Builder clone() {
            return (RecordPerfSnapshotRequest.AverageGroup.Builder)super.clone();
         }

         public RecordPerfSnapshotRequest.AverageGroup.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
            return (RecordPerfSnapshotRequest.AverageGroup.Builder)super.setField(var1, var2);
         }

         public RecordPerfSnapshotRequest.AverageGroup.Builder clearField(Descriptors.FieldDescriptor var1) {
            return (RecordPerfSnapshotRequest.AverageGroup.Builder)super.clearField(var1);
         }

         public RecordPerfSnapshotRequest.AverageGroup.Builder clearOneof(Descriptors.OneofDescriptor var1) {
            return (RecordPerfSnapshotRequest.AverageGroup.Builder)super.clearOneof(var1);
         }

         public RecordPerfSnapshotRequest.AverageGroup.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
            return (RecordPerfSnapshotRequest.AverageGroup.Builder)super.setRepeatedField(var1, var2, var3);
         }

         public RecordPerfSnapshotRequest.AverageGroup.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
            return (RecordPerfSnapshotRequest.AverageGroup.Builder)super.addRepeatedField(var1, var2);
         }

         public RecordPerfSnapshotRequest.AverageGroup.Builder mergeFrom(Message var1) {
            if (var1 instanceof RecordPerfSnapshotRequest.AverageGroup) {
               return this.mergeFrom((RecordPerfSnapshotRequest.AverageGroup)var1);
            }

            super.mergeFrom(var1);
            return this;
         }

         public RecordPerfSnapshotRequest.AverageGroup.Builder mergeFrom(RecordPerfSnapshotRequest.AverageGroup var1) {
            if (var1 == RecordPerfSnapshotRequest.AverageGroup.getDefaultInstance()) {
               return this;
            }

            if (var1.getAverage() != 0.0F) {
               this.setAverage(var1.getAverage());
            }

            if (var1.getHigh() != 0) {
               this.setHigh(var1.getHigh());
            }

            if (var1.getLow() != 0) {
               this.setLow(var1.getLow());
            }

            this.mergeUnknownFields(var1.getUnknownFields());
            this.onChanged();
            return this;
         }

         @Override
         public final boolean isInitialized() {
            return true;
         }

         public RecordPerfSnapshotRequest.AverageGroup.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            try {
               boolean var3 = false;

               while (!var3) {
                  int var4 = var1.readTag();
                  switch (var4) {
                     case 0:
                        var3 = true;
                        break;
                     case 13:
                        this.average_ = var1.readFloat();
                        this.bitField0_ |= 1;
                        break;
                     case 16:
                        this.high_ = var1.readInt32();
                        this.bitField0_ |= 2;
                        break;
                     case 24:
                        this.low_ = var1.readInt32();
                        this.bitField0_ |= 4;
                        break;
                     default:
                        if (!super.parseUnknownField(var1, var2, var4)) {
                           var3 = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException var8) {
               throw var8.unwrapIOException();
            } finally {
               this.onChanged();
            }

            return this;
         }

         @Override
         public float getAverage() {
            return this.average_;
         }

         public RecordPerfSnapshotRequest.AverageGroup.Builder setAverage(float var1) {
            this.average_ = var1;
            this.bitField0_ |= 1;
            this.onChanged();
            return this;
         }

         public RecordPerfSnapshotRequest.AverageGroup.Builder clearAverage() {
            this.bitField0_ &= -2;
            this.average_ = 0.0F;
            this.onChanged();
            return this;
         }

         @Override
         public int getHigh() {
            return this.high_;
         }

         public RecordPerfSnapshotRequest.AverageGroup.Builder setHigh(int var1) {
            this.high_ = var1;
            this.bitField0_ |= 2;
            this.onChanged();
            return this;
         }

         public RecordPerfSnapshotRequest.AverageGroup.Builder clearHigh() {
            this.bitField0_ &= -3;
            this.high_ = 0;
            this.onChanged();
            return this;
         }

         @Override
         public int getLow() {
            return this.low_;
         }

         public RecordPerfSnapshotRequest.AverageGroup.Builder setLow(int var1) {
            this.low_ = var1;
            this.bitField0_ |= 4;
            this.onChanged();
            return this;
         }

         public RecordPerfSnapshotRequest.AverageGroup.Builder clearLow() {
            this.bitField0_ &= -5;
            this.low_ = 0;
            this.onChanged();
            return this;
         }

         public final RecordPerfSnapshotRequest.AverageGroup.Builder setUnknownFields(UnknownFieldSet var1) {
            return (RecordPerfSnapshotRequest.AverageGroup.Builder)super.setUnknownFields(var1);
         }

         public final RecordPerfSnapshotRequest.AverageGroup.Builder mergeUnknownFields(UnknownFieldSet var1) {
            return (RecordPerfSnapshotRequest.AverageGroup.Builder)super.mergeUnknownFields(var1);
         }
      }
   }

   public interface AverageGroupOrBuilder extends MessageOrBuilder {
      float getAverage();

      int getHigh();

      int getLow();
   }

   public static final class Builder extends GeneratedMessageV3.Builder<RecordPerfSnapshotRequest.Builder> implements RecordPerfSnapshotRequestOrBuilder {
      private int gpuMemoryStateCase_ = 0;
      private Object gpuMemoryState_;
      private int bitField0_;
      private int bitField1_;
      private int fps_;
      private int renderedChunkSections_;
      private int loadedChunks_;
      private int renderedEntities_;
      private int renderedPlayers_;
      private int renderedParticles_;
      private int renderedBlockEntities_;
      private int freeMemoryKb_;
      private int totalMemoryKb_;
      private int maxMemoryKb_;
      private float gpuUsage_;
      private float frametime_;
      private int directMemoryKb_;
      private int offHeapMemoryKb_;
      private int lunarHuds_;
      private int renderedGeckolibCosmetics_;
      private int renderedCosmetics_;
      private int renderedEmotes_;
      private int renderedTurboEntities_;
      private int renderedTurboBlockEntities_;
      private boolean usingExternalShaders_;
      private RecordPerfSnapshotRequest.AverageGroup averageFps_;
      private SingleFieldBuilderV3<RecordPerfSnapshotRequest.AverageGroup, RecordPerfSnapshotRequest.AverageGroup.Builder, RecordPerfSnapshotRequest.AverageGroupOrBuilder> averageFpsBuilder_;
      private SingleFieldBuilderV3<RecordPerfSnapshotRequest.NvidiaGpuMemoryState, RecordPerfSnapshotRequest.NvidiaGpuMemoryState.Builder, RecordPerfSnapshotRequest.NvidiaGpuMemoryStateOrBuilder> nvidiaMemoryBuilder_;
      private SingleFieldBuilderV3<RecordPerfSnapshotRequest.AmdGpuMemoryState, RecordPerfSnapshotRequest.AmdGpuMemoryState.Builder, RecordPerfSnapshotRequest.AmdGpuMemoryStateOrBuilder> amdMemoryBuilder_;
      private int width_;
      private int height_;
      private boolean fullscreen_;
      private boolean vsync_;
      private boolean smoothLighting_;
      private boolean entityShadows_;
      private int maxFramerate_;
      private int graphicsStatus_ = 0;
      private int chunkBuilder_ = 0;
      private int clouds_ = 0;
      private int particles_ = 0;
      private int renderDistance_;
      private int simulatedDistance_;
      private int entityDistance_;
      private int biomeBlend_;
      private int fov_;
      private boolean hudCaching_;
      private boolean particlePhysics_;
      private int lazyChunkLoading_ = 0;
      private boolean turboEntities_;
      private int turboEntitiesRate_;
      private boolean turboBlockEntities_;
      private int turboBlockEntitiesRate_;
      private boolean turboBlockEntitiesFar_;
      private Object gpuName_ = "";
      private int gcCycles_;
      private int longestGcMicro_;
      private int shortestGcMicro_;
      private int avgGcMicro_;
      private int medianGcMicro_;
      private float frameTimeAverage_;
      private float frameTimeFastest_;
      private float frameTimeSlowest_;
      private Object graphicsBackend_ = "";
      private boolean sodiumPresent_;
      private int textureFiltering_ = 0;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_performance_v1_RecordPerfSnapshotRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_performance_v1_RecordPerfSnapshotRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(RecordPerfSnapshotRequest.class, RecordPerfSnapshotRequest.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (RecordPerfSnapshotRequest.alwaysUseFieldBuilders) {
            this.getAverageFpsFieldBuilder();
         }
      }

      public RecordPerfSnapshotRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.bitField1_ = 0;
         this.fps_ = 0;
         this.renderedChunkSections_ = 0;
         this.loadedChunks_ = 0;
         this.renderedEntities_ = 0;
         this.renderedPlayers_ = 0;
         this.renderedParticles_ = 0;
         this.renderedBlockEntities_ = 0;
         this.freeMemoryKb_ = 0;
         this.totalMemoryKb_ = 0;
         this.maxMemoryKb_ = 0;
         this.gpuUsage_ = 0.0F;
         this.frametime_ = 0.0F;
         this.directMemoryKb_ = 0;
         this.offHeapMemoryKb_ = 0;
         this.lunarHuds_ = 0;
         this.renderedGeckolibCosmetics_ = 0;
         this.renderedCosmetics_ = 0;
         this.renderedEmotes_ = 0;
         this.renderedTurboEntities_ = 0;
         this.renderedTurboBlockEntities_ = 0;
         this.usingExternalShaders_ = false;
         this.averageFps_ = null;
         if (this.averageFpsBuilder_ != null) {
            this.averageFpsBuilder_.dispose();
            this.averageFpsBuilder_ = null;
         }

         if (this.nvidiaMemoryBuilder_ != null) {
            this.nvidiaMemoryBuilder_.clear();
         }

         if (this.amdMemoryBuilder_ != null) {
            this.amdMemoryBuilder_.clear();
         }

         this.width_ = 0;
         this.height_ = 0;
         this.fullscreen_ = false;
         this.vsync_ = false;
         this.smoothLighting_ = false;
         this.entityShadows_ = false;
         this.maxFramerate_ = 0;
         this.graphicsStatus_ = 0;
         this.chunkBuilder_ = 0;
         this.clouds_ = 0;
         this.particles_ = 0;
         this.renderDistance_ = 0;
         this.simulatedDistance_ = 0;
         this.entityDistance_ = 0;
         this.biomeBlend_ = 0;
         this.fov_ = 0;
         this.hudCaching_ = false;
         this.particlePhysics_ = false;
         this.lazyChunkLoading_ = 0;
         this.turboEntities_ = false;
         this.turboEntitiesRate_ = 0;
         this.turboBlockEntities_ = false;
         this.turboBlockEntitiesRate_ = 0;
         this.turboBlockEntitiesFar_ = false;
         this.gpuName_ = "";
         this.gcCycles_ = 0;
         this.longestGcMicro_ = 0;
         this.shortestGcMicro_ = 0;
         this.avgGcMicro_ = 0;
         this.medianGcMicro_ = 0;
         this.frameTimeAverage_ = 0.0F;
         this.frameTimeFastest_ = 0.0F;
         this.frameTimeSlowest_ = 0.0F;
         this.graphicsBackend_ = "";
         this.sodiumPresent_ = false;
         this.textureFiltering_ = 0;
         this.gpuMemoryStateCase_ = 0;
         this.gpuMemoryState_ = null;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_performance_v1_RecordPerfSnapshotRequest_descriptor;
      }

      public RecordPerfSnapshotRequest getDefaultInstanceForType() {
         return RecordPerfSnapshotRequest.getDefaultInstance();
      }

      public RecordPerfSnapshotRequest build() {
         RecordPerfSnapshotRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public RecordPerfSnapshotRequest buildPartial() {
         RecordPerfSnapshotRequest var1 = new RecordPerfSnapshotRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         if (this.bitField1_ != 0) {
            this.buildPartial1(var1);
         }

         this.buildPartialOneofs(var1);
         this.onBuilt();
         return var1;
      }

      private void buildPartial0(RecordPerfSnapshotRequest var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.fps_ = this.fps_;
         }

         if ((var2 & 2) != 0) {
            var1.renderedChunkSections_ = this.renderedChunkSections_;
         }

         if ((var2 & 4) != 0) {
            var1.loadedChunks_ = this.loadedChunks_;
         }

         if ((var2 & 8) != 0) {
            var1.renderedEntities_ = this.renderedEntities_;
         }

         if ((var2 & 16) != 0) {
            var1.renderedPlayers_ = this.renderedPlayers_;
         }

         if ((var2 & 32) != 0) {
            var1.renderedParticles_ = this.renderedParticles_;
         }

         if ((var2 & 64) != 0) {
            var1.renderedBlockEntities_ = this.renderedBlockEntities_;
         }

         if ((var2 & 128) != 0) {
            var1.freeMemoryKb_ = this.freeMemoryKb_;
         }

         if ((var2 & 256) != 0) {
            var1.totalMemoryKb_ = this.totalMemoryKb_;
         }

         if ((var2 & 512) != 0) {
            var1.maxMemoryKb_ = this.maxMemoryKb_;
         }

         if ((var2 & 1024) != 0) {
            var1.gpuUsage_ = this.gpuUsage_;
         }

         if ((var2 & 2048) != 0) {
            var1.frametime_ = this.frametime_;
         }

         if ((var2 & 4096) != 0) {
            var1.directMemoryKb_ = this.directMemoryKb_;
         }

         if ((var2 & 8192) != 0) {
            var1.offHeapMemoryKb_ = this.offHeapMemoryKb_;
         }

         if ((var2 & 16384) != 0) {
            var1.lunarHuds_ = this.lunarHuds_;
         }

         if ((var2 & 32768) != 0) {
            var1.renderedGeckolibCosmetics_ = this.renderedGeckolibCosmetics_;
         }

         if ((var2 & 65536) != 0) {
            var1.renderedCosmetics_ = this.renderedCosmetics_;
         }

         if ((var2 & 131072) != 0) {
            var1.renderedEmotes_ = this.renderedEmotes_;
         }

         if ((var2 & 262144) != 0) {
            var1.renderedTurboEntities_ = this.renderedTurboEntities_;
         }

         if ((var2 & 524288) != 0) {
            var1.renderedTurboBlockEntities_ = this.renderedTurboBlockEntities_;
         }

         if ((var2 & 1048576) != 0) {
            var1.usingExternalShaders_ = this.usingExternalShaders_;
         }

         byte var3 = 0;
         if ((var2 & 2097152) != 0) {
            var1.averageFps_ = this.averageFpsBuilder_ == null ? this.averageFps_ : this.averageFpsBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 16777216) != 0) {
            var1.width_ = this.width_;
         }

         if ((var2 & 33554432) != 0) {
            var1.height_ = this.height_;
         }

         if ((var2 & 67108864) != 0) {
            var1.fullscreen_ = this.fullscreen_;
         }

         if ((var2 & 134217728) != 0) {
            var1.vsync_ = this.vsync_;
         }

         if ((var2 & 268435456) != 0) {
            var1.smoothLighting_ = this.smoothLighting_;
         }

         if ((var2 & 536870912) != 0) {
            var1.entityShadows_ = this.entityShadows_;
         }

         if ((var2 & 1073741824) != 0) {
            var1.maxFramerate_ = this.maxFramerate_;
         }

         if ((var2 & -2147483648) != 0) {
            var1.graphicsStatus_ = this.graphicsStatus_;
         }

         RecordPerfSnapshotRequest var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      private void buildPartial1(RecordPerfSnapshotRequest var1) {
         int var2 = this.bitField1_;
         if ((var2 & 1) != 0) {
            var1.chunkBuilder_ = this.chunkBuilder_;
         }

         if ((var2 & 2) != 0) {
            var1.clouds_ = this.clouds_;
         }

         if ((var2 & 4) != 0) {
            var1.particles_ = this.particles_;
         }

         if ((var2 & 8) != 0) {
            var1.renderDistance_ = this.renderDistance_;
         }

         if ((var2 & 16) != 0) {
            var1.simulatedDistance_ = this.simulatedDistance_;
         }

         if ((var2 & 32) != 0) {
            var1.entityDistance_ = this.entityDistance_;
         }

         if ((var2 & 64) != 0) {
            var1.biomeBlend_ = this.biomeBlend_;
         }

         if ((var2 & 128) != 0) {
            var1.fov_ = this.fov_;
         }

         if ((var2 & 256) != 0) {
            var1.hudCaching_ = this.hudCaching_;
         }

         if ((var2 & 512) != 0) {
            var1.particlePhysics_ = this.particlePhysics_;
         }

         if ((var2 & 1024) != 0) {
            var1.lazyChunkLoading_ = this.lazyChunkLoading_;
         }

         if ((var2 & 2048) != 0) {
            var1.turboEntities_ = this.turboEntities_;
         }

         if ((var2 & 4096) != 0) {
            var1.turboEntitiesRate_ = this.turboEntitiesRate_;
         }

         if ((var2 & 8192) != 0) {
            var1.turboBlockEntities_ = this.turboBlockEntities_;
         }

         if ((var2 & 16384) != 0) {
            var1.turboBlockEntitiesRate_ = this.turboBlockEntitiesRate_;
         }

         if ((var2 & 32768) != 0) {
            var1.turboBlockEntitiesFar_ = this.turboBlockEntitiesFar_;
         }

         if ((var2 & 65536) != 0) {
            var1.gpuName_ = this.gpuName_;
         }

         if ((var2 & 131072) != 0) {
            var1.gcCycles_ = this.gcCycles_;
         }

         if ((var2 & 262144) != 0) {
            var1.longestGcMicro_ = this.longestGcMicro_;
         }

         if ((var2 & 524288) != 0) {
            var1.shortestGcMicro_ = this.shortestGcMicro_;
         }

         if ((var2 & 1048576) != 0) {
            var1.avgGcMicro_ = this.avgGcMicro_;
         }

         if ((var2 & 2097152) != 0) {
            var1.medianGcMicro_ = this.medianGcMicro_;
         }

         if ((var2 & 4194304) != 0) {
            var1.frameTimeAverage_ = this.frameTimeAverage_;
         }

         if ((var2 & 8388608) != 0) {
            var1.frameTimeFastest_ = this.frameTimeFastest_;
         }

         if ((var2 & 16777216) != 0) {
            var1.frameTimeSlowest_ = this.frameTimeSlowest_;
         }

         if ((var2 & 33554432) != 0) {
            var1.graphicsBackend_ = this.graphicsBackend_;
         }

         if ((var2 & 67108864) != 0) {
            var1.sodiumPresent_ = this.sodiumPresent_;
         }

         if ((var2 & 134217728) != 0) {
            var1.textureFiltering_ = this.textureFiltering_;
         }
      }

      private void buildPartialOneofs(RecordPerfSnapshotRequest var1) {
         var1.gpuMemoryStateCase_ = this.gpuMemoryStateCase_;
         var1.gpuMemoryState_ = this.gpuMemoryState_;
         if (this.gpuMemoryStateCase_ == 23 && this.nvidiaMemoryBuilder_ != null) {
            var1.gpuMemoryState_ = this.nvidiaMemoryBuilder_.build();
         }

         if (this.gpuMemoryStateCase_ == 24 && this.amdMemoryBuilder_ != null) {
            var1.gpuMemoryState_ = this.amdMemoryBuilder_.build();
         }
      }

      public RecordPerfSnapshotRequest.Builder clone() {
         return (RecordPerfSnapshotRequest.Builder)super.clone();
      }

      public RecordPerfSnapshotRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RecordPerfSnapshotRequest.Builder)super.setField(var1, var2);
      }

      public RecordPerfSnapshotRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (RecordPerfSnapshotRequest.Builder)super.clearField(var1);
      }

      public RecordPerfSnapshotRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (RecordPerfSnapshotRequest.Builder)super.clearOneof(var1);
      }

      public RecordPerfSnapshotRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (RecordPerfSnapshotRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public RecordPerfSnapshotRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RecordPerfSnapshotRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public RecordPerfSnapshotRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof RecordPerfSnapshotRequest) {
            return this.mergeFrom((RecordPerfSnapshotRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public RecordPerfSnapshotRequest.Builder mergeFrom(RecordPerfSnapshotRequest var1) {
         if (var1 == RecordPerfSnapshotRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.getFps() != 0) {
            this.setFps(var1.getFps());
         }

         if (var1.getRenderedChunkSections() != 0) {
            this.setRenderedChunkSections(var1.getRenderedChunkSections());
         }

         if (var1.getLoadedChunks() != 0) {
            this.setLoadedChunks(var1.getLoadedChunks());
         }

         if (var1.getRenderedEntities() != 0) {
            this.setRenderedEntities(var1.getRenderedEntities());
         }

         if (var1.getRenderedPlayers() != 0) {
            this.setRenderedPlayers(var1.getRenderedPlayers());
         }

         if (var1.getRenderedParticles() != 0) {
            this.setRenderedParticles(var1.getRenderedParticles());
         }

         if (var1.getRenderedBlockEntities() != 0) {
            this.setRenderedBlockEntities(var1.getRenderedBlockEntities());
         }

         if (var1.getFreeMemoryKb() != 0) {
            this.setFreeMemoryKb(var1.getFreeMemoryKb());
         }

         if (var1.getTotalMemoryKb() != 0) {
            this.setTotalMemoryKb(var1.getTotalMemoryKb());
         }

         if (var1.getMaxMemoryKb() != 0) {
            this.setMaxMemoryKb(var1.getMaxMemoryKb());
         }

         if (var1.getGpuUsage() != 0.0F) {
            this.setGpuUsage(var1.getGpuUsage());
         }

         if (var1.getFrametime() != 0.0F) {
            this.setFrametime(var1.getFrametime());
         }

         if (var1.getDirectMemoryKb() != 0) {
            this.setDirectMemoryKb(var1.getDirectMemoryKb());
         }

         if (var1.getOffHeapMemoryKb() != 0) {
            this.setOffHeapMemoryKb(var1.getOffHeapMemoryKb());
         }

         if (var1.getLunarHuds() != 0) {
            this.setLunarHuds(var1.getLunarHuds());
         }

         if (var1.getRenderedGeckolibCosmetics() != 0) {
            this.setRenderedGeckolibCosmetics(var1.getRenderedGeckolibCosmetics());
         }

         if (var1.getRenderedCosmetics() != 0) {
            this.setRenderedCosmetics(var1.getRenderedCosmetics());
         }

         if (var1.getRenderedEmotes() != 0) {
            this.setRenderedEmotes(var1.getRenderedEmotes());
         }

         if (var1.getRenderedTurboEntities() != 0) {
            this.setRenderedTurboEntities(var1.getRenderedTurboEntities());
         }

         if (var1.getRenderedTurboBlockEntities() != 0) {
            this.setRenderedTurboBlockEntities(var1.getRenderedTurboBlockEntities());
         }

         if (var1.getUsingExternalShaders()) {
            this.setUsingExternalShaders(var1.getUsingExternalShaders());
         }

         if (var1.hasAverageFps()) {
            this.mergeAverageFps(var1.getAverageFps());
         }

         if (var1.getWidth() != 0) {
            this.setWidth(var1.getWidth());
         }

         if (var1.getHeight() != 0) {
            this.setHeight(var1.getHeight());
         }

         if (var1.getFullscreen()) {
            this.setFullscreen(var1.getFullscreen());
         }

         if (var1.getVsync()) {
            this.setVsync(var1.getVsync());
         }

         if (var1.getSmoothLighting()) {
            this.setSmoothLighting(var1.getSmoothLighting());
         }

         if (var1.getEntityShadows()) {
            this.setEntityShadows(var1.getEntityShadows());
         }

         if (var1.getMaxFramerate() != 0) {
            this.setMaxFramerate(var1.getMaxFramerate());
         }

         if (var1.graphicsStatus_ != 0) {
            this.setGraphicsStatusValue(var1.getGraphicsStatusValue());
         }

         if (var1.chunkBuilder_ != 0) {
            this.setChunkBuilderValue(var1.getChunkBuilderValue());
         }

         if (var1.clouds_ != 0) {
            this.setCloudsValue(var1.getCloudsValue());
         }

         if (var1.particles_ != 0) {
            this.setParticlesValue(var1.getParticlesValue());
         }

         if (var1.getRenderDistance() != 0) {
            this.setRenderDistance(var1.getRenderDistance());
         }

         if (var1.getSimulatedDistance() != 0) {
            this.setSimulatedDistance(var1.getSimulatedDistance());
         }

         if (var1.getEntityDistance() != 0) {
            this.setEntityDistance(var1.getEntityDistance());
         }

         if (var1.getBiomeBlend() != 0) {
            this.setBiomeBlend(var1.getBiomeBlend());
         }

         if (var1.getFov() != 0) {
            this.setFov(var1.getFov());
         }

         if (var1.getHudCaching()) {
            this.setHudCaching(var1.getHudCaching());
         }

         if (var1.getParticlePhysics()) {
            this.setParticlePhysics(var1.getParticlePhysics());
         }

         if (var1.lazyChunkLoading_ != 0) {
            this.setLazyChunkLoadingValue(var1.getLazyChunkLoadingValue());
         }

         if (var1.getTurboEntities()) {
            this.setTurboEntities(var1.getTurboEntities());
         }

         if (var1.getTurboEntitiesRate() != 0) {
            this.setTurboEntitiesRate(var1.getTurboEntitiesRate());
         }

         if (var1.getTurboBlockEntities()) {
            this.setTurboBlockEntities(var1.getTurboBlockEntities());
         }

         if (var1.getTurboBlockEntitiesRate() != 0) {
            this.setTurboBlockEntitiesRate(var1.getTurboBlockEntitiesRate());
         }

         if (var1.getTurboBlockEntitiesFar()) {
            this.setTurboBlockEntitiesFar(var1.getTurboBlockEntitiesFar());
         }

         if (!var1.getGpuName().isEmpty()) {
            this.gpuName_ = var1.gpuName_;
            this.bitField1_ |= 65536;
            this.onChanged();
         }

         if (var1.getGcCycles() != 0) {
            this.setGcCycles(var1.getGcCycles());
         }

         if (var1.getLongestGcMicro() != 0) {
            this.setLongestGcMicro(var1.getLongestGcMicro());
         }

         if (var1.getShortestGcMicro() != 0) {
            this.setShortestGcMicro(var1.getShortestGcMicro());
         }

         if (var1.getAvgGcMicro() != 0) {
            this.setAvgGcMicro(var1.getAvgGcMicro());
         }

         if (var1.getMedianGcMicro() != 0) {
            this.setMedianGcMicro(var1.getMedianGcMicro());
         }

         if (var1.getFrameTimeAverage() != 0.0F) {
            this.setFrameTimeAverage(var1.getFrameTimeAverage());
         }

         if (var1.getFrameTimeFastest() != 0.0F) {
            this.setFrameTimeFastest(var1.getFrameTimeFastest());
         }

         if (var1.getFrameTimeSlowest() != 0.0F) {
            this.setFrameTimeSlowest(var1.getFrameTimeSlowest());
         }

         if (!var1.getGraphicsBackend().isEmpty()) {
            this.graphicsBackend_ = var1.graphicsBackend_;
            this.bitField1_ |= 33554432;
            this.onChanged();
         }

         if (var1.getSodiumPresent()) {
            this.setSodiumPresent(var1.getSodiumPresent());
         }

         if (var1.textureFiltering_ != 0) {
            this.setTextureFilteringValue(var1.getTextureFilteringValue());
         }

         switch (var1.getGpuMemoryStateCase()) {
            case NVIDIA_MEMORY:
               this.mergeNvidiaMemory(var1.getNvidiaMemory());
               break;
            case AMD_MEMORY:
               this.mergeAmdMemory(var1.getAmdMemory());
            case GPUMEMORYSTATE_NOT_SET:
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public RecordPerfSnapshotRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         try {
            boolean var3 = false;

            while (!var3) {
               int var4 = var1.readTag();
               switch (var4) {
                  case 0:
                     var3 = true;
                     break;
                  case 8:
                     this.fps_ = var1.readInt32();
                     this.bitField0_ |= 1;
                     break;
                  case 16:
                     this.renderedChunkSections_ = var1.readInt32();
                     this.bitField0_ |= 2;
                     break;
                  case 24:
                     this.loadedChunks_ = var1.readInt32();
                     this.bitField0_ |= 4;
                     break;
                  case 32:
                     this.renderedEntities_ = var1.readInt32();
                     this.bitField0_ |= 8;
                     break;
                  case 40:
                     this.renderedPlayers_ = var1.readInt32();
                     this.bitField0_ |= 16;
                     break;
                  case 48:
                     this.renderedParticles_ = var1.readInt32();
                     this.bitField0_ |= 32;
                     break;
                  case 56:
                     this.freeMemoryKb_ = var1.readInt32();
                     this.bitField0_ |= 128;
                     break;
                  case 64:
                     this.totalMemoryKb_ = var1.readInt32();
                     this.bitField0_ |= 256;
                     break;
                  case 72:
                     this.maxMemoryKb_ = var1.readInt32();
                     this.bitField0_ |= 512;
                     break;
                  case 85:
                     this.gpuUsage_ = var1.readFloat();
                     this.bitField0_ |= 1024;
                     break;
                  case 88:
                     this.lunarHuds_ = var1.readInt32();
                     this.bitField0_ |= 16384;
                     break;
                  case 96:
                     this.renderedGeckolibCosmetics_ = var1.readInt32();
                     this.bitField0_ |= 32768;
                     break;
                  case 104:
                     this.renderedCosmetics_ = var1.readInt32();
                     this.bitField0_ |= 65536;
                     break;
                  case 112:
                     this.renderedEmotes_ = var1.readInt32();
                     this.bitField0_ |= 131072;
                     break;
                  case 125:
                     this.frametime_ = var1.readFloat();
                     this.bitField0_ |= 2048;
                     break;
                  case 128:
                     this.renderedTurboEntities_ = var1.readInt32();
                     this.bitField0_ |= 262144;
                     break;
                  case 136:
                     this.directMemoryKb_ = var1.readInt32();
                     this.bitField0_ |= 4096;
                     break;
                  case 144:
                     this.offHeapMemoryKb_ = var1.readInt32();
                     this.bitField0_ |= 8192;
                     break;
                  case 152:
                     this.usingExternalShaders_ = var1.readBool();
                     this.bitField0_ |= 1048576;
                     break;
                  case 162:
                     var1.readMessage(this.getAverageFpsFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2097152;
                     break;
                  case 168:
                     this.renderedTurboBlockEntities_ = var1.readInt32();
                     this.bitField0_ |= 524288;
                     break;
                  case 176:
                     this.renderedBlockEntities_ = var1.readInt32();
                     this.bitField0_ |= 64;
                     break;
                  case 186:
                     var1.readMessage(this.getNvidiaMemoryFieldBuilder().getBuilder(), var2);
                     this.gpuMemoryStateCase_ = 23;
                     break;
                  case 194:
                     var1.readMessage(this.getAmdMemoryFieldBuilder().getBuilder(), var2);
                     this.gpuMemoryStateCase_ = 24;
                     break;
                  case 200:
                     this.width_ = var1.readInt32();
                     this.bitField0_ |= 16777216;
                     break;
                  case 208:
                     this.height_ = var1.readInt32();
                     this.bitField0_ |= 33554432;
                     break;
                  case 216:
                     this.fullscreen_ = var1.readBool();
                     this.bitField0_ |= 67108864;
                     break;
                  case 224:
                     this.vsync_ = var1.readBool();
                     this.bitField0_ |= 134217728;
                     break;
                  case 232:
                     this.smoothLighting_ = var1.readBool();
                     this.bitField0_ |= 268435456;
                     break;
                  case 240:
                     this.entityShadows_ = var1.readBool();
                     this.bitField0_ |= 536870912;
                     break;
                  case 248:
                     this.maxFramerate_ = var1.readInt32();
                     this.bitField0_ |= 1073741824;
                     break;
                  case 256:
                     this.graphicsStatus_ = var1.readEnum();
                     this.bitField0_ |= Integer.MIN_VALUE;
                     break;
                  case 264:
                     this.chunkBuilder_ = var1.readEnum();
                     this.bitField1_ |= 1;
                     break;
                  case 272:
                     this.clouds_ = var1.readEnum();
                     this.bitField1_ |= 2;
                     break;
                  case 280:
                     this.particles_ = var1.readEnum();
                     this.bitField1_ |= 4;
                     break;
                  case 288:
                     this.renderDistance_ = var1.readInt32();
                     this.bitField1_ |= 8;
                     break;
                  case 296:
                     this.simulatedDistance_ = var1.readInt32();
                     this.bitField1_ |= 16;
                     break;
                  case 304:
                     this.entityDistance_ = var1.readInt32();
                     this.bitField1_ |= 32;
                     break;
                  case 312:
                     this.biomeBlend_ = var1.readInt32();
                     this.bitField1_ |= 64;
                     break;
                  case 320:
                     this.fov_ = var1.readInt32();
                     this.bitField1_ |= 128;
                     break;
                  case 328:
                     this.hudCaching_ = var1.readBool();
                     this.bitField1_ |= 256;
                     break;
                  case 336:
                     this.particlePhysics_ = var1.readBool();
                     this.bitField1_ |= 512;
                     break;
                  case 344:
                     this.lazyChunkLoading_ = var1.readEnum();
                     this.bitField1_ |= 1024;
                     break;
                  case 352:
                     this.turboEntities_ = var1.readBool();
                     this.bitField1_ |= 2048;
                     break;
                  case 360:
                     this.turboEntitiesRate_ = var1.readInt32();
                     this.bitField1_ |= 4096;
                     break;
                  case 368:
                     this.turboBlockEntities_ = var1.readBool();
                     this.bitField1_ |= 8192;
                     break;
                  case 376:
                     this.turboBlockEntitiesRate_ = var1.readInt32();
                     this.bitField1_ |= 16384;
                     break;
                  case 384:
                     this.turboBlockEntitiesFar_ = var1.readBool();
                     this.bitField1_ |= 32768;
                     break;
                  case 394:
                     this.gpuName_ = var1.readStringRequireUtf8();
                     this.bitField1_ |= 65536;
                     break;
                  case 400:
                     this.gcCycles_ = var1.readInt32();
                     this.bitField1_ |= 131072;
                     break;
                  case 408:
                     this.longestGcMicro_ = var1.readInt32();
                     this.bitField1_ |= 262144;
                     break;
                  case 416:
                     this.shortestGcMicro_ = var1.readInt32();
                     this.bitField1_ |= 524288;
                     break;
                  case 424:
                     this.avgGcMicro_ = var1.readInt32();
                     this.bitField1_ |= 1048576;
                     break;
                  case 432:
                     this.medianGcMicro_ = var1.readInt32();
                     this.bitField1_ |= 2097152;
                     break;
                  case 445:
                     this.frameTimeAverage_ = var1.readFloat();
                     this.bitField1_ |= 4194304;
                     break;
                  case 461:
                     this.frameTimeFastest_ = var1.readFloat();
                     this.bitField1_ |= 8388608;
                     break;
                  case 469:
                     this.frameTimeSlowest_ = var1.readFloat();
                     this.bitField1_ |= 16777216;
                     break;
                  case 474:
                     this.graphicsBackend_ = var1.readStringRequireUtf8();
                     this.bitField1_ |= 33554432;
                     break;
                  case 480:
                     this.sodiumPresent_ = var1.readBool();
                     this.bitField1_ |= 67108864;
                     break;
                  case 488:
                     this.textureFiltering_ = var1.readEnum();
                     this.bitField1_ |= 134217728;
                     break;
                  default:
                     if (!super.parseUnknownField(var1, var2, var4)) {
                        var3 = true;
                     }
               }
            }
         } catch (InvalidProtocolBufferException var8) {
            throw var8.unwrapIOException();
         } finally {
            this.onChanged();
         }

         return this;
      }

      @Override
      public RecordPerfSnapshotRequest.GpuMemoryStateCase getGpuMemoryStateCase() {
         return RecordPerfSnapshotRequest.GpuMemoryStateCase.forNumber(this.gpuMemoryStateCase_);
      }

      public RecordPerfSnapshotRequest.Builder clearGpuMemoryState() {
         this.gpuMemoryStateCase_ = 0;
         this.gpuMemoryState_ = null;
         this.onChanged();
         return this;
      }

      @Override
      public int getFps() {
         return this.fps_;
      }

      public RecordPerfSnapshotRequest.Builder setFps(int var1) {
         this.fps_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearFps() {
         this.bitField0_ &= -2;
         this.fps_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getRenderedChunkSections() {
         return this.renderedChunkSections_;
      }

      public RecordPerfSnapshotRequest.Builder setRenderedChunkSections(int var1) {
         this.renderedChunkSections_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearRenderedChunkSections() {
         this.bitField0_ &= -3;
         this.renderedChunkSections_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getLoadedChunks() {
         return this.loadedChunks_;
      }

      public RecordPerfSnapshotRequest.Builder setLoadedChunks(int var1) {
         this.loadedChunks_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearLoadedChunks() {
         this.bitField0_ &= -5;
         this.loadedChunks_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getRenderedEntities() {
         return this.renderedEntities_;
      }

      public RecordPerfSnapshotRequest.Builder setRenderedEntities(int var1) {
         this.renderedEntities_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearRenderedEntities() {
         this.bitField0_ &= -9;
         this.renderedEntities_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getRenderedPlayers() {
         return this.renderedPlayers_;
      }

      public RecordPerfSnapshotRequest.Builder setRenderedPlayers(int var1) {
         this.renderedPlayers_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearRenderedPlayers() {
         this.bitField0_ &= -17;
         this.renderedPlayers_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getRenderedParticles() {
         return this.renderedParticles_;
      }

      public RecordPerfSnapshotRequest.Builder setRenderedParticles(int var1) {
         this.renderedParticles_ = var1;
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearRenderedParticles() {
         this.bitField0_ &= -33;
         this.renderedParticles_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getRenderedBlockEntities() {
         return this.renderedBlockEntities_;
      }

      public RecordPerfSnapshotRequest.Builder setRenderedBlockEntities(int var1) {
         this.renderedBlockEntities_ = var1;
         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearRenderedBlockEntities() {
         this.bitField0_ &= -65;
         this.renderedBlockEntities_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getFreeMemoryKb() {
         return this.freeMemoryKb_;
      }

      public RecordPerfSnapshotRequest.Builder setFreeMemoryKb(int var1) {
         this.freeMemoryKb_ = var1;
         this.bitField0_ |= 128;
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearFreeMemoryKb() {
         this.bitField0_ &= -129;
         this.freeMemoryKb_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getTotalMemoryKb() {
         return this.totalMemoryKb_;
      }

      public RecordPerfSnapshotRequest.Builder setTotalMemoryKb(int var1) {
         this.totalMemoryKb_ = var1;
         this.bitField0_ |= 256;
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearTotalMemoryKb() {
         this.bitField0_ &= -257;
         this.totalMemoryKb_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getMaxMemoryKb() {
         return this.maxMemoryKb_;
      }

      public RecordPerfSnapshotRequest.Builder setMaxMemoryKb(int var1) {
         this.maxMemoryKb_ = var1;
         this.bitField0_ |= 512;
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearMaxMemoryKb() {
         this.bitField0_ &= -513;
         this.maxMemoryKb_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public float getGpuUsage() {
         return this.gpuUsage_;
      }

      public RecordPerfSnapshotRequest.Builder setGpuUsage(float var1) {
         this.gpuUsage_ = var1;
         this.bitField0_ |= 1024;
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearGpuUsage() {
         this.bitField0_ &= -1025;
         this.gpuUsage_ = 0.0F;
         this.onChanged();
         return this;
      }

      @Override
      public float getFrametime() {
         return this.frametime_;
      }

      public RecordPerfSnapshotRequest.Builder setFrametime(float var1) {
         this.frametime_ = var1;
         this.bitField0_ |= 2048;
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearFrametime() {
         this.bitField0_ &= -2049;
         this.frametime_ = 0.0F;
         this.onChanged();
         return this;
      }

      @Override
      public int getDirectMemoryKb() {
         return this.directMemoryKb_;
      }

      public RecordPerfSnapshotRequest.Builder setDirectMemoryKb(int var1) {
         this.directMemoryKb_ = var1;
         this.bitField0_ |= 4096;
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearDirectMemoryKb() {
         this.bitField0_ &= -4097;
         this.directMemoryKb_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getOffHeapMemoryKb() {
         return this.offHeapMemoryKb_;
      }

      public RecordPerfSnapshotRequest.Builder setOffHeapMemoryKb(int var1) {
         this.offHeapMemoryKb_ = var1;
         this.bitField0_ |= 8192;
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearOffHeapMemoryKb() {
         this.bitField0_ &= -8193;
         this.offHeapMemoryKb_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getLunarHuds() {
         return this.lunarHuds_;
      }

      public RecordPerfSnapshotRequest.Builder setLunarHuds(int var1) {
         this.lunarHuds_ = var1;
         this.bitField0_ |= 16384;
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearLunarHuds() {
         this.bitField0_ &= -16385;
         this.lunarHuds_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getRenderedGeckolibCosmetics() {
         return this.renderedGeckolibCosmetics_;
      }

      public RecordPerfSnapshotRequest.Builder setRenderedGeckolibCosmetics(int var1) {
         this.renderedGeckolibCosmetics_ = var1;
         this.bitField0_ |= 32768;
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearRenderedGeckolibCosmetics() {
         this.bitField0_ &= -32769;
         this.renderedGeckolibCosmetics_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getRenderedCosmetics() {
         return this.renderedCosmetics_;
      }

      public RecordPerfSnapshotRequest.Builder setRenderedCosmetics(int var1) {
         this.renderedCosmetics_ = var1;
         this.bitField0_ |= 65536;
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearRenderedCosmetics() {
         this.bitField0_ &= -65537;
         this.renderedCosmetics_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getRenderedEmotes() {
         return this.renderedEmotes_;
      }

      public RecordPerfSnapshotRequest.Builder setRenderedEmotes(int var1) {
         this.renderedEmotes_ = var1;
         this.bitField0_ |= 131072;
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearRenderedEmotes() {
         this.bitField0_ &= -131073;
         this.renderedEmotes_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getRenderedTurboEntities() {
         return this.renderedTurboEntities_;
      }

      public RecordPerfSnapshotRequest.Builder setRenderedTurboEntities(int var1) {
         this.renderedTurboEntities_ = var1;
         this.bitField0_ |= 262144;
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearRenderedTurboEntities() {
         this.bitField0_ &= -262145;
         this.renderedTurboEntities_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getRenderedTurboBlockEntities() {
         return this.renderedTurboBlockEntities_;
      }

      public RecordPerfSnapshotRequest.Builder setRenderedTurboBlockEntities(int var1) {
         this.renderedTurboBlockEntities_ = var1;
         this.bitField0_ |= 524288;
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearRenderedTurboBlockEntities() {
         this.bitField0_ &= -524289;
         this.renderedTurboBlockEntities_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getUsingExternalShaders() {
         return this.usingExternalShaders_;
      }

      public RecordPerfSnapshotRequest.Builder setUsingExternalShaders(boolean var1) {
         this.usingExternalShaders_ = var1;
         this.bitField0_ |= 1048576;
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearUsingExternalShaders() {
         this.bitField0_ &= -1048577;
         this.usingExternalShaders_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasAverageFps() {
         return (this.bitField0_ & 2097152) != 0;
      }

      @Override
      public RecordPerfSnapshotRequest.AverageGroup getAverageFps() {
         if (this.averageFpsBuilder_ == null) {
            return this.averageFps_ == null ? RecordPerfSnapshotRequest.AverageGroup.getDefaultInstance() : this.averageFps_;
         } else {
            return this.averageFpsBuilder_.getMessage();
         }
      }

      public RecordPerfSnapshotRequest.Builder setAverageFps(RecordPerfSnapshotRequest.AverageGroup var1) {
         if (this.averageFpsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.averageFps_ = var1;
         } else {
            this.averageFpsBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2097152;
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder setAverageFps(RecordPerfSnapshotRequest.AverageGroup.Builder var1) {
         if (this.averageFpsBuilder_ == null) {
            this.averageFps_ = var1.build();
         } else {
            this.averageFpsBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2097152;
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder mergeAverageFps(RecordPerfSnapshotRequest.AverageGroup var1) {
         if (this.averageFpsBuilder_ == null) {
            if ((this.bitField0_ & 2097152) != 0 && this.averageFps_ != null && this.averageFps_ != RecordPerfSnapshotRequest.AverageGroup.getDefaultInstance()
               )
             {
               this.getAverageFpsBuilder().mergeFrom(var1);
            } else {
               this.averageFps_ = var1;
            }
         } else {
            this.averageFpsBuilder_.mergeFrom(var1);
         }

         if (this.averageFps_ != null) {
            this.bitField0_ |= 2097152;
            this.onChanged();
         }

         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearAverageFps() {
         this.bitField0_ &= -2097153;
         this.averageFps_ = null;
         if (this.averageFpsBuilder_ != null) {
            this.averageFpsBuilder_.dispose();
            this.averageFpsBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.AverageGroup.Builder getAverageFpsBuilder() {
         this.bitField0_ |= 2097152;
         this.onChanged();
         return this.getAverageFpsFieldBuilder().getBuilder();
      }

      @Override
      public RecordPerfSnapshotRequest.AverageGroupOrBuilder getAverageFpsOrBuilder() {
         if (this.averageFpsBuilder_ != null) {
            return this.averageFpsBuilder_.getMessageOrBuilder();
         } else {
            return this.averageFps_ == null ? RecordPerfSnapshotRequest.AverageGroup.getDefaultInstance() : this.averageFps_;
         }
      }

      private SingleFieldBuilderV3<RecordPerfSnapshotRequest.AverageGroup, RecordPerfSnapshotRequest.AverageGroup.Builder, RecordPerfSnapshotRequest.AverageGroupOrBuilder> getAverageFpsFieldBuilder() {
         if (this.averageFpsBuilder_ == null) {
            this.averageFpsBuilder_ = new SingleFieldBuilderV3<>(this.getAverageFps(), this.getParentForChildren(), this.isClean());
            this.averageFps_ = null;
         }

         return this.averageFpsBuilder_;
      }

      @Override
      public boolean hasNvidiaMemory() {
         return this.gpuMemoryStateCase_ == 23;
      }

      @Override
      public RecordPerfSnapshotRequest.NvidiaGpuMemoryState getNvidiaMemory() {
         if (this.nvidiaMemoryBuilder_ == null) {
            return this.gpuMemoryStateCase_ == 23
               ? (RecordPerfSnapshotRequest.NvidiaGpuMemoryState)this.gpuMemoryState_
               : RecordPerfSnapshotRequest.NvidiaGpuMemoryState.getDefaultInstance();
         } else {
            return this.gpuMemoryStateCase_ == 23
               ? this.nvidiaMemoryBuilder_.getMessage()
               : RecordPerfSnapshotRequest.NvidiaGpuMemoryState.getDefaultInstance();
         }
      }

      public RecordPerfSnapshotRequest.Builder setNvidiaMemory(RecordPerfSnapshotRequest.NvidiaGpuMemoryState var1) {
         if (this.nvidiaMemoryBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.gpuMemoryState_ = var1;
            this.onChanged();
         } else {
            this.nvidiaMemoryBuilder_.setMessage(var1);
         }

         this.gpuMemoryStateCase_ = 23;
         return this;
      }

      public RecordPerfSnapshotRequest.Builder setNvidiaMemory(RecordPerfSnapshotRequest.NvidiaGpuMemoryState.Builder var1) {
         if (this.nvidiaMemoryBuilder_ == null) {
            this.gpuMemoryState_ = var1.build();
            this.onChanged();
         } else {
            this.nvidiaMemoryBuilder_.setMessage(var1.build());
         }

         this.gpuMemoryStateCase_ = 23;
         return this;
      }

      public RecordPerfSnapshotRequest.Builder mergeNvidiaMemory(RecordPerfSnapshotRequest.NvidiaGpuMemoryState var1) {
         if (this.nvidiaMemoryBuilder_ == null) {
            if (this.gpuMemoryStateCase_ == 23 && this.gpuMemoryState_ != RecordPerfSnapshotRequest.NvidiaGpuMemoryState.getDefaultInstance()) {
               this.gpuMemoryState_ = RecordPerfSnapshotRequest.NvidiaGpuMemoryState.newBuilder(
                     (RecordPerfSnapshotRequest.NvidiaGpuMemoryState)this.gpuMemoryState_
                  )
                  .mergeFrom(var1)
                  .buildPartial();
            } else {
               this.gpuMemoryState_ = var1;
            }

            this.onChanged();
         } else if (this.gpuMemoryStateCase_ == 23) {
            this.nvidiaMemoryBuilder_.mergeFrom(var1);
         } else {
            this.nvidiaMemoryBuilder_.setMessage(var1);
         }

         this.gpuMemoryStateCase_ = 23;
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearNvidiaMemory() {
         if (this.nvidiaMemoryBuilder_ == null) {
            if (this.gpuMemoryStateCase_ == 23) {
               this.gpuMemoryStateCase_ = 0;
               this.gpuMemoryState_ = null;
               this.onChanged();
            }
         } else {
            if (this.gpuMemoryStateCase_ == 23) {
               this.gpuMemoryStateCase_ = 0;
               this.gpuMemoryState_ = null;
            }

            this.nvidiaMemoryBuilder_.clear();
         }

         return this;
      }

      public RecordPerfSnapshotRequest.NvidiaGpuMemoryState.Builder getNvidiaMemoryBuilder() {
         return this.getNvidiaMemoryFieldBuilder().getBuilder();
      }

      @Override
      public RecordPerfSnapshotRequest.NvidiaGpuMemoryStateOrBuilder getNvidiaMemoryOrBuilder() {
         if (this.gpuMemoryStateCase_ == 23 && this.nvidiaMemoryBuilder_ != null) {
            return this.nvidiaMemoryBuilder_.getMessageOrBuilder();
         } else {
            return this.gpuMemoryStateCase_ == 23
               ? (RecordPerfSnapshotRequest.NvidiaGpuMemoryState)this.gpuMemoryState_
               : RecordPerfSnapshotRequest.NvidiaGpuMemoryState.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<RecordPerfSnapshotRequest.NvidiaGpuMemoryState, RecordPerfSnapshotRequest.NvidiaGpuMemoryState.Builder, RecordPerfSnapshotRequest.NvidiaGpuMemoryStateOrBuilder> getNvidiaMemoryFieldBuilder() {
         if (this.nvidiaMemoryBuilder_ == null) {
            if (this.gpuMemoryStateCase_ != 23) {
               this.gpuMemoryState_ = RecordPerfSnapshotRequest.NvidiaGpuMemoryState.getDefaultInstance();
            }

            this.nvidiaMemoryBuilder_ = new SingleFieldBuilderV3<>(
               (RecordPerfSnapshotRequest.NvidiaGpuMemoryState)this.gpuMemoryState_, this.getParentForChildren(), this.isClean()
            );
            this.gpuMemoryState_ = null;
         }

         this.gpuMemoryStateCase_ = 23;
         this.onChanged();
         return this.nvidiaMemoryBuilder_;
      }

      @Override
      public boolean hasAmdMemory() {
         return this.gpuMemoryStateCase_ == 24;
      }

      @Override
      public RecordPerfSnapshotRequest.AmdGpuMemoryState getAmdMemory() {
         if (this.amdMemoryBuilder_ == null) {
            return this.gpuMemoryStateCase_ == 24
               ? (RecordPerfSnapshotRequest.AmdGpuMemoryState)this.gpuMemoryState_
               : RecordPerfSnapshotRequest.AmdGpuMemoryState.getDefaultInstance();
         } else {
            return this.gpuMemoryStateCase_ == 24 ? this.amdMemoryBuilder_.getMessage() : RecordPerfSnapshotRequest.AmdGpuMemoryState.getDefaultInstance();
         }
      }

      public RecordPerfSnapshotRequest.Builder setAmdMemory(RecordPerfSnapshotRequest.AmdGpuMemoryState var1) {
         if (this.amdMemoryBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.gpuMemoryState_ = var1;
            this.onChanged();
         } else {
            this.amdMemoryBuilder_.setMessage(var1);
         }

         this.gpuMemoryStateCase_ = 24;
         return this;
      }

      public RecordPerfSnapshotRequest.Builder setAmdMemory(RecordPerfSnapshotRequest.AmdGpuMemoryState.Builder var1) {
         if (this.amdMemoryBuilder_ == null) {
            this.gpuMemoryState_ = var1.build();
            this.onChanged();
         } else {
            this.amdMemoryBuilder_.setMessage(var1.build());
         }

         this.gpuMemoryStateCase_ = 24;
         return this;
      }

      public RecordPerfSnapshotRequest.Builder mergeAmdMemory(RecordPerfSnapshotRequest.AmdGpuMemoryState var1) {
         if (this.amdMemoryBuilder_ == null) {
            if (this.gpuMemoryStateCase_ == 24 && this.gpuMemoryState_ != RecordPerfSnapshotRequest.AmdGpuMemoryState.getDefaultInstance()) {
               this.gpuMemoryState_ = RecordPerfSnapshotRequest.AmdGpuMemoryState.newBuilder((RecordPerfSnapshotRequest.AmdGpuMemoryState)this.gpuMemoryState_)
                  .mergeFrom(var1)
                  .buildPartial();
            } else {
               this.gpuMemoryState_ = var1;
            }

            this.onChanged();
         } else if (this.gpuMemoryStateCase_ == 24) {
            this.amdMemoryBuilder_.mergeFrom(var1);
         } else {
            this.amdMemoryBuilder_.setMessage(var1);
         }

         this.gpuMemoryStateCase_ = 24;
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearAmdMemory() {
         if (this.amdMemoryBuilder_ == null) {
            if (this.gpuMemoryStateCase_ == 24) {
               this.gpuMemoryStateCase_ = 0;
               this.gpuMemoryState_ = null;
               this.onChanged();
            }
         } else {
            if (this.gpuMemoryStateCase_ == 24) {
               this.gpuMemoryStateCase_ = 0;
               this.gpuMemoryState_ = null;
            }

            this.amdMemoryBuilder_.clear();
         }

         return this;
      }

      public RecordPerfSnapshotRequest.AmdGpuMemoryState.Builder getAmdMemoryBuilder() {
         return this.getAmdMemoryFieldBuilder().getBuilder();
      }

      @Override
      public RecordPerfSnapshotRequest.AmdGpuMemoryStateOrBuilder getAmdMemoryOrBuilder() {
         if (this.gpuMemoryStateCase_ == 24 && this.amdMemoryBuilder_ != null) {
            return this.amdMemoryBuilder_.getMessageOrBuilder();
         } else {
            return this.gpuMemoryStateCase_ == 24
               ? (RecordPerfSnapshotRequest.AmdGpuMemoryState)this.gpuMemoryState_
               : RecordPerfSnapshotRequest.AmdGpuMemoryState.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<RecordPerfSnapshotRequest.AmdGpuMemoryState, RecordPerfSnapshotRequest.AmdGpuMemoryState.Builder, RecordPerfSnapshotRequest.AmdGpuMemoryStateOrBuilder> getAmdMemoryFieldBuilder() {
         if (this.amdMemoryBuilder_ == null) {
            if (this.gpuMemoryStateCase_ != 24) {
               this.gpuMemoryState_ = RecordPerfSnapshotRequest.AmdGpuMemoryState.getDefaultInstance();
            }

            this.amdMemoryBuilder_ = new SingleFieldBuilderV3<>(
               (RecordPerfSnapshotRequest.AmdGpuMemoryState)this.gpuMemoryState_, this.getParentForChildren(), this.isClean()
            );
            this.gpuMemoryState_ = null;
         }

         this.gpuMemoryStateCase_ = 24;
         this.onChanged();
         return this.amdMemoryBuilder_;
      }

      @Override
      public int getWidth() {
         return this.width_;
      }

      public RecordPerfSnapshotRequest.Builder setWidth(int var1) {
         this.width_ = var1;
         this.bitField0_ |= 16777216;
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearWidth() {
         this.bitField0_ &= -16777217;
         this.width_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getHeight() {
         return this.height_;
      }

      public RecordPerfSnapshotRequest.Builder setHeight(int var1) {
         this.height_ = var1;
         this.bitField0_ |= 33554432;
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearHeight() {
         this.bitField0_ &= -33554433;
         this.height_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getFullscreen() {
         return this.fullscreen_;
      }

      public RecordPerfSnapshotRequest.Builder setFullscreen(boolean var1) {
         this.fullscreen_ = var1;
         this.bitField0_ |= 67108864;
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearFullscreen() {
         this.bitField0_ &= -67108865;
         this.fullscreen_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getVsync() {
         return this.vsync_;
      }

      public RecordPerfSnapshotRequest.Builder setVsync(boolean var1) {
         this.vsync_ = var1;
         this.bitField0_ |= 134217728;
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearVsync() {
         this.bitField0_ &= -134217729;
         this.vsync_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getSmoothLighting() {
         return this.smoothLighting_;
      }

      public RecordPerfSnapshotRequest.Builder setSmoothLighting(boolean var1) {
         this.smoothLighting_ = var1;
         this.bitField0_ |= 268435456;
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearSmoothLighting() {
         this.bitField0_ &= -268435457;
         this.smoothLighting_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getEntityShadows() {
         return this.entityShadows_;
      }

      public RecordPerfSnapshotRequest.Builder setEntityShadows(boolean var1) {
         this.entityShadows_ = var1;
         this.bitField0_ |= 536870912;
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearEntityShadows() {
         this.bitField0_ &= -536870913;
         this.entityShadows_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public int getMaxFramerate() {
         return this.maxFramerate_;
      }

      public RecordPerfSnapshotRequest.Builder setMaxFramerate(int var1) {
         this.maxFramerate_ = var1;
         this.bitField0_ |= 1073741824;
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearMaxFramerate() {
         this.bitField0_ &= -1073741825;
         this.maxFramerate_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getGraphicsStatusValue() {
         return this.graphicsStatus_;
      }

      public RecordPerfSnapshotRequest.Builder setGraphicsStatusValue(int var1) {
         this.graphicsStatus_ = var1;
         this.bitField0_ |= Integer.MIN_VALUE;
         this.onChanged();
         return this;
      }

      @Override
      public RecordPerfSnapshotRequest.GraphicsStatus getGraphicsStatus() {
         RecordPerfSnapshotRequest.GraphicsStatus var1 = RecordPerfSnapshotRequest.GraphicsStatus.forNumber(this.graphicsStatus_);
         return var1 == null ? RecordPerfSnapshotRequest.GraphicsStatus.UNRECOGNIZED : var1;
      }

      public RecordPerfSnapshotRequest.Builder setGraphicsStatus(RecordPerfSnapshotRequest.GraphicsStatus var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= Integer.MIN_VALUE;
         this.graphicsStatus_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearGraphicsStatus() {
         this.bitField0_ &= Integer.MAX_VALUE;
         this.graphicsStatus_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getChunkBuilderValue() {
         return this.chunkBuilder_;
      }

      public RecordPerfSnapshotRequest.Builder setChunkBuilderValue(int var1) {
         this.chunkBuilder_ = var1;
         this.bitField1_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public RecordPerfSnapshotRequest.ChunkBuilder getChunkBuilder() {
         RecordPerfSnapshotRequest.ChunkBuilder var1 = RecordPerfSnapshotRequest.ChunkBuilder.forNumber(this.chunkBuilder_);
         return var1 == null ? RecordPerfSnapshotRequest.ChunkBuilder.UNRECOGNIZED : var1;
      }

      public RecordPerfSnapshotRequest.Builder setChunkBuilder(RecordPerfSnapshotRequest.ChunkBuilder var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField1_ |= 1;
         this.chunkBuilder_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearChunkBuilder() {
         this.bitField1_ &= -2;
         this.chunkBuilder_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getCloudsValue() {
         return this.clouds_;
      }

      public RecordPerfSnapshotRequest.Builder setCloudsValue(int var1) {
         this.clouds_ = var1;
         this.bitField1_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public RecordPerfSnapshotRequest.CloudsMode getClouds() {
         RecordPerfSnapshotRequest.CloudsMode var1 = RecordPerfSnapshotRequest.CloudsMode.forNumber(this.clouds_);
         return var1 == null ? RecordPerfSnapshotRequest.CloudsMode.UNRECOGNIZED : var1;
      }

      public RecordPerfSnapshotRequest.Builder setClouds(RecordPerfSnapshotRequest.CloudsMode var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField1_ |= 2;
         this.clouds_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearClouds() {
         this.bitField1_ &= -3;
         this.clouds_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getParticlesValue() {
         return this.particles_;
      }

      public RecordPerfSnapshotRequest.Builder setParticlesValue(int var1) {
         this.particles_ = var1;
         this.bitField1_ |= 4;
         this.onChanged();
         return this;
      }

      @Override
      public RecordPerfSnapshotRequest.ParticlesMode getParticles() {
         RecordPerfSnapshotRequest.ParticlesMode var1 = RecordPerfSnapshotRequest.ParticlesMode.forNumber(this.particles_);
         return var1 == null ? RecordPerfSnapshotRequest.ParticlesMode.UNRECOGNIZED : var1;
      }

      public RecordPerfSnapshotRequest.Builder setParticles(RecordPerfSnapshotRequest.ParticlesMode var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField1_ |= 4;
         this.particles_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearParticles() {
         this.bitField1_ &= -5;
         this.particles_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getRenderDistance() {
         return this.renderDistance_;
      }

      public RecordPerfSnapshotRequest.Builder setRenderDistance(int var1) {
         this.renderDistance_ = var1;
         this.bitField1_ |= 8;
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearRenderDistance() {
         this.bitField1_ &= -9;
         this.renderDistance_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getSimulatedDistance() {
         return this.simulatedDistance_;
      }

      public RecordPerfSnapshotRequest.Builder setSimulatedDistance(int var1) {
         this.simulatedDistance_ = var1;
         this.bitField1_ |= 16;
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearSimulatedDistance() {
         this.bitField1_ &= -17;
         this.simulatedDistance_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getEntityDistance() {
         return this.entityDistance_;
      }

      public RecordPerfSnapshotRequest.Builder setEntityDistance(int var1) {
         this.entityDistance_ = var1;
         this.bitField1_ |= 32;
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearEntityDistance() {
         this.bitField1_ &= -33;
         this.entityDistance_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getBiomeBlend() {
         return this.biomeBlend_;
      }

      public RecordPerfSnapshotRequest.Builder setBiomeBlend(int var1) {
         this.biomeBlend_ = var1;
         this.bitField1_ |= 64;
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearBiomeBlend() {
         this.bitField1_ &= -65;
         this.biomeBlend_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getFov() {
         return this.fov_;
      }

      public RecordPerfSnapshotRequest.Builder setFov(int var1) {
         this.fov_ = var1;
         this.bitField1_ |= 128;
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearFov() {
         this.bitField1_ &= -129;
         this.fov_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getHudCaching() {
         return this.hudCaching_;
      }

      public RecordPerfSnapshotRequest.Builder setHudCaching(boolean var1) {
         this.hudCaching_ = var1;
         this.bitField1_ |= 256;
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearHudCaching() {
         this.bitField1_ &= -257;
         this.hudCaching_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getParticlePhysics() {
         return this.particlePhysics_;
      }

      public RecordPerfSnapshotRequest.Builder setParticlePhysics(boolean var1) {
         this.particlePhysics_ = var1;
         this.bitField1_ |= 512;
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearParticlePhysics() {
         this.bitField1_ &= -513;
         this.particlePhysics_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public int getLazyChunkLoadingValue() {
         return this.lazyChunkLoading_;
      }

      public RecordPerfSnapshotRequest.Builder setLazyChunkLoadingValue(int var1) {
         this.lazyChunkLoading_ = var1;
         this.bitField1_ |= 1024;
         this.onChanged();
         return this;
      }

      @Override
      public RecordPerfSnapshotRequest.LazyChunkLoading getLazyChunkLoading() {
         RecordPerfSnapshotRequest.LazyChunkLoading var1 = RecordPerfSnapshotRequest.LazyChunkLoading.forNumber(this.lazyChunkLoading_);
         return var1 == null ? RecordPerfSnapshotRequest.LazyChunkLoading.UNRECOGNIZED : var1;
      }

      public RecordPerfSnapshotRequest.Builder setLazyChunkLoading(RecordPerfSnapshotRequest.LazyChunkLoading var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField1_ |= 1024;
         this.lazyChunkLoading_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearLazyChunkLoading() {
         this.bitField1_ &= -1025;
         this.lazyChunkLoading_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getTurboEntities() {
         return this.turboEntities_;
      }

      public RecordPerfSnapshotRequest.Builder setTurboEntities(boolean var1) {
         this.turboEntities_ = var1;
         this.bitField1_ |= 2048;
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearTurboEntities() {
         this.bitField1_ &= -2049;
         this.turboEntities_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public int getTurboEntitiesRate() {
         return this.turboEntitiesRate_;
      }

      public RecordPerfSnapshotRequest.Builder setTurboEntitiesRate(int var1) {
         this.turboEntitiesRate_ = var1;
         this.bitField1_ |= 4096;
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearTurboEntitiesRate() {
         this.bitField1_ &= -4097;
         this.turboEntitiesRate_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getTurboBlockEntities() {
         return this.turboBlockEntities_;
      }

      public RecordPerfSnapshotRequest.Builder setTurboBlockEntities(boolean var1) {
         this.turboBlockEntities_ = var1;
         this.bitField1_ |= 8192;
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearTurboBlockEntities() {
         this.bitField1_ &= -8193;
         this.turboBlockEntities_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public int getTurboBlockEntitiesRate() {
         return this.turboBlockEntitiesRate_;
      }

      public RecordPerfSnapshotRequest.Builder setTurboBlockEntitiesRate(int var1) {
         this.turboBlockEntitiesRate_ = var1;
         this.bitField1_ |= 16384;
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearTurboBlockEntitiesRate() {
         this.bitField1_ &= -16385;
         this.turboBlockEntitiesRate_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getTurboBlockEntitiesFar() {
         return this.turboBlockEntitiesFar_;
      }

      public RecordPerfSnapshotRequest.Builder setTurboBlockEntitiesFar(boolean var1) {
         this.turboBlockEntitiesFar_ = var1;
         this.bitField1_ |= 32768;
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearTurboBlockEntitiesFar() {
         this.bitField1_ &= -32769;
         this.turboBlockEntitiesFar_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public String getGpuName() {
         Object var1 = this.gpuName_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.gpuName_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getGpuNameBytes() {
         Object var1 = this.gpuName_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.gpuName_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public RecordPerfSnapshotRequest.Builder setGpuName(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.gpuName_ = var1;
         this.bitField1_ |= 65536;
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearGpuName() {
         this.gpuName_ = RecordPerfSnapshotRequest.getDefaultInstance().getGpuName();
         this.bitField1_ &= -65537;
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder setGpuNameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         RecordPerfSnapshotRequest.checkByteStringIsUtf8(var1);
         this.gpuName_ = var1;
         this.bitField1_ |= 65536;
         this.onChanged();
         return this;
      }

      @Override
      public int getGcCycles() {
         return this.gcCycles_;
      }

      public RecordPerfSnapshotRequest.Builder setGcCycles(int var1) {
         this.gcCycles_ = var1;
         this.bitField1_ |= 131072;
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearGcCycles() {
         this.bitField1_ &= -131073;
         this.gcCycles_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getLongestGcMicro() {
         return this.longestGcMicro_;
      }

      public RecordPerfSnapshotRequest.Builder setLongestGcMicro(int var1) {
         this.longestGcMicro_ = var1;
         this.bitField1_ |= 262144;
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearLongestGcMicro() {
         this.bitField1_ &= -262145;
         this.longestGcMicro_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getShortestGcMicro() {
         return this.shortestGcMicro_;
      }

      public RecordPerfSnapshotRequest.Builder setShortestGcMicro(int var1) {
         this.shortestGcMicro_ = var1;
         this.bitField1_ |= 524288;
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearShortestGcMicro() {
         this.bitField1_ &= -524289;
         this.shortestGcMicro_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getAvgGcMicro() {
         return this.avgGcMicro_;
      }

      public RecordPerfSnapshotRequest.Builder setAvgGcMicro(int var1) {
         this.avgGcMicro_ = var1;
         this.bitField1_ |= 1048576;
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearAvgGcMicro() {
         this.bitField1_ &= -1048577;
         this.avgGcMicro_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getMedianGcMicro() {
         return this.medianGcMicro_;
      }

      public RecordPerfSnapshotRequest.Builder setMedianGcMicro(int var1) {
         this.medianGcMicro_ = var1;
         this.bitField1_ |= 2097152;
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearMedianGcMicro() {
         this.bitField1_ &= -2097153;
         this.medianGcMicro_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public float getFrameTimeAverage() {
         return this.frameTimeAverage_;
      }

      public RecordPerfSnapshotRequest.Builder setFrameTimeAverage(float var1) {
         this.frameTimeAverage_ = var1;
         this.bitField1_ |= 4194304;
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearFrameTimeAverage() {
         this.bitField1_ &= -4194305;
         this.frameTimeAverage_ = 0.0F;
         this.onChanged();
         return this;
      }

      @Override
      public float getFrameTimeFastest() {
         return this.frameTimeFastest_;
      }

      public RecordPerfSnapshotRequest.Builder setFrameTimeFastest(float var1) {
         this.frameTimeFastest_ = var1;
         this.bitField1_ |= 8388608;
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearFrameTimeFastest() {
         this.bitField1_ &= -8388609;
         this.frameTimeFastest_ = 0.0F;
         this.onChanged();
         return this;
      }

      @Override
      public float getFrameTimeSlowest() {
         return this.frameTimeSlowest_;
      }

      public RecordPerfSnapshotRequest.Builder setFrameTimeSlowest(float var1) {
         this.frameTimeSlowest_ = var1;
         this.bitField1_ |= 16777216;
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearFrameTimeSlowest() {
         this.bitField1_ &= -16777217;
         this.frameTimeSlowest_ = 0.0F;
         this.onChanged();
         return this;
      }

      @Override
      public String getGraphicsBackend() {
         Object var1 = this.graphicsBackend_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.graphicsBackend_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getGraphicsBackendBytes() {
         Object var1 = this.graphicsBackend_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.graphicsBackend_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public RecordPerfSnapshotRequest.Builder setGraphicsBackend(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.graphicsBackend_ = var1;
         this.bitField1_ |= 33554432;
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearGraphicsBackend() {
         this.graphicsBackend_ = RecordPerfSnapshotRequest.getDefaultInstance().getGraphicsBackend();
         this.bitField1_ &= -33554433;
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder setGraphicsBackendBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         RecordPerfSnapshotRequest.checkByteStringIsUtf8(var1);
         this.graphicsBackend_ = var1;
         this.bitField1_ |= 33554432;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getSodiumPresent() {
         return this.sodiumPresent_;
      }

      public RecordPerfSnapshotRequest.Builder setSodiumPresent(boolean var1) {
         this.sodiumPresent_ = var1;
         this.bitField1_ |= 67108864;
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearSodiumPresent() {
         this.bitField1_ &= -67108865;
         this.sodiumPresent_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public int getTextureFilteringValue() {
         return this.textureFiltering_;
      }

      public RecordPerfSnapshotRequest.Builder setTextureFilteringValue(int var1) {
         this.textureFiltering_ = var1;
         this.bitField1_ |= 134217728;
         this.onChanged();
         return this;
      }

      @Override
      public RecordPerfSnapshotRequest.TextureFiltering getTextureFiltering() {
         RecordPerfSnapshotRequest.TextureFiltering var1 = RecordPerfSnapshotRequest.TextureFiltering.forNumber(this.textureFiltering_);
         return var1 == null ? RecordPerfSnapshotRequest.TextureFiltering.UNRECOGNIZED : var1;
      }

      public RecordPerfSnapshotRequest.Builder setTextureFiltering(RecordPerfSnapshotRequest.TextureFiltering var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField1_ |= 134217728;
         this.textureFiltering_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public RecordPerfSnapshotRequest.Builder clearTextureFiltering() {
         this.bitField1_ &= -134217729;
         this.textureFiltering_ = 0;
         this.onChanged();
         return this;
      }

      public final RecordPerfSnapshotRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (RecordPerfSnapshotRequest.Builder)super.setUnknownFields(var1);
      }

      public final RecordPerfSnapshotRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (RecordPerfSnapshotRequest.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum ChunkBuilder implements ProtocolMessageEnum {
      CHUNK_BUILDER_UNSPECIFIED(0),
      CHUNK_BUILDER_THREADED(1),
      CHUNK_BUILDER_SEMI_BLOCKING(2),
      CHUNK_BUILDER_FULLY_BLOCKING(3),
      UNRECOGNIZED(-1);

      public static final int CHUNK_BUILDER_UNSPECIFIED_VALUE = 0;
      public static final int CHUNK_BUILDER_THREADED_VALUE = 1;
      public static final int CHUNK_BUILDER_SEMI_BLOCKING_VALUE = 2;
      public static final int CHUNK_BUILDER_FULLY_BLOCKING_VALUE = 3;
      private static final Internal.EnumLiteMap<RecordPerfSnapshotRequest.ChunkBuilder> internalValueMap = new Internal.EnumLiteMap<RecordPerfSnapshotRequest.ChunkBuilder>() {
         public RecordPerfSnapshotRequest.ChunkBuilder findValueByNumber(int var1) {
            return RecordPerfSnapshotRequest.ChunkBuilder.forNumber(var1);
         }
      };
      private static final RecordPerfSnapshotRequest.ChunkBuilder[] VALUES = values();
      private final int value;

      @Override
      public final int getNumber() {
         if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
         } else {
            return this.value;
         }
      }

      @Deprecated
      public static RecordPerfSnapshotRequest.ChunkBuilder valueOf(int var0) {
         return forNumber(var0);
      }

      public static RecordPerfSnapshotRequest.ChunkBuilder forNumber(int var0) {
         switch (var0) {
            case 0:
               return CHUNK_BUILDER_UNSPECIFIED;
            case 1:
               return CHUNK_BUILDER_THREADED;
            case 2:
               return CHUNK_BUILDER_SEMI_BLOCKING;
            case 3:
               return CHUNK_BUILDER_FULLY_BLOCKING;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<RecordPerfSnapshotRequest.ChunkBuilder> internalGetValueMap() {
         return internalValueMap;
      }

      @Override
      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         if (this == UNRECOGNIZED) {
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
         } else {
            return getDescriptor().getValues().get(this.ordinal());
         }
      }

      @Override
      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return RecordPerfSnapshotRequest.getDescriptor().getEnumTypes().get(1);
      }

      public static RecordPerfSnapshotRequest.ChunkBuilder valueOf(Descriptors.EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      ChunkBuilder(int var3) {
         this.value = var3;
      }
   }

   public enum CloudsMode implements ProtocolMessageEnum {
      CLOUDS_MODE_UNSPECIFIED(0),
      CLOUDS_MODE_FANCY(1),
      CLOUDS_MODE_FAST(2),
      CLOUDS_MODE_OFF(3),
      UNRECOGNIZED(-1);

      public static final int CLOUDS_MODE_UNSPECIFIED_VALUE = 0;
      public static final int CLOUDS_MODE_FANCY_VALUE = 1;
      public static final int CLOUDS_MODE_FAST_VALUE = 2;
      public static final int CLOUDS_MODE_OFF_VALUE = 3;
      private static final Internal.EnumLiteMap<RecordPerfSnapshotRequest.CloudsMode> internalValueMap = new Internal.EnumLiteMap<RecordPerfSnapshotRequest.CloudsMode>() {
         public RecordPerfSnapshotRequest.CloudsMode findValueByNumber(int var1) {
            return RecordPerfSnapshotRequest.CloudsMode.forNumber(var1);
         }
      };
      private static final RecordPerfSnapshotRequest.CloudsMode[] VALUES = values();
      private final int value;

      @Override
      public final int getNumber() {
         if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
         } else {
            return this.value;
         }
      }

      @Deprecated
      public static RecordPerfSnapshotRequest.CloudsMode valueOf(int var0) {
         return forNumber(var0);
      }

      public static RecordPerfSnapshotRequest.CloudsMode forNumber(int var0) {
         switch (var0) {
            case 0:
               return CLOUDS_MODE_UNSPECIFIED;
            case 1:
               return CLOUDS_MODE_FANCY;
            case 2:
               return CLOUDS_MODE_FAST;
            case 3:
               return CLOUDS_MODE_OFF;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<RecordPerfSnapshotRequest.CloudsMode> internalGetValueMap() {
         return internalValueMap;
      }

      @Override
      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         if (this == UNRECOGNIZED) {
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
         } else {
            return getDescriptor().getValues().get(this.ordinal());
         }
      }

      @Override
      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return RecordPerfSnapshotRequest.getDescriptor().getEnumTypes().get(2);
      }

      public static RecordPerfSnapshotRequest.CloudsMode valueOf(Descriptors.EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      CloudsMode(int var3) {
         this.value = var3;
      }
   }

   public enum GpuMemoryStateCase implements AbstractMessageLite.InternalOneOfEnum, Internal.EnumLite {
      NVIDIA_MEMORY(23),
      AMD_MEMORY(24),
      GPUMEMORYSTATE_NOT_SET(0);

      private final int value;

      GpuMemoryStateCase(int var3) {
         this.value = var3;
      }

      @Deprecated
      public static RecordPerfSnapshotRequest.GpuMemoryStateCase valueOf(int var0) {
         return forNumber(var0);
      }

      public static RecordPerfSnapshotRequest.GpuMemoryStateCase forNumber(int var0) {
         switch (var0) {
            case 0:
               return GPUMEMORYSTATE_NOT_SET;
            case 23:
               return NVIDIA_MEMORY;
            case 24:
               return AMD_MEMORY;
            default:
               return null;
         }
      }

      @Override
      public int getNumber() {
         return this.value;
      }
   }

   public enum GraphicsStatus implements ProtocolMessageEnum {
      GRAPHICS_STATUS_UNSPECIFIED(0),
      GRAPHICS_STATUS_FANCY(1),
      GRAPHICS_STATUS_FAST(2),
      GRAPHICS_STATUS_FABULOUS(3),
      UNRECOGNIZED(-1);

      public static final int GRAPHICS_STATUS_UNSPECIFIED_VALUE = 0;
      public static final int GRAPHICS_STATUS_FANCY_VALUE = 1;
      public static final int GRAPHICS_STATUS_FAST_VALUE = 2;
      public static final int GRAPHICS_STATUS_FABULOUS_VALUE = 3;
      private static final Internal.EnumLiteMap<RecordPerfSnapshotRequest.GraphicsStatus> internalValueMap = new Internal.EnumLiteMap<RecordPerfSnapshotRequest.GraphicsStatus>() {
         public RecordPerfSnapshotRequest.GraphicsStatus findValueByNumber(int var1) {
            return RecordPerfSnapshotRequest.GraphicsStatus.forNumber(var1);
         }
      };
      private static final RecordPerfSnapshotRequest.GraphicsStatus[] VALUES = values();
      private final int value;

      @Override
      public final int getNumber() {
         if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
         } else {
            return this.value;
         }
      }

      @Deprecated
      public static RecordPerfSnapshotRequest.GraphicsStatus valueOf(int var0) {
         return forNumber(var0);
      }

      public static RecordPerfSnapshotRequest.GraphicsStatus forNumber(int var0) {
         switch (var0) {
            case 0:
               return GRAPHICS_STATUS_UNSPECIFIED;
            case 1:
               return GRAPHICS_STATUS_FANCY;
            case 2:
               return GRAPHICS_STATUS_FAST;
            case 3:
               return GRAPHICS_STATUS_FABULOUS;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<RecordPerfSnapshotRequest.GraphicsStatus> internalGetValueMap() {
         return internalValueMap;
      }

      @Override
      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         if (this == UNRECOGNIZED) {
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
         } else {
            return getDescriptor().getValues().get(this.ordinal());
         }
      }

      @Override
      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return RecordPerfSnapshotRequest.getDescriptor().getEnumTypes().get(0);
      }

      public static RecordPerfSnapshotRequest.GraphicsStatus valueOf(Descriptors.EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      GraphicsStatus(int var3) {
         this.value = var3;
      }
   }

   public enum LazyChunkLoading implements ProtocolMessageEnum {
      LAZY_CHUNK_LOADING_UNSPECIFIED(0),
      LAZY_CHUNK_LOADING_MEDIUM(1),
      LAZY_CHUNK_LOADING_VANILLA(2),
      LAZY_CHUNK_LOADING_HIGH(3),
      LAZY_CHUNK_LOADING_LOW(4),
      LAZY_CHUNK_LOADING_LOWEST(5),
      LAZY_CHUNK_LOADING_HIGHEST(6),
      UNRECOGNIZED(-1);

      public static final int LAZY_CHUNK_LOADING_UNSPECIFIED_VALUE = 0;
      public static final int LAZY_CHUNK_LOADING_MEDIUM_VALUE = 1;
      public static final int LAZY_CHUNK_LOADING_VANILLA_VALUE = 2;
      public static final int LAZY_CHUNK_LOADING_HIGH_VALUE = 3;
      public static final int LAZY_CHUNK_LOADING_LOW_VALUE = 4;
      public static final int LAZY_CHUNK_LOADING_LOWEST_VALUE = 5;
      public static final int LAZY_CHUNK_LOADING_HIGHEST_VALUE = 6;
      private static final Internal.EnumLiteMap<RecordPerfSnapshotRequest.LazyChunkLoading> internalValueMap = new Internal.EnumLiteMap<RecordPerfSnapshotRequest.LazyChunkLoading>() {
         public RecordPerfSnapshotRequest.LazyChunkLoading findValueByNumber(int var1) {
            return RecordPerfSnapshotRequest.LazyChunkLoading.forNumber(var1);
         }
      };
      private static final RecordPerfSnapshotRequest.LazyChunkLoading[] VALUES = values();
      private final int value;

      @Override
      public final int getNumber() {
         if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
         } else {
            return this.value;
         }
      }

      @Deprecated
      public static RecordPerfSnapshotRequest.LazyChunkLoading valueOf(int var0) {
         return forNumber(var0);
      }

      public static RecordPerfSnapshotRequest.LazyChunkLoading forNumber(int var0) {
         switch (var0) {
            case 0:
               return LAZY_CHUNK_LOADING_UNSPECIFIED;
            case 1:
               return LAZY_CHUNK_LOADING_MEDIUM;
            case 2:
               return LAZY_CHUNK_LOADING_VANILLA;
            case 3:
               return LAZY_CHUNK_LOADING_HIGH;
            case 4:
               return LAZY_CHUNK_LOADING_LOW;
            case 5:
               return LAZY_CHUNK_LOADING_LOWEST;
            case 6:
               return LAZY_CHUNK_LOADING_HIGHEST;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<RecordPerfSnapshotRequest.LazyChunkLoading> internalGetValueMap() {
         return internalValueMap;
      }

      @Override
      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         if (this == UNRECOGNIZED) {
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
         } else {
            return getDescriptor().getValues().get(this.ordinal());
         }
      }

      @Override
      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return RecordPerfSnapshotRequest.getDescriptor().getEnumTypes().get(4);
      }

      public static RecordPerfSnapshotRequest.LazyChunkLoading valueOf(Descriptors.EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      LazyChunkLoading(int var3) {
         this.value = var3;
      }
   }

   public static final class NvidiaGpuMemoryState extends GeneratedMessageV3 implements RecordPerfSnapshotRequest.NvidiaGpuMemoryStateOrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int CURRENT_AVAILABLE_VRAM_KB_FIELD_NUMBER = 1;
      private int currentAvailableVramKb_ = 0;
      public static final int EVICTED_MEMORY_KB_FIELD_NUMBER = 2;
      private int evictedMemoryKb_ = 0;
      private byte memoizedIsInitialized = -1;
      private static final RecordPerfSnapshotRequest.NvidiaGpuMemoryState DEFAULT_INSTANCE = new RecordPerfSnapshotRequest.NvidiaGpuMemoryState();
      private static final Parser<RecordPerfSnapshotRequest.NvidiaGpuMemoryState> PARSER = new AbstractParser<RecordPerfSnapshotRequest.NvidiaGpuMemoryState>() {
         public RecordPerfSnapshotRequest.NvidiaGpuMemoryState parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
            RecordPerfSnapshotRequest.NvidiaGpuMemoryState.Builder var3 = RecordPerfSnapshotRequest.NvidiaGpuMemoryState.newBuilder();

            try {
               var3.mergeFrom(var1, var2);
            } catch (InvalidProtocolBufferException var5) {
               throw var5.setUnfinishedMessage(var3.buildPartial());
            } catch (UninitializedMessageException var6) {
               throw var6.asInvalidProtocolBufferException().setUnfinishedMessage(var3.buildPartial());
            } catch (IOException var7) {
               throw new InvalidProtocolBufferException(var7).setUnfinishedMessage(var3.buildPartial());
            }

            return var3.buildPartial();
         }
      };

      private NvidiaGpuMemoryState(GeneratedMessageV3.Builder<?> var1) {
         super(var1);
      }

      private NvidiaGpuMemoryState() {
      }

      @Override
      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
         return new RecordPerfSnapshotRequest.NvidiaGpuMemoryState();
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_performance_v1_RecordPerfSnapshotRequest_NvidiaGpuMemoryState_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_performance_v1_RecordPerfSnapshotRequest_NvidiaGpuMemoryState_fieldAccessorTable
            .ensureFieldAccessorsInitialized(RecordPerfSnapshotRequest.NvidiaGpuMemoryState.class, RecordPerfSnapshotRequest.NvidiaGpuMemoryState.Builder.class);
      }

      @Override
      public int getCurrentAvailableVramKb() {
         return this.currentAvailableVramKb_;
      }

      @Override
      public int getEvictedMemoryKb() {
         return this.evictedMemoryKb_;
      }

      @Override
      public final boolean isInitialized() {
         byte var1 = this.memoizedIsInitialized;
         if (var1 == 1) {
            return true;
         }

         if (var1 == 0) {
            return false;
         }

         this.memoizedIsInitialized = 1;
         return true;
      }

      @Override
      public void writeTo(CodedOutputStream var1) {
         if (this.currentAvailableVramKb_ != 0) {
            var1.writeInt32(1, this.currentAvailableVramKb_);
         }

         if (this.evictedMemoryKb_ != 0) {
            var1.writeInt32(2, this.evictedMemoryKb_);
         }

         this.getUnknownFields().writeTo(var1);
      }

      @Override
      public int getSerializedSize() {
         int var1 = this.memoizedSize;
         if (var1 != -1) {
            return var1;
         }

         var1 = 0;
         if (this.currentAvailableVramKb_ != 0) {
            var1 += CodedOutputStream.computeInt32Size(1, this.currentAvailableVramKb_);
         }

         if (this.evictedMemoryKb_ != 0) {
            var1 += CodedOutputStream.computeInt32Size(2, this.evictedMemoryKb_);
         }

         var1 += this.getUnknownFields().getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }

      @Override
      public boolean equals(Object var1) {
         if (var1 == this) {
            return true;
         } else if (!(var1 instanceof RecordPerfSnapshotRequest.NvidiaGpuMemoryState)) {
            return super.equals(var1);
         } else {
            RecordPerfSnapshotRequest.NvidiaGpuMemoryState var2 = (RecordPerfSnapshotRequest.NvidiaGpuMemoryState)var1;
            if (this.getCurrentAvailableVramKb() != var2.getCurrentAvailableVramKb()) {
               return false;
            } else {
               return this.getEvictedMemoryKb() != var2.getEvictedMemoryKb() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
            }
         }
      }

      @Override
      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         }

         int var1 = 41;
         var1 = 19 * var1 + getDescriptor().hashCode();
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getCurrentAvailableVramKb();
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getEvictedMemoryKb();
         var1 = 29 * var1 + this.getUnknownFields().hashCode();
         this.memoizedHashCode = var1;
         return var1;
      }

      public static RecordPerfSnapshotRequest.NvidiaGpuMemoryState parseFrom(ByteBuffer var0) {
         return PARSER.parseFrom(var0);
      }

      public static RecordPerfSnapshotRequest.NvidiaGpuMemoryState parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static RecordPerfSnapshotRequest.NvidiaGpuMemoryState parseFrom(ByteString var0) {
         return PARSER.parseFrom(var0);
      }

      public static RecordPerfSnapshotRequest.NvidiaGpuMemoryState parseFrom(ByteString var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static RecordPerfSnapshotRequest.NvidiaGpuMemoryState parseFrom(byte[] var0) {
         return PARSER.parseFrom(var0);
      }

      public static RecordPerfSnapshotRequest.NvidiaGpuMemoryState parseFrom(byte[] var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static RecordPerfSnapshotRequest.NvidiaGpuMemoryState parseFrom(InputStream var0) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0);
      }

      public static RecordPerfSnapshotRequest.NvidiaGpuMemoryState parseFrom(InputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
      }

      public static RecordPerfSnapshotRequest.NvidiaGpuMemoryState parseDelimitedFrom(InputStream var0) {
         return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
      }

      public static RecordPerfSnapshotRequest.NvidiaGpuMemoryState parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
      }

      public static RecordPerfSnapshotRequest.NvidiaGpuMemoryState parseFrom(CodedInputStream var0) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0);
      }

      public static RecordPerfSnapshotRequest.NvidiaGpuMemoryState parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
      }

      public RecordPerfSnapshotRequest.NvidiaGpuMemoryState.Builder newBuilderForType() {
         return newBuilder();
      }

      public static RecordPerfSnapshotRequest.NvidiaGpuMemoryState.Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static RecordPerfSnapshotRequest.NvidiaGpuMemoryState.Builder newBuilder(RecordPerfSnapshotRequest.NvidiaGpuMemoryState var0) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
      }

      public RecordPerfSnapshotRequest.NvidiaGpuMemoryState.Builder toBuilder() {
         return this == DEFAULT_INSTANCE
            ? new RecordPerfSnapshotRequest.NvidiaGpuMemoryState.Builder()
            : new RecordPerfSnapshotRequest.NvidiaGpuMemoryState.Builder().mergeFrom(this);
      }

      protected RecordPerfSnapshotRequest.NvidiaGpuMemoryState.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
         return new RecordPerfSnapshotRequest.NvidiaGpuMemoryState.Builder(var1);
      }

      public static RecordPerfSnapshotRequest.NvidiaGpuMemoryState getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<RecordPerfSnapshotRequest.NvidiaGpuMemoryState> parser() {
         return PARSER;
      }

      @Override
      public Parser<RecordPerfSnapshotRequest.NvidiaGpuMemoryState> getParserForType() {
         return PARSER;
      }

      public RecordPerfSnapshotRequest.NvidiaGpuMemoryState getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder
         extends GeneratedMessageV3.Builder<RecordPerfSnapshotRequest.NvidiaGpuMemoryState.Builder>
         implements RecordPerfSnapshotRequest.NvidiaGpuMemoryStateOrBuilder {
         private int bitField0_;
         private int currentAvailableVramKb_;
         private int evictedMemoryKb_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ServiceProto.internal_static_lunarclient_websocket_performance_v1_RecordPerfSnapshotRequest_NvidiaGpuMemoryState_descriptor;
         }

         @Override
         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ServiceProto.internal_static_lunarclient_websocket_performance_v1_RecordPerfSnapshotRequest_NvidiaGpuMemoryState_fieldAccessorTable
               .ensureFieldAccessorsInitialized(
                  RecordPerfSnapshotRequest.NvidiaGpuMemoryState.class, RecordPerfSnapshotRequest.NvidiaGpuMemoryState.Builder.class
               );
         }

         private Builder() {
         }

         private Builder(GeneratedMessageV3.BuilderParent var1) {
            super(var1);
         }

         public RecordPerfSnapshotRequest.NvidiaGpuMemoryState.Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.currentAvailableVramKb_ = 0;
            this.evictedMemoryKb_ = 0;
            return this;
         }

         @Override
         public Descriptors.Descriptor getDescriptorForType() {
            return ServiceProto.internal_static_lunarclient_websocket_performance_v1_RecordPerfSnapshotRequest_NvidiaGpuMemoryState_descriptor;
         }

         public RecordPerfSnapshotRequest.NvidiaGpuMemoryState getDefaultInstanceForType() {
            return RecordPerfSnapshotRequest.NvidiaGpuMemoryState.getDefaultInstance();
         }

         public RecordPerfSnapshotRequest.NvidiaGpuMemoryState build() {
            RecordPerfSnapshotRequest.NvidiaGpuMemoryState var1 = this.buildPartial();
            if (!var1.isInitialized()) {
               throw newUninitializedMessageException(var1);
            } else {
               return var1;
            }
         }

         public RecordPerfSnapshotRequest.NvidiaGpuMemoryState buildPartial() {
            RecordPerfSnapshotRequest.NvidiaGpuMemoryState var1 = new RecordPerfSnapshotRequest.NvidiaGpuMemoryState(this);
            if (this.bitField0_ != 0) {
               this.buildPartial0(var1);
            }

            this.onBuilt();
            return var1;
         }

         private void buildPartial0(RecordPerfSnapshotRequest.NvidiaGpuMemoryState var1) {
            int var2 = this.bitField0_;
            if ((var2 & 1) != 0) {
               var1.currentAvailableVramKb_ = this.currentAvailableVramKb_;
            }

            if ((var2 & 2) != 0) {
               var1.evictedMemoryKb_ = this.evictedMemoryKb_;
            }
         }

         public RecordPerfSnapshotRequest.NvidiaGpuMemoryState.Builder clone() {
            return (RecordPerfSnapshotRequest.NvidiaGpuMemoryState.Builder)super.clone();
         }

         public RecordPerfSnapshotRequest.NvidiaGpuMemoryState.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
            return (RecordPerfSnapshotRequest.NvidiaGpuMemoryState.Builder)super.setField(var1, var2);
         }

         public RecordPerfSnapshotRequest.NvidiaGpuMemoryState.Builder clearField(Descriptors.FieldDescriptor var1) {
            return (RecordPerfSnapshotRequest.NvidiaGpuMemoryState.Builder)super.clearField(var1);
         }

         public RecordPerfSnapshotRequest.NvidiaGpuMemoryState.Builder clearOneof(Descriptors.OneofDescriptor var1) {
            return (RecordPerfSnapshotRequest.NvidiaGpuMemoryState.Builder)super.clearOneof(var1);
         }

         public RecordPerfSnapshotRequest.NvidiaGpuMemoryState.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
            return (RecordPerfSnapshotRequest.NvidiaGpuMemoryState.Builder)super.setRepeatedField(var1, var2, var3);
         }

         public RecordPerfSnapshotRequest.NvidiaGpuMemoryState.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
            return (RecordPerfSnapshotRequest.NvidiaGpuMemoryState.Builder)super.addRepeatedField(var1, var2);
         }

         public RecordPerfSnapshotRequest.NvidiaGpuMemoryState.Builder mergeFrom(Message var1) {
            if (var1 instanceof RecordPerfSnapshotRequest.NvidiaGpuMemoryState) {
               return this.mergeFrom((RecordPerfSnapshotRequest.NvidiaGpuMemoryState)var1);
            }

            super.mergeFrom(var1);
            return this;
         }

         public RecordPerfSnapshotRequest.NvidiaGpuMemoryState.Builder mergeFrom(RecordPerfSnapshotRequest.NvidiaGpuMemoryState var1) {
            if (var1 == RecordPerfSnapshotRequest.NvidiaGpuMemoryState.getDefaultInstance()) {
               return this;
            }

            if (var1.getCurrentAvailableVramKb() != 0) {
               this.setCurrentAvailableVramKb(var1.getCurrentAvailableVramKb());
            }

            if (var1.getEvictedMemoryKb() != 0) {
               this.setEvictedMemoryKb(var1.getEvictedMemoryKb());
            }

            this.mergeUnknownFields(var1.getUnknownFields());
            this.onChanged();
            return this;
         }

         @Override
         public final boolean isInitialized() {
            return true;
         }

         public RecordPerfSnapshotRequest.NvidiaGpuMemoryState.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            try {
               boolean var3 = false;

               while (!var3) {
                  int var4 = var1.readTag();
                  switch (var4) {
                     case 0:
                        var3 = true;
                        break;
                     case 8:
                        this.currentAvailableVramKb_ = var1.readInt32();
                        this.bitField0_ |= 1;
                        break;
                     case 16:
                        this.evictedMemoryKb_ = var1.readInt32();
                        this.bitField0_ |= 2;
                        break;
                     default:
                        if (!super.parseUnknownField(var1, var2, var4)) {
                           var3 = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException var8) {
               throw var8.unwrapIOException();
            } finally {
               this.onChanged();
            }

            return this;
         }

         @Override
         public int getCurrentAvailableVramKb() {
            return this.currentAvailableVramKb_;
         }

         public RecordPerfSnapshotRequest.NvidiaGpuMemoryState.Builder setCurrentAvailableVramKb(int var1) {
            this.currentAvailableVramKb_ = var1;
            this.bitField0_ |= 1;
            this.onChanged();
            return this;
         }

         public RecordPerfSnapshotRequest.NvidiaGpuMemoryState.Builder clearCurrentAvailableVramKb() {
            this.bitField0_ &= -2;
            this.currentAvailableVramKb_ = 0;
            this.onChanged();
            return this;
         }

         @Override
         public int getEvictedMemoryKb() {
            return this.evictedMemoryKb_;
         }

         public RecordPerfSnapshotRequest.NvidiaGpuMemoryState.Builder setEvictedMemoryKb(int var1) {
            this.evictedMemoryKb_ = var1;
            this.bitField0_ |= 2;
            this.onChanged();
            return this;
         }

         public RecordPerfSnapshotRequest.NvidiaGpuMemoryState.Builder clearEvictedMemoryKb() {
            this.bitField0_ &= -3;
            this.evictedMemoryKb_ = 0;
            this.onChanged();
            return this;
         }

         public final RecordPerfSnapshotRequest.NvidiaGpuMemoryState.Builder setUnknownFields(UnknownFieldSet var1) {
            return (RecordPerfSnapshotRequest.NvidiaGpuMemoryState.Builder)super.setUnknownFields(var1);
         }

         public final RecordPerfSnapshotRequest.NvidiaGpuMemoryState.Builder mergeUnknownFields(UnknownFieldSet var1) {
            return (RecordPerfSnapshotRequest.NvidiaGpuMemoryState.Builder)super.mergeUnknownFields(var1);
         }
      }
   }

   public interface NvidiaGpuMemoryStateOrBuilder extends MessageOrBuilder {
      int getCurrentAvailableVramKb();

      int getEvictedMemoryKb();
   }

   public enum ParticlesMode implements ProtocolMessageEnum {
      PARTICLES_MODE_UNSPECIFIED(0),
      PARTICLES_MODE_ALL(1),
      PARTICLES_MODE_DECREASED(2),
      PARTICLES_MODE_MINIMAL(3),
      UNRECOGNIZED(-1);

      public static final int PARTICLES_MODE_UNSPECIFIED_VALUE = 0;
      public static final int PARTICLES_MODE_ALL_VALUE = 1;
      public static final int PARTICLES_MODE_DECREASED_VALUE = 2;
      public static final int PARTICLES_MODE_MINIMAL_VALUE = 3;
      private static final Internal.EnumLiteMap<RecordPerfSnapshotRequest.ParticlesMode> internalValueMap = new Internal.EnumLiteMap<RecordPerfSnapshotRequest.ParticlesMode>() {
         public RecordPerfSnapshotRequest.ParticlesMode findValueByNumber(int var1) {
            return RecordPerfSnapshotRequest.ParticlesMode.forNumber(var1);
         }
      };
      private static final RecordPerfSnapshotRequest.ParticlesMode[] VALUES = values();
      private final int value;

      @Override
      public final int getNumber() {
         if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
         } else {
            return this.value;
         }
      }

      @Deprecated
      public static RecordPerfSnapshotRequest.ParticlesMode valueOf(int var0) {
         return forNumber(var0);
      }

      public static RecordPerfSnapshotRequest.ParticlesMode forNumber(int var0) {
         switch (var0) {
            case 0:
               return PARTICLES_MODE_UNSPECIFIED;
            case 1:
               return PARTICLES_MODE_ALL;
            case 2:
               return PARTICLES_MODE_DECREASED;
            case 3:
               return PARTICLES_MODE_MINIMAL;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<RecordPerfSnapshotRequest.ParticlesMode> internalGetValueMap() {
         return internalValueMap;
      }

      @Override
      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         if (this == UNRECOGNIZED) {
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
         } else {
            return getDescriptor().getValues().get(this.ordinal());
         }
      }

      @Override
      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return RecordPerfSnapshotRequest.getDescriptor().getEnumTypes().get(3);
      }

      public static RecordPerfSnapshotRequest.ParticlesMode valueOf(Descriptors.EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      ParticlesMode(int var3) {
         this.value = var3;
      }
   }

   public enum TextureFiltering implements ProtocolMessageEnum {
      TEXTURE_FILTERING_NONE_UNSPECIFIED(0),
      TEXTURE_FILTERING_RGSS(1),
      TEXTURE_FILTERING_ANISOTROPIC(2),
      UNRECOGNIZED(-1);

      public static final int TEXTURE_FILTERING_NONE_UNSPECIFIED_VALUE = 0;
      public static final int TEXTURE_FILTERING_RGSS_VALUE = 1;
      public static final int TEXTURE_FILTERING_ANISOTROPIC_VALUE = 2;
      private static final Internal.EnumLiteMap<RecordPerfSnapshotRequest.TextureFiltering> internalValueMap = new Internal.EnumLiteMap<RecordPerfSnapshotRequest.TextureFiltering>() {
         public RecordPerfSnapshotRequest.TextureFiltering findValueByNumber(int var1) {
            return RecordPerfSnapshotRequest.TextureFiltering.forNumber(var1);
         }
      };
      private static final RecordPerfSnapshotRequest.TextureFiltering[] VALUES = values();
      private final int value;

      @Override
      public final int getNumber() {
         if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
         } else {
            return this.value;
         }
      }

      @Deprecated
      public static RecordPerfSnapshotRequest.TextureFiltering valueOf(int var0) {
         return forNumber(var0);
      }

      public static RecordPerfSnapshotRequest.TextureFiltering forNumber(int var0) {
         switch (var0) {
            case 0:
               return TEXTURE_FILTERING_NONE_UNSPECIFIED;
            case 1:
               return TEXTURE_FILTERING_RGSS;
            case 2:
               return TEXTURE_FILTERING_ANISOTROPIC;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<RecordPerfSnapshotRequest.TextureFiltering> internalGetValueMap() {
         return internalValueMap;
      }

      @Override
      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         if (this == UNRECOGNIZED) {
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
         } else {
            return getDescriptor().getValues().get(this.ordinal());
         }
      }

      @Override
      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return RecordPerfSnapshotRequest.getDescriptor().getEnumTypes().get(5);
      }

      public static RecordPerfSnapshotRequest.TextureFiltering valueOf(Descriptors.EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      TextureFiltering(int var3) {
         this.value = var3;
      }
   }
}
