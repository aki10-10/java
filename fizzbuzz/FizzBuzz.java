package fizzbuzz;

/**
* 1から順番に数を表示する。
* その数が3で割り切れるなら"Fizz"で5で割り切れるなら"Buzz"と表示する。
*/

public class FizzBuzz {
  public static void main(String[]args){
    //変数宣言
    //ループカウンタ
    int i = 0;
    //繰り返し最大数
    int loopCount = 100;
    // 3の倍数
    int numFizz = 3;
    //5の倍数
    int numBuzz = 5;
    //Fizz文字列
    String strFizz = "Fizz";
    //Buzz文字列
    String strBuzz = "Buzz";
    for(i = 1; i <= loopCount; i++){
      if(i % (numFizz * numBuzz) == 0 ){
        System.out.println(strFizz + strBuzz);
      }else if(i % numFizz == 0){
        System.out.println(strFizz);
      }else if(i % numBuzz == 0){
        System.out.println(strBuzz);
      }else {
        System.out.println(i);
      }
    }
  }
}
