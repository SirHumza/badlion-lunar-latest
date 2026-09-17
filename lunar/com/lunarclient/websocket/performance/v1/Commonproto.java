package com.lunarclient.websocket.performance.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.websocket.protocol.v1.CommonProto;

public final class ServiceProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_performance_v1_RecordPerfSnapshotRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_performance_v1_RecordPerfSnapshotRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_performance_v1_RecordPerfSnapshotRequest_descriptor,
      new String[]{
         "Fps",
         "RenderedChunkSections",
         "LoadedChunks",
         "RenderedEntities",
         "RenderedPlayers",
         "RenderedParticles",
         "RenderedBlockEntities",
         "FreeMemoryKb",
         "TotalMemoryKb",
         "MaxMemoryKb",
         "GpuUsage",
         "Frametime",
         "DirectMemoryKb",
         "OffHeapMemoryKb",
         "LunarHuds",
         "RenderedGeckolibCosmetics",
         "RenderedCosmetics",
         "RenderedEmotes",
         "RenderedTurboEntities",
         "RenderedTurboBlockEntities",
         "UsingExternalShaders",
         "AverageFps",
         "NvidiaMemory",
         "AmdMemory",
         "Width",
         "Height",
         "Fullscreen",
         "Vsync",
         "SmoothLighting",
         "EntityShadows",
         "MaxFramerate",
         "GraphicsStatus",
         "ChunkBuilder",
         "Clouds",
         "Particles",
         "RenderDistance",
         "SimulatedDistance",
         "EntityDistance",
         "BiomeBlend",
         "Fov",
         "HudCaching",
         "ParticlePhysics",
         "LazyChunkLoading",
         "TurboEntities",
         "TurboEntitiesRate",
         "TurboBlockEntities",
         "TurboBlockEntitiesRate",
         "TurboBlockEntitiesFar",
         "GpuName",
         "GcCycles",
         "LongestGcMicro",
         "ShortestGcMicro",
         "AvgGcMicro",
         "MedianGcMicro",
         "FrameTimeAverage",
         "FrameTimeFastest",
         "FrameTimeSlowest",
         "GraphicsBackend",
         "SodiumPresent",
         "TextureFiltering",
         "GpuMemoryState"
      }
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_performance_v1_RecordPerfSnapshotRequest_AverageGroup_descriptor = internal_static_lunarclient_websocket_performance_v1_RecordPerfSnapshotRequest_descriptor.getNestedTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_performance_v1_RecordPerfSnapshotRequest_AverageGroup_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_performance_v1_RecordPerfSnapshotRequest_AverageGroup_descriptor, new String[]{"Average", "High", "Low"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_performance_v1_RecordPerfSnapshotRequest_NvidiaGpuMemoryState_descriptor = internal_static_lunarclient_websocket_performance_v1_RecordPerfSnapshotRequest_descriptor.getNestedTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_performance_v1_RecordPerfSnapshotRequest_NvidiaGpuMemoryState_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_performance_v1_RecordPerfSnapshotRequest_NvidiaGpuMemoryState_descriptor,
      new String[]{"CurrentAvailableVramKb", "EvictedMemoryKb"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_performance_v1_RecordPerfSnapshotRequest_AmdGpuMemoryState_descriptor = internal_static_lunarclient_websocket_performance_v1_RecordPerfSnapshotRequest_descriptor.getNestedTypes()
      .get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_performance_v1_RecordPerfSnapshotRequest_AmdGpuMemoryState_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_performance_v1_RecordPerfSnapshotRequest_AmdGpuMemoryState_descriptor,
      new String[]{"VboTotalPoolAvailableKb", "VboLargestAvailableFreeBlockKb", "VboTotalAuxiliaryMemoryFreeKb", "VboLargestAuxiliaryFreeBlockKb"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_performance_v1_RecordPerfSnapshotResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_performance_v1_RecordPerfSnapshotResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_performance_v1_RecordPerfSnapshotResponse_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_performance_v1_StartJfrUploadRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_performance_v1_StartJfrUploadRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_performance_v1_StartJfrUploadRequest_descriptor, new String[]{"Files"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_performance_v1_StartJfrUploadRequest_File_descriptor = internal_static_lunarclient_websocket_performance_v1_StartJfrUploadRequest_descriptor.getNestedTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_performance_v1_StartJfrUploadRequest_File_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_performance_v1_StartJfrUploadRequest_File_descriptor, new String[]{"Name"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_performance_v1_StartJfrUploadResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_performance_v1_StartJfrUploadResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_performance_v1_StartJfrUploadResponse_descriptor, new String[]{"Files", "UploadId", "Status"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_performance_v1_StartJfrUploadResponse_File_descriptor = internal_static_lunarclient_websocket_performance_v1_StartJfrUploadResponse_descriptor.getNestedTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_performance_v1_StartJfrUploadResponse_File_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_performance_v1_StartJfrUploadResponse_File_descriptor, new String[]{"Name", "UploadUrl"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_performance_v1_CompleteJfrUploadRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(4);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_performance_v1_CompleteJfrUploadRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_performance_v1_CompleteJfrUploadRequest_descriptor, new String[]{"UploadId"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_performance_v1_CompleteJfrUploadResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(5);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_performance_v1_CompleteJfrUploadResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_performance_v1_CompleteJfrUploadResponse_descriptor, new String[0]
   );
   private static Descriptors.FileDescriptor descriptor;

   private ServiceProto() {
   }

   public static void registerAllExtensions(ExtensionRegistryLite var0) {
   }

   public static void registerAllExtensions(ExtensionRegistry var0) {
      registerAllExtensions((ExtensionRegistryLite)var0);
   }

   public static Descriptors.FileDescriptor getDescriptor() {
      return descriptor;
   }

   static {
      String[] var0 = new String[]{
         "\n2lunarclient/websocket/performance/v1/service.proto\u0012$lunarclient.websocket.performance.v1\u001a.lunarclient/websocket/protocol/v1/common.proto\"é#\n\u0019RecordPerfSnapshotRequest\u0012\u0010\n\u0003fps\u0018\u0001 \u0001(\u0005R\u0003fps\u00126\n\u0017rendered_chunk_sections\u0018\u0002 \u0001(\u0005R\u0015renderedChunkSections\u0012#\n\rloaded_chunks\u0018\u0003 \u0001(\u0005R\floadedChunks\u0012+\n\u0011rendered_entities\u0018\u0004 \u0001(\u0005R\u0010renderedEntities\u0012)\n\u0010rendered_players\u0018\u0005 \u0001(\u0005R\u000frenderedPlayers\u0012-\n\u0012rendered_particles\u0018\u0006 \u0001(\u0005R\u0011renderedParticles\u00126\n\u0017rendered_block_entities\u0018\u0016 \u0001(\u0005R\u0015renderedBlockEntities\u0012$\n\u000efree_memory_kb\u0018\u0007 \u0001(\u0005R\ffreeMemoryKb\u0012&\n\u000ftotal_memory_kb\u0018\b \u0001(\u0005R\rtotalMemoryKb\u0012\"\n\rmax_memory_kb\u0018\t \u0001(\u0005R\u000bmaxMemoryKb\u0012\u001b\n\tgpu_usage\u0018\n \u0001(\u0002R\bgpuUsage\u0012\u001c\n\tframetime\u0018\u000f \u0001(\u0002R\tframetime\u0012(\n\u0010direct_memory_kb\u0018\u0011 \u0001(\u0005R\u000edirectMemoryKb\u0012+\n\u0012off_heap_memory_kb\u0018\u0012 \u0001(\u0005R\u000foffHeapMemoryKb\u0012\u001d\n\nlunar_huds\u0018\u000b \u0001(\u0005R\tlunarHuds\u0012>\n\u001brendered_geckolib_cosmetics\u0018\f \u0001(\u0005R\u0019renderedGeckolibCosmetics\u0012-\n\u0012rendered_cosmetics\u0018\r \u0001(\u0005R\u0011renderedCosmetics\u0012'\n\u000frendered_emotes\u0018\u000e \u0001(\u0005R\u000erenderedEmotes\u00126\n\u0017rendered_turbo_entities\u0018\u0010 \u0001(\u0005R\u0015renderedTurboEntities\u0012A\n\u001drendered_turbo_block_entities\u0018\u0015 \u0001(\u0005R\u001arenderedTurboBlockEntities\u00124\n\u0016using_external_shaders\u0018\u0013 \u0001(\bR\u0014usingExternalShaders\u0012m\n\u000baverage_fps\u0018\u0014 \u0001(\u000b2L.lunarclient.websocket.performance.v1.RecordPerfSnapshotRequest.AverageGroupR\naverageFps\u0012{\n\rnvidia_memory\u0018\u0017 \u0001(\u000b2T.lunarclient.websocket.performance.v1.RecordPerfSnapshotRequest.NvidiaGpuMemoryStateH\u0000R\fnvidiaMemory\u0012r\n\namd_memory\u0018\u0018 \u0001(\u000b2Q.lunarclient.websocket.performance.v1.RecordPerfSnapshotRequest.AmdGpuMemoryStateH\u0000R\tamdMemory\u0012\u0014\n\u0005width\u0018\u0019 \u0001(\u0005R\u0005width\u0012\u0016\n\u0006height\u0018\u001a \u0001(\u0005R\u0006height\u0012\u001e\n\nfullscreen\u0018\u001b \u0001(\bR\nfullscreen\u0012\u0014\n\u0005vsync\u0018\u001c \u0001(\bR\u0005vsync\u0012'\n\u000fsmooth_lighting\u0018\u001d \u0001(\bR\u000esmoothLighting\u0012%\n\u000eentity_shadows\u0018\u001e \u0001(\bR\rentityShadows\u0012#\n\rmax_framerate\u0018\u001f \u0001(\u0005R\fmaxFramerate\u0012w\n\u000fgraphics_status\u0018  \u0001(\u000e2N.lunarclient.websocket.performance.v1.RecordPerfSnapshotRequest.GraphicsStatusR\u000egraphicsStatus\u0012q\n\rchunk_builder\u0018! \u0001(\u000e2L.lunarclient.websocket.performance.v1.RecordPerfSnapshotRequest.ChunkBuilderR\fchunkBuilder\u0012b\n\u0006clouds\u0018\" \u0001(\u000e2J.lunarclient.websocket.performance.v1.RecordPerfSnapshotRequest.CloudsModeR\u0006clouds\u0012k\n\tparticles\u0018# \u0001(\u000e2M.lunarclient.websocket.performance.v1.RecordPerfSnapshotRequest.ParticlesModeR\tparticles\u0012'\n\u000frender_distance\u0018$ \u0001(\u0005R\u000erenderDistance\u0012-\n\u0012simulated_distance\u0018% \u0001(\u0005R\u0011simulatedDistance\u0012'\n\u000fentity_distance\u0018& \u0001(\u0005R\u000eentityDistance\u0012\u001f\n\u000bbiome_blend\u0018' \u0001(\u0005R\nbiomeBlend\u0012\u0010\n\u0003fov\u0018( \u0001(\u0005R\u0003fov\u0012\u001f\n\u000bhud_caching\u0018) \u0001(\bR\nhudCaching\u0012)\n\u0010particle_physics\u0018* \u0001(\bR\u000fparticlePhysics\u0012~\n\u0012lazy_chunk_loading\u0018+ \u0001(\u000e2P.lunarclient.websocket.performance.v1.RecordPerfSnapshotRequest.LazyChunkLoadingR\u0010lazyChunkLoading\u0012%\n\u000eturbo_entities\u0018, \u0001(\bR\rturboEntities\u0012.\n\u0013turbo_entities_rate\u0018- \u0001(\u0005R\u0011turboEntitiesRate\u00120\n\u0014turbo_block_entities\u0018. \u0001(\bR\u0012turboBlockEntities\u00129\n\u0019turbo_block_entities_rate\u0018/ \u0001(\u0005R\u0016turboBlockEntitiesRate\u00127\n\u0018turbo_block_entities_far\u00180 \u0001(\bR\u0015turboBlockEntitiesFar\u0012\u0019\n\bgpu_name\u00181 \u0001(\tR\u0007gpuName\u0012\u001b\n\tgc_cycles\u00182 \u0001(\u0005R\bgcCycles\u0012(\n\u0010longest_gc_micro\u00183 \u0001(\u0005R\u000elongestGcMicro\u0012*\n\u0011shortest_gc_micro\u00184 \u0001(\u0005R\u000fshortestGcMicro\u0012 \n\favg_gc_micro\u00185 \u0001(\u0005R\navgGcMicro\u0012&\n\u000fmedian_gc_micro\u00186 \u0001(\u0005R\rmedianGcMicro\u0012,\n\u0012frame_time_average\u00187 \u0001(\u0002R\u0010frameTimeAverage\u0012,\n\u0012frame_time_fastest\u00189 \u0001(\u0002R\u0010frameTimeFastest\u0012,\n\u0012frame_time_slowest\u0018: \u0001(\u0002R\u0010frameTimeSlowest\u0012)\n\u0010graphics_backend\u0018; \u0001(\tR\u000fgraphicsBackend\u0012%\n\u000esodium_present\u0018< \u0001(\bR\rsodiumPresent\u0012}\n\u0011texture_filtering\u0018= \u0001(\u000e2P.lunarclient.websocket.performance.v1.RecordPerfSnapshotRequest.TextureFilteringR\u0010textureFiltering\u001aN\n\fAverageGroup\u0012\u0018\n\u0007average\u0018\u0001 \u0001(\u0002R\u0007average\u0012\u0012\n\u0004high\u0018\u0002 \u0001(\u0005R\u0004high\u0012\u0010\n\u0003low\u0018\u0003 \u0001(\u0005R\u0003low\u001a}\n\u0014NvidiaGpuMemoryState\u00129\n\u0019current_available_vram_kb\u0018\u0001 \u0001(\u0005R\u0016currentAvailableVramKb\u0012*\n\u0011evicted_memory_kb\u0018\u0002 \u0001(\u0005R\u000fevictedMemoryKb\u001a¶\u0002\n\u0011AmdGpuMemoryState\u0012<\n\u001bvbo_total_pool_available_kb\u0018\u0001 \u0001(\u0005R\u0017vboTotalPoolAvailableKb\u0012K\n#vbo_largest_available_free_block_kb\u0018\u0002 \u0001(\u0005R\u001evboLargestAvailableFreeBlockKb\u0012I\n\"vbo_total_auxiliary_memory_free_kb\u0018\u0003 \u0001(\u0005R\u001dvboTotalAuxiliaryMemoryFreeKb\u0012K\n#vbo_largest_auxiliary_free_block_kb\u0018\u0004 \u0001(\u0005R\u001evboLargestAuxiliaryFreeBlockKb\"\u0084\u0001\n\u000eGraphicsStatus\u0012\u001f\n\u001bGRAPHICS_STATUS_UNSPECIFIED\u0010\u0000\u0012\u0019\n\u0015GRAPHICS_STATUS_FANCY\u0010\u0001\u0012\u0018\n\u0014GRAPHICS_STATUS_FAST\u0010\u0002\u0012\u001c\n\u0018GRAPHICS_STATUS_FABULOUS\u0010\u0003\"\u008c\u0001\n\fChunkBuilder\u0012\u001d\n\u0019CHUNK_BUILDER_UNSPECIFIED\u0010\u0000\u0012\u001a\n\u0016CHUNK_BUILDER_THREADED\u0010\u0001\u0012\u001f\n\u001bCHUNK_BUILDER_SEMI_BLOCKING\u0010\u0002\u0012 \n\u001cCHUNK_BUILDER_FULLY_BLOCKING\u0010\u0003\"k\n\nCloudsMode\u0012\u001b\n\u0017CLOUDS_MODE_UNSPECIFIED\u0010\u0000\u0012\u0015\n\u0011CLOUDS_MODE_FANCY\u0010\u0001\u0012\u0014\n\u0010CLOUDS_MODE_FAST\u0010\u0002\u0012\u0013\n\u000fCLOUDS_MODE_OFF\u0010\u0003\"\u0081\u0001\n\rParticlesMode\u0012\u001e\n\u001aPARTICLES_MODE_UNSPECIFIED\u0010\u0000\u0012\u0016\n\u0012PARTICLES_MODE_ALL\u0010\u0001\u0012\u001c\n\u0018PARTICLES_MODE_DECREASED\u0010\u0002\u0012\u001a\n\u0016PARTICLES_MODE_MINIMAL\u0010\u0003\"í\u0001\n\u0010LazyChunkLoading\u0012\"\n\u001eLAZY_CHUNK_LOADING_UNSPECIFIED\u0010\u0000\u0012\u001d\n\u0019LAZY_CHUNK_LOADING_MEDIUM\u0010\u0001\u0012\u001e\n\u001aLAZY_CHUNK_LOADING_VANILLA\u0010\u0002\u0012\u001b\n\u0017LAZY_CHUNK_LOADING_HIGH\u0010\u0003\u0012\u001a\n\u0016LAZY_CHUNK_LOADING_LOW\u0010\u0004\u0012\u001d\n\u0019LAZY_CHUNK_LOADING_LOWEST\u0010\u0005\u0012\u001e\n\u001aLAZY_CHUNK_LOADING_HIGHEST\u0010\u0006\"y\n\u0010TextureFiltering\u0012&\n\"TEXTURE_FILTERING_NONE_UNSPECIFIED\u0010\u0000\u0012\u001a\n\u0016TEXTURE_FILTERING_RGSS\u0010\u0001\u0012!\n\u001dTEXTURE_FILTERING_ANISOTROPIC\u0010\u0002B\u0012\n\u0010gpu_memory_state\"\u001c\n\u001aRecordPerfSnapshotResponse\"\u008b\u0001\n\u0015StartJfrUploadRequest\u0012V\n\u0005files\u0018\u0001 \u0003(\u000b2@.lunarclient.websocket.performance.v1.StartJfrUploadRequest.FileR\u0005files\u001a\u001a\n\u0004File\u0012\u0012\n\u0004name\u0018\u0001 \u0001(\tR\u0004name\"ô\u0002\n\u0016StartJfrUploadResponse\u0012W\n\u0005files\u0018\u0001 \u0003(\u000b2A.lunarclient.websocket.performance.v1.StartJfrUploadResponse.FileR\u0005files\u0012\u001b\n\tupload_id\u0018\u0002 \u0001(\tR\buploadId\u0012[\n\u0006status\u0018\u0003 \u0001(\u000e2C.lunarclient.websocket.performance.v1.StartJfrUploadResponse.StatusR\u0006status\u001a9\n\u0004File\u0012\u0012\n\u0004name\u0018\u0001 \u0001(\tR\u0004name\u0012\u001d\n\nupload_url\u0018\u0002 \u0001(\tR\tuploadUrl\"L\n\u0006Status\u0012\u0016\n\u0012STATUS_UNSPECIFIED\u0010\u0000\u0012\u0012\n\u000eSTATUS_SUCCESS\u0010\u0001\u0012\u0016\n\u0012STATUS_NOT_ALLOWED\u0010\u0002\"7\n\u0018CompleteJfrUploadRequest\u0012\u001b\n\tupload_id\u0018\u0001 \u0001(\tR\buploadId\"\u001b\n\u0019CompleteJfrUploadResponse2å\u0003\n\u0012PerformanceService\u0012\u009d\u0001\n\u0012RecordPerfSnapshot\u0012?.lunarclient.websocket.performance.v1.RecordPerfSnapshotRequest\u001a@.lunarclient.websocket.performance.v1.RecordPerfSnapshotResponse\"\u0004\u0088µ\u0018\u0001\u0012\u0091\u0001\n\u000eStartJfrUpload\u0012;.lunarclient.websocket.performance.v1.StartJfrUploadRequest\u001a<.lunarclient.websocket.performance.v1.StartJfrUploadResponse\"\u0004\u0088µ\u0018\u0001\u0012\u009a\u0001\n\u0011CompleteJfrUpload\u0012>.lunarclient.websocket.performance.v1.CompleteJfrUploadRequest\u001a?.lunarclient.websocket.performance.v1.CompleteJfrUploadResponse\"\u0004\u0088µ\u0018\u0001Bî\u0001\n(com.lunarclient.websocket.performance.v1B\fServiceProtoP\u0001\u0088\u0001\u0001¢\u0002\u0003LWPª\u0002$Lunarclient.Websocket.Performance.V1Ê\u0002$Lunarclient\\Websocket\\Performance\\V1â\u00020Lunarclient\\Websocket\\Performance\\V1\\GPBMetadataê\u0002'Lunarclient::Websocket::Performance::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[]{CommonProto.getDescriptor()});
      ExtensionRegistry var1 = ExtensionRegistry.newInstance();
      var1.add(CommonProto.allowedSender);
      Descriptors.FileDescriptor.internalUpdateFileDescriptor(descriptor, var1);
      CommonProto.getDescriptor();
   }
}
