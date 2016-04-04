public class fibonacci {
    
	static int fibonacci(int n)
    {
        return (n<=2 ? 1 : fibonacci(n-1) + fibonacci(n-2));
    }
    public static void main(String[] args)
    {
        int sum=0;
    	for (int n=1; n<=10; n++){
            System.out.print(fibonacci(n)+", ");
            if (fibonacci(n)%2 == 0)
            sum += fibonacci(n);
    	}
        System.out.println("...");
        System.out.println(sum);
    }
}