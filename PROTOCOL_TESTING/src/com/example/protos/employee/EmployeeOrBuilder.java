// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Employee.proto

package com.example.protos.employee;

public interface EmployeeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Employee)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 empId = 1;</code>
   */
  int getEmpId();

  /**
   * <code>string empName = 2;</code>
   */
  java.lang.String getEmpName();
  /**
   * <code>string empName = 2;</code>
   */
  com.google.protobuf.ByteString
      getEmpNameBytes();

  /**
   * <code>string email = 3;</code>
   */
  java.lang.String getEmail();
  /**
   * <code>string email = 3;</code>
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <code>.Employee.Gender gender = 4;</code>
   */
  int getGenderValue();
  /**
   * <code>.Employee.Gender gender = 4;</code>
   */
  com.example.protos.employee.Employee.Gender getGender();

  /**
   * <code>int32 salary = 5;</code>
   */
  int getSalary();
}