// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: auth.proto

package com.anubis.sso;

public final class AuthOuterClass {
  private AuthOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_anubis_sso_TokenInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_anubis_sso_TokenInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_anubis_sso_AuthResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_anubis_sso_AuthResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_anubis_sso_UserInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_anubis_sso_UserInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_anubis_sso_LoginResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_anubis_sso_LoginResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_anubis_sso_RegResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_anubis_sso_RegResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nauth.proto\022\016com.anubis.sso\"\032\n\tTokenInf" +
      "o\022\r\n\005token\030\001 \001(\t\"\036\n\nAuthResult\022\020\n\010isAuth" +
      "OK\030\001 \001(\010\".\n\010UserInfo\022\020\n\010userName\030\001 \001(\t\022\020" +
      "\n\010password\030\002 \001(\t\"/\n\013LoginResult\022\021\n\tisLog" +
      "inOK\030\001 \001(\010\022\r\n\005token\030\002 \001(\t\"H\n\tRegResult\022\017" +
      "\n\007isRegOK\030\001 \001(\010\022\024\n\014isUserExists\030\002 \001(\010\022\024\n" +
      "\014isPwdTooEasy\030\003 \001(\0102\306\001\n\004Auth\022=\n\004auth\022\031.c" +
      "om.anubis.sso.TokenInfo\032\032.com.anubis.sso" +
      ".AuthResult\022>\n\005login\022\030.com.anubis.sso.Us" +
      "erInfo\032\033.com.anubis.sso.LoginResult\022?\n\010r" +
      "egister\022\030.com.anubis.sso.UserInfo\032\031.com." +
      "anubis.sso.RegResultB\002P\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_anubis_sso_TokenInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_anubis_sso_TokenInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_anubis_sso_TokenInfo_descriptor,
        new java.lang.String[] { "Token", });
    internal_static_com_anubis_sso_AuthResult_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_anubis_sso_AuthResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_anubis_sso_AuthResult_descriptor,
        new java.lang.String[] { "IsAuthOK", });
    internal_static_com_anubis_sso_UserInfo_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_anubis_sso_UserInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_anubis_sso_UserInfo_descriptor,
        new java.lang.String[] { "UserName", "Password", });
    internal_static_com_anubis_sso_LoginResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_anubis_sso_LoginResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_anubis_sso_LoginResult_descriptor,
        new java.lang.String[] { "IsLoginOK", "Token", });
    internal_static_com_anubis_sso_RegResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_anubis_sso_RegResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_anubis_sso_RegResult_descriptor,
        new java.lang.String[] { "IsRegOK", "IsUserExists", "IsPwdTooEasy", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
