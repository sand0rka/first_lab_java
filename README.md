#Trolleybus
Using the lombok library, you should implement the set and get methods, constructors with arguments, the constructor by soaking and the overridden method toString()
 The written class must contain a public static method getInstance(), and a field static field instance whose value will be returned by the method getInstance
 In the class, you should also write the main method, in which you should create an array of class objects using:
 - the default designer
 - a constructor that receives all parameters
 - 2 objects obtained when the getInstance method is called

 Output the identifiers of all objects from the array to the console using a loop with a prerequisite
 
 Create a Trolleybus class that will have the following fields:
 id: unique identifier of the trolleybus, the default value is 100;
 routeNumber: number of the route on which the trolley runs;
 currentStop: the current stop at which the trolleybus is located;
 maxSpeed: the maximum speed of the trolleybus;
 capacity: the capacity of the trolleybus (the number of passengers that the trolleybus can carry);
 passengers: the current number of passengers carried by the trolleybus.

 The Trolleybus class must have the following public methods:
 stop(): the method that stops the trolley at the current stop (changes the speed to 0);
 start(): a method that sets the current speed of the trolleybus to 20 km/h;
 addPassenger(): method that adds one passenger to the trolleybus (if there are enough free seats);
 removePassenger(): A method that removes one passenger from the trolley (if there is one in the trolley).
