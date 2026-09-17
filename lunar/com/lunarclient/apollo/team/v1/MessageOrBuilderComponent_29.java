package com.lunarclient.apollo.team.v1;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface UpdateTeamMembersMessageOrBuilder extends MessageOrBuilder {
   List<TeamMember> getMembersList();

   TeamMember getMembers(int var1);

   int getMembersCount();

   List<? extends TeamMemberOrBuilder> getMembersOrBuilderList();

   TeamMemberOrBuilder getMembersOrBuilder(int var1);
}
