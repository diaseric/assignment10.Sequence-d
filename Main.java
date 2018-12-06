public class Main {

    public static void main(String[] args) {
	// write your code here


        //Squares
        int square[] = new int[10];

        System.out.print("First 10 Square Numbers: ");

        int x = 0;
        while(x<10){
            square[x] = (x+1)*(x + 1);

            System.out.print(square[x] + " " );

            x++;
        }


        //Cubes
        int cube[] = new int[10];

        System.out.print("\nFirst 10 Cube Numbers: ");

        int y = 0;
        while(y<10){
            cube[y] = (y+1)*(y + 1)*(y+1);

            System.out.print(cube[y] + " " );

            y++;
        }

        //Fibonacci
        int fib[] = new int[10];

        System.out.print("\nFirst 10 Fibonacci Numbers from 1: ");

        int z = 0;
        while(z<2){
            fib[z] = 1;

            System.out.print(fib[z] + " ");

            z++;
        }

        while(z>1&&z<10){
            fib[z] = fib[z-1] + fib[z-2];

            System.out.print(fib[z] + " ");

            z++;

        }

        //Primes
        System.out.print("\nFirst 10 Prime Numbers: ");
        for (int num = 2; num < 30; num++) {
            boolean flag = false;
            for (int i = 2; i <= num / 2; ++i) {
                if (num % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                System.out.printf("%d ", num);



        }
        System.out.println();

        //Triangle
        int triangle[] = new int[10];

        System.out.print("First 10 Triangle Numbers: ");

        int b = 0;

        while(b == 0){
            triangle[b] = 1;
            System.out.print(triangle[b] + " ");
            b++;
        }
        while(b>0&&b<10){
            triangle[b] = (b+1)+triangle[b-1];

            System.out.print(triangle[b] + " " );

            b++;
        }







    }










    }

