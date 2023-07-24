class Car(type:String, model:Int, price: Double, owner:String, milesDrive: Double){
    var carType=type;
    val carModel=model;
    val carPrice=price;
    var carOwner=owner;
    val carMilesDrive=milesDrive;
    init{
        println("Object of class is created and Init is called.");
    }
    fun getCarInformation(){
        println("Car Information : ${carType} , ${carModel}");
        println("Car Owner : ${carOwner}");
        println("Miles Drive : ${carMilesDrive}");
    }

    fun getOriginalCarPrice():Double{
        return carPrice;
    }

    fun getCurrentCarPrice():Double{
        return carPrice-(carPrice*0.1);
    }
    fun displayCarInfo(){
        println("------------------------");
        getCarInformation();
        println("Original Car Price : ${getOriginalCarPrice()}");
        println("Current Car Price : ${getCurrentCarPrice()}");
        println("------------------------");
    }
}

fun main()
{
    println("Creating Car class Object car1 in next line.");
    var c1=Car("BMW",2018,100000.0,"Aman",105.0);
    c1.displayCarInfo();
    println("Creating Car class Object car2 in next line.");
    var c2=Car("BMW",2019,400000.0,"Yash",20.0);
    c2.displayCarInfo();

    println("************ ArrayList of Car *************")
    var l= ArrayList<Car>();
    l.add(Car("Toyota",2017,1080000.0,"Umang",100.0))

    l.add(Car("Maruti",2020,4000000.0,"Nisarg",200.0))
    for(i in l){
        i.displayCarInfo();
    }
}
