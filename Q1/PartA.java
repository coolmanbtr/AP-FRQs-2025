//Part A
public int walkDogs(int hours){
   //Find out from DogWalk Company how many dogs at hour
   int numDogs = company.numAvaibleDogs(hour);
   if(maxDogs > numDogs){
       company.updateDogs(hour,numDogs);
       return numDogs;
   }
   //if there are more/equal dogs than the walker can handle
   company.updateDogs(hour,maxDogs);
   return maxDogs;
}
