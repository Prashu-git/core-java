class Cricket2 {
public static void main (String args []) {
int rohitHigestScore = 264;
 int sachinHigestScore = 200;
 int mithalirajHigestScore = 125;
 int viratHigestScore = 183;
 int dhoniHigestScore = 183;
 
 int HigestScore [] = {rohitHigestScore,sachinHigestScore,mithalirajHigestScore,viratHigestScore,dhoniHigestScore};
 
 for (int index = 0; index < HigestScore.length; index++){
 int ref = HigestScore[index];
 System.out.println ("Elements at Index " + index + " " + HigestScore[index]);
 }
 


}
}