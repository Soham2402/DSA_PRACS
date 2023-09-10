import java.util.HashMap;

class Source{
    public static int fib(int n){
        HashMap<Integer, Integer> hash = new HashMap<>();
        hash.put(1,1);
        hash.put(0,0);
        return fib(n, hash);
    }

    public static int fib(int n, HashMap<Integer,Integer> memo){
        if(memo.containsKey(n)){
            return memo.get(n);
        }

        int result = fib(n-1) + fib(n-2);
        memo.put(n, result);
        return result;

    }


 public static void main(String[] args) {
    System.out.println(fib(6));
    }
}

