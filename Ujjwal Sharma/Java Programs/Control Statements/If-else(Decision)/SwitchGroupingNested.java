class SwitchGroupingNested{

public static void main(String[] args){

char c='A';
switch(c)
{

  case 1: // grouping 
  {
   System.out.println("Veg Pizza");
       int t=4;
       switch(t){
        case 1:
        {
         System.out.println("Small");
        }

  }
  }
  case 'B','C','D','F':
  {
   System.out.println("Consonants");
  }

}
}