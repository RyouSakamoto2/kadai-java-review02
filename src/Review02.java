
public class Review02 {

    public static void main(String[] args) {
            // iの値を1から100以下の場合、1ずつカウントアップして繰り返す
            for(int i = 1; i <= 100; i++) {
                //  3でも5でも割り切れる場合、"FizzBuzz"と表示される（条件式1）
                if(i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                // 条件式1が不成立(false)で、3で割り切れる場合、"Fizz"と表示される
                } else if (i % 3 == 0){
                    System.out.println("Fizz");
                } else if (i % 5 == 0){
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }

        }
    }