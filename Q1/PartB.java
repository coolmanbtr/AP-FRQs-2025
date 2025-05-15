public int dogWalkShift(int startHour, int endHour){
   int totalPay =  0;
   for(int i = startHour;i <= endHour; i++){
       int dogsWalked = walkDogs(hour);


       int pay = dogsWalked * 5;//Base pay


       if(dogsWalked == maxDogs || (hour >= 9 && hour <= 17)){
           pay += 3;
       }
       totalPay += pay;
   }
   return totalPay;
}

