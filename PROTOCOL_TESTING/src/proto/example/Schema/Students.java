// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Schema.proto

package proto.example.Schema;

/**
 * Protobuf type {@code Students}
 */
public  final class Students extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Students)
    StudentsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Students.newBuilder() to construct.
  private Students(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Students() {
    students_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Students(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              students_ = new java.util.ArrayList<proto.example.Schema.Student>();
              mutable_bitField0_ |= 0x00000001;
            }
            students_.add(
                input.readMessage(proto.example.Schema.Student.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        students_ = java.util.Collections.unmodifiableList(students_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.example.Schema.SchemaProtos.internal_static_Students_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.example.Schema.SchemaProtos.internal_static_Students_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.example.Schema.Students.class, proto.example.Schema.Students.Builder.class);
  }

  public static final int STUDENTS_FIELD_NUMBER = 1;
  private java.util.List<proto.example.Schema.Student> students_;
  /**
   * <code>repeated .Student students = 1;</code>
   */
  public java.util.List<proto.example.Schema.Student> getStudentsList() {
    return students_;
  }
  /**
   * <code>repeated .Student students = 1;</code>
   */
  public java.util.List<? extends proto.example.Schema.StudentOrBuilder> 
      getStudentsOrBuilderList() {
    return students_;
  }
  /**
   * <code>repeated .Student students = 1;</code>
   */
  public int getStudentsCount() {
    return students_.size();
  }
  /**
   * <code>repeated .Student students = 1;</code>
   */
  public proto.example.Schema.Student getStudents(int index) {
    return students_.get(index);
  }
  /**
   * <code>repeated .Student students = 1;</code>
   */
  public proto.example.Schema.StudentOrBuilder getStudentsOrBuilder(
      int index) {
    return students_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < students_.size(); i++) {
      output.writeMessage(1, students_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < students_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, students_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof proto.example.Schema.Students)) {
      return super.equals(obj);
    }
    proto.example.Schema.Students other = (proto.example.Schema.Students) obj;

    boolean result = true;
    result = result && getStudentsList()
        .equals(other.getStudentsList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getStudentsCount() > 0) {
      hash = (37 * hash) + STUDENTS_FIELD_NUMBER;
      hash = (53 * hash) + getStudentsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static proto.example.Schema.Students parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.example.Schema.Students parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.example.Schema.Students parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.example.Schema.Students parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.example.Schema.Students parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.example.Schema.Students parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.example.Schema.Students parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.example.Schema.Students parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.example.Schema.Students parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto.example.Schema.Students parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.example.Schema.Students parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.example.Schema.Students parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(proto.example.Schema.Students prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code Students}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Students)
      proto.example.Schema.StudentsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.example.Schema.SchemaProtos.internal_static_Students_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.example.Schema.SchemaProtos.internal_static_Students_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.example.Schema.Students.class, proto.example.Schema.Students.Builder.class);
    }

    // Construct using proto.example.Schema.Students.newBuilder()
    public Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getStudentsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (studentsBuilder_ == null) {
        students_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        studentsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.example.Schema.SchemaProtos.internal_static_Students_descriptor;
    }

    @java.lang.Override
    public proto.example.Schema.Students getDefaultInstanceForType() {
      return proto.example.Schema.Students.getDefaultInstance();
    }

    @java.lang.Override
    public proto.example.Schema.Students build() {
      proto.example.Schema.Students result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto.example.Schema.Students buildPartial() {
      proto.example.Schema.Students result = new proto.example.Schema.Students(this);
      int from_bitField0_ = bitField0_;
      if (studentsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          students_ = java.util.Collections.unmodifiableList(students_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.students_ = students_;
      } else {
        result.students_ = studentsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof proto.example.Schema.Students) {
        return mergeFrom((proto.example.Schema.Students)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(proto.example.Schema.Students other) {
      if (other == proto.example.Schema.Students.getDefaultInstance()) return this;
      if (studentsBuilder_ == null) {
        if (!other.students_.isEmpty()) {
          if (students_.isEmpty()) {
            students_ = other.students_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureStudentsIsMutable();
            students_.addAll(other.students_);
          }
          onChanged();
        }
      } else {
        if (!other.students_.isEmpty()) {
          if (studentsBuilder_.isEmpty()) {
            studentsBuilder_.dispose();
            studentsBuilder_ = null;
            students_ = other.students_;
            bitField0_ = (bitField0_ & ~0x00000001);
            studentsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getStudentsFieldBuilder() : null;
          } else {
            studentsBuilder_.addAllMessages(other.students_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      proto.example.Schema.Students parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (proto.example.Schema.Students) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<proto.example.Schema.Student> students_ =
      java.util.Collections.emptyList();
    private void ensureStudentsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        students_ = new java.util.ArrayList<proto.example.Schema.Student>(students_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.example.Schema.Student, proto.example.Schema.Student.Builder, proto.example.Schema.StudentOrBuilder> studentsBuilder_;

    /**
     * <code>repeated .Student students = 1;</code>
     */
    public java.util.List<proto.example.Schema.Student> getStudentsList() {
      if (studentsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(students_);
      } else {
        return studentsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Student students = 1;</code>
     */
    public int getStudentsCount() {
      if (studentsBuilder_ == null) {
        return students_.size();
      } else {
        return studentsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Student students = 1;</code>
     */
    public proto.example.Schema.Student getStudents(int index) {
      if (studentsBuilder_ == null) {
        return students_.get(index);
      } else {
        return studentsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Student students = 1;</code>
     */
    public Builder setStudents(
        int index, proto.example.Schema.Student value) {
      if (studentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStudentsIsMutable();
        students_.set(index, value);
        onChanged();
      } else {
        studentsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Student students = 1;</code>
     */
    public Builder setStudents(
        int index, proto.example.Schema.Student.Builder builderForValue) {
      if (studentsBuilder_ == null) {
        ensureStudentsIsMutable();
        students_.set(index, builderForValue.build());
        onChanged();
      } else {
        studentsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Student students = 1;</code>
     */
    public Builder addStudents(proto.example.Schema.Student value) {
      if (studentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStudentsIsMutable();
        students_.add(value);
        onChanged();
      } else {
        studentsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Student students = 1;</code>
     */
    public Builder addStudents(
        int index, proto.example.Schema.Student value) {
      if (studentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStudentsIsMutable();
        students_.add(index, value);
        onChanged();
      } else {
        studentsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Student students = 1;</code>
     */
    public Builder addStudents(
        proto.example.Schema.Student.Builder builderForValue) {
      if (studentsBuilder_ == null) {
        ensureStudentsIsMutable();
        students_.add(builderForValue.build());
        onChanged();
      } else {
        studentsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Student students = 1;</code>
     */
    public Builder addStudents(
        int index, proto.example.Schema.Student.Builder builderForValue) {
      if (studentsBuilder_ == null) {
        ensureStudentsIsMutable();
        students_.add(index, builderForValue.build());
        onChanged();
      } else {
        studentsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Student students = 1;</code>
     */
    public Builder addAllStudents(
        java.lang.Iterable<? extends proto.example.Schema.Student> values) {
      if (studentsBuilder_ == null) {
        ensureStudentsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, students_);
        onChanged();
      } else {
        studentsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Student students = 1;</code>
     */
    public Builder clearStudents() {
      if (studentsBuilder_ == null) {
        students_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        studentsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Student students = 1;</code>
     */
    public Builder removeStudents(int index) {
      if (studentsBuilder_ == null) {
        ensureStudentsIsMutable();
        students_.remove(index);
        onChanged();
      } else {
        studentsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Student students = 1;</code>
     */
    public proto.example.Schema.Student.Builder getStudentsBuilder(
        int index) {
      return getStudentsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Student students = 1;</code>
     */
    public proto.example.Schema.StudentOrBuilder getStudentsOrBuilder(
        int index) {
      if (studentsBuilder_ == null) {
        return students_.get(index);  } else {
        return studentsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Student students = 1;</code>
     */
    public java.util.List<? extends proto.example.Schema.StudentOrBuilder> 
         getStudentsOrBuilderList() {
      if (studentsBuilder_ != null) {
        return studentsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(students_);
      }
    }
    /**
     * <code>repeated .Student students = 1;</code>
     */
    public proto.example.Schema.Student.Builder addStudentsBuilder() {
      return getStudentsFieldBuilder().addBuilder(
          proto.example.Schema.Student.getDefaultInstance());
    }
    /**
     * <code>repeated .Student students = 1;</code>
     */
    public proto.example.Schema.Student.Builder addStudentsBuilder(
        int index) {
      return getStudentsFieldBuilder().addBuilder(
          index, proto.example.Schema.Student.getDefaultInstance());
    }
    /**
     * <code>repeated .Student students = 1;</code>
     */
    public java.util.List<proto.example.Schema.Student.Builder> 
         getStudentsBuilderList() {
      return getStudentsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.example.Schema.Student, proto.example.Schema.Student.Builder, proto.example.Schema.StudentOrBuilder> 
        getStudentsFieldBuilder() {
      if (studentsBuilder_ == null) {
        studentsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            proto.example.Schema.Student, proto.example.Schema.Student.Builder, proto.example.Schema.StudentOrBuilder>(
                students_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        students_ = null;
      }
      return studentsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Students)
  }

  // @@protoc_insertion_point(class_scope:Students)
  private static final proto.example.Schema.Students DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.example.Schema.Students();
  }

  public static proto.example.Schema.Students getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Students>
      PARSER = new com.google.protobuf.AbstractParser<Students>() {
    @java.lang.Override
    public Students parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Students(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Students> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Students> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto.example.Schema.Students getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

