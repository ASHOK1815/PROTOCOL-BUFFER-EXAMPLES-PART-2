# PROTOCOL-BUFFER-EXAMPLES-PART-2


* Protocol Buffers (Protobuf) is a free and open source cross-platform library used to serialize structured data. 
* It is useful in developing programs to communicate with each other over a network or for storing data.
* The method involves an interface description language that describes the structure of some data and a program 
  that generates source code from that description for generating or parsing a stream of bytes that represents the 
  structured data.

![hero image](assets/protocolbuffer.png)

# Want to contribute ?


* Clone the repository 
  (https://github.com/ASHOK1815/PROTOCOL-BUFFER-EXAMPLES-PART-2.git)
* Create a Readme of your programme 
* add code and readme with proper naming convention
* send me a pull request 

![contribute image](assets/gitcontribute.png)



# Here's our first message:
```language
syntax = "proto3"; // we have to use it if we want to use proto3  or  
syntax = "proto2"; // we have to use it if we want to use proto2 


message MyMessage{

     int32 id = 1;          // Here int32=>(Field Type)  and id=>{Field Name } and 1=>{Field tag}
     string first_name = 2;
     string last_name = 3;   NOTE:: WE CANNOT WRITE first name it won't work use underscore instead..(first_name)

}


```

# Scaler Types Number

```language
Numbers can take various forms based on what values you expect them to have:

double,float,int32,int64,uint32,uint64,sint32,sint64,fixed32,fixed64,sfixed32,sfixed64

Here  uint32 => unsigned int;
      sint32 => signed int;
      

```

# Tags 

* For protobuf the important element is Tag
```language

*Smallest tag: 1,
*Largest  tag: 2^29-1 or 536,870,911
*Tags numbered from 1 to 15  use 1 byte in space
*Tags numbered from 16 to 2047  use 2 byte in space
*Note: We cannot use the number 19000 thorugh 19999
       (as it is reserved by google for their personal use)



```

# Repeated Fields

* To make a array we can use the concept of repeated fields.

```language

For Example:
   
   message Student{
        
        string name = 1;
        int32 age = 2;
        int32 uid = 3;
        repeated string phone_number = 4;  // Here a student can have multiple phone number :)
   }


```

# Default Values for fields 
* if you not given any value to the fields then there default value are:----
```language

*string => empty
*enum   =>first value
*bool   =>false
*int32  =>0


```


# Enums

About Enums("https://www.w3schools.com/java/java_enums.asp")

```

message Employee{

  int32 empId = 1;
  string empName = 2;
  string email = 3;

  enum Gender{
    UNKNOWN = 0;   // Here we always give the default value at field tag 0 So that if we did not 
    MALE    = 1;   // enter anything it take up the default value tag 0;
    FEMALE  = 2;
  }

  Gender gender = 4;
  int32 salary  = 5;

}

```

# Calling of Enums tag Examples

```
 
   employee.setEmpName("ASHOK")
                .setEmail("rupender20@gmail.com")
                .setEmpId(6735)
                .setGenderValue(Employee.Gender.MALE_VALUE) // Defining of the Gender(Enum)
                .setSalary(60000);


```


# Multiple Message in Same .proto file

* Yes it is possible to define multiple Message in same .proto file

```language

message Student{

  string name = 1;
  int32  uid  = 2;
  string department = 3;
  DateOfBirth date  = 4;
}

message DateOfBirth{
   
  int32 date  = 1;
  int32 month = 2;
  int32 year  = 3;
  
}

```

# We can write Nesting message also 

* Yes it is possible to define types within types...
```
 message Student{

  string name = 1;
  int32  uid  = 2;
  string department = 3;
  
  message Address{  // Here we define type address within Student (name access is Student.Address)
    string city = 1;
    string pin_code = 2;
    string street_name = 3;
  }
  
  Address address = 4;

}


```
 
# Importing Types 

* Helpful if you want to reuse code by importing other .proto file
* For Example
```
Address.proto //Address proto file

syntax = "proto3";

message Address{  
    string city = 1;
    string pin_code = 2;
    string street_name = 3;
  }


```
* Note :- while importing complete address must be given 
```language

Student.proto // student proto file

syntax = "proto3";

import "Proto_files/Address.proto";  //Read Above Note

message Student{

  string name = 1;
  int32  uid  = 2;
  string department = 3;
  Address address = 4;

}
```


# Packages 

* It help to prevent name conflicts between messages 

* we can add an optional package specifier to a .proto file to prevent name clashes between protocol message types.
```

package foo.bar;
message Open { ... }

You can then use the package specifier when defining fields of your message type:

message Foo {
  ...
  required foo.bar.Open open = 1;
  ...
}


```

# How to use compiler to generate code of any language

* For Examples

```
protoc -I=$SRC_DIR --java_out=$DST_DIR $SRC_DIR/addressbook.proto

Here -I=SRC_DIR => address of the protoc compiler.
     $DST_DIR    => destination of the files generated by the compiler.
     $SRC_DIR    => address where your .proto file present


     Here --java_out use to generate code in java. 
            we can use --python or any language that protocol buffer support.

```







# References :

https://developers.google.com/protocol-buffers/docs/overview
