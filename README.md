# PROTOCOL-BUFFER-EXAMPLES-PART-2
Protocol Buffers (Protobuf) is a free and open source cross-platform library used to serialize structured data. It is useful in developing programs to communicate with each other over a network or for storing data. The method involves an interface description language that describes the structure of some data and a program that generates source code from that description for generating or parsing a stream of bytes that represents the structured data.




![hero image](assets/protocolbuffer.png)


'''
syntax = "proto3" // we have to use it if we want to use proto3 

message MyMessage{

     int32 id = 1;          // Here int32=>(Field Type)  and id=>{Field Name } and 1=>{Field tag}
     string first_name = 2;
     string last_name = 3;

}


'''
