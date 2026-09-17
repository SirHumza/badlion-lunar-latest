package com.lunarclient.websocket.performance.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface RecordPerfSnapshotRequestOrBuilder extends MessageOrBuilder {
   int getFps();

   int getRenderedChunkSections();

   int getLoadedChunks();

   int getRenderedEntities();

   int getRenderedPlayers();

   int getRenderedParticles();

   int getRenderedBlockEntities();

   int getFreeMemoryKb();

   int getTotalMemoryKb();

   int getMaxMemoryKb();

   float getGpuUsage();

   float getFrametime();

   int getDirectMemoryKb();

   int getOffHeapMemoryKb();

   int getLunarHuds();

   int getRenderedGeckolibCosmetics();

   int getRenderedCosmetics();

   int getRenderedEmotes();

   int getRenderedTurboEntities();

   int getRenderedTurboBlockEntities();

   boolean getUsingExternalShaders();

   boolean hasAverageFps();

   RecordPerfSnapshotRequest.AverageGroup getAverageFps();

   RecordPerfSnapshotRequest.AverageGroupOrBuilder getAverageFpsOrBuilder();

   boolean hasNvidiaMemory();

   RecordPerfSnapshotRequest.NvidiaGpuMemoryState getNvidiaMemory();

   RecordPerfSnapshotRequest.NvidiaGpuMemoryStateOrBuilder getNvidiaMemoryOrBuilder();

   boolean hasAmdMemory();

   RecordPerfSnapshotRequest.AmdGpuMemoryState getAmdMemory();

   RecordPerfSnapshotRequest.AmdGpuMemoryStateOrBuilder getAmdMemoryOrBuilder();

   int getWidth();

   int getHeight();

   boolean getFullscreen();

   boolean getVsync();

   boolean getSmoothLighting();

   boolean getEntityShadows();

   int getMaxFramerate();

   int getGraphicsStatusValue();

   RecordPerfSnapshotRequest.GraphicsStatus getGraphicsStatus();

   int getChunkBuilderValue();

   RecordPerfSnapshotRequest.ChunkBuilder getChunkBuilder();

   int getCloudsValue();

   RecordPerfSnapshotRequest.CloudsMode getClouds();

   int getParticlesValue();

   RecordPerfSnapshotRequest.ParticlesMode getParticles();

   int getRenderDistance();

   int getSimulatedDistance();

   int getEntityDistance();

   int getBiomeBlend();

   int getFov();

   boolean getHudCaching();

   boolean getParticlePhysics();

   int getLazyChunkLoadingValue();

   RecordPerfSnapshotRequest.LazyChunkLoading getLazyChunkLoading();

   boolean getTurboEntities();

   int getTurboEntitiesRate();

   boolean getTurboBlockEntities();

   int getTurboBlockEntitiesRate();

   boolean getTurboBlockEntitiesFar();

   String getGpuName();

   ByteString getGpuNameBytes();

   int getGcCycles();

   int getLongestGcMicro();

   int getShortestGcMicro();

   int getAvgGcMicro();

   int getMedianGcMicro();

   float getFrameTimeAverage();

   float getFrameTimeFastest();

   float getFrameTimeSlowest();

   String getGraphicsBackend();

   ByteString getGraphicsBackendBytes();

   boolean getSodiumPresent();

   int getTextureFilteringValue();

   RecordPerfSnapshotRequest.TextureFiltering getTextureFiltering();

   RecordPerfSnapshotRequest.GpuMemoryStateCase getGpuMemoryStateCase();
}
