#Merchant-solution

I created this as Spring boot service having options for containerization and deployment on cloud.



#Apprach 

Main problem was to make code capable of handling 1200 signals or more without any verbosity in code, avoding big chunk of code for Switch block.
Many solution came in thoughts to design code in such a way that new signal can be added with minimal code 
change and configuration.

However I choose to solve it using ENUMs and Strategy pattern. Its an in-memory solutions.
I can improve it more but I have time constraint and other libary limitations as well. 

There are two main enums -

Numbers enum  --> Its used to map incomming integer argument to constants.

SignalExecutorsSupplier --> Its used to map dervied costant to appropriate stratgey for this signal.

Each signals have their dedicated executor class in executors package . This way I am encapsulating code 
for a signal execution in a class instead of wating every thing in Switch block.



#Other Approaches 

Introducing some tables in database and adding mapping configuration from the signals to straegy. This way
we  just need to add new entry in table and new Stragey class in code . code chanegs will be minimum.


I know this was not allowed in the context of this challenge . But just a thought
instead of writing boilerplate code in client code  I would write all algo execution in
library and write minimum code in client . May be using event based architecture 
would be more better solution to solve these kind of  problem.

